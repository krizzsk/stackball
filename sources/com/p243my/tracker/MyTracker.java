package com.p243my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.p243my.tracker.ads.AdEvent;
import com.p243my.tracker.miniapps.MiniAppEvent;
import com.p243my.tracker.obfuscated.C7791a0;
import com.p243my.tracker.obfuscated.C7877u0;
import com.p243my.tracker.obfuscated.C7880v0;
import com.p243my.tracker.obfuscated.C7882w0;
import com.p243my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.MyTracker */
public final class MyTracker {
    public static final String VERSION = "3.0.7";

    /* renamed from: a */
    private static final List<MyTrackerPluginConfig> f19765a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static volatile C7791a0 f19766b;

    /* renamed from: com.my.tracker.MyTracker$AttributionListener */
    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    /* renamed from: com.my.tracker.MyTracker$a */
    static final class C7786a {

        /* renamed from: a */
        static final C7880v0 f19767a;

        /* renamed from: b */
        static final MyTrackerParams f19768b;

        /* renamed from: c */
        static final MyTrackerConfig f19769c;

        static {
            C7880v0 s = C7880v0.m21560s();
            f19767a = s;
            f19769c = MyTrackerConfig.newConfig(s);
            f19768b = s.mo52542i();
        }
    }

    private MyTracker() {
    }

    public static void applyPlugin(MyTrackerPluginConfig myTrackerPluginConfig) {
        f19765a.add(myTrackerPluginConfig);
    }

    public static void flush() {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52173a();
        }
    }

    public static String getInstanceId(Context context) {
        return C7882w0.m21600a(context);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return C7786a.f19769c;
    }

    public static MyTrackerParams getTrackerParams() {
        return C7786a.f19768b;
    }

    public static String handleDeeplink(Intent intent) {
        C7791a0 a0Var = f19766b;
        if (a0Var != null) {
            return a0Var.mo52172a(intent);
        }
        C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    public static void initTracker(String str, Application application) {
        if (TextUtils.isEmpty(str)) {
            C7877u0.m21551b("MyTracker initialization failed: id can't be empty");
        } else if (f19766b != null) {
            C7877u0.m21553c("MyTracker has already been initialized");
        } else {
            synchronized (MyTracker.class) {
                if (f19766b != null) {
                    C7877u0.m21553c("MyTracker has already been initialized");
                    return;
                }
                C7880v0 v0Var = C7786a.f19767a;
                ArrayList arrayList = new ArrayList(f19765a);
                C7791a0 a = C7791a0.m21052a(str, v0Var, application);
                a.mo52182a((List<MyTrackerPluginConfig>) arrayList);
                f19766b = a;
            }
        }
    }

    public static boolean isDebugMode() {
        return C7877u0.m21550a();
    }

    public static void onActivityResult(int i, Intent intent) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52174a(i, intent);
        }
    }

    public static void onPurchasesUpdated(int i, List<Object> list) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52175a(i, list);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, (Handler) null);
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        C7786a.f19767a.mo52518a(attributionListener, handler);
    }

    public static void setDebugMode(boolean z) {
        C7877u0.m21549a(z);
    }

    public static void trackAdEvent(AdEvent adEvent) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52178a(adEvent);
        }
    }

    public static void trackEvent(String str) {
        trackEvent(str, (Map<String, String>) null);
    }

    public static void trackEvent(String str, Map<String, String> map) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52181a(str, map);
        }
    }

    public static void trackInviteEvent() {
        trackInviteEvent((Map<String, String>) null);
    }

    public static void trackInviteEvent(Map<String, String> map) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52183a(map);
        }
    }

    public static void trackLaunchManually(Activity activity) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52177a(activity);
        }
    }

    public static void trackLevelEvent() {
        trackLevelEvent((Map<String, String>) null);
    }

    public static void trackLevelEvent(int i, Map<String, String> map) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52176a(i, map);
        }
    }

    public static void trackLevelEvent(Map<String, String> map) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52186b(map);
        }
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, (Map<String, String>) null);
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52180a(str, str2, map);
        }
    }

    public static void trackMiniAppEvent(MiniAppEvent miniAppEvent) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52179a(miniAppEvent);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, (Map<String, String>) null);
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52184a(jSONObject, jSONObject2, str, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, (Map<String, String>) null);
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        C7791a0 a0Var = f19766b;
        if (a0Var == null) {
            C7877u0.m21551b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            a0Var.mo52185b(str, str2, map);
        }
    }
}
