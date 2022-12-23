package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

public final class u61 extends Visibility {

    /* renamed from: b */
    private final float f40579b;

    public u61(float f) {
        this.f40579b = f;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(transitionValues, "startValues");
        Intrinsics.checkNotNullParameter(transitionValues2, "endValues");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{this.f40579b, view.getScaleX()}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{this.f40579b, view.getScaleY()})});
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…Y\n            )\n        )");
        return ofPropertyValuesHolder;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(transitionValues, "startValues");
        Intrinsics.checkNotNullParameter(transitionValues2, "endValues");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{view.getScaleX(), this.f40579b}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{view.getScaleY(), this.f40579b})});
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…r\n            )\n        )");
        return ofPropertyValuesHolder;
    }
}
