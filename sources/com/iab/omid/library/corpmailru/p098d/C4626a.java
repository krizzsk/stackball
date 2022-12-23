package com.iab.omid.library.corpmailru.p098d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.d.a */
public final class C4626a {
    /* renamed from: a */
    public static String m9811a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m9812b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m9813c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m9814d() {
        JSONObject jSONObject = new JSONObject();
        C4627b.m9821a(jSONObject, "deviceType", m9811a());
        C4627b.m9821a(jSONObject, "osVersion", m9812b());
        C4627b.m9821a(jSONObject, "os", m9813c());
        return jSONObject;
    }
}
