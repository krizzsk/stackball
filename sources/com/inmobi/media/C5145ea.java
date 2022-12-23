package com.inmobi.media;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.inmobi.media.C5024bo;
import com.inmobi.media.C5154ee;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.inmobi.media.ea */
/* compiled from: AnimationManager */
public class C5145ea {

    /* renamed from: b */
    private static final String f11810b = C5145ea.class.getSimpleName();

    /* renamed from: a */
    public List<C5148a> f11811a = new ArrayList();

    /* renamed from: c */
    private boolean f11812c = false;

    /* renamed from: com.inmobi.media.ea$a */
    /* compiled from: AnimationManager */
    public class C5148a {

        /* renamed from: a */
        public Animator f11819a;

        /* renamed from: b */
        long f11820b;

        /* renamed from: c */
        boolean f11821c;

        C5148a(Animator animator) {
            this.f11819a = animator;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<C5148a> mo40428a(final View view, C5010bf bfVar) {
        LinkedList linkedList = new LinkedList();
        try {
            float c = (float) C5198eq.m11919c(bfVar.f11361c.f11386c.x);
            float c2 = (float) C5198eq.m11919c(bfVar.f11361c.f11387d.x);
            if (c != c2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) ((int) c), (float) ((int) c2)});
                final C5154ee.C5155a aVar = (C5154ee.C5155a) view.getLayoutParams();
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aVar.f11834a = ((Float) valueAnimator.getAnimatedValue()).intValue();
                        view.setLayoutParams(aVar);
                        view.requestLayout();
                    }
                });
                linkedList.add(m11786a((Animator) ofFloat, bfVar));
            }
            float c3 = (float) C5198eq.m11919c(bfVar.f11361c.f11386c.y);
            float c4 = (float) C5198eq.m11919c(bfVar.f11361c.f11387d.y);
            if (c3 != c4) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) ((int) c3), (float) ((int) c4)});
                final C5154ee.C5155a aVar2 = (C5154ee.C5155a) view.getLayoutParams();
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aVar2.f11835b = ((Float) valueAnimator.getAnimatedValue()).intValue();
                        view.setLayoutParams(aVar2);
                        view.requestLayout();
                    }
                });
                linkedList.add(m11786a((Animator) ofFloat2, bfVar));
            }
            float c5 = (float) C5198eq.m11919c(bfVar.f11361c.f11384a.x);
            float c6 = (float) C5198eq.m11919c(bfVar.f11361c.f11385b.x);
            if (c5 != c6) {
                linkedList.add(m11786a(m11785a(view, "scaleX", c5, c6), bfVar));
            }
            float c7 = (float) C5198eq.m11919c(bfVar.f11361c.f11384a.y);
            float c8 = (float) C5198eq.m11919c(bfVar.f11361c.f11385b.y);
            if (c7 != c8) {
                linkedList.add(m11786a(m11785a(view, "scaleY", c7, c8), bfVar));
            }
        } catch (Exception unused) {
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    /* renamed from: a */
    private C5148a m11786a(Animator animator, C5010bf bfVar) {
        m11787b(animator, bfVar);
        return new C5148a(animator);
    }

    /* renamed from: b */
    private static void m11787b(Animator animator, C5010bf bfVar) {
        animator.setDuration(0);
        animator.setStartDelay(0);
        C5024bo g = bfVar.f11361c.mo40172g();
        if (g != null) {
            C5024bo.C5025a aVar = g.f11441a;
            C5024bo.C5025a aVar2 = g.f11442b;
            if (aVar2 != null) {
                animator.setDuration(aVar2.mo40191a() * 1000);
            }
            if (aVar != null) {
                animator.setStartDelay(aVar.mo40191a() * 1000);
            }
        }
    }

    /* renamed from: a */
    private static Animator m11785a(View view, String str, float f, float f2) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        return ObjectAnimator.ofFloat(view, str, new float[]{f2 / f});
    }

    /* renamed from: a */
    public final void mo40429a() {
        if (!this.f11812c) {
            this.f11812c = true;
            mo40430a(this.f11811a);
        }
    }

    /* renamed from: a */
    public final void mo40430a(List<C5148a> list) {
        if (list != null) {
            for (C5148a next : list) {
                if (!next.f11821c) {
                    ValueAnimator valueAnimator = (ValueAnimator) next.f11819a;
                    valueAnimator.setCurrentPlayTime(next.f11820b);
                    valueAnimator.start();
                }
                if (!this.f11811a.contains(next)) {
                    this.f11811a.add(next);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo40431b() {
        if (this.f11812c) {
            this.f11812c = false;
            for (C5148a next : this.f11811a) {
                ValueAnimator valueAnimator = (ValueAnimator) next.f11819a;
                next.f11820b = valueAnimator.getCurrentPlayTime();
                if (((double) valueAnimator.getAnimatedFraction()) == 1.0d) {
                    next.f11821c = true;
                }
                valueAnimator.cancel();
            }
        }
    }
}
