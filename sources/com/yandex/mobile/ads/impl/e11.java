package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class e11 implements xg1 {

    /* renamed from: a */
    private final k41 f32882a;

    /* renamed from: b */
    private final wc1 f32883b;

    /* renamed from: c */
    private String f32884c;

    public e11(k41 k41, wc1 wc1) {
        Intrinsics.checkNotNullParameter(k41, "reporter");
        Intrinsics.checkNotNullParameter(wc1, "targetUrlHandler");
        this.f32882a = k41;
        this.f32883b = wc1;
    }

    /* renamed from: a */
    public void mo66740a(String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.f32884c = str;
        if (str != null) {
            if (!(str.length() == 0)) {
                wc1 wc1 = this.f32883b;
                k41 k41 = this.f32882a;
                String str2 = this.f32884c;
                if (str2 != null) {
                    wc1.mo68549a(k41, str2);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
                    throw null;
                }
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
            throw null;
        }
    }
}
