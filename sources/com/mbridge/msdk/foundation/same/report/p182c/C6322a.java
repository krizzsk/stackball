package com.mbridge.msdk.foundation.same.report.p182c;

/* renamed from: com.mbridge.msdk.foundation.same.report.c.a */
/* compiled from: LogFileController */
public class C6322a {

    /* renamed from: a */
    public static final String f15695a = C6322a.class.getSimpleName();

    /* renamed from: b */
    private static C6322a f15696b = null;

    private C6322a() {
    }

    /* renamed from: a */
    public static synchronized C6322a m16023a() {
        C6322a aVar;
        synchronized (C6322a.class) {
            if (f15696b == null) {
                f15696b = new C6322a();
            }
            aVar = f15696b;
        }
        return aVar;
    }
}
