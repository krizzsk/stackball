package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.l1 */
public final class C13825l1 {

    /* renamed from: a */
    private final C12563b1 f36485a;

    /* renamed from: b */
    private final jn1 f36486b;

    public C13825l1(Context context, C12563b1 b1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(b1Var, "adBreak");
        this.f36485a = b1Var;
        this.f36486b = new jn1(context);
    }

    /* renamed from: a */
    public final void mo68304a() {
        this.f36486b.mo68069a(this.f36485a, "breakEnd");
    }

    /* renamed from: b */
    public final void mo68305b() {
        this.f36486b.mo68069a(this.f36485a, "error");
    }

    /* renamed from: c */
    public final void mo68306c() {
        this.f36486b.mo68069a(this.f36485a, "breakStart");
    }
}
