package com.yandex.mobile.ads.impl;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class wa1<T> implements Iterable<T>, KMappedMarker {

    /* renamed from: b */
    private final SparseArrayCompat<T> f41906b;

    public wa1(SparseArrayCompat<T> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "array");
        this.f41906b = sparseArrayCompat;
    }

    public Iterator<T> iterator() {
        return new xa1(this.f41906b);
    }
}
