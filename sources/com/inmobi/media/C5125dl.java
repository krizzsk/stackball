package com.inmobi.media;

import android.app.Application;
import android.view.View;
import android.webkit.WebView;
import com.moat.analytics.mobile.inm.MoatAnalytics;
import com.moat.analytics.mobile.inm.MoatFactory;
import com.moat.analytics.mobile.inm.MoatOptions;
import com.moat.analytics.mobile.inm.NativeDisplayTracker;
import com.moat.analytics.mobile.inm.ReactiveVideoTracker;
import com.moat.analytics.mobile.inm.ReactiveVideoTrackerPlugin;
import com.moat.analytics.mobile.inm.WebAdTracker;
import java.util.Map;

/* renamed from: com.inmobi.media.dl */
/* compiled from: InMobiMoatFactory */
public class C5125dl {

    /* renamed from: a */
    private static final String f11757a = C5125dl.class.getSimpleName();

    /* renamed from: b */
    private static boolean f11758b = false;

    /* renamed from: a */
    public static void m11693a(Application application) {
        if (!f11758b) {
            try {
                MoatOptions moatOptions = new MoatOptions();
                boolean z = false;
                moatOptions.loggingEnabled = false;
                C5371hz.m12430a();
                if (!C5371hz.m12431d().locationEnabled) {
                    z = true;
                }
                moatOptions.disableLocationServices = z;
                Boolean f = C5359ht.m12386a().mo40721f();
                if (f == null || f.booleanValue()) {
                    moatOptions.disableAdIdCollection = true;
                }
                MoatAnalytics.getInstance().start(moatOptions, application);
                f11758b = true;
            } catch (Exception e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        }
    }

    /* renamed from: a */
    static WebAdTracker m11692a(Application application, WebView webView) {
        if (!f11758b) {
            m11693a(application);
        }
        return MoatFactory.create().createWebAdTracker(webView);
    }

    /* renamed from: a */
    static NativeDisplayTracker m11690a(Application application, String str, View view, Map<String, String> map) {
        if (!f11758b) {
            m11693a(application);
        }
        MoatAnalytics.getInstance().prepareNativeDisplayTracking(str);
        return MoatFactory.create().createNativeDisplayTracker(view, map);
    }

    /* renamed from: a */
    static ReactiveVideoTracker m11691a(Application application, String str) {
        if (!f11758b) {
            m11693a(application);
        }
        return (ReactiveVideoTracker) MoatFactory.create().createCustomTracker(new ReactiveVideoTrackerPlugin(str));
    }
}
