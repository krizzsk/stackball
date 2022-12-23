package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

/* renamed from: com.ironsource.mediationsdk.z */
public final class C5813z {

    /* renamed from: b */
    private static final C5813z f14129b = new C5813z();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyInterstitialListener f14130a = null;

    private C5813z() {
    }

    /* renamed from: a */
    public static C5813z m14382a() {
        return f14129b;
    }

    /* renamed from: a */
    public final void mo42145a(final String str, final IronSourceError ironSourceError) {
        if (this.f14130a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5813z.this.f14130a.onInterstitialAdLoadFailed(str, ironSourceError);
                    C5813z zVar = C5813z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo42146b(final String str, final IronSourceError ironSourceError) {
        if (this.f14130a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5813z.this.f14130a.onInterstitialAdShowFailed(str, ironSourceError);
                    C5813z zVar = C5813z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
