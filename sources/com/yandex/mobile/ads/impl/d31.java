package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

public final class d31 extends e51 {

    /* renamed from: c */
    private final long f32362c;

    /* renamed from: d */
    private final BufferedSource f32363d;

    public d31(String str, long j, BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        this.f32362c = j;
        this.f32363d = bufferedSource;
    }

    /* renamed from: b */
    public long mo66401b() {
        return this.f32362c;
    }

    /* renamed from: c */
    public BufferedSource mo66402c() {
        return this.f32363d;
    }
}
