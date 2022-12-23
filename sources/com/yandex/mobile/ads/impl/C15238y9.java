package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.y9 */
public class C15238y9 {
    /* renamed from: a */
    public Set<hd0> mo71011a(pq0 pq0) {
        List<hd0> a;
        HashSet hashSet = new HashSet();
        for (C13690k9 d : pq0.mo69407b()) {
            Object d2 = d.mo68169d();
            if (d2 instanceof hd0) {
                hashSet.add((hd0) d2);
            }
            if ((d2 instanceof dm0) && (a = ((dm0) d2).mo66637a()) != null) {
                hashSet.addAll(a);
            }
        }
        return hashSet;
    }
}
