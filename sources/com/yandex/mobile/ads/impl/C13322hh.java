package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.hh */
public final class C13322hh {

    /* renamed from: a */
    private final b31 f34421a;

    public C13322hh(b31 b31) {
        Intrinsics.checkNotNullParameter(b31, "delegate");
        this.f34421a = b31;
    }

    /* renamed from: a */
    public final b31 mo67554a() {
        return this.f34421a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13322hh(int i, long j, TimeUnit timeUnit) {
        this(new b31(cd1.f31895i, i, j, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public C13322hh() {
        this(5, 5, TimeUnit.MINUTES);
    }
}
