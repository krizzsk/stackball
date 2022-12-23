package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

/* renamed from: com.ironsource.mediationsdk.A */
public final class C5543A {

    /* renamed from: a */
    private static final C5543A f12778a = new C5543A();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public InterstitialListener f12779b = null;

    private C5543A() {
    }

    /* renamed from: a */
    public static synchronized C5543A m13206a() {
        C5543A a;
        synchronized (C5543A.class) {
            a = f12778a;
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo41280a(final IronSourceError ironSourceError) {
        if (this.f12779b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5543A.this.f12779b.onInterstitialAdLoadFailed(ironSourceError);
                        C5543A a = C5543A.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final synchronized void mo41281a(InterstitialListener interstitialListener) {
        this.f12779b = interstitialListener;
    }

    /* renamed from: b */
    public final synchronized void mo41282b() {
        if (this.f12779b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5543A.this.f12779b.onInterstitialAdReady();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final synchronized void mo41283b(final IronSourceError ironSourceError) {
        if (this.f12779b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5543A.this.f12779b.onInterstitialAdShowFailed(ironSourceError);
                        C5543A a = C5543A.this;
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final synchronized void mo41284c() {
        if (this.f12779b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5543A.this.f12779b.onInterstitialAdOpened();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final synchronized void mo41285d() {
        if (this.f12779b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5543A.this.f12779b.onInterstitialAdClosed();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final synchronized void mo41286e() {
        if (this.f12779b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5543A.this.f12779b.onInterstitialAdShowSucceeded();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public final synchronized void mo41287f() {
        if (this.f12779b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    synchronized (this) {
                        C5543A.this.f12779b.onInterstitialAdClicked();
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
                    }
                }
            });
        }
    }
}
