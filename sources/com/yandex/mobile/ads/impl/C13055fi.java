package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* renamed from: com.yandex.mobile.ads.impl.fi */
public class C13055fi {

    /* renamed from: a */
    private final View f33368a;

    /* renamed from: b */
    private final RectF f33369b;

    /* renamed from: c */
    private final Path f33370c;

    /* renamed from: d */
    private final float[] f33371d;

    public C13055fi(View view, float f) {
        this(view, f, f, f, f);
    }

    /* renamed from: a */
    private float[] m36022a(float f, float f2, float f3, float f4) {
        if (f <= 0.0f && f2 <= 0.0f && f3 <= 0.0f && f4 <= 0.0f) {
            return null;
        }
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    /* renamed from: a */
    public void mo67019a(Canvas canvas) {
        if (this.f33371d != null && !this.f33370c.isEmpty()) {
            canvas.clipPath(this.f33370c);
        }
    }

    public C13055fi(View view, float f, float f2, float f3, float f4) {
        this.f33368a = view;
        this.f33369b = new RectF();
        this.f33370c = new Path();
        this.f33371d = m36022a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public void mo67018a() {
        if (this.f33371d != null) {
            int measuredWidth = this.f33368a.getMeasuredWidth();
            int measuredHeight = this.f33368a.getMeasuredHeight();
            int paddingLeft = this.f33368a.getPaddingLeft();
            int paddingTop = this.f33368a.getPaddingTop();
            int paddingRight = measuredWidth - this.f33368a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f33368a.getPaddingBottom();
            if (paddingLeft < paddingRight && paddingTop < paddingBottom) {
                this.f33369b.set((float) paddingLeft, (float) paddingTop, (float) paddingRight, (float) paddingBottom);
                this.f33370c.reset();
                this.f33370c.addRoundRect(this.f33369b, this.f33371d, Path.Direction.CW);
            }
        }
    }
}
