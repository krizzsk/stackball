package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.tapjoy.TJAdUnitConstants;

public class jd1<T extends TextView> implements C15236y7<T> {

    /* renamed from: a */
    private final ArgbEvaluator f35249a = new ArgbEvaluator();

    /* renamed from: b */
    private ValueAnimator f35250b;

    /* renamed from: c */
    private final int f35251c;

    /* renamed from: com.yandex.mobile.ads.impl.jd1$a */
    private static class C13491a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private final TextView f35252a;

        C13491a(TextView textView) {
            this.f35252a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.f35252a.setTextColor(((Integer) animatedValue).intValue());
            }
        }
    }

    public jd1(int i, int i2) {
        this.f35251c = i2;
    }

    /* renamed from: a */
    public void mo66393a(View view) {
        TextView textView = (TextView) view;
        int currentTextColor = textView.getCurrentTextColor();
        ValueAnimator ofObject = ValueAnimator.ofObject(this.f35249a, new Object[]{Integer.valueOf(currentTextColor), Integer.valueOf(this.f35251c)});
        this.f35250b = ofObject;
        ofObject.addUpdateListener(new C13491a(textView));
        this.f35250b.setDuration((long) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL);
        this.f35250b.start();
    }

    /* renamed from: a */
    public void mo66392a() {
        ValueAnimator valueAnimator = this.f35250b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f35250b.cancel();
        }
    }
}
