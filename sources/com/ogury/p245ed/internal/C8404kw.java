package com.ogury.p245ed.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kw */
class C8404kw extends C8403kv {
    /* renamed from: b */
    public static final <T> T m23764b(List<? extends T> list) {
        C8467mq.m23881b(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: c */
    public static final <T> T m23766c(List<? extends T> list) {
        C8467mq.m23881b(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(C8394km.m23754a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: a */
    public static final <T> List<T> m23763a(Collection<? extends T> collection) {
        C8467mq.m23881b(collection, "$this$toMutableList");
        return new ArrayList<>(collection);
    }

    /* renamed from: b */
    public static final <T> boolean m23765b(Iterable<? extends T> iterable) {
        C8467mq.m23881b(iterable, "$this$none");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }
}
