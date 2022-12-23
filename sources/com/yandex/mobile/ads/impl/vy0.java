package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class vy0 extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vy0(String str, Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(str, "message");
    }
}
