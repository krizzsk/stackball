package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

public final class md1 extends Drawable {

    /* renamed from: a */
    private final p91 f37314a;

    /* renamed from: b */
    private ld1 f37315b;

    /* renamed from: c */
    private final RectF f37316c = new RectF();

    public md1(p91 p91) {
        Intrinsics.checkNotNullParameter(p91, "textStyle");
        this.f37314a = p91;
        this.f37315b = new ld1(p91);
    }

    /* renamed from: a */
    public final void mo68650a(String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        this.f37315b.mo68408a(str);
        invalidateSelf();
    }

    /* renamed from: b */
    public final int mo68651b() {
        return (int) this.f37314a.mo69336a();
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f37316c.set(getBounds());
        this.f37315b.mo68407a(canvas, this.f37316c.centerX(), this.f37316c.centerY());
    }

    public int getIntrinsicHeight() {
        return (int) (this.f37314a.mo69336a() + Math.abs(this.f37314a.mo69339d()));
    }

    public int getIntrinsicWidth() {
        return (int) (this.f37316c.width() + Math.abs(this.f37314a.mo69338c()));
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public final int mo68649a() {
        return (int) this.f37314a.mo69339d();
    }
}
