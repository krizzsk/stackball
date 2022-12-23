package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.tapjoy.internal.ay */
public final class C9082ay extends AbstractSet implements Serializable, Set {

    /* renamed from: a */
    transient WeakHashMap f22374a;

    public C9082ay() {
        this(new WeakHashMap());
    }

    private C9082ay(WeakHashMap weakHashMap) {
        this.f22374a = weakHashMap;
    }

    public final boolean add(Object obj) {
        return this.f22374a.put(obj, this) == null;
    }

    public final void clear() {
        this.f22374a.clear();
    }

    public final Object clone() {
        try {
            return (C9082ay) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean contains(Object obj) {
        return this.f22374a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f22374a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f22374a.keySet().iterator();
    }

    public final boolean remove(Object obj) {
        return this.f22374a.remove(obj) != null;
    }

    public final int size() {
        return this.f22374a.size();
    }
}
