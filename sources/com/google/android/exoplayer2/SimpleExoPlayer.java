package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.AudioBecomingNoisyManager;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.StreamVolumeManager;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

public class SimpleExoPlayer extends BasePlayer implements ExoPlayer, Player.AudioComponent, Player.VideoComponent, Player.TextComponent, Player.MetadataComponent, Player.DeviceComponent {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    private static final String TAG = "SimpleExoPlayer";
    private static final String WRONG_THREAD_ERROR_MESSAGE = "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
    /* access modifiers changed from: private */
    public final AnalyticsCollector analyticsCollector;
    private final Context applicationContext;
    private AudioAttributes audioAttributes;
    private final AudioBecomingNoisyManager audioBecomingNoisyManager;
    /* access modifiers changed from: private */
    public DecoderCounters audioDecoderCounters;
    private final AudioFocusManager audioFocusManager;
    /* access modifiers changed from: private */
    public Format audioFormat;
    private final CopyOnWriteArraySet<AudioListener> audioListeners;
    private int audioSessionId;
    private float audioVolume;
    private CameraMotionListener cameraMotionListener;
    private final ComponentListener componentListener;
    /* access modifiers changed from: private */
    public List<Cue> currentCues;
    private final long detachSurfaceTimeoutMs;
    /* access modifiers changed from: private */
    public DeviceInfo deviceInfo;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<DeviceListener> deviceListeners;
    private boolean hasNotifiedFullWrongThreadWarning;
    /* access modifiers changed from: private */
    public boolean isPriorityTaskManagerRegistered;
    private AudioTrack keepSessionIdAudioTrack;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<MetadataOutput> metadataOutputs;
    private boolean ownsSurface;
    private final ExoPlayerImpl player;
    private boolean playerReleased;
    /* access modifiers changed from: private */
    public PriorityTaskManager priorityTaskManager;
    protected final Renderer[] renderers;
    /* access modifiers changed from: private */
    public boolean skipSilenceEnabled;
    /* access modifiers changed from: private */
    public final StreamVolumeManager streamVolumeManager;
    /* access modifiers changed from: private */
    public Surface surface;
    private int surfaceHeight;
    private SurfaceHolder surfaceHolder;
    private int surfaceWidth;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<TextOutput> textOutputs;
    private TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    /* access modifiers changed from: private */
    public DecoderCounters videoDecoderCounters;
    /* access modifiers changed from: private */
    public Format videoFormat;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<VideoListener> videoListeners;
    private int videoScalingMode;
    private final WakeLockManager wakeLockManager;
    private final WifiLockManager wifiLockManager;

