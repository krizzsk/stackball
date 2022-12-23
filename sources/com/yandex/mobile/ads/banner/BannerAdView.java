package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.C15230y2;

public final class BannerAdView extends C12080g {
    public BannerAdView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12072b mo64345a(Context context, C12077d dVar, C15230y2 y2Var) {
        return new C12072b(context, this, dVar, y2Var);
    }

    public void destroy() {
        super.destroy();
    }

    public VideoController getVideoController() {
        return super.getVideoController();
    }

    public void loadAd(AdRequest adRequest) {
        super.loadAd(adRequest);
    }

    public void setAdSize(AdSize adSize) {
        super.setAdSize(adSize);
    }

    public void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    public void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        super.setBannerAdEventListener(bannerAdEventListener);
    }

    /* access modifiers changed from: package-private */
    public void setShouldOpenLinksInApp(boolean z) {
        super.setShouldOpenLinksInApp(z);
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
