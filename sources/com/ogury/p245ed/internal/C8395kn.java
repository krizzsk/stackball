package com.ogury.p245ed.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ogury.ed.internal.kn */
class C8395kn {
    /* renamed from: a */
    public static final <T> List<T> m23752a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C8467mq.m23878a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m23753a(T[] tArr, boolean z) {
        C8467mq.m23881b(tArr, "$this$copyToArrayOfAny");
        if (z && C8467mq.m23880a((Object) tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C8467mq.m23878a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
