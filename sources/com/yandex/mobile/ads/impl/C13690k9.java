package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.k9 */
public class C13690k9<T> {

    /* renamed from: a */
    private final T f36024a;

    /* renamed from: b */
    private final String f36025b;

    /* renamed from: c */
    private final String f36026c;

    /* renamed from: d */
    private final ej0 f36027d;

    /* renamed from: e */
    private final boolean f36028e;

    /* renamed from: f */
    private final boolean f36029f;

    public C13690k9(String str, String str2, T t, ej0 ej0, boolean z, boolean z2) {
        this.f36025b = str;
        this.f36026c = str2;
        this.f36024a = t;
        this.f36027d = ej0;
        this.f36029f = z;
        this.f36028e = z2;
    }

    /* renamed from: a */
    public ej0 mo68166a() {
        return this.f36027d;
    }

    /* renamed from: b */
    public String mo68167b() {
        return this.f36025b;
    }

    /* renamed from: c */
    public String mo68168c() {
        return this.f36026c;
    }

    /* renamed from: d */
    public T mo68169d() {
        return this.f36024a;
    }

    /* renamed from: e */
    public boolean mo68170e() {
        return this.f36029f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13690k9.class != obj.getClass()) {
            return false;
        }
        C13690k9 k9Var = (C13690k9) obj;
        if (this.f36028e != k9Var.f36028e || this.f36029f != k9Var.f36029f || !this.f36024a.equals(k9Var.f36024a) || !this.f36025b.equals(k9Var.f36025b) || !this.f36026c.equals(k9Var.f36026c)) {
            return false;
        }
        ej0 ej0 = this.f36027d;
        ej0 ej02 = k9Var.f36027d;
        if (ej0 != null) {
            return ej0.equals(ej02);
        }
        if (ej02 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo68172f() {
        return this.f36028e;
    }

    public int hashCode() {
        int hashCode = ((((this.f36024a.hashCode() * 31) + this.f36025b.hashCode()) * 31) + this.f36026c.hashCode()) * 31;
        ej0 ej0 = this.f36027d;
        return ((((hashCode + (ej0 != null ? ej0.hashCode() : 0)) * 31) + (this.f36028e ? 1 : 0)) * 31) + (this.f36029f ? 1 : 0);
    }
}
