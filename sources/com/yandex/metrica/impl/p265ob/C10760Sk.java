package com.yandex.metrica.impl.p265ob;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.Sk */
public class C10760Sk {

    /* renamed from: a */
    private final Map<Float, Integer> f25801a = new HashMap();

    public C10760Sk(TreeSet<Float> treeSet) {
        int i = 0;
        for (Float put : treeSet.descendingSet()) {
            this.f25801a.put(put, Integer.valueOf(i));
            i++;
        }
    }

    /* renamed from: a */
    public void mo62244a(C10229El el) {
        el.f24618s = this.f25801a.get(el.f24612m);
    }
}
