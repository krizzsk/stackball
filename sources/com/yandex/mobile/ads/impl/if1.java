package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s00;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class if1 extends Lambda implements Function1<s00.C14554d, Unit> {

    /* renamed from: b */
    final /* synthetic */ hf1 f34848b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    if1(hf1 hf1) {
        super(1);
        this.f34848b = hf1;
    }

    public Object invoke(Object obj) {
        s00.C14554d dVar = (s00.C14554d) obj;
        Intrinsics.checkNotNullParameter(dVar, "it");
        this.f34848b.f34396j = dVar;
        return Unit.INSTANCE;
    }
}
