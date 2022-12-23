package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ou0 {
    /* renamed from: a */
    public Set<String> mo69269a(as0 as0) {
        HashSet hashSet = new HashSet();
        for (pq0 b : as0.mo65856c()) {
            HashSet hashSet2 = new HashSet();
            for (C13690k9 d : b.mo69407b()) {
                Object d2 = d.mo68169d();
                if (d2 instanceof dm0) {
                    hashSet2.add((dm0) d2);
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                fu0 fu0 = null;
                kj1 c = ((dm0) it.next()).mo66639c();
                if (c != null) {
                    fu0 = c.mo68242a().mo66323c();
                }
                if (fu0 != null) {
                    hashSet.add(fu0.getUrl());
                }
            }
        }
        return hashSet;
    }
}
