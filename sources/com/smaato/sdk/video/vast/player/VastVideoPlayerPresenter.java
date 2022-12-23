package com.smaato.sdk.video.vast.player;

import android.content.Context;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import com.smaato.sdk.video.vast.player.ComponentClickHandler;
import com.smaato.sdk.video.vast.player.VastVideoPlayerModel;
import com.smaato.sdk.video.vast.player.VastVideoPlayerPresenter;
import com.smaato.sdk.video.vast.player.VideoPlayerPresenter;
import com.smaato.sdk.video.vast.widget.VastVideoPlayerView;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;
import java.lang.ref.WeakReference;

public class VastVideoPlayerPresenter {
    private final VastElementPresenter.Listener companionListener = new VastElementPresenter.Listener() {
        public final void onVastElementClicked(String str) {
            Objects.onNotNull(VastVideoPlayerPresenter.this.vastVideoPlayerViewReference.get(), $$Lambda$VastVideoPlayerPresenter$3$QpQ3qUsRIjfUiftQDZcg1E7sYV8.INSTANCE);
            VastVideoPlayerPresenter.this.videoPlayerModel.companionClick(str, new ComponentClickHandler.ClickCallback() {
                public final void onUrlResolved(Consumer consumer) {
                    VastVideoPlayerPresenter.C89483.this.lambda$onVastElementClicked$2$VastVideoPlayerPresenter$3(consumer);
                }
            });
        }

        public /* synthetic */ void lambda$onVastElementClicked$2$VastVideoPlayerPresenter$3(Consumer consumer) {
            Objects.onNotNull(VastVideoPlayerPresenter.this.vastVideoPlayerViewReference.get(), $$Lambda$VastVideoPlayerPresenter$3$zNdzdHyE1x0VQk6W213UfFlPyn8.INSTANCE);
            VastVideoPlayerPresenter.access$500(VastVideoPlayerPresenter.this, consumer);
        }

        public final void onVastElementRendered() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onCompanionRendered", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onCompanionShown();
        }

        public final void onVastElementError(int i) {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onCompanionError", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.trackError(i);
            boolean unused = VastVideoPlayerPresenter.this.isCompanionHasError = true;
        }

