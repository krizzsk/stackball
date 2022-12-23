package com.ogury.core.internal;

import java.util.Iterator;

/* renamed from: com.ogury.core.internal.t */
/* compiled from: Iterators.kt */
public abstract class C7995t implements C7925am, Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo52905a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return Integer.valueOf(mo52905a());
    }
}
