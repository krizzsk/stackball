package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBUtility;

/* renamed from: com.chartboost.sdk.impl.m0 */
public abstract class C1948m0 extends RelativeLayout {

    /* renamed from: a */
    protected C1927i0 f4995a;

    /* renamed from: b */
    private C1954n0 f4996b;

    /* renamed from: c */
    private int f4997c = 1;

    /* renamed from: com.chartboost.sdk.impl.m0$a */
    class C1949a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f4998a;

        C1949a(boolean z) {
            this.f4998a = z;
        }

        public void run() {
            if (!this.f4998a) {
                C1948m0.this.setVisibility(8);
                C1948m0.this.clearAnimation();
            }
            synchronized (C1948m0.this.f4995a.f4719i) {
                C1948m0.this.f4995a.f4719i.remove(C1948m0.this);
            }
        }
    }

    public C1948m0(Context context, C1927i0 i0Var) {
        super(context);
        this.f4995a = i0Var;
        m4708a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo14617a();

    /* renamed from: a */
    public void mo14697a(int i) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        this.f4997c = i;
        setClickable(false);
        int b = mo14619b();
        int i2 = this.f4997c;
        if (i2 == 0) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, CBUtility.m4000a(b, getContext()));
            layoutParams2.addRule(10);
            this.f4996b.mo14714a(1);
        } else if (i2 == 1) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, CBUtility.m4000a(b, getContext()));
            layoutParams2.addRule(12);
            this.f4996b.mo14714a(4);
        } else if (i2 == 2) {
            layoutParams2 = new RelativeLayout.LayoutParams(CBUtility.m4000a(b, getContext()), -1);
            layoutParams2.addRule(9);
            this.f4996b.mo14714a(8);
        } else if (i2 != 3) {
            layoutParams = null;
            setLayoutParams(layoutParams);
        } else {
            layoutParams2 = new RelativeLayout.LayoutParams(CBUtility.m4000a(b, getContext()), -1);
            layoutParams2.addRule(11);
            this.f4996b.mo14714a(2);
        }
        layoutParams = layoutParams2;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo14619b();

    /* renamed from: a */
    private void m4708a(Context context) {
        Context context2 = getContext();
        setGravity(17);
        C1954n0 n0Var = new C1954n0(context2);
        this.f4996b = n0Var;
        n0Var.mo14715b(-1);
        this.f4996b.setBackgroundColor(-855638017);
        addView(this.f4996b, new RelativeLayout.LayoutParams(-1, -1));
        addView(mo14617a(), new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo14698a(boolean z) {
        m4709a(z, 500);
    }

    /* renamed from: a */
    private void m4709a(boolean z, long j) {
        this.f4995a.f4896I = z;
        if (z && getVisibility() == 0) {
            return;
        }
        if (z || getVisibility() != 8) {
            C1949a aVar = new C1949a(z);
            if (z) {
                setVisibility(0);
            }
            float a = CBUtility.m3998a((float) mo14619b(), getContext());
            TranslateAnimation translateAnimation = null;
            int i = this.f4997c;
            if (i == 0) {
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, z ? -a : 0.0f, z ? 0.0f : -a);
            } else if (i == 1) {
                float f = z ? a : 0.0f;
                if (z) {
                    a = 0.0f;
                }
                translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, a);
            } else if (i == 2) {
                translateAnimation = new TranslateAnimation(z ? -a : 0.0f, z ? 0.0f : -a, 0.0f, 0.0f);
            } else if (i == 3) {
                float f2 = z ? a : 0.0f;
                if (z) {
                    a = 0.0f;
                }
                translateAnimation = new TranslateAnimation(f2, a, 0.0f, 0.0f);
            }
            translateAnimation.setDuration(j);
            translateAnimation.setFillAfter(!z);
            startAnimation(translateAnimation);
            synchronized (this.f4995a.f4719i) {
                this.f4995a.f4719i.put(this, aVar);
            }
            this.f4995a.f4711a.postDelayed(aVar, j);
        }
    }
}
