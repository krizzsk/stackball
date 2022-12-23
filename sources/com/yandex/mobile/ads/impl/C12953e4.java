package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.base.C12102i;

/* renamed from: com.yandex.mobile.ads.impl.e4 */
class C12953e4 extends View {

    /* renamed from: a */
    private final C12980ej f32895a;

    /* renamed from: b */
    Paint f32896b;

    /* renamed from: c */
    Paint f32897c;

    /* renamed from: d */
    Paint f32898d;

    /* renamed from: e */
    int f32899e;

    /* renamed from: f */
    int f32900f;

    /* renamed from: g */
    int f32901g = -1;

    /* renamed from: h */
    float f32902h = -1.0f;

    public C12953e4(Context context) {
        super(context);
        int i = C12567b4.f31221a;
        this.f32899e = i;
        this.f32900f = i;
        this.f32895a = new C12980ej(context);
        this.f32900f = i;
        m35564a(i);
        m35563a();
    }

    /* renamed from: a */
    private void m35564a(int i) {
        int a = lo1.m38863a(i, 20.0f);
        this.f32899e = a;
        float[] fArr = new float[3];
        Color.colorToHSV(a, fArr);
        if (!(fArr[2] < 0.5f)) {
            this.f32901g = ViewCompat.MEASURED_STATE_MASK;
        } else if (this.f32895a.mo66833a()) {
            this.f32901g = -7829368;
        } else {
            this.f32901g = -1;
        }
    }

    /* renamed from: b */
    private void m35565b() {
        this.f32896b.setColor(this.f32899e);
        this.f32897c.setColor(this.f32901g);
        this.f32898d.setColor(this.f32901g);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f32895a.mo66833a()) {
            this.f32901g = -7829368;
        } else {
            this.f32901g = -1;
        }
        m35565b();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        float min = (float) Math.min(getWidth(), getHeight());
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, this.f32896b);
        float f2 = min / 5.0f;
        float f3 = f - f2;
        float f4 = f2 + f;
        Canvas canvas2 = canvas;
        float f5 = f3;
        float f6 = f4;
        canvas2.drawLine(f5, f3, f6, f4, this.f32897c);
        canvas2.drawLine(f5, f4, f6, f3, this.f32897c);
        float f7 = this.f32902h;
        if (f7 > 0.0f) {
            this.f32898d.setStrokeWidth(f7);
            canvas.drawCircle(f, f, f - this.f32902h, this.f32898d);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m35564a(C12102i.f29172a);
            m35565b();
            invalidate();
        } else if (1 == motionEvent.getAction()) {
            m35564a(this.f32900f);
            m35565b();
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.f32900f = i;
        m35564a(i);
        m35565b();
        invalidate();
    }

    /* renamed from: a */
    private void m35563a() {
        Paint paint = new Paint(0);
        this.f32896b = paint;
        paint.setAntiAlias(true);
        this.f32896b.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(0);
        this.f32897c = paint2;
        paint2.setAntiAlias(true);
        this.f32897c.setStrokeWidth(2.0f);
        this.f32897c.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(0);
        this.f32898d = paint3;
        paint3.setAntiAlias(true);
        this.f32898d.setStyle(Paint.Style.STROKE);
        m35565b();
    }
}
