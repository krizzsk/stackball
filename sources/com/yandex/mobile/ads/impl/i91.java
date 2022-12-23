package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.C12066R;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

public final class i91 extends jx0 {

    /* renamed from: d */
    public static final C13392e f34790d = new C13392e((DefaultConstructorMarker) null);

    /* renamed from: e */
    private static final C13389b f34791e = new C13389b();

    /* renamed from: f */
    private static final C13391d f34792f = new C13391d();

    /* renamed from: g */
    private static final C13390c f34793g = new C13390c();

    /* renamed from: h */
    private static final C13388a f34794h = new C13388a();

    /* renamed from: b */
    private final int f34795b;

    /* renamed from: c */
    private final C13394g f34796c;

    /* renamed from: com.yandex.mobile.ads.impl.i91$a */
    public static final class C13388a extends C13396i {
        C13388a() {
        }

        /* renamed from: a */
        public float mo67757a(ViewGroup viewGroup, View view, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            float translationY = view.getTranslationY();
            C13392e eVar = i91.f34790d;
            int height = viewGroup.getHeight() - view.getTop();
            if (i == -1) {
                i = height;
            }
            return translationY + ((float) i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i91$b */
    public static final class C13389b extends C13393f {
        C13389b() {
        }

        /* renamed from: b */
        public float mo67758b(ViewGroup viewGroup, View view, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            float translationX = view.getTranslationX();
            C13392e eVar = i91.f34790d;
            int right = view.getRight();
            if (i == -1) {
                i = right;
            }
            return translationX - ((float) i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i91$c */
    public static final class C13390c extends C13393f {
        C13390c() {
        }

        /* renamed from: b */
        public float mo67758b(ViewGroup viewGroup, View view, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            float translationX = view.getTranslationX();
            C13392e eVar = i91.f34790d;
            int width = viewGroup.getWidth() - view.getLeft();
            if (i == -1) {
                i = width;
            }
            return translationX + ((float) i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i91$d */
    public static final class C13391d extends C13396i {
        C13391d() {
        }

        /* renamed from: a */
        public float mo67757a(ViewGroup viewGroup, View view, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            float translationY = view.getTranslationY();
            C13392e eVar = i91.f34790d;
            int bottom = view.getBottom();
            if (i == -1) {
                i = bottom;
            }
            return translationY - ((float) i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i91$e */
    public static final class C13392e {
        private C13392e() {
        }

        public /* synthetic */ C13392e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i91$f */
    private static abstract class C13393f implements C13394g {
        /* renamed from: a */
        public float mo67757a(ViewGroup viewGroup, View view, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getTranslationY();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i91$g */
    private interface C13394g {
        /* renamed from: a */
        float mo67757a(ViewGroup viewGroup, View view, int i);

        /* renamed from: b */
        float mo67758b(ViewGroup viewGroup, View view, int i);
    }

    /* renamed from: com.yandex.mobile.ads.impl.i91$h */
    private static final class C13395h extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a */
        private final View f34797a;

        /* renamed from: b */
        private final View f34798b;

        /* renamed from: c */
        private final float f34799c;

        /* renamed from: d */
        private final float f34800d;

        /* renamed from: e */
        private final int f34801e;

        /* renamed from: f */
        private final int f34802f;

        /* renamed from: g */
        private int[] f34803g;

        /* renamed from: h */
        private float f34804h;

        /* renamed from: i */
        private float f34805i;

        public C13395h(View view, View view2, int i, int i2, float f, float f2) {
            Intrinsics.checkNotNullParameter(view, "originalView");
            Intrinsics.checkNotNullParameter(view2, "movingView");
            this.f34797a = view;
            this.f34798b = view2;
            this.f34799c = f;
            this.f34800d = f2;
            this.f34801e = i - MathKt.roundToInt(view2.getTranslationX());
            this.f34802f = i2 - MathKt.roundToInt(view2.getTranslationY());
            Object tag = view.getTag(C12066R.C12068id.div_transition_position);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.f34803g = iArr;
            if (iArr != null) {
                view.setTag(C12066R.C12068id.div_transition_position, (Object) null);
            }
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
            if (this.f34803g == null) {
                this.f34803g = new int[]{this.f34801e + MathKt.roundToInt(this.f34798b.getTranslationX()), this.f34802f + MathKt.roundToInt(this.f34798b.getTranslationY())};
            }
            this.f34797a.setTag(C12066R.C12068id.div_transition_position, this.f34803g);
        }

        public void onAnimationPause(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f34804h = this.f34798b.getTranslationX();
            this.f34805i = this.f34798b.getTranslationY();
            this.f34798b.setTranslationX(this.f34799c);
            this.f34798b.setTranslationY(this.f34800d);
        }

        public void onAnimationResume(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f34798b.setTranslationX(this.f34804h);
            this.f34798b.setTranslationY(this.f34805i);
        }

        public void onTransitionCancel(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public void onTransitionEnd(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.f34798b.setTranslationX(this.f34799c);
            this.f34798b.setTranslationY(this.f34800d);
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public void onTransitionResume(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public void onTransitionStart(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i91$i */
    private static abstract class C13396i implements C13394g {
        /* renamed from: b */
        public float mo67758b(ViewGroup viewGroup, View view, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getTranslationX();
        }
    }

    public i91(int i, int i2) {
        C13394g gVar;
        this.f34795b = i;
        if (i2 == 3) {
            gVar = f34791e;
        } else if (i2 == 5) {
            gVar = f34793g;
        } else if (i2 != 48) {
            gVar = f34794h;
        } else {
            gVar = f34792f;
        }
        this.f34796c = gVar;
    }

    /* renamed from: a */
    private final Animator m37317a(View view, Transition transition, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        View view2 = view;
        TransitionValues transitionValues2 = transitionValues;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = transitionValues2.view.getTag(C12066R.C12068id.div_transition_position);
        int[] iArr = tag instanceof int[] ? (int[]) tag : null;
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int roundToInt = i + MathKt.roundToInt(f5 - translationX);
        int roundToInt2 = i2 + MathKt.roundToInt(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3) {
            if (f6 == f4) {
                return null;
            }
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…, startY, endY)\n        )");
        View view3 = transitionValues2.view;
        Intrinsics.checkNotNullExpressionValue(view3, "values.view");
        C13395h hVar = new C13395h(view3, view, roundToInt, roundToInt2, translationX, translationY);
        transition.addListener(hVar);
        ofPropertyValuesHolder.addListener(hVar);
        ofPropertyValuesHolder.addPauseListener(hVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        Map<String, Object> map = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
        map.put("yandex:slide:screenPosition", iArr);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        Map<String, Object> map = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
        map.put("yandex:slide:screenPosition", iArr);
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        TransitionValues transitionValues3 = transitionValues2;
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (transitionValues3 == null) {
            return null;
        }
        Object obj = transitionValues3.values.get("yandex:slide:screenPosition");
        if (obj != null) {
            int[] iArr = (int[]) obj;
            return m37317a(view, this, transitionValues2, iArr[0], iArr[1], this.f34796c.mo67758b(viewGroup, view, this.f34795b), this.f34796c.mo67757a(viewGroup, view, this.f34795b), view.getTranslationX(), view.getTranslationY(), getInterpolator());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        if (transitionValues == null) {
            return null;
        }
        Object obj = transitionValues.values.get("yandex:slide:screenPosition");
        if (obj != null) {
            int[] iArr = (int[]) obj;
            return m37317a(view, this, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f34796c.mo67758b(viewGroup, view, this.f34795b), this.f34796c.mo67757a(viewGroup, view, this.f34795b), getInterpolator());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
    }
}
