package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.hk */
public abstract class C9369hk {

    /* renamed from: a */
    protected static C9370a f23224a;

    /* renamed from: b */
    private static C9369hk f23225b;

    /* renamed from: a */
    public abstract void mo58155a(C9370a aVar);

    /* renamed from: b */
    public abstract boolean mo58156b();

    /* renamed from: com.tapjoy.internal.hk$a */
    public static class C9370a {

        /* renamed from: a */
        public final String f23226a;

        /* renamed from: b */
        public final String f23227b;

        /* renamed from: c */
        public final long f23228c = SystemClock.elapsedRealtime();

        /* renamed from: d */
        public final C9271fi f23229d = new C9271fi(60000);

        public C9370a(String str, String str2) {
            this.f23226a = str;
            this.f23227b = str2;
        }
    }

    /* renamed from: a */
    protected static void m25182a(C9369hk hkVar) {
        synchronized (C9369hk.class) {
            f23225b = hkVar;
            C9370a aVar = f23224a;
            if (aVar != null) {
                f23224a = null;
                hkVar.mo58155a(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m25183a(String str, String str2) {
        synchronized (C9369hk.class) {
            C9370a aVar = new C9370a(str, str2);
            if (f23225b != null) {
                f23224a = null;
                f23225b.mo58155a(aVar);
            } else {
                f23224a = aVar;
            }
        }
    }

    /* renamed from: c */
    public static boolean m25184c() {
        C9369hk hkVar = f23225b;
        if (hkVar != null && hkVar.mo58156b()) {
            return true;
        }
        C9370a aVar = f23224a;
        if (aVar == null || aVar.f23229d.mo58125a()) {
            return false;
        }
        return true;
    }
}
