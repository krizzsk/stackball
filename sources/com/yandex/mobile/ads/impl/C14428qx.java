package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14141nx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.qx */
final class C14428qx extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14233ox f39314b;

    /* renamed from: c */
    final /* synthetic */ C12931dy f39315c;

    /* renamed from: d */
    final /* synthetic */ j50 f39316d;

    /* renamed from: e */
    final /* synthetic */ C14141nx.C14147f f39317e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14428qx(C14233ox oxVar, C12931dy dyVar, j50 j50, C14141nx.C14147f fVar) {
        super(1);
        this.f39314b = oxVar;
        this.f39315c = dyVar;
        this.f39316d = j50;
        this.f39317e = fVar;
    }

    public Object invoke(Object obj) {
        ((Number) obj).intValue();
        this.f39314b.m40609a((q91) this.f39315c, this.f39316d, this.f39317e);
        return Unit.INSTANCE;
    }
}
