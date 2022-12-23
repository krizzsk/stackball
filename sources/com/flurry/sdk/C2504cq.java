package com.flurry.sdk;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.cq */
public final class C2504cq<K, V> {

    /* renamed from: a */
    public final Map<K, List<V>> f5865a = new HashMap();

    /* renamed from: b */
    private int f5866b;

    /* renamed from: a */
    public final void mo17703a() {
        this.f5865a.clear();
    }

    /* renamed from: a */
    public final List<V> mo17701a(K k) {
        if (k == null) {
            return Collections.emptyList();
        }
        List<V> a = mo17702a(k, false);
        return a == null ? Collections.emptyList() : a;
    }

    /* renamed from: a */
    public final List<V> mo17702a(K k, boolean z) {
        ArrayList arrayList;
        List<V> list = this.f5865a.get(k);
        if (!z || list != null) {
            return list;
        }
        if (this.f5866b > 0) {
            arrayList = new ArrayList(this.f5866b);
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        this.f5865a.put(k, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo17704a(K k, V v) {
        if (k != null) {
            mo17702a(k, true).add(v);
        }
    }

    /* renamed from: b */
    public final boolean mo17707b(K k, V v) {
        List a;
        if (k == null || (a = mo17702a(k, false)) == null) {
            return false;
        }
        boolean remove = a.remove(v);
        if (a.size() == 0) {
            this.f5865a.remove(k);
        }
        return remove;
    }

    /* renamed from: b */
    public final boolean mo17706b(K k) {
        return this.f5865a.remove(k) != null;
    }

    /* renamed from: b */
    public final Collection<Map.Entry<K, V>> mo17705b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f5865a.entrySet()) {
            for (Object simpleImmutableEntry : (List) next.getValue()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(next.getKey(), simpleImmutableEntry));
            }
        }
        return arrayList;
    }
}
