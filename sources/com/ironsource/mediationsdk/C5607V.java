package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

/* renamed from: com.ironsource.mediationsdk.V */
public final class C5607V {

    /* renamed from: b */
    private static final C5607V f13199b = new C5607V();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyRewardedVideoListener f13200a = null;

    private C5607V() {
    }

    /* renamed from: a */
    public static C5607V m13667a() {
        return f13199b;
    }

    /* renamed from: a */
    public final void mo41612a(final String str, final IronSourceError ironSourceError) {
        if (this.f13200a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5607V.this.f13200a.onRewardedVideoAdLoadFailed(str, ironSourceError);
                    C5607V v = C5607V.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo41613b(final String str, final IronSourceError ironSourceError) {
        if (this.f13200a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5607V.this.f13200a.onRewardedVideoAdShowFailed(str, ironSourceError);
                    C5607V v = C5607V.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
