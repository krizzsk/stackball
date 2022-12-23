package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = $$Lambda$WavExtractor$5r6M_S0QCNNj_Xavzq9WwuFHep0.INSTANCE;
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private long dataEndPosition = -1;
    private int dataStartPosition = -1;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;

    private interface OutputWriter {
        void init(int i, long j) throws ParserException;

        void reset(long j);

        boolean sampleData(ExtractorInput extractorInput, long j) throws IOException;
    }

    public void release() {
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return WavHeaderReader.peek(extractorInput) != null;
    }

    public void init(ExtractorOutput extractorOutput2) {
        this.extractorOutput = extractorOutput2;
        this.trackOutput = extractorOutput2.track(0, 1);
        extractorOutput2.endTracks();
    }

    public void seek(long j, long j2) {
        OutputWriter outputWriter2 = this.outputWriter;
        if (outputWriter2 != null) {
            outputWriter2.reset(j2);
        }
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        if (this.outputWriter == null) {
            WavHeader peek = WavHeaderReader.peek(extractorInput);
            if (peek == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            } else if (peek.formatType == 17) {
                this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, peek);
            } else if (peek.formatType == 6) {
                this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, peek, "audio/g711-alaw", -1);
            } else if (peek.formatType == 7) {
                this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, peek, "audio/g711-mlaw", -1);
            } else {
                int pcmEncodingForType = WavUtil.getPcmEncodingForType(peek.formatType, peek.bitsPerSample);
                if (pcmEncodingForType != 0) {
                    this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, peek, "audio/raw", pcmEncodingForType);
                } else {
                    throw new ParserException("Unsupported WAV format type: " + peek.formatType);
                }
            }
        }
        if (this.dataStartPosition == -1) {
            Pair<Long, Long> skipToData = WavHeaderReader.skipToData(extractorInput);
            this.dataStartPosition = ((Long) skipToData.first).intValue();
            long longValue = ((Long) skipToData.second).longValue();
            this.dataEndPosition = longValue;
            this.outputWriter.init(this.dataStartPosition, longValue);
        } else if (extractorInput.getPosition() == 0) {
            extractorInput.skipFully(this.dataStartPosition);
        }
        Assertions.checkState(this.dataEndPosition != -1);
        if (this.outputWriter.sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition())) {
            return -1;
        }
        return 0;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final WavHeader header;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput2, TrackOutput trackOutput2, WavHeader wavHeader, String str, int i) throws ParserException {
            this.extractorOutput = extractorOutput2;
            this.trackOutput = trackOutput2;
            this.header = wavHeader;
            int i2 = (wavHeader.numChannels * wavHeader.bitsPerSample) / 8;
            if (wavHeader.blockSize == i2) {
                int i3 = wavHeader.frameRateHz * i2 * 8;
                this.targetSampleSizeBytes = Math.max(i2, (wavHeader.frameRateHz * i2) / 10);
                this.format = new Format.Builder().setSampleMimeType(str).setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(this.targetSampleSizeBytes).setChannelCount(wavHeader.numChannels).setSampleRate(wavHeader.frameRateHz).setPcmEncoding(i).build();
                return;
            }
            throw new ParserException("Expected block size: " + i2 + "; got: " + wavHeader.blockSize);
        }

        public void reset(long j) {
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0;
        }

        public void init(int i, long j) {
            this.extractorOutput.seekMap(new WavSeekMap(this.header, 1, (long) i, j));
            this.trackOutput.format(this.format);
        }

        public boolean sampleData(ExtractorInput extractorInput, long j) throws IOException {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.pendingOutputBytes) >= (i3 = this.targetSampleSizeBytes)) {
                    int i4 = this.header.blockSize;
                    int i5 = this.pendingOutputBytes / i4;
                } else {
                    int sampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min((long) (i3 - i2), j2), true);
                    if (sampleData == -1) {
                        j2 = 0;
                    } else {
                        this.pendingOutputBytes += sampleData;
                        j2 -= (long) sampleData;
                    }
                }
            }
            int i42 = this.header.blockSize;
            int i52 = this.pendingOutputBytes / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.pendingOutputBytes - i6;
                this.trackOutput.sampleMetadata(this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000, (long) this.header.frameRateHz), 1, i6, i7, (TrackOutput.CryptoData) null);
                this.outputFrameCount += (long) i52;
                this.pendingOutputBytes = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }
    }

    private static final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, ErrorCode.CONDITIONAL_AD_REJECTED_ERROR, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final WavHeader header;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;

        private static int numOutputFramesToBytes(int i, int i2) {
            return i * 2 * i2;
        }

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput2, TrackOutput trackOutput2, WavHeader wavHeader) throws ParserException {
            this.extractorOutput = extractorOutput2;
            this.trackOutput = trackOutput2;
            this.header = wavHeader;
            this.targetSampleSizeFrames = Math.max(1, wavHeader.frameRateHz / 10);
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavHeader.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = parsableByteArray.readLittleEndianUnsignedShort();
            int i = wavHeader.numChannels;
            int i2 = (((wavHeader.blockSize - (i * 4)) * 8) / (wavHeader.bitsPerSample * i)) + 1;
            int i3 = this.framesPerBlock;
            if (i3 == i2) {
                int ceilDivide = Util.ceilDivide(this.targetSampleSizeFrames, i3);
                this.inputData = new byte[(wavHeader.blockSize * ceilDivide)];
                this.decodedData = new ParsableByteArray(ceilDivide * numOutputFramesToBytes(this.framesPerBlock, i));
                int i4 = ((wavHeader.frameRateHz * wavHeader.blockSize) * 8) / this.framesPerBlock;
                this.format = new Format.Builder().setSampleMimeType("audio/raw").setAverageBitrate(i4).setPeakBitrate(i4).setMaxInputSize(numOutputFramesToBytes(this.targetSampleSizeFrames, i)).setChannelCount(wavHeader.numChannels).setSampleRate(wavHeader.frameRateHz).setPcmEncoding(2).build();
                return;
            }
            throw new ParserException("Expected frames per block: " + i2 + "; got: " + this.framesPerBlock);
        }

        public void reset(long j) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0;
        }

        public void init(int i, long j) {
            this.extractorOutput.seekMap(new WavSeekMap(this.header, this.framesPerBlock, (long) i, j));
            this.trackOutput.format(this.format);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean sampleData(com.google.android.exoplayer2.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = com.google.android.exoplayer2.util.Util.ceilDivide((int) r0, (int) r1)
                com.google.android.exoplayer2.extractor.wav.WavHeader r1 = r6.header
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                if (r2 != 0) goto L_0x003f
                int r3 = r6.pendingInputBytes
                if (r3 >= r0) goto L_0x003f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x0039
                goto L_0x001c
            L_0x0039:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L_0x001f
            L_0x003f:
                int r7 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavHeader r8 = r6.header
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0077
                byte[] r8 = r6.inputData
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavHeader r9 = r6.header
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                com.google.android.exoplayer2.extractor.TrackOutput r8 = r6.trackOutput
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L_0x0077
                r6.writeSampleMetadata(r8)
            L_0x0077:
                if (r2 == 0) goto L_0x0084
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L_0x0084
                r6.writeSampleMetadata(r7)
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(com.google.android.exoplayer2.extractor.ExtractorInput, long):boolean");
        }

        private void writeSampleMetadata(int i) {
            long scaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000, (long) this.header.frameRateHz);
            int numOutputFramesToBytes = numOutputFramesToBytes(i);
            this.trackOutput.sampleMetadata(scaleLargeTimestamp, 1, numOutputFramesToBytes, this.pendingOutputBytes - numOutputFramesToBytes, (TrackOutput.CryptoData) null);
            this.outputFrameCount += (long) i;
            this.pendingOutputBytes -= numOutputFramesToBytes;
        }

        private void decode(byte[] bArr, int i, ParsableByteArray parsableByteArray) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.header.numChannels; i3++) {
                    decodeBlockForChannel(bArr, i2, i3, parsableByteArray.getData());
                }
            }
            int numOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(numOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = this.header.blockSize;
            int i4 = this.header.numChannels;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = STEP_TABLE[min];
            int i10 = ((i * this.framesPerBlock * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & 255);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                byte b = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)] & 255;
                int i12 = i11 % 2 == 0 ? b & Ascii.f10109SI : b >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i9) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                i8 = Util.constrainValue(i8 + i13, -32768, 32767);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & 255);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                min = Util.constrainValue(min + INDEX_TABLE[i12], 0, STEP_TABLE.length - 1);
                i9 = STEP_TABLE[min];
            }
        }

        private int numOutputBytesToFrames(int i) {
            return i / (this.header.numChannels * 2);
        }

        private int numOutputFramesToBytes(int i) {
            return numOutputFramesToBytes(i, this.header.numChannels);
        }
    }
}
