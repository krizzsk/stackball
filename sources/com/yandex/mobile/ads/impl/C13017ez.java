package com.yandex.mobile.ads.impl;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.C12667bz;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ez */
final class C13017ez extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C12667bz f33191b;

    /* renamed from: c */
    final /* synthetic */ j50 f33192c;

    /* renamed from: d */
    final /* synthetic */ sc1<?> f33193d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13017ez(C12667bz bzVar, j50 j50, sc1<?> sc1) {
        super(1);
        this.f33191b = bzVar;
        this.f33192c = j50;
        this.f33193d = sc1;
    }

    public Object invoke(Object obj) {
        int i;
        C12667bz bzVar = this.f33191b;
        C12667bz.C12677h hVar = bzVar.f31692x;
        C13776kr krVar = hVar.f31731j;
        C13776kr krVar2 = bzVar.f31694z;
        f50<Integer> f50 = hVar.f31730i;
        Integer a = f50 == null ? null : f50.mo66924a(this.f33192c);
        if (a == null) {
            i = (int) (this.f33191b.f31692x.f31724c.mo66924a(this.f33192c).floatValue() * 1.3f);
        } else {
            i = a.intValue();
        }
        int intValue = i + krVar.f36400d.mo66924a(this.f33192c).intValue() + krVar.f36397a.mo66924a(this.f33192c).intValue() + krVar2.f36400d.mo66924a(this.f33192c).intValue() + krVar2.f36397a.mo66924a(this.f33192c).intValue();
        DisplayMetrics displayMetrics = this.f33193d.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = this.f33193d.getLayoutParams();
        Integer valueOf = Integer.valueOf(intValue);
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
        layoutParams.height = C14175ob.m40349c(valueOf, displayMetrics);
        return Unit.INSTANCE;
    }
}
