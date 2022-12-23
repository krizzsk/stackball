package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

public final class qg1 extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    private final String f39112a;

    /* renamed from: b */
    private final g10 f39113b;

    public qg1(String str, g10 g10) {
        Intrinsics.checkNotNullParameter(str, "mBlockId");
        Intrinsics.checkNotNullParameter(g10, "mDivViewState");
        this.f39112a = str;
        this.f39113b = g10;
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        this.f39113b.mo67146a(this.f39112a, new by0(i));
    }
}
