package com.smaato.sdk.video.vast.player;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.widget.VastVideoPlayerView;
import java.lang.ref.WeakReference;

public class VastVideoPlayer {
    /* access modifiers changed from: private */
    public final VastVideoPlayerPresenter vastVideoPlayerPresenter;
    private final VastVideoPlayerViewFactory vastVideoPlayerViewFactory;

    public interface EventListener {
        void onAdClick();

        void onAdError();

        void onClose();

        void onCompanionShown();

        void onComplete();

        void onFirstQuartile();

        void onMidPoint();

        void onMute();

        void onPaused();

        void onResumed();

        void onSkipped();

        void onStart(float f, float f2);

        void onThirdQuartile();

        void onUnmute();

        void onVideoImpression();
    }

    VastVideoPlayer(VastVideoPlayerPresenter vastVideoPlayerPresenter2, VastVideoPlayerViewFactory vastVideoPlayerViewFactory2) {
        this.vastVideoPlayerPresenter = (VastVideoPlayerPresenter) Objects.requireNonNull(vastVideoPlayerPresenter2);
        this.vastVideoPlayerViewFactory = (VastVideoPlayerViewFactory) Objects.requireNonNull(vastVideoPlayerViewFactory2);
    }

    public AdContentView getNewVideoPlayerView(Context context) {
        Objects.requireNonNull(context);
        final VastVideoPlayerView vastVideoPlayerView = VastVideoPlayerViewFactory.getVastVideoPlayerView(context);
        vastVideoPlayerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                VastVideoPlayerPresenter access$000 = VastVideoPlayer.this.vastVideoPlayerPresenter;
                VastVideoPlayerView vastVideoPlayerView = vastVideoPlayerView;
                access$000.detachView();
                access$000.vastVideoPlayerViewReference = new WeakReference<>(vastVideoPlayerView);
                vastVideoPlayerView.getIconView().setPresenter(access$000.iconPresenter);
                vastVideoPlayerView.getCompanionAdView().setPresenter(access$000.companionPresenter);
                access$000.setupPlayerForState(access$000.vastVideoPlayerStateMachine.getCurrentState());
            }

            public final void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                VastVideoPlayer.this.vastVideoPlayerPresenter.detachView();
            }
        });
        return vastVideoPlayerView;
    }

    public void setEventListener(EventListener eventListener) {
        this.vastVideoPlayerPresenter.videoPlayerModel.eventListenerRef.set(eventListener);
    }

    public void loaded() {
        VastVideoPlayerModel vastVideoPlayerModel = this.vastVideoPlayerPresenter.videoPlayerModel;
        vastVideoPlayerModel.vastEventTracker.triggerEventByName(VastEvent.LOADED, vastVideoPlayerModel.createPlayerState());
    }

    public void pause() {
        this.vastVideoPlayerPresenter.videoPlayerPresenter.videoPlayer.pause();
    }

    public void resume() {
        this.vastVideoPlayerPresenter.videoPlayerPresenter.videoPlayer.start();
    }

    public void onCloseClicked() {
        this.vastVideoPlayerPresenter.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.CLOSE_BUTTON_CLICKED);
    }
}
