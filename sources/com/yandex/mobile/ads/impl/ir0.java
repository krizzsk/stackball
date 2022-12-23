package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ir0 {

    /* renamed from: a */
    private final C15238y9 f35008a = new C15238y9();

    /* renamed from: a */
    public List<String> mo67886a(List<pq0> list) {
        HashSet hashSet = new HashSet();
        for (pq0 a : list) {
            hashSet.addAll(mo67885a(a));
        }
        return new ArrayList(hashSet);
    }

    /* renamed from: a */
    public List<String> mo67885a(pq0 pq0) {
        HashSet hashSet = new HashSet();
        Iterator it = ((HashSet) this.f35008a.mo71011a(pq0)).iterator();
        while (it.hasNext()) {
            hd0 hd0 = (hd0) it.next();
            if (!TextUtils.isEmpty(hd0.mo67520b())) {
                hashSet.add(hd0.mo67520b());
            }
        }
        return new ArrayList(hashSet);
    }
}