    /* access modifiers changed from: private */
    public static int getPlayWhenReadyChangeReason(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    public Player.AudioComponent getAudioComponent() {
        return this;
    }

    public Player.DeviceComponent getDeviceComponent() {
        return this;
    }

    public Player.MetadataComponent getMetadataComponent() {
        return this;
    }

    public Player.TextComponent getTextComponent() {
        return this;
    }

    public Player.VideoComponent getVideoComponent() {
        return this;
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public AnalyticsCollector analyticsCollector;
        /* access modifiers changed from: private */
        public AudioAttributes audioAttributes;
        /* access modifiers changed from: private */
        public BandwidthMeter bandwidthMeter;
        private boolean buildCalled;
        /* access modifiers changed from: private */
        public Clock clock;
        /* access modifiers changed from: private */
        public final Context context;
        /* access modifiers changed from: private */
        public long detachSurfaceTimeoutMs;
        /* access modifiers changed from: private */
        public boolean handleAudioBecomingNoisy;
        /* access modifiers changed from: private */
        public boolean handleAudioFocus;
        /* access modifiers changed from: private */
        public LivePlaybackSpeedControl livePlaybackSpeedControl;
        /* access modifiers changed from: private */
        public LoadControl loadControl;
        /* access modifiers changed from: private */
        public Looper looper;
        /* access modifiers changed from: private */
        public MediaSourceFactory mediaSourceFactory;
        /* access modifiers changed from: private */
        public boolean pauseAtEndOfMediaItems;
        /* access modifiers changed from: private */
        public PriorityTaskManager priorityTaskManager;
        /* access modifiers changed from: private */
        public long releaseTimeoutMs;
        /* access modifiers changed from: private */
        public final RenderersFactory renderersFactory;
        /* access modifiers changed from: private */
        public SeekParameters seekParameters;
        /* access modifiers changed from: private */
        public boolean skipSilenceEnabled;
        /* access modifiers changed from: private */
        public TrackSelector trackSelector;
        /* access modifiers changed from: private */
        public boolean useLazyPreparation;
        /* access modifiers changed from: private */
        public int videoScalingMode;
        /* access modifiers changed from: private */
        public int wakeMode;

        public Builder(Context context2) {
            this(context2, new DefaultRenderersFactory(context2), new DefaultExtractorsFactory());
        }

        public Builder(Context context2, RenderersFactory renderersFactory2) {
            this(context2, renderersFactory2, new DefaultExtractorsFactory());
        }

        public Builder(Context context2, ExtractorsFactory extractorsFactory) {
            this(context2, new DefaultRenderersFactory(context2), extractorsFactory);
        }

        public Builder(Context context2, RenderersFactory renderersFactory2, ExtractorsFactory extractorsFactory) {
            this(context2, renderersFactory2, new DefaultTrackSelector(context2), new DefaultMediaSourceFactory(context2, extractorsFactory), new DefaultLoadControl(), DefaultBandwidthMeter.getSingletonInstance(context2), new AnalyticsCollector(Clock.DEFAULT));
        }

        public Builder(Context context2, RenderersFactory renderersFactory2, TrackSelector trackSelector2, MediaSourceFactory mediaSourceFactory2, LoadControl loadControl2, BandwidthMeter bandwidthMeter2, AnalyticsCollector analyticsCollector2) {
            this.context = context2;
            this.renderersFactory = renderersFactory2;
            this.trackSelector = trackSelector2;
            this.mediaSourceFactory = mediaSourceFactory2;
            this.loadControl = loadControl2;
            this.bandwidthMeter = bandwidthMeter2;
            this.analyticsCollector = analyticsCollector2;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500;
            this.detachSurfaceTimeoutMs = 2000;
        }

        public Builder setTrackSelector(TrackSelector trackSelector2) {
            Assertions.checkState(!this.buildCalled);
            this.trackSelector = trackSelector2;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSourceFactory mediaSourceFactory2) {
            Assertions.checkState(!this.buildCalled);
            this.mediaSourceFactory = mediaSourceFactory2;
            return this;
        }

        public Builder setLoadControl(LoadControl loadControl2) {
            Assertions.checkState(!this.buildCalled);
            this.loadControl = loadControl2;
            return this;
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter2) {
            Assertions.checkState(!this.buildCalled);
            this.bandwidthMeter = bandwidthMeter2;
            return this;
        }

        public Builder setLooper(Looper looper2) {
            Assertions.checkState(!this.buildCalled);
            this.looper = looper2;
            return this;
        }

        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector2) {
            Assertions.checkState(!this.buildCalled);
            this.analyticsCollector = analyticsCollector2;
            return this;
        }

        public Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager2) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager2;
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes2, boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = audioAttributes2;
            this.handleAudioFocus = z;
            return this;
        }

        public Builder setWakeMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        public Builder setSkipSilenceEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        public Builder setVideoScalingMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        public Builder setUseLazyPreparation(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters2) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = seekParameters2;
            return this;
        }

        public Builder setReleaseTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        public Builder setDetachSurfaceTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl2) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = livePlaybackSpeedControl2;
            return this;
        }

        public Builder setClock(Clock clock2) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock2;
            return this;
        }

        public SimpleExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }
    }

    @Deprecated
    protected SimpleExoPlayer(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector2, boolean z, Clock clock, Looper looper) {
        this(new Builder(context, renderersFactory).setTrackSelector(trackSelector).setMediaSourceFactory(mediaSourceFactory).setLoadControl(loadControl).setBandwidthMeter(bandwidthMeter).setAnalyticsCollector(analyticsCollector2).setUseLazyPreparation(z).setClock(clock).setLooper(looper));
    }

    protected SimpleExoPlayer(Builder builder) {
        this.applicationContext = builder.context.getApplicationContext();
        this.analyticsCollector = builder.analyticsCollector;
        this.priorityTaskManager = builder.priorityTaskManager;
        this.audioAttributes = builder.audioAttributes;
        this.videoScalingMode = builder.videoScalingMode;
        this.skipSilenceEnabled = builder.skipSilenceEnabled;
        this.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
        this.componentListener = new ComponentListener();
        this.videoListeners = new CopyOnWriteArraySet<>();
        this.audioListeners = new CopyOnWriteArraySet<>();
        this.textOutputs = new CopyOnWriteArraySet<>();
        this.metadataOutputs = new CopyOnWriteArraySet<>();
        this.deviceListeners = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(builder.looper);
        RenderersFactory access$900 = builder.renderersFactory;
        ComponentListener componentListener2 = this.componentListener;
        this.renderers = access$900.createRenderers(handler, componentListener2, componentListener2, componentListener2, componentListener2);
        this.audioVolume = 1.0f;
        if (Util.SDK_INT < 21) {
            this.audioSessionId = initializeKeepSessionIdAudioTrack(0);
        } else {
            this.audioSessionId = C3716C.generateAudioSessionIdV21(this.applicationContext);
        }
        this.currentCues = Collections.emptyList();
        this.throwsWhenUsingWrongThread = true;
        ExoPlayerImpl exoPlayerImpl = r0;
        ExoPlayerImpl exoPlayerImpl2 = new ExoPlayerImpl(this.renderers, builder.trackSelector, builder.mediaSourceFactory, builder.loadControl, builder.bandwidthMeter, this.analyticsCollector, builder.useLazyPreparation, builder.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, builder.pauseAtEndOfMediaItems, builder.clock, builder.looper, this);
        ExoPlayerImpl exoPlayerImpl3 = exoPlayerImpl;
        this.player = exoPlayerImpl3;
        exoPlayerImpl3.addListener(this.componentListener);
        Handler handler2 = handler;
        AudioBecomingNoisyManager audioBecomingNoisyManager2 = new AudioBecomingNoisyManager(builder.context, handler2, this.componentListener);
        this.audioBecomingNoisyManager = audioBecomingNoisyManager2;
        audioBecomingNoisyManager2.setEnabled(builder.handleAudioBecomingNoisy);
        AudioFocusManager audioFocusManager2 = new AudioFocusManager(builder.context, handler2, this.componentListener);
        this.audioFocusManager = audioFocusManager2;
        audioFocusManager2.setAudioAttributes(builder.handleAudioFocus ? this.audioAttributes : null);
        StreamVolumeManager streamVolumeManager2 = new StreamVolumeManager(builder.context, handler2, this.componentListener);
        this.streamVolumeManager = streamVolumeManager2;
        streamVolumeManager2.setStreamType(Util.getStreamTypeForAudioUsage(this.audioAttributes.usage));
        WakeLockManager wakeLockManager2 = new WakeLockManager(builder.context);
        this.wakeLockManager = wakeLockManager2;
        wakeLockManager2.setEnabled(builder.wakeMode != 0);
        WifiLockManager wifiLockManager2 = new WifiLockManager(builder.context);
        this.wifiLockManager = wifiLockManager2;
        wifiLockManager2.setEnabled(builder.wakeMode == 2);
        this.deviceInfo = createDeviceInfo(this.streamVolumeManager);
        sendRendererMessage(1, 102, Integer.valueOf(this.audioSessionId));
        sendRendererMessage(2, 102, Integer.valueOf(this.audioSessionId));
        sendRendererMessage(1, 3, this.audioAttributes);
        sendRendererMessage(2, 4, Integer.valueOf(this.videoScalingMode));
        sendRendererMessage(1, 101, Boolean.valueOf(this.skipSilenceEnabled));
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        verifyApplicationThread();
        this.player.experimentalSetOffloadSchedulingEnabled(z);
    }

    public boolean experimentalIsSleepingForOffload() {
        verifyApplicationThread();
        return this.player.experimentalIsSleepingForOffload();
    }

    public void setVideoScalingMode(int i) {
        verifyApplicationThread();
        this.videoScalingMode = i;
        sendRendererMessage(2, 4, Integer.valueOf(i));
    }

    public int getVideoScalingMode() {
        return this.videoScalingMode;
    }

    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoSurfaceInternal((Surface) null, false);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    public void clearVideoSurface(Surface surface2) {
        verifyApplicationThread();
        if (surface2 != null && surface2 == this.surface) {
            clearVideoSurface();
        }
    }

    public void setVideoSurface(Surface surface2) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        if (surface2 != null) {
            setVideoDecoderOutputBufferRenderer((VideoDecoderOutputBufferRenderer) null);
        }
        int i = 0;
        setVideoSurfaceInternal(surface2, false);
        if (surface2 != null) {
            i = -1;
        }
        maybeNotifySurfaceSizeChanged(i, i);
    }

    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder2) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        if (surfaceHolder2 != null) {
            setVideoDecoderOutputBufferRenderer((VideoDecoderOutputBufferRenderer) null);
        }
        this.surfaceHolder = surfaceHolder2;
        if (surfaceHolder2 == null) {
            setVideoSurfaceInternal((Surface) null, false);
            maybeNotifySurfaceSizeChanged(0, 0);
            return;
        }
        surfaceHolder2.addCallback(this.componentListener);
        Surface surface2 = surfaceHolder2.getSurface();
        if (surface2 == null || !surface2.isValid()) {
            setVideoSurfaceInternal((Surface) null, false);
            maybeNotifySurfaceSizeChanged(0, 0);
            return;
        }
        setVideoSurfaceInternal(surface2, false);
        Rect surfaceFrame = surfaceHolder2.getSurfaceFrame();
        maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
    }

    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder2) {
        verifyApplicationThread();
        if (surfaceHolder2 != null && surfaceHolder2 == this.surfaceHolder) {
            setVideoSurfaceHolder((SurfaceHolder) null);
        }
    }

    public void setVideoSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder2;
        verifyApplicationThread();
        if (surfaceView instanceof VideoDecoderGLSurfaceView) {
            VideoDecoderOutputBufferRenderer videoDecoderOutputBufferRenderer = ((VideoDecoderGLSurfaceView) surfaceView).getVideoDecoderOutputBufferRenderer();
            clearVideoSurface();
            this.surfaceHolder = surfaceView.getHolder();
            setVideoDecoderOutputBufferRenderer(videoDecoderOutputBufferRenderer);
            return;
        }
        if (surfaceView == null) {
            surfaceHolder2 = null;
        } else {
            surfaceHolder2 = surfaceView.getHolder();
        }
        setVideoSurfaceHolder(surfaceHolder2);
    }

    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        SurfaceHolder surfaceHolder2 = null;
        if (!(surfaceView instanceof VideoDecoderGLSurfaceView)) {
            if (surfaceView != null) {
                surfaceHolder2 = surfaceView.getHolder();
            }
            clearVideoSurfaceHolder(surfaceHolder2);
        } else if (surfaceView.getHolder() == this.surfaceHolder) {
            setVideoDecoderOutputBufferRenderer((VideoDecoderOutputBufferRenderer) null);
            this.surfaceHolder = null;
        }
    }

    public void setVideoTextureView(TextureView textureView2) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        if (textureView2 != null) {
            setVideoDecoderOutputBufferRenderer((VideoDecoderOutputBufferRenderer) null);
        }
        this.textureView = textureView2;
        if (textureView2 == null) {
            setVideoSurfaceInternal((Surface) null, true);
            maybeNotifySurfaceSizeChanged(0, 0);
            return;
        }
        if (textureView2.getSurfaceTextureListener() != null) {
            Log.m9247w(TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView2.setSurfaceTextureListener(this.componentListener);
        SurfaceTexture surfaceTexture = textureView2.isAvailable() ? textureView2.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            setVideoSurfaceInternal((Surface) null, true);
            maybeNotifySurfaceSizeChanged(0, 0);
            return;
        }
        setVideoSurfaceInternal(new Surface(surfaceTexture), true);
        maybeNotifySurfaceSizeChanged(textureView2.getWidth(), textureView2.getHeight());
    }

    public void clearVideoTextureView(TextureView textureView2) {
        verifyApplicationThread();
        if (textureView2 != null && textureView2 == this.textureView) {
            setVideoTextureView((TextureView) null);
        }
    }

    public void addAudioListener(AudioListener audioListener) {
        Assertions.checkNotNull(audioListener);
        this.audioListeners.add(audioListener);
    }

    public void removeAudioListener(AudioListener audioListener) {
        this.audioListeners.remove(audioListener);
    }

    public void setAudioAttributes(AudioAttributes audioAttributes2, boolean z) {
        verifyApplicationThread();
        if (!this.playerReleased) {
            if (!Util.areEqual(this.audioAttributes, audioAttributes2)) {
                this.audioAttributes = audioAttributes2;
                sendRendererMessage(1, 3, audioAttributes2);
                this.streamVolumeManager.setStreamType(Util.getStreamTypeForAudioUsage(audioAttributes2.usage));
                this.analyticsCollector.onAudioAttributesChanged(audioAttributes2);
                Iterator<AudioListener> it = this.audioListeners.iterator();
                while (it.hasNext()) {
                    it.next().onAudioAttributesChanged(audioAttributes2);
                }
            }
            AudioFocusManager audioFocusManager2 = this.audioFocusManager;
            if (!z) {
                audioAttributes2 = null;
            }
            audioFocusManager2.setAudioAttributes(audioAttributes2);
            boolean playWhenReady = getPlayWhenReady();
            int updateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, getPlaybackState());
            updatePlayWhenReady(playWhenReady, updateAudioFocus, getPlayWhenReadyChangeReason(playWhenReady, updateAudioFocus));
        }
    }

    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    public void setAudioSessionId(int i) {
        verifyApplicationThread();
        if (this.audioSessionId != i) {
            if (i == 0) {
                if (Util.SDK_INT < 21) {
                    i = initializeKeepSessionIdAudioTrack(0);
                } else {
                    i = C3716C.generateAudioSessionIdV21(this.applicationContext);
                }
            } else if (Util.SDK_INT < 21) {
                initializeKeepSessionIdAudioTrack(i);
            }
            this.audioSessionId = i;
            sendRendererMessage(1, 102, Integer.valueOf(i));
            sendRendererMessage(2, 102, Integer.valueOf(i));
            this.analyticsCollector.onAudioSessionIdChanged(i);
            Iterator<AudioListener> it = this.audioListeners.iterator();
            while (it.hasNext()) {
                it.next().onAudioSessionIdChanged(i);
            }
        }
    }

    public int getAudioSessionId() {
        return this.audioSessionId;
    }

    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 5, auxEffectInfo);
    }

    public void clearAuxEffectInfo() {
        setAuxEffectInfo(new AuxEffectInfo(0, 0.0f));
    }

    public void setVolume(float f) {
        verifyApplicationThread();
        float constrainValue = Util.constrainValue(f, 0.0f, 1.0f);
        if (this.audioVolume != constrainValue) {
            this.audioVolume = constrainValue;
            sendVolumeToRenderers();
            this.analyticsCollector.onVolumeChanged(constrainValue);
            Iterator<AudioListener> it = this.audioListeners.iterator();
            while (it.hasNext()) {
                it.next().onVolumeChanged(constrainValue);
            }
        }
    }

    public float getVolume() {
        return this.audioVolume;
    }

    public boolean getSkipSilenceEnabled() {
        return this.skipSilenceEnabled;
    }

    public void setSkipSilenceEnabled(boolean z) {
        verifyApplicationThread();
        if (this.skipSilenceEnabled != z) {
            this.skipSilenceEnabled = z;
            sendRendererMessage(1, 101, Boolean.valueOf(z));
            notifySkipSilenceEnabledChanged();
        }
    }

    public AnalyticsCollector getAnalyticsCollector() {
        return this.analyticsCollector;
    }

    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        Assertions.checkNotNull(analyticsListener);
        this.analyticsCollector.addListener(analyticsListener);
    }

    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        this.analyticsCollector.removeListener(analyticsListener);
    }

    public void setHandleAudioBecomingNoisy(boolean z) {
        verifyApplicationThread();
        if (!this.playerReleased) {
            this.audioBecomingNoisyManager.setEnabled(z);
        }
    }

    public void setPriorityTaskManager(PriorityTaskManager priorityTaskManager2) {
        verifyApplicationThread();
        if (!Util.areEqual(this.priorityTaskManager, priorityTaskManager2)) {
            if (this.isPriorityTaskManagerRegistered) {
                ((PriorityTaskManager) Assertions.checkNotNull(this.priorityTaskManager)).remove(0);
            }
            if (priorityTaskManager2 == null || !isLoading()) {
                this.isPriorityTaskManagerRegistered = false;
            } else {
                priorityTaskManager2.add(0);
                this.isPriorityTaskManagerRegistered = true;
            }
            this.priorityTaskManager = priorityTaskManager2;
        }
    }

    public Format getVideoFormat() {
        return this.videoFormat;
    }

    public Format getAudioFormat() {
        return this.audioFormat;
    }

    public DecoderCounters getVideoDecoderCounters() {
        return this.videoDecoderCounters;
    }

    public DecoderCounters getAudioDecoderCounters() {
        return this.audioDecoderCounters;
    }

    public void addVideoListener(VideoListener videoListener) {
        Assertions.checkNotNull(videoListener);
        this.videoListeners.add(videoListener);
    }

    public void removeVideoListener(VideoListener videoListener) {
        this.videoListeners.remove(videoListener);
    }

    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener2) {
        verifyApplicationThread();
        this.videoFrameMetadataListener = videoFrameMetadataListener2;
        sendRendererMessage(2, 6, videoFrameMetadataListener2);
    }

    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener2) {
        verifyApplicationThread();
        if (this.videoFrameMetadataListener == videoFrameMetadataListener2) {
            sendRendererMessage(2, 6, (Object) null);
        }
    }

    public void setCameraMotionListener(CameraMotionListener cameraMotionListener2) {
        verifyApplicationThread();
        this.cameraMotionListener = cameraMotionListener2;
        sendRendererMessage(6, 7, cameraMotionListener2);
    }

    public void clearCameraMotionListener(CameraMotionListener cameraMotionListener2) {
        verifyApplicationThread();
        if (this.cameraMotionListener == cameraMotionListener2) {
            sendRendererMessage(6, 7, (Object) null);
        }
    }

    public void addTextOutput(TextOutput textOutput) {
        Assertions.checkNotNull(textOutput);
        this.textOutputs.add(textOutput);
    }

    public void removeTextOutput(TextOutput textOutput) {
        this.textOutputs.remove(textOutput);
    }

    public List<Cue> getCurrentCues() {
        verifyApplicationThread();
        return this.currentCues;
    }

    public void addMetadataOutput(MetadataOutput metadataOutput) {
        Assertions.checkNotNull(metadataOutput);
        this.metadataOutputs.add(metadataOutput);
    }

    public void removeMetadataOutput(MetadataOutput metadataOutput) {
        this.metadataOutputs.remove(metadataOutput);
    }

    public Looper getPlaybackLooper() {
        return this.player.getPlaybackLooper();
    }

    public Looper getApplicationLooper() {
        return this.player.getApplicationLooper();
    }

    public Clock getClock() {
        return this.player.getClock();
    }

    public void addListener(Player.EventListener eventListener) {
        Assertions.checkNotNull(eventListener);
        this.player.addListener(eventListener);
    }

    public void removeListener(Player.EventListener eventListener) {
        this.player.removeListener(eventListener);
    }

    public int getPlaybackState() {
        verifyApplicationThread();
        return this.player.getPlaybackState();
    }

    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.player.getPlaybackSuppressionReason();
    }

    @Deprecated
    public ExoPlaybackException getPlaybackError() {
        return getPlayerError();
    }

    public ExoPlaybackException getPlayerError() {
        verifyApplicationThread();
        return this.player.getPlayerError();
    }

    @Deprecated
    public void retry() {
        verifyApplicationThread();
        prepare();
    }

    public void prepare() {
        verifyApplicationThread();
        boolean playWhenReady = getPlayWhenReady();
        int updateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, 2);
        updatePlayWhenReady(playWhenReady, updateAudioFocus, getPlayWhenReadyChangeReason(playWhenReady, updateAudioFocus));
        this.player.prepare();
    }

    @Deprecated
    public void prepare(MediaSource mediaSource) {
        prepare(mediaSource, true, true);
    }

    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), z ? 0 : -1, -9223372036854775807L);
        prepare();
    }

    public void setMediaItems(List<MediaItem> list) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaItems(list);
    }

    public void setMediaItems(List<MediaItem> list, boolean z) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaItems(list, z);
    }

    public void setMediaItems(List<MediaItem> list, int i, long j) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaItems(list, i, j);
    }

    public void setMediaItem(MediaItem mediaItem) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaItem(mediaItem);
    }

    public void setMediaItem(MediaItem mediaItem, boolean z) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaItem(mediaItem, z);
    }

    public void setMediaItem(MediaItem mediaItem, long j) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaItem(mediaItem, j);
    }

    public void setMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaSources(list);
    }

    public void setMediaSources(List<MediaSource> list, boolean z) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaSources(list, z);
    }

    public void setMediaSources(List<MediaSource> list, int i, long j) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaSources(list, i, j);
    }

    public void setMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaSource(mediaSource);
    }

    public void setMediaSource(MediaSource mediaSource, boolean z) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaSource(mediaSource, z);
    }

    public void setMediaSource(MediaSource mediaSource, long j) {
        verifyApplicationThread();
        this.analyticsCollector.resetForNewPlaylist();
        this.player.setMediaSource(mediaSource, j);
    }

    public void addMediaItems(List<MediaItem> list) {
        verifyApplicationThread();
        this.player.addMediaItems(list);
    }

    public void addMediaItems(int i, List<MediaItem> list) {
        verifyApplicationThread();
        this.player.addMediaItems(i, list);
    }

    public void addMediaItem(MediaItem mediaItem) {
        verifyApplicationThread();
        this.player.addMediaItem(mediaItem);
    }

    public void addMediaItem(int i, MediaItem mediaItem) {
        verifyApplicationThread();
        this.player.addMediaItem(i, mediaItem);
    }

    public void addMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        this.player.addMediaSource(mediaSource);
    }

    public void addMediaSource(int i, MediaSource mediaSource) {
        verifyApplicationThread();
        this.player.addMediaSource(i, mediaSource);
    }

    public void addMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        this.player.addMediaSources(list);
    }

    public void addMediaSources(int i, List<MediaSource> list) {
        verifyApplicationThread();
        this.player.addMediaSources(i, list);
    }

    public void moveMediaItem(int i, int i2) {
        verifyApplicationThread();
        this.player.moveMediaItem(i, i2);
    }

    public void moveMediaItems(int i, int i2, int i3) {
        verifyApplicationThread();
        this.player.moveMediaItems(i, i2, i3);
    }

    public void removeMediaItem(int i) {
        verifyApplicationThread();
        this.player.removeMediaItem(i);
    }

    public void removeMediaItems(int i, int i2) {
        verifyApplicationThread();
        this.player.removeMediaItems(i, i2);
    }

    public void clearMediaItems() {
        verifyApplicationThread();
        this.player.clearMediaItems();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        verifyApplicationThread();
        this.player.setShuffleOrder(shuffleOrder);
    }

    public void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        int updateAudioFocus = this.audioFocusManager.updateAudioFocus(z, getPlaybackState());
        updatePlayWhenReady(z, updateAudioFocus, getPlayWhenReadyChangeReason(z, updateAudioFocus));
    }

    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.player.getPlayWhenReady();
    }

    public void setPauseAtEndOfMediaItems(boolean z) {
        verifyApplicationThread();
        this.player.setPauseAtEndOfMediaItems(z);
    }

    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.player.getPauseAtEndOfMediaItems();
    }

    public int getRepeatMode() {
        verifyApplicationThread();
        return this.player.getRepeatMode();
    }

    public void setRepeatMode(int i) {
        verifyApplicationThread();
        this.player.setRepeatMode(i);
    }

    public void setShuffleModeEnabled(boolean z) {
        verifyApplicationThread();
        this.player.setShuffleModeEnabled(z);
    }

    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.player.getShuffleModeEnabled();
    }

    public boolean isLoading() {
        verifyApplicationThread();
        return this.player.isLoading();
    }

    public void seekTo(int i, long j) {
        verifyApplicationThread();
        this.analyticsCollector.notifySeekStarted();
        this.player.seekTo(i, j);
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        this.player.setPlaybackParameters(playbackParameters);
    }

    public PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return this.player.getPlaybackParameters();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        verifyApplicationThread();
        this.player.setSeekParameters(seekParameters);
    }

    public SeekParameters getSeekParameters() {
        verifyApplicationThread();
        return this.player.getSeekParameters();
    }

    public void setForegroundMode(boolean z) {
        verifyApplicationThread();
        this.player.setForegroundMode(z);
    }

    public void stop(boolean z) {
        verifyApplicationThread();
        this.audioFocusManager.updateAudioFocus(getPlayWhenReady(), 1);
        this.player.stop(z);
        this.currentCues = Collections.emptyList();
    }

    public void release() {
        AudioTrack audioTrack;
        verifyApplicationThread();
        if (Util.SDK_INT < 21 && (audioTrack = this.keepSessionIdAudioTrack) != null) {
            audioTrack.release();
            this.keepSessionIdAudioTrack = null;
        }
        this.audioBecomingNoisyManager.setEnabled(false);
        this.streamVolumeManager.release();
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        this.audioFocusManager.release();
        this.player.release();
        this.analyticsCollector.release();
        removeSurfaceCallbacks();
        Surface surface2 = this.surface;
        if (surface2 != null) {
            if (this.ownsSurface) {
                surface2.release();
            }
            this.surface = null;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.priorityTaskManager)).remove(0);
            this.isPriorityTaskManagerRegistered = false;
        }
        this.currentCues = Collections.emptyList();
        this.playerReleased = true;
    }

    public PlayerMessage createMessage(PlayerMessage.Target target) {
        verifyApplicationThread();
        return this.player.createMessage(target);
    }

    public int getRendererCount() {
        verifyApplicationThread();
        return this.player.getRendererCount();
    }

    public int getRendererType(int i) {
        verifyApplicationThread();
        return this.player.getRendererType(i);
    }

    public TrackSelector getTrackSelector() {
        verifyApplicationThread();
        return this.player.getTrackSelector();
    }

    public TrackGroupArray getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.player.getCurrentTrackGroups();
    }

    public TrackSelectionArray getCurrentTrackSelections() {
        verifyApplicationThread();
        return this.player.getCurrentTrackSelections();
    }

    public List<Metadata> getCurrentStaticMetadata() {
        verifyApplicationThread();
        return this.player.getCurrentStaticMetadata();
    }

    public Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return this.player.getCurrentTimeline();
    }

    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        return this.player.getCurrentPeriodIndex();
    }

    public int getCurrentWindowIndex() {
        verifyApplicationThread();
        return this.player.getCurrentWindowIndex();
    }

    public long getDuration() {
        verifyApplicationThread();
        return this.player.getDuration();
    }

    public long getCurrentPosition() {
        verifyApplicationThread();
        return this.player.getCurrentPosition();
    }

    public long getBufferedPosition() {
        verifyApplicationThread();
        return this.player.getBufferedPosition();
    }

    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return this.player.getTotalBufferedDuration();
    }

    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.player.isPlayingAd();
    }

    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        return this.player.getCurrentAdGroupIndex();
    }

    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        return this.player.getCurrentAdIndexInAdGroup();
    }

    public long getContentPosition() {
        verifyApplicationThread();
        return this.player.getContentPosition();
    }

    public long getContentBufferedPosition() {
        verifyApplicationThread();
        return this.player.getContentBufferedPosition();
    }

    @Deprecated
    public void setHandleWakeLock(boolean z) {
        setWakeMode(z ? 1 : 0);
    }

    public void setWakeMode(int i) {
        verifyApplicationThread();
        if (i == 0) {
            this.wakeLockManager.setEnabled(false);
            this.wifiLockManager.setEnabled(false);
        } else if (i == 1) {
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(false);
        } else if (i == 2) {
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(true);
        }
    }

    public void addDeviceListener(DeviceListener deviceListener) {
        Assertions.checkNotNull(deviceListener);
        this.deviceListeners.add(deviceListener);
    }

    public void removeDeviceListener(DeviceListener deviceListener) {
        this.deviceListeners.remove(deviceListener);
    }

    public DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return this.deviceInfo;
    }

    public int getDeviceVolume() {
        verifyApplicationThread();
        return this.streamVolumeManager.getVolume();
    }

    public boolean isDeviceMuted() {
        verifyApplicationThread();
        return this.streamVolumeManager.isMuted();
    }

    public void setDeviceVolume(int i) {
        verifyApplicationThread();
        this.streamVolumeManager.setVolume(i);
    }

    public void increaseDeviceVolume() {
        verifyApplicationThread();
        this.streamVolumeManager.increaseVolume();
    }

    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        this.streamVolumeManager.decreaseVolume();
    }

    public void setDeviceMuted(boolean z) {
        verifyApplicationThread();
        this.streamVolumeManager.setMuted(z);
    }

    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.throwsWhenUsingWrongThread = z;
    }

    private void removeSurfaceCallbacks() {
        TextureView textureView2 = this.textureView;
        if (textureView2 != null) {
            if (textureView2.getSurfaceTextureListener() != this.componentListener) {
                Log.m9247w(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.textureView = null;
        }
        SurfaceHolder surfaceHolder2 = this.surfaceHolder;
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    /* access modifiers changed from: private */
    public void setVideoSurfaceInternal(Surface surface2, boolean z) {
        ArrayList<PlayerMessage> arrayList = new ArrayList<>();
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 2) {
                arrayList.add(this.player.createMessage(renderer).setType(1).setPayload(surface2).send());
            }
        }
        Surface surface3 = this.surface;
        if (!(surface3 == null || surface3 == surface2)) {
            try {
                for (PlayerMessage blockUntilDelivered : arrayList) {
                    blockUntilDelivered.blockUntilDelivered(this.detachSurfaceTimeoutMs);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.player.stop(false, ExoPlaybackException.createForRenderer(new ExoTimeoutException(3)));
            }
            if (this.ownsSurface) {
                this.surface.release();
            }
        }
        this.surface = surface2;
        this.ownsSurface = z;
    }

    private void setVideoDecoderOutputBufferRenderer(VideoDecoderOutputBufferRenderer videoDecoderOutputBufferRenderer) {
        sendRendererMessage(2, 8, videoDecoderOutputBufferRenderer);
    }

    /* access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(int i, int i2) {
        if (i != this.surfaceWidth || i2 != this.surfaceHeight) {
            this.surfaceWidth = i;
            this.surfaceHeight = i2;
            this.analyticsCollector.onSurfaceSizeChanged(i, i2);
            Iterator<VideoListener> it = this.videoListeners.iterator();
            while (it.hasNext()) {
                it.next().onSurfaceSizeChanged(i, i2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendVolumeToRenderers() {
        sendRendererMessage(1, 2, Float.valueOf(this.audioVolume * this.audioFocusManager.getVolumeMultiplier()));
    }

    /* access modifiers changed from: private */
    public void notifySkipSilenceEnabledChanged() {
        this.analyticsCollector.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        Iterator<AudioListener> it = this.audioListeners.iterator();
        while (it.hasNext()) {
            it.next().onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    /* access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.player.setPlayWhenReady(z2, i3, i2);
    }

    /* access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        boolean z = true;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean experimentalIsSleepingForOffload = experimentalIsSleepingForOffload();
                WakeLockManager wakeLockManager2 = this.wakeLockManager;
                if (!getPlayWhenReady() || experimentalIsSleepingForOffload) {
                    z = false;
                }
                wakeLockManager2.setStayAwake(z);
                this.wifiLockManager.setStayAwake(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() == getApplicationLooper()) {
            return;
        }
        if (!this.throwsWhenUsingWrongThread) {
            Log.m9248w(TAG, WRONG_THREAD_ERROR_MESSAGE, this.hasNotifiedFullWrongThreadWarning ? null : new IllegalStateException());
            this.hasNotifiedFullWrongThreadWarning = true;
            return;
        }
        throw new IllegalStateException(WRONG_THREAD_ERROR_MESSAGE);
    }

    private void sendRendererMessage(int i, int i2, Object obj) {
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == i) {
                this.player.createMessage(renderer).setType(i2).setPayload(obj).send();
            }
        }
    }

    private int initializeKeepSessionIdAudioTrack(int i) {
        AudioTrack audioTrack = this.keepSessionIdAudioTrack;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i)) {
            this.keepSessionIdAudioTrack.release();
            this.keepSessionIdAudioTrack = null;
        }
        if (this.keepSessionIdAudioTrack == null) {
            this.keepSessionIdAudioTrack = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.keepSessionIdAudioTrack.getAudioSessionId();
    }

    /* access modifiers changed from: private */
    public static DeviceInfo createDeviceInfo(StreamVolumeManager streamVolumeManager2) {
        return new DeviceInfo(0, streamVolumeManager2.getMinVolume(), streamVolumeManager2.getMaxVolume());
    }

    private final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, Player.EventListener {
        @Deprecated
        public /* synthetic */ void onAudioInputFormatChanged(Format format) {
            AudioRendererEventListener.CC.$default$onAudioInputFormatChanged(this, format);
        }

        public /* synthetic */ void onEvents(Player player, Player.C3723Events events) {
            Player.EventListener.CC.$default$onEvents(this, player, events);
        }

        public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
            Player.EventListener.CC.$default$onExperimentalOffloadSchedulingEnabledChanged(this, z);
        }

        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            Player.EventListener.CC.$default$onIsPlayingChanged(this, z);
        }

        @Deprecated
        public /* synthetic */ void onLoadingChanged(boolean z) {
            Player.EventListener.CC.$default$onLoadingChanged(this, z);
        }

        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            Player.EventListener.CC.$default$onMediaItemTransition(this, mediaItem, i);
        }

        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            Player.EventListener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
        }

        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            Player.EventListener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
        }

        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            Player.EventListener.CC.$default$onPlayerError(this, exoPlaybackException);
        }

        @Deprecated
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            Player.EventListener.CC.$default$onPlayerStateChanged(this, z, i);
        }

        public /* synthetic */ void onPositionDiscontinuity(int i) {
            Player.EventListener.CC.$default$onPositionDiscontinuity(this, i);
        }

        public /* synthetic */ void onRepeatModeChanged(int i) {
            Player.EventListener.CC.$default$onRepeatModeChanged(this, i);
        }

        @Deprecated
        public /* synthetic */ void onSeekProcessed() {
            Player.EventListener.CC.$default$onSeekProcessed(this);
        }

        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            Player.EventListener.CC.$default$onShuffleModeEnabledChanged(this, z);
        }

        public /* synthetic */ void onStaticMetadataChanged(List<Metadata> list) {
            Player.EventListener.CC.$default$onStaticMetadataChanged(this, list);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            Player.EventListener.CC.$default$onTimelineChanged(this, timeline, i);
        }

        @Deprecated
        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            Player.EventListener.CC.$default$onTimelineChanged(this, timeline, obj, i);
        }

        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            Player.EventListener.CC.$default$onTracksChanged(this, trackGroupArray, trackSelectionArray);
        }

        @Deprecated
        public /* synthetic */ void onVideoInputFormatChanged(Format format) {
            VideoRendererEventListener.CC.$default$onVideoInputFormatChanged(this, format);
        }

        private ComponentListener() {
        }

        public void onVideoEnabled(DecoderCounters decoderCounters) {
            DecoderCounters unused = SimpleExoPlayer.this.videoDecoderCounters = decoderCounters;
            SimpleExoPlayer.this.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        public void onVideoDecoderInitialized(String str, long j, long j2) {
            SimpleExoPlayer.this.analyticsCollector.onVideoDecoderInitialized(str, j, j2);
        }

        public void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            Format unused = SimpleExoPlayer.this.videoFormat = format;
            SimpleExoPlayer.this.analyticsCollector.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void onDroppedFrames(int i, long j) {
            SimpleExoPlayer.this.analyticsCollector.onDroppedFrames(i, j);
        }

        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            SimpleExoPlayer.this.analyticsCollector.onVideoSizeChanged(i, i2, i3, f);
            Iterator it = SimpleExoPlayer.this.videoListeners.iterator();
            while (it.hasNext()) {
                ((VideoListener) it.next()).onVideoSizeChanged(i, i2, i3, f);
            }
        }

        public void onRenderedFirstFrame(Surface surface) {
            SimpleExoPlayer.this.analyticsCollector.onRenderedFirstFrame(surface);
            if (SimpleExoPlayer.this.surface == surface) {
                Iterator it = SimpleExoPlayer.this.videoListeners.iterator();
                while (it.hasNext()) {
                    ((VideoListener) it.next()).onRenderedFirstFrame();
                }
            }
        }

        public void onVideoDecoderReleased(String str) {
            SimpleExoPlayer.this.analyticsCollector.onVideoDecoderReleased(str);
        }

        public void onVideoDisabled(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.analyticsCollector.onVideoDisabled(decoderCounters);
            Format unused = SimpleExoPlayer.this.videoFormat = null;
            DecoderCounters unused2 = SimpleExoPlayer.this.videoDecoderCounters = null;
        }

        public void onVideoFrameProcessingOffset(long j, int i) {
            SimpleExoPlayer.this.analyticsCollector.onVideoFrameProcessingOffset(j, i);
        }

        public void onAudioEnabled(DecoderCounters decoderCounters) {
            DecoderCounters unused = SimpleExoPlayer.this.audioDecoderCounters = decoderCounters;
            SimpleExoPlayer.this.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        public void onAudioDecoderInitialized(String str, long j, long j2) {
            SimpleExoPlayer.this.analyticsCollector.onAudioDecoderInitialized(str, j, j2);
        }

        public void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            Format unused = SimpleExoPlayer.this.audioFormat = format;
            SimpleExoPlayer.this.analyticsCollector.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void onAudioPositionAdvancing(long j) {
            SimpleExoPlayer.this.analyticsCollector.onAudioPositionAdvancing(j);
        }

        public void onAudioUnderrun(int i, long j, long j2) {
            SimpleExoPlayer.this.analyticsCollector.onAudioUnderrun(i, j, j2);
        }

        public void onAudioDecoderReleased(String str) {
            SimpleExoPlayer.this.analyticsCollector.onAudioDecoderReleased(str);
        }

        public void onAudioDisabled(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.analyticsCollector.onAudioDisabled(decoderCounters);
            Format unused = SimpleExoPlayer.this.audioFormat = null;
            DecoderCounters unused2 = SimpleExoPlayer.this.audioDecoderCounters = null;
        }

        public void onSkipSilenceEnabledChanged(boolean z) {
            if (SimpleExoPlayer.this.skipSilenceEnabled != z) {
                boolean unused = SimpleExoPlayer.this.skipSilenceEnabled = z;
                SimpleExoPlayer.this.notifySkipSilenceEnabledChanged();
            }
        }

        public void onAudioSinkError(Exception exc) {
            SimpleExoPlayer.this.analyticsCollector.onAudioSinkError(exc);
        }

        public void onCues(List<Cue> list) {
            List unused = SimpleExoPlayer.this.currentCues = list;
            Iterator it = SimpleExoPlayer.this.textOutputs.iterator();
            while (it.hasNext()) {
                ((TextOutput) it.next()).onCues(list);
            }
        }

        public void onMetadata(Metadata metadata) {
            SimpleExoPlayer.this.analyticsCollector.onMetadata(metadata);
            Iterator it = SimpleExoPlayer.this.metadataOutputs.iterator();
            while (it.hasNext()) {
                ((MetadataOutput) it.next()).onMetadata(metadata);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.setVideoSurfaceInternal(surfaceHolder.getSurface(), false);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            SimpleExoPlayer.this.maybeNotifySurfaceSizeChanged(i2, i3);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.setVideoSurfaceInternal((Surface) null, false);
            SimpleExoPlayer.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SimpleExoPlayer.this.setVideoSurfaceInternal(new Surface(surfaceTexture), true);
            SimpleExoPlayer.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SimpleExoPlayer.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SimpleExoPlayer.this.setVideoSurfaceInternal((Surface) null, true);
            SimpleExoPlayer.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        public void setVolumeMultiplier(float f) {
            SimpleExoPlayer.this.sendVolumeToRenderers();
        }

        public void executePlayerCommand(int i) {
            boolean playWhenReady = SimpleExoPlayer.this.getPlayWhenReady();
            SimpleExoPlayer.this.updatePlayWhenReady(playWhenReady, i, SimpleExoPlayer.getPlayWhenReadyChangeReason(playWhenReady, i));
        }

        public void onAudioBecomingNoisy() {
            SimpleExoPlayer.this.updatePlayWhenReady(false, -1, 3);
        }

        public void onStreamTypeChanged(int i) {
            DeviceInfo access$4100 = SimpleExoPlayer.createDeviceInfo(SimpleExoPlayer.this.streamVolumeManager);
            if (!access$4100.equals(SimpleExoPlayer.this.deviceInfo)) {
                DeviceInfo unused = SimpleExoPlayer.this.deviceInfo = access$4100;
                Iterator it = SimpleExoPlayer.this.deviceListeners.iterator();
                while (it.hasNext()) {
                    ((DeviceListener) it.next()).onDeviceInfoChanged(access$4100);
                }
            }
        }

        public void onStreamVolumeChanged(int i, boolean z) {
            Iterator it = SimpleExoPlayer.this.deviceListeners.iterator();
            while (it.hasNext()) {
                ((DeviceListener) it.next()).onDeviceVolumeChanged(i, z);
            }
        }

        public void onIsLoadingChanged(boolean z) {
            if (SimpleExoPlayer.this.priorityTaskManager == null) {
                return;
            }
            if (z && !SimpleExoPlayer.this.isPriorityTaskManagerRegistered) {
                SimpleExoPlayer.this.priorityTaskManager.add(0);
                boolean unused = SimpleExoPlayer.this.isPriorityTaskManagerRegistered = true;
            } else if (!z && SimpleExoPlayer.this.isPriorityTaskManagerRegistered) {
                SimpleExoPlayer.this.priorityTaskManager.remove(0);
                boolean unused2 = SimpleExoPlayer.this.isPriorityTaskManagerRegistered = false;
            }
        }

        public void onPlaybackStateChanged(int i) {
            SimpleExoPlayer.this.updateWakeAndWifiLock();
        }

        public void onPlayWhenReadyChanged(boolean z, int i) {
            SimpleExoPlayer.this.updateWakeAndWifiLock();
        }

        public void onExperimentalSleepingForOffloadChanged(boolean z) {
            SimpleExoPlayer.this.updateWakeAndWifiLock();
        }
    }
}
