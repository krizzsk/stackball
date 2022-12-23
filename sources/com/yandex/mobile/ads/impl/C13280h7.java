package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.h7 */
public class C13280h7 extends ImageSpan {

    /* renamed from: b */
    private WeakReference<Drawable> f34280b;

    /* renamed from: c */
    private final int f34281c;

    public C13280h7(Drawable drawable, int i) {
        super(drawable);
        this.f34281c = i;
    }

    /* renamed from: a */
    private Drawable m36810a() {
        WeakReference<Drawable> weakReference = this.f34280b;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f34280b = new WeakReference<>(drawable2);
        return drawable2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f34281c == -1) {
            Drawable a = m36810a();
            canvas.save();
            canvas.translate(f, (float) Math.round((((float) (i3 + i5)) / 2.0f) - (((float) a.getBounds().height()) / 2.0f)));
            a.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = m36810a().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
