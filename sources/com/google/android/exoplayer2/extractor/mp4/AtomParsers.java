package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Atom.ContainerAtom containerAtom2 = containerAtom;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom2.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom3 = containerAtom2.containerChildren.get(i);
            if (containerAtom3.type != 1953653099) {
                GaplessInfoHolder gaplessInfoHolder2 = gaplessInfoHolder;
                Function<Track, Track> function2 = function;
            } else {
                Track apply = function.apply(parseTrak(containerAtom3, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd)), j, drmInitData, z, z2));
                if (apply == null) {
                    GaplessInfoHolder gaplessInfoHolder3 = gaplessInfoHolder;
                } else {
                    GaplessInfoHolder gaplessInfoHolder4 = gaplessInfoHolder;
                    arrayList.add(parseStbl(apply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom3.getContainerAtomOfType(Atom.TYPE_mdia))).getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl)), gaplessInfoHolder));
                }
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = parseUdtaMeta(parsableByteArray, position + readInt);
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata2 = parseSmta(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return Pair.create(metadata, metadata2);
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 < 0 || readInt4 >= readInt) {
                Log.m9247w(TAG, "Skipped metadata with unknown key index: " + readInt4);
            } else {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long j2;
        Atom.LeafAtom leafAtom2;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> parseEdts;
        Atom.ContainerAtom containerAtom2 = containerAtom;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom3.getLeafAtomOfType(Atom.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_tkhd))).data);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            leafAtom2 = leafAtom;
            j2 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long parseMvhd = parseMvhd(leafAtom2.data);
        if (j2 != -9223372036854775807L) {
            j3 = Util.scaleLargeTimestamp(j2, 1000000, parseMvhd);
        }
        long j4 = j3;
        Pair<Long, String> parseMdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom3.getLeafAtomOfType(Atom.TYPE_mdhd))).data);
        StsdData parseStsd = parseStsd(((Atom.LeafAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom3.getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl))).getLeafAtomOfType(Atom.TYPE_stsd))).data, parseTkhd.f10044id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom2.getContainerAtomOfType(Atom.TYPE_edts)) == null || (parseEdts = parseEdts(containerAtomOfType)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) parseEdts.second;
            jArr2 = (long[]) parseEdts.first;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.f10044id, trackTypeForHdlr, ((Long) parseMdhd.first).longValue(), parseMvhd, j4, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr2, jArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.extractor.mp4.TrackSampleTable parseStbl(com.google.android.exoplayer2.extractor.mp4.Track r38, com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r39, com.google.android.exoplayer2.extractor.GaplessInfoHolder r40) throws com.google.android.exoplayer2.ParserException {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = r0.getLeafAtomOfType(r3)
            if (r3 == 0) goto L_0x0017
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$StszSampleSizeBox r4 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$StszSampleSizeBox
            com.google.android.exoplayer2.Format r5 = r1.format
            r4.<init>(r3, r5)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r3 = r0.getLeafAtomOfType(r3)
            if (r3 == 0) goto L_0x051a
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$Stz2SampleSizeBox r4 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$Stz2SampleSizeBox
            r4.<init>(r3)
        L_0x0025:
            int r3 = r4.getSampleCount()
            r5 = 0
            if (r3 != 0) goto L_0x0043
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r0 = r9
            r1 = r38
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0043:
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r6 = r0.getLeafAtomOfType(r6)
            r7 = 1
            if (r6 != 0) goto L_0x005c
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r6 = r0.getLeafAtomOfType(r6)
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r6 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r6
            r8 = 1
            goto L_0x005d
        L_0x005c:
            r8 = 0
        L_0x005d:
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r6.data
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r9 = r0.getLeafAtomOfType(r9)
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r9 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r9
            com.google.android.exoplayer2.util.ParsableByteArray r9 = r9.data
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r10 = r0.getLeafAtomOfType(r10)
            java.lang.Object r10 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r10)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r10 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r10
            com.google.android.exoplayer2.util.ParsableByteArray r10 = r10.data
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r11 = r0.getLeafAtomOfType(r11)
            if (r11 == 0) goto L_0x0089
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r11.data
            goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r0 = r0.getLeafAtomOfType(r13)
            if (r0 == 0) goto L_0x0096
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r0.data
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            com.google.android.exoplayer2.extractor.mp4.AtomParsers$ChunkIterator r13 = new com.google.android.exoplayer2.extractor.mp4.AtomParsers$ChunkIterator
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.setPosition(r6)
            int r8 = r10.readUnsignedIntToInt()
            int r8 = r8 - r7
            int r9 = r10.readUnsignedIntToInt()
            int r14 = r10.readUnsignedIntToInt()
            if (r0 == 0) goto L_0x00b8
            r0.setPosition(r6)
            int r15 = r0.readUnsignedIntToInt()
            goto L_0x00b9
        L_0x00b8:
            r15 = 0
        L_0x00b9:
            r12 = -1
            if (r11 == 0) goto L_0x00ce
            r11.setPosition(r6)
            int r6 = r11.readUnsignedIntToInt()
            if (r6 <= 0) goto L_0x00cc
            int r16 = r11.readUnsignedIntToInt()
            int r16 = r16 + -1
            goto L_0x00d1
        L_0x00cc:
            r11 = 0
            goto L_0x00cf
        L_0x00ce:
            r6 = 0
        L_0x00cf:
            r16 = -1
        L_0x00d1:
            int r5 = r4.getFixedSampleSize()
            com.google.android.exoplayer2.Format r7 = r1.format
            java.lang.String r7 = r7.sampleMimeType
            if (r5 == r12) goto L_0x00fe
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x00f3
            java.lang.String r12 = "audio/g711-mlaw"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x00f3
            java.lang.String r12 = "audio/g711-alaw"
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L_0x00fe
        L_0x00f3:
            if (r8 != 0) goto L_0x00fe
            if (r15 != 0) goto L_0x00fe
            if (r6 != 0) goto L_0x00fe
            r39 = r8
            r12 = r9
            r7 = 1
            goto L_0x0102
        L_0x00fe:
            r39 = r8
            r12 = r9
            r7 = 0
        L_0x0102:
            if (r7 == 0) goto L_0x013a
            int r0 = r13.length
            long[] r0 = new long[r0]
            int r4 = r13.length
            int[] r4 = new int[r4]
        L_0x010c:
            boolean r6 = r13.moveNext()
            if (r6 == 0) goto L_0x011f
            int r6 = r13.index
            long r10 = r13.offset
            r0[r6] = r10
            int r6 = r13.index
            int r7 = r13.numSamples
            r4[r6] = r7
            goto L_0x010c
        L_0x011f:
            long r6 = (long) r14
            com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker$Results r0 = com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.rechunk(r5, r0, r4, r6)
            long[] r4 = r0.offsets
            int[] r5 = r0.sizes
            int r6 = r0.maximumSize
            long[] r7 = r0.timestamps
            int[] r10 = r0.flags
            long r11 = r0.duration
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r10
            r13 = r11
            r11 = r1
            goto L_0x02a3
        L_0x013a:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r8 = new long[r3]
            int[] r9 = new int[r3]
            r24 = r10
            r2 = r16
            r1 = 0
            r10 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r16 = r15
            r15 = r14
            r14 = r12
        L_0x0156:
            java.lang.String r12 = "AtomParsers"
            if (r1 >= r3) goto L_0x021d
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x0160:
            if (r27 != 0) goto L_0x017d
            boolean r22 = r13.moveNext()
            if (r22 == 0) goto L_0x017d
            r30 = r14
            r31 = r15
            long r14 = r13.offset
            r32 = r3
            int r3 = r13.numSamples
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x0160
        L_0x017d:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x01a1
            java.lang.String r2 = "Unexpected end of chunk data"
            com.google.android.exoplayer2.util.Log.m9247w(r12, r2)
            long[] r5 = java.util.Arrays.copyOf(r5, r1)
            int[] r7 = java.util.Arrays.copyOf(r7, r1)
            long[] r8 = java.util.Arrays.copyOf(r8, r1)
            int[] r9 = java.util.Arrays.copyOf(r9, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x0225
        L_0x01a1:
            if (r0 == 0) goto L_0x01b4
        L_0x01a3:
            if (r23 != 0) goto L_0x01b2
            if (r16 <= 0) goto L_0x01b2
            int r23 = r0.readUnsignedIntToInt()
            int r21 = r0.readInt()
            int r16 = r16 + -1
            goto L_0x01a3
        L_0x01b2:
            int r23 = r23 + -1
        L_0x01b4:
            r3 = r21
            r5[r1] = r28
            int r12 = r4.readNextSampleSize()
            r7[r1] = r12
            r12 = r7[r1]
            if (r12 <= r10) goto L_0x01c4
            r10 = r7[r1]
        L_0x01c4:
            long r14 = (long) r3
            long r14 = r25 + r14
            r8[r1] = r14
            if (r11 != 0) goto L_0x01cd
            r12 = 1
            goto L_0x01ce
        L_0x01cd:
            r12 = 0
        L_0x01ce:
            r9[r1] = r12
            if (r1 != r2) goto L_0x01e4
            r12 = 1
            r9[r1] = r12
            int r6 = r6 + -1
            if (r6 <= 0) goto L_0x01e4
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r11)
            com.google.android.exoplayer2.util.ParsableByteArray r2 = (com.google.android.exoplayer2.util.ParsableByteArray) r2
            int r2 = r2.readUnsignedIntToInt()
            int r2 = r2 - r12
        L_0x01e4:
            r15 = r2
            r12 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01fc
            if (r39 <= 0) goto L_0x01fc
            int r2 = r24.readUnsignedIntToInt()
            int r3 = r24.readInt()
            int r14 = r39 + -1
            goto L_0x01ff
        L_0x01fc:
            r3 = r14
            r14 = r39
        L_0x01ff:
            r39 = r2
            r2 = r7[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r12
            r37 = r14
            r14 = r39
            r39 = r37
            goto L_0x0156
        L_0x021d:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x0225:
            long r13 = (long) r2
            long r13 = r25 + r13
            if (r0 == 0) goto L_0x023a
        L_0x022a:
            if (r16 <= 0) goto L_0x023a
            int r2 = r0.readUnsignedIntToInt()
            if (r2 == 0) goto L_0x0234
            r0 = 0
            goto L_0x023b
        L_0x0234:
            r0.readInt()
            int r16 = r16 + -1
            goto L_0x022a
        L_0x023a:
            r0 = 1
        L_0x023b:
            if (r6 != 0) goto L_0x024d
            if (r30 != 0) goto L_0x024d
            if (r1 != 0) goto L_0x024d
            if (r39 != 0) goto L_0x024d
            r2 = r23
            if (r2 != 0) goto L_0x024f
            if (r0 != 0) goto L_0x024a
            goto L_0x024f
        L_0x024a:
            r11 = r38
            goto L_0x029d
        L_0x024d:
            r2 = r23
        L_0x024f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "Inconsistent stbl box for track "
            r4.append(r11)
            r11 = r38
            int r15 = r11.f10045id
            r4.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r4.append(r15)
            r4.append(r6)
            java.lang.String r6 = ", remainingSamplesAtTimestampDelta "
            r4.append(r6)
            r6 = r30
            r4.append(r6)
            java.lang.String r6 = ", remainingSamplesInChunk "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r4.append(r1)
            r1 = r39
            r4.append(r1)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r4.append(r1)
            r4.append(r2)
            if (r0 != 0) goto L_0x0291
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0293
        L_0x0291:
            java.lang.String r0 = ""
        L_0x0293:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r12, r0)
        L_0x029d:
            r0 = r3
            r2 = r5
            r3 = r7
            r5 = r8
            r6 = r9
            r4 = r10
        L_0x02a3:
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r11.timescale
            r21 = r13
            r25 = r7
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r21, r23, r25)
            long[] r1 = r11.editListDurations
            r9 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02c5
            long r0 = r11.timescale
            com.google.android.exoplayer2.util.Util.scaleLargeTimestampsInPlace(r5, r9, r0)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02c5:
            long[] r1 = r11.editListDurations
            int r1 = r1.length
            r7 = 1
            if (r1 != r7) goto L_0x0361
            int r1 = r11.type
            if (r1 != r7) goto L_0x0361
            int r1 = r5.length
            r7 = 2
            if (r1 < r7) goto L_0x0361
            long[] r1 = r11.editListMediaTimes
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            long[] r1 = (long[]) r1
            r7 = 0
            r15 = r1[r7]
            long[] r1 = r11.editListDurations
            r21 = r1[r7]
            long r7 = r11.timescale
            long r9 = r11.movieTimescale
            r23 = r7
            r25 = r9
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r21, r23, r25)
            long r7 = r7 + r15
            r21 = r5
            r22 = r13
            r24 = r15
            r26 = r7
            boolean r1 = canApplyEditWithGaplessInfo(r21, r22, r24, r26)
            if (r1 == 0) goto L_0x0361
            long r21 = r13 - r7
            r1 = 0
            r7 = r5[r1]
            long r30 = r15 - r7
            com.google.android.exoplayer2.Format r1 = r11.format
            int r1 = r1.sampleRate
            long r7 = (long) r1
            long r9 = r11.timescale
            r32 = r7
            r34 = r9
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r30, r32, r34)
            com.google.android.exoplayer2.Format r1 = r11.format
            int r1 = r1.sampleRate
            long r9 = (long) r1
            r12 = r0
            long r0 = r11.timescale
            r23 = r9
            r25 = r0
            long r0 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r21, r23, r25)
            r9 = 0
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x032d
            int r15 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x0362
        L_0x032d:
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 > 0) goto L_0x0362
            int r15 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r15 > 0) goto L_0x0362
            int r8 = (int) r7
            r7 = r40
            r7.encoderDelay = r8
            int r1 = (int) r0
            r7.encoderPadding = r1
            long r0 = r11.timescale
            r7 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.exoplayer2.util.Util.scaleLargeTimestampsInPlace(r5, r7, r0)
            long[] r0 = r11.editListDurations
            r1 = 0
            r12 = r0[r1]
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r11.movieTimescale
            r16 = r0
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r12, r14, r16)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0361:
            r12 = r0
        L_0x0362:
            long[] r0 = r11.editListDurations
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L_0x03ab
            long[] r0 = r11.editListDurations
            r1 = 0
            r7 = r0[r1]
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x03ab
            long[] r0 = r11.editListMediaTimes
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            long[] r0 = (long[]) r0
            r7 = r0[r1]
            r0 = 0
        L_0x037e:
            int r1 = r5.length
            if (r0 >= r1) goto L_0x0395
            r9 = r5[r0]
            long r15 = r9 - r7
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r11.timescale
            r19 = r9
            long r9 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r15, r17, r19)
            r5[r0] = r9
            int r0 = r0 + 1
            goto L_0x037e
        L_0x0395:
            long r15 = r13 - r7
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r11.timescale
            r19 = r0
            long r7 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r15, r17, r19)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r9 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03ab:
            int r0 = r11.type
            r1 = 1
            if (r0 != r1) goto L_0x03b2
            r0 = 1
            goto L_0x03b3
        L_0x03b2:
            r0 = 0
        L_0x03b3:
            long[] r1 = r11.editListDurations
            int r1 = r1.length
            int[] r1 = new int[r1]
            long[] r7 = r11.editListDurations
            int r7 = r7.length
            int[] r7 = new int[r7]
            long[] r8 = r11.editListMediaTimes
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            long[] r8 = (long[]) r8
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
        L_0x03c9:
            long[] r15 = r11.editListDurations
            int r15 = r15.length
            if (r9 >= r15) goto L_0x043d
            r39 = r3
            r15 = r4
            r3 = r8[r9]
            r21 = -1
            int r16 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            r40 = r8
            if (r16 == 0) goto L_0x0427
            long[] r8 = r11.editListDurations
            r21 = r8[r9]
            r8 = r14
            r16 = r15
            long r14 = r11.timescale
            r27 = r12
            r28 = r13
            long r12 = r11.movieTimescale
            r23 = r14
            r25 = r12
            long r12 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r21, r23, r25)
            r14 = 1
            int r15 = com.google.android.exoplayer2.util.Util.binarySearchFloor((long[]) r5, (long) r3, (boolean) r14, (boolean) r14)
            r1[r9] = r15
            long r3 = r3 + r12
            r12 = 0
            int r3 = com.google.android.exoplayer2.util.Util.binarySearchCeil((long[]) r5, (long) r3, (boolean) r0, (boolean) r12)
            r7[r9] = r3
        L_0x0401:
            r3 = r1[r9]
            r4 = r7[r9]
            if (r3 >= r4) goto L_0x0414
            r3 = r1[r9]
            r3 = r6[r3]
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0414
            r3 = r1[r9]
            int r3 = r3 + r14
            r1[r9] = r3
            goto L_0x0401
        L_0x0414:
            r3 = r7[r9]
            r4 = r1[r9]
            int r3 = r3 - r4
            int r13 = r28 + r3
            r3 = r1[r9]
            if (r8 == r3) goto L_0x0421
            r3 = 1
            goto L_0x0422
        L_0x0421:
            r3 = 0
        L_0x0422:
            r3 = r3 | r10
            r4 = r7[r9]
            r10 = r3
            goto L_0x0431
        L_0x0427:
            r27 = r12
            r28 = r13
            r8 = r14
            r16 = r15
            r12 = 0
            r14 = 1
            r4 = r8
        L_0x0431:
            int r9 = r9 + 1
            r3 = r39
            r8 = r40
            r14 = r4
            r4 = r16
            r12 = r27
            goto L_0x03c9
        L_0x043d:
            r39 = r3
            r16 = r4
            r3 = r12
            r12 = 0
            r14 = 1
            if (r13 == r3) goto L_0x0447
            goto L_0x0448
        L_0x0447:
            r14 = 0
        L_0x0448:
            r0 = r10 | r14
            if (r0 == 0) goto L_0x044f
            long[] r3 = new long[r13]
            goto L_0x0450
        L_0x044f:
            r3 = r2
        L_0x0450:
            if (r0 == 0) goto L_0x0455
            int[] r4 = new int[r13]
            goto L_0x0457
        L_0x0455:
            r4 = r39
        L_0x0457:
            if (r0 == 0) goto L_0x045b
            r16 = 0
        L_0x045b:
            if (r0 == 0) goto L_0x0460
            int[] r8 = new int[r13]
            goto L_0x0461
        L_0x0460:
            r8 = r6
        L_0x0461:
            long[] r9 = new long[r13]
            r10 = 0
            r13 = 0
        L_0x0466:
            long[] r15 = r11.editListDurations
            int r15 = r15.length
            if (r12 >= r15) goto L_0x04fd
            long[] r15 = r11.editListMediaTimes
            r17 = r15[r12]
            r15 = r1[r12]
            r27 = r1
            r1 = r7[r12]
            if (r0 == 0) goto L_0x0489
            r28 = r7
            int r7 = r1 - r15
            java.lang.System.arraycopy(r2, r15, r3, r10, r7)
            r29 = r2
            r2 = r39
            java.lang.System.arraycopy(r2, r15, r4, r10, r7)
            java.lang.System.arraycopy(r6, r15, r8, r10, r7)
            goto L_0x048f
        L_0x0489:
            r29 = r2
            r28 = r7
            r2 = r39
        L_0x048f:
            r7 = r16
        L_0x0491:
            if (r15 >= r1) goto L_0x04da
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r39 = r1
            r30 = r2
            long r1 = r11.movieTimescale
            r21 = r13
            r25 = r1
            long r1 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r21, r23, r25)
            r21 = r5[r15]
            r23 = r5
            r24 = r6
            long r5 = r21 - r17
            r21 = r13
            r13 = 0
            long r31 = java.lang.Math.max(r13, r5)
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r11.timescale
            r35 = r5
            long r5 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r31, r33, r35)
            long r1 = r1 + r5
            r9[r10] = r1
            if (r0 == 0) goto L_0x04cb
            r1 = r4[r10]
            if (r1 <= r7) goto L_0x04cb
            r1 = r30[r15]
            r7 = r1
        L_0x04cb:
            int r10 = r10 + 1
            int r15 = r15 + 1
            r1 = r39
            r13 = r21
            r5 = r23
            r6 = r24
            r2 = r30
            goto L_0x0491
        L_0x04da:
            r30 = r2
            r23 = r5
            r24 = r6
            r21 = r13
            r13 = 0
            long[] r1 = r11.editListDurations
            r5 = r1[r12]
            long r1 = r21 + r5
            int r12 = r12 + 1
            r13 = r1
            r16 = r7
            r5 = r23
            r6 = r24
            r1 = r27
            r7 = r28
            r2 = r29
            r39 = r30
            goto L_0x0466
        L_0x04fd:
            r21 = r13
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r11.movieTimescale
            r25 = r0
            long r12 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r21, r23, r25)
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r10 = new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
            r0 = r10
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r16
            r5 = r9
            r6 = r8
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x051a:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseStbl(com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom, com.google.android.exoplayer2.extractor.GaplessInfoHolder):com.google.android.exoplayer2.extractor.mp4.TrackSampleTable");
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() != 1935766900) {
                parsableByteArray.setPosition(position + readInt);
            } else if (readInt < 14) {
                return null;
            } else {
                parsableByteArray.skipBytes(5);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte != 12 && readUnsignedByte != 13) {
                    return null;
                }
                float f = readUnsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f, parsableByteArray.readUnsignedByte()));
            }
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        int i = 8;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0) {
            i = 16;
        }
        parsableByteArray.skipBytes(i);
        return parsableByteArray.readUnsignedInt();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        boolean z;
        int i = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        if (parseFullAtomVersion == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (parsableByteArray.getData()[position + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            parsableByteArray.skipBytes(i);
        } else {
            long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
            if (readUnsignedInt != 0) {
                j = readUnsignedInt;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = 180;
        }
        return new TkhdData(readInt, j, i2);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        int i = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            i = 4;
        }
        parsableByteArray.skipBytes(i);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        int i3;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int i4 = i;
        parsableByteArray2.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            Assertions.checkState(readInt2 > 0, "childAtomSize should be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, readInt3, i3, readInt2, i, i2, drmInitData, stsdData, i5);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData, i5);
            } else {
                if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
                } else if (readInt3 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray2, readInt3, position, i4, stsdData);
                } else if (readInt3 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i4).setSampleMimeType("application/x-camera-motion").build();
                }
                i3 = position;
            }
            parsableByteArray2.setPosition(i3 + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableList = ImmutableList.m9347of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableList).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        DrmInitData drmInitData2;
        List<byte[]> list;
        String str;
        List<byte[]> list2;
        String str2;
        String str3;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int i7 = i2;
        int i8 = i3;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray2.setPosition(i7 + 8 + 8);
        parsableByteArray2.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray2.skipBytes(50);
        int position = parsableByteArray.getPosition();
        String str4 = null;
        int i9 = i;
        if (i9 == 1701733238) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray2, i7, i8);
            if (parseSampleEntryEncryptionData != null) {
                i9 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                if (drmInitData3 == null) {
                    drmInitData3 = null;
                } else {
                    drmInitData3 = drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                }
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray2.setPosition(position);
        }
        List<byte[]> list3 = null;
        String str5 = i9 == 1831958048 ? "video/mpeg" : null;
        int i10 = -1;
        float f = 1.0f;
        boolean z = false;
        byte[] bArr = null;
        while (true) {
            if (position - i7 >= i8) {
                drmInitData2 = drmInitData3;
                list = list3;
                break;
            }
            parsableByteArray2.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            drmInitData2 = drmInitData3;
            int readInt = parsableByteArray.readInt();
            if (readInt == 0) {
                list = list3;
                if (parsableByteArray.getPosition() - i7 == i8) {
                    break;
                }
            } else {
                list = list3;
            }
            Assertions.checkState(readInt > 0, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                Assertions.checkState(str5 == null);
                parsableByteArray2.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list2 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f = parse.pixelWidthAspectRatio;
                }
                str2 = parse.codecs;
                str = "video/avc";
            } else if (readInt2 == 1752589123) {
                Assertions.checkState(str5 == null);
                parsableByteArray2.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                list2 = parse2.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                str2 = parse2.codecs;
                str = "video/hevc";
            } else {
                if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                    DolbyVisionConfig parse3 = DolbyVisionConfig.parse(parsableByteArray);
                    if (parse3 != null) {
                        str4 = parse3.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                } else {
                    if (readInt2 == 1987076931) {
                        Assertions.checkState(str5 == null);
                        str3 = i9 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (readInt2 == 1635135811) {
                        Assertions.checkState(str5 == null);
                        str3 = MimeTypes.VIDEO_AV1;
                    } else if (readInt2 == 1681012275) {
                        Assertions.checkState(str5 == null);
                        str3 = "video/3gpp";
                    } else {
                        if (readInt2 == 1702061171) {
                            Assertions.checkState(str5 == null);
                            Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray2, position2);
                            String str6 = (String) parseEsdsFromParent.first;
                            byte[] bArr2 = (byte[]) parseEsdsFromParent.second;
                            list3 = bArr2 != null ? ImmutableList.m9347of(bArr2) : list;
                            str5 = str6;
                        } else if (readInt2 == 1885434736) {
                            list3 = list;
                            f = parsePaspFromParent(parsableByteArray2, position2);
                            z = true;
                        } else if (readInt2 == 1937126244) {
                            list3 = list;
                            bArr = parseProjFromParent(parsableByteArray2, position2, readInt);
                        } else if (readInt2 == 1936995172) {
                            int readUnsignedByte = parsableByteArray.readUnsignedByte();
                            parsableByteArray2.skipBytes(3);
                            if (readUnsignedByte == 0) {
                                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                                if (readUnsignedByte2 == 0) {
                                    list3 = list;
                                    i10 = 0;
                                } else if (readUnsignedByte2 == 1) {
                                    list3 = list;
                                    i10 = 1;
                                } else if (readUnsignedByte2 == 2) {
                                    list3 = list;
                                    i10 = 2;
                                } else if (readUnsignedByte2 == 3) {
                                    list3 = list;
                                    i10 = 3;
                                }
                            }
                        }
                        position += readInt;
                        i7 = i2;
                        i8 = i3;
                        drmInitData3 = drmInitData2;
                    }
                    list3 = list;
                    str5 = str3;
                    position += readInt;
                    i7 = i2;
                    i8 = i3;
                    drmInitData3 = drmInitData2;
                }
                list3 = list;
                position += readInt;
                i7 = i2;
                i8 = i3;
                drmInitData3 = drmInitData2;
            }
            list3 = list2;
            str5 = str;
            str4 = str2;
            position += readInt;
            i7 = i2;
            i8 = i3;
            drmInitData3 = drmInitData2;
        }
        if (str5 != null) {
            stsdData2.format = new Format.Builder().setId(i4).setSampleMimeType(str5).setCodecs(str4).setWidth(readUnsignedShort).setHeight(readUnsignedShort2).setPixelWidthHeightRatio(f).setRotationDegrees(i5).setProjectionData(bArr).setStereoMode(i10).setInitializationData(list).setDrmInitData(drmInitData2).build();
        }
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 8 + 8);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        int i = 0;
        while (i < readUnsignedIntToInt) {
            jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : (long) parsableByteArray.readInt();
            if (parsableByteArray.readShort() == 1) {
                parsableByteArray.skipBytes(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return ((float) parsableByteArray.readUnsignedIntToInt()) / ((float) parsableByteArray.readUnsignedIntToInt());
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x029a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.google.android.exoplayer2.drm.DrmInitData r27, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r28, int r29) throws com.google.android.exoplayer2.ParserException {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r6 = r28
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.setPosition(r7)
            r7 = 6
            if (r26 == 0) goto L_0x0021
            int r8 = r20.readUnsignedShort()
            r0.skipBytes(r7)
            goto L_0x0025
        L_0x0021:
            r0.skipBytes(r8)
            r8 = 0
        L_0x0025:
            r10 = 16
            r11 = 2
            r12 = 1
            if (r8 == 0) goto L_0x0047
            if (r8 != r12) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            if (r8 != r11) goto L_0x0046
            r0.skipBytes(r10)
            double r7 = r20.readDouble()
            long r7 = java.lang.Math.round(r7)
            int r8 = (int) r7
            int r7 = r20.readUnsignedIntToInt()
            r10 = 20
            r0.skipBytes(r10)
            goto L_0x0059
        L_0x0046:
            return
        L_0x0047:
            int r13 = r20.readUnsignedShort()
            r0.skipBytes(r7)
            int r7 = r20.readUnsignedFixedPoint1616()
            if (r8 != r12) goto L_0x0057
            r0.skipBytes(r10)
        L_0x0057:
            r8 = r7
            r7 = r13
        L_0x0059:
            int r10 = r20.getPosition()
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r21
            if (r15 != r13) goto L_0x008f
            android.util.Pair r13 = parseSampleEntryEncryptionData(r0, r1, r2)
            if (r13 == 0) goto L_0x008a
            java.lang.Object r15 = r13.first
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r5 != 0) goto L_0x0076
            r14 = 0
            goto L_0x0081
        L_0x0076:
            java.lang.Object r14 = r13.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r14 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r14
            java.lang.String r14 = r14.schemeType
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.copyWithSchemeType(r14)
            r14 = r5
        L_0x0081:
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r5 = r6.trackEncryptionBoxes
            java.lang.Object r13 = r13.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r13 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r13
            r5[r29] = r13
            goto L_0x008b
        L_0x008a:
            r14 = r5
        L_0x008b:
            r0.setPosition(r10)
            goto L_0x0090
        L_0x008f:
            r14 = r5
        L_0x0090:
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            r13 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r17 = "audio/raw"
            if (r15 != r5) goto L_0x009f
            java.lang.String r17 = "audio/ac3"
        L_0x009c:
            r5 = -1
            goto L_0x012d
        L_0x009f:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r15 != r5) goto L_0x00a7
            java.lang.String r17 = "audio/eac3"
            goto L_0x009c
        L_0x00a7:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r15 != r5) goto L_0x00af
            java.lang.String r17 = "audio/ac4"
            goto L_0x009c
        L_0x00af:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r15 != r5) goto L_0x00b7
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x009c
        L_0x00b7:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r15 == r5) goto L_0x0129
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r15 != r5) goto L_0x00c3
            goto L_0x0129
        L_0x00c3:
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r15 != r5) goto L_0x00cb
            java.lang.String r17 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009c
        L_0x00cb:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r15 != r5) goto L_0x00d3
            java.lang.String r17 = "audio/3gpp"
            goto L_0x009c
        L_0x00d3:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r15 != r5) goto L_0x00db
            java.lang.String r17 = "audio/amr-wb"
            goto L_0x009c
        L_0x00db:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r15 == r5) goto L_0x0127
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r15 != r5) goto L_0x00e6
            goto L_0x0127
        L_0x00e6:
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r15 != r5) goto L_0x00ee
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012d
        L_0x00ee:
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r15 == r5) goto L_0x0123
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r15 != r5) goto L_0x00f9
            goto L_0x0123
        L_0x00f9:
            if (r15 != r13) goto L_0x00fe
            java.lang.String r17 = "audio/alac"
            goto L_0x009c
        L_0x00fe:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r15 != r5) goto L_0x0106
            java.lang.String r17 = "audio/g711-alaw"
            goto L_0x009c
        L_0x0106:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r15 != r5) goto L_0x010e
            java.lang.String r17 = "audio/g711-mlaw"
            goto L_0x009c
        L_0x010e:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r15 != r5) goto L_0x0116
            java.lang.String r17 = "audio/opus"
            goto L_0x009c
        L_0x0116:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r15 != r5) goto L_0x011f
            java.lang.String r17 = "audio/flac"
            goto L_0x009c
        L_0x011f:
            r5 = -1
            r17 = 0
            goto L_0x012d
        L_0x0123:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x009c
        L_0x0127:
            r5 = 2
            goto L_0x012d
        L_0x0129:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x009c
        L_0x012d:
            r11 = r17
            r15 = 0
            r19 = 0
        L_0x0132:
            int r13 = r10 - r1
            if (r13 >= r2) goto L_0x0296
            r0.setPosition(r10)
            int r13 = r20.readInt()
            if (r13 <= 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r12 = 0
        L_0x0141:
            java.lang.String r9 = "childAtomSize should be positive"
            com.google.android.exoplayer2.util.Assertions.checkState(r12, r9)
            int r9 = r20.readInt()
            r12 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r12) goto L_0x0258
            if (r26 == 0) goto L_0x0160
            r12 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r12) goto L_0x0160
            r1 = 1702061171(0x65736473, float:7.183675E22)
            r12 = 0
            r16 = 1
            r18 = 2
            goto L_0x0260
        L_0x0160:
            r12 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r12) goto L_0x0179
            int r9 = r10 + 8
            r0.setPosition(r9)
            java.lang.String r9 = java.lang.Integer.toString(r24)
            com.google.android.exoplayer2.Format r9 = com.google.android.exoplayer2.audio.Ac3Util.parseAc3AnnexFFormat(r0, r9, r4, r14)
            r6.format = r9
        L_0x0174:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x01ec
        L_0x0179:
            r12 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r12) goto L_0x018e
            int r9 = r10 + 8
            r0.setPosition(r9)
            java.lang.String r9 = java.lang.Integer.toString(r24)
            com.google.android.exoplayer2.Format r9 = com.google.android.exoplayer2.audio.Ac3Util.parseEAc3AnnexFFormat(r0, r9, r4, r14)
            r6.format = r9
            goto L_0x0174
        L_0x018e:
            r12 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r12) goto L_0x01a3
            int r9 = r10 + 8
            r0.setPosition(r9)
            java.lang.String r9 = java.lang.Integer.toString(r24)
            com.google.android.exoplayer2.Format r9 = com.google.android.exoplayer2.audio.Ac4Util.parseAc4AnnexEFormat(r0, r9, r4, r14)
            r6.format = r9
            goto L_0x0174
        L_0x01a3:
            r12 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 != r12) goto L_0x01cc
            com.google.android.exoplayer2.Format$Builder r9 = new com.google.android.exoplayer2.Format$Builder
            r9.<init>()
            com.google.android.exoplayer2.Format$Builder r9 = r9.setId((int) r3)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSampleMimeType(r11)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setChannelCount(r7)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setSampleRate(r8)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setDrmInitData(r14)
            com.google.android.exoplayer2.Format$Builder r9 = r9.setLanguage(r4)
            com.google.android.exoplayer2.Format r9 = r9.build()
            r6.format = r9
            goto L_0x0174
        L_0x01cc:
            r12 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r12) goto L_0x01f3
            int r9 = r13 + -8
            byte[] r12 = opusMagic
            int r1 = r12.length
            int r1 = r1 + r9
            byte[] r1 = java.util.Arrays.copyOf(r12, r1)
            int r12 = r10 + 8
            r0.setPosition(r12)
            byte[] r12 = opusMagic
            int r12 = r12.length
            r0.readBytes(r1, r12, r9)
            java.util.List r1 = com.google.android.exoplayer2.audio.OpusUtil.buildInitializationData(r1)
            r19 = r1
        L_0x01ec:
            r12 = 0
            r16 = 1
            r18 = 2
            goto L_0x0290
        L_0x01f3:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L_0x0226
            int r1 = r13 + -12
            int r9 = r1 + 4
            byte[] r9 = new byte[r9]
            r12 = 102(0x66, float:1.43E-43)
            r17 = 0
            r9[r17] = r12
            r12 = 76
            r16 = 1
            r9[r16] = r12
            r12 = 97
            r18 = 2
            r9[r18] = r12
            r12 = 3
            r19 = 67
            r9[r12] = r19
            int r12 = r10 + 12
            r0.setPosition(r12)
            r12 = 4
            r0.readBytes(r9, r12, r1)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m9347of(r9)
            r19 = r1
        L_0x0224:
            r12 = 0
            goto L_0x0290
        L_0x0226:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r18 = 2
            if (r9 != r1) goto L_0x0224
            int r7 = r13 + -12
            byte[] r8 = new byte[r7]
            int r9 = r10 + 12
            r0.setPosition(r9)
            r12 = 0
            r0.readBytes(r8, r12, r7)
            android.util.Pair r7 = com.google.android.exoplayer2.util.CodecSpecificDataUtil.parseAlacAudioSpecificConfig(r8)
            java.lang.Object r9 = r7.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.m9347of(r8)
            r19 = r8
            r8 = r9
            goto L_0x0290
        L_0x0258:
            r12 = 0
            r16 = 1
            r18 = 2
            r1 = 1702061171(0x65736473, float:7.183675E22)
        L_0x0260:
            if (r9 != r1) goto L_0x0264
            r1 = r10
            goto L_0x0268
        L_0x0264:
            int r1 = findEsdsPosition(r0, r10, r13)
        L_0x0268:
            r9 = -1
            if (r1 == r9) goto L_0x0290
            android.util.Pair r1 = parseEsdsFromParent(r0, r1)
            java.lang.Object r11 = r1.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0290
            java.lang.String r9 = "audio/mp4a-latm"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x028c
            com.google.android.exoplayer2.audio.AacUtil$Config r7 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r1)
            int r8 = r7.sampleRateHz
            int r9 = r7.channelCount
            java.lang.String r15 = r7.codecs
            r7 = r9
        L_0x028c:
            com.google.common.collect.ImmutableList r19 = com.google.common.collect.ImmutableList.m9347of(r1)
        L_0x0290:
            int r10 = r10 + r13
            r1 = r22
            r12 = 1
            goto L_0x0132
        L_0x0296:
            com.google.android.exoplayer2.Format r0 = r6.format
            if (r0 != 0) goto L_0x02cd
            if (r11 == 0) goto L_0x02cd
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            com.google.android.exoplayer2.Format$Builder r0 = r0.setId((int) r3)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r11)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setCodecs(r15)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setChannelCount(r7)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleRate(r8)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPcmEncoding(r5)
            r1 = r19
            com.google.android.exoplayer2.Format$Builder r0 = r0.setInitializationData(r1)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setDrmInitData(r14)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setLanguage(r4)
            com.google.android.exoplayer2.Format r0 = r0.build()
            r6.format = r0
        L_0x02cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData, int):void");
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i, int i2) {
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            Assertions.checkState(readInt > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == 1702061171) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8 + 4);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, (Object) null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            Assertions.checkState(readInt > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        Assertions.checkStateNotNull(num, "frma atom is mandatory");
        if (i4 != -1) {
            z = true;
        }
        Assertions.checkState(z, "schi atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Assertions.checkStateNotNull(parseSchiFromParent(parsableByteArray, i4, i5, str), "tenc atom is mandatory"));
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int constrainValue = Util.constrainValue(4, 0, length);
        int constrainValue2 = Util.constrainValue(jArr.length - 4, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[constrainValue] || jArr[constrainValue2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    private AtomParsers() {
    }

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            Assertions.checkState(parsableByteArray.readInt() != 1 ? false : true, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long j;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                j = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                j = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = j;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class TkhdData {
        /* access modifiers changed from: private */
        public final long duration;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public final int f10044id;
        /* access modifiers changed from: private */
        public final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.f10044id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = this.data.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.m9247w(AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = this.data.readUnsignedIntToInt();
        }

        public int getSampleCount() {
            return this.sampleCount;
        }

        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize = (this.data.readUnsignedIntToInt() & 255);
        private final int sampleCount = this.data.readUnsignedIntToInt();
        private int sampleIndex;

        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
        }

        public int getSampleCount() {
            return this.sampleCount;
        }

        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int readUnsignedByte = this.data.readUnsignedByte();
            this.currentByte = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
    }
}
