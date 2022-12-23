package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import kotlin.jvm.internal.Intrinsics;

public final class v61 implements ce0 {

    /* renamed from: a */
    private final ge0 f41199a;

    /* renamed from: b */
    private final ArgbEvaluator f41200b = new ArgbEvaluator();

    /* renamed from: c */
    private final SparseArray<Float> f41201c = new SparseArray<>();

    /* renamed from: d */
    private int f41202d;

    public v61(ge0 ge0) {
        Intrinsics.checkNotNullParameter(ge0, "styleParams");
        this.f41199a = ge0;
    }

    /* renamed from: a */
    public RectF mo66271a(float f, float f2) {
        return null;
    }

    /* renamed from: a */
    public void mo66272a(int i, float f) {
        m43039b(i, 1.0f - f);
        if (i < this.f41202d - 1) {
            m43039b(i + 1, f);
        } else {
            m43039b(0, f);
        }
    }

    /* renamed from: b */
    public float mo66273b(int i) {
        float g = this.f41199a.mo67261g();
        float k = this.f41199a.mo67266k() - this.f41199a.mo67261g();
        Float f = this.f41201c.get(i, Float.valueOf(0.0f));
        Intrinsics.checkNotNullExpressionValue(f, "getScaleAt(position)");
        return g + (k * f.floatValue());
    }

    /* renamed from: c */
    public float mo66274c(int i) {
        float h = this.f41199a.mo67262h();
        float l = this.f41199a.mo67267l() - this.f41199a.mo67262h();
        Float f = this.f41201c.get(i, Float.valueOf(0.0f));
        Intrinsics.checkNotNullExpressionValue(f, "getScaleAt(position)");
        return h + (l * f.floatValue());
    }

    /* renamed from: d */
    public void mo66275d(int i) {
        this.f41202d = i;
    }

    /* renamed from: e */
    public float mo66276e(int i) {
        float c = this.f41199a.mo67256c();
        float j = this.f41199a.mo67265j() - this.f41199a.mo67256c();
        Float f = this.f41201c.get(i, Float.valueOf(0.0f));
        Intrinsics.checkNotNullExpressionValue(f, "getScaleAt(position)");
        return c + (j * f.floatValue());
    }

    public void onPageSelected(int i) {
        this.f41201c.clear();
        this.f41201c.put(i, Float.valueOf(1.0f));
    }

    /* renamed from: b */
    private final void m43039b(int i, float f) {
        if (f == 0.0f) {
            this.f41201c.remove(i);
        } else {
            this.f41201c.put(i, Float.valueOf(Math.abs(f)));
        }
    }

    /* renamed from: a */
    public int mo66270a(int i) {
        Float f = this.f41201c.get(i, Float.valueOf(0.0f));
        Intrinsics.checkNotNullExpressionValue(f, "getScaleAt(position)");
        Object evaluate = this.f41200b.evaluate(f.floatValue(), Integer.valueOf(this.f41199a.mo67255b()), Integer.valueOf(this.f41199a.mo67264i()));
        if (evaluate != null) {
            return ((Integer) evaluate).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
