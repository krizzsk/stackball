package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.jo */
final class C13528jo extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f35414b;

    /* renamed from: c */
    final /* synthetic */ e10 f35415c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13528jo(View view, e10 e10) {
        super(1);
        this.f35414b = view;
        this.f35415c = e10;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "id");
        this.f35414b.setNextFocusUpId(this.f35415c.mo66739a(str));
        return Unit.INSTANCE;
    }
}
