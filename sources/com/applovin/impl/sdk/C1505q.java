package com.applovin.impl.sdk;

import android.util.Log;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1553o;

/* renamed from: com.applovin.impl.sdk.q */
public class C1505q {

    /* renamed from: a */
    private final C1469j f3680a;

    C1505q(C1469j jVar) {
        this.f3680a = jVar;
    }

    /* renamed from: a */
    private void m3339a(String str, String str2, boolean z) {
        int intValue;
        if (C1553o.m3554b(str2) && (intValue = ((Integer) this.f3680a.mo13088a(C1369c.f2892ai)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                String substring = str2.substring(i3, Math.min(length, i3 + intValue));
                if (z) {
                    Log.d(str, substring);
                } else {
                    mo13277b(str, substring);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m3340a() {
        return this.f3680a.mo13064C().mo12850e();
    }

    /* renamed from: c */
    public static void m3341c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    /* renamed from: f */
    public static void m3342f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: g */
    public static void m3343g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: h */
    public static void m3344h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: i */
    public static void m3345i(String str, String str2) {
        m3341c(str, str2, (Throwable) null);
    }

    /* renamed from: j */
    private void m3346j(String str, String str2) {
    }

    /* renamed from: a */
    public void mo13273a(String str, Boolean bool, String str2) {
        mo13274a(str, bool, str2, (Throwable) null);
    }

    /* renamed from: a */
    public void mo13274a(String str, Boolean bool, String str2, Throwable th) {
        if (m3340a()) {
            String str3 = "[" + str + "] " + str2;
            Log.e("AppLovinSdk", str3, th);
            m3346j("ERROR", str3 + " : " + th);
        }
        if (bool.booleanValue() && ((Boolean) this.f3680a.mo13088a(C1369c.f3068eB)).booleanValue() && this.f3680a.mo13075O() != null) {
            this.f3680a.mo13075O().mo12921a(str2, th);
        }
    }

    /* renamed from: a */
    public void mo13275a(String str, String str2) {
        if (m3340a()) {
            m3339a(str, str2, false);
        }
    }

    /* renamed from: a */
    public void mo13276a(String str, String str2, Throwable th) {
        if (m3340a()) {
            String str3 = "[" + str + "] " + str2;
            Log.w("AppLovinSdk", str3, th);
            m3346j("WARN", str3);
        }
    }

    /* renamed from: b */
    public void mo13277b(String str, String str2) {
        if (m3340a()) {
            String str3 = "[" + str + "] " + str2;
            Log.d("AppLovinSdk", str3);
            m3346j("DEBUG", str3);
        }
    }

    /* renamed from: b */
    public void mo13278b(String str, String str2, Throwable th) {
        mo13274a(str, true, str2, th);
    }

    /* renamed from: c */
    public void mo13279c(String str, String str2) {
        if (m3340a()) {
            String str3 = "[" + str + "] " + str2;
            Log.i("AppLovinSdk", str3);
            m3346j("INFO", str3);
        }
    }

    /* renamed from: d */
    public void mo13280d(String str, String str2) {
        mo13276a(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public void mo13281e(String str, String str2) {
        mo13278b(str, str2, (Throwable) null);
    }
}
