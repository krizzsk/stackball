package com.chartboost.sdk.Banner;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.chartboost.sdk.C2022j;

/* renamed from: com.chartboost.sdk.Banner.e */
public interface C1817e {
    C2022j.C2024b attachBannerToSDKCommand(C2022j.C2024b bVar);

    DisplayMetrics getDisplayMetrics();

    C2022j.C2024b getSdkCommand();

    ViewGroup.LayoutParams getViewLayoutParams();

    boolean isBelowLollipop();

    void setViewLayoutParams(ViewGroup.LayoutParams layoutParams);
}
