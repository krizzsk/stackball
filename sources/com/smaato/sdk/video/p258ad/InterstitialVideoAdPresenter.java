package com.smaato.sdk.video.p258ad;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.core.analytics.VideoViewabilityTracker;
import com.smaato.sdk.core.analytics.ViewabilityVerificationResource;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;
import com.smaato.sdk.video.vast.player.VideoTimings;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.video.ad.InterstitialVideoAdPresenter */
public class InterstitialVideoAdPresenter extends VideoAdPresenter implements InterstitialAdPresenter {
    private WeakReference<InterstitialAdPresenter.Listener> listener = new WeakReference<>((Object) null);
    private final VastVideoPlayer vastVideoPlayer;

    /* access modifiers changed from: package-private */
    public final void onAdCompleted() {
    }

    /* access modifiers changed from: package-private */
    public final void onAddedToView() {
    }

    public void setFriendlyObstructionView(View view) {
    }

    public /* bridge */ /* synthetic */ AdContentView getAdContentView(Context context) {
        return super.getAdContentView(context);
    }

    InterstitialVideoAdPresenter(VastVideoPlayer vastVideoPlayer2, VideoAdInteractor videoAdInteractor, VideoViewabilityTracker videoViewabilityTracker, VideoTimings videoTimings, Map<String, List<ViewabilityVerificationResource>> map) {
        super(vastVideoPlayer2, videoAdInteractor, videoViewabilityTracker, videoTimings, map);
        this.vastVideoPlayer = vastVideoPlayer2;
    }

    public void onCloseClicked() {
        this.vastVideoPlayer.onCloseClicked();
    }

    public void setListener(InterstitialAdPresenter.Listener listener2) {
        this.listener = new WeakReference<>(listener2);
    }

    public /* synthetic */ void lambda$onShown$0$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
    }

    /* access modifiers changed from: package-private */
    public final void onShown() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onShown$0$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onTTLExpired$1$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onTTLExpired(this);
    }

    /* access modifiers changed from: package-private */
    public final void onTTLExpired() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onTTLExpired$1$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdClosed$2$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onClose(this);
    }

    /* access modifiers changed from: package-private */
    public final void onAdClosed() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onAdClosed$2$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdError$3$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdError(this);
    }

    /* access modifiers changed from: package-private */
    public final void onAdError() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onAdError$3$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdClicked$4$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    /* access modifiers changed from: package-private */
    public final void onAdClicked() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onAdClicked$4$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void onReadyToBeClosed() {
        Objects.onNotNull(this.listener.get(), $$Lambda$nk0D4u8wrNMCMfE3WzHxisIX_k.INSTANCE);
    }
}
