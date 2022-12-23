package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.tapjoy.internal.ep */
final class C9218ep extends AbstractList implements Serializable, RandomAccess {

    /* renamed from: a */
    List f22628a;

    /* renamed from: b */
    private final List f22629b;

    C9218ep(List list) {
        this.f22629b = list;
        this.f22628a = list;
    }

    public final Object get(int i) {
        return this.f22628a.get(i);
    }

    public final int size() {
        return this.f22628a.size();
    }

    public final Object set(int i, Object obj) {
        if (this.f22628a == this.f22629b) {
            this.f22628a = new ArrayList(this.f22629b);
        }
        return this.f22628a.set(i, obj);
    }

    public final void add(int i, Object obj) {
        if (this.f22628a == this.f22629b) {
            this.f22628a = new ArrayList(this.f22629b);
        }
        this.f22628a.add(i, obj);
    }

    public final Object remove(int i) {
        if (this.f22628a == this.f22629b) {
            this.f22628a = new ArrayList(this.f22629b);
        }
        return this.f22628a.remove(i);
    }
}
