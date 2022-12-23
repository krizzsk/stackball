package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class ay0 extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ List<C14687tm> f30838b;

    /* renamed from: c */
    final /* synthetic */ zx0 f30839c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ay0(List<? extends C14687tm> list, zx0 zx0) {
        super(0);
        this.f30838b = list;
        this.f30839c = zx0;
    }

    public Object invoke() {
        List<C14687tm> list = this.f30838b;
        zx0 zx0 = this.f30839c;
        for (C14687tm a : list) {
            zx0.f43492c.mo70718a(zx0.f43490a, a);
        }
        return Unit.INSTANCE;
    }
}
