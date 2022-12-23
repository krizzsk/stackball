package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.trackselection.C12330d;
import com.yandex.mobile.ads.exo.trackselection.C12333e;

public final class le1 {

    /* renamed from: a */
    public final int f36648a;

    /* renamed from: b */
    public final u31[] f36649b;

    /* renamed from: c */
    public final C12333e f36650c;

    /* renamed from: d */
    public final Object f36651d;

    public le1(u31[] u31Arr, C12330d[] dVarArr, Object obj) {
        this.f36649b = u31Arr;
        this.f36650c = new C12333e(dVarArr);
        this.f36651d = obj;
        this.f36648a = u31Arr.length;
    }

    /* renamed from: a */
    public boolean mo68415a(int i) {
        return this.f36649b[i] != null;
    }

    /* renamed from: a */
    public boolean mo68416a(le1 le1, int i) {
        if (le1 != null && ih1.m37382a((Object) this.f36649b[i], (Object) le1.f36649b[i]) && ih1.m37382a((Object) this.f36650c.mo65401a(i), (Object) le1.f36650c.mo65401a(i))) {
            return true;
        }
        return false;
    }
}
