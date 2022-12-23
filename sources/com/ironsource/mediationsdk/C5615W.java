package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;

/* renamed from: com.ironsource.mediationsdk.W */
public final class C5615W {

    /* renamed from: a */
    private static final C5615W f13217a = new C5615W();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public RewardedVideoListener f13218b = null;

    private C5615W() {
    }

    /* renamed from: a */
    public static synchronized C5615W m13672a() {
        C5615W w;
        synchronized (C5615W.class) {
            w = f13217a;
        }
        return w;
    }

    /* renamed from: a */
    public final synchronized void mo41621a(final IronSourceError ironSourceError) {
        if (this.f13218b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5615W.this.f13218b.onRewardedVideoAdShowFailed(ironSourceError);
                        C5615W w = C5615W.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final synchronized void mo41622a(final Placement placement) {
        if (this.f13218b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5615W.this.f13218b.onRewardedVideoAdRewarded(placement);
                        C5615W w = C5615W.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + placement + ")", 1);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final synchronized void mo41623a(RewardedVideoListener rewardedVideoListener) {
        this.f13218b = rewardedVideoListener;
    }

    /* renamed from: a */
    public final synchronized void mo41624a(final boolean z) {
        if (this.f13218b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5615W.this.f13218b.onRewardedVideoAvailabilityChanged(z);
                        C5615W w = C5615W.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged() available=" + z, 1);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final synchronized void mo41625b() {
        if (this.f13218b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5615W.this.f13218b.onRewardedVideoAdOpened();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final synchronized void mo41626b(final Placement placement) {
        if (this.f13218b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5615W.this.f13218b.onRewardedVideoAdClicked(placement);
                        C5615W w = C5615W.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + placement + ")", 1);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final synchronized void mo41627c() {
        if (this.f13218b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5615W.this.f13218b.onRewardedVideoAdClosed();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final synchronized void mo41628d() {
        if (this.f13218b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5615W.this.f13218b.onRewardedVideoAdStarted();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final synchronized void mo41629e() {
        if (this.f13218b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5615W.this.f13218b.onRewardedVideoAdEnded();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
                    }
                }
            });
        }
    }
}
