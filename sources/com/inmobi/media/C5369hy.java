package com.inmobi.media;

/* renamed from: com.inmobi.media.hy */
/* compiled from: SessionManager */
public class C5369hy {

    /* renamed from: g */
    private static final String f12293g = C5369hy.class.getSimpleName();

    /* renamed from: a */
    long f12294a;

    /* renamed from: b */
    long f12295b;

    /* renamed from: c */
    long f12296c;

    /* renamed from: d */
    long f12297d;

    /* renamed from: e */
    long f12298e;

    /* renamed from: f */
    long f12299f;

    /* renamed from: com.inmobi.media.hy$a */
    /* compiled from: SessionManager */
    static class C5370a {

        /* renamed from: a */
        static final C5369hy f12300a = new C5369hy((byte) 0);
    }

    /* synthetic */ C5369hy(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5369hy m12420a() {
        return C5370a.f12300a;
    }

    private C5369hy() {
        this.f12294a = 0;
        this.f12295b = 0;
        this.f12296c = 0;
        this.f12297d = 0;
        this.f12298e = 0;
        this.f12299f = 0;
    }

    /* renamed from: b */
    static void m12421b() {
        C5371hz.m12430a();
        if (C5371hz.m12431d().sessionEnabled) {
            C5349hk.m12370a().f12264c = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo40732a(long j) {
        int a = C5342he.m12326a();
        if (a == 0) {
            m12424f(j);
        } else if (a == 1) {
            m12422d(j);
        }
    }

    /* renamed from: b */
    public final void mo40733b(long j) {
        int a = C5342he.m12326a();
        if (a == 0) {
            m12425g(j);
        } else if (a == 1) {
            m12423e(j);
        }
    }

    /* renamed from: d */
    private void m12422d(long j) {
        this.f12294a += j;
    }

    /* renamed from: e */
    private void m12423e(long j) {
        this.f12295b += j;
    }

    /* renamed from: f */
    private void m12424f(long j) {
        this.f12296c += j;
    }

    /* renamed from: g */
    private void m12425g(long j) {
        this.f12297d += j;
    }

    /* renamed from: c */
    public final void mo40734c(long j) {
        this.f12298e += j;
    }
}
