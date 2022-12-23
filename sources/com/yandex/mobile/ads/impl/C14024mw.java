package com.yandex.mobile.ads.impl;

import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* renamed from: com.yandex.mobile.ads.impl.mw */
public final class C14024mw implements b60<C13903lw> {

    /* renamed from: a */
    private final Provider<C12744cm> f37532a;

    /* renamed from: b */
    private final Provider<ExecutorService> f37533b;

    public C14024mw(Provider<C12744cm> provider, Provider<ExecutorService> provider2) {
        this.f37532a = provider;
        this.f37533b = provider2;
    }

    public Object get() {
        return new C13903lw(this.f37532a.get(), this.f37533b.get());
    }
}
