package com.iab.omid.library.vungle.p128d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.d.a */
public final class C4873a {
    /* renamed from: a */
    public static String m10899a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m10900b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m10901c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m10902d() {
        JSONObject jSONObject = new JSONObject();
        C4874b.m10909a(jSONObject, "deviceType", m10899a());
        C4874b.m10909a(jSONObject, "osVersion", m10900b());
        C4874b.m10909a(jSONObject, "os", m10901c());
        return jSONObject;
    }
}
