package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

public final class vx0 extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    private final vp0 f41673a;

    /* renamed from: b */
    private final sp0 f41674b;

    /* renamed from: c */
    private boolean f41675c;

    public vx0(vp0 vp0, sp0 sp0) {
        Intrinsics.checkNotNullParameter(vp0, "multiBannerEventTracker");
        this.f41673a = vp0;
        this.f41674b = sp0;
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f41675c = false;
        } else if (i == 1) {
            sp0 sp0 = this.f41674b;
            if (sp0 != null) {
                sp0.mo70041a();
            }
            this.f41675c = true;
        }
    }

    public void onPageSelected(int i) {
        if (this.f41675c) {
            this.f41673a.mo70512c();
            this.f41675c = false;
        }
    }
}
