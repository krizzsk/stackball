package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class oq1 implements ce0 {

    /* renamed from: a */
    private final ge0 f38303a;

    /* renamed from: b */
    private float f38304b;

    /* renamed from: c */
    private final RectF f38305c = new RectF();

    /* renamed from: d */
    private final float f38306d;

    public oq1(ge0 ge0) {
        Intrinsics.checkNotNullParameter(ge0, "style");
        this.f38303a = ge0;
        this.f38306d = ge0.mo67269n();
    }

    /* renamed from: a */
    public int mo66270a(int i) {
        return this.f38303a.mo67255b();
    }

    /* renamed from: b */
    public float mo66273b(int i) {
        return this.f38303a.mo67261g();
    }

    /* renamed from: c */
    public float mo66274c(int i) {
        return this.f38303a.mo67262h();
    }

    /* renamed from: d */
    public void mo66275d(int i) {
    }

    /* renamed from: e */
    public float mo66276e(int i) {
        return this.f38303a.mo67256c();
    }

    public void onPageSelected(int i) {
    }

    /* renamed from: a */
    public void mo66272a(int i, float f) {
        this.f38304b = f;
    }

    /* renamed from: a */
    public RectF mo66271a(float f, float f2) {
        this.f38305c.top = f2 - (this.f38303a.mo67261g() / 2.0f);
        RectF rectF = this.f38305c;
        float f3 = this.f38306d;
        rectF.right = RangesKt.coerceAtMost(this.f38304b * f3 * 2.0f, f3) + f + (this.f38303a.mo67262h() / 2.0f);
        this.f38305c.bottom = f2 + (this.f38303a.mo67261g() / 2.0f);
        this.f38305c.left = (f + RangesKt.coerceAtLeast((this.f38306d * (this.f38304b - 0.5f)) * 2.0f, 0.0f)) - (this.f38303a.mo67262h() / 2.0f);
        return this.f38305c;
    }
}
