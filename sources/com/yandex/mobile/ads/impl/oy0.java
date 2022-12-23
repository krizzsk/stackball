package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;

public final class oy0 extends RuntimeException {

    /* renamed from: b */
    private final qy0 f38412b;

    /* renamed from: c */
    private final wh0 f38413c;

    /* renamed from: d */
    private final String f38414d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy0(qy0 qy0, String str, Throwable th, wh0 wh0, String str2, int i) {
        this(qy0, str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : wh0, (i & 16) != 0 ? null : str2);
    }

    /* renamed from: a */
    public final String mo69283a() {
        return this.f38414d;
    }

    /* renamed from: b */
    public final qy0 mo69284b() {
        return this.f38412b;
    }

    /* renamed from: c */
    public final wh0 mo69285c() {
        return this.f38413c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oy0(qy0 qy0, String str, Throwable th, wh0 wh0, String str2) {
        super(str, th);
        Intrinsics.checkNotNullParameter(qy0, IronSourceConstants.EVENTS_ERROR_REASON);
        Intrinsics.checkNotNullParameter(str, "message");
        this.f38412b = qy0;
        this.f38413c = wh0;
        this.f38414d = str2;
    }
}
