package com.yandex.mobile.ads.impl;

import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class e20<T> implements Provider<T> {

    /* renamed from: a */
    private final Lazy f32889a;

    public e20(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "init");
        this.f32889a = LazyKt.lazy(function0);
    }

    public T get() {
        return this.f32889a.getValue();
    }
}
