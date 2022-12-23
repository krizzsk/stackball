package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.w5 */
public class C11903w5 extends C11737s5 {

    /* renamed from: b */
    private final C11268g6 f28630b;

    public C11903w5(C11229f4 f4Var) {
        this(f4Var, f4Var.mo62877j());
    }

    /* renamed from: a */
    public boolean mo61047a(C11411k0 k0Var) {
        if (TextUtils.isEmpty(k0Var.mo63154g())) {
            return false;
        }
        k0Var.mo63140a(this.f28630b.mo62949a(k0Var.mo63154g()));
        return false;
    }

    C11903w5(C11229f4 f4Var, C11268g6 g6Var) {
        super(f4Var);
        this.f28630b = g6Var;
    }
}
