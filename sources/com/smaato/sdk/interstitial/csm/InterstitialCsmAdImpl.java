package com.smaato.sdk.interstitial.csm;

import android.app.Activity;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.interstitial.AdEvent;
import com.smaato.sdk.interstitial.InterstitialAd;
import com.smaato.sdk.interstitial.InterstitialEventsCache;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdImpl;
import com.smaato.sdk.interstitial.csm.InterstitialCsmAdPresenter;

public final class InterstitialCsmAdImpl extends InterstitialAd {
    /* access modifiers changed from: private */
    public final InterstitialCsmAdPresenter adPresenter;
    /* access modifiers changed from: private */
    public final InterstitialEventsCache interstitialEventsCache;
    private final InterstitialCsmAdPresenter.Listener listener = new InterstitialCsmAdPresenter.Listener() {
        public final void onAdOpened(InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialCsmAdImpl.C87871.this.lambda$onAdOpened$0$InterstitialCsmAdImpl$1();
                }
            });
        }

        public /* synthetic */ void lambda$onAdOpened$0$InterstitialCsmAdImpl$1() {
            InterstitialCsmAdImpl.this.interstitialEventsCache.notifyEvent(InterstitialCsmAdImpl.this.listenerKey, AdEvent.Type.OPEN);
        }

        public final void onAdClosed(InterstitialCsmAdPresenter interstitialCsmAdPresenter) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialCsmAdImpl.C87871.this.lambda$onAdClosed$1$InterstitialCsmAdImpl$1();
                }
            });
        }

        public /* synthetic */ void lambda$onAdClosed$1$InterstitialCsmAdImpl$1() {
            InterstitialCsmAdImpl.this.adPresenter.release();
            InterstitialCsmAdImpl.this.interstitialEventsCache.notifyEvent(InterstitialCsmAdImpl.this.listenerKey, AdEvent.Type.CLOSE);
        }

        public /* synthetic */ void lambda$onAdImpressed$2$InterstitialCsmAdImpl$1() {
            InterstitialCsmAdImpl.this.interstitialEventsCache.notifyEvent(InterstitialCsmAdImpl.this.listenerKey, AdEvent.Type.IMPRESS);
        }

        public /* synthetic */ void lambda$onAdClicked$3$InterstitialCsmAdImpl$1() {
            InterstitialCsmAdImpl.this.interstitialEventsCache.notifyEvent(InterstitialCsmAdImpl.this.listenerKey, AdEvent.Type.CLICK);
        }

        public /* synthetic */ void lambda$onAdError$4$InterstitialCsmAdImpl$1() {
            InterstitialCsmAdImpl.this.interstitialEventsCache.notifyEvent(InterstitialCsmAdImpl.this.listenerKey, AdEvent.Type.ERROR);
        }

        public /* synthetic */ void lambda$onTTLExpired$5$InterstitialCsmAdImpl$1() {
            InterstitialCsmAdImpl.this.interstitialEventsCache.notifyEvent(InterstitialCsmAdImpl.this.listenerKey, AdEvent.Type.TTL_EXPIRED);
        }

        public final /* bridge */ /* synthetic */ void onTTLExpired(AdPresenter adPresenter) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialCsmAdImpl.C87871.this.lambda$onTTLExpired$5$InterstitialCsmAdImpl$1();
                }
            });
        }

        public final /* bridge */ /* synthetic */ void onAdError(AdPresenter adPresenter) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialCsmAdImpl.C87871.this.lambda$onAdError$4$InterstitialCsmAdImpl$1();
                }
            });
        }

        public final /* bridge */ /* synthetic */ void onAdClicked(AdPresenter adPresenter) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialCsmAdImpl.C87871.this.lambda$onAdClicked$3$InterstitialCsmAdImpl$1();
                }
            });
        }

        public final /* bridge */ /* synthetic */ void onAdImpressed(AdPresenter adPresenter) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialCsmAdImpl.C87871.this.lambda$onAdImpressed$2$InterstitialCsmAdImpl$1();
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public final String listenerKey;

    public InterstitialCsmAdImpl(InterstitialCsmAdPresenter interstitialCsmAdPresenter, String str, InterstitialEventsCache interstitialEventsCache2) {
        this.adPresenter = (InterstitialCsmAdPresenter) Objects.requireNonNull(interstitialCsmAdPresenter);
        this.listenerKey = (String) Objects.requireNonNull(str);
        this.interstitialEventsCache = (InterstitialEventsCache) Objects.requireNonNull(interstitialEventsCache2);
        interstitialCsmAdPresenter.setInterstitialAdListener(this.listener);
    }

    public final void showAdInternal(Activity activity, boolean z) {
        Threads.runOnUi(new Runnable() {
            public final void run() {
                InterstitialCsmAdImpl.this.lambda$showAdInternal$0$InterstitialCsmAdImpl();
            }
        });
    }

    public /* synthetic */ void lambda$showAdInternal$0$InterstitialCsmAdImpl() {
        if (this.adPresenter.isValid()) {
            this.adPresenter.showAd();
        } else {
            this.interstitialEventsCache.notifyEvent(this.listenerKey, AdEvent.Type.ERROR);
        }
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
