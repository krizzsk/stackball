package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.yc */
public abstract class C15241yc {

    /* renamed from: b */
    private int f42804b;

    /* renamed from: b */
    public void mo66557b() {
        this.f42804b = 0;
    }

    /* renamed from: c */
    public final boolean mo71017c() {
        return mo71019d(268435456);
    }

    /* renamed from: d */
    public final boolean mo71018d() {
        return mo71019d(Integer.MIN_VALUE);
    }

    /* renamed from: e */
    public final boolean mo71021e() {
        return mo71019d(4);
    }

    /* renamed from: f */
    public final boolean mo71022f() {
        return mo71019d(1);
    }

    /* renamed from: b */
    public final void mo71015b(int i) {
        this.f42804b = i | this.f42804b;
    }

    /* renamed from: c */
    public final void mo71016c(int i) {
        this.f42804b = (~i) & this.f42804b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo71019d(int i) {
        return (this.f42804b & i) == i;
    }

    /* renamed from: e */
    public final void mo71020e(int i) {
        this.f42804b = i;
    }
}
