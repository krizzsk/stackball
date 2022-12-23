package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.a1 */
class C12349a1 {

    /* renamed from: c */
    private static final long f30404c = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    private final Context f30405a;

    /* renamed from: b */
    private final l71 f30406b = l71.m38631c();

    C12349a1(Context context) {
        this.f30405a = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo65635a() {
        d71 a = this.f30406b.mo68362a(this.f30405a);
        Long a2 = a != null ? a.mo66451a() : null;
        return a2 != null ? a2.longValue() : f30404c;
    }
}
