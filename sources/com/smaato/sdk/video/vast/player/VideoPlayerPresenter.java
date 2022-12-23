package com.smaato.sdk.video.vast.player;

import android.view.Surface;
import com.smaato.sdk.core.tracker.VisibilityTracker;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.tracker.VisibilityTrackerListener;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.utils.RepeatableAction;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.player.VideoPlayer;
import com.smaato.sdk.video.vast.player.VideoPlayerPresenter;
import com.smaato.sdk.video.vast.player.exception.VideoPlayerException;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

final class VideoPlayerPresenter {
    private long lastCurrentPositionMillis;
    private final SkipButtonVisibilityManager skipButtonVisibilityManager;
    private final VastMediaFileScenario vastMediaFileScenario;
    private final VisibilityTrackerCreator vastVisibilityTrackerCreator;
    final VideoPlayer videoPlayer;
    private final VideoPlayer.LifecycleListener videoPlayerLifecycleListener = new VideoPlayer.LifecycleListener() {
        public final void onReleased(VideoPlayer videoPlayer) {
        }

        public final void onSeekComplete(VideoPlayer videoPlayer) {
        }

        public final void onStarted(VideoPlayer videoPlayer) {
            VideoPlayerPresenter.this.videoProgressCheckAction.start();
            Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, new Consumer() {
                public final void accept(Object obj) {
                    ((VideoPlayerPresenter.Listener) obj).onVideoStarted(VideoPlayer.this.getDuration(), VideoPlayer.this.getCurrentVolume());
                }
            });
        }

