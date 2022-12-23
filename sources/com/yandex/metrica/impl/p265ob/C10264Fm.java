package com.yandex.metrica.impl.p265ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Fm */
public class C10264Fm<K, V> {

    /* renamed from: a */
    private final Map<K, V> f24705a;

    /* renamed from: b */
    private final V f24706b;

    public C10264Fm(V v) {
        this(new HashMap(), v);
    }

    /* renamed from: a */
    public void mo61336a(K k, V v) {
        this.f24705a.put(k, v);
    }

    public C10264Fm(Map<K, V> map, V v) {
        this.f24705a = map;
        this.f24706b = v;
    }

    /* renamed from: a */
    public V mo61334a(K k) {
        V v = this.f24705a.get(k);
        return v == null ? this.f24706b : v;
    }

    /* renamed from: a */
    public Set<K> mo61335a() {
        return this.f24705a.keySet();
    }
}
