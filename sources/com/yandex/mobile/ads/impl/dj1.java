package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class dj1 {

    /* renamed from: a */
    private final xw0 f32684a = new xw0();

    /* renamed from: a */
    public final cj1 mo66611a(Context context, ck1<?> ck1, C13156g1 g1Var, jn1 jn1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Intrinsics.checkNotNullParameter(g1Var, "adBreakPosition");
        Intrinsics.checkNotNullParameter(jn1, "videoEventTracker");
        if (this.f32684a.mo70945b(context)) {
            return new cj1(context, ck1, g1Var, jn1);
        }
        return null;
    }
}
