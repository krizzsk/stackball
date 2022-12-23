package com.p243my.target;

/* renamed from: com.my.target.r1 */
public class C7631r1 {

    /* renamed from: a */
    public static final C7631r1 f19276a = new C7631r1(4096);

    /* renamed from: b */
    public static final C7631r1 f19277b = new C7631r1(64);

    /* renamed from: c */
    public final boolean f19278c;

    /* renamed from: d */
    public final boolean f19279d;

    /* renamed from: e */
    public final boolean f19280e;

    /* renamed from: f */
    public final boolean f19281f;

    /* renamed from: g */
    public final boolean f19282g;

    /* renamed from: h */
    public final boolean f19283h;

    /* renamed from: i */
    public final boolean f19284i;

    /* renamed from: j */
    public final boolean f19285j;

    /* renamed from: k */
    public final boolean f19286k;

    /* renamed from: l */
    public final boolean f19287l;

    /* renamed from: m */
    public final boolean f19288m;

    /* renamed from: n */
    public final boolean f19289n;

    /* renamed from: o */
    public final boolean f19290o;

    /* renamed from: p */
    public final int f19291p;

    public C7631r1(int i) {
        this.f19291p = i;
        boolean z = false;
        this.f19278c = (i & 1) == 1;
        this.f19279d = (i & 2) == 2;
        this.f19280e = (i & 4) == 4;
        this.f19281f = (i & 8) == 8;
        this.f19282g = (i & 16) == 16;
        this.f19283h = (i & 32) == 32;
        this.f19284i = (i & 64) == 64;
        this.f19285j = (i & 128) == 128;
        this.f19286k = (i & 256) == 256;
        this.f19287l = (i & 512) == 512;
        this.f19288m = (i & 1024) == 1024;
        this.f19289n = (i & 2048) == 2048;
        this.f19290o = (i & 4096) == 4096 ? true : z;
    }

    /* renamed from: a */
    public static C7631r1 m20228a(int i) {
        return new C7631r1(i);
    }

    /* renamed from: a */
    public int mo51444a() {
        return this.f19291p;
    }
}
