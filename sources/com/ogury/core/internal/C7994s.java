package com.ogury.core.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ogury.core.internal.s */
/* compiled from: Sets.kt */
public final class C7994s implements C7925am, Serializable, Set {

    /* renamed from: a */
    public static final C7994s f20785a = new C7994s();

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
        return C7919ag.m22137a(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return C7919ag.m22138a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    private C7994s() {
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C7921ai.m22144b((Void) obj, "element");
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        C7921ai.m22144b(collection, MessengerShareContentUtility.ELEMENTS);
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return C7991p.f20782a;
    }
}
