package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h41;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class vp0 {

    /* renamed from: a */
    private final sn0 f41359a;

    /* renamed from: b */
    private boolean f41360b = true;

    /* renamed from: c */
    private boolean f41361c = true;

    /* renamed from: d */
    private boolean f41362d = true;

    public vp0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        sn0 b = sn0.m42091b(context);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance(context)");
        this.f41359a = b;
    }

    /* renamed from: a */
    public final void mo70510a() {
        if (this.f41362d) {
            m43178a("first_auto_swipe");
            this.f41362d = false;
        }
    }

    /* renamed from: b */
    public final void mo70511b() {
        if (this.f41360b) {
            m43178a("first_click_on_controls");
            this.f41360b = false;
        }
    }

    /* renamed from: c */
    public final void mo70512c() {
        if (this.f41361c) {
            m43178a("first_user_swipe");
            this.f41361c = false;
        }
    }

    /* renamed from: a */
    private final void m43178a(String str) {
        this.f41359a.mo70035a(new h41(h41.C13276b.MULTIBANNER_EVENT, MapsKt.hashMapOf(TuplesKt.m45515to("event_type", str))));
    }
}
