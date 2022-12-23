package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.zm */
final class C15330zm extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ View.OnClickListener f43228b;

    /* renamed from: c */
    final /* synthetic */ View f43229c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15330zm(View.OnClickListener onClickListener, View view) {
        super(0);
        this.f43228b = onClickListener;
        this.f43229c = view;
    }

    public Object invoke() {
        this.f43228b.onClick(this.f43229c);
        return Unit.INSTANCE;
    }
}
