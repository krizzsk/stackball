package com.ogury.p245ed.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.mg */
final class C8455mg<T> implements C8474mx, Iterator<T> {

    /* renamed from: a */
    private int f21676a;

    /* renamed from: b */
    private final T[] f21677b;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C8455mg(T[] tArr) {
        C8467mq.m23881b(tArr, "array");
        this.f21677b = tArr;
    }

    public final boolean hasNext() {
        return this.f21676a < this.f21677b.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f21677b;
            int i = this.f21676a;
            this.f21676a = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f21676a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
