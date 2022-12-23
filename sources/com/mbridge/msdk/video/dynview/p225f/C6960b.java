package com.mbridge.msdk.video.dynview.p225f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.foundation.tools.C6347k;

/* renamed from: com.mbridge.msdk.video.dynview.f.b */
/* compiled from: MBShapeDrawable */
public final class C6960b extends GradientDrawable {

    /* renamed from: a */
    private int f17161a = 0;

    /* renamed from: a */
    public final void mo48470a(int i, int i2) {
        this.f17161a = i;
        setStroke(i, i2);
    }

    /* renamed from: a */
    public final void mo48469a(int i) {
        mo48470a(this.f17161a, i);
    }

    /* renamed from: a */
    public static C6960b m17561a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6347k.m16085a(context, "RoundShape"));
        int color = obtainStyledAttributes.getColor(C6347k.m16086b(context, "RoundShape_roundBgColor", "styleable"), ContextCompat.getColor(context, C6347k.m16084a(context, "white", "color")));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundShape_roundRadius", "styleable"), 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundShape_topLeftRadius", "styleable"), 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundShape_topRightRadius", "styleable"), 0);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundShape_bottomLeftRadius", "styleable"), 0);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundShape_bottomLeftRadius", "styleable"), 0);
        int color2 = obtainStyledAttributes.getColor(C6347k.m16086b(context, "RoundShape_roundStrokeColor", "styleable"), ContextCompat.getColor(context, C6347k.m16084a(context, "white", "color")));
        int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundShape_roundStrokeWidth", "styleable"), 0);
        obtainStyledAttributes.recycle();
        C6960b bVar = new C6960b();
        bVar.setColor(color);
        if (dimensionPixelSize2 > 0 || dimensionPixelSize3 > 0 || dimensionPixelSize4 > 0 || dimensionPixelSize5 > 0) {
            float f = (float) dimensionPixelSize2;
            float f2 = (float) dimensionPixelSize3;
            float f3 = (float) dimensionPixelSize4;
            float f4 = (float) dimensionPixelSize5;
            bVar.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        } else {
            bVar.setCornerRadius((float) dimensionPixelSize);
        }
        bVar.mo48470a(dimensionPixelSize6, color2);
        return bVar;
    }
}
