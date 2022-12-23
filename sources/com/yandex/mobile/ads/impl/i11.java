package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

public class i11 extends Animation {

    /* renamed from: b */
    private final ProgressBar f34726b;

    /* renamed from: c */
    private final int f34727c;

    /* renamed from: d */
    private final int f34728d;

    public i11(ProgressBar progressBar, int i, int i2) {
        setInterpolator(new LinearInterpolator());
        this.f34726b = progressBar;
        this.f34727c = i;
        this.f34728d = i2;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        int i = this.f34727c;
        this.f34726b.setProgress(Math.round(((float) i) + (((float) (this.f34728d - i)) * f)));
    }
}
