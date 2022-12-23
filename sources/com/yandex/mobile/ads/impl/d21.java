package com.yandex.mobile.ads.impl;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;

public class d21 implements C15236y7 {

    /* renamed from: a */
    private ObjectAnimator f32351a;

    public d21(float f, long j) {
    }

    /* renamed from: a */
    public void mo66393a(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.06f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.06f})});
        this.f32351a = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(600);
        this.f32351a.setRepeatCount(-1);
        this.f32351a.setRepeatMode(2);
        this.f32351a.start();
    }

    /* renamed from: a */
    public void mo66392a() {
        ObjectAnimator objectAnimator = this.f32351a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
