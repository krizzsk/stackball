package com.moat.analytics.mobile.inm;

import android.util.Log;
import android.view.View;

/* renamed from: com.moat.analytics.mobile.inm.p */
class C7261p {
    C7261p() {
    }

    /* renamed from: a */
    static String m18542a(View view) {
        if (view == null) {
            return "null";
        }
        return view.getClass().getSimpleName() + "@" + view.hashCode();
    }

    /* renamed from: a */
    private static String m18543a(String str) {
        return "Moat".concat(String.valueOf(str));
    }

    /* renamed from: a */
    static void m18544a(int i, String str, Object obj, String str2) {
        if (C7276w.m18582a().f18243b) {
            String a = m18543a(str);
            if (obj == null) {
                Log.println(i, a, String.format("message = %s", new Object[]{str2}));
                return;
            }
            Log.println(i, a, String.format("id = %s, message = %s", new Object[]{Integer.valueOf(obj.hashCode()), str2}));
        }
    }

    /* renamed from: a */
    static void m18545a(String str, int i, String str2, Object obj, String str3) {
        m18544a(i, str2, obj, str3);
        m18547a(str, str3);
    }

    /* renamed from: a */
    static void m18546a(String str, Object obj, String str2, Throwable th) {
        if (C7276w.m18582a().f18243b) {
            Log.e(m18543a(str), String.format("id = %s, message = %s", new Object[]{Integer.valueOf(obj.hashCode()), str2}), th);
        }
    }

    /* renamed from: a */
    static void m18547a(String str, String str2) {
        if (!C7276w.m18582a().f18243b && ((C7250k) MoatAnalytics.getInstance()).f18187a) {
            int i = 2;
            if (str.equals("[ERROR] ")) {
                i = 6;
            }
            Log.println(i, "MoatAnalytics", str + str2);
        }
    }

    /* renamed from: b */
    static void m18548b(int i, String str, Object obj, String str2) {
        if (C7276w.m18582a().f18244c) {
            String a = m18543a(str);
            Object[] objArr = new Object[2];
            objArr[0] = obj == null ? "null" : Integer.valueOf(obj.hashCode());
            objArr[1] = str2;
            Log.println(i, a, String.format("id = %s, message = %s", objArr));
        }
    }
}
