package com.smaato.sdk.interstitial;

import android.app.Activity;
import com.smaato.sdk.core.p248ad.AdInteractor;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.util.Intents;
import com.smaato.sdk.core.util.Objects;
import java.util.UUID;

final class InterstitialAdImpl extends InterstitialAd {
    private final InterstitialAdPresenter adPresenter;
    private final EventListener eventListener;
    private final InterstitialAdPresenterStorage interstitialAdPresenterStorage;
    private final String listenerKey;
    private final AdInteractor.TtlListener ttlListener;
    private final UUID uuid;

    InterstitialAdImpl(UUID uuid2, String str, InterstitialAdPresenter interstitialAdPresenter, InterstitialAdPresenterStorage interstitialAdPresenterStorage2, EventListener eventListener2) {
        this.uuid = (UUID) Objects.requireNonNull(uuid2);
        this.listenerKey = (String) Objects.requireNonNull(str);
        this.adPresenter = (InterstitialAdPresenter) Objects.requireNonNull(interstitialAdPresenter);
        this.interstitialAdPresenterStorage = (InterstitialAdPresenterStorage) Objects.requireNonNull(interstitialAdPresenterStorage2);
        this.eventListener = (EventListener) Objects.requireNonNull(eventListener2);
        this.ttlListener = new AdInteractor.TtlListener(eventListener2) {
            public final /* synthetic */ EventListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onTTLExpired(AdInteractor adInteractor) {
                InterstitialAdImpl.this.lambda$new$0$InterstitialAdImpl(this.f$1, adInteractor);
            }
        };
        interstitialAdPresenter.getAdInteractor().addTtlListener(this.ttlListener);
    }

    public /* synthetic */ void lambda$new$0$InterstitialAdImpl(EventListener eventListener2, AdInteractor adInteractor) {
        eventListener2.onAdTTLExpired(this);
    }

    /* access modifiers changed from: protected */
    public final void showAdInternal(Activity activity, boolean z) {
        if (this.adPresenter.isValid()) {
            this.interstitialAdPresenterStorage.putAdPresenter(this.uuid, this.adPresenter);
            Intents.startIntent(activity, InterstitialAdActivity.createIntent(activity, this.uuid, this.listenerKey, this.backgroundColor, z));
            return;
        }
        this.eventListener.onAdError(this, InterstitialError.CREATIVE_RESOURCE_EXPIRED);
    }

    public final String getSessionId() {
        return this.adPresenter.getSessionId();
    }

    public final String getCreativeId() {
        return this.adPresenter.getCreativeId();
    }

    public final String getAdSpaceId() {
        return this.adPresenter.getAdSpaceId();
    }

    public final boolean isAvailableForPresentation() {
        return this.adPresenter.isValid();
    }
}
