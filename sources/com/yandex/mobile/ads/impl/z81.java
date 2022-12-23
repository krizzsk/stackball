package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class z81 {
    /* renamed from: a */
    public static final boolean m44504a(Context context) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(context, "context");
        d71 a = l71.m38631c().mo68362a(context);
        if (a == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(a.mo66445J());
        }
        return Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE);
    }
}
