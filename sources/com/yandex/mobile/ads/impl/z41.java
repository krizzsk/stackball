package com.yandex.mobile.ads.impl;

import java.util.ConcurrentModificationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class z41<T> {

    /* renamed from: a */
    private final Function0<T> f43016a;

    /* renamed from: b */
    private T f43017b;

    public z41(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "initializer");
        this.f43016a = function0;
    }

    /* renamed from: a */
    public final T mo71154a() {
        if (this.f43017b == null) {
            this.f43017b = this.f43016a.invoke();
        }
        T t = this.f43017b;
        if (t != null) {
            return t;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    /* renamed from: b */
    public final boolean mo71155b() {
        return this.f43017b != null;
    }

    /* renamed from: c */
    public final void mo71156c() {
        this.f43017b = null;
    }
}
