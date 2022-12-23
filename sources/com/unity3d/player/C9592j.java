package com.unity3d.player;

/* renamed from: com.unity3d.player.j */
final class C9592j {

    /* renamed from: a */
    private static boolean f23892a = false;

    /* renamed from: b */
    private boolean f23893b = false;

    /* renamed from: c */
    private boolean f23894c = false;

    /* renamed from: d */
    private boolean f23895d = true;

    /* renamed from: e */
    private boolean f23896e = false;

    C9592j() {
    }

    /* renamed from: a */
    static void m25681a() {
        f23892a = true;
    }

    /* renamed from: b */
    static void m25682b() {
        f23892a = false;
    }

    /* renamed from: c */
    static boolean m25683c() {
        return f23892a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58790a(boolean z) {
        this.f23893b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo58791b(boolean z) {
        this.f23895d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo58792c(boolean z) {
        this.f23896e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo58793d(boolean z) {
        this.f23894c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo58794d() {
        return this.f23895d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo58795e() {
        return this.f23896e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo58796e(boolean z) {
        if (f23892a) {
            return (z || this.f23893b) && !this.f23895d && !this.f23894c;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo58797f() {
        return this.f23894c;
    }

    public final String toString() {
        return super.toString();
    }
}
