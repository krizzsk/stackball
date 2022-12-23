package com.p243my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* renamed from: com.my.target.o6 */
public class C7588o6 extends View {

    /* renamed from: a */
    public final Paint f19150a = new Paint();

    /* renamed from: b */
    public final Paint f19151b = new Paint();

    /* renamed from: c */
    public final Paint f19152c = new Paint();

    /* renamed from: d */
    public final C7761y8 f19153d;

    /* renamed from: e */
    public RectF f19154e = new RectF();

    /* renamed from: f */
    public long f19155f = 0;

    /* renamed from: g */
    public float f19156g = 0.0f;

    /* renamed from: h */
    public float f19157h = 0.0f;

    /* renamed from: i */
    public float f19158i = 230.0f;

    /* renamed from: j */
    public boolean f19159j = false;

    /* renamed from: k */
    public int f19160k;

    public C7588o6(Context context) {
        super(context);
        this.f19153d = C7761y8.m20950c(context);
    }

    /* renamed from: a */
    public final void mo51296a() {
        this.f19150a.setColor(-1);
        this.f19150a.setAntiAlias(true);
        this.f19150a.setStyle(Paint.Style.STROKE);
        this.f19150a.setStrokeWidth((float) this.f19153d.mo51902b(1));
        this.f19151b.setColor(-2013265920);
        this.f19151b.setAntiAlias(true);
        this.f19151b.setStyle(Paint.Style.FILL);
        this.f19151b.setStrokeWidth((float) this.f19153d.mo51902b(4));
    }

    /* renamed from: a */
    public final void mo51297a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f19154e = new RectF((float) (getPaddingLeft() + this.f19153d.mo51902b(1)), (float) (paddingTop + this.f19153d.mo51902b(1)), (float) ((i - getPaddingRight()) - this.f19153d.mo51902b(1)), (float) ((i2 - paddingBottom) - this.f19153d.mo51902b(1)));
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.f19154e, this.f19151b);
        if (this.f19156g != this.f19157h) {
            this.f19156g = Math.min(this.f19156g + ((((float) (SystemClock.uptimeMillis() - this.f19155f)) / 1000.0f) * this.f19158i), this.f19157h);
            this.f19155f = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        canvas.drawArc(this.f19154e, -90.0f, isInEditMode() ? 360.0f : this.f19156g, false, this.f19150a);
        this.f19152c.setColor(-1);
        this.f19152c.setTextSize((float) this.f19153d.mo51902b(12));
        this.f19152c.setTextAlign(Paint.Align.CENTER);
        this.f19152c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f19160k), (float) ((int) this.f19154e.centerX()), (float) ((int) (this.f19154e.centerY() - ((this.f19152c.descent() + this.f19152c.ascent()) / 2.0f))), this.f19152c);
        if (z) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int b = this.f19153d.mo51902b(28) + getPaddingLeft() + getPaddingRight();
        int b2 = this.f19153d.mo51902b(28) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            b = size;
        } else if (mode == Integer.MIN_VALUE) {
            b = Math.min(b, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            b2 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            b2 = Math.min(b2, size2);
        }
        setMeasuredDimension(b, b2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo51297a(i, i2);
        mo51296a();
        invalidate();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f19155f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.f19160k = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.f19158i = 360.0f / f;
        }
    }

    public void setProgress(float f) {
        if (this.f19159j) {
            this.f19156g = 0.0f;
            this.f19159j = false;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f19157h;
        if (f != f2) {
            if (this.f19156g == f2) {
                this.f19155f = SystemClock.uptimeMillis();
            }
            this.f19157h = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }
}
