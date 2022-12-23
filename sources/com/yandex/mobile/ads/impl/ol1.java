package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ol1 {

    /* renamed from: com.yandex.mobile.ads.impl.ol1$b */
    private static class C14193b implements Comparator<lj1> {
        private C14193b() {
        }

        public int compare(Object obj, Object obj2) {
            return ((lj1) obj).mo68462h().compareTo(((lj1) obj2).mo68462h());
        }
    }

    /* renamed from: a */
    private List<lj1> m40456a(List<lj1> list) {
        ArrayList arrayList = new ArrayList();
        for (lj1 next : list) {
            if (next.mo68462h() != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<lj1> mo69205b(List<lj1> list) {
        boolean z;
        Iterator<lj1> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo68462h() != null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return new ArrayList(list);
        }
        List<lj1> a = m40456a(m40456a(list));
        Collections.sort(a, new C14193b());
        return a;
    }
}
