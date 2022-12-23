package com.ogury.p245ed.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.tapjoy.TJAdUnitConstants;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.kf */
final class C8387kf<T> implements C8474mx, Collection<T> {

    /* renamed from: a */
    private final T[] f21634a;

    /* renamed from: b */
    private final boolean f21635b = false;

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final <T> T[] toArray(T[] tArr) {
        return C8462ml.m23871a(this, tArr);
    }

    public C8387kf(T[] tArr) {
        C8467mq.m23881b(tArr, TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        this.f21634a = tArr;
    }

    public final int size() {
        return m23744a();
    }

    /* renamed from: a */
    private int m23744a() {
        return this.f21634a.length;
    }

    public final boolean isEmpty() {
        return this.f21634a.length == 0;
    }

    public final boolean contains(Object obj) {
        return C8388kg.m23747a(this.f21634a, obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C8467mq.m23881b(collection, MessengerShareContentUtility.ELEMENTS);
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<T> iterator() {
        return C8456mh.m23860a(this.f21634a);
    }

    public final Object[] toArray() {
        return C8394km.m23753a(this.f21634a, this.f21635b);
    }
}
