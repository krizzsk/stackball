package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.core.view.ViewCompat;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

public final class c20 {

    /* renamed from: a */
    private final C14393ql f31790a = new C14393ql();

    /* renamed from: a */
    public final Drawable mo66189a(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        int a = this.f31790a.mo69618a(context, 6.0f);
        int a2 = this.f31790a.mo69618a(context, 4.0f);
        int a3 = this.f31790a.mo69618a(context, 3.0f);
        int a4 = this.f31790a.mo69618a(context, 12.0f);
        int i3 = (a * i2) + ((i2 + 1) * a2);
        float f = (float) a4;
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, f);
        float[] fArr = new float[8];
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, (float[]) null));
        shapeDrawable.setIntrinsicWidth(i3);
        shapeDrawable.setIntrinsicHeight(a4);
        shapeDrawable.getPaint().setColor(ViewCompat.MEASURED_STATE_MASK);
        shapeDrawable.setAlpha(102);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i2];
        for (int i6 = 0; i6 < i2; i6++) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.setIntrinsicHeight(a);
            shapeDrawable2.setIntrinsicWidth(a);
            shapeDrawable2.getPaint().setColor(-1);
            if (i6 != i) {
                shapeDrawable2.setAlpha(102);
            }
            Unit unit = Unit.INSTANCE;
            shapeDrawableArr[i6] = shapeDrawable2;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(shapeDrawable);
        spreadBuilder.addSpread(shapeDrawableArr);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) spreadBuilder.toArray(new ShapeDrawable[spreadBuilder.size()]));
        if (i2 > 0) {
            while (true) {
                int i7 = i4 + 1;
                int i8 = a2 + a;
                layerDrawable.setLayerInset(i7, (i4 * i8) + a2, a3, i3 - (i8 * i7), a3);
                if (i7 >= i2) {
                    break;
                }
                i4 = i7;
            }
        }
        return layerDrawable;
    }
}
