package com.iab.omid.library.inmobi.p104d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.d.a */
public final class C4675a {
    /* renamed from: a */
    public static String m10028a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m10029b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m10030c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m10031d() {
        JSONObject jSONObject = new JSONObject();
        C4676b.m10037a(jSONObject, "deviceType", m10028a());
        C4676b.m10037a(jSONObject, "osVersion", m10029b());
        C4676b.m10037a(jSONObject, "os", m10030c());
        return jSONObject;
    }
}
