package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import com.vungle.warren.model.Cookie;

/* renamed from: com.my.tracker.obfuscated.k0 */
public final class C7823k0 {

    /* renamed from: b */
    private static volatile C7823k0 f19926b;

    /* renamed from: a */
    private final SharedPreferences f19927a;

    private C7823k0(SharedPreferences sharedPreferences) {
        this.f19927a = sharedPreferences;
    }

    /* renamed from: a */
    public static C7823k0 m21211a(Context context) {
        C7823k0 k0Var = f19926b;
        if (k0Var == null) {
            synchronized (C7823k0.class) {
                k0Var = f19926b;
                if (k0Var == null) {
                    k0Var = new C7823k0(context.getSharedPreferences("mytracker_prefs", 0));
                    f19926b = k0Var;
                }
            }
        }
        return k0Var;
    }

    /* renamed from: a */
    public String mo52300a() {
        return mo52311c("appVersion");
    }

    /* renamed from: a */
    public void mo52301a(int i) {
        mo52303a("appSetIdScope", (long) i);
    }

    /* renamed from: a */
    public void mo52302a(long j) {
        mo52303a("installTimestamp", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52303a(String str, long j) {
        try {
            this.f19927a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            C7877u0.m21548a("PrefsCache error: ", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52304a(String str, String str2) {
        try {
            this.f19927a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            C7877u0.m21548a("PrefsCache error: ", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52305a(String str, boolean z) {
        try {
            this.f19927a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            C7877u0.m21548a("PrefsCache error: ", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo52306a(String str) {
        try {
            return this.f19927a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo52307b(String str) {
        try {
            return this.f19927a.getLong(str, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public String mo52308b() {
        return mo52311c("appId");
    }

    /* renamed from: b */
    public void mo52309b(long j) {
        mo52303a("lastUpdateTimestamp", j);
    }

    /* renamed from: c */
    public String mo52310c() {
        return mo52311c(Cookie.APP_SET_ID);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo52311c(String str) {
        try {
            return this.f19927a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    public void mo52312c(long j) {
        mo52303a("lastStopTimeStampSec", j);
    }

    /* renamed from: d */
    public String mo52313d() {
        return mo52311c("appVersionName");
    }

    /* renamed from: d */
    public void mo52314d(String str) {
        mo52304a("appVersion", str);
    }

    /* renamed from: e */
    public String mo52315e() {
        return mo52311c("appsHash");
    }

    /* renamed from: e */
    public void mo52316e(String str) {
        mo52304a("appId", str);
    }

    /* renamed from: f */
    public String mo52317f() {
        return mo52311c("attribution");
    }

    /* renamed from: f */
    public void mo52318f(String str) {
        mo52304a(Cookie.APP_SET_ID, str);
    }

    /* renamed from: g */
    public String mo52319g() {
        return mo52311c("firebaseAppInstanceId");
    }

    /* renamed from: g */
    public void mo52320g(String str) {
        mo52304a("appVersionName", str);
    }

    /* renamed from: h */
    public long mo52321h() {
        return mo52307b("installTimestamp");
    }

    /* renamed from: h */
    public void mo52322h(String str) {
        mo52304a("appsHash", str);
    }

    /* renamed from: i */
    public String mo52323i() {
        return mo52311c("instanceId");
    }

    /* renamed from: i */
    public void mo52324i(String str) {
        mo52304a("attribution", str);
    }

    /* renamed from: j */
    public long mo52325j() {
        return mo52307b("lastUpdateTimestamp");
    }

    /* renamed from: j */
    public void mo52326j(String str) {
        mo52304a("firebaseAppInstanceId", str);
    }

    /* renamed from: k */
    public String mo52327k() {
        return mo52311c("mac");
    }

    /* renamed from: k */
    public void mo52328k(String str) {
        mo52304a("instanceId", str);
    }

    /* renamed from: l */
    public String mo52329l() {
        return mo52311c("referrer");
    }

    /* renamed from: l */
    public void mo52330l(String str) {
        mo52304a("mac", str);
    }

    /* renamed from: m */
    public long mo52331m() {
        long b = mo52307b("lastStopTimeStampSec");
        mo52303a("lastStopTimeStampSec", 0);
        return b;
    }

    /* renamed from: m */
    public void mo52332m(String str) {
        mo52304a("referrer", str);
    }

    /* renamed from: n */
    public boolean mo52333n() {
        return mo52306a("apiReferrerSent");
    }

    /* renamed from: o */
    public boolean mo52334o() {
        return mo52306a("preinstallRead");
    }

    /* renamed from: p */
    public boolean mo52335p() {
        return mo52306a("referrerSent");
    }

    /* renamed from: q */
    public void mo52336q() {
        mo52305a("apiReferrerSent", true);
    }

    /* renamed from: r */
    public void mo52337r() {
        mo52305a("preinstallRead", true);
    }

    /* renamed from: s */
    public void mo52338s() {
        mo52305a("referrerSent", true);
    }
}
