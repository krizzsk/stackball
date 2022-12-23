package com.ogury.p245ed.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kx */
public final class C8405kx implements C8474mx, ListIterator {

    /* renamed from: a */
    public static final C8405kx f21636a = new C8405kx();

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private C8405kx() {
    }

    public final /* synthetic */ Object next() {
        return m23767a();
    }

    public final /* synthetic */ Object previous() {
        return m23768b();
    }

    /* renamed from: a */
    private static Void m23767a() {
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    private static Void m23768b() {
        throw new NoSuchElementException();
    }
}
