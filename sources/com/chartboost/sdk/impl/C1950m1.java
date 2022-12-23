package com.chartboost.sdk.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.chartboost.sdk.C1885e;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1836a;
import com.chartboost.sdk.Model.C1838c;

/* renamed from: com.chartboost.sdk.impl.m1 */
public class C1950m1 {

    /* renamed from: a */
    private final Handler f5000a;

    /* renamed from: com.chartboost.sdk.impl.m1$a */
    class C1951a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f5001a;

        /* renamed from: b */
        final /* synthetic */ int f5002b;

        /* renamed from: c */
        final /* synthetic */ C1838c f5003c;

        /* renamed from: d */
        final /* synthetic */ Runnable f5004d;

        /* renamed from: e */
        final /* synthetic */ boolean f5005e;

        C1951a(View view, int i, C1838c cVar, Runnable runnable, boolean z) {
            this.f5001a = view;
            this.f5002b = i;
            this.f5003c = cVar;
            this.f5004d = runnable;
            this.f5005e = z;
        }

        public void onGlobalLayout() {
            this.f5001a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            C1950m1.this.mo14702a(this.f5002b, this.f5003c, this.f5004d, this.f5005e);
        }
    }

    public C1950m1(Handler handler) {
        this.f5000a = handler;
    }

    /* renamed from: a */
    public static Integer m4714a(int i) {
        if (i < 1 || i > 9) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public void mo14701a(int i, C1838c cVar, Runnable runnable, C1885e eVar) {
        m4715a(i, cVar, runnable, true, eVar);
    }

    /* renamed from: a */
    public void mo14700a(int i, C1838c cVar, Runnable runnable) {
        mo14702a(i, cVar, runnable, false);
    }

    /* renamed from: a */
    private void m4715a(int i, C1838c cVar, Runnable runnable, boolean z, C1885e eVar) {
        C1979s1 s1Var;
        if (i == 7) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (cVar == null || (s1Var = cVar.f4472y) == null) {
            CBLogging.m3991a("AnimationManager", "Transition of impression canceled due to lack of container");
        } else {
            View c = s1Var.mo14791c();
            if (c == null) {
                eVar.mo14512e(cVar);
                CBLogging.m3991a("AnimationManager", "Transition of impression canceled due to lack of view");
                return;
            }
            ViewTreeObserver viewTreeObserver = c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new C1951a(c, i, cVar, runnable, z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14702a(int i, C1838c cVar, Runnable runnable, boolean z) {
        C1979s1 s1Var;
        C1973q1 q1Var;
        ScaleAnimation scaleAnimation;
        TranslateAnimation translateAnimation;
        C1973q1 q1Var2;
        ScaleAnimation scaleAnimation2;
        TranslateAnimation translateAnimation2;
        AlphaAnimation alphaAnimation;
        int i2 = i;
        C1838c cVar2 = cVar;
        Runnable runnable2 = runnable;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 1.0f));
        if (cVar2 == null || (s1Var = cVar2.f4472y) == null) {
            CBLogging.m3991a("AnimationManager", "Transition of impression canceled due to lack of container");
            if (runnable2 != null) {
                runnable.run();
                return;
            }
            return;
        }
        View c = s1Var.mo14791c();
        if (c == null) {
            if (runnable2 != null) {
                runnable.run();
            }
            CBLogging.m3991a("AnimationManager", "Transition of impression canceled due to lack of view");
            return;
        }
        int i3 = cVar2.f4448a;
        if (i3 == 2 || i3 == 1) {
            c = cVar2.f4472y;
        }
        float width = (float) c.getWidth();
        float height = (float) c.getHeight();
        int i4 = cVar2.f4464q.f4422b;
        switch (i2) {
            case 1:
                if (z) {
                    q1Var = new C1973q1(-60.0f, 0.0f, width / 2.0f, height / 2.0f, true);
                } else {
                    q1Var = new C1973q1(0.0f, 60.0f, width / 2.0f, height / 2.0f, true);
                }
                q1Var.setDuration(500);
                q1Var.setFillAfter(true);
                animationSet.addAnimation(q1Var);
                if (z) {
                    scaleAnimation = new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f);
                } else {
                    scaleAnimation = new ScaleAnimation(1.0f, 0.4f, 1.0f, 0.4f);
                }
                scaleAnimation.setDuration(500);
                scaleAnimation.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                if (z) {
                    translateAnimation = new TranslateAnimation((-width) * 0.4f, 0.0f, height * 0.3f, 0.0f);
                } else {
                    translateAnimation = new TranslateAnimation(0.0f, width, 0.0f, height * 0.3f);
                }
                translateAnimation.setDuration(500);
                translateAnimation.setFillAfter(true);
                animationSet.addAnimation(translateAnimation);
                break;
            case 2:
                if (!z) {
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation3.setDuration(500);
                    scaleAnimation3.setStartOffset(0);
                    scaleAnimation3.setFillAfter(true);
                    animationSet.addAnimation(scaleAnimation3);
                    break;
                } else {
                    ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.6f, 1.1f, 0.6f, 1.1f, 1, 0.5f, 1, 0.5f);
                    float f = (float) 500;
                    float f2 = 0.6f * f;
                    scaleAnimation4.setDuration((long) Math.round(f2));
                    scaleAnimation4.setStartOffset(0);
                    scaleAnimation4.setFillAfter(true);
                    animationSet.addAnimation(scaleAnimation4);
                    ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.81818175f, 1.0f, 0.81818175f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation5.setDuration((long) Math.round(0.19999999f * f));
                    scaleAnimation5.setStartOffset((long) Math.round(f2));
                    scaleAnimation5.setFillAfter(true);
                    animationSet.addAnimation(scaleAnimation5);
                    ScaleAnimation scaleAnimation6 = new ScaleAnimation(1.0f, 1.1111112f, 1.0f, 1.1111112f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation6.setDuration((long) Math.round(0.099999964f * f));
                    scaleAnimation6.setStartOffset((long) Math.round(f * 0.8f));
                    scaleAnimation6.setFillAfter(true);
                    animationSet.addAnimation(scaleAnimation6);
                    break;
                }
            case 3:
                if (z) {
                    q1Var2 = new C1973q1(-60.0f, 0.0f, width / 2.0f, height / 2.0f, false);
                } else {
                    q1Var2 = new C1973q1(0.0f, 60.0f, width / 2.0f, height / 2.0f, false);
                }
                C1973q1 q1Var3 = q1Var2;
                q1Var3.setDuration(500);
                q1Var3.setFillAfter(true);
                animationSet.addAnimation(q1Var3);
                if (z) {
                    scaleAnimation2 = new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f);
                } else {
                    scaleAnimation2 = new ScaleAnimation(1.0f, 0.4f, 1.0f, 0.4f);
                }
                scaleAnimation2.setDuration(500);
                scaleAnimation2.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation2);
                if (z) {
                    translateAnimation2 = new TranslateAnimation(width * 0.3f, 0.0f, (-height) * 0.4f, 0.0f);
                } else {
                    translateAnimation2 = new TranslateAnimation(0.0f, width * 0.3f, 0.0f, height);
                }
                translateAnimation2.setDuration(500);
                translateAnimation2.setFillAfter(true);
                animationSet.addAnimation(translateAnimation2);
                break;
            case 4:
                TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, 0.0f, z ? -height : 0.0f, z ? 0.0f : -height);
                translateAnimation3.setDuration(500);
                translateAnimation3.setFillAfter(true);
                animationSet.addAnimation(translateAnimation3);
                break;
            case 5:
                float f3 = z ? height : 0.0f;
                if (z) {
                    height = 0.0f;
                }
                TranslateAnimation translateAnimation4 = new TranslateAnimation(0.0f, 0.0f, f3, height);
                translateAnimation4.setDuration(500);
                translateAnimation4.setFillAfter(true);
                animationSet.addAnimation(translateAnimation4);
                break;
            case 6:
                if (z) {
                    alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                } else {
                    alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                }
                alphaAnimation.setDuration(500);
                alphaAnimation.setFillAfter(true);
                animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation);
                break;
            case 8:
                float f4 = z ? width : 0.0f;
                if (z) {
                    width = 0.0f;
                }
                TranslateAnimation translateAnimation5 = new TranslateAnimation(f4, width, 0.0f, 0.0f);
                translateAnimation5.setDuration(500);
                translateAnimation5.setFillAfter(true);
                animationSet.addAnimation(translateAnimation5);
                break;
            case 9:
                TranslateAnimation translateAnimation6 = new TranslateAnimation(z ? -width : 0.0f, z ? 0.0f : -width, 0.0f, 0.0f);
                translateAnimation6.setDuration(500);
                translateAnimation6.setFillAfter(true);
                animationSet.addAnimation(translateAnimation6);
                break;
        }
        if (i2 == 7) {
            if (runnable2 != null) {
                runnable.run();
            }
            return;
        }
        if (runnable2 != null) {
            this.f5000a.postDelayed(runnable2, 500);
        }
        c.startAnimation(animationSet);
    }

    /* renamed from: a */
    public void mo14704a(boolean z, View view, C1836a aVar) {
        int i = aVar.f4422b;
        mo14703a(z, view, 500);
    }

    /* renamed from: a */
    public void mo14703a(boolean z, View view, long j) {
        view.clearAnimation();
        if (z) {
            view.setVisibility(0);
        }
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setFillBefore(true);
        view.startAnimation(alphaAnimation);
    }
}
