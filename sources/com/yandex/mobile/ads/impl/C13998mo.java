package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.mo */
final class C13998mo extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f37451b;

    /* renamed from: c */
    final /* synthetic */ e10 f37452c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13998mo(View view, e10 e10) {
        super(1);
        this.f37451b = view;
        this.f37452c = e10;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "id");
        this.f37451b.setNextFocusLeftId(this.f37452c.mo66739a(str));
        return Unit.INSTANCE;
    }
}
