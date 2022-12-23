package com.iab.omid.library.oguryco.p116d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.d.a */
public final class C4775a {
    /* renamed from: a */
    public static String m10471a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m10472b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m10473c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m10474d() {
        JSONObject jSONObject = new JSONObject();
        C4776b.m10481a(jSONObject, "deviceType", m10471a());
        C4776b.m10481a(jSONObject, "osVersion", m10472b());
        C4776b.m10481a(jSONObject, "os", m10473c());
        return jSONObject;
    }
}
