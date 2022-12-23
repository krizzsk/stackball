package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.io */
final class C13428io extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f34956b;

    /* renamed from: c */
    final /* synthetic */ e10 f34957c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13428io(View view, e10 e10) {
        super(1);
        this.f34956b = view;
        this.f34957c = e10;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "id");
        this.f34956b.setNextFocusForwardId(this.f34957c.mo66739a(str));
        return Unit.INSTANCE;
    }
}
