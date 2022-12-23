package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class s30 extends Lambda implements Function1<Throwable, CharSequence> {

    /* renamed from: b */
    public static final s30 f39827b = new s30();

    s30() {
        super(1);
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Intrinsics.checkNotNullParameter(th, "it");
        if (!(th instanceof oy0)) {
            return Intrinsics.stringPlus(" - ", th.getMessage());
        }
        return " - " + ((oy0) th).mo69284b() + ": " + th.getMessage();
    }
}
