package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.h41;

/* renamed from: com.yandex.mobile.ads.impl.z5 */
public class C15294z5 implements C13462j<C15234y5> {

    /* renamed from: a */
    private final C13176g6 f43018a;

    /* renamed from: b */
    private final C12356a5 f43019b;

    /* renamed from: c */
    private final k41 f43020c;

    C15294z5(C13176g6 g6Var, C12356a5 a5Var, k41 k41) {
        this.f43018a = g6Var;
        this.f43019b = a5Var;
        this.f43020c = k41;
    }

    /* renamed from: a */
    public void mo66948a(View view, C13370i iVar) {
        C15234y5 y5Var = (C15234y5) iVar;
        for (String a : y5Var.mo70997c()) {
            this.f43019b.mo65674a(a);
        }
        this.f43018a.mo67202a(view, y5Var);
        ((C13198gf) this.f43020c).mo67276a(h41.C13276b.ADTUNE);
    }
}
