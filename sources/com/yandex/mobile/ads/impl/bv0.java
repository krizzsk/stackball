package com.yandex.mobile.ads.impl;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;

public class bv0 {

    /* renamed from: a */
    private final View f31596a;

    /* renamed from: b */
    private boolean f31597b;

    /* renamed from: c */
    private final float f31598c;

    /* renamed from: d */
    private float f31599d;

    /* renamed from: e */
    private float f31600e;

    public bv0(View view) {
        this(view, (float) m34407a(view));
    }

    /* renamed from: a */
    public void mo66127a() {
        this.f31597b = false;
    }

    bv0(View view, float f) {
        this.f31596a = view;
        ViewCompat.setNestedScrollingEnabled(view, true);
        this.f31598c = f;
    }

    /* renamed from: a */
    public void mo66129a(boolean z) {
        if (this.f31597b && z) {
            ViewCompat.dispatchNestedScroll(this.f31596a, 0, 0, 1, 0, (int[]) null);
        }
    }

    /* renamed from: a */
    public void mo66128a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float abs = Math.abs(motionEvent.getX() - this.f31599d);
                    float abs2 = Math.abs(motionEvent.getY() - this.f31600e);
                    if (!this.f31597b && abs >= this.f31598c && abs > abs2) {
                        this.f31597b = true;
                        ViewCompat.startNestedScroll(this.f31596a, 1);
                        return;
                    }
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            this.f31597b = false;
            ViewCompat.stopNestedScroll(this.f31596a);
            return;
        }
        this.f31599d = motionEvent.getX();
        this.f31600e = motionEvent.getY();
    }

    public bv0(ViewPager viewPager) {
        this(viewPager, (float) m34407a((View) viewPager));
    }

    /* renamed from: a */
    private static int m34407a(View view) {
        return ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }
}
