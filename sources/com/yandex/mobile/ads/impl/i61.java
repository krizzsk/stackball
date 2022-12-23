package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.internal.NativeProtocol;
import kotlin.jvm.internal.Intrinsics;

public final class i61 extends Drawable {

    /* renamed from: a */
    private final j61 f34748a;

    /* renamed from: b */
    private final Paint f34749b;

    /* renamed from: c */
    private final Paint f34750c;

    /* renamed from: d */
    private final RectF f34751d;

    public i61(j61 j61) {
        Intrinsics.checkNotNullParameter(j61, NativeProtocol.WEB_DIALOG_PARAMS);
        this.f34748a = j61;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(j61.mo67933a());
        this.f34749b = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        if (j61.mo67936d() != null) {
            paint2.setColor(j61.mo67936d().intValue());
        }
        if (j61.mo67937e() != null) {
            paint2.setStrokeWidth(j61.mo67937e().floatValue());
        }
        this.f34750c = paint2;
        RectF rectF = new RectF(0.0f, 0.0f, j61.mo67939f(), j61.mo67934b());
        this.f34751d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f34749b.setColor(this.f34748a.mo67933a());
        this.f34751d.set(getBounds());
        canvas.drawRoundRect(this.f34751d, this.f34748a.mo67935c(), this.f34748a.mo67935c(), this.f34749b);
        if (this.f34748a.mo67937e() != null && this.f34748a.mo67936d() != null) {
            canvas.drawRoundRect(this.f34751d, this.f34748a.mo67935c(), this.f34748a.mo67935c(), this.f34750c);
        }
    }

    public int getIntrinsicHeight() {
        return (int) this.f34748a.mo67934b();
    }

    public int getIntrinsicWidth() {
        return (int) this.f34748a.mo67939f();
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
