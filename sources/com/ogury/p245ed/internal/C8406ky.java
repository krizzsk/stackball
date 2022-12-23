package com.ogury.p245ed.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.ogury.ed.internal.ky */
public final class C8406ky implements C8474mx, Serializable, List, RandomAccess {

    /* renamed from: a */
    public static final C8406ky f21637a = new C8406ky();
    private static final long serialVersionUID = -7390468764508069838L;

    /* renamed from: a */
    private static boolean m23770a(Void voidR) {
        C8467mq.m23881b(voidR, "element");
        return false;
    }

    /* renamed from: b */
    private static int m23771b(Void voidR) {
        C8467mq.m23881b(voidR, "element");
        return -1;
    }

    /* renamed from: c */
    private static int m23772c(Void voidR) {
        C8467mq.m23881b(voidR, "element");
        return -1;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public final /* synthetic */ Object set(int i, Object obj) {
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

    private C8406ky() {
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m23770a((Void) obj);
    }

    public final /* synthetic */ Object get(int i) {
        return m23769a(i);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m23771b((Void) obj);
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m23772c((Void) obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        C8467mq.m23881b(collection, MessengerShareContentUtility.ELEMENTS);
        return collection.isEmpty();
    }

    /* renamed from: a */
    private static Void m23769a(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public final Iterator iterator() {
        return C8405kx.f21636a;
    }

    public final ListIterator listIterator() {
        return C8405kx.f21636a;
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C8405kx.f21636a;
        }
        throw new IndexOutOfBoundsException("Index: ".concat(String.valueOf(i)));
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    private final Object readResolve() {
        return f21637a;
    }
}
