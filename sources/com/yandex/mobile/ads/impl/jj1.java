package com.yandex.mobile.ads.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.tapjoy.TJAdUnitConstants;
import kotlin.jvm.internal.Intrinsics;

public final class jj1 extends Visibility {

    /* renamed from: b */
    private final float f35333b;

    /* renamed from: c */
    private final float f35334c;

    /* renamed from: com.yandex.mobile.ads.impl.jj1$a */
    private static final class C13505a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f35335a;

        public C13505a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f35335a = view;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
            this.f35335a.setTranslationY(0.0f);
            ViewCompat.setClipBounds(this.f35335a, (Rect) null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jj1$b */
    public static final class C13506b extends Property<View, Float> {

        /* renamed from: a */
        private final Rect f35336a;

        /* renamed from: b */
        private float f35337b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13506b(View view) {
            super(Float.TYPE, "ClipBoundsTop");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f35336a = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        /* renamed from: a */
        public void mo68012a(View view, float f) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f35337b = f;
            if (f < 0.0f) {
                this.f35336a.set(0, (int) ((-f) * ((float) (view.getHeight() - 1))), view.getWidth(), view.getHeight());
            } else if (f > 0.0f) {
                float f2 = (float) 1;
                this.f35336a.set(0, 0, view.getWidth(), (int) (((f2 - this.f35337b) * ((float) view.getHeight())) + f2));
            } else {
                this.f35336a.set(0, 0, view.getWidth(), view.getHeight());
            }
            ViewCompat.setClipBounds(view, this.f35336a);
        }

        public Object get(Object obj) {
            Intrinsics.checkNotNullParameter((View) obj, "view");
            return Float.valueOf(this.f35337b);
        }

        public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
            mo68012a((View) obj, ((Number) obj2).floatValue());
        }
    }

    public jj1(float f, float f2) {
        this.f35333b = f;
        this.f35334c = f2;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        float height = (float) view.getHeight();
        float f = this.f35333b * height;
        float f2 = this.f35334c * height;
        view.setTranslationY(f);
        C13506b bVar = new C13506b(view);
        bVar.mo68012a(view, this.f35333b);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2}), PropertyValuesHolder.ofFloat(bVar, new float[]{this.f35333b, this.f35334c})});
        ofPropertyValuesHolder.addListener(new C13505a(view));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…Listener(view))\n        }");
        return ofPropertyValuesHolder;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(viewGroup, "sceneRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        float f = this.f35334c;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, this.f35333b * ((float) view.getHeight())}), PropertyValuesHolder.ofFloat(new C13506b(view), new float[]{this.f35334c, this.f35333b})});
        ofPropertyValuesHolder.addListener(new C13505a(view));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…Listener(view))\n        }");
        return ofPropertyValuesHolder;
    }
}
