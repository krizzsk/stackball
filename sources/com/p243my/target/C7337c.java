package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7524l3;
import com.p243my.target.C7618q2;
import org.json.JSONObject;

/* renamed from: com.my.target.c */
public abstract class C7337c<T extends C7618q2> {
    /* renamed from: a */
    public static JSONObject m18819a(String str, C7524l3.C7525a aVar, C7524l3 l3Var) {
        if (str != null) {
            str = str.trim();
        }
        if (str == null || "".equals(str)) {
            C7374e0.m18989a("parsing ad response: empty data");
            return null;
        }
        C7374e0.m18989a("Converting to JSON...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            m18821b(jSONObject);
            boolean optBoolean = jSONObject.optBoolean("sdk_ms", false);
            aVar.mo50805a(optBoolean);
            l3Var.mo50799a(optBoolean);
            C7374e0.m18989a("done");
            if (m18820a(jSONObject)) {
                return jSONObject;
            }
            C7374e0.m18989a("invalid json version");
            return null;
        } catch (Throwable th) {
            C7374e0.m18989a("parsing ad response error: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m18820a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("version");
            C7374e0.m18989a("json version: " + string);
            int indexOf = string.indexOf(".");
            return indexOf > 0 && Integer.parseInt(string.substring(0, indexOf), 10) == 2;
        } catch (Throwable th) {
            C7374e0.m18989a("Check version failed: " + th.getMessage());
        }
    }

    /* renamed from: b */
    public static void m18821b(JSONObject jSONObject) {
        if (!C7374e0.f18489a && jSONObject.optBoolean("sdk_debug_mode", false)) {
            C7374e0.f18489a = true;
        }
    }

    public static boolean isVast(String str) {
        String trim = str.trim();
        return trim.startsWith("<VAST") || trim.startsWith("<?xml");
    }

    /* renamed from: a */
    public abstract T mo49776a(String str, C7617q1 q1Var, T t, C7298a aVar, C7524l3.C7525a aVar2, C7524l3 l3Var, Context context);
}
