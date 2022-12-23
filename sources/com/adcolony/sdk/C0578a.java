package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0580a0;

/* renamed from: com.adcolony.sdk.a */
class C0578a {

    /* renamed from: a */
    private static Context f180a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C0693i f181b;

    /* renamed from: c */
    static boolean f182c;

    /* renamed from: d */
    static boolean f183d;

    /* renamed from: com.adcolony.sdk.a$a */
    class C0579a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f184a;

        C0579a(Context context) {
            this.f184a = context;
        }

        public void run() {
            C0578a.f181b.mo9592a(this.f184a, (C0645d0) null);
        }
    }

    C0578a() {
    }

    /* renamed from: b */
    static Context m141b() {
        return f180a;
    }

    /* renamed from: c */
    static C0693i m143c() {
        if (!m145e()) {
            Context b = m141b();
            if (b == null) {
                return new C0693i();
            }
            f181b = new C0693i();
            C0897z0 c = C0894y.m1161c(b.getFilesDir().getAbsolutePath() + "/adc3/AppInfo");
            C0895y0 a = C0894y.m1136a(c, "zoneIds");
            f181b.mo9587a(new AdColonyAppOptions().mo9268a(C0894y.m1169h(c, "appId")).mo9269a(C0894y.m1150a(a)), false);
        }
        return f181b;
    }

    /* renamed from: d */
    static boolean m144d() {
        return f180a != null;
    }

    /* renamed from: e */
    static boolean m145e() {
        return f181b != null;
    }

    /* renamed from: f */
    static boolean m146f() {
        return f182c;
    }

    /* renamed from: g */
    static void m147g() {
        m143c().mo9617u().mo9552j();
    }

    /* renamed from: a */
    static void m138a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z) {
        m137a(context);
        f183d = true;
        if (f181b == null) {
            f181b = new C0693i();
            adColonyAppOptions.mo9272b(context);
            f181b.mo9587a(adColonyAppOptions, z);
        } else {
            adColonyAppOptions.mo9272b(context);
            f181b.mo9586a(adColonyAppOptions);
        }
        if (!C0849u0.m915a((Runnable) new C0579a(context))) {
            new C0580a0.C0581a().mo9419a("Executing ADC.configure queryAdvertisingId failed").mo9421a(C0580a0.f192j);
        }
        new C0580a0.C0581a().mo9419a("Configuring AdColony").mo9421a(C0580a0.f187e);
        f181b.mo9596c(false);
        f181b.mo9569A().mo9803g(false);
        f181b.mo9599d(true);
        f181b.mo9569A().mo9796c(false);
        f181b.mo9569A().mo9798d(true);
    }

    /* renamed from: b */
    static void m142b(String str, C0685f0 f0Var) {
        m143c().mo9617u().mo9544b(str, f0Var);
    }

    /* renamed from: a */
    static void m137a(Context context) {
        f180a = context;
    }

    /* renamed from: a */
    static void m139a(String str, C0685f0 f0Var) {
        m143c().mo9617u().mo9543a(str, f0Var);
    }

    /* renamed from: a */
    static C0685f0 m135a(String str, C0685f0 f0Var, boolean z) {
        m143c().mo9617u().mo9543a(str, f0Var);
        return f0Var;
    }

    /* renamed from: a */
    static void m140a(String str, C0897z0 z0Var) {
        if (z0Var == null) {
            z0Var = C0894y.m1151b();
        }
        C0894y.m1148a(z0Var, "m_type", str);
        m143c().mo9617u().mo9546c(z0Var);
    }
}
