package com.yandex.mobile.ads.impl;

import com.yandex.android.beacon.SendBeaconManager;
import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.vm */
public final class C14897vm implements b60<C14769um> {

    /* renamed from: a */
    private final Provider<SendBeaconManager> f41322a;

    /* renamed from: b */
    private final Provider<Boolean> f41323b;

    /* renamed from: c */
    private final Provider<Boolean> f41324c;

    public C14897vm(Provider<SendBeaconManager> provider, Provider<Boolean> provider2, Provider<Boolean> provider3) {
        this.f41322a = provider;
        this.f41323b = provider2;
        this.f41324c = provider3;
    }

    public Object get() {
        return new C14769um(d20.m34974a(this.f41322a), this.f41323b.get().booleanValue(), this.f41324c.get().booleanValue());
    }
}
