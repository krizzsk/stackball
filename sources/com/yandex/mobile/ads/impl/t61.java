package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class t61 extends jx0 {

    /* renamed from: b */
    private final float f40240b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final float f40241c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final float f40242d;

    /* renamed from: com.yandex.mobile.ads.impl.t61$a */
    private final class C14655a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f40243a;

        /* renamed from: b */
        private boolean f40244b;

        /* renamed from: c */
        final /* synthetic */ t61 f40245c;

        public C14655a(t61 t61, View view) {
            Intrinsics.checkNotNullParameter(t61, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f40245c = t61;
            this.f40243a = view;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
            if (this.f40244b) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f40243a.resetPivot();
                } else {
                    View view = this.f40243a;
                    view.setPivotX(((float) view.getWidth()) * 0.5f);
                    View view2 = this.f40243a;
                    view2.setPivotY(((float) view2.getHeight()) * 0.5f);
                }
            }
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
            boolean z = false;
            this.f40243a.setVisibility(0);
            if (this.f40245c.f40241c == 0.5f) {
                if (this.f40245c.f40242d == 0.5f) {
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            this.f40244b = true;
            View view = this.f40243a;
            view.setPivotX(((float) view.getWidth()) * this.f40245c.f40241c);
            View view2 = this.f40243a;
            view2.setPivotY(((float) view2.getHeight()) * this.f40245c.f40242d);
        }
    }

    public t61(float f, float f2, float f3) {
        this.f40240b = f;
        this.f40241c = f2;
        this.f40242d = f3;
    }

    public void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        float scaleX = transitionValues.view.getScaleX();
        float scaleY = transitionValues.view.getScaleY();
        transitionValues.view.setScaleX(1.0f);
        transitionValues.view.setScaleY(1.0f);
        super.captureEndValues(transitionValues);
        transitionValues.view.setScaleX(scaleX);
        transitionValues.view.setScaleY(scaleY);
        m42264a(transitionValues);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        float scaleX = transitionValues.view.getScaleX();
        float scaleY = transitionValues.view.getScaleY();
        transitionValues.view.setScaleX(1.0f);
        transitionValues.view.setScaleY(1.0f);
        super.captureStartValues(transitionValues);
        transitionValues.view.setScaleX(scaleX);
        transitionValues.view.setScaleY(scaleY);
        m42264a(transitionValues);
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view == null) {
            return null;
        }
        return m42263a(view, m42261a(transitionValues, this.f40240b), m42265b(transitionValues, this.f40240b), m42261a(transitionValues2, 1.0f), m42265b(transitionValues2, 1.0f));
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view == null) {
            return null;
        }
        return m42263a(view, m42261a(transitionValues, 1.0f), m42265b(transitionValues, 1.0f), m42261a(transitionValues2, this.f40240b), m42265b(transitionValues2, this.f40240b));
    }

    /* renamed from: a */
    private final void m42264a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        Map<String, Object> map = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
        map.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
        Map<String, Object> map2 = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map2, "transitionValues.values");
        map2.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r3.values;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float m42265b(androidx.transition.TransitionValues r3, float r4) {
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
            java.lang.String r1 = "yandex:scale:scaleY"
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.t61.m42265b(androidx.transition.TransitionValues, float):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r3.values;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float m42261a(androidx.transition.TransitionValues r3, float r4) {
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
            java.lang.String r1 = "yandex:scale:scaleX"
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.t61.m42261a(androidx.transition.TransitionValues, float):float");
    }

    /* renamed from: a */
    private final Animator m42263a(View view, float f, float f2, float f3, float f4) {
        if (f == f3) {
            if (f2 == f4) {
                return null;
            }
        }
        view.setVisibility(4);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f, f3}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f2, f4})});
        ofPropertyValuesHolder.addListener(new C14655a(this, view));
        return ofPropertyValuesHolder;
    }
}
