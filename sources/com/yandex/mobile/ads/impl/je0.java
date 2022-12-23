package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class je0 {

    /* renamed from: a */
    private final ge0 f35253a;

    /* renamed from: b */
    private v81 f35254b;

    /* renamed from: c */
    private ce0 f35255c;

    /* renamed from: d */
    private int f35256d;

    /* renamed from: e */
    private int f35257e;

    /* renamed from: f */
    private float f35258f;

    /* renamed from: g */
    private float f35259g;

    /* renamed from: h */
    private float f35260h;

    /* renamed from: i */
    private int f35261i;

    /* renamed from: j */
    private int f35262j;

    /* renamed from: k */
    private int f35263k;

    /* renamed from: l */
    private float f35264l;

    /* renamed from: m */
    private float f35265m;

    /* renamed from: n */
    private int f35266n;

    /* renamed from: o */
    private int f35267o = (this.f35257e - 1);

    public je0(ge0 ge0, v81 v81, ce0 ce0) {
        Intrinsics.checkNotNullParameter(ge0, "styleParams");
        Intrinsics.checkNotNullParameter(v81, "singleIndicatorDrawer");
        Intrinsics.checkNotNullParameter(ce0, "animator");
        this.f35253a = ge0;
        this.f35254b = v81;
        this.f35255c = ce0;
        this.f35258f = ge0.mo67267l() / 2.0f;
        this.f35259g = ge0.mo67267l();
        this.f35260h = ge0.mo67269n();
    }

    /* renamed from: a */
    public final void mo67980a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float e;
        float d;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.f35266n;
        int i2 = this.f35267o;
        if (i <= i2) {
            while (true) {
                int i3 = i + 1;
                float a = m37769a(i) - this.f35265m;
                if (0.0f <= a && a <= ((float) this.f35261i)) {
                    float c = this.f35255c.mo66274c(i);
                    float b = this.f35255c.mo66273b(i);
                    float e2 = this.f35255c.mo66276e(i);
                    if (this.f35256d > this.f35257e) {
                        float f7 = this.f35260h * 1.3f;
                        float l = this.f35253a.mo67267l() / ((float) 2);
                        if (i == 0 || i == this.f35256d - 1) {
                            f7 = l;
                        }
                        int i4 = this.f35261i;
                        if (a < f7) {
                            f4 = (c * a) / f7;
                            if (f4 <= this.f35253a.mo67260f()) {
                                f6 = this.f35253a.mo67260f();
                                e = this.f35253a.mo67258e();
                                d = this.f35253a.mo67256c();
                            } else if (f4 < c) {
                                f5 = b * a;
                                b = f5 / f7;
                                f3 = f4;
                                f2 = b;
                                f = e2;
                                this.f35254b.mo67421a(canvas, a, this.f35258f, f3, f2, f, this.f35255c.mo66270a(i));
                            }
                        } else {
                            float f8 = (float) i4;
                            if (a > f8 - f7) {
                                float f9 = (-a) + f8;
                                f4 = (c * f9) / f7;
                                if (f4 <= this.f35253a.mo67260f()) {
                                    f6 = this.f35253a.mo67260f();
                                    e = this.f35253a.mo67258e();
                                    d = this.f35253a.mo67257d();
                                } else if (f4 < c) {
                                    f5 = b * f9;
                                    b = f5 / f7;
                                    f3 = f4;
                                    f2 = b;
                                    f = e2;
                                    this.f35254b.mo67421a(canvas, a, this.f35258f, f3, f2, f, this.f35255c.mo66270a(i));
                                }
                            }
                        }
                        f3 = f6;
                        f2 = e;
                        f = d;
                        this.f35254b.mo67421a(canvas, a, this.f35258f, f3, f2, f, this.f35255c.mo66270a(i));
                    }
                    f3 = c;
                    f2 = b;
                    f = e2;
                    this.f35254b.mo67421a(canvas, a, this.f35258f, f3, f2, f, this.f35255c.mo66270a(i));
                }
                if (i == i2) {
                    break;
                }
                i = i3;
            }
        }
        RectF a2 = this.f35255c.mo66271a(m37769a(this.f35263k) - this.f35265m, this.f35258f);
        if (a2 != null) {
            this.f35254b.mo67422a(canvas, a2, this.f35253a.mo67265j());
        }
    }

    /* renamed from: b */
    public final void mo67982b(int i, float f) {
        this.f35263k = i;
        this.f35264l = f;
        this.f35255c.mo66272a(i, f);
        m37771a(i, f);
    }

    /* renamed from: c */
    public final void mo67983c(int i) {
        this.f35256d = i;
        this.f35255c.mo66275d(i);
        m37770a();
        this.f35259g = (((float) this.f35261i) - (this.f35260h * ((float) (this.f35257e - 1)))) / 2.0f;
        this.f35258f = ((float) this.f35262j) / 2.0f;
    }

    /* renamed from: b */
    public final void mo67981b(int i) {
        this.f35263k = i;
        this.f35264l = 0.0f;
        this.f35255c.onPageSelected(i);
        m37771a(i, 0.0f);
    }

    /* renamed from: a */
    public final void mo67979a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            this.f35261i = i;
            this.f35262j = i2;
            m37770a();
            this.f35259g = (((float) i) - (this.f35260h * ((float) (this.f35257e - 1)))) / 2.0f;
            this.f35258f = ((float) i2) / 2.0f;
            m37771a(this.f35263k, this.f35264l);
        }
    }

    /* renamed from: a */
    private final void m37770a() {
        this.f35257e = RangesKt.coerceAtMost((int) ((((float) this.f35261i) - this.f35253a.mo67267l()) / this.f35260h), this.f35256d);
    }

    /* renamed from: a */
    private final void m37771a(int i, float f) {
        float a;
        int i2;
        int i3 = this.f35256d;
        int i4 = this.f35257e;
        float f2 = 0.0f;
        if (i3 <= i4) {
            this.f35265m = 0.0f;
        } else {
            int i5 = i4 / 2;
            int i6 = (i3 - i5) - 1;
            if (i3 > i4) {
                if (i < i5) {
                    a = m37769a(i5);
                    i2 = this.f35261i / 2;
                } else if (i >= i6) {
                    a = m37769a(i6);
                    i2 = this.f35261i / 2;
                } else {
                    float f3 = this.f35259g;
                    float f4 = this.f35260h;
                    f2 = ((f3 + (((float) i) * f4)) + (f4 * f)) - ((float) (this.f35261i / 2));
                }
                f2 = a - ((float) i2);
            }
            this.f35265m = f2;
        }
        int coerceAtLeast = RangesKt.coerceAtLeast((int) ((this.f35265m - this.f35259g) / this.f35260h), 0);
        this.f35266n = coerceAtLeast;
        this.f35267o = RangesKt.coerceAtMost((int) (((float) coerceAtLeast) + (((float) this.f35261i) / this.f35260h) + ((float) 1)), this.f35256d - 1);
    }

    /* renamed from: a */
    private final float m37769a(int i) {
        return this.f35259g + (this.f35260h * ((float) i));
    }
}
