package com.chartboost.sdk.Banner;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;

/* renamed from: com.chartboost.sdk.Banner.d */
class C1816d {
    C1816d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14167a(C1817e eVar, BannerSize bannerSize) {
        return m3986a(eVar, BannerSize.getWidth(bannerSize), BannerSize.getHeight(bannerSize));
    }

    /* renamed from: a */
    private boolean m3986a(C1817e eVar, int i, int i2) {
        if (eVar != null && i > 0 && i2 > 0) {
            DisplayMetrics displayMetrics = eVar.getDisplayMetrics();
            ViewGroup.LayoutParams viewLayoutParams = eVar.getViewLayoutParams();
            if (!(displayMetrics == null || viewLayoutParams == null)) {
                viewLayoutParams.width = (int) m3985a(i, displayMetrics);
                viewLayoutParams.height = (int) m3985a(i2, displayMetrics);
                eVar.setViewLayoutParams(viewLayoutParams);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private float m3985a(int i, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, (float) i, displayMetrics);
    }
}
