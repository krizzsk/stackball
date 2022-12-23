package com.iab.omid.library.adcolony.p092d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.a */
public final class C4576a {
    /* renamed from: a */
    public static String m9587a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m9588b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m9589c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m9590d() {
        JSONObject jSONObject = new JSONObject();
        C4577b.m9597a(jSONObject, "deviceType", m9587a());
        C4577b.m9597a(jSONObject, "osVersion", m9588b());
        C4577b.m9597a(jSONObject, "os", m9589c());
        return jSONObject;
    }
}
