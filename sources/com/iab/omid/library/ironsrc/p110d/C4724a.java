package com.iab.omid.library.ironsrc.p110d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.a */
public final class C4724a {
    /* renamed from: a */
    public static String m10242a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m10243b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m10244c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m10245d() {
        JSONObject jSONObject = new JSONObject();
        C4725b.m10252a(jSONObject, "deviceType", m10242a());
        C4725b.m10252a(jSONObject, "osVersion", m10243b());
        C4725b.m10252a(jSONObject, "os", m10244c());
        return jSONObject;
    }
}
