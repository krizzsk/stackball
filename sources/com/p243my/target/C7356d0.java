package com.p243my.target;

import android.content.Context;

/* renamed from: com.my.target.d0 */
public class C7356d0 extends C7355d<C7731x2> {
    /* renamed from: a */
    public static C7356d0 m18915a() {
        return new C7356d0();
    }

    /* renamed from: a */
    public C7731x2 mo49976a(C7731x2 x2Var, C7298a aVar, Context context) {
        C7523l2 c = x2Var.mo51823c();
        if (c == null) {
            C7541m2 b = x2Var.mo51418b();
            if (b == null || !b.mo50848b()) {
                return null;
            }
            return x2Var;
        }
        C7596p1 adChoices = c.getAdChoices();
        if (adChoices == null) {
            return x2Var;
        }
        C7509k8.m19615a(adChoices.mo51318c()).mo50747c(context);
        return x2Var;
    }
}
