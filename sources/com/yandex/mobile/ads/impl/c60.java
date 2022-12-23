package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.transition.TransitionValues;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class c60 extends jx0 {

    /* renamed from: b */
    private final float f31822b;

    /* renamed from: com.yandex.mobile.ads.impl.c60$a */
    private static final class C12705a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f31823a;

        /* renamed from: b */
        private boolean f31824b;

        public C12705a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f31823a = view;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
            if (this.f31824b) {
                this.f31823a.setLayerType(0, (Paint) null);
            }
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
            this.f31823a.setVisibility(0);
            if (ViewCompat.hasOverlappingRendering(this.f31823a) && this.f31823a.getLayerType() == 0) {
                this.f31824b = true;
                this.f31823a.setLayerType(2, (Paint) null);
            }
        }
    }

    public c60(float f) {
        this.f31822b = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r3.values;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float m34597a(androidx.transition.TransitionValues r3, float r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0004
            goto L_0x0008
        L_0x0004:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.values
            if (r3 != 0) goto L_0x000a
        L_0x0008:
            r3 = r0
            goto L_0x0010
        L_0x000a:
            java.lang.String r1 = "yandex:fade:alpha"
            java.lang.Object r3 = r3.get(r1)
        L_0x0010:
            boolean r1 = r3 instanceof java.lang.Float
            if (r1 == 0) goto L_0x0017
            r0 = r3
            java.lang.Float r0 = (java.lang.Float) r0
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            float r4 = r0.floatValue()
        L_0x001e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c60.m34597a(androidx.transition.TransitionValues, float):float");
    }

    public void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureEndValues(transitionValues);
        Map<String, Object> map = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
        map.put("yandex:fade:alpha", Float.valueOf(transitionValues.view.getAlpha()));
    }

    public void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureStartValues(transitionValues);
        Map<String, Object> map = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
        map.put("yandex:fade:alpha", Float.valueOf(transitionValues.view.getAlpha()));
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        if (view == null) {
            return null;
        }
        return m34598a(view, m34597a(transitionValues, this.f31822b), m34597a(transitionValues2, 1.0f));
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        if (view == null) {
            return null;
        }
        return m34598a(view, m34597a(transitionValues, 1.0f), m34597a(transitionValues2, this.f31822b));
    }

    /* renamed from: a */
    private final Animator m34598a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f, f2});
        ofFloat.addListener(new C12705a(view));
        return ofFloat;
    }
}
