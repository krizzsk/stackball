package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.c00;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

final class ff1 extends Visibility {

    /* renamed from: b */
    private final c00.C12691d f33355b;

    /* renamed from: c */
    private final Float f33356c;

    /* renamed from: d */
    private final float f33357d = a91.m33642a(10.0f);

    public ff1(c00.C12691d dVar, Float f) {
        Intrinsics.checkNotNullParameter(dVar, "position");
        this.f33355b = dVar;
        this.f33356c = f;
    }

    /* renamed from: a */
    private final int m36012a(c00.C12691d dVar) {
        switch (dVar.ordinal()) {
            case 0:
            case 1:
            case 7:
                return 1;
            case 2:
            case 6:
                return 0;
            case 3:
            case 4:
            case 5:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private final int m36013b(c00.C12691d dVar) {
        switch (dVar.ordinal()) {
            case 0:
            case 4:
                return 0;
            case 1:
            case 2:
            case 3:
                return 1;
            case 5:
            case 6:
            case 7:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(transitionValues, "startValues");
        Intrinsics.checkNotNullParameter(transitionValues2, "endValues");
        int a = m36012a(this.f33355b);
        int b = m36013b(this.f33355b);
        view.setTranslationX(((float) a) * (this.f33356c != null ? ((float) view.getWidth()) * this.f33356c.floatValue() : this.f33357d));
        view.setTranslationY(((float) b) * (this.f33356c != null ? ((float) view.getHeight()) * this.f33356c.floatValue() : this.f33357d));
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{view.getTranslationX(), 0.0f}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{view.getTranslationY(), 0.0f})});
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…f\n            )\n        )");
        return ofPropertyValuesHolder;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(transitionValues, "startValues");
        Intrinsics.checkNotNullParameter(transitionValues2, "endValues");
        int a = m36012a(this.f33355b);
        int b = m36013b(this.f33355b);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        fArr[1] = ((float) a) * (this.f33356c != null ? ((float) view.getWidth()) * this.f33356c.floatValue() : this.f33357d);
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[2];
        fArr2[0] = 0.0f;
        fArr2[1] = ((float) b) * (this.f33356c != null ? ((float) view.getHeight()) * this.f33356c.floatValue() : this.f33357d);
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(property2, fArr2);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…n\n            )\n        )");
        return ofPropertyValuesHolder;
    }
}
