package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class x90 extends w90 {

    /* renamed from: b */
    private final Function0<y90> f42476b;

    public x90(Function0<y90> function0) {
        Intrinsics.checkNotNullParameter(function0, "histogramColdTypeChecker");
        this.f42476b = function0;
    }

    /* renamed from: b */
    public final String mo70849b(String str) {
        Intrinsics.checkNotNullParameter(str, "histogramName");
        if (!this.f42476b.invoke().mo70666a(str)) {
            return mo70666a(str) ? "Cool" : "Warm";
        }
        mo70666a(str);
        return "Cold";
    }
}
