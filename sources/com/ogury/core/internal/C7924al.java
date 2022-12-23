package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.al */
/* compiled from: TypeIntrinsics */
public class C7924al {
    /* renamed from: a */
    private static <T extends Throwable> T m22147a(T t) {
        return C7921ai.m22141a(t, C7924al.class.getName());
    }

    /* renamed from: a */
    public static Iterable m22146a(Object obj) {
        if (!(obj instanceof C7925am) || (obj instanceof C7926an)) {
            return m22148b(obj);
        }
        String name = obj == null ? "null" : obj.getClass().getName();
        throw ((ClassCastException) m22147a(new ClassCastException(name + " cannot be cast to " + "kotlin.collections.MutableIterable")));
    }

    /* renamed from: b */
    private static Iterable m22148b(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) m22147a(e));
        }
    }
}
