package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.v */
public final class C9503v {

    /* renamed from: a */
    private static String f23608a = "pool.ntp.org";

    /* renamed from: b */
    private static long f23609b = 20000;

    /* renamed from: c */
    private static volatile boolean f23610c = false;

    /* renamed from: d */
    private static volatile String f23611d;

    /* renamed from: e */
    private static volatile long f23612e;

    /* renamed from: f */
    private static volatile long f23613f;

    /* renamed from: g */
    private static volatile long f23614g;

    /* renamed from: h */
    private static volatile long f23615h;

    /* renamed from: i */
    private static volatile long f23616i;

    static {
        m25543a(false, "System", System.currentTimeMillis(), SystemClock.elapsedRealtime(), Long.MAX_VALUE);
    }

    /* renamed from: a */
    private static synchronized void m25543a(boolean z, String str, long j, long j2, long j3) {
        synchronized (C9503v.class) {
            f23610c = z;
            f23611d = str;
            f23612e = j;
            f23613f = j2;
            f23614g = j3;
            f23615h = f23612e - f23613f;
            f23616i = (SystemClock.elapsedRealtime() + f23615h) - System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public static boolean m25544a() {
        String str = f23608a;
        long j = f23609b;
        C9323gk gkVar = new C9323gk();
        if (!gkVar.mo58214a(str, (int) j)) {
            return false;
        }
        m25543a(true, "SNTP", gkVar.f23068a, gkVar.f23069b, gkVar.f23070c / 2);
        return true;
    }

    /* renamed from: b */
    public static long m25545b() {
        return SystemClock.elapsedRealtime() + f23615h;
    }

    /* renamed from: a */
    public static long m25542a(long j) {
        return j + f23615h;
    }

    /* renamed from: c */
    public static boolean m25546c() {
        return f23610c;
    }
}
