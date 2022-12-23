package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.yandex.mobile.ads.impl.g9 */
final class C13182g9<T> implements ReadWriteProperty<View, T> {

    /* renamed from: a */
    private T f33906a;

    /* renamed from: b */
    private final Function1<T, T> f33907b;

    public C13182g9(T t, Function1<? super T, ? extends T> function1) {
        this.f33906a = t;
        this.f33907b = function1;
    }

    public Object getValue(Object obj, KProperty kProperty) {
        Intrinsics.checkNotNullParameter((View) obj, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty, "property");
        return this.f33906a;
    }

    public void setValue(Object obj, KProperty kProperty, T t) {
        T invoke;
        View view = (View) obj;
        Intrinsics.checkNotNullParameter(view, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty, "property");
        Function1<T, T> function1 = this.f33907b;
        if (!(function1 == null || (invoke = function1.invoke(t)) == null)) {
            t = invoke;
        }
        if (!Intrinsics.areEqual((Object) this.f33906a, (Object) t)) {
            this.f33906a = t;
            view.invalidate();
        }
    }
}
