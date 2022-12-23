package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

public final class ld1 {

    /* renamed from: a */
    private final p91 f36642a;

    /* renamed from: b */
    private final Rect f36643b = new Rect();

    /* renamed from: c */
    private final Paint f36644c;

    /* renamed from: d */
    private String f36645d;

    /* renamed from: e */
    private float f36646e;

    /* renamed from: f */
    private float f36647f;

    public ld1(p91 p91) {
        Intrinsics.checkNotNullParameter(p91, "textStyle");
        this.f36642a = p91;
        Paint paint = new Paint(1);
        paint.setTextSize(p91.mo69336a());
        paint.setColor(p91.mo69340e());
        paint.setTypeface(p91.mo69337b());
        paint.setStyle(Paint.Style.FILL);
        this.f36644c = paint;
    }

    /* renamed from: a */
    public final void mo68408a(String str) {
        this.f36645d = str;
        this.f36644c.getTextBounds(str, 0, str == null ? 0 : str.length(), this.f36643b);
        this.f36646e = this.f36644c.measureText(this.f36645d) / 2.0f;
        this.f36647f = ((float) this.f36643b.height()) / 2.0f;
    }

    /* renamed from: a */
    public final void mo68407a(Canvas canvas, float f, float f2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        String str = this.f36645d;
        if (str != null) {
            canvas.drawText(str, (f - this.f36646e) + this.f36642a.mo69338c(), f2 + this.f36647f + this.f36642a.mo69339d(), this.f36644c);
        }
    }
}
