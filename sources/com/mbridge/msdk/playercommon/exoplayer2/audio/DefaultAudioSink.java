package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class DefaultAudioSink implements AudioSink {
    private static final int BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int ERROR_BAD_VALUE = -2;
    private static final long MAX_BUFFER_DURATION_US = 750000;
    private static final long MIN_BUFFER_DURATION_US = 250000;
    private static final int MODE_STATIC = 0;
    private static final int MODE_STREAM = 1;
    private static final long PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int START_IN_SYNC = 1;
    private static final int START_NEED_SYNC = 2;
    private static final int START_NOT_SET = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final String TAG = "AudioTrack";
    private static final int WRITE_NON_BLOCKING = 1;
    public static boolean enablePreV21AudioSessionWorkaround = false;
    public static boolean failOnSpuriousAudioTimestamp = false;
    private AudioProcessor[] activeAudioProcessors;
    private PlaybackParameters afterDrainPlaybackParameters;
    private AudioAttributes audioAttributes;
    private final AudioCapabilities audioCapabilities;
    private final AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private AudioTrack audioTrack;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private ByteBuffer avSyncHeader;
    private int bufferSize;
    private int bytesUntilNextAvSync;
    private boolean canApplyPlaybackParameters;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private int drainingAudioProcessorIndex;
    private final boolean enableConvertHighResIntPcmToFloat;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private ByteBuffer inputBuffer;
    private int inputSampleRate;
    private boolean isInputPcm;
    private AudioTrack keepSessionIdAudioTrack;
    /* access modifiers changed from: private */
    public long lastFeedElapsedRealtimeMs;
    /* access modifiers changed from: private */
    public AudioSink.Listener listener;
    private ByteBuffer outputBuffer;
    private ByteBuffer[] outputBuffers;
    private int outputChannelConfig;
    private int outputEncoding;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private int pcmFrameSize;
    private PlaybackParameters playbackParameters;
    private final ArrayDeque<PlaybackParametersCheckpoint> playbackParametersCheckpoints;
    private long playbackParametersOffsetUs;
    private long playbackParametersPositionUs;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private boolean processingEnabled;
    /* access modifiers changed from: private */
    public final ConditionVariable releasingConditionVariable;
    private boolean shouldConvertHighResIntPcmToFloat;
    private int startMediaTimeState;
    private long startMediaTimeUs;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    public interface AudioProcessorChain {
        PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long j);

        long getSkippedOutputFrameCount();
    }

    private @interface StartMediaTimeState {
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this.audioProcessors = (AudioProcessor[]) Arrays.copyOf(audioProcessorArr, audioProcessorArr.length + 2);
            SonicAudioProcessor sonicAudioProcessor2 = new SonicAudioProcessor();
            this.sonicAudioProcessor = sonicAudioProcessor2;
            AudioProcessor[] audioProcessorArr2 = this.audioProcessors;
            audioProcessorArr2[audioProcessorArr.length] = this.silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor2;
        }

        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.silenceSkippingAudioProcessor.setEnabled(playbackParameters.skipSilence);
            return new PlaybackParameters(this.sonicAudioProcessor.setSpeed(playbackParameters.speed), this.sonicAudioProcessor.setPitch(playbackParameters.pitch), playbackParameters.skipSilence);
        }

        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.scaleDurationForSpeedup(j);
        }

        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities2, AudioProcessor[] audioProcessorArr) {
        this(audioCapabilities2, audioProcessorArr, false);
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities2, AudioProcessor[] audioProcessorArr, boolean z) {
        this(audioCapabilities2, (AudioProcessorChain) new DefaultAudioProcessorChain(audioProcessorArr), z);
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities2, AudioProcessorChain audioProcessorChain2, boolean z) {
        this.audioCapabilities = audioCapabilities2;
        this.audioProcessorChain = (AudioProcessorChain) Assertions.checkNotNull(audioProcessorChain2);
        this.enableConvertHighResIntPcmToFloat = z;
        this.releasingConditionVariable = new ConditionVariable(true);
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener());
        this.channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.trimmingAudioProcessor = new TrimmingAudioProcessor();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new AudioProcessor[]{new ResamplingAudioProcessor(), this.channelMappingAudioProcessor, this.trimmingAudioProcessor});
        Collections.addAll(arrayList, audioProcessorChain2.getAudioProcessors());
        this.toIntPcmAvailableAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[arrayList.size()]);
        this.toFloatPcmAvailableAudioProcessors = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.volume = 1.0f;
        this.startMediaTimeState = 0;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.playbackParameters = PlaybackParameters.DEFAULT;
        this.drainingAudioProcessorIndex = -1;
        this.activeAudioProcessors = new AudioProcessor[0];
        this.outputBuffers = new ByteBuffer[0];
        this.playbackParametersCheckpoints = new ArrayDeque<>();
    }

    public final void setListener(AudioSink.Listener listener2) {
        this.listener = listener2;
    }

    public final boolean isEncodingSupported(int i) {
        if (!Util.isEncodingPcm(i)) {
            AudioCapabilities audioCapabilities2 = this.audioCapabilities;
            if (audioCapabilities2 == null || !audioCapabilities2.supportsEncoding(i)) {
                return false;
            }
            return true;
        } else if (i != 4 || Util.SDK_INT >= 21) {
            return true;
        } else {
            return false;
        }
    }

    public final long getCurrentPositionUs(boolean z) {
        if (!isInitialized() || this.startMediaTimeState == 0) {
            return Long.MIN_VALUE;
        }
        return this.startMediaTimeUs + applySkipping(applySpeedup(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z), framesToDurationUs(getWrittenFrames()))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configure(int r18, int r19, int r20, int r21, int[] r22, int r23, int r24) throws com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.ConfigurationException {
        /*
            r17 = this;
            r1 = r17
            r0 = r21
            r2 = r20
            r1.inputSampleRate = r2
            boolean r3 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.isEncodingPcm(r18)
            r1.isInputPcm = r3
            boolean r3 = r1.enableConvertHighResIntPcmToFloat
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0024
            r3 = 1073741824(0x40000000, float:2.0)
            boolean r3 = r1.isEncodingSupported(r3)
            if (r3 == 0) goto L_0x0024
            boolean r3 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.isEncodingHighResolutionIntegerPcm(r18)
            if (r3 == 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            r1.shouldConvertHighResIntPcmToFloat = r3
            boolean r3 = r1.isInputPcm
            if (r3 == 0) goto L_0x0031
            int r3 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.getPcmFrameSize(r18, r19)
            r1.pcmFrameSize = r3
        L_0x0031:
            boolean r3 = r1.isInputPcm
            r6 = 4
            if (r3 == 0) goto L_0x003c
            r3 = r18
            if (r3 == r6) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003c:
            r3 = r18
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x0047
            boolean r8 = r1.shouldConvertHighResIntPcmToFloat
            if (r8 != 0) goto L_0x0047
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            r1.canApplyPlaybackParameters = r8
            if (r7 == 0) goto L_0x0091
            com.mbridge.msdk.playercommon.exoplayer2.audio.TrimmingAudioProcessor r8 = r1.trimmingAudioProcessor
            r9 = r23
            r10 = r24
            r8.setTrimFrameCount(r9, r10)
            com.mbridge.msdk.playercommon.exoplayer2.audio.ChannelMappingAudioProcessor r8 = r1.channelMappingAudioProcessor
            r9 = r22
            r8.setChannelMap(r9)
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor[] r8 = r17.getAvailableAudioProcessors()
            int r9 = r8.length
            r10 = r2
            r11 = 0
            r12 = 0
            r2 = r19
        L_0x0066:
            if (r11 >= r9) goto L_0x0095
            r13 = r8[r11]
            boolean r14 = r13.configure(r10, r2, r3)     // Catch:{ UnhandledFormatException -> 0x0089 }
            r12 = r12 | r14
            boolean r14 = r13.isActive()
            if (r14 == 0) goto L_0x0086
            int r2 = r13.getOutputChannelCount()
            int r3 = r13.getOutputSampleRateHz()
            int r10 = r13.getOutputEncoding()
            r16 = r10
            r10 = r3
            r3 = r16
        L_0x0086:
            int r11 = r11 + 1
            goto L_0x0066
        L_0x0089:
            r0 = move-exception
            r2 = r0
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink$ConfigurationException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0091:
            r10 = r2
            r12 = 0
            r2 = r19
        L_0x0095:
            r8 = 252(0xfc, float:3.53E-43)
            r9 = 12
            switch(r2) {
                case 1: goto L_0x00c7;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00bc;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00b3;
                default: goto L_0x009c;
            }
        L_0x009c:
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported channel count: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00b3:
            int r6 = com.mbridge.msdk.playercommon.exoplayer2.C6603C.CHANNEL_OUT_7POINT1_SURROUND
            goto L_0x00c7
        L_0x00b6:
            r6 = 1276(0x4fc, float:1.788E-42)
            goto L_0x00c7
        L_0x00b9:
            r6 = 252(0xfc, float:3.53E-43)
            goto L_0x00c7
        L_0x00bc:
            r6 = 220(0xdc, float:3.08E-43)
            goto L_0x00c7
        L_0x00bf:
            r6 = 204(0xcc, float:2.86E-43)
            goto L_0x00c7
        L_0x00c2:
            r6 = 28
            goto L_0x00c7
        L_0x00c5:
            r6 = 12
        L_0x00c7:
            int r11 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.SDK_INT
            r13 = 23
            r14 = 7
            r15 = 5
            if (r11 > r13) goto L_0x00ee
            java.lang.String r11 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.DEVICE
            java.lang.String r13 = "foster"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x00ee
            java.lang.String r11 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r13 = "NVIDIA"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x00ee
            r11 = 3
            if (r2 == r11) goto L_0x00ef
            if (r2 == r15) goto L_0x00ef
            if (r2 == r14) goto L_0x00eb
            goto L_0x00ee
        L_0x00eb:
            int r8 = com.mbridge.msdk.playercommon.exoplayer2.C6603C.CHANNEL_OUT_7POINT1_SURROUND
            goto L_0x00ef
        L_0x00ee:
            r8 = r6
        L_0x00ef:
            int r6 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.SDK_INT
            r11 = 25
            if (r6 > r11) goto L_0x0106
            java.lang.String r6 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.DEVICE
            java.lang.String r11 = "fugu"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x0106
            boolean r6 = r1.isInputPcm
            if (r6 != 0) goto L_0x0106
            if (r2 != r4) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r9 = r8
        L_0x0107:
            if (r12 != 0) goto L_0x011c
            boolean r6 = r17.isInitialized()
            if (r6 == 0) goto L_0x011c
            int r6 = r1.outputEncoding
            if (r6 != r3) goto L_0x011c
            int r6 = r1.outputSampleRate
            if (r6 != r10) goto L_0x011c
            int r6 = r1.outputChannelConfig
            if (r6 != r9) goto L_0x011c
            return
        L_0x011c:
            r17.reset()
            r1.processingEnabled = r7
            r1.outputSampleRate = r10
            r1.outputChannelConfig = r9
            r1.outputEncoding = r3
            boolean r6 = r1.isInputPcm
            if (r6 == 0) goto L_0x0130
            int r2 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.getPcmFrameSize(r3, r2)
            goto L_0x0131
        L_0x0130:
            r2 = -1
        L_0x0131:
            r1.outputPcmFrameSize = r2
            if (r0 == 0) goto L_0x0138
            r1.bufferSize = r0
            goto L_0x018b
        L_0x0138:
            boolean r0 = r1.isInputPcm
            if (r0 == 0) goto L_0x0171
            int r0 = r1.outputEncoding
            int r0 = android.media.AudioTrack.getMinBufferSize(r10, r9, r0)
            r2 = -2
            if (r0 == r2) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r4 = 0
        L_0x0147:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r4)
            int r2 = r0 * 4
            r3 = 250000(0x3d090, double:1.235164E-318)
            long r3 = r1.durationUsToFrames(r3)
            int r4 = (int) r3
            int r3 = r1.outputPcmFrameSize
            int r4 = r4 * r3
            long r5 = (long) r0
            r7 = 750000(0xb71b0, double:3.70549E-318)
            long r7 = r1.durationUsToFrames(r7)
            int r0 = r1.outputPcmFrameSize
            long r9 = (long) r0
            long r7 = r7 * r9
            long r5 = java.lang.Math.max(r5, r7)
            int r0 = (int) r5
            int r0 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.constrainValue((int) r2, (int) r4, (int) r0)
            r1.bufferSize = r0
            goto L_0x018b
        L_0x0171:
            int r0 = r1.outputEncoding
            if (r0 == r15) goto L_0x0187
            r2 = 6
            if (r0 != r2) goto L_0x0179
            goto L_0x0187
        L_0x0179:
            if (r0 != r14) goto L_0x0181
            r0 = 49152(0xc000, float:6.8877E-41)
            r1.bufferSize = r0
            goto L_0x018b
        L_0x0181:
            r0 = 294912(0x48000, float:4.1326E-40)
            r1.bufferSize = r0
            goto L_0x018b
        L_0x0187:
            r0 = 20480(0x5000, float:2.8699E-41)
            r1.bufferSize = r0
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.configure(int, int, int, int, int[], int, int):void");
    }

    private void setupAudioProcessors() {
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : getAvailableAudioProcessors()) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.activeAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.outputBuffers = new ByteBuffer[size];
        flushAudioProcessors();
    }

    private void flushAudioProcessors() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.activeAudioProcessors;
            if (i < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i];
                audioProcessor.flush();
                this.outputBuffers[i] = audioProcessor.getOutput();
                i++;
            } else {
                return;
            }
        }
    }

    private void initialize() throws AudioSink.InitializationException {
        PlaybackParameters playbackParameters2;
        this.releasingConditionVariable.block();
        AudioTrack initializeAudioTrack = initializeAudioTrack();
        this.audioTrack = initializeAudioTrack;
        int audioSessionId2 = initializeAudioTrack.getAudioSessionId();
        if (enablePreV21AudioSessionWorkaround && Util.SDK_INT < 21) {
            AudioTrack audioTrack2 = this.keepSessionIdAudioTrack;
            if (!(audioTrack2 == null || audioSessionId2 == audioTrack2.getAudioSessionId())) {
                releaseKeepSessionIdAudioTrack();
            }
            if (this.keepSessionIdAudioTrack == null) {
                this.keepSessionIdAudioTrack = initializeKeepSessionIdAudioTrack(audioSessionId2);
            }
        }
        if (this.audioSessionId != audioSessionId2) {
            this.audioSessionId = audioSessionId2;
            AudioSink.Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onAudioSessionId(audioSessionId2);
            }
        }
        if (this.canApplyPlaybackParameters) {
            playbackParameters2 = this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters);
        } else {
            playbackParameters2 = PlaybackParameters.DEFAULT;
        }
        this.playbackParameters = playbackParameters2;
        setupAudioProcessors();
        this.audioTrackPositionTracker.setAudioTrack(this.audioTrack, this.outputEncoding, this.outputPcmFrameSize, this.bufferSize);
        setVolumeInternal();
    }

    public final void play() {
        this.playing = true;
        if (isInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    public final void handleDiscontinuity() {
        if (this.startMediaTimeState == 1) {
            this.startMediaTimeState = 2;
        }
    }

    public final boolean handleBuffer(ByteBuffer byteBuffer, long j) throws AudioSink.InitializationException, AudioSink.WriteException {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.inputBuffer;
        Assertions.checkArgument(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!isInitialized()) {
            initialize();
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.isInputPcm && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample2 = getFramesPerEncodedSample(this.outputEncoding, byteBuffer2);
                this.framesPerEncodedSample = framesPerEncodedSample2;
                if (framesPerEncodedSample2 == 0) {
                    return true;
                }
            }
            if (this.afterDrainPlaybackParameters != null) {
                if (!drainAudioProcessorsToEndOfStream()) {
                    return false;
                }
                PlaybackParameters playbackParameters2 = this.afterDrainPlaybackParameters;
                this.afterDrainPlaybackParameters = null;
                this.playbackParametersCheckpoints.add(new PlaybackParametersCheckpoint(this.audioProcessorChain.applyPlaybackParameters(playbackParameters2), Math.max(0, j2), framesToDurationUs(getWrittenFrames())));
                setupAudioProcessors();
            }
            if (this.startMediaTimeState == 0) {
                this.startMediaTimeUs = Math.max(0, j2);
                this.startMediaTimeState = 1;
            } else {
                long inputFramesToDurationUs = this.startMediaTimeUs + inputFramesToDurationUs(getSubmittedFrames());
                if (this.startMediaTimeState == 1 && Math.abs(inputFramesToDurationUs - j2) > 200000) {
                    Log.e(TAG, "Discontinuity detected [expected " + inputFramesToDurationUs + ", got " + j2 + "]");
                    this.startMediaTimeState = 2;
                }
                if (this.startMediaTimeState == 2) {
                    this.startMediaTimeUs += j2 - inputFramesToDurationUs;
                    this.startMediaTimeState = 1;
                    AudioSink.Listener listener2 = this.listener;
                    if (listener2 != null) {
                        listener2.onPositionDiscontinuity();
                    }
                }
            }
            if (this.isInputPcm) {
                this.submittedPcmBytes += (long) byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += (long) this.framesPerEncodedSample;
            }
            this.inputBuffer = byteBuffer2;
        }
        if (this.processingEnabled) {
            processBuffers(j2);
        } else {
            writeBuffer(this.inputBuffer, j2);
        }
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            return true;
        } else if (!this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            return false;
        } else {
            Log.w(TAG, "Resetting stalled audio track");
            reset();
            return true;
        }
    }

    private void processBuffers(long j) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.activeAudioProcessors.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.outputBuffers[i - 1];
            } else {
                byteBuffer = this.inputBuffer;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i == length) {
                writeBuffer(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.activeAudioProcessors[i];
                audioProcessor.queueInput(byteBuffer);
                ByteBuffer output = audioProcessor.getOutput();
                this.outputBuffers[i] = output;
                if (output.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    private void writeBuffer(ByteBuffer byteBuffer, long j) throws AudioSink.WriteException {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.outputBuffer;
            boolean z = true;
            int i = 0;
            if (byteBuffer2 != null) {
                Assertions.checkArgument(byteBuffer2 == byteBuffer);
            } else {
                this.outputBuffer = byteBuffer;
                if (Util.SDK_INT < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.preV21OutputBuffer;
                    if (bArr == null || bArr.length < remaining) {
                        this.preV21OutputBuffer = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.preV21OutputBuffer, 0, remaining);
                    byteBuffer.position(position);
                    this.preV21OutputBufferOffset = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (Util.SDK_INT < 21) {
                int availableBufferSize = this.audioTrackPositionTracker.getAvailableBufferSize(this.writtenPcmBytes);
                if (availableBufferSize > 0 && (i = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, Math.min(remaining2, availableBufferSize))) > 0) {
                    this.preV21OutputBufferOffset += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else if (this.tunneling) {
                if (j == -9223372036854775807L) {
                    z = false;
                }
                Assertions.checkState(z);
                i = writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer, remaining2, j);
            } else {
                i = writeNonBlockingV21(this.audioTrack, byteBuffer, remaining2);
            }
            this.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
            if (i >= 0) {
                if (this.isInputPcm) {
                    this.writtenPcmBytes += (long) i;
                }
                if (i == remaining2) {
                    if (!this.isInputPcm) {
                        this.writtenEncodedFrames += (long) this.framesPerEncodedSample;
                    }
                    this.outputBuffer = null;
                    return;
                }
                return;
            }
            throw new AudioSink.WriteException(i);
        }
    }

    public final void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.handledEndOfStream && isInitialized() && drainAudioProcessorsToEndOfStream()) {
            this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
            this.audioTrack.stop();
            this.bytesUntilNextAvSync = 0;
            this.handledEndOfStream = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean drainAudioProcessorsToEndOfStream() throws com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.drainingAudioProcessorIndex
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.processingEnabled
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x0010
        L_0x000d:
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor[] r0 = r9.activeAudioProcessors
            int r0 = r0.length
        L_0x0010:
            r9.drainingAudioProcessorIndex = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.drainingAudioProcessorIndex
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor[] r5 = r9.activeAudioProcessors
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.queueEndOfStream()
        L_0x0028:
            r9.processBuffers(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.drainingAudioProcessorIndex
            int r0 = r0 + r2
            r9.drainingAudioProcessorIndex = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L_0x0044
            r9.writeBuffer(r0, r7)
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.drainingAudioProcessorIndex = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.drainAudioProcessorsToEndOfStream():boolean");
    }

    public final boolean isEnded() {
        return !isInitialized() || (this.handledEndOfStream && !hasPendingData());
    }

    public final boolean hasPendingData() {
        return isInitialized() && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
    }

    public final PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters2) {
        if (!isInitialized() || this.canApplyPlaybackParameters) {
            PlaybackParameters playbackParameters3 = this.afterDrainPlaybackParameters;
            if (playbackParameters3 == null) {
                if (!this.playbackParametersCheckpoints.isEmpty()) {
                    playbackParameters3 = this.playbackParametersCheckpoints.getLast().playbackParameters;
                } else {
                    playbackParameters3 = this.playbackParameters;
                }
            }
            if (!playbackParameters2.equals(playbackParameters3)) {
                if (isInitialized()) {
                    this.afterDrainPlaybackParameters = playbackParameters2;
                } else {
                    this.playbackParameters = this.audioProcessorChain.applyPlaybackParameters(playbackParameters2);
                }
            }
            return this.playbackParameters;
        }
        PlaybackParameters playbackParameters4 = PlaybackParameters.DEFAULT;
        this.playbackParameters = playbackParameters4;
        return playbackParameters4;
    }

    public final PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    public final void setAudioAttributes(AudioAttributes audioAttributes2) {
        if (!this.audioAttributes.equals(audioAttributes2)) {
            this.audioAttributes = audioAttributes2;
            if (!this.tunneling) {
                reset();
                this.audioSessionId = 0;
            }
        }
    }

    public final void setAudioSessionId(int i) {
        if (this.audioSessionId != i) {
            this.audioSessionId = i;
            reset();
        }
    }

    public final void enableTunnelingV21(int i) {
        Assertions.checkState(Util.SDK_INT >= 21);
        if (!this.tunneling || this.audioSessionId != i) {
            this.tunneling = true;
            this.audioSessionId = i;
            reset();
        }
    }

    public final void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            this.audioSessionId = 0;
            reset();
        }
    }

    public final void setVolume(float f) {
        if (this.volume != f) {
            this.volume = f;
            setVolumeInternal();
        }
    }

    private void setVolumeInternal() {
        if (isInitialized()) {
            if (Util.SDK_INT >= 21) {
                setVolumeInternalV21(this.audioTrack, this.volume);
            } else {
                setVolumeInternalV3(this.audioTrack, this.volume);
            }
        }
    }

    public final void pause() {
        this.playing = false;
        if (isInitialized() && this.audioTrackPositionTracker.pause()) {
            this.audioTrack.pause();
        }
    }

    public final void reset() {
        if (isInitialized()) {
            this.submittedPcmBytes = 0;
            this.submittedEncodedFrames = 0;
            this.writtenPcmBytes = 0;
            this.writtenEncodedFrames = 0;
            this.framesPerEncodedSample = 0;
            PlaybackParameters playbackParameters2 = this.afterDrainPlaybackParameters;
            if (playbackParameters2 != null) {
                this.playbackParameters = playbackParameters2;
                this.afterDrainPlaybackParameters = null;
            } else if (!this.playbackParametersCheckpoints.isEmpty()) {
                this.playbackParameters = this.playbackParametersCheckpoints.getLast().playbackParameters;
            }
            this.playbackParametersCheckpoints.clear();
            this.playbackParametersOffsetUs = 0;
            this.playbackParametersPositionUs = 0;
            this.inputBuffer = null;
            this.outputBuffer = null;
            flushAudioProcessors();
            this.handledEndOfStream = false;
            this.drainingAudioProcessorIndex = -1;
            this.avSyncHeader = null;
            this.bytesUntilNextAvSync = 0;
            this.startMediaTimeState = 0;
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            final AudioTrack audioTrack2 = this.audioTrack;
            this.audioTrack = null;
            this.audioTrackPositionTracker.reset();
            this.releasingConditionVariable.close();
            new Thread() {
                public void run() {
                    try {
                        audioTrack2.flush();
                        audioTrack2.release();
                    } finally {
                        DefaultAudioSink.this.releasingConditionVariable.open();
                    }
                }
            }.start();
        }
    }

    public final void release() {
        reset();
        releaseKeepSessionIdAudioTrack();
        for (AudioProcessor reset : this.toIntPcmAvailableAudioProcessors) {
            reset.reset();
        }
        for (AudioProcessor reset2 : this.toFloatPcmAvailableAudioProcessors) {
            reset2.reset();
        }
        this.audioSessionId = 0;
        this.playing = false;
    }

    private void releaseKeepSessionIdAudioTrack() {
        final AudioTrack audioTrack2 = this.keepSessionIdAudioTrack;
        if (audioTrack2 != null) {
            this.keepSessionIdAudioTrack = null;
            new Thread() {
                public void run() {
                    audioTrack2.release();
                }
            }.start();
        }
    }

    private long applySpeedup(long j) {
        long j2;
        long mediaDurationForPlayoutDuration;
        PlaybackParametersCheckpoint playbackParametersCheckpoint = null;
        while (!this.playbackParametersCheckpoints.isEmpty() && j >= this.playbackParametersCheckpoints.getFirst().positionUs) {
            playbackParametersCheckpoint = this.playbackParametersCheckpoints.remove();
        }
        if (playbackParametersCheckpoint != null) {
            this.playbackParameters = playbackParametersCheckpoint.playbackParameters;
            this.playbackParametersPositionUs = playbackParametersCheckpoint.positionUs;
            this.playbackParametersOffsetUs = playbackParametersCheckpoint.mediaTimeUs - this.startMediaTimeUs;
        }
        if (this.playbackParameters.speed == 1.0f) {
            return (j + this.playbackParametersOffsetUs) - this.playbackParametersPositionUs;
        }
        if (this.playbackParametersCheckpoints.isEmpty()) {
            j2 = this.playbackParametersOffsetUs;
            mediaDurationForPlayoutDuration = this.audioProcessorChain.getMediaDuration(j - this.playbackParametersPositionUs);
        } else {
            j2 = this.playbackParametersOffsetUs;
            mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(j - this.playbackParametersPositionUs, this.playbackParameters.speed);
        }
        return j2 + mediaDurationForPlayoutDuration;
    }

    private long applySkipping(long j) {
        return j + framesToDurationUs(this.audioProcessorChain.getSkippedOutputFrameCount());
    }

    private boolean isInitialized() {
        return this.audioTrack != null;
    }

    private long inputFramesToDurationUs(long j) {
        return (j * 1000000) / ((long) this.inputSampleRate);
    }

    private long framesToDurationUs(long j) {
        return (j * 1000000) / ((long) this.outputSampleRate);
    }

    private long durationUsToFrames(long j) {
        return (j * ((long) this.outputSampleRate)) / 1000000;
    }

    /* access modifiers changed from: private */
    public long getSubmittedFrames() {
        return this.isInputPcm ? this.submittedPcmBytes / ((long) this.pcmFrameSize) : this.submittedEncodedFrames;
    }

    /* access modifiers changed from: private */
    public long getWrittenFrames() {
        return this.isInputPcm ? this.writtenPcmBytes / ((long) this.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private AudioTrack initializeAudioTrack() throws AudioSink.InitializationException {
        AudioTrack audioTrack2;
        if (Util.SDK_INT >= 21) {
            audioTrack2 = createAudioTrackV21();
        } else {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(this.audioAttributes.usage);
            if (this.audioSessionId == 0) {
                audioTrack2 = new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1);
            } else {
                audioTrack2 = new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, this.audioSessionId);
            }
        }
        int state = audioTrack2.getState();
        if (state == 1) {
            return audioTrack2;
        }
        try {
            audioTrack2.release();
        } catch (Exception unused) {
        }
        throw new AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize);
    }

    private AudioTrack createAudioTrackV21() {
        AudioAttributes audioAttributes2;
        if (this.tunneling) {
            audioAttributes2 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributes2 = this.audioAttributes.getAudioAttributesV21();
        }
        AudioAttributes audioAttributes3 = audioAttributes2;
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.outputChannelConfig).setEncoding(this.outputEncoding).setSampleRate(this.outputSampleRate).build();
        int i = this.audioSessionId;
        return new AudioTrack(audioAttributes3, build, this.bufferSize, 1, i != 0 ? i : 0);
    }

    private AudioTrack initializeKeepSessionIdAudioTrack(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    private AudioProcessor[] getAvailableAudioProcessors() {
        if (this.shouldConvertHighResIntPcmToFloat) {
            return this.toFloatPcmAvailableAudioProcessors;
        }
        return this.toIntPcmAvailableAudioProcessors;
    }

    private static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
        }
        if (i == 5) {
            return Ac3Util.getAc3SyncframeAudioSampleCount();
        }
        if (i == 6) {
            return Ac3Util.parseEAc3SyncframeAudioSampleCount(byteBuffer);
        }
        if (i == 14) {
            int findTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
            if (findTrueHdSyncframeOffset == -1) {
                return 0;
            }
            return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, findTrueHdSyncframeOffset) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i);
    }

    private static int writeNonBlockingV21(AudioTrack audioTrack2, ByteBuffer byteBuffer, int i) {
        return audioTrack2.write(byteBuffer, i, 1);
    }

    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack2, ByteBuffer byteBuffer, int i, long j) {
        if (this.avSyncHeader == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.avSyncHeader = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i);
            this.avSyncHeader.putLong(8, j * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i;
        }
        int remaining = this.avSyncHeader.remaining();
        if (remaining > 0) {
            int write = audioTrack2.write(this.avSyncHeader, remaining, 1);
            if (write < 0) {
                this.bytesUntilNextAvSync = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int writeNonBlockingV21 = writeNonBlockingV21(audioTrack2, byteBuffer, i);
        if (writeNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return writeNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= writeNonBlockingV21;
        return writeNonBlockingV21;
    }

    private static void setVolumeInternalV21(AudioTrack audioTrack2, float f) {
        audioTrack2.setVolume(f);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack2, float f) {
        audioTrack2.setStereoVolume(f, f);
    }

    private static final class PlaybackParametersCheckpoint {
        /* access modifiers changed from: private */
        public final long mediaTimeUs;
        /* access modifiers changed from: private */
        public final PlaybackParameters playbackParameters;
        /* access modifiers changed from: private */
        public final long positionUs;

        private PlaybackParametersCheckpoint(PlaybackParameters playbackParameters2, long j, long j2) {
            this.playbackParameters = playbackParameters2;
            this.mediaTimeUs = j;
            this.positionUs = j2;
        }
    }

    private final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        public final void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (!DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                Log.w(DefaultAudioSink.TAG, str);
                return;
            }
            throw new InvalidAudioTrackTimestampException(str);
        }

        public final void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (!DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                Log.w(DefaultAudioSink.TAG, str);
                return;
            }
            throw new InvalidAudioTrackTimestampException(str);
        }

        public final void onInvalidLatency(long j) {
            Log.w(DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j);
        }

        public final void onUnderrun(int i, long j) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }
}
