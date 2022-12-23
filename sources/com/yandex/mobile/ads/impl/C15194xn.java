package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.xn */
final class C15194xn extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f42638b;

    /* renamed from: c */
    final /* synthetic */ f50<C13215gn> f42639c;

    /* renamed from: d */
    final /* synthetic */ j50 f42640d;

    /* renamed from: e */
    final /* synthetic */ f50<C13332hn> f42641e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15194xn(View view, f50<C13215gn> f50, j50 j50, f50<C13332hn> f502) {
        super(1);
        this.f42638b = view;
        this.f42639c = f50;
        this.f42640d = j50;
        this.f42641e = f502;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        View view = this.f42638b;
        f50<C13215gn> f50 = this.f42639c;
        C13332hn hnVar = null;
        C13215gn a = f50 == null ? null : f50.mo66924a(this.f42640d);
        f50<C13332hn> f502 = this.f42641e;
        if (f502 != null) {
            hnVar = f502.mo66924a(this.f42640d);
        }
        C14175ob.m40335a(view, a, hnVar);
        return Unit.INSTANCE;
    }
}
