package com.ogury.p245ed.internal;

import java.util.Collection;

/* renamed from: com.ogury.ed.internal.kp */
class C8397kp extends C8396ko {
    /* renamed from: a */
    public static final <T> int m23759a(Iterable<? extends T> iterable) {
        C8467mq.m23881b(iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
