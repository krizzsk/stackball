package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.tapjoy.internal.en */
final class C9216en extends AbstractList implements Serializable, RandomAccess {

    /* renamed from: a */
    private final ArrayList f22627a;

    C9216en(List list) {
        this.f22627a = new ArrayList(list);
    }

    public final int size() {
        return this.f22627a.size();
    }

    public final Object get(int i) {
        return this.f22627a.get(i);
    }

    public final Object[] toArray() {
        return this.f22627a.toArray();
    }
}
