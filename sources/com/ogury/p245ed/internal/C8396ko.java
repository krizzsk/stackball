package com.ogury.p245ed.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ko */
class C8396ko extends C8395kn {
    /* renamed from: a */
    public static final <T> Collection<T> m23755a(T[] tArr) {
        C8467mq.m23881b(tArr, "$this$asCollection");
        return new C8387kf<>(tArr);
    }

    /* renamed from: a */
    public static final <T> List<T> m23756a() {
        return C8406ky.f21637a;
    }

    /* renamed from: b */
    public static final <T> List<T> m23757b(T... tArr) {
        C8467mq.m23881b(tArr, MessengerShareContentUtility.ELEMENTS);
        return tArr.length > 0 ? C8388kg.m23745a(tArr) : C8394km.m23756a();
    }

    /* renamed from: a */
    public static final <T> int m23754a(List<? extends T> list) {
        C8467mq.m23881b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: b */
    public static final void m23758b() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
