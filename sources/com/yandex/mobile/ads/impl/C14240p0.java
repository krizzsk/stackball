package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.p0 */
public final class C14240p0 {

    /* renamed from: a */
    private final C14333q0 f38425a;

    /* renamed from: b */
    private final List<C14434r0> f38426b = new CopyOnWriteArrayList();

    public C14240p0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C14333q0 a = C14333q0.m41022a(context);
        Intrinsics.checkNotNullExpressionValue(a, "getInstance(context)");
        this.f38425a = a;
    }

    /* renamed from: a */
    public final void mo69291a(C14434r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f38426b.add(r0Var);
        this.f38425a.mo69463b(r0Var);
    }

    /* renamed from: a */
    public final void mo69290a() {
        for (C14434r0 a : this.f38426b) {
            this.f38425a.mo69462a(a);
        }
        this.f38426b.clear();
    }
}
