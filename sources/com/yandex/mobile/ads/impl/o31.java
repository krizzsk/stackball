package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class o31 {

    /* renamed from: a */
    private final ba0 f38077a;

    /* renamed from: b */
    private final ba0 f38078b;

    /* renamed from: c */
    private final ba0 f38079c;

    /* renamed from: d */
    private final ba0 f38080d;

    public o31() {
        this((ba0) null, (ba0) null, (ba0) null, (ba0) null, 15);
    }

    public o31(ba0 ba0, ba0 ba02, ba0 ba03, ba0 ba04) {
        Intrinsics.checkNotNullParameter(ba0, "measureFilter");
        Intrinsics.checkNotNullParameter(ba02, "layoutFilter");
        Intrinsics.checkNotNullParameter(ba03, "drawFilter");
        Intrinsics.checkNotNullParameter(ba04, "totalFilter");
        this.f38077a = ba0;
        this.f38078b = ba02;
        this.f38079c = ba03;
        this.f38080d = ba04;
    }

    /* renamed from: a */
    public final ba0 mo69101a() {
        return this.f38079c;
    }

    /* renamed from: b */
    public final ba0 mo69102b() {
        return this.f38078b;
    }

    /* renamed from: c */
    public final ba0 mo69103c() {
        return this.f38077a;
    }

    /* renamed from: d */
    public final ba0 mo69104d() {
        return this.f38080d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o31(ba0 ba0, ba0 ba02, ba0 ba03, ba0 ba04, int i) {
        this((i & 1) != 0 ? ba0.f31276a.mo66032a() : null, (i & 2) != 0 ? ba0.f31276a.mo66032a() : null, (i & 4) != 0 ? ba0.f31276a.mo66032a() : null, (i & 8) != 0 ? ba0.f31276a.mo66033b() : null);
    }
}
