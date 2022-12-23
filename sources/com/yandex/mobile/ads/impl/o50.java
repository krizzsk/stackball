package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class o50 {

    /* renamed from: a */
    private final j50 f38090a;

    /* renamed from: b */
    private final th1 f38091b;

    /* renamed from: c */
    private final jf1 f38092c;

    /* renamed from: d */
    private d10 f38093d;

    public o50(j50 j50, th1 th1, jf1 jf1) {
        Intrinsics.checkNotNullParameter(j50, "expressionResolver");
        Intrinsics.checkNotNullParameter(th1, "variableController");
        Intrinsics.checkNotNullParameter(jf1, "triggersController");
        this.f38090a = j50;
        this.f38091b = th1;
        this.f38092c = jf1;
    }

    /* renamed from: a */
    public final j50 mo69116a() {
        return this.f38090a;
    }

    /* renamed from: b */
    public final th1 mo69118b() {
        return this.f38091b;
    }

    /* renamed from: a */
    public final void mo69117a(d10 d10) {
        if (!Intrinsics.areEqual((Object) this.f38093d, (Object) d10)) {
            this.f38092c.mo67987a(this.f38093d);
            this.f38093d = d10;
        }
    }
}
