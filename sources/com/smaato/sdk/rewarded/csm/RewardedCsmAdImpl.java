package com.smaato.sdk.rewarded.csm;

import android.os.Handler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Supplier;
import com.smaato.sdk.rewarded.EventListener;
import com.smaato.sdk.rewarded.RewardedError;
import com.smaato.sdk.rewarded.RewardedInterstitialAd;
import com.smaato.sdk.rewarded.csm.RewardedCsmAdImpl;
import com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenter;

public final class RewardedCsmAdImpl extends RewardedInterstitialAd {
    private final RewardedCsmAdPresenter.Listener csmAdPresenterListener = new RewardedCsmAdPresenter.Listener() {
        public final /* bridge */ /* synthetic */ void onAdImpressed(AdPresenter adPresenter) {
        }

        public final void onAdStarted(RewardedCsmAdPresenter rewardedCsmAdPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedCsmAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedCsmAdImpl.C88351.this.lambda$onAdStarted$0$RewardedCsmAdImpl$1();
                }
            });
        }

        public /* synthetic */ void lambda$onAdStarted$0$RewardedCsmAdImpl$1() {
            RewardedCsmAdImpl.this.eventListener.onAdStarted(RewardedCsmAdImpl.this);
        }

        public final void onAdClosed(RewardedCsmAdPresenter rewardedCsmAdPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedCsmAdImpl.this.handler, new Runnable(rewardedCsmAdPresenter) {
                public final /* synthetic */ RewardedCsmAdPresenter f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    RewardedCsmAdImpl.C88351.this.lambda$onAdClosed$1$RewardedCsmAdImpl$1(this.f$1);
                }
            });
        }

        public /* synthetic */ void lambda$onAdClosed$1$RewardedCsmAdImpl$1(RewardedCsmAdPresenter rewardedCsmAdPresenter) {
            rewardedCsmAdPresenter.release();
            RewardedCsmAdImpl.this.eventListener.onAdClosed(RewardedCsmAdImpl.this);
        }

        public final void onAdReward(RewardedCsmAdPresenter rewardedCsmAdPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedCsmAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedCsmAdImpl.C88351.this.lambda$onAdReward$2$RewardedCsmAdImpl$1();
                }
            });
        }

        public /* synthetic */ void lambda$onAdReward$2$RewardedCsmAdImpl$1() {
            RewardedCsmAdImpl.this.eventListener.onAdReward(RewardedCsmAdImpl.this);
        }

        public /* synthetic */ void lambda$onTTLExpired$3$RewardedCsmAdImpl$1() {
            RewardedCsmAdImpl.this.eventListener.onAdTTLExpired(RewardedCsmAdImpl.this);
        }

        public /* synthetic */ void lambda$onAdClicked$4$RewardedCsmAdImpl$1() {
            RewardedCsmAdImpl.this.eventListener.onAdClicked(RewardedCsmAdImpl.this);
        }

        public /* synthetic */ void lambda$onAdError$5$RewardedCsmAdImpl$1() {
            RewardedCsmAdImpl.this.eventListener.onAdError(RewardedCsmAdImpl.this, RewardedError.INTERNAL_ERROR);
        }

        public final /* bridge */ /* synthetic */ void onTTLExpired(AdPresenter adPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedCsmAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedCsmAdImpl.C88351.this.lambda$onTTLExpired$3$RewardedCsmAdImpl$1();
                }
            });
        }

        public final /* bridge */ /* synthetic */ void onAdError(AdPresenter adPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedCsmAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedCsmAdImpl.C88351.this.lambda$onAdError$5$RewardedCsmAdImpl$1();
                }
            });
        }

        public final /* bridge */ /* synthetic */ void onAdClicked(AdPresenter adPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedCsmAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedCsmAdImpl.C88351.this.lambda$onAdClicked$4$RewardedCsmAdImpl$1();
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public final EventListener eventListener;
    /* access modifiers changed from: private */
    public final Handler handler;
    private final Logger logger;
    private final RewardedCsmAdPresenter rewardedAdPresenter;

    public final void setCloseButtonEnabled(boolean z) {
    }

    public RewardedCsmAdImpl(Handler handler2, Logger logger2, RewardedCsmAdPresenter rewardedCsmAdPresenter, EventListener eventListener2) {
        this.handler = (Handler) Objects.requireNonNull(handler2);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.rewardedAdPresenter = (RewardedCsmAdPresenter) Objects.requireNonNull(rewardedCsmAdPresenter);
        this.eventListener = (EventListener) Objects.requireNonNull(eventListener2);
        rewardedCsmAdPresenter.setRewardedAdListener(this.csmAdPresenterListener);
    }

    public final String getAdSpaceId() {
        return this.rewardedAdPresenter.getAdSpaceId();
    }

    public final String getSessionId() {
        return this.rewardedAdPresenter.getSessionId();
    }

    public final String getCreativeId() {
        return this.rewardedAdPresenter.getCreativeId();
    }

    public final boolean isAvailableForPresentation() {
        Handler handler2 = this.handler;
        RewardedCsmAdPresenter rewardedCsmAdPresenter = this.rewardedAdPresenter;
        rewardedCsmAdPresenter.getClass();
        return ((Boolean) Threads.runOnHandlerThreadBlocking(handler2, new Supplier() {
            public final Object get() {
                return Boolean.valueOf(RewardedCsmAdPresenter.this.isValid());
            }
        })).booleanValue();
    }

    public final void showAdInternal() {
        Threads.runOnHandlerThreadBlocking(this.handler, (Runnable) new Runnable() {
            public final void run() {
                RewardedCsmAdImpl.this.lambda$showAdInternal$0$RewardedCsmAdImpl();
            }
        });
    }

    public /* synthetic */ void lambda$showAdInternal$0$RewardedCsmAdImpl() {
        if (this.rewardedAdPresenter.isValid()) {
            this.rewardedAdPresenter.showAd();
        } else {
            this.logger.error(LogDomain.REWARDED, "RewardedInterstitialAd is already shown on screen or expired. Please request a new one.", new Object[0]);
        }
    }
}
