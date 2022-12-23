package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class cq0 {

    /* renamed from: a */
    private final WeakReference<ViewPager2> f32018a;

    public cq0(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        this.f32018a = new WeakReference<>(viewPager2);
    }

    /* renamed from: a */
    public final void mo66344a() {
        ViewPager2 viewPager2 = (ViewPager2) this.f32018a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: b */
    public final void mo66345b() {
        ViewPager2 viewPager2 = (ViewPager2) this.f32018a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
        }
    }
}
