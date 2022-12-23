package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class dj0 extends Drawable {

    /* renamed from: e */
    public static final C12900a f32679e = new C12900a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final float f32680a;

    /* renamed from: b */
    private final int[] f32681b;

    /* renamed from: c */
    private final Paint f32682c = new Paint();

    /* renamed from: d */
    private RectF f32683d = new RectF();

    /* renamed from: com.yandex.mobile.ads.impl.dj0$a */
    public static final class C12900a {
        private C12900a() {
        }

        public /* synthetic */ C12900a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LinearGradient mo66610a(float f, int[] iArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(iArr, "colors");
            float f2 = (float) (i / 2);
            double d = (double) ((float) ((((double) f) * 3.141592653589793d) / ((double) 180.0f)));
            float cos = ((float) Math.cos(d)) * f2;
            float f3 = (float) (i2 / 2);
            float sin = ((float) Math.sin(d)) * f3;
            return new LinearGradient(f2 - cos, f3 + sin, f2 + cos, f3 - sin, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public dj0(float f, int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "colors");
        this.f32680a = f;
        this.f32681b = iArr;
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(this.f32683d, this.f32682c);
    }

    public int getOpacity() {
        return this.f32682c.getAlpha();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect != null) {
            this.f32682c.setShader(f32679e.mo66610a(this.f32680a, this.f32681b, rect.width(), rect.height()));
            this.f32683d.set(rect);
        }
    }

    public void setAlpha(int i) {
        this.f32682c.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
