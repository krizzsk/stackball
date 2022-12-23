package com.p243my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* renamed from: com.my.target.n6 */
public class C7564n6 extends View {

    /* renamed from: a */
    public final Paint f19085a = new Paint();

    /* renamed from: b */
    public final Paint f19086b = new Paint();

    /* renamed from: c */
    public final Paint f19087c = new Paint();

    /* renamed from: d */
    public final C7761y8 f19088d;

    /* renamed from: e */
    public RectF f19089e = new RectF();

    /* renamed from: f */
    public long f19090f = 0;

    /* renamed from: g */
    public float f19091g = 0.0f;

    /* renamed from: h */
    public float f19092h = 0.0f;

    /* renamed from: i */
    public float f19093i = 230.0f;

    /* renamed from: j */
    public boolean f19094j = false;

    /* renamed from: k */
    public int f19095k;

    /* renamed from: l */
    public int f19096l;

    public C7564n6(Context context) {
        super(context);
        C7761y8 c = C7761y8.m20950c(context);
        this.f19088d = c;
        this.f19096l = c.mo51902b(28);
    }

    /* renamed from: a */
    public final void mo50994a() {
        this.f19085a.setColor(-1);
        this.f19085a.setAntiAlias(true);
        this.f19085a.setStyle(Paint.Style.STROKE);
        this.f19085a.setStrokeWidth((float) this.f19088d.mo51902b(1));
        this.f19086b.setColor(-2013265920);
        this.f19086b.setAntiAlias(true);
        this.f19086b.setStyle(Paint.Style.FILL);
        this.f19086b.setStrokeWidth((float) this.f19088d.mo51902b(4));
    }

    /* renamed from: a */
    public final void mo50995a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f19089e = new RectF((float) (getPaddingLeft() + this.f19088d.mo51902b(1)), (float) (paddingTop + this.f19088d.mo51902b(1)), (float) ((i - getPaddingRight()) - this.f19088d.mo51902b(1)), (float) ((i2 - paddingBottom) - this.f19088d.mo51902b(1)));
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.f19089e, this.f19086b);
        if (this.f19091g != this.f19092h) {
            this.f19091g = Math.min(this.f19091g + ((((float) (SystemClock.uptimeMillis() - this.f19090f)) / 1000.0f) * this.f19093i), this.f19092h);
            this.f19090f = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        canvas.drawArc(this.f19089e, -90.0f, isInEditMode() ? 360.0f : this.f19091g, false, this.f19085a);
        this.f19087c.setColor(-1);
        this.f19087c.setTextSize((float) this.f19088d.mo51902b(12));
        this.f19087c.setTextAlign(Paint.Align.CENTER);
        this.f19087c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f19095k), (float) ((int) this.f19089e.centerX()), (float) ((int) (this.f19089e.centerY() - ((this.f19087c.descent() + this.f19087c.ascent()) / 2.0f))), this.f19087c);
        if (z) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int paddingLeft = this.f19096l + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.f19096l + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        } else if (mode == 1073741824) {
            paddingLeft = size;
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo50995a(i, i2);
        mo50994a();
        invalidate();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f19090f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.f19095k = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.f19093i = 360.0f / f;
        }
    }

    public void setProgress(float f) {
        if (this.f19094j) {
            this.f19091g = 0.0f;
            this.f19094j = false;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f19092h;
        if (f != f2) {
            if (this.f19091g == f2) {
                this.f19090f = SystemClock.uptimeMillis();
            }
            this.f19092h = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }

    public void setSize(int i) {
        this.f19096l = i;
    }
}
