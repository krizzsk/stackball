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

/* renamed from: com.my.target.g6 */
public class C7422g6 extends View {

    /* renamed from: a */
    public final Rect f18645a;

    /* renamed from: b */
    public final Paint f18646b;

    /* renamed from: c */
    public final ColorFilter f18647c;

    /* renamed from: d */
    public final float f18648d = C7761y8.m20928a();

    /* renamed from: e */
    public final int f18649e;

    /* renamed from: f */
    public Bitmap f18650f;

    /* renamed from: g */
    public int f18651g;

    /* renamed from: h */
    public int f18652h;

    public C7422g6(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f18646b = paint;
        paint.setFilterBitmap(true);
        this.f18649e = C7761y8.m20931a(10, context);
        this.f18645a = new Rect();
        this.f18647c = new LightingColorFilter(-3355444, 1);
    }

    /* renamed from: a */
    public void mo50226a(Bitmap bitmap, boolean z) {
        int i;
        this.f18650f = bitmap;
        if (bitmap == null) {
            i = 0;
            this.f18652h = 0;
        } else if (z) {
            float f = 1.0f;
            if (this.f18648d > 1.0f) {
                f = 2.0f;
            }
            this.f18652h = (int) ((((float) bitmap.getHeight()) / f) * this.f18648d);
            i = (int) ((((float) this.f18650f.getWidth()) / f) * this.f18648d);
        } else {
            this.f18651g = bitmap.getWidth();
            this.f18652h = this.f18650f.getHeight();
            int i2 = this.f18651g;
            int i3 = this.f18649e * 2;
            setMeasuredDimension(i2 + i3, this.f18652h + i3);
            requestLayout();
        }
        this.f18651g = i;
        int i22 = this.f18651g;
        int i32 = this.f18649e * 2;
        setMeasuredDimension(i22 + i32, this.f18652h + i32);
        requestLayout();
    }

    public int getPadding() {
        return this.f18649e;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f18650f;
        if (bitmap != null) {
            Rect rect = this.f18645a;
            int i = this.f18649e;
            rect.left = i;
            rect.top = i;
            rect.right = this.f18651g + i;
            rect.bottom = this.f18652h + i;
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f18646b);
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
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
            paint = this.f18646b;
            colorFilter = null;
        } else {
            paint = this.f18646b;
            colorFilter = this.f18647c;
        }
        paint.setColorFilter(colorFilter);
        invalidate();
        return true;
    }
}
