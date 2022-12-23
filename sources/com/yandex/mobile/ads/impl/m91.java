package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class m91 implements C15302zc {

    /* renamed from: b */
    private final Float f37272b;

    /* renamed from: c */
    private final Float f37273c;

    public m91(Float f, Float f2) {
        this.f37272b = f;
        this.f37273c = f2;
    }

    /* renamed from: b */
    public Object mo65627b(String str) {
        Intrinsics.checkNotNullParameter(str, "variableName");
        if (Intrinsics.areEqual((Object) str, (Object) "this.thumb_value")) {
            Float f = this.f37272b;
            if (f == null) {
                return "null";
            }
            return f.toString();
        } else if (!Intrinsics.areEqual((Object) str, (Object) "this.thumb_secondary_value")) {
            return null;
        } else {
            Float f2 = this.f37273c;
            if (f2 == null) {
                return "null";
            }
            return f2.toString();
        }
    }
}
