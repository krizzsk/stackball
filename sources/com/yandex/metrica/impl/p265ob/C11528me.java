package com.yandex.metrica.impl.p265ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.me */
public class C11528me implements C11150de {

    /* renamed from: a */
    private Set<String> f27735a;

    public C11528me(List<C11347ie> list) {
        if (list == null) {
            this.f27735a = new HashSet();
            return;
        }
        this.f27735a = new HashSet(list.size());
        for (C11347ie next : list) {
            if (next.f27119b) {
                this.f27735a.add(next.f27118a);
            }
        }
    }

    /* renamed from: a */
    public boolean mo62695a(String str) {
        return this.f27735a.contains(str);
    }

    public String toString() {
        return "StartupBasedPermissionStrategy{mEnabledPermissions=" + this.f27735a + '}';
    }
}
