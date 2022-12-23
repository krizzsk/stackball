package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class sk0 implements rk0 {
    /* renamed from: a */
    public String mo70005a() {
        byte[] decode = Base64.decode("QW1hem9u", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(\"QW1hem9u\",\n      Base64.DEFAULT)");
        return new String(decode, Charsets.UTF_8);
    }

    /* renamed from: b */
    public String mo70006b() {
        byte[] decode = Base64.decode("c2Ftc3VuZw==", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(\"c2Ftc3VuZw==\",\n      Base64.DEFAULT)");
        return new String(decode, Charsets.UTF_8);
    }
}
