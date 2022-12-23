package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.vn */
final class C14898vn extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f41330b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14898vn(View view) {
        super(1);
        this.f41330b = view;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "description");
        C14175ob.m40347b(this.f41330b, str);
        return Unit.INSTANCE;
    }
}
