package com.yandex.metrica.impl.p265ob;

import java.util.Comparator;

/* renamed from: com.yandex.metrica.impl.ob.Zn */
public class C11008Zn implements Comparator<C10859Vj> {
    public int compare(Object obj, Object obj2) {
        C10859Vj vj = (C10859Vj) obj;
        C10859Vj vj2 = (C10859Vj) obj2;
        if (vj == vj2) {
            return 0;
        }
        boolean z = true;
        boolean z2 = vj == null;
        if (vj2 != null) {
            z = false;
        }
        if (!(z ^ z2) && vj.mo62413q() == vj2.mo62413q() && vj.mo62399c() == vj2.mo62399c() && (vj.mo62407k() == null ? vj2.mo62407k() == null : vj.mo62407k().equals(vj2.mo62407k())) && (vj.mo62408l() == null ? vj2.mo62408l() == null : vj.mo62408l().equals(vj2.mo62408l())) && (vj.mo62401e() == null ? vj2.mo62401e() == null : vj.mo62401e().equals(vj2.mo62401e())) && (vj.mo62398b() == null ? vj2.mo62398b() == null : vj.mo62398b().equals(vj2.mo62398b())) && (vj.mo62410n() == null ? vj2.mo62410n() == null : vj.mo62410n().equals(vj2.mo62410n())) && (vj.mo62409m() == null ? vj2.mo62409m() == null : vj.mo62409m().equals(vj2.mo62409m()))) {
            if (vj.mo62411o() != null) {
                if (vj.mo62411o().equals(vj2.mo62411o())) {
                    return 0;
                }
            } else if (vj2.mo62411o() == null) {
                return 0;
            }
        }
        return 10;
    }
}
