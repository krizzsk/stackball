package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

final class dq1<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a */
    private WeakReference<T> f32747a;

    public dq1(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f32747a = weakReference;
    }

    public T getValue(Object obj, KProperty<?> kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, "property");
        WeakReference<T> weakReference = this.f32747a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void setValue(Object obj, KProperty<?> kProperty, T t) {
        Intrinsics.checkNotNullParameter(kProperty, "property");
        this.f32747a = t == null ? null : new WeakReference<>(t);
    }
}
