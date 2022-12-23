package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.internal.view.SupportMenu;

/* renamed from: com.yandex.mobile.ads.impl.bd */
public class C12583bd extends View {

    /* renamed from: a */
    private final C14393ql f31293a;

    /* renamed from: b */
    private Paint f31294b;

    /* renamed from: c */
    private Paint f31295c;

    /* renamed from: d */
    private Paint f31296d;

    /* renamed from: e */
    private float f31297e;

    /* renamed from: f */
    private float f31298f;

    /* renamed from: g */
    private float f31299g;

    /* renamed from: h */
    private float f31300h;

    public C12583bd(Context context, C14393ql qlVar) {
        super(context);
        this.f31293a = qlVar;
        m34218a(context);
    }

    /* renamed from: a */
    private void m34218a(Context context) {
        this.f31297e = 40.0f;
        this.f31298f = (float) this.f31293a.mo69618a(context, 34.0f);
        this.f31299g = (float) this.f31293a.mo69618a(context, 3.0f);
        this.f31300h = (float) this.f31293a.mo69618a(context, 20.0f);
        Paint paint = new Paint();
        this.f31294b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f31295c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f31295c.setStrokeWidth(this.f31299g);
        this.f31295c.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f31296d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f31296d.setTextSize(this.f31300h);
        this.f31296d.setTextAlign(Paint.Align.CENTER);
        m34217a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f31298f / 2.0f;
        canvas.drawCircle(f, f, f, this.f31294b);
        canvas.drawCircle(f, f, f - (this.f31299g / 2.0f), this.f31295c);
        float f2 = this.f31298f / 2.0f;
        canvas.drawText("!", f2, f2 - ((this.f31296d.descent() + this.f31296d.ascent()) / 2.0f), this.f31296d);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = (int) this.f31298f;
        setMeasuredDimension(i3, i3);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f31297e = z ? 0.0f : 40.0f;
        m34217a();
        invalidate();
    }

    /* renamed from: a */
    private void m34217a() {
        this.f31295c.setColor(lo1.m38863a((int) SupportMenu.CATEGORY_MASK, this.f31297e));
        this.f31294b.setColor(lo1.m38863a(-1, this.f31297e));
        this.f31296d.setColor(lo1.m38863a((int) SupportMenu.CATEGORY_MASK, this.f31297e));
    }
}
