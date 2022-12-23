package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.oo */
final class C14203oo extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C15066wo f38288b;

    /* renamed from: c */
    final /* synthetic */ j50 f38289c;

    /* renamed from: d */
    final /* synthetic */ View f38290d;

    /* renamed from: e */
    final /* synthetic */ C12663bx f38291e;

    /* renamed from: f */
    final /* synthetic */ ShapeDrawable f38292f;

    /* renamed from: g */
    final /* synthetic */ Function1<Drawable, Unit> f38293g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14203oo(C15066wo woVar, j50 j50, View view, C12663bx bxVar, ShapeDrawable shapeDrawable, Function1<? super Drawable, Unit> function1) {
        super(1);
        this.f38288b = woVar;
        this.f38289c = j50;
        this.f38290d = view;
        this.f38291e = bxVar;
        this.f38292f = shapeDrawable;
        this.f38293g = function1;
    }

    public Object invoke(Object obj) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        Float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        f50<Integer> f50;
        Integer a;
        f50<Integer> f502;
        Integer a2;
        f50<Integer> f503;
        Integer a3;
        f50<Integer> f504;
        Integer a4;
        Integer a5;
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        f50<Integer> f505 = this.f38288b.f42072a;
        if (f505 == null || (a5 = f505.mo66924a(this.f38289c)) == null) {
            f = null;
        } else {
            DisplayMetrics displayMetrics = this.f38290d.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            f = Float.valueOf(C14175ob.m40344b(a5, displayMetrics));
        }
        C13873lq lqVar = this.f38288b.f42073b;
        if (lqVar == null || (f504 = lqVar.f36788c) == null || (a4 = f504.mo66924a(this.f38289c)) == null) {
            f2 = null;
        } else {
            DisplayMetrics displayMetrics2 = this.f38290d.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "resources.displayMetrics");
            f2 = Float.valueOf(C14175ob.m40344b(a4, displayMetrics2));
        }
        C13873lq lqVar2 = this.f38288b.f42073b;
        if (lqVar2 == null || (f503 = lqVar2.f36789d) == null || (a3 = f503.mo66924a(this.f38289c)) == null) {
            f3 = null;
        } else {
            DisplayMetrics displayMetrics3 = this.f38290d.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "resources.displayMetrics");
            f3 = Float.valueOf(C14175ob.m40344b(a3, displayMetrics3));
        }
        C13873lq lqVar3 = this.f38288b.f42073b;
        if (lqVar3 == null || (f502 = lqVar3.f36787b) == null || (a2 = f502.mo66924a(this.f38289c)) == null) {
            f4 = null;
        } else {
            DisplayMetrics displayMetrics4 = this.f38290d.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "resources.displayMetrics");
            f4 = Float.valueOf(C14175ob.m40344b(a2, displayMetrics4));
        }
        C13873lq lqVar4 = this.f38288b.f42073b;
        if (lqVar4 == null || (f50 = lqVar4.f36786a) == null || (a = f50.mo66924a(this.f38289c)) == null) {
            f5 = null;
        } else {
            DisplayMetrics displayMetrics5 = this.f38290d.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "resources.displayMetrics");
            f5 = Float.valueOf(C14175ob.m40344b(a, displayMetrics5));
        }
        DisplayMetrics displayMetrics6 = this.f38290d.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "resources.displayMetrics");
        float b = C14175ob.m40344b(this.f38291e.f31619b.mo66924a(this.f38289c), displayMetrics6);
        int doubleValue = (int) (this.f38291e.f31618a.mo66924a(this.f38289c).doubleValue() * ((double) 254));
        int intValue = this.f38291e.f31620c.mo66924a(this.f38289c).intValue();
        DisplayMetrics displayMetrics7 = this.f38290d.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "resources.displayMetrics");
        float a6 = (float) C14175ob.m40329a(this.f38291e.f31621d.f37927a.f33051b.mo66924a(this.f38289c), displayMetrics7);
        DisplayMetrics displayMetrics8 = this.f38290d.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "resources.displayMetrics");
        float a7 = (float) C14175ob.m40329a(this.f38291e.f31621d.f37928b.f33051b.mo66924a(this.f38289c), displayMetrics8);
        float[] fArr = new float[8];
        int i = 0;
        while (true) {
            f6 = 0.0f;
            if (i >= 8) {
                break;
            }
            fArr[i] = 0.0f;
            i++;
        }
        if (f2 == null) {
            f2 = f;
        }
        if (f2 == null) {
            f7 = 0.0f;
        } else {
            f7 = f2.floatValue();
        }
        fArr[0] = f7;
        fArr[1] = f7;
        if (f3 == null) {
            f3 = f;
        }
        if (f3 == null) {
            f8 = 0.0f;
        } else {
            f8 = f3.floatValue();
        }
        fArr[2] = f8;
        fArr[3] = f8;
        if (f4 == null) {
            f4 = f;
        }
        if (f4 == null) {
            f9 = 0.0f;
        } else {
            f9 = f4.floatValue();
        }
        fArr[4] = f9;
        fArr[5] = f9;
        if (f5 != null) {
            f = f5;
        }
        if (f != null) {
            f6 = f.floatValue();
        }
        fArr[6] = f6;
        fArr[7] = f6;
        this.f38292f.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        this.f38292f.getPaint().setShadowLayer(b, a6, a7, Color.argb(doubleValue, Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        this.f38293g.invoke(this.f38292f);
        return Unit.INSTANCE;
    }
}
