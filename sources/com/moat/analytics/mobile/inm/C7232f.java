package com.moat.analytics.mobile.inm;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import com.moat.analytics.mobile.inm.C7276w;
import com.moat.analytics.mobile.inm.p240a.p242b.C7224a;
import java.lang.ref.WeakReference;

/* renamed from: com.moat.analytics.mobile.inm.f */
class C7232f {

    /* renamed from: a */
    private static WebAdTracker f18125a;

    /* renamed from: b */
    private static WeakReference<Activity> f18126b = new WeakReference<>((Object) null);

    C7232f() {
    }

    /* renamed from: a */
    private static void m18423a() {
        if (f18125a != null) {
            C7261p.m18544a(3, "GMAInterstitialHelper", f18126b.get(), "Stopping to track GMA interstitial");
            f18125a.stopTracking();
            f18125a = null;
        }
    }

    /* renamed from: a */
    static void m18424a(Activity activity) {
        try {
            if (C7276w.m18582a().f18242a != C7276w.C7284d.OFF) {
                if (!m18426b(activity)) {
                    m18423a();
                    f18126b = new WeakReference<>((Object) null);
                } else if (f18126b.get() == null || f18126b.get() != activity) {
                    View decorView = activity.getWindow().getDecorView();
                    if (decorView instanceof ViewGroup) {
                        C7224a<WebView> a = C7226ab.m18391a((ViewGroup) decorView, true);
                        if (a.mo49333c()) {
                            f18126b = new WeakReference<>(activity);
                            m18425a(a.mo49331b());
                            return;
                        }
                        C7261p.m18544a(3, "GMAInterstitialHelper", (Object) activity, "Sorry, no WebView in this activity");
                    }
                }
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: a */
    private static void m18425a(WebView webView) {
        C7261p.m18544a(3, "GMAInterstitialHelper", f18126b.get(), "Starting to track GMA interstitial");
        WebAdTracker createWebAdTracker = MoatFactory.create().createWebAdTracker(webView);
        f18125a = createWebAdTracker;
        createWebAdTracker.startTracking();
    }

    /* renamed from: b */
    private static boolean m18426b(Activity activity) {
        String name = activity.getClass().getName();
        C7261p.m18544a(3, "GMAInterstitialHelper", (Object) activity, "Activity name: ".concat(String.valueOf(name)));
        return name.contains(AdActivity.CLASS_NAME);
    }
}
