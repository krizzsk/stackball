package com.smaato.sdk.rewarded;

import android.content.Context;
import android.os.Handler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.RewardedAdPresenter;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Supplier;
import com.smaato.sdk.rewarded.RewardedInterstitialAdImpl;
import com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository;
import com.smaato.sdk.rewarded.widget.RewardedInterstitialAdActivity;

final class RewardedInterstitialAdImpl extends RewardedInterstitialAd {
    private boolean closeButtonEnabled = false;
    private final Context context;
    /* access modifiers changed from: private */
    public final EventListener eventListener;
    /* access modifiers changed from: private */
    public final Handler handler;
    private final Logger logger;
    private final RetainedAdPresenterRepository retainedAdPresenterRepository;
    private final RewardedAdPresenter rewardedAdPresenter;
    private final Supplier<String> uniqueKeySupplier;
    private final RewardedAdPresenter.Listener videoAdPresenterListener = new RewardedAdPresenter.Listener() {
        public final /* bridge */ /* synthetic */ void onAdImpressed(AdPresenter adPresenter) {
        }

        public final void onStart(RewardedAdPresenter rewardedAdPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedInterstitialAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedInterstitialAdImpl.C88241.this.lambda$onStart$0$RewardedInterstitialAdImpl$1();
                }
            });
        }

        public /* synthetic */ void lambda$onStart$0$RewardedInterstitialAdImpl$1() {
            RewardedInterstitialAdImpl.this.eventListener.onAdStarted(RewardedInterstitialAdImpl.this);
        }

        public final void onClose(RewardedAdPresenter rewardedAdPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedInterstitialAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedInterstitialAdImpl.C88241.this.lambda$onClose$1$RewardedInterstitialAdImpl$1();
                }
            });
        }

        public /* synthetic */ void lambda$onClose$1$RewardedInterstitialAdImpl$1() {
            RewardedInterstitialAdImpl.this.eventListener.onAdClosed(RewardedInterstitialAdImpl.this);
        }

        public final void onCompleted(RewardedAdPresenter rewardedAdPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedInterstitialAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedInterstitialAdImpl.C88241.this.lambda$onCompleted$2$RewardedInterstitialAdImpl$1();
                }
            });
        }

        public /* synthetic */ void lambda$onCompleted$2$RewardedInterstitialAdImpl$1() {
            RewardedInterstitialAdImpl.this.eventListener.onAdReward(RewardedInterstitialAdImpl.this);
        }

        public /* synthetic */ void lambda$onTTLExpired$3$RewardedInterstitialAdImpl$1() {
            RewardedInterstitialAdImpl.this.eventListener.onAdTTLExpired(RewardedInterstitialAdImpl.this);
        }

        public /* synthetic */ void lambda$onAdClicked$4$RewardedInterstitialAdImpl$1() {
            RewardedInterstitialAdImpl.this.eventListener.onAdClicked(RewardedInterstitialAdImpl.this);
        }

        public /* synthetic */ void lambda$onAdError$5$RewardedInterstitialAdImpl$1() {
            RewardedInterstitialAdImpl.this.eventListener.onAdError(RewardedInterstitialAdImpl.this, RewardedError.INTERNAL_ERROR);
        }

        public final /* bridge */ /* synthetic */ void onTTLExpired(AdPresenter adPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedInterstitialAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedInterstitialAdImpl.C88241.this.lambda$onTTLExpired$3$RewardedInterstitialAdImpl$1();
                }
            });
        }

        public final /* bridge */ /* synthetic */ void onAdError(AdPresenter adPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedInterstitialAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedInterstitialAdImpl.C88241.this.lambda$onAdError$5$RewardedInterstitialAdImpl$1();
                }
            });
        }

        public final /* bridge */ /* synthetic */ void onAdClicked(AdPresenter adPresenter) {
            Threads.ensureInvokedOnHandlerThread(RewardedInterstitialAdImpl.this.handler, new Runnable() {
                public final void run() {
                    RewardedInterstitialAdImpl.C88241.this.lambda$onAdClicked$4$RewardedInterstitialAdImpl$1();
                }
            });
        }
    };

    /* JADX WARNING: type inference failed for: r8v0, types: [com.smaato.sdk.core.util.fi.Supplier<java.lang.String>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    RewardedInterstitialAdImpl(android.content.Context r2, android.os.Handler r3, com.smaato.sdk.core.log.Logger r4, com.smaato.sdk.core.p248ad.RewardedAdPresenter r5, com.smaato.sdk.rewarded.EventListener r6, com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository r7, com.smaato.sdk.core.util.p251fi.Supplier<java.lang.String> r8) {
        /*
            r1 = this;
            r1.<init>()
            com.smaato.sdk.rewarded.RewardedInterstitialAdImpl$1 r0 = new com.smaato.sdk.rewarded.RewardedInterstitialAdImpl$1
            r0.<init>()
            r1.videoAdPresenterListener = r0
            r0 = 0
            r1.closeButtonEnabled = r0
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            r1.context = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            android.os.Handler r2 = (android.os.Handler) r2
            r1.handler = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.log.Logger r2 = (com.smaato.sdk.core.log.Logger) r2
            r1.logger = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.core.ad.RewardedAdPresenter r2 = (com.smaato.sdk.core.p248ad.RewardedAdPresenter) r2
            r1.rewardedAdPresenter = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.rewarded.EventListener r2 = (com.smaato.sdk.rewarded.EventListener) r2
            r1.eventListener = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r7)
            com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository r2 = (com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository) r2
            r1.retainedAdPresenterRepository = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r8)
            com.smaato.sdk.core.util.fi.Supplier r2 = (com.smaato.sdk.core.util.p251fi.Supplier) r2
            r1.uniqueKeySupplier = r2
            com.smaato.sdk.core.ad.RewardedAdPresenter$Listener r2 = r1.videoAdPresenterListener
            r5.setListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.rewarded.RewardedInterstitialAdImpl.<init>(android.content.Context, android.os.Handler, com.smaato.sdk.core.log.Logger, com.smaato.sdk.core.ad.RewardedAdPresenter, com.smaato.sdk.rewarded.EventListener, com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository, com.smaato.sdk.core.util.fi.Supplier):void");
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

    public final void setCloseButtonEnabled(boolean z) {
        Threads.runOnHandlerThreadBlocking(this.handler, new Supplier(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final Object get() {
                return RewardedInterstitialAdImpl.this.lambda$setCloseButtonEnabled$0$RewardedInterstitialAdImpl(this.f$1);
            }
        });
    }

    public /* synthetic */ Boolean lambda$setCloseButtonEnabled$0$RewardedInterstitialAdImpl(boolean z) {
        this.closeButtonEnabled = z;
        return Boolean.valueOf(z);
    }

    public final boolean isAvailableForPresentation() {
        Handler handler2 = this.handler;
        RewardedAdPresenter rewardedAdPresenter2 = this.rewardedAdPresenter;
        rewardedAdPresenter2.getClass();
        return ((Boolean) Threads.runOnHandlerThreadBlocking(handler2, new Supplier() {
            public final Object get() {
                return Boolean.valueOf(RewardedAdPresenter.this.isValid());
            }
        })).booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void showAdInternal() {
        Threads.runOnHandlerThreadBlocking(this.handler, (Runnable) new Runnable() {
            public final void run() {
                RewardedInterstitialAdImpl.this.lambda$showAdInternal$1$RewardedInterstitialAdImpl();
            }
        });
    }

    public /* synthetic */ void lambda$showAdInternal$1$RewardedInterstitialAdImpl() {
        if (this.rewardedAdPresenter.isValid()) {
            String str = this.uniqueKeySupplier.get();
            this.retainedAdPresenterRepository.put(this.rewardedAdPresenter, str);
            RewardedInterstitialAdActivity.start(this.context, str, this.closeButtonEnabled);
            return;
        }
        this.logger.debug(LogDomain.REWARDED, "RewardedInterstitialAd is already shown on screen or expired. Please request new one.", new Object[0]);
    }
}
