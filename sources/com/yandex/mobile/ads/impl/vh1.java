package com.yandex.mobile.ads.impl;

public final class vh1 extends RuntimeException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh1(String str, Throwable th, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public vh1(String str, Throwable th) {
        super(str, th);
    }
}
