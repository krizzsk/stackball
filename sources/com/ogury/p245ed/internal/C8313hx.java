package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.hx */
public final class C8313hx {

    /* renamed from: a */
    private final boolean f21475a;

    /* renamed from: b */
    private boolean f21476b;

    /* renamed from: c */
    private final String f21477c;

    /* renamed from: d */
    private boolean f21478d;

    /* renamed from: e */
    private boolean f21479e;

    /* renamed from: f */
    private boolean f21480f;

    private C8313hx(boolean z, boolean z2, String str, boolean z3) {
        C8467mq.m23881b(str, "url");
        this.f21475a = z;
        this.f21476b = z2;
        this.f21477c = str;
        this.f21478d = z3;
        this.f21479e = false;
        this.f21480f = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8313hx(boolean z, boolean z2, String str, boolean z3, int i) {
        this(z, z2, str, (i & 8) != 0 ? false : z3);
    }

    /* renamed from: a */
    public final boolean mo53713a() {
        return this.f21475a;
    }

    /* renamed from: b */
    public final boolean mo53714b() {
        return this.f21476b;
    }

    /* renamed from: c */
    public final String mo53715c() {
        return this.f21477c;
    }

    /* renamed from: d */
    public final boolean mo53716d() {
        return this.f21478d;
    }

    /* renamed from: e */
    public final void mo53717e() {
        this.f21478d = true;
    }

    /* renamed from: f */
    public final boolean mo53718f() {
        return this.f21479e;
    }

    /* renamed from: g */
    public final void mo53719g() {
        this.f21479e = true;
    }

    /* renamed from: h */
    public final boolean mo53720h() {
        return this.f21480f;
    }

    /* renamed from: i */
    public final void mo53721i() {
        this.f21480f = true;
    }
}
