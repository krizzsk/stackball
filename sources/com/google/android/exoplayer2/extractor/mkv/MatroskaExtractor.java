package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final ExtractorsFactory FACTORY = $$Lambda$MatroskaExtractor$jNXW0tyYIOPE6N2jicocV6rRvBs.INSTANCE;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    /* access modifiers changed from: private */
    public static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    /* access modifiers changed from: private */
    public static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    /* access modifiers changed from: private */
    public static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);
    private final ParsableByteArray blockAdditionalData;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private LongArray cueClusterPositions;
    private LongArray cueTimesUs;
    private long cuesContentPosition;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* access modifiers changed from: protected */
    public int getElementType(int i) {
        switch (i) {
            case ID_TRACK_TYPE /*131*/:
            case ID_FLAG_DEFAULT /*136*/:
            case ID_BLOCK_DURATION /*155*/:
            case ID_CHANNELS /*159*/:
            case ID_PIXEL_WIDTH /*176*/:
            case ID_CUE_TIME /*179*/:
            case ID_PIXEL_HEIGHT /*186*/:
            case ID_TRACK_NUMBER /*215*/:
            case ID_TIME_CODE /*231*/:
            case ID_BLOCK_ADD_ID /*238*/:
            case ID_CUE_CLUSTER_POSITION /*241*/:
            case ID_REFERENCE_BLOCK /*251*/:
            case ID_BLOCK_ADD_ID_TYPE /*16871*/:
            case ID_CONTENT_COMPRESSION_ALGORITHM /*16980*/:
            case ID_DOC_TYPE_READ_VERSION /*17029*/:
            case ID_EBML_READ_VERSION /*17143*/:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /*18401*/:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /*18408*/:
            case ID_CONTENT_ENCODING_ORDER /*20529*/:
            case ID_CONTENT_ENCODING_SCOPE /*20530*/:
            case ID_SEEK_POSITION /*21420*/:
            case ID_STEREO_MODE /*21432*/:
            case ID_DISPLAY_WIDTH /*21680*/:
            case ID_DISPLAY_UNIT /*21682*/:
            case ID_DISPLAY_HEIGHT /*21690*/:
            case ID_FLAG_FORCED /*21930*/:
            case ID_COLOUR_RANGE /*21945*/:
            case ID_COLOUR_TRANSFER /*21946*/:
            case ID_COLOUR_PRIMARIES /*21947*/:
            case ID_MAX_CLL /*21948*/:
            case ID_MAX_FALL /*21949*/:
            case ID_MAX_BLOCK_ADDITION_ID /*21998*/:
            case ID_CODEC_DELAY /*22186*/:
            case ID_SEEK_PRE_ROLL /*22203*/:
            case ID_AUDIO_BIT_DEPTH /*25188*/:
            case ID_PROJECTION_TYPE /*30321*/:
            case ID_DEFAULT_DURATION /*2352003*/:
            case ID_TIMECODE_SCALE /*2807729*/:
                return 2;
            case 134:
            case 17026:
            case ID_NAME /*21358*/:
            case ID_LANGUAGE /*2274716*/:
                return 3;
            case ID_BLOCK_GROUP /*160*/:
            case ID_BLOCK_MORE /*166*/:
            case ID_TRACK_ENTRY /*174*/:
            case ID_CUE_TRACK_POSITIONS /*183*/:
            case ID_CUE_POINT /*187*/:
            case 224:
            case ID_AUDIO /*225*/:
            case ID_BLOCK_ADDITION_MAPPING /*16868*/:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /*18407*/:
            case ID_SEEK /*19899*/:
            case ID_CONTENT_COMPRESSION /*20532*/:
            case ID_CONTENT_ENCRYPTION /*20533*/:
            case ID_COLOUR /*21936*/:
            case ID_MASTERING_METADATA /*21968*/:
            case ID_CONTENT_ENCODING /*25152*/:
            case ID_CONTENT_ENCODINGS /*28032*/:
            case ID_BLOCK_ADDITIONS /*30113*/:
            case ID_PROJECTION /*30320*/:
            case ID_SEEK_HEAD /*290298740*/:
            case 357149030:
            case ID_TRACKS /*374648427*/:
            case ID_SEGMENT /*408125543*/:
            case ID_EBML /*440786851*/:
            case ID_CUES /*475249515*/:
            case ID_CLUSTER /*524531317*/:
                return 1;
            case ID_BLOCK /*161*/:
            case ID_SIMPLE_BLOCK /*163*/:
            case ID_BLOCK_ADDITIONAL /*165*/:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /*16877*/:
            case ID_CONTENT_COMPRESSION_SETTINGS /*16981*/:
            case ID_CONTENT_ENCRYPTION_KEY_ID /*18402*/:
            case ID_SEEK_ID /*21419*/:
            case ID_CODEC_PRIVATE /*25506*/:
            case ID_PROJECTION_PRIVATE /*30322*/:
                return 4;
            case ID_SAMPLING_FREQUENCY /*181*/:
            case ID_DURATION /*17545*/:
            case ID_PRIMARY_R_CHROMATICITY_X /*21969*/:
            case ID_PRIMARY_R_CHROMATICITY_Y /*21970*/:
            case ID_PRIMARY_G_CHROMATICITY_X /*21971*/:
            case ID_PRIMARY_G_CHROMATICITY_Y /*21972*/:
            case ID_PRIMARY_B_CHROMATICITY_X /*21973*/:
            case ID_PRIMARY_B_CHROMATICITY_Y /*21974*/:
            case ID_WHITE_POINT_CHROMATICITY_X /*21975*/:
            case ID_WHITE_POINT_CHROMATICITY_Y /*21976*/:
            case ID_LUMNINANCE_MAX /*21977*/:
            case ID_LUMNINANCE_MIN /*21978*/:
            case ID_PROJECTION_POSE_YAW /*30323*/:
            case ID_PROJECTION_POSE_PITCH /*30324*/:
            case ID_PROJECTION_POSE_ROLL /*30325*/:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public boolean isLevel1Element(int i) {
        return i == 357149030 || i == ID_CLUSTER || i == ID_CUES || i == ID_TRACKS;
    }

    public final void release() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(hashMap);
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i);
    }

    MatroskaExtractor(EbmlReader ebmlReader, int i) {
        this.segmentContentPosition = -1;
        this.timecodeScale = -9223372036854775807L;
        this.durationTimecode = -9223372036854775807L;
        this.durationUs = -9223372036854775807L;
        this.cuesContentPosition = -1;
        this.seekPositionAfterBuildingCues = -1;
        this.clusterTimecodeUs = -9223372036854775807L;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.seekForCuesEnabled = (i & 1) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.blockAdditionalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Sniffer().sniff(extractorInput);
    }

    public final void init(ExtractorOutput extractorOutput2) {
        this.extractorOutput = extractorOutput2;
    }

    public void seek(long j, long j2) {
        this.clusterTimecodeUs = -9223372036854775807L;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            Track valueAt = this.tracks.valueAt(i);
            valueAt.assertOutputInitialized();
            valueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void startMasterElement(int i, long j, long j2) throws ParserException {
        assertInitialized();
        if (i == ID_BLOCK_GROUP) {
            this.blockHasReferenceBlock = false;
        } else if (i == ID_TRACK_ENTRY) {
            this.currentTrack = new Track();
        } else if (i == ID_CUE_POINT) {
            this.seenClusterPositionForCurrentCuePoint = false;
        } else if (i == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1;
        } else if (i == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i).hasContentEncryption = true;
        } else if (i == ID_MASTERING_METADATA) {
            getCurrentTrack(i).hasColorInfo = true;
        } else if (i == ID_SEGMENT) {
            long j3 = this.segmentContentPosition;
            if (j3 == -1 || j3 == j) {
                this.segmentContentPosition = j;
                this.segmentContentSize = j2;
                return;
            }
            throw new ParserException("Multiple Segment elements not supported");
        } else if (i == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i != ID_CLUSTER || this.sentSeekMap) {
        } else {
            if (!this.seekForCuesEnabled || this.cuesContentPosition == -1) {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
                return;
            }
            this.seekForCues = true;
        }
    }

    /* access modifiers changed from: protected */
    public void endMasterElement(int i) throws ParserException {
        assertInitialized();
        if (i != ID_BLOCK_GROUP) {
            if (i == ID_TRACK_ENTRY) {
                Track track = (Track) Assertions.checkStateNotNull(this.currentTrack);
                if (track.codecId != null) {
                    if (isCodecSupported(track.codecId)) {
                        track.initializeOutput(this.extractorOutput, track.number);
                        this.tracks.put(track.number, track);
                    }
                    this.currentTrack = null;
                    return;
                }
                throw new ParserException("CodecId is missing in TrackEntry element");
            } else if (i == ID_SEEK) {
                int i2 = this.seekEntryId;
                if (i2 != -1) {
                    long j = this.seekEntryPosition;
                    if (j != -1) {
                        if (i2 == ID_CUES) {
                            this.cuesContentPosition = j;
                            return;
                        }
                        return;
                    }
                }
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (i == ID_CONTENT_ENCODING) {
                assertInTrackEntry(i);
                if (!this.currentTrack.hasContentEncryption) {
                    return;
                }
                if (this.currentTrack.cryptoData != null) {
                    this.currentTrack.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C3716C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
                    return;
                }
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == ID_CONTENT_ENCODINGS) {
                assertInTrackEntry(i);
                if (this.currentTrack.hasContentEncryption && this.currentTrack.sampleStrippedBytes != null) {
                    throw new ParserException("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.timecodeScale == -9223372036854775807L) {
                    this.timecodeScale = 1000000;
                }
                long j2 = this.durationTimecode;
                if (j2 != -9223372036854775807L) {
                    this.durationUs = scaleTimecodeToUs(j2);
                }
            } else if (i != ID_TRACKS) {
                if (i == ID_CUES) {
                    if (!this.sentSeekMap) {
                        this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                        this.sentSeekMap = true;
                    }
                    this.cueTimesUs = null;
                    this.cueClusterPositions = null;
                }
            } else if (this.tracks.size() != 0) {
                this.extractorOutput.endTracks();
            } else {
                throw new ParserException("No valid tracks were found");
            }
        } else if (this.blockState == 2) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.blockSampleCount; i4++) {
                i3 += this.blockSampleSizes[i4];
            }
            Track track2 = this.tracks.get(this.blockTrackNumber);
            track2.assertOutputInitialized();
            for (int i5 = 0; i5 < this.blockSampleCount; i5++) {
                long j3 = ((long) ((track2.defaultSampleDurationNs * i5) / 1000)) + this.blockTimeUs;
                int i6 = this.blockFlags;
                if (i5 == 0 && !this.blockHasReferenceBlock) {
                    i6 |= 1;
                }
                int i7 = this.blockSampleSizes[i5];
                i3 -= i7;
                commitSampleToOutput(track2, j3, i6, i7, i3);
            }
            this.blockState = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void integerElement(int i, long j) throws ParserException {
        if (i != ID_CONTENT_ENCODING_ORDER) {
            if (i != ID_CONTENT_ENCODING_SCOPE) {
                boolean z = false;
                switch (i) {
                    case ID_TRACK_TYPE /*131*/:
                        getCurrentTrack(i).type = (int) j;
                        return;
                    case ID_FLAG_DEFAULT /*136*/:
                        Track currentTrack2 = getCurrentTrack(i);
                        if (j == 1) {
                            z = true;
                        }
                        currentTrack2.flagDefault = z;
                        return;
                    case ID_BLOCK_DURATION /*155*/:
                        this.blockDurationUs = scaleTimecodeToUs(j);
                        return;
                    case ID_CHANNELS /*159*/:
                        getCurrentTrack(i).channelCount = (int) j;
                        return;
                    case ID_PIXEL_WIDTH /*176*/:
                        getCurrentTrack(i).width = (int) j;
                        return;
                    case ID_CUE_TIME /*179*/:
                        assertInCues(i);
                        this.cueTimesUs.add(scaleTimecodeToUs(j));
                        return;
                    case ID_PIXEL_HEIGHT /*186*/:
                        getCurrentTrack(i).height = (int) j;
                        return;
                    case ID_TRACK_NUMBER /*215*/:
                        getCurrentTrack(i).number = (int) j;
                        return;
                    case ID_TIME_CODE /*231*/:
                        this.clusterTimecodeUs = scaleTimecodeToUs(j);
                        return;
                    case ID_BLOCK_ADD_ID /*238*/:
                        this.blockAdditionalId = (int) j;
                        return;
                    case ID_CUE_CLUSTER_POSITION /*241*/:
                        if (!this.seenClusterPositionForCurrentCuePoint) {
                            assertInCues(i);
                            this.cueClusterPositions.add(j);
                            this.seenClusterPositionForCurrentCuePoint = true;
                            return;
                        }
                        return;
                    case ID_REFERENCE_BLOCK /*251*/:
                        this.blockHasReferenceBlock = true;
                        return;
                    case ID_BLOCK_ADD_ID_TYPE /*16871*/:
                        int unused = getCurrentTrack(i).blockAddIdType = (int) j;
                        return;
                    case ID_CONTENT_COMPRESSION_ALGORITHM /*16980*/:
                        if (j != 3) {
                            throw new ParserException("ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case ID_DOC_TYPE_READ_VERSION /*17029*/:
                        if (j < 1 || j > 2) {
                            throw new ParserException("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case ID_EBML_READ_VERSION /*17143*/:
                        if (j != 1) {
                            throw new ParserException("EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_ALGORITHM /*18401*/:
                        if (j != 5) {
                            throw new ParserException("ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /*18408*/:
                        if (j != 1) {
                            throw new ParserException("AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case ID_SEEK_POSITION /*21420*/:
                        this.seekEntryPosition = j + this.segmentContentPosition;
                        return;
                    case ID_STEREO_MODE /*21432*/:
                        int i2 = (int) j;
                        assertInTrackEntry(i);
                        if (i2 == 0) {
                            this.currentTrack.stereoMode = 0;
                            return;
                        } else if (i2 == 1) {
                            this.currentTrack.stereoMode = 2;
                            return;
                        } else if (i2 == 3) {
                            this.currentTrack.stereoMode = 1;
                            return;
                        } else if (i2 == 15) {
                            this.currentTrack.stereoMode = 3;
                            return;
                        } else {
                            return;
                        }
                    case ID_DISPLAY_WIDTH /*21680*/:
                        getCurrentTrack(i).displayWidth = (int) j;
                        return;
                    case ID_DISPLAY_UNIT /*21682*/:
                        getCurrentTrack(i).displayUnit = (int) j;
                        return;
                    case ID_DISPLAY_HEIGHT /*21690*/:
                        getCurrentTrack(i).displayHeight = (int) j;
                        return;
                    case ID_FLAG_FORCED /*21930*/:
                        Track currentTrack3 = getCurrentTrack(i);
                        if (j == 1) {
                            z = true;
                        }
                        currentTrack3.flagForced = z;
                        return;
                    case ID_MAX_BLOCK_ADDITION_ID /*21998*/:
                        getCurrentTrack(i).maxBlockAdditionId = (int) j;
                        return;
                    case ID_CODEC_DELAY /*22186*/:
                        getCurrentTrack(i).codecDelayNs = j;
                        return;
                    case ID_SEEK_PRE_ROLL /*22203*/:
                        getCurrentTrack(i).seekPreRollNs = j;
                        return;
                    case ID_AUDIO_BIT_DEPTH /*25188*/:
                        getCurrentTrack(i).audioBitDepth = (int) j;
                        return;
                    case ID_PROJECTION_TYPE /*30321*/:
                        assertInTrackEntry(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.currentTrack.projectionType = 0;
                            return;
                        } else if (i3 == 1) {
                            this.currentTrack.projectionType = 1;
                            return;
                        } else if (i3 == 2) {
                            this.currentTrack.projectionType = 2;
                            return;
                        } else if (i3 == 3) {
                            this.currentTrack.projectionType = 3;
                            return;
                        } else {
                            return;
                        }
                    case ID_DEFAULT_DURATION /*2352003*/:
                        getCurrentTrack(i).defaultSampleDurationNs = (int) j;
                        return;
                    case ID_TIMECODE_SCALE /*2807729*/:
                        this.timecodeScale = j;
                        return;
                    default:
                        switch (i) {
                            case ID_COLOUR_RANGE /*21945*/:
                                assertInTrackEntry(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.currentTrack.colorRange = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.currentTrack.colorRange = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case ID_COLOUR_TRANSFER /*21946*/:
                                assertInTrackEntry(i);
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.currentTrack.colorTransfer = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.currentTrack.colorTransfer = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.currentTrack.colorTransfer = 3;
                                return;
                            case ID_COLOUR_PRIMARIES /*21947*/:
                                assertInTrackEntry(i);
                                this.currentTrack.hasColorInfo = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    this.currentTrack.colorSpace = 1;
                                    return;
                                } else if (i6 == 9) {
                                    this.currentTrack.colorSpace = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    this.currentTrack.colorSpace = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case ID_MAX_CLL /*21948*/:
                                getCurrentTrack(i).maxContentLuminance = (int) j;
                                return;
                            case ID_MAX_FALL /*21949*/:
                                getCurrentTrack(i).maxFrameAverageLuminance = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new ParserException("ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw new ParserException("ContentEncodingOrder " + j + " not supported");
        }
    }

    /* access modifiers changed from: protected */
    public void floatElement(int i, double d) throws ParserException {
        if (i == ID_SAMPLING_FREQUENCY) {
            getCurrentTrack(i).sampleRate = (int) d;
        } else if (i != ID_DURATION) {
            switch (i) {
                case ID_PRIMARY_R_CHROMATICITY_X /*21969*/:
                    getCurrentTrack(i).primaryRChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_R_CHROMATICITY_Y /*21970*/:
                    getCurrentTrack(i).primaryRChromaticityY = (float) d;
                    return;
                case ID_PRIMARY_G_CHROMATICITY_X /*21971*/:
                    getCurrentTrack(i).primaryGChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_G_CHROMATICITY_Y /*21972*/:
                    getCurrentTrack(i).primaryGChromaticityY = (float) d;
                    return;
                case ID_PRIMARY_B_CHROMATICITY_X /*21973*/:
                    getCurrentTrack(i).primaryBChromaticityX = (float) d;
                    return;
                case ID_PRIMARY_B_CHROMATICITY_Y /*21974*/:
                    getCurrentTrack(i).primaryBChromaticityY = (float) d;
                    return;
                case ID_WHITE_POINT_CHROMATICITY_X /*21975*/:
                    getCurrentTrack(i).whitePointChromaticityX = (float) d;
                    return;
                case ID_WHITE_POINT_CHROMATICITY_Y /*21976*/:
                    getCurrentTrack(i).whitePointChromaticityY = (float) d;
                    return;
                case ID_LUMNINANCE_MAX /*21977*/:
                    getCurrentTrack(i).maxMasteringLuminance = (float) d;
                    return;
                case ID_LUMNINANCE_MIN /*21978*/:
                    getCurrentTrack(i).minMasteringLuminance = (float) d;
                    return;
                default:
                    switch (i) {
                        case ID_PROJECTION_POSE_YAW /*30323*/:
                            getCurrentTrack(i).projectionPoseYaw = (float) d;
                            return;
                        case ID_PROJECTION_POSE_PITCH /*30324*/:
                            getCurrentTrack(i).projectionPosePitch = (float) d;
                            return;
                        case ID_PROJECTION_POSE_ROLL /*30325*/:
                            getCurrentTrack(i).projectionPoseRoll = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.durationTimecode = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    public void stringElement(int i, String str) throws ParserException {
        if (i == 134) {
            getCurrentTrack(i).codecId = str;
        } else if (i != 17026) {
            if (i == ID_NAME) {
                getCurrentTrack(i).name = str;
            } else if (i == ID_LANGUAGE) {
                String unused = getCurrentTrack(i).language = str;
            }
        } else if (!DOC_TYPE_WEBM.equals(str) && !DOC_TYPE_MATROSKA.equals(str)) {
            throw new ParserException("DocType " + str + " not supported");
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023d, code lost:
        throw new com.google.android.exoplayer2.ParserException("EBML lacing sample size out of range.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void binaryElement(int r22, int r23, com.google.android.exoplayer2.extractor.ExtractorInput r24) throws java.io.IOException {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            r1 = r23
            r8 = r24
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 2
            r9 = 0
            r10 = 1
            if (r0 == r2) goto L_0x00d1
            if (r0 == r3) goto L_0x00d1
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00bb
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00b2
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x00a0
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x008e
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x006a
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0058
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0041
            r21.assertInTrackEntry(r22)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r2 = new byte[r1]
            r0.projectionData = r2
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r0 = r0.projectionData
            r8.readFully(r0, r9, r1)
            goto L_0x02ec
        L_0x0041:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected id: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0058:
            r21.assertInTrackEntry(r22)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r2 = new byte[r1]
            r0.codecPrivate = r2
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r0 = r0.codecPrivate
            r8.readFully(r0, r9, r1)
            goto L_0x02ec
        L_0x006a:
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seekEntryIdBytes
            byte[] r0 = r0.getData()
            java.util.Arrays.fill(r0, r9)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seekEntryIdBytes
            byte[] r0 = r0.getData()
            int r2 = 4 - r1
            r8.readFully(r0, r2, r1)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seekEntryIdBytes
            r0.setPosition(r9)
            com.google.android.exoplayer2.util.ParsableByteArray r0 = r7.seekEntryIdBytes
            long r0 = r0.readUnsignedInt()
            int r1 = (int) r0
            r7.seekEntryId = r1
            goto L_0x02ec
        L_0x008e:
            byte[] r2 = new byte[r1]
            r8.readFully(r2, r9, r1)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r21.getCurrentTrack(r22)
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r1 = new com.google.android.exoplayer2.extractor.TrackOutput$CryptoData
            r1.<init>(r10, r2, r9, r9)
            r0.cryptoData = r1
            goto L_0x02ec
        L_0x00a0:
            r21.assertInTrackEntry(r22)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r2 = new byte[r1]
            r0.sampleStrippedBytes = r2
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r7.currentTrack
            byte[] r0 = r0.sampleStrippedBytes
            r8.readFully(r0, r9, r1)
            goto L_0x02ec
        L_0x00b2:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = r21.getCurrentTrack(r22)
            r7.handleBlockAddIDExtraData(r0, r8, r1)
            goto L_0x02ec
        L_0x00bb:
            int r0 = r7.blockState
            if (r0 == r4) goto L_0x00c0
            return
        L_0x00c0:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r0 = r7.tracks
            int r2 = r7.blockTrackNumber
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r0 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r0
            int r2 = r7.blockAdditionalId
            r7.handleBlockAdditionalData(r0, r2, r8, r1)
            goto L_0x02ec
        L_0x00d1:
            int r2 = r7.blockState
            r5 = 8
            if (r2 != 0) goto L_0x00f6
            com.google.android.exoplayer2.extractor.mkv.VarintReader r2 = r7.varintReader
            long r11 = r2.readUnsignedVarint(r8, r9, r10, r5)
            int r2 = (int) r11
            r7.blockTrackNumber = r2
            com.google.android.exoplayer2.extractor.mkv.VarintReader r2 = r7.varintReader
            int r2 = r2.getLastLength()
            r7.blockTrackNumberLength = r2
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.blockDurationUs = r11
            r7.blockState = r10
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r7.scratch
            r2.reset((int) r9)
        L_0x00f6:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r2 = r7.tracks
            int r6 = r7.blockTrackNumber
            java.lang.Object r2 = r2.get(r6)
            r11 = r2
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r11 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r11
            if (r11 != 0) goto L_0x010d
            int r0 = r7.blockTrackNumberLength
            int r0 = r1 - r0
            r8.skipFully(r0)
            r7.blockState = r9
            return
        L_0x010d:
            r11.assertOutputInitialized()
            int r2 = r7.blockState
            if (r2 != r10) goto L_0x02a6
            r2 = 3
            r7.readScratch(r8, r2)
            com.google.android.exoplayer2.util.ParsableByteArray r6 = r7.scratch
            byte[] r6 = r6.getData()
            byte r6 = r6[r4]
            r6 = r6 & 6
            int r6 = r6 >> r10
            r12 = 255(0xff, float:3.57E-43)
            if (r6 != 0) goto L_0x0139
            r7.blockSampleCount = r10
            int[] r6 = r7.blockSampleSizes
            int[] r6 = ensureArrayCapacity(r6, r10)
            r7.blockSampleSizes = r6
            int r13 = r7.blockTrackNumberLength
            int r1 = r1 - r13
            int r1 = r1 - r2
            r6[r9] = r1
            goto L_0x0250
        L_0x0139:
            r13 = 4
            r7.readScratch(r8, r13)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r7.scratch
            byte[] r14 = r14.getData()
            byte r14 = r14[r2]
            r14 = r14 & r12
            int r14 = r14 + r10
            r7.blockSampleCount = r14
            int[] r15 = r7.blockSampleSizes
            int[] r14 = ensureArrayCapacity(r15, r14)
            r7.blockSampleSizes = r14
            if (r6 != r4) goto L_0x015f
            int r2 = r7.blockTrackNumberLength
            int r1 = r1 - r2
            int r1 = r1 - r13
            int r2 = r7.blockSampleCount
            int r1 = r1 / r2
            java.util.Arrays.fill(r14, r9, r2, r1)
            goto L_0x0250
        L_0x015f:
            if (r6 != r10) goto L_0x0198
            r2 = 0
            r6 = 0
        L_0x0163:
            int r14 = r7.blockSampleCount
            int r15 = r14 + -1
            if (r2 >= r15) goto L_0x018c
            int[] r14 = r7.blockSampleSizes
            r14[r2] = r9
        L_0x016d:
            int r13 = r13 + r10
            r7.readScratch(r8, r13)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r7.scratch
            byte[] r14 = r14.getData()
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r7.blockSampleSizes
            r16 = r15[r2]
            int r16 = r16 + r14
            r15[r2] = r16
            if (r14 == r12) goto L_0x016d
            r14 = r15[r2]
            int r6 = r6 + r14
            int r2 = r2 + 1
            goto L_0x0163
        L_0x018c:
            int[] r2 = r7.blockSampleSizes
            int r14 = r14 - r10
            int r15 = r7.blockTrackNumberLength
            int r1 = r1 - r15
            int r1 = r1 - r13
            int r1 = r1 - r6
            r2[r14] = r1
            goto L_0x0250
        L_0x0198:
            if (r6 != r2) goto L_0x028f
            r2 = 0
            r6 = 0
        L_0x019c:
            int r14 = r7.blockSampleCount
            int r15 = r14 + -1
            if (r2 >= r15) goto L_0x0246
            int[] r14 = r7.blockSampleSizes
            r14[r2] = r9
            int r13 = r13 + 1
            r7.readScratch(r8, r13)
            com.google.android.exoplayer2.util.ParsableByteArray r14 = r7.scratch
            byte[] r14 = r14.getData()
            int r15 = r13 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x023e
            r16 = 0
            r14 = 0
        L_0x01ba:
            if (r14 >= r5) goto L_0x020d
            int r18 = 7 - r14
            int r3 = r10 << r18
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.scratch
            byte[] r4 = r4.getData()
            byte r4 = r4[r15]
            r4 = r4 & r3
            if (r4 == 0) goto L_0x0207
            int r13 = r13 + r14
            r7.readScratch(r8, r13)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.scratch
            byte[] r4 = r4.getData()
            int r16 = r15 + 1
            byte r4 = r4[r15]
            r4 = r4 & r12
            int r3 = ~r3
            r3 = r3 & r4
            long r3 = (long) r3
            r19 = r3
            r3 = r16
        L_0x01e1:
            r16 = r19
            if (r3 >= r13) goto L_0x01f9
            long r15 = r16 << r5
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r7.scratch
            byte[] r4 = r4.getData()
            int r17 = r3 + 1
            byte r3 = r4[r3]
            r3 = r3 & r12
            long r3 = (long) r3
            long r3 = r3 | r15
            r19 = r3
            r3 = r17
            goto L_0x01e1
        L_0x01f9:
            if (r2 <= 0) goto L_0x020d
            int r14 = r14 * 7
            int r14 = r14 + 6
            r3 = 1
            long r14 = r3 << r14
            long r14 = r14 - r3
            long r16 = r16 - r14
            goto L_0x020d
        L_0x0207:
            int r14 = r14 + 1
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 2
            goto L_0x01ba
        L_0x020d:
            r3 = r16
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x0236
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0236
            int r4 = (int) r3
            int[] r3 = r7.blockSampleSizes
            if (r2 != 0) goto L_0x0223
            goto L_0x0228
        L_0x0223:
            int r14 = r2 + -1
            r14 = r3[r14]
            int r4 = r4 + r14
        L_0x0228:
            r3[r2] = r4
            int[] r3 = r7.blockSampleSizes
            r3 = r3[r2]
            int r6 = r6 + r3
            int r2 = r2 + 1
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 2
            goto L_0x019c
        L_0x0236:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "EBML lacing sample size out of range."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x023e:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "No valid varint length mask found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0246:
            int[] r2 = r7.blockSampleSizes
            int r14 = r14 - r10
            int r3 = r7.blockTrackNumberLength
            int r1 = r1 - r3
            int r1 = r1 - r13
            int r1 = r1 - r6
            r2[r14] = r1
        L_0x0250:
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.scratch
            byte[] r1 = r1.getData()
            byte r1 = r1[r9]
            int r1 = r1 << r5
            com.google.android.exoplayer2.util.ParsableByteArray r2 = r7.scratch
            byte[] r2 = r2.getData()
            byte r2 = r2[r10]
            r2 = r2 & r12
            r1 = r1 | r2
            long r2 = r7.clusterTimecodeUs
            long r4 = (long) r1
            long r4 = r7.scaleTimecodeToUs(r4)
            long r2 = r2 + r4
            r7.blockTimeUs = r2
            int r1 = r11.type
            r2 = 2
            if (r1 == r2) goto L_0x0286
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0284
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r7.scratch
            byte[] r1 = r1.getData()
            byte r1 = r1[r2]
            r2 = 128(0x80, float:1.794E-43)
            r1 = r1 & r2
            if (r1 != r2) goto L_0x0284
            goto L_0x0286
        L_0x0284:
            r1 = 0
            goto L_0x0287
        L_0x0286:
            r1 = 1
        L_0x0287:
            r7.blockFlags = r1
            r1 = 2
            r7.blockState = r1
            r7.blockSampleIndex = r9
            goto L_0x02a6
        L_0x028f:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected lacing value: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a6:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02d6
        L_0x02aa:
            int r0 = r7.blockSampleIndex
            int r1 = r7.blockSampleCount
            if (r0 >= r1) goto L_0x02d3
            int[] r1 = r7.blockSampleSizes
            r0 = r1[r0]
            int r5 = r7.writeSampleData(r8, r11, r0)
            long r0 = r7.blockTimeUs
            int r2 = r7.blockSampleIndex
            int r3 = r11.defaultSampleDurationNs
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.blockFlags
            r6 = 0
            r0 = r21
            r1 = r11
            r0.commitSampleToOutput(r1, r2, r4, r5, r6)
            int r0 = r7.blockSampleIndex
            int r0 = r0 + r10
            r7.blockSampleIndex = r0
            goto L_0x02aa
        L_0x02d3:
            r7.blockState = r9
            goto L_0x02ec
        L_0x02d6:
            int r0 = r7.blockSampleIndex
            int r1 = r7.blockSampleCount
            if (r0 >= r1) goto L_0x02ec
            int[] r1 = r7.blockSampleSizes
            r2 = r1[r0]
            int r2 = r7.writeSampleData(r8, r11, r2)
            r1[r0] = r2
            int r0 = r7.blockSampleIndex
            int r0 = r0 + r10
            r7.blockSampleIndex = r0
            goto L_0x02d6
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.binaryElement(int, int, com.google.android.exoplayer2.extractor.ExtractorInput):void");
    }

    /* access modifiers changed from: protected */
    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i) throws IOException {
        if (track.blockAddIdType == 1685485123 || track.blockAddIdType == 1685480259) {
            track.dolbyVisionConfigBytes = new byte[i];
            extractorInput.readFully(track.dolbyVisionConfigBytes, 0, i);
            return;
        }
        extractorInput.skipFully(i);
    }

    /* access modifiers changed from: protected */
    public void handleBlockAdditionalData(Track track, int i, ExtractorInput extractorInput, int i2) throws IOException {
        if (i != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i2);
            return;
        }
        this.blockAdditionalData.reset(i2);
        extractorInput.readFully(this.blockAdditionalData.getData(), 0, i2);
    }

    @EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int i) throws ParserException {
        if (this.currentTrack == null) {
            throw new ParserException("Element " + i + " must be in a TrackEntry");
        }
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw new ParserException("Element " + i + " must be in a Cues");
        }
    }

    private Track getCurrentTrack(int i) throws ParserException {
        assertInTrackEntry(i);
        return this.currentTrack;
    }

    @RequiresNonNull({"#1.output"})
    private void commitSampleToOutput(Track track, long j, int i, int i2, int i3) {
        if (track.trueHdSampleRechunker != null) {
            track.trueHdSampleRechunker.sampleMetadata(track, j, i, i2, i3);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.m9247w(TAG, "Skipping subtitle sample in laced block.");
                } else if (this.blockDurationUs == -9223372036854775807L) {
                    Log.m9247w(TAG, "Skipping subtitle sample with no duration.");
                } else {
                    setSubtitleEndTime(track.codecId, this.blockDurationUs, this.subtitleSample.getData());
                    int position = this.subtitleSample.getPosition();
                    while (true) {
                        if (position >= this.subtitleSample.limit()) {
                            break;
                        } else if (this.subtitleSample.getData()[position] == 0) {
                            this.subtitleSample.setLimit(position);
                            break;
                        } else {
                            position++;
                        }
                    }
                    TrackOutput trackOutput = track.output;
                    ParsableByteArray parsableByteArray = this.subtitleSample;
                    trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                    i2 += this.subtitleSample.limit();
                }
            }
            if ((268435456 & i) != 0) {
                if (this.blockSampleCount > 1) {
                    i &= -268435457;
                } else {
                    int limit = this.blockAdditionalData.limit();
                    track.output.sampleData(this.blockAdditionalData, limit, 2);
                    i2 += limit;
                }
            }
            track.output.sampleMetadata(j, i, i2, i3, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private void readScratch(ExtractorInput extractorInput, int i) throws IOException {
        if (this.scratch.limit() < i) {
            if (this.scratch.capacity() < i) {
                ParsableByteArray parsableByteArray = this.scratch;
                parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i));
            }
            extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i - this.scratch.limit());
            this.scratch.setLimit(i);
        }
    }

    @RequiresNonNull({"#2.output"})
    private int writeSampleData(ExtractorInput extractorInput, Track track, int i) throws IOException {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return finishWriteSampleData();
        } else if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return finishWriteSampleData();
        } else {
            TrackOutput trackOutput = track.output;
            boolean z = true;
            if (!this.sampleEncodingHandled) {
                if (track.hasContentEncryption) {
                    this.blockFlags &= -1073741825;
                    int i3 = 128;
                    if (!this.sampleSignalByteRead) {
                        extractorInput.readFully(this.scratch.getData(), 0, 1);
                        this.sampleBytesRead++;
                        if ((this.scratch.getData()[0] & 128) != 128) {
                            this.sampleSignalByte = this.scratch.getData()[0];
                            this.sampleSignalByteRead = true;
                        } else {
                            throw new ParserException("Extension bit is set in signal byte");
                        }
                    }
                    if ((this.sampleSignalByte & 1) == 1) {
                        boolean z2 = (this.sampleSignalByte & 2) == 2;
                        this.blockFlags |= 1073741824;
                        if (!this.sampleInitializationVectorRead) {
                            extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                            this.sampleBytesRead += 8;
                            this.sampleInitializationVectorRead = true;
                            byte[] data = this.scratch.getData();
                            if (!z2) {
                                i3 = 0;
                            }
                            data[0] = (byte) (i3 | 8);
                            this.scratch.setPosition(0);
                            trackOutput.sampleData(this.scratch, 1, 1);
                            this.sampleBytesWritten++;
                            this.encryptionInitializationVector.setPosition(0);
                            trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                            this.sampleBytesWritten += 8;
                        }
                        if (z2) {
                            if (!this.samplePartitionCountRead) {
                                extractorInput.readFully(this.scratch.getData(), 0, 1);
                                this.sampleBytesRead++;
                                this.scratch.setPosition(0);
                                this.samplePartitionCount = this.scratch.readUnsignedByte();
                                this.samplePartitionCountRead = true;
                            }
                            int i4 = this.samplePartitionCount * 4;
                            this.scratch.reset(i4);
                            extractorInput.readFully(this.scratch.getData(), 0, i4);
                            this.sampleBytesRead += i4;
                            short s = (short) ((this.samplePartitionCount / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i5);
                            }
                            this.encryptionSubsampleDataBuffer.position(0);
                            this.encryptionSubsampleDataBuffer.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.samplePartitionCount;
                                if (i6 >= i2) {
                                    break;
                                }
                                int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                                if (i6 % 2 == 0) {
                                    this.encryptionSubsampleDataBuffer.putShort((short) (readUnsignedIntToInt - i7));
                                } else {
                                    this.encryptionSubsampleDataBuffer.putInt(readUnsignedIntToInt - i7);
                                }
                                i6++;
                                i7 = readUnsignedIntToInt;
                            }
                            int i8 = (i - this.sampleBytesRead) - i7;
                            if (i2 % 2 == 1) {
                                this.encryptionSubsampleDataBuffer.putInt(i8);
                            } else {
                                this.encryptionSubsampleDataBuffer.putShort((short) i8);
                                this.encryptionSubsampleDataBuffer.putInt(0);
                            }
                            this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i5);
                            trackOutput.sampleData(this.encryptionSubsampleData, i5, 1);
                            this.sampleBytesWritten += i5;
                        }
                    }
                } else if (track.sampleStrippedBytes != null) {
                    this.sampleStrippedBytes.reset(track.sampleStrippedBytes, track.sampleStrippedBytes.length);
                }
                if (track.maxBlockAdditionId > 0) {
                    this.blockFlags |= 268435456;
                    this.blockAdditionalData.reset(0);
                    this.scratch.reset(4);
                    this.scratch.getData()[0] = (byte) ((i >> 24) & 255);
                    this.scratch.getData()[1] = (byte) ((i >> 16) & 255);
                    this.scratch.getData()[2] = (byte) ((i >> 8) & 255);
                    this.scratch.getData()[3] = (byte) (i & 255);
                    trackOutput.sampleData(this.scratch, 4, 2);
                    this.sampleBytesWritten += 4;
                }
                this.sampleEncodingHandled = true;
            }
            int limit = i + this.sampleStrippedBytes.limit();
            if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
                if (track.trueHdSampleRechunker != null) {
                    if (this.sampleStrippedBytes.limit() != 0) {
                        z = false;
                    }
                    Assertions.checkState(z);
                    track.trueHdSampleRechunker.startSample(extractorInput);
                }
                while (true) {
                    int i9 = this.sampleBytesRead;
                    if (i9 >= limit) {
                        break;
                    }
                    int writeToOutput = writeToOutput(extractorInput, trackOutput, limit - i9);
                    this.sampleBytesRead += writeToOutput;
                    this.sampleBytesWritten += writeToOutput;
                }
            } else {
                byte[] data2 = this.nalLength.getData();
                data2[0] = 0;
                data2[1] = 0;
                data2[2] = 0;
                int i10 = track.nalUnitLengthFieldLength;
                int i11 = 4 - track.nalUnitLengthFieldLength;
                while (this.sampleBytesRead < limit) {
                    int i12 = this.sampleCurrentNalBytesRemaining;
                    if (i12 == 0) {
                        writeToTarget(extractorInput, data2, i11, i10);
                        this.sampleBytesRead += i10;
                        this.nalLength.setPosition(0);
                        this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                        this.nalStartCode.setPosition(0);
                        trackOutput.sampleData(this.nalStartCode, 4);
                        this.sampleBytesWritten += 4;
                    } else {
                        int writeToOutput2 = writeToOutput(extractorInput, trackOutput, i12);
                        this.sampleBytesRead += writeToOutput2;
                        this.sampleBytesWritten += writeToOutput2;
                        this.sampleCurrentNalBytesRemaining -= writeToOutput2;
                    }
                }
            }
            if (CODEC_ID_VORBIS.equals(track.codecId)) {
                this.vorbisNumPageSamples.setPosition(0);
                trackOutput.sampleData(this.vorbisNumPageSamples, 4);
                this.sampleBytesWritten += 4;
            }
            return finishWriteSampleData();
        }
    }

    private int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void setSubtitleEndTime(java.lang.String r4, long r5, byte[] r7) {
        /*
            int r0 = r4.hashCode()
            r1 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = -1
        L_0x0026:
            if (r4 == 0) goto L_0x003b
            if (r4 != r3) goto L_0x0035
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r4 = "%01d:%02d:%02d:%02d"
            byte[] r4 = formatSubtitleTimecode(r5, r4, r0)
            r5 = 21
            goto L_0x0045
        L_0x0035:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L_0x003b:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r4 = "%02d:%02d:%02d,%03d"
            byte[] r4 = formatSubtitleTimecode(r5, r4, r0)
            r5 = 19
        L_0x0045:
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r2, r7, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.setSubtitleEndTime(java.lang.String, long, byte[]):void");
    }

    private static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        Assertions.checkArgument(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, min);
        }
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws IOException {
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i, false);
        }
        int min = Math.min(i, bytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, min);
        return min;
    }

    private SeekMap buildSeekMap(LongArray longArray, LongArray longArray2) {
        int i;
        if (this.segmentContentPosition == -1 || this.durationUs == -9223372036854775807L || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArr = new int[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArr3[i3] = longArray.get(i3);
            jArr[i3] = this.segmentContentPosition + longArray2.get(i3);
        }
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i]);
        jArr2[i] = this.durationUs - jArr3[i];
        long j = jArr2[i];
        if (j <= 0) {
            Log.m9247w(TAG, "Discarding last cue point with unexpected duration: " + j);
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new ChunkIndex(iArr, jArr, jArr2, jArr3);
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1;
                return true;
            }
        }
        return false;
    }

    private long scaleTimecodeToUs(long j) throws ParserException {
        long j2 = this.timecodeScale;
        if (j2 != -9223372036854775807L) {
            return Util.scaleLargeTimestamp(j, j2, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isCodecSupported(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -2095576542: goto L_0x0170;
                case -2095575984: goto L_0x0166;
                case -1985379776: goto L_0x015b;
                case -1784763192: goto L_0x0150;
                case -1730367663: goto L_0x0145;
                case -1482641358: goto L_0x013a;
                case -1482641357: goto L_0x012f;
                case -1373388978: goto L_0x0124;
                case -933872740: goto L_0x0119;
                case -538363189: goto L_0x010e;
                case -538363109: goto L_0x0103;
                case -425012669: goto L_0x00f7;
                case -356037306: goto L_0x00eb;
                case 62923557: goto L_0x00df;
                case 62923603: goto L_0x00d3;
                case 62927045: goto L_0x00c7;
                case 82318131: goto L_0x00bc;
                case 82338133: goto L_0x00b1;
                case 82338134: goto L_0x00a6;
                case 99146302: goto L_0x009a;
                case 444813526: goto L_0x008e;
                case 542569478: goto L_0x0082;
                case 635596514: goto L_0x0076;
                case 725948237: goto L_0x006a;
                case 725957860: goto L_0x005e;
                case 738597099: goto L_0x0052;
                case 855502857: goto L_0x0046;
                case 1422270023: goto L_0x003a;
                case 1809237540: goto L_0x002f;
                case 1950749482: goto L_0x0023;
                case 1950789798: goto L_0x0017;
                case 1951062397: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x017a
        L_0x000b:
            java.lang.String r0 = "A_OPUS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 11
            goto L_0x017b
        L_0x0017:
            java.lang.String r0 = "A_FLAC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 22
            goto L_0x017b
        L_0x0023:
            java.lang.String r0 = "A_EAC3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 17
            goto L_0x017b
        L_0x002f:
            java.lang.String r0 = "V_MPEG2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 3
            goto L_0x017b
        L_0x003a:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 27
            goto L_0x017b
        L_0x0046:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 8
            goto L_0x017b
        L_0x0052:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 28
            goto L_0x017b
        L_0x005e:
            java.lang.String r0 = "A_PCM/INT/LIT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 24
            goto L_0x017b
        L_0x006a:
            java.lang.String r0 = "A_PCM/INT/BIG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 25
            goto L_0x017b
        L_0x0076:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 26
            goto L_0x017b
        L_0x0082:
            java.lang.String r0 = "A_DTS/EXPRESS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 20
            goto L_0x017b
        L_0x008e:
            java.lang.String r0 = "V_THEORA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 10
            goto L_0x017b
        L_0x009a:
            java.lang.String r0 = "S_HDMV/PGS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 30
            goto L_0x017b
        L_0x00a6:
            java.lang.String r0 = "V_VP9"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 1
            goto L_0x017b
        L_0x00b1:
            java.lang.String r0 = "V_VP8"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 0
            goto L_0x017b
        L_0x00bc:
            java.lang.String r0 = "V_AV1"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 2
            goto L_0x017b
        L_0x00c7:
            java.lang.String r0 = "A_DTS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 19
            goto L_0x017b
        L_0x00d3:
            java.lang.String r0 = "A_AC3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 16
            goto L_0x017b
        L_0x00df:
            java.lang.String r0 = "A_AAC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 13
            goto L_0x017b
        L_0x00eb:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 21
            goto L_0x017b
        L_0x00f7:
            java.lang.String r0 = "S_VOBSUB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 29
            goto L_0x017b
        L_0x0103:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 7
            goto L_0x017b
        L_0x010e:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 5
            goto L_0x017b
        L_0x0119:
            java.lang.String r0 = "S_DVBSUB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 31
            goto L_0x017b
        L_0x0124:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 9
            goto L_0x017b
        L_0x012f:
            java.lang.String r0 = "A_MPEG/L3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 15
            goto L_0x017b
        L_0x013a:
            java.lang.String r0 = "A_MPEG/L2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 14
            goto L_0x017b
        L_0x0145:
            java.lang.String r0 = "A_VORBIS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 12
            goto L_0x017b
        L_0x0150:
            java.lang.String r0 = "A_TRUEHD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 18
            goto L_0x017b
        L_0x015b:
            java.lang.String r0 = "A_MS/ACM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 23
            goto L_0x017b
        L_0x0166:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 4
            goto L_0x017b
        L_0x0170:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 6
            goto L_0x017b
        L_0x017a:
            r3 = -1
        L_0x017b:
            switch(r3) {
                case 0: goto L_0x017f;
                case 1: goto L_0x017f;
                case 2: goto L_0x017f;
                case 3: goto L_0x017f;
                case 4: goto L_0x017f;
                case 5: goto L_0x017f;
                case 6: goto L_0x017f;
                case 7: goto L_0x017f;
                case 8: goto L_0x017f;
                case 9: goto L_0x017f;
                case 10: goto L_0x017f;
                case 11: goto L_0x017f;
                case 12: goto L_0x017f;
                case 13: goto L_0x017f;
                case 14: goto L_0x017f;
                case 15: goto L_0x017f;
                case 16: goto L_0x017f;
                case 17: goto L_0x017f;
                case 18: goto L_0x017f;
                case 19: goto L_0x017f;
                case 20: goto L_0x017f;
                case 21: goto L_0x017f;
                case 22: goto L_0x017f;
                case 23: goto L_0x017f;
                case 24: goto L_0x017f;
                case 25: goto L_0x017f;
                case 26: goto L_0x017f;
                case 27: goto L_0x017f;
                case 28: goto L_0x017f;
                case 29: goto L_0x017f;
                case 30: goto L_0x017f;
                case 31: goto L_0x017f;
                default: goto L_0x017e;
            }
        L_0x017e:
            return r1
        L_0x017f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.isCodecSupported(java.lang.String):boolean");
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    @EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    private final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        public int getElementType(int i) {
            return MatroskaExtractor.this.getElementType(i);
        }

        public boolean isLevel1Element(int i) {
            return MatroskaExtractor.this.isLevel1Element(i);
        }

        public void startMasterElement(int i, long j, long j2) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        public void endMasterElement(int i) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i);
        }

        public void integerElement(int i, long j) throws ParserException {
            MatroskaExtractor.this.integerElement(i, j);
        }

        public void floatElement(int i, double d) throws ParserException {
            MatroskaExtractor.this.floatElement(i, d);
        }

        public void stringElement(int i, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i, str);
        }

        public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }
    }

    private static final class TrueHdSampleRechunker {
        private int chunkFlags;
        private int chunkOffset;
        private int chunkSampleCount;
        private int chunkSize;
        private long chunkTimeUs;
        private boolean foundSyncframe;
        private final byte[] syncframePrefix = new byte[10];

        public void reset() {
            this.foundSyncframe = false;
            this.chunkSampleCount = 0;
        }

        public void startSample(ExtractorInput extractorInput) throws IOException {
            if (!this.foundSyncframe) {
                extractorInput.peekFully(this.syncframePrefix, 0, 10);
                extractorInput.resetPeekPosition();
                if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) != 0) {
                    this.foundSyncframe = true;
                }
            }
        }

        @RequiresNonNull({"#1.output"})
        public void sampleMetadata(Track track, long j, int i, int i2, int i3) {
            if (this.foundSyncframe) {
                int i4 = this.chunkSampleCount;
                this.chunkSampleCount = i4 + 1;
                if (i4 == 0) {
                    this.chunkTimeUs = j;
                    this.chunkFlags = i;
                    this.chunkSize = 0;
                }
                this.chunkSize += i2;
                this.chunkOffset = i3;
                if (this.chunkSampleCount >= 16) {
                    outputPendingSampleMetadata(track);
                }
            }
        }

        @RequiresNonNull({"#1.output"})
        public void outputPendingSampleMetadata(Track track) {
            if (this.chunkSampleCount > 0) {
                track.output.sampleMetadata(this.chunkTimeUs, this.chunkFlags, this.chunkSize, this.chunkOffset, track.cryptoData);
                this.chunkSampleCount = 0;
            }
        }
    }

    private static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        public int audioBitDepth;
        /* access modifiers changed from: private */
        public int blockAddIdType;
        public int channelCount;
        public long codecDelayNs;
        public String codecId;
        public byte[] codecPrivate;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public int displayHeight;
        public int displayUnit;
        public int displayWidth;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagDefault;
        public boolean flagForced;
        public boolean hasColorInfo;
        public boolean hasContentEncryption;
        public int height;
        /* access modifiers changed from: private */
        public String language;
        public int maxBlockAdditionId;
        public int maxContentLuminance;
        public int maxFrameAverageLuminance;
        public float maxMasteringLuminance;
        public float minMasteringLuminance;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public float primaryBChromaticityX;
        public float primaryBChromaticityY;
        public float primaryGChromaticityX;
        public float primaryGChromaticityY;
        public float primaryRChromaticityX;
        public float primaryRChromaticityY;
        public byte[] projectionData;
        public float projectionPosePitch;
        public float projectionPoseRoll;
        public float projectionPoseYaw;
        public int projectionType;
        public int sampleRate;
        public byte[] sampleStrippedBytes;
        public long seekPreRollNs;
        public int stereoMode;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public float whitePointChromaticityX;
        public float whitePointChromaticityY;
        public int width;

        private Track() {
            this.width = -1;
            this.height = -1;
            this.displayWidth = -1;
            this.displayHeight = -1;
            this.displayUnit = 0;
            this.projectionType = -1;
            this.projectionPoseYaw = 0.0f;
            this.projectionPosePitch = 0.0f;
            this.projectionPoseRoll = 0.0f;
            this.projectionData = null;
            this.stereoMode = -1;
            this.hasColorInfo = false;
            this.colorSpace = -1;
            this.colorTransfer = -1;
            this.colorRange = -1;
            this.maxContentLuminance = 1000;
            this.maxFrameAverageLuminance = 200;
            this.primaryRChromaticityX = -1.0f;
            this.primaryRChromaticityY = -1.0f;
            this.primaryGChromaticityX = -1.0f;
            this.primaryGChromaticityY = -1.0f;
            this.primaryBChromaticityX = -1.0f;
            this.primaryBChromaticityY = -1.0f;
            this.whitePointChromaticityX = -1.0f;
            this.whitePointChromaticityY = -1.0f;
            this.maxMasteringLuminance = -1.0f;
            this.minMasteringLuminance = -1.0f;
            this.channelCount = 1;
            this.audioBitDepth = -1;
            this.sampleRate = 8000;
            this.codecDelayNs = 0;
            this.seekPreRollNs = 0;
            this.flagDefault = true;
            this.language = "eng";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v17, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0257, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02a6, code lost:
            r16 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d8, code lost:
            r1 = null;
            r3 = null;
            r6 = -1;
            r15 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x034d, code lost:
            r3 = null;
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x036f, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x03a5, code lost:
            r6 = -1;
            r15 = -1;
            r18 = r3;
            r3 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c6, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x03c9, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ca, code lost:
            r15 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x03cb, code lost:
            r4 = r0.dolbyVisionConfigBytes;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x03cd, code lost:
            if (r4 == null) goto L_0x03de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x03cf, code lost:
            r4 = com.google.android.exoplayer2.video.DolbyVisionConfig.parse(new com.google.android.exoplayer2.util.ParsableByteArray(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x03d8, code lost:
            if (r4 == null) goto L_0x03de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x03da, code lost:
            r3 = r4.codecs;
            r16 = com.google.android.exoplayer2.util.MimeTypes.VIDEO_DOLBY_VISION;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x03de, code lost:
            r4 = r16;
            r5 = r0.flagDefault | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x03e5, code lost:
            if (r0.flagForced == false) goto L_0x03e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x03e7, code lost:
            r7 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e9, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x03ea, code lost:
            r5 = r5 | r7;
            r7 = new com.google.android.exoplayer2.Format.Builder();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x03f4, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.isAudio(r4) == false) goto L_0x0408;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x03f6, code lost:
            r7.setChannelCount(r0.channelCount).setSampleRate(r0.sampleRate).setPcmEncoding(r6);
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x040c, code lost:
            if (com.google.android.exoplayer2.util.MimeTypes.isVideo(r4) == false) goto L_0x04e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0410, code lost:
            if (r0.displayUnit != 0) goto L_0x0422;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x0412, code lost:
            r2 = r0.displayWidth;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0414, code lost:
            if (r2 != -1) goto L_0x0418;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x0416, code lost:
            r2 = r0.width;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x0418, code lost:
            r0.displayWidth = r2;
            r2 = r0.displayHeight;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x041c, code lost:
            if (r2 != -1) goto L_0x0420;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x041e, code lost:
            r2 = r0.height;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0420, code lost:
            r0.displayHeight = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x0422, code lost:
            r2 = -1.0f;
            r6 = r0.displayWidth;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0426, code lost:
            if (r6 == -1) goto L_0x0437;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0428, code lost:
            r8 = r0.displayHeight;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x042a, code lost:
            if (r8 == -1) goto L_0x0437;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x042c, code lost:
            r2 = ((float) (r0.height * r6)) / ((float) (r0.width * r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x0439, code lost:
            if (r0.hasColorInfo == false) goto L_0x044b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x043b, code lost:
            r8 = new com.google.android.exoplayer2.video.ColorInfo(r0.colorSpace, r0.colorRange, r0.colorTransfer, getHdrStaticInfo());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x044b, code lost:
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x044f, code lost:
            if (r0.name == null) goto L_0x046d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x045b, code lost:
            if (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600().containsKey(r0.name) == false) goto L_0x046d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x045d, code lost:
            r10 = ((java.lang.Integer) com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600().get(r0.name)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x046f, code lost:
            if (r0.projectionType != 0) goto L_0x04bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0478, code lost:
            if (java.lang.Float.compare(r0.projectionPoseYaw, 0.0f) != 0) goto L_0x04bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0480, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, 0.0f) != 0) goto L_0x04bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0488, code lost:
            if (java.lang.Float.compare(r0.projectionPoseRoll, 0.0f) != 0) goto L_0x048b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x0493, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, 90.0f) != 0) goto L_0x0498;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0495, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x04a0, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, -180.0f) == 0) goto L_0x04ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x04aa, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, 180.0f) != 0) goto L_0x04ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x04b5, code lost:
            if (java.lang.Float.compare(r0.projectionPosePitch, -90.0f) != 0) goto L_0x04bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04b7, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x04ba, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x04bd, code lost:
            r9 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x04be, code lost:
            r7.setWidth(r0.width).setHeight(r0.height).setPixelWidthHeightRatio(r2).setRotationDegrees(r9).setProjectionData(r0.projectionData).setStereoMode(r0.stereoMode).setColorInfo(r8);
            r8 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x04e7, code lost:
            if ("application/x-subrip".equals(r4) != false) goto L_0x050a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ed, code lost:
            if ("text/x-ssa".equals(r4) != false) goto L_0x050a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x04f3, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x050a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x04f9, code lost:
            if ("application/pgs".equals(r4) != false) goto L_0x050a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x04ff, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x0502;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x0509, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x050c, code lost:
            if (r0.name == null) goto L_0x051f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x0518, code lost:
            if (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.access$600().containsKey(r0.name) != false) goto L_0x051f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x051a, code lost:
            r7.setLabel(r0.name);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x051f, code lost:
            r1 = r7.setId(r21).setSampleMimeType(r4).setMaxInputSize(r15).setLanguage(r0.language).setSelectionFlags(r5).setInitializationData(r1).setCodecs(r3).setDrmInitData(r0.drmInitData).build();
            r2 = r20.track(r0.number, r8);
            r0.output = r2;
            r2.format(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x0556, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void initializeOutput(com.google.android.exoplayer2.extractor.ExtractorOutput r20, int r21) throws com.google.android.exoplayer2.ParserException {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = r0.codecId
                int r2 = r1.hashCode()
                r4 = 16
                r6 = 4
                r7 = 8
                r8 = 3
                r9 = 0
                r10 = -1
                switch(r2) {
                    case -2095576542: goto L_0x017a;
                    case -2095575984: goto L_0x0170;
                    case -1985379776: goto L_0x0165;
                    case -1784763192: goto L_0x015a;
                    case -1730367663: goto L_0x014f;
                    case -1482641358: goto L_0x0144;
                    case -1482641357: goto L_0x0139;
                    case -1373388978: goto L_0x012e;
                    case -933872740: goto L_0x0123;
                    case -538363189: goto L_0x0118;
                    case -538363109: goto L_0x010d;
                    case -425012669: goto L_0x0101;
                    case -356037306: goto L_0x00f5;
                    case 62923557: goto L_0x00e9;
                    case 62923603: goto L_0x00dd;
                    case 62927045: goto L_0x00d1;
                    case 82318131: goto L_0x00c6;
                    case 82338133: goto L_0x00bb;
                    case 82338134: goto L_0x00b0;
                    case 99146302: goto L_0x00a4;
                    case 444813526: goto L_0x0098;
                    case 542569478: goto L_0x008c;
                    case 635596514: goto L_0x0080;
                    case 725948237: goto L_0x0074;
                    case 725957860: goto L_0x0068;
                    case 738597099: goto L_0x005c;
                    case 855502857: goto L_0x0050;
                    case 1422270023: goto L_0x0044;
                    case 1809237540: goto L_0x0039;
                    case 1950749482: goto L_0x002d;
                    case 1950789798: goto L_0x0021;
                    case 1951062397: goto L_0x0015;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0184
            L_0x0015:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 12
                goto L_0x0185
            L_0x0021:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 22
                goto L_0x0185
            L_0x002d:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 17
                goto L_0x0185
            L_0x0039:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 3
                goto L_0x0185
            L_0x0044:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 27
                goto L_0x0185
            L_0x0050:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 8
                goto L_0x0185
            L_0x005c:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 28
                goto L_0x0185
            L_0x0068:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 24
                goto L_0x0185
            L_0x0074:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 25
                goto L_0x0185
            L_0x0080:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 26
                goto L_0x0185
            L_0x008c:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 20
                goto L_0x0185
            L_0x0098:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 10
                goto L_0x0185
            L_0x00a4:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 30
                goto L_0x0185
            L_0x00b0:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 1
                goto L_0x0185
            L_0x00bb:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 0
                goto L_0x0185
            L_0x00c6:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 2
                goto L_0x0185
            L_0x00d1:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 19
                goto L_0x0185
            L_0x00dd:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 16
                goto L_0x0185
            L_0x00e9:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 13
                goto L_0x0185
            L_0x00f5:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 21
                goto L_0x0185
            L_0x0101:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 29
                goto L_0x0185
            L_0x010d:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 7
                goto L_0x0185
            L_0x0118:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 5
                goto L_0x0185
            L_0x0123:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 31
                goto L_0x0185
            L_0x012e:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 9
                goto L_0x0185
            L_0x0139:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 15
                goto L_0x0185
            L_0x0144:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 14
                goto L_0x0185
            L_0x014f:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 11
                goto L_0x0185
            L_0x015a:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 18
                goto L_0x0185
            L_0x0165:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 23
                goto L_0x0185
            L_0x0170:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 4
                goto L_0x0185
            L_0x017a:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0184
                r1 = 6
                goto L_0x0185
            L_0x0184:
                r1 = -1
            L_0x0185:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r11 = "application/pgs"
                java.lang.String r12 = "application/vobsub"
                java.lang.String r13 = "text/x-ssa"
                java.lang.String r14 = "application/x-subrip"
                java.lang.String r3 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                r17 = 0
                java.lang.String r5 = "MatroskaExtractor"
                java.lang.String r15 = "audio/x-unknown"
                switch(r1) {
                    case 0: goto L_0x03c4;
                    case 1: goto L_0x03c1;
                    case 2: goto L_0x03be;
                    case 3: goto L_0x03bb;
                    case 4: goto L_0x03ad;
                    case 5: goto L_0x03ad;
                    case 6: goto L_0x03ad;
                    case 7: goto L_0x038c;
                    case 8: goto L_0x0372;
                    case 9: goto L_0x0356;
                    case 10: goto L_0x0352;
                    case 11: goto L_0x033f;
                    case 12: goto L_0x02fe;
                    case 13: goto L_0x02e0;
                    case 14: goto L_0x02d6;
                    case 15: goto L_0x02d3;
                    case 16: goto L_0x02cf;
                    case 17: goto L_0x02cb;
                    case 18: goto L_0x02c0;
                    case 19: goto L_0x02bc;
                    case 20: goto L_0x02bc;
                    case 21: goto L_0x02b8;
                    case 22: goto L_0x02aa;
                    case 23: goto L_0x025c;
                    case 24: goto L_0x0232;
                    case 25: goto L_0x0205;
                    case 26: goto L_0x01df;
                    case 27: goto L_0x01db;
                    case 28: goto L_0x01c9;
                    case 29: goto L_0x01bb;
                    case 30: goto L_0x01b7;
                    case 31: goto L_0x01a4;
                    default: goto L_0x019c;
                }
            L_0x019c:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x01a4:
                byte[] r1 = new byte[r6]
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                java.lang.System.arraycopy(r3, r9, r1, r9, r6)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m9347of(r1)
                r16 = r2
                goto L_0x036f
            L_0x01b7:
                r16 = r11
                goto L_0x03c6
            L_0x01bb:
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m9347of(r1)
                r16 = r12
                goto L_0x036f
            L_0x01c9:
                byte[] r1 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.SSA_DIALOGUE_FORMAT
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m9348of(r1, r3)
                r16 = r13
                goto L_0x036f
            L_0x01db:
                r16 = r14
                goto L_0x03c6
            L_0x01df:
                int r1 = r0.audioBitDepth
                r4 = 32
                if (r1 != r4) goto L_0x01e7
                goto L_0x0257
            L_0x01e7:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported floating point PCM bit depth: "
                r1.append(r4)
                int r4 = r0.audioBitDepth
                r1.append(r4)
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.m9247w(r5, r1)
                goto L_0x02a6
            L_0x0205:
                int r1 = r0.audioBitDepth
                if (r1 != r7) goto L_0x020f
                r1 = r17
                r3 = r1
                r6 = 3
                goto L_0x03ca
            L_0x020f:
                if (r1 != r4) goto L_0x0214
                r6 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x0257
            L_0x0214:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported big endian PCM bit depth: "
                r1.append(r4)
                int r4 = r0.audioBitDepth
                r1.append(r4)
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.m9247w(r5, r1)
                goto L_0x02a6
            L_0x0232:
                int r1 = r0.audioBitDepth
                int r6 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r1)
                if (r6 != 0) goto L_0x0257
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported little endian PCM bit depth: "
                r1.append(r4)
                int r4 = r0.audioBitDepth
                r1.append(r4)
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.m9247w(r5, r1)
                goto L_0x02a6
            L_0x0257:
                r1 = r17
                r3 = r1
                goto L_0x03ca
            L_0x025c:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r4 = r0.codecId
                byte[] r4 = r0.getCodecPrivate(r4)
                r1.<init>((byte[]) r4)
                boolean r1 = parseMsAcmCodecPrivate(r1)
                if (r1 == 0) goto L_0x0292
                int r1 = r0.audioBitDepth
                int r6 = com.google.android.exoplayer2.util.Util.getPcmEncoding(r1)
                if (r6 != 0) goto L_0x0257
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported PCM bit depth: "
                r1.append(r4)
                int r4 = r0.audioBitDepth
                r1.append(r4)
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.m9247w(r5, r1)
                goto L_0x02a6
            L_0x0292:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.google.android.exoplayer2.util.Log.m9247w(r5, r1)
            L_0x02a6:
                r16 = r15
                goto L_0x03c6
            L_0x02aa:
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x036f
            L_0x02b8:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x03c6
            L_0x02bc:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x03c6
            L_0x02c0:
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$TrueHdSampleRechunker r1 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$TrueHdSampleRechunker
                r1.<init>()
                r0.trueHdSampleRechunker = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x03c6
            L_0x02cb:
                java.lang.String r16 = "audio/eac3"
                goto L_0x03c6
            L_0x02cf:
                java.lang.String r16 = "audio/ac3"
                goto L_0x03c6
            L_0x02d3:
                java.lang.String r16 = "audio/mpeg"
                goto L_0x02d8
            L_0x02d6:
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x02d8:
                r1 = r17
                r3 = r1
                r6 = -1
                r15 = 4096(0x1000, float:5.74E-42)
                goto L_0x03cb
            L_0x02e0:
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.codecPrivate
                com.google.android.exoplayer2.audio.AacUtil$Config r3 = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(r3)
                int r4 = r3.sampleRateHz
                r0.sampleRate = r4
                int r4 = r3.channelCount
                r0.channelCount = r4
                java.lang.String r3 = r3.codecs
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x03c9
            L_0x02fe:
                r15 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.codecDelayNs
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.seekPreRollNs
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r16 = "audio/opus"
                goto L_0x034d
            L_0x033f:
                r15 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.codecId
                byte[] r1 = r0.getCodecPrivate(r1)
                java.util.List r1 = parseVorbisCodecPrivate(r1)
                java.lang.String r16 = "audio/vorbis"
            L_0x034d:
                r3 = r17
                r6 = -1
                goto L_0x03cb
            L_0x0352:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x03c6
            L_0x0356:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = parseFourCcPrivate(r1)
                java.lang.Object r3 = r1.first
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x036f:
                r3 = r17
                goto L_0x03c9
            L_0x0372:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.<init>((byte[]) r3)
                com.google.android.exoplayer2.video.HevcConfig r1 = com.google.android.exoplayer2.video.HevcConfig.parse(r1)
                java.util.List<byte[]> r3 = r1.initializationData
                int r4 = r1.nalUnitLengthFieldLength
                r0.nalUnitLengthFieldLength = r4
                java.lang.String r1 = r1.codecs
                java.lang.String r16 = "video/hevc"
                goto L_0x03a5
            L_0x038c:
                com.google.android.exoplayer2.util.ParsableByteArray r1 = new com.google.android.exoplayer2.util.ParsableByteArray
                java.lang.String r3 = r0.codecId
                byte[] r3 = r0.getCodecPrivate(r3)
                r1.<init>((byte[]) r3)
                com.google.android.exoplayer2.video.AvcConfig r1 = com.google.android.exoplayer2.video.AvcConfig.parse(r1)
                java.util.List<byte[]> r3 = r1.initializationData
                int r4 = r1.nalUnitLengthFieldLength
                r0.nalUnitLengthFieldLength = r4
                java.lang.String r1 = r1.codecs
                java.lang.String r16 = "video/avc"
            L_0x03a5:
                r6 = -1
                r15 = -1
                r18 = r3
                r3 = r1
                r1 = r18
                goto L_0x03cb
            L_0x03ad:
                byte[] r1 = r0.codecPrivate
                if (r1 != 0) goto L_0x03b4
                r1 = r17
                goto L_0x03b8
            L_0x03b4:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x03b8:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x036f
            L_0x03bb:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x03c6
            L_0x03be:
                java.lang.String r16 = "video/av01"
                goto L_0x03c6
            L_0x03c1:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x03c6
            L_0x03c4:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x03c6:
                r1 = r17
                r3 = r1
            L_0x03c9:
                r6 = -1
            L_0x03ca:
                r15 = -1
            L_0x03cb:
                byte[] r4 = r0.dolbyVisionConfigBytes
                if (r4 == 0) goto L_0x03de
                com.google.android.exoplayer2.util.ParsableByteArray r5 = new com.google.android.exoplayer2.util.ParsableByteArray
                r5.<init>((byte[]) r4)
                com.google.android.exoplayer2.video.DolbyVisionConfig r4 = com.google.android.exoplayer2.video.DolbyVisionConfig.parse(r5)
                if (r4 == 0) goto L_0x03de
                java.lang.String r3 = r4.codecs
                java.lang.String r16 = "video/dolby-vision"
            L_0x03de:
                r4 = r16
                boolean r5 = r0.flagDefault
                r5 = r5 | r9
                boolean r7 = r0.flagForced
                if (r7 == 0) goto L_0x03e9
                r7 = 2
                goto L_0x03ea
            L_0x03e9:
                r7 = 0
            L_0x03ea:
                r5 = r5 | r7
                com.google.android.exoplayer2.Format$Builder r7 = new com.google.android.exoplayer2.Format$Builder
                r7.<init>()
                boolean r16 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r4)
                if (r16 == 0) goto L_0x0408
                int r2 = r0.channelCount
                com.google.android.exoplayer2.Format$Builder r2 = r7.setChannelCount(r2)
                int r8 = r0.sampleRate
                com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleRate(r8)
                r2.setPcmEncoding(r6)
                r8 = 1
                goto L_0x050a
            L_0x0408:
                boolean r6 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r4)
                if (r6 == 0) goto L_0x04e3
                int r2 = r0.displayUnit
                if (r2 != 0) goto L_0x0422
                int r2 = r0.displayWidth
                if (r2 != r10) goto L_0x0418
                int r2 = r0.width
            L_0x0418:
                r0.displayWidth = r2
                int r2 = r0.displayHeight
                if (r2 != r10) goto L_0x0420
                int r2 = r0.height
            L_0x0420:
                r0.displayHeight = r2
            L_0x0422:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r6 = r0.displayWidth
                if (r6 == r10) goto L_0x0437
                int r8 = r0.displayHeight
                if (r8 == r10) goto L_0x0437
                int r2 = r0.height
                int r2 = r2 * r6
                float r2 = (float) r2
                int r6 = r0.width
                int r6 = r6 * r8
                float r6 = (float) r6
                float r2 = r2 / r6
            L_0x0437:
                boolean r6 = r0.hasColorInfo
                if (r6 == 0) goto L_0x044b
                byte[] r6 = r19.getHdrStaticInfo()
                com.google.android.exoplayer2.video.ColorInfo r8 = new com.google.android.exoplayer2.video.ColorInfo
                int r11 = r0.colorSpace
                int r12 = r0.colorRange
                int r13 = r0.colorTransfer
                r8.<init>(r11, r12, r13, r6)
                goto L_0x044d
            L_0x044b:
                r8 = r17
            L_0x044d:
                java.lang.String r6 = r0.name
                if (r6 == 0) goto L_0x046d
                java.util.Map r6 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES
                java.lang.String r11 = r0.name
                boolean r6 = r6.containsKey(r11)
                if (r6 == 0) goto L_0x046d
                java.util.Map r6 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES
                java.lang.String r10 = r0.name
                java.lang.Object r6 = r6.get(r10)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r10 = r6.intValue()
            L_0x046d:
                int r6 = r0.projectionType
                if (r6 != 0) goto L_0x04bd
                float r6 = r0.projectionPoseYaw
                r11 = 0
                int r6 = java.lang.Float.compare(r6, r11)
                if (r6 != 0) goto L_0x04bd
                float r6 = r0.projectionPosePitch
                int r6 = java.lang.Float.compare(r6, r11)
                if (r6 != 0) goto L_0x04bd
                float r6 = r0.projectionPoseRoll
                int r6 = java.lang.Float.compare(r6, r11)
                if (r6 != 0) goto L_0x048b
                goto L_0x04be
            L_0x048b:
                float r6 = r0.projectionPosePitch
                r9 = 1119092736(0x42b40000, float:90.0)
                int r6 = java.lang.Float.compare(r6, r9)
                if (r6 != 0) goto L_0x0498
                r9 = 90
                goto L_0x04be
            L_0x0498:
                float r6 = r0.projectionPosePitch
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r6 = java.lang.Float.compare(r6, r9)
                if (r6 == 0) goto L_0x04ba
                float r6 = r0.projectionPosePitch
                r9 = 1127481344(0x43340000, float:180.0)
                int r6 = java.lang.Float.compare(r6, r9)
                if (r6 != 0) goto L_0x04ad
                goto L_0x04ba
            L_0x04ad:
                float r6 = r0.projectionPosePitch
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r6 = java.lang.Float.compare(r6, r9)
                if (r6 != 0) goto L_0x04bd
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x04be
            L_0x04ba:
                r9 = 180(0xb4, float:2.52E-43)
                goto L_0x04be
            L_0x04bd:
                r9 = r10
            L_0x04be:
                int r6 = r0.width
                com.google.android.exoplayer2.Format$Builder r6 = r7.setWidth(r6)
                int r10 = r0.height
                com.google.android.exoplayer2.Format$Builder r6 = r6.setHeight(r10)
                com.google.android.exoplayer2.Format$Builder r2 = r6.setPixelWidthHeightRatio(r2)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setRotationDegrees(r9)
                byte[] r6 = r0.projectionData
                com.google.android.exoplayer2.Format$Builder r2 = r2.setProjectionData(r6)
                int r6 = r0.stereoMode
                com.google.android.exoplayer2.Format$Builder r2 = r2.setStereoMode(r6)
                r2.setColorInfo(r8)
                r8 = 2
                goto L_0x050a
            L_0x04e3:
                boolean r6 = r14.equals(r4)
                if (r6 != 0) goto L_0x050a
                boolean r6 = r13.equals(r4)
                if (r6 != 0) goto L_0x050a
                boolean r6 = r12.equals(r4)
                if (r6 != 0) goto L_0x050a
                boolean r6 = r11.equals(r4)
                if (r6 != 0) goto L_0x050a
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0502
                goto L_0x050a
            L_0x0502:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x050a:
                java.lang.String r2 = r0.name
                if (r2 == 0) goto L_0x051f
                java.util.Map r2 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES
                java.lang.String r6 = r0.name
                boolean r2 = r2.containsKey(r6)
                if (r2 != 0) goto L_0x051f
                java.lang.String r2 = r0.name
                r7.setLabel(r2)
            L_0x051f:
                r2 = r21
                com.google.android.exoplayer2.Format$Builder r2 = r7.setId((int) r2)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setSampleMimeType(r4)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setMaxInputSize(r15)
                java.lang.String r4 = r0.language
                com.google.android.exoplayer2.Format$Builder r2 = r2.setLanguage(r4)
                com.google.android.exoplayer2.Format$Builder r2 = r2.setSelectionFlags(r5)
                com.google.android.exoplayer2.Format$Builder r1 = r2.setInitializationData(r1)
                com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r3)
                com.google.android.exoplayer2.drm.DrmInitData r2 = r0.drmInitData
                com.google.android.exoplayer2.Format$Builder r1 = r1.setDrmInitData(r2)
                com.google.android.exoplayer2.Format r1 = r1.build()
                int r2 = r0.number
                r3 = r20
                com.google.android.exoplayer2.extractor.TrackOutput r2 = r3.track(r2, r8)
                r0.output = r2
                r2.format(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track.initializeOutput(com.google.android.exoplayer2.extractor.ExtractorOutput, int):void");
        }

        @RequiresNonNull({"output"})
        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker2 = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker2 != null) {
                trueHdSampleRechunker2.outputPendingSampleMetadata(this);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker2 = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker2 != null) {
                trueHdSampleRechunker2.reset();
            }
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.primaryRChromaticityX * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryRChromaticityY * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryGChromaticityX * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryGChromaticityY * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryBChromaticityX * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.primaryBChromaticityY * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.whitePointChromaticityX * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.whitePointChromaticityY * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.maxMasteringLuminance + 0.5f)));
            order.putShort((short) ((int) (this.minMasteringLuminance + 0.5f)));
            order.putShort((short) this.maxContentLuminance);
            order.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, (Object) null);
                }
                if (readLittleEndianUnsignedInt == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (readLittleEndianUnsignedInt == 826496599) {
                    byte[] data = parsableByteArray.getData();
                    for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                        if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                        }
                    }
                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                }
                Log.m9247w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while ((bArr[i] & 255) == 255) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + (bArr[i] & 255);
                    int i5 = 0;
                    while ((bArr[i3] & 255) == 255) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + (bArr[i3] & 255);
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        throw new ParserException("Error parsing vorbis codec private");
                    }
                    throw new ParserException("Error parsing vorbis codec private");
                }
                throw new ParserException("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort != 65534) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        /* access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw new ParserException("Missing CodecPrivate for codec " + str);
        }
    }
}
