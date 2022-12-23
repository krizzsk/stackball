package com.fyber.inneractive.sdk.p084ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar */
public class IAsmoothProgressBar extends ProgressBar {

    /* renamed from: a */
    private static final Interpolator f9865a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    private ValueAnimator f9866b;

    /* renamed from: c */
    private ValueAnimator f9867c;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public synchronized void setProgress(int i) {
        if (!m9025a()) {
            super.setProgress(i);
            return;
        }
        if (this.f9866b != null) {
            this.f9866b.cancel();
        }
        if (this.f9866b == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f9866b = ofInt;
            ofInt.setInterpolator(f9865a);
            this.f9866b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IAsmoothProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
        } else {
            this.f9866b.setIntValues(new int[]{getProgress(), i});
        }
        this.f9866b.start();
    }

    /* renamed from: a */
    private static boolean m9025a() {
        return Build.VERSION.SDK_INT >= 11;
    }

    public synchronized void setSecondaryProgress(int i) {
        if (!m9025a()) {
            super.setSecondaryProgress(i);
            return;
        }
        if (this.f9867c != null) {
            this.f9867c.cancel();
        }
        if (this.f9867c == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f9867c = ofInt;
            ofInt.setInterpolator(f9865a);
            this.f9867c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IAsmoothProgressBar.super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
        } else {
            this.f9867c.setIntValues(new int[]{getProgress(), i});
        }
        this.f9867c.start();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f9866b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f9867c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
