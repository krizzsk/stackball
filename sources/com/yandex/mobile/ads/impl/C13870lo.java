package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.lo */
final class C13870lo extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f36766b;

    /* renamed from: c */
    final /* synthetic */ e10 f36767c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13870lo(View view, e10 e10) {
        super(1);
        this.f36766b = view;
        this.f36767c = e10;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "id");
        this.f36766b.setNextFocusDownId(this.f36767c.mo66739a(str));
        return Unit.INSTANCE;
    }
}
