package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

public final class f31 {

    /* renamed from: com.yandex.mobile.ads.impl.f31$a */
    public static final class C13026a implements ReadWriteProperty<Object, T> {

        /* renamed from: a */
        private WeakReference<T> f33215a;

        /* renamed from: b */
        final /* synthetic */ T f33216b;

        C13026a(T t) {
            this.f33216b = t;
            this.f33215a = new WeakReference<>(t);
        }

        public T getValue(Object obj, KProperty<?> kProperty) {
            Intrinsics.checkNotNullParameter(kProperty, "property");
            return this.f33215a.get();
        }

        public void setValue(Object obj, KProperty<?> kProperty, T t) {
            Intrinsics.checkNotNullParameter(kProperty, "property");
            this.f33215a = new WeakReference<>(t);
        }
    }

    /* renamed from: a */
    public static final <T> ReadWriteProperty<Object, T> m35889a(T t) {
        return new C13026a(t);
    }
}
