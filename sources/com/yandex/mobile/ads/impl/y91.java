package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class y91 {

    /* renamed from: a */
    private final u91 f42793a = new u91();

    /* renamed from: b */
    private final Matrix f42794b = new Matrix();

    /* renamed from: c */
    private final Paint f42795c;

    /* renamed from: d */
    private final Rect f42796d;

    public y91() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        Unit unit = Unit.INSTANCE;
        this.f42795c = paint;
        this.f42796d = new Rect();
    }

    /* renamed from: a */
    private final float m44228a(float f, float f2, float f3, float f4, boolean z) {
        return z ? f / f4 : f2 / f3;
    }

    /* renamed from: b */
    private final void m44230b(ImageView imageView, Bitmap bitmap, s91 s91) {
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(copy);
        Rect rect = this.f42796d;
        rect.set(s91.mo69908d(), s91.mo69909e(), s91.mo69908d() + s91.mo69907c(), s91.mo69909e() + s91.mo69906b());
        canvas.drawRect(rect, this.f42795c);
        imageView.setImageBitmap(copy);
    }

    /* renamed from: a */
    public final void mo71013a(ImageView imageView, Bitmap bitmap, s91 s91, String str) {
        ImageView imageView2 = imageView;
        Intrinsics.checkNotNullParameter(imageView2, "view");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(s91, "smartCenter");
        Intrinsics.checkNotNullParameter(str, "backGroundColor");
        float width = (float) imageView.getWidth();
        float height = (float) imageView.getHeight();
        float width2 = (float) bitmap.getWidth();
        float height2 = (float) bitmap.getHeight();
        float c = (float) s91.mo69907c();
        float b = (float) s91.mo69906b();
        float f = width / height;
        float a = m44228a(width, height, b, c, f < c / b);
        if (a > 1.0f) {
            a = m44228a(width, height, height2, width2, f < width2 / height2);
        }
        float a2 = m44229a(a, width, s91.mo69908d(), s91.mo69907c());
        float a3 = m44229a(a, height, s91.mo69909e(), s91.mo69906b());
        this.f42794b.setScale(a, a);
        this.f42794b.postTranslate(a2, a3);
        imageView2.setScaleType(ImageView.ScaleType.MATRIX);
        imageView2.setImageMatrix(this.f42794b);
        imageView2.setBackgroundColor(Color.parseColor(str));
        u91 u91 = this.f42793a;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        u91.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            m44230b(imageView, bitmap, s91);
        }
    }

    /* renamed from: a */
    public final void mo71012a(ImageView imageView, Bitmap bitmap, s91 s91) {
        float f;
        Float f2;
        Intrinsics.checkNotNullParameter(imageView, "view");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(s91, "smartCenter");
        float width = (float) imageView.getWidth();
        float height = (float) imageView.getHeight();
        float width2 = (float) bitmap.getWidth();
        float height2 = (float) bitmap.getHeight();
        boolean z = width / height > width2 / height2;
        float a = m44228a(width, height, height2, width2, z);
        float f3 = width2 * a;
        float f4 = height2 * a;
        Float f5 = null;
        float f6 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = m44229a(a, width, s91.mo69908d(), s91.mo69907c());
            if (f > 0.0f) {
                f2 = Float.valueOf(0.0f);
            } else {
                f2 = f + f3 < width ? Float.valueOf(width - f3) : null;
            }
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        if (z) {
            float a2 = m44229a(a, height, s91.mo69909e(), s91.mo69906b());
            if (a2 > 0.0f) {
                f5 = Float.valueOf(0.0f);
            } else if (a2 + f4 < height) {
                f5 = Float.valueOf(height - f4);
            }
            if (f5 == null) {
                f6 = a2;
            } else {
                f6 = f5.floatValue();
            }
        }
        this.f42794b.setScale(a, a);
        this.f42794b.postTranslate(f, f6);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f42794b);
        u91 u91 = this.f42793a;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        u91.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            m44230b(imageView, bitmap, s91);
        }
    }

    /* renamed from: a */
    private final float m44229a(float f, float f2, int i, int i2) {
        return (f2 / ((float) 2)) - (((float) (i + (i2 / 2))) * f);
    }
}
