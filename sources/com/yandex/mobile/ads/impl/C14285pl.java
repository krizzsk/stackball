package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.yandex.mobile.ads.impl.pl */
final class C14285pl<T> implements ReadWriteProperty<View, T> {

    /* renamed from: a */
    private T f38639a;

    /* renamed from: b */
    private final Function1<T, T> f38640b;

    public C14285pl(T t, Function1<? super T, ? extends T> function1) {
        this.f38639a = t;
        this.f38640b = function1;
    }

    public Object getValue(Object obj, KProperty kProperty) {
        Intrinsics.checkNotNullParameter((View) obj, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty, "property");
        return this.f38639a;
    }

    public void setValue(Object obj, KProperty kProperty, T t) {
        T invoke;
        View view = (View) obj;
        Intrinsics.checkNotNullParameter(view, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty, "property");
        Function1<T, T> function1 = this.f38640b;
        if (!(function1 == null || (invoke = function1.invoke(t)) == null)) {
            t = invoke;
        }
        if (!Intrinsics.areEqual((Object) this.f38639a, (Object) t)) {
            this.f38639a = t;
            view.requestLayout();
        }
    }
}
