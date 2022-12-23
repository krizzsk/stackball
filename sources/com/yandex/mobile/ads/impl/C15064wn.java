package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.wn */
final class C15064wn extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f42064b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15064wn(View view) {
        super(1);
        this.f42064b = view;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "description");
        C14175ob.m40340a(this.f42064b, str);
        return Unit.INSTANCE;
    }
}
