package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class z21 extends Lambda implements Function0<List<? extends Certificate>> {

    /* renamed from: b */
    final /* synthetic */ C14669te f43006b;

    /* renamed from: c */
    final /* synthetic */ m90 f43007c;

    /* renamed from: d */
    final /* synthetic */ C14563s5 f43008d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z21(C14669te teVar, m90 m90, C14563s5 s5Var) {
        super(0);
        this.f43006b = teVar;
        this.f43007c = m90;
        this.f43008d = s5Var;
    }

    public Object invoke() {
        C14587se a = this.f43006b.mo70158a();
        Intrinsics.checkNotNull(a);
        return a.mo69500a(this.f43007c.mo68625c(), this.f43008d.mo69885k().mo66958g());
    }
}
