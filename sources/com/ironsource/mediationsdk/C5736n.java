package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.n */
public final class C5736n {

    /* renamed from: c */
    private static final C5736n f13805c = new C5736n();

    /* renamed from: a */
    InterstitialListener f13806a = null;

    /* renamed from: b */
    public int f13807b;

    /* renamed from: d */
    private Map<String, Long> f13808d = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, Boolean> f13809e = new HashMap();

    private C5736n() {
    }

    /* renamed from: a */
    public static synchronized C5736n m14120a() {
        C5736n nVar;
        synchronized (C5736n.class) {
            nVar = f13805c;
        }
        return nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14123a(String str, IronSourceError ironSourceError) {
        this.f13808d.put(str, Long.valueOf(System.currentTimeMillis()));
        InterstitialListener interstitialListener = this.f13806a;
        if (interstitialListener != null) {
            interstitialListener.onInterstitialAdLoadFailed(ironSourceError);
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
            logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError.toString() + ")", 1);
        }
    }

    /* renamed from: a */
    private boolean m14124a(String str) {
        if (!TextUtils.isEmpty(str) && this.f13809e.containsKey(str)) {
            return this.f13809e.get(str).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo41990a(final IronSourceError ironSourceError) {
        synchronized (this) {
            if (!m14124a("mediation")) {
                if (this.f13808d.containsKey("mediation")) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f13808d.get("mediation").longValue();
                    if (currentTimeMillis <= ((long) (this.f13807b * 1000))) {
                        this.f13809e.put("mediation", Boolean.TRUE);
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable("mediation") {
                            public final void run() {
                                C5736n.this.m14123a("mediation", ironSourceError);
                                C5736n.this.f13809e.put("mediation", Boolean.FALSE);
                            }
                        }, ((long) (this.f13807b * 1000)) - currentTimeMillis);
                    }
                }
                m14123a("mediation", ironSourceError);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo41991b() {
        boolean a;
        synchronized (this) {
            a = m14124a("mediation");
        }
        return a;
    }
}