        public final void onRenderProcessGone() {
            VastVideoPlayerPresenter.this.videoPlayerModel.onAdError();
            VastVideoPlayerPresenter.this.closePlayer();
        }
    };
    final VastElementPresenter companionPresenter;
    private final VastElementPresenter.Listener iconListener = new VastElementPresenter.Listener() {
        public /* synthetic */ void lambda$onVastElementClicked$0$VastVideoPlayerPresenter$1(Consumer consumer) {
            VastVideoPlayerPresenter.this.handleLauncher(consumer);
        }

        public final void onVastElementClicked(String str) {
            VastVideoPlayerPresenter.this.videoPlayerModel.iconClick(str, new ComponentClickHandler.ClickCallback() {
                public final void onUrlResolved(Consumer consumer) {
                    VastVideoPlayerPresenter.C89461.this.lambda$onVastElementClicked$0$VastVideoPlayerPresenter$1(consumer);
                }
            });
        }

        public final void onVastElementRendered() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onIconRendered", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.track(VastBeaconEvent.SMAATO_ICON_VIEW_TRACKING);
        }

        public final void onVastElementError(int i) {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onIconError", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.trackError(i);
        }

        public final void onRenderProcessGone() {
            VastVideoPlayerPresenter.this.videoPlayerModel.onAdError();
            VastVideoPlayerPresenter.this.closePlayer();
        }
    };
    final VastElementPresenter iconPresenter;
    /* access modifiers changed from: private */
    public boolean isCompanionHasError;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final StateMachine.Listener<VastPlayerState> vastPlayerStateListener = new StateMachine.Listener() {
        public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
            VastVideoPlayerPresenter.this.lambda$new$0$VastVideoPlayerPresenter((VastPlayerState) obj, (VastPlayerState) obj2, metadata);
        }
    };
    /* access modifiers changed from: package-private */
    public final StateMachine<VastPlayerEvent, VastPlayerState> vastVideoPlayerStateMachine;
    /* access modifiers changed from: package-private */
    public WeakReference<VastVideoPlayerView> vastVideoPlayerViewReference = new WeakReference<>((Object) null);
    private final VideoPlayerPresenter.Listener videoPlayerListener = new VideoPlayerPresenter.Listener() {
        public final void onVideoStarted(long j, float f) {
            VastVideoPlayerPresenter.this.logger.info(LogDomain.VAST, "VAST video has started", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onVideoStarted((float) j, f);
        }

        public final void onVideoImpression() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoImpression", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onVideoImpression();
        }

        public final void onVideoProgressChange(long j, long j2) {
            VastVideoPlayerModel access$000 = VastVideoPlayerPresenter.this.videoPlayerModel;
            access$000.lastKnownPositionMillis = j;
            access$000.vastEventTracker.triggerProgressDependentEvent(access$000.createPlayerState(), j2);
            float f = ((float) j) / ((float) j2);
            if (f >= 0.01f) {
                access$000.track(VastBeaconEvent.SMAATO_IMPRESSION);
            }
            VastVideoPlayerModel.Quartile quartile = VastVideoPlayerModel.Quartile.ZERO;
            if (f >= 0.25f && f < 0.5f) {
                quartile = VastVideoPlayerModel.Quartile.FIRST;
            } else if (f >= 0.5f && f < 0.75f) {
                quartile = VastVideoPlayerModel.Quartile.MID;
            } else if (f >= 0.75f) {
                quartile = VastVideoPlayerModel.Quartile.THIRD;
            }
            access$000.quartileChangeSender.newValue(quartile);
        }

        public /* synthetic */ void lambda$onVideoClicked$0$VastVideoPlayerPresenter$2(Consumer consumer) {
            VastVideoPlayerPresenter.access$500(VastVideoPlayerPresenter.this, consumer);
        }

        public final void onVideoClicked(float f, float f2) {
            VastVideoPlayerPresenter.this.videoPlayerModel.videoClick(f, f2, new ComponentClickHandler.ClickCallback() {
                public final void onUrlResolved(Consumer consumer) {
                    VastVideoPlayerPresenter.C89472.this.lambda$onVideoClicked$0$VastVideoPlayerPresenter$2(consumer);
                }
            });
        }

        public final void onVideoSkipped() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoSkipped", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onVideoSkipped();
            VastVideoPlayerPresenter.this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.VIDEO_SKIPPED);
        }

        public final void onMuteClicked() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onMuteClicked", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onVideoMuteClicked();
        }

        public final void onUnmuteClicked() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onUnmuteClicked", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onVideoUnmuteClicked();
        }

        public final void onVideoCompleted() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoCompleted", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onVideoCompleted();
            VastVideoPlayerPresenter.this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.VIDEO_COMPLETED);
        }

        public final void onVideoError$13462e() {
            VastVideoPlayerPresenter.this.logger.error(LogDomain.VAST, "onVideoError", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.trackError(ErrorCode.GENERAL_LINEAR_ERROR);
            VastVideoPlayerPresenter.this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.ERROR);
        }

        public final void onVideoPaused() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoPaused", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onVideoPaused();
        }

        public final void onVideoResumed() {
            VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoResumed", new Object[0]);
            VastVideoPlayerPresenter.this.videoPlayerModel.onVideoResumed();
        }
    };
    /* access modifiers changed from: package-private */
    public final VastVideoPlayerModel videoPlayerModel;
    final VideoPlayerPresenter videoPlayerPresenter;

    public /* synthetic */ void lambda$new$0$VastVideoPlayerPresenter(VastPlayerState vastPlayerState, VastPlayerState vastPlayerState2, Metadata metadata) {
        setupPlayerForState(vastPlayerState2);
    }

    VastVideoPlayerPresenter(Logger logger2, VastVideoPlayerModel vastVideoPlayerModel, VastElementPresenter vastElementPresenter, VastElementPresenter vastElementPresenter2, VideoPlayerPresenter videoPlayerPresenter2, StateMachine<VastPlayerEvent, VastPlayerState> stateMachine) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.videoPlayerModel = (VastVideoPlayerModel) Objects.requireNonNull(vastVideoPlayerModel);
        this.companionPresenter = (VastElementPresenter) Objects.requireNonNull(vastElementPresenter);
        this.iconPresenter = (VastElementPresenter) Objects.requireNonNull(vastElementPresenter2);
        this.videoPlayerPresenter = (VideoPlayerPresenter) Objects.requireNonNull(videoPlayerPresenter2);
        this.vastVideoPlayerStateMachine = (StateMachine) Objects.requireNonNull(stateMachine);
        this.videoPlayerPresenter.videoPlayerPresenterListener = this.videoPlayerListener;
        this.companionPresenter.setListener(this.companionListener);
        this.iconPresenter.setListener(this.iconListener);
        this.vastVideoPlayerStateMachine.addListener(this.vastPlayerStateListener);
    }

    public /* synthetic */ void lambda$handleAdContentClickLauncher$1$VastVideoPlayerPresenter() {
        this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.CLICKED);
    }

    /* access modifiers changed from: private */
    public void handleLauncher(Consumer<Context> consumer) {
        Threads.runOnUi(new Runnable(consumer) {
            public final /* synthetic */ Consumer f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VastVideoPlayerPresenter.this.lambda$handleLauncher$3$VastVideoPlayerPresenter(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$handleLauncher$3$VastVideoPlayerPresenter(Consumer consumer) {
        Objects.onNotNull(this.vastVideoPlayerViewReference.get(), new Consumer() {
            public final void accept(Object obj) {
                Consumer.this.accept(((VastVideoPlayerView) obj).getContext());
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void detachView() {
        Objects.onNotNull(this.vastVideoPlayerViewReference.get(), new Consumer() {
            public final void accept(Object obj) {
                VastVideoPlayerPresenter.this.lambda$detachView$4$VastVideoPlayerPresenter((VastVideoPlayerView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$detachView$4$VastVideoPlayerPresenter(VastVideoPlayerView vastVideoPlayerView) {
        this.vastVideoPlayerViewReference.clear();
    }

    /* access modifiers changed from: package-private */
    public final void setupPlayerForState(VastPlayerState vastPlayerState) {
        if (!this.isCompanionHasError || vastPlayerState != VastPlayerState.SHOW_COMPANION) {
            int i = C89494.$SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState[vastPlayerState.ordinal()];
            if (i == 1) {
                showVideoPlayerView();
            } else if (i == 2) {
                showCompanion();
            } else if (i != 3) {
                this.logger.error(LogDomain.VAST, "Unknown state for VastVideoPlayer: ".concat(String.valueOf(vastPlayerState)), new Object[0]);
                closePlayer();
            } else {
                closePlayer();
            }
        } else {
            closePlayer();
        }
    }

    /* renamed from: com.smaato.sdk.video.vast.player.VastVideoPlayerPresenter$4 */
    static /* synthetic */ class C89494 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.smaato.sdk.video.vast.player.VastPlayerState[] r0 = com.smaato.sdk.video.vast.player.VastPlayerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState = r0
                com.smaato.sdk.video.vast.player.VastPlayerState r1 = com.smaato.sdk.video.vast.player.VastPlayerState.SHOW_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.video.vast.player.VastPlayerState r1 = com.smaato.sdk.video.vast.player.VastPlayerState.SHOW_COMPANION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.video.vast.player.VastPlayerState r1 = com.smaato.sdk.video.vast.player.VastPlayerState.CLOSE_PLAYER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.player.VastVideoPlayerPresenter.C89494.<clinit>():void");
        }
    }

    private void clear() {
        this.videoPlayerPresenter.close();
        detachView();
    }

    private void showCompanion() {
        VastVideoPlayerView vastVideoPlayerView = (VastVideoPlayerView) this.vastVideoPlayerViewReference.get();
        if (vastVideoPlayerView != null) {
            vastVideoPlayerView.hidePlayer();
            vastVideoPlayerView.showCompanion();
        }
    }

    private void showVideoPlayerView() {
        VideoPlayerView videoPlayerView;
        VastVideoPlayerView vastVideoPlayerView = (VastVideoPlayerView) this.vastVideoPlayerViewReference.get();
        if (vastVideoPlayerView == null) {
            videoPlayerView = null;
        } else {
            videoPlayerView = vastVideoPlayerView.getVideoPlayerView();
        }
        VideoPlayerPresenter videoPlayerPresenter2 = this.videoPlayerPresenter;
        videoPlayerPresenter2.getClass();
        Objects.onNotNull(videoPlayerView, new Consumer() {
            public final void accept(Object obj) {
                VideoPlayerPresenter.this.attachView((VideoPlayerView) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void closePlayer() {
        this.videoPlayerModel.onPlayerClosed();
        clear();
    }

    static /* synthetic */ void access$500(VastVideoPlayerPresenter vastVideoPlayerPresenter, Consumer consumer) {
        vastVideoPlayerPresenter.handleLauncher(consumer);
        Threads.runOnUi(new Runnable() {
            public final void run() {
                VastVideoPlayerPresenter.this.lambda$handleAdContentClickLauncher$1$VastVideoPlayerPresenter();
            }
        });
    }
}