        public final void onResumed(VideoPlayer videoPlayer) {
            VideoPlayerPresenter.this.videoProgressCheckAction.start();
            Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, $$Lambda$sCJgdSnaYECU12vVJ9u3Dosn9rI.INSTANCE);
        }

        public final void onPaused(VideoPlayer videoPlayer) {
            Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, $$Lambda$yKuADDDAd5PGrUQfm_tTUA2m_ro.INSTANCE);
            VideoPlayerPresenter.this.videoProgressCheckAction.stop();
        }

        public final void onStopped(VideoPlayer videoPlayer) {
            VideoPlayerPresenter.this.videoProgressCheckAction.stop();
        }

        public final void onCompleted(VideoPlayer videoPlayer) {
            Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, $$Lambda$kWGw60ziXycWUiyXA1FvlxdP_zo.INSTANCE);
            VideoPlayerPresenter.this.videoProgressCheckAction.stop();
        }

        public final void onReset(VideoPlayer videoPlayer) {
            VideoPlayerPresenter.this.videoProgressCheckAction.stop();
        }

        public final void onError(VideoPlayer videoPlayer, VideoPlayerException videoPlayerException) {
            Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, $$Lambda$VideoPlayerPresenter$1$KYf6bWHFtx50IxGq9O6SUyQK4.INSTANCE);
            VideoPlayerPresenter.this.videoProgressCheckAction.stop();
        }
    };
    Listener videoPlayerPresenterListener;
    private WeakReference<VideoPlayerView> videoPlayerViewRef = new WeakReference<>((Object) null);
    final RepeatableAction videoProgressCheckAction;
    final VideoViewResizeManager videoViewResizeManager;
    private final AtomicReference<VisibilityTracker> visibilityTrackerAtomicRef;

    interface Listener {
        void onMuteClicked();

        void onUnmuteClicked();

        void onVideoClicked(float f, float f2);

        void onVideoCompleted();

        void onVideoError$13462e();

        void onVideoImpression();

        void onVideoPaused();

        void onVideoProgressChange(long j, long j2);

        void onVideoResumed();

        void onVideoSkipped();

        void onVideoStarted(long j, float f);
    }

    VideoPlayerPresenter(VideoPlayer videoPlayer2, VastMediaFileScenario vastMediaFileScenario2, VideoViewResizeManager videoViewResizeManager2, SkipButtonVisibilityManager skipButtonVisibilityManager2, VisibilityTrackerCreator visibilityTrackerCreator, RepeatableActionFactory repeatableActionFactory) {
        this.videoPlayer = (VideoPlayer) Objects.requireNonNull(videoPlayer2);
        this.vastMediaFileScenario = (VastMediaFileScenario) Objects.requireNonNull(vastMediaFileScenario2);
        this.videoViewResizeManager = (VideoViewResizeManager) Objects.requireNonNull(videoViewResizeManager2);
        this.skipButtonVisibilityManager = (SkipButtonVisibilityManager) Objects.requireNonNull(skipButtonVisibilityManager2);
        this.vastVisibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator);
        this.videoProgressCheckAction = (RepeatableAction) Objects.requireNonNull(repeatableActionFactory.createRepeatableAction(new RepeatableAction.Listener() {
            public final void doAction() {
                VideoPlayerPresenter.this.checkVideoProgress();
            }
        }));
        this.visibilityTrackerAtomicRef = new AtomicReference<>();
        videoPlayer2.setLifecycleListener(this.videoPlayerLifecycleListener);
        videoPlayer2.setOnVolumeChangeListener(new VideoPlayer.OnVolumeChangeListener() {
            public final void onVolumeChanged(float f) {
                VideoPlayerPresenter.this.onVolumeChanged(f);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onVolumeChanged(float f) {
        boolean z = f == 0.0f;
        Objects.onNotNull(this.videoPlayerViewRef.get(), new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VideoPlayerView) obj).changeMuteIcon(this.f$0);
            }
        });
        Objects.onNotNull(this.videoPlayerPresenterListener, new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                VideoPlayerPresenter.lambda$onVolumeChanged$1(this.f$0, (VideoPlayerPresenter.Listener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVolumeChanged$1(boolean z, Listener listener) {
        if (z) {
            listener.onMuteClicked();
        } else {
            listener.onUnmuteClicked();
        }
    }

    /* access modifiers changed from: private */
    public void checkVideoProgress() {
        long currentPositionMillis = this.videoPlayer.getCurrentPositionMillis();
        if (currentPositionMillis != this.lastCurrentPositionMillis) {
            this.lastCurrentPositionMillis = currentPositionMillis;
            long duration = this.videoPlayer.getDuration();
            Objects.onNotNull(this.videoPlayerPresenterListener, new Consumer(currentPositionMillis, duration) {
                public final /* synthetic */ long f$0;
                public final /* synthetic */ long f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r3;
                }

                public final void accept(Object obj) {
                    ((VideoPlayerPresenter.Listener) obj).onVideoProgressChange(this.f$0, this.f$1);
                }
            });
            Objects.onNotNull(this.videoPlayerViewRef.get(), new Consumer(currentPositionMillis, duration) {
                public final /* synthetic */ long f$1;
                public final /* synthetic */ long f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r4;
                }

                public final void accept(Object obj) {
                    VideoPlayerPresenter.this.lambda$onProgressChanged$7$VideoPlayerPresenter(this.f$1, this.f$2, (VideoPlayerView) obj);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void attachView(VideoPlayerView videoPlayerView) {
        this.videoPlayerViewRef = new WeakReference<>(videoPlayerView);
        videoPlayerView.setVideoPlayerPresenter(this);
        videoPlayerView.changeMuteIcon(this.videoPlayer.getCurrentVolume() == 0.0f);
    }

    /* access modifiers changed from: package-private */
    public final void detachView() {
        this.videoPlayerViewRef.clear();
        destroyVisibilityTracker();
    }

    /* access modifiers changed from: package-private */
    public final void close() {
        this.videoPlayerViewRef.clear();
        destroyVisibilityTracker();
        this.videoPlayer.stop();
        this.videoPlayer.release();
    }

    /* access modifiers changed from: package-private */
    public final void onSurfaceAvailable(Surface surface) {
        Objects.onNotNull(this.videoPlayerViewRef.get(), new Consumer() {
            public final void accept(Object obj) {
                VideoPlayerPresenter.this.lambda$onSurfaceAvailable$2$VideoPlayerPresenter((VideoPlayerView) obj);
            }
        });
        this.videoPlayer.setSurface(surface);
        this.videoPlayer.start();
    }

    public /* synthetic */ void lambda$onSurfaceAvailable$2$VideoPlayerPresenter(VideoPlayerView videoPlayerView) {
        this.visibilityTrackerAtomicRef.set(this.vastVisibilityTrackerCreator.createTracker(videoPlayerView, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                VideoPlayerPresenter.this.lambda$createVisibilityTrackerForView$4$VideoPlayerPresenter();
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public final void onSurfaceDestroyed$378a8b81() {
        destroyVisibilityTracker();
        this.videoPlayer.setSurface((Surface) null);
        this.videoPlayer.pause();
    }

    /* access modifiers changed from: package-private */
    public final void onVideoClicked(float f, float f2) {
        Objects.onNotNull(this.videoPlayerPresenterListener, new Consumer(f, f2) {
            public final /* synthetic */ float f$0;
            public final /* synthetic */ float f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((VideoPlayerPresenter.Listener) obj).onVideoClicked(this.f$0, this.f$1);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void onSkipClicked() {
        Objects.onNotNull(this.videoPlayerPresenterListener, $$Lambda$VikFNIf8dscuXVazY8XFtvll8o0.INSTANCE);
        close();
    }

    /* access modifiers changed from: package-private */
    public final void onMuteClicked() {
        float f = 0.0f;
        boolean z = this.videoPlayer.getCurrentVolume() == 0.0f;
        VideoPlayer videoPlayer2 = this.videoPlayer;
        if (z) {
            f = 1.0f;
        }
        videoPlayer2.setVolume(f);
    }

    public /* synthetic */ void lambda$createVisibilityTrackerForView$4$VideoPlayerPresenter() {
        Objects.onNotNull(this.videoPlayerPresenterListener, $$Lambda$fzbpppBPpEtt7AXA53allQZDEU.INSTANCE);
    }

    private void destroyVisibilityTracker() {
        Objects.onNotNull(this.visibilityTrackerAtomicRef.get(), new Consumer() {
            public final void accept(Object obj) {
                VideoPlayerPresenter.this.lambda$destroyVisibilityTracker$5$VideoPlayerPresenter((VisibilityTracker) obj);
            }
        });
    }

    public /* synthetic */ void lambda$destroyVisibilityTracker$5$VideoPlayerPresenter(VisibilityTracker visibilityTracker) {
        visibilityTracker.destroy();
        this.visibilityTrackerAtomicRef.set((Object) null);
    }

    public /* synthetic */ void lambda$onProgressChanged$7$VideoPlayerPresenter(long j, long j2, VideoPlayerView videoPlayerView) {
        videoPlayerView.updateProgressBar(j, j2);
        this.skipButtonVisibilityManager.onProgressChange(j, videoPlayerView);
    }
}
