package com.ogury.p245ed.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ogury.ed.internal.kz */
final class C8407kz implements C8474mx, Serializable, Map {

    /* renamed from: a */
    public static final C8407kz f21638a = new C8407kz();
    private static final long serialVersionUID = 8246714829545688274L;

    /* renamed from: a */
    private static boolean m23774a(Void voidR) {
        C8467mq.m23881b(voidR, "value");
        return false;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    private C8407kz() {
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m23774a((Void) obj);
    }

    public final Set<Map.Entry> entrySet() {
        return m23773a();
    }

    public final Set<Object> keySet() {
        return m23775b();
    }

    public final Collection values() {
        return m23776c();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: a */
    private static Set<Map.Entry> m23773a() {
        return C8422la.f21672a;
    }

    /* renamed from: b */
    private static Set<Object> m23775b() {
        return C8422la.f21672a;
    }

    /* renamed from: c */
    private static Collection m23776c() {
        return C8406ky.f21637a;
    }

    private final Object readResolve() {
        return f21638a;
    }
}
