package com.applovin.impl.adview.p009a.p010a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.AppLovinVideoViewV2;
import com.applovin.impl.adview.C1039a;
import com.applovin.impl.adview.C1101l;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1513b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.a.a.c */
public class C1043c extends C1041a {
    public C1043c(C1355g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, C1469j jVar) {
        super(gVar, appLovinFullscreenActivity, jVar);
    }

    /* renamed from: a */
    public void mo11813a(ImageView imageView, C1101l lVar, C1039a aVar, ProgressBar progressBar, AppLovinVideoViewV2 appLovinVideoViewV2, AppLovinAdView appLovinAdView) {
        appLovinVideoViewV2.setLayoutParams(this.f1830e);
        this.f1829d.addView(appLovinVideoViewV2);
        appLovinAdView.setLayoutParams(this.f1830e);
        this.f1829d.addView(appLovinAdView);
        appLovinAdView.setVisibility(4);
        if (lVar != null) {
            mo11811a(this.f1828c.mo12792af(), (this.f1828c.mo12797ak() ? 3 : 5) | 48, lVar);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f1827b, ((Integer) this.f1826a.mo13088a(C1369c.f3042db)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f1826a.mo13088a(C1369c.f3044dd)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f1827b, ((Integer) this.f1826a.mo13088a(C1369c.f3043dc)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f1829d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f1829d.addView(aVar, this.f1830e);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 20, 80);
            layoutParams2.setMargins(0, 0, 0, ((Integer) this.f1826a.mo13088a(C1369c.f3048dh)).intValue());
            this.f1829d.addView(progressBar, layoutParams2);
        }
        this.f1827b.setContentView(this.f1829d);
    }

    /* renamed from: a */
    public void mo11814a(C1101l lVar, View view) {
        view.setVisibility(0);
        C1513b.m3409a(this.f1829d, view);
        if (lVar != null) {
            mo11811a(this.f1828c.mo12792af(), (this.f1828c.mo12796aj() ? 3 : 5) | 48, lVar);
        }
    }
}
