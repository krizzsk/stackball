package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import kotlin.jvm.internal.Intrinsics;

public class jx0 extends Visibility {
    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        bf1 bf1 = null;
        View view = transitionValues2 == null ? null : transitionValues2.view;
        if (view instanceof bf1) {
            bf1 = (bf1) view;
        }
        if (bf1 != null) {
            bf1.setTransient(true);
        }
        Animator onAppear = super.onAppear(viewGroup, transitionValues, i, transitionValues2, i2);
        if (bf1 != null) {
            bf1.setTransient(false);
        }
        return onAppear;
    }

    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        bf1 bf1 = null;
        View view = transitionValues == null ? null : transitionValues.view;
        if (view instanceof bf1) {
            bf1 = (bf1) view;
        }
        if (bf1 != null) {
            bf1.setTransient(true);
        }
        Animator onDisappear = super.onDisappear(viewGroup, transitionValues, i, transitionValues2, i2);
        if (bf1 != null) {
            bf1.setTransient(false);
        }
        return onDisappear;
    }
}
