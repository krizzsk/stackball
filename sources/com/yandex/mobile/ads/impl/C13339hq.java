package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.hq */
final class C13339hq extends Lambda implements Function1<View, Boolean> {

    /* renamed from: b */
    final /* synthetic */ View f34508b;

    /* renamed from: c */
    final /* synthetic */ C13224gq f34509c;

    /* renamed from: d */
    final /* synthetic */ C15177xl f34510d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13339hq(View view, C13224gq gqVar, C15177xl xlVar) {
        super(1);
        this.f34508b = view;
        this.f34509c = gqVar;
        this.f34510d = xlVar;
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        Intrinsics.checkNotNullParameter(view, "it");
        return Boolean.valueOf(xn1.f42644a.mo70926a(view, this.f34508b) || C13224gq.m36673a(this.f34509c, view, this.f34510d));
    }
}
