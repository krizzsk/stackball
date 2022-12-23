package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.sg */
public final class C14592sg implements C15055wl {

    /* renamed from: b */
    private final List<C15055wl> f39980b = new ArrayList();

    /* renamed from: c */
    private boolean f39981c;

    /* renamed from: a */
    public final void mo69970a(C15055wl wlVar) {
        Intrinsics.checkNotNullParameter(wlVar, "disposable");
        if (!(!this.f39981c)) {
            throw new IllegalArgumentException("close() method was called".toString());
        } else if (!Intrinsics.areEqual((Object) wlVar, (Object) C15055wl.f42027a)) {
            this.f39980b.add(wlVar);
        }
    }

    public void close() {
        for (C15055wl close : this.f39980b) {
            close.close();
        }
        this.f39980b.clear();
        this.f39981c = true;
    }
}
