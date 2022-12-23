package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.my.target.f6 */
public class C7404f6 extends View {

    /* renamed from: a */
    public final Rect f18586a;

    /* renamed from: b */
    public final Paint f18587b;

    /* renamed from: c */
    public final ColorFilter f18588c;

    /* renamed from: d */
    public final float f18589d = C7761y8.m20928a();

    /* renamed from: e */
    public int f18590e;

    /* renamed from: f */
    public Bitmap f18591f;

    /* renamed from: g */
    public int f18592g;

    /* renamed from: h */
    public int f18593h;

    public C7404f6(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f18587b = paint;
        paint.setFilterBitmap(true);
        this.f18590e = C7761y8.m20931a(10, context);
        this.f18586a = new Rect();
        this.f18588c = new LightingColorFilter(-3355444, 1);
    }

    /* renamed from: a */
    public void mo50150a(Bitmap bitmap, boolean z) {
        int i;
        this.f18591f = bitmap;
        if (bitmap == null) {
            i = 0;
            this.f18593h = 0;
        } else if (z) {
            float f = 1.0f;
            if (this.f18589d > 1.0f) {
                f = 2.0f;
            }
            this.f18593h = (int) ((((float) bitmap.getHeight()) / f) * this.f18589d);
            i = (int) ((((float) this.f18591f.getWidth()) / f) * this.f18589d);
        } else {
            this.f18592g = bitmap.getWidth();
            this.f18593h = this.f18591f.getHeight();
            requestLayout();
        }
        this.f18592g = i;
        requestLayout();
    }

    public int getPadding() {
        return this.f18590e;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18591f != null) {
            Rect rect = this.f18586a;
            int i = this.f18590e;
            rect.left = i;
            rect.top = i;
            rect.right = getMeasuredWidth() - this.f18590e;
            this.f18586a.bottom = getMeasuredHeight() - this.f18590e;
            canvas.drawBitmap(this.f18591f, (Rect) null, this.f18586a, this.f18587b);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = this.f18590e * 2;
        int i6 = size - i5;
        int i7 = size2 - i5;
        if (this.f18591f == null || (i3 = this.f18592g) <= 0 || (i4 = this.f18593h) <= 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = f / f2;
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode == 0 && mode2 == 0) {
            i6 = i3;
            i7 = i4;
        } else if (mode == 0) {
            i6 = (int) (((float) i7) * f3);
        } else {
            float f4 = (float) i6;
            if (mode2 != 0) {
                float f5 = f4 / f;
                float f6 = (float) i7;
                if (Math.min(f5, f6 / f2) != f5 || f3 <= 0.0f) {
                    i6 = (int) (f6 * f3);
                }
            }
            i7 = (int) (f4 / f3);
        }
        int i8 = this.f18590e * 2;
        setMeasuredDimension(i6 + i8, i7 + i8);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Paint paint;
        ColorFilter colorFilter;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            } else if (motionEvent.getX() >= 0.0f && motionEvent.getX() <= ((float) getMeasuredWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() <= ((float) getMeasuredHeight())) {
                performClick();
            }
            paint = this.f18587b;
            colorFilter = null;
        } else {
            paint = this.f18587b;
            colorFilter = this.f18588c;
        }
        paint.setColorFilter(colorFilter);
        invalidate();
        return true;
    }

    public void setPadding(int i) {
        this.f18590e = i;
    }
}
