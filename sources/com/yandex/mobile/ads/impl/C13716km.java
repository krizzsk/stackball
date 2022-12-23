package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.km */
final class C13716km extends Lambda implements Function0<ea0> {

    /* renamed from: b */
    final /* synthetic */ C13513jm f36167b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13716km(C13513jm jmVar) {
        super(0);
        this.f36167b = jmVar;
    }

    public Object invoke() {
        ea0 a = this.f36167b.mo68038h().mo65803a();
        Intrinsics.checkNotNullExpressionValue(a, "div2Component.histogramReporter");
        return a;
    }
}
