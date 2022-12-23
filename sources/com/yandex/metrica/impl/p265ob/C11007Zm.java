package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Zm */
public class C11007Zm<K, V> {

    /* renamed from: a */
    private final HashMap<K, Collection<V>> f26484a;

    /* renamed from: b */
    private final boolean f26485b;

    public C11007Zm() {
        this(false);
    }

    /* renamed from: a */
    public Collection<V> mo62600a(K k) {
        return this.f26484a.get(k);
    }

    /* renamed from: b */
    public boolean mo62605b() {
        return this.f26484a.isEmpty();
    }

    /* renamed from: c */
    public int mo62606c() {
        int i = 0;
        for (Collection<V> size : this.f26484a.values()) {
            i += size.size();
        }
        return i;
    }

    public String toString() {
        return this.f26484a.toString();
    }

    public C11007Zm(boolean z) {
        this.f26484a = new HashMap<>();
        this.f26485b = z;
    }

    /* renamed from: a */
    public Collection<V> mo62601a(K k, V v) {
        ArrayList arrayList;
        Collection collection = this.f26484a.get(k);
        if (collection == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(collection);
        }
        arrayList.add(v);
        return this.f26484a.put(k, arrayList);
    }

    /* renamed from: b */
    public Collection<V> mo62603b(K k) {
        return this.f26484a.remove(k);
    }

    /* renamed from: b */
    public Collection<V> mo62604b(K k, V v) {
        Collection collection = this.f26484a.get(k);
        if (collection == null || !collection.remove(v)) {
            return null;
        }
        if (collection.isEmpty() && this.f26485b) {
            this.f26484a.remove(k);
        }
        return new ArrayList(collection);
    }

    /* renamed from: a */
    public Set<? extends Map.Entry<K, ? extends Collection<V>>> mo62602a() {
        return this.f26484a.entrySet();
    }
}
