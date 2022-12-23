package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.dn */
public final class C12906dn implements b60<C15056wm> {

    /* renamed from: a */
    private final Provider<C12985en> f32713a;

    /* renamed from: b */
    private final Provider<C12903dm> f32714b;

    /* renamed from: c */
    private final Provider<C14769um> f32715c;

    /* renamed from: d */
    private final Provider<Boolean> f32716d;

    /* renamed from: e */
    private final Provider<Boolean> f32717e;

    public C12906dn(Provider<C12985en> provider, Provider<C12903dm> provider2, Provider<C14769um> provider3, Provider<Boolean> provider4, Provider<Boolean> provider5) {
        this.f32713a = provider;
        this.f32714b = provider2;
        this.f32715c = provider3;
        this.f32716d = provider4;
        this.f32717e = provider5;
    }

    public Object get() {
        return new C15056wm(this.f32713a.get(), this.f32714b.get(), this.f32715c.get(), this.f32716d.get().booleanValue(), this.f32717e.get().booleanValue());
    }
}
