package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class nn1 {
    /* renamed from: a */
    public final ln1 mo69070a(Context context, ck1<?> ck1, C13156g1 g1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Intrinsics.checkNotNullParameter(g1Var, "adBreakPosition");
        jn1 jn1 = new jn1(context);
        C12383ah ahVar = new C12383ah();
        C13413ii a = ck1.mo66321a();
        Intrinsics.checkNotNullExpressionValue(a, "videoAdInfo.creative");
        ahVar.mo65758a((ln1) new C14386qi(a, jn1));
        lj1 e = ck1.mo66325e();
        Intrinsics.checkNotNullExpressionValue(e, "videoAdInfo.vastVideoAd");
        ahVar.mo65758a((ln1) new nl1(e, jn1));
        cj1 a2 = new dj1().mo66611a(context, ck1, g1Var, jn1);
        if (a2 != null) {
            ahVar.mo65758a((ln1) a2);
        }
        return new mn1(ahVar);
    }
}
