package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.oh */
public final class C14185oh<T> implements n50<T> {

    /* renamed from: a */
    private final List<T> f38221a;

    public C14185oh(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "valuesList");
        this.f38221a = list;
    }

    /* renamed from: a */
    public List<T> mo67589a(j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return this.f38221a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14185oh) && Intrinsics.areEqual((Object) this.f38221a, (Object) ((C14185oh) obj).f38221a);
    }

    /* renamed from: a */
    public C15055wl mo67588a(j50 j50, Function1<? super List<? extends T>, Unit> function1) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        Intrinsics.checkNotNullParameter(function1, "callback");
        C15055wl wlVar = C15055wl.f42027a;
        Intrinsics.checkNotNullExpressionValue(wlVar, "NULL");
        return wlVar;
    }
}
