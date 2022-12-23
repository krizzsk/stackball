package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import kotlin.jvm.internal.Intrinsics;

public final class up0 {

    /* renamed from: a */
    private final r61<MultiBannerControlsContainer> f40835a = new r61<>();

    /* renamed from: a */
    public final MultiBannerControlsContainer mo70390a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        MultiBannerControlsContainer a = this.f40835a.mo69698a(context, MultiBannerControlsContainer.class, C12066R.layout.yandex_ads_internal_multibanner_controls, (ViewGroup) null);
        if (a != null) {
            a.setLayoutParams(layoutParams);
        }
        return a;
    }
}
