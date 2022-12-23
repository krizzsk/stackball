package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.chartboost.sdk.impl.k0 */
public class C1940k0 extends C1976r1 {

    /* renamed from: c */
    private Paint f4953c;

    /* renamed from: d */
    private Paint f4954d;

    /* renamed from: e */
    private Path f4955e;

    /* renamed from: f */
    private RectF f4956f;

    /* renamed from: g */
    private RectF f4957g;

    /* renamed from: h */
    private int f4958h = 0;

    /* renamed from: i */
    private float f4959i;

    /* renamed from: j */
    private float f4960j;

    public C1940k0(Context context) {
        super(context);
        m4661a(context);
    }

    /* renamed from: a */
    private void m4661a(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        this.f4959i = 4.5f * f;
        Paint paint = new Paint();
        this.f4953c = paint;
        paint.setColor(-1);
        this.f4953c.setStyle(Paint.Style.STROKE);
        this.f4953c.setStrokeWidth(f * 1.0f);
        this.f4953c.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f4954d = paint2;
        paint2.setColor(-855638017);
        this.f4954d.setStyle(Paint.Style.FILL);
        this.f4954d.setAntiAlias(true);
        this.f4955e = new Path();
        this.f4957g = new RectF();
        this.f4956f = new RectF();
    }

    /* renamed from: b */
    public void mo14676b(int i) {
        this.f4953c.setColor(i);
        invalidate();
    }

    /* renamed from: c */
    public void mo14677c(int i) {
        this.f4954d.setColor(i);
        invalidate();
    }

    /* renamed from: b */
    public void mo14675b(float f) {
        this.f4959i = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14674a(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f4956f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float min = (float) Math.min(1, Math.round(f * 0.5f));
        this.f4956f.inset(min, min);
        this.f4955e.reset();
        Path path = this.f4955e;
        RectF rectF = this.f4956f;
        float f2 = this.f4959i;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.f4955e);
        canvas.drawColor(this.f4958h);
        this.f4957g.set(this.f4956f);
        RectF rectF2 = this.f4957g;
        float f3 = rectF2.right;
        float f4 = rectF2.left;
        rectF2.right = ((f3 - f4) * this.f4960j) + f4;
        canvas.drawRect(rectF2, this.f4954d);
        canvas.restore();
        RectF rectF3 = this.f4956f;
        float f5 = this.f4959i;
        canvas.drawRoundRect(rectF3, f5, f5, this.f4953c);
    }

    /* renamed from: a */
    public void mo14673a(int i) {
        this.f4958h = i;
        invalidate();
    }

    /* renamed from: a */
    public void mo14672a(float f) {
        this.f4960j = f;
        if (getVisibility() != 8) {
            invalidate();
        }
    }
}
