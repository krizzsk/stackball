package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13325hj;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

public final class eo0 implements C13325hj.C13326a {

    /* renamed from: a */
    private final String f33026a;

    /* renamed from: b */
    private final int f33027b;

    /* renamed from: c */
    private final int f33028c;

    /* renamed from: d */
    private final boolean f33029d;

    /* renamed from: e */
    private final SSLSocketFactory f33030e;

    /* renamed from: f */
    private final boolean f33031f;

    public eo0(String str, int i, int i2, boolean z, SSLSocketFactory sSLSocketFactory, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "userAgent");
        this.f33026a = str;
        this.f33027b = i;
        this.f33028c = i2;
        this.f33029d = z;
        this.f33030e = sSLSocketFactory;
        this.f33031f = z2;
    }

    /* renamed from: a */
    public C13325hj mo66840a() {
        if (this.f33031f) {
            return new C13990mk(this.f33026a, this.f33027b, this.f33028c, this.f33029d, new vb0());
        }
        return new C13861lk(this.f33026a, this.f33027b, this.f33028c, this.f33029d, new vb0(), this.f33030e);
    }
}
