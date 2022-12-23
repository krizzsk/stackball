package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14141nx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.sx */
final class C14639sx extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14233ox f40168b;

    /* renamed from: c */
    final /* synthetic */ C12931dy f40169c;

    /* renamed from: d */
    final /* synthetic */ j50 f40170d;

    /* renamed from: e */
    final /* synthetic */ C14141nx.C14147f f40171e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14639sx(C14233ox oxVar, C12931dy dyVar, j50 j50, C14141nx.C14147f fVar) {
        super(1);
        this.f40168b = oxVar;
        this.f40169c = dyVar;
        this.f40170d = j50;
        this.f40171e = fVar;
    }

    public Object invoke(Object obj) {
        ((Number) obj).intValue();
        this.f40168b.m40611b(this.f40169c, this.f40170d, this.f40171e);
        return Unit.INSTANCE;
    }
}
