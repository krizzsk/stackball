package com.yandex.mobile.ads.impl;

import android.view.View;

/* renamed from: com.yandex.mobile.ads.impl.o4 */
public abstract class C14165o4 {
    /* renamed from: a */
    public static C14165o4 m40279a(C14253p4 p4Var, C14353q4 q4Var) {
        if (zw0.m44845a()) {
            return new ts1(p4Var, q4Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: a */
    public abstract void mo69105a();

    /* renamed from: a */
    public abstract void mo69106a(View view);

    /* renamed from: a */
    public abstract void mo69107a(View view, t70 t70, String str);

    /* renamed from: b */
    public abstract void mo69108b();
}
