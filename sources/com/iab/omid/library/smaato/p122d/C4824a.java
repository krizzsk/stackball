package com.iab.omid.library.smaato.p122d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.d.a */
public final class C4824a {
    /* renamed from: a */
    public static String m10687a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m10688b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m10689c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m10690d() {
        JSONObject jSONObject = new JSONObject();
        C4825b.m10696a(jSONObject, "deviceType", m10687a());
        C4825b.m10696a(jSONObject, "osVersion", m10688b());
        C4825b.m10696a(jSONObject, "os", m10689c());
        return jSONObject;
    }
}
