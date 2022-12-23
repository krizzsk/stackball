package com.tapjoy.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.tapjoy.internal.av */
public final class C9079av implements C9081ax {

    /* renamed from: a */
    private final List f22373a;

    public C9079av(List list) {
        this.f22373a = list;
    }

    public final boolean add(Object obj) {
        return this.f22373a.add(obj);
    }

    public final boolean addAll(Collection collection) {
        return this.f22373a.addAll(collection);
    }

    public final void clear() {
        this.f22373a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f22373a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f22373a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f22373a.equals(obj);
    }

    /* renamed from: a */
    public final Object mo57777a(int i) {
        return this.f22373a.get(i);
    }

    public final int hashCode() {
        return this.f22373a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f22373a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f22373a.iterator();
    }

    public final boolean remove(Object obj) {
        return this.f22373a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return this.f22373a.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.f22373a.retainAll(collection);
    }

    public final int size() {
        return this.f22373a.size();
    }

    public final Object[] toArray() {
        return this.f22373a.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f22373a.toArray(objArr);
    }

    public final boolean offer(Object obj) {
        return this.f22373a.add(obj);
    }

    public final Object remove() {
        Object poll = poll();
        if (poll != null) {
            return poll;
        }
        throw new NoSuchElementException();
    }

    public final Object poll() {
        if (this.f22373a.isEmpty()) {
            return null;
        }
        return this.f22373a.remove(0);
    }

    public final Object element() {
        Object peek = peek();
        if (peek != null) {
            return peek;
        }
        throw new NoSuchElementException();
    }

    public final Object peek() {
        if (this.f22373a.isEmpty()) {
            return null;
        }
        return this.f22373a.get(0);
    }

    /* renamed from: b */
    public final void mo57778b(int i) {
        C9080aw.m24317a(this.f22373a, i);
    }
}
