package com.ogury.core.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.ogury.core.internal.q */
/* compiled from: Collections.kt */
public final class C7992q implements C7925am, Serializable, List, RandomAccess {

    /* renamed from: a */
    public static final C7992q f20783a = new C7992q();

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
        return C7919ag.m22137a(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return C7919ag.m22138a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    private C7992q() {
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C7921ai.m22144b((Void) obj, "element");
        return false;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        C7921ai.m22144b((Void) obj, "element");
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        C7921ai.m22144b((Void) obj, "element");
        return -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        C7921ai.m22144b(collection, MessengerShareContentUtility.ELEMENTS);
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return C7991p.f20782a;
    }

    public final ListIterator listIterator() {
        return C7991p.f20782a;
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C7991p.f20782a;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public final /* synthetic */ Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }
}
