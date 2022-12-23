package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class xx0 {

    /* renamed from: a */
    private final c71 f42709a;

    public xx0(c71 c71) {
        Intrinsics.checkNotNullParameter(c71, "scrollableViewPager");
        this.f42709a = c71;
    }

    /* renamed from: a */
    public final void mo70947a(int i) {
        this.f42709a.setCurrentItem(i, true);
    }

    /* renamed from: a */
    public final int mo70946a() {
        return this.f42709a.getCurrentItem();
    }
}
