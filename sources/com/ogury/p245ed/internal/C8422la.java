package com.ogury.p245ed.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ogury.ed.internal.la */
public final class C8422la implements C8474mx, Serializable, Set {

    /* renamed from: a */
    public static final C8422la f21672a = new C8422la();
    private static final long serialVersionUID = 3406603774387020532L;

    /* renamed from: a */
    private static boolean m23841a(Void voidR) {
        C8467mq.m23881b(voidR, "element");
        return false;
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return C8462ml.m23870a(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return C8462ml.m23871a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    private C8422la() {
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m23841a((Void) obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        C8467mq.m23881b(collection, MessengerShareContentUtility.ELEMENTS);
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return C8405kx.f21636a;
    }

    private final Object readResolve() {
        return f21672a;
    }
}
