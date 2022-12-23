package com.yandex.mobile.ads.impl;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

final class xa1<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    private final SparseArrayCompat<T> f42483b;

    /* renamed from: c */
    private int f42484c;

    public xa1(SparseArrayCompat<T> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "array");
        this.f42483b = sparseArrayCompat;
    }

    public boolean hasNext() {
        return this.f42483b.size() > this.f42484c;
    }

    public T next() {
        SparseArrayCompat<T> sparseArrayCompat = this.f42483b;
        int i = this.f42484c;
        this.f42484c = i + 1;
        return sparseArrayCompat.valueAt(i);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
