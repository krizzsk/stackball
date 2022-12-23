package com.ogury.p245ed.internal;

import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.mw */
public class C8473mw {
    /* renamed from: a */
    private static <T extends Throwable> T m23897a(T t) {
        return C8467mq.m23875a(t, C8473mw.class.getName());
    }

    /* renamed from: a */
    private static void m23898a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m23899a(name + " cannot be cast to " + str);
    }

    /* renamed from: a */
    private static void m23899a(String str) {
        throw m23895a(new ClassCastException(str));
    }

    /* renamed from: a */
    private static ClassCastException m23895a(ClassCastException classCastException) {
        throw ((ClassCastException) m23897a(classCastException));
    }

    /* renamed from: a */
    public static Iterable m23896a(Object obj) {
        if ((obj instanceof C8474mx) && !(obj instanceof C8476mz)) {
            m23898a(obj, "kotlin.collections.MutableIterable");
        }
        return m23902d(obj);
    }

    /* renamed from: d */
    private static Iterable m23902d(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m23895a(e);
        }
    }

    /* renamed from: b */
    public static List m23900b(Object obj) {
        if ((obj instanceof C8474mx) && !(obj instanceof C8478na)) {
            m23898a(obj, "kotlin.collections.MutableList");
        }
        return m23903e(obj);
    }

    /* renamed from: e */
    private static List m23903e(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m23895a(e);
        }
    }

    /* renamed from: c */
    public static Map m23901c(Object obj) {
        if ((obj instanceof C8474mx) && !(obj instanceof C8479nb)) {
            m23898a(obj, "kotlin.collections.MutableMap");
        }
        return m23904f(obj);
    }

    /* renamed from: f */
    private static Map m23904f(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m23895a(e);
        }
    }
}
