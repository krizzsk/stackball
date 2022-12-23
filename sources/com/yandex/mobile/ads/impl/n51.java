package com.yandex.mobile.ads.impl;

import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;

public final class n51 implements Interpolator {

    /* renamed from: a */
    private final Interpolator f37645a;

    public n51(Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, TtmlNode.RUBY_BASE);
        this.f37645a = interpolator;
    }

    public float getInterpolation(float f) {
        return 1.0f - this.f37645a.getInterpolation(1.0f - f);
    }
}
