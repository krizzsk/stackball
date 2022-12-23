package com.chartboost.sdk;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Banner.BannerSize;
import com.chartboost.sdk.Banner.C1814c;
import com.chartboost.sdk.Banner.C1817e;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.C1901c;
import com.chartboost.sdk.impl.C1971q;

public class ChartboostBanner extends RelativeLayout implements C1817e, C1901c {

    /* renamed from: b */
    private static final String f4366b = ChartboostBanner.class.getSimpleName();

    /* renamed from: a */
    private final C1814c f4367a;

    public ChartboostBanner(Context context) {
        super(context);
        C1814c cVar = new C1814c();
        this.f4367a = cVar;
        cVar.mo14146a(this, "", BannerSize.STANDARD, (ChartboostBannerListener) null, new C1971q());
    }

    public C2022j.C2024b attachBannerToSDKCommand(C2022j.C2024b bVar) {
        bVar.f5242e = this;
        return bVar;
    }

    public void cache() {
        this.f4367a.mo14153c();
    }

    public void detachBanner() {
        this.f4367a.mo14154d();
    }

    public void didCacheBanner(String str, String str2, ChartboostCacheError chartboostCacheError) {
        this.f4367a.didCacheBanner(str, str2, chartboostCacheError);
    }

    public void didClickBanner(String str, String str2, ChartboostClickError chartboostClickError) {
        this.f4367a.didClickBanner(str, str2, chartboostClickError);
    }

    public void didShowBanner(String str, String str2, ChartboostShowError chartboostShowError) {
        this.f4367a.didShowBanner(str, str2, chartboostShowError);
    }

    public int getBannerHeight() {
        return BannerSize.getHeight(this.f4367a.f4345b);
    }

    public int getBannerWidth() {
        return BannerSize.getWidth(this.f4367a.f4345b);
    }

    public DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    public String getLocation() {
        return this.f4367a.mo14158e();
    }

    public C2022j.C2024b getSdkCommand() {
        C2022j b = C2022j.m4955b();
        if (b == null) {
            return null;
        }
        b.getClass();
        return new C2022j.C2024b(6);
    }

    public ViewGroup.LayoutParams getViewLayoutParams() {
        return getLayoutParams();
    }

    public boolean isBelowLollipop() {
        return Build.VERSION.SDK_INT < 21;
    }

    public Boolean isCached() {
        return this.f4367a.mo14159f();
    }

    public void onBannerCacheFail(String str, String str2, ChartboostCacheError chartboostCacheError) {
        this.f4367a.onBannerCacheFail(str, str2, chartboostCacheError);
    }

    public void onBannerClickFail(String str, String str2, ChartboostClickError chartboostClickError) {
        this.f4367a.mo14149a(str, str2, chartboostClickError);
    }

    public void onBannerShowFail(String str, String str2, ChartboostShowError chartboostShowError) {
        this.f4367a.onBannerShowFail(str, str2, chartboostShowError);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f4367a.mo14162m();
            this.f4367a.mo14163n();
            return;
        }
        this.f4367a.mo14160h();
        this.f4367a.mo14161i();
    }

    public void setAutomaticallyRefreshesContent(boolean z) {
        this.f4367a.mo14150a(z);
    }

    public void setListener(ChartboostBannerListener chartboostBannerListener) {
        this.f4367a.mo14147a(chartboostBannerListener);
    }

    public String setLocation(String str) {
        return this.f4367a.mo14152c(str);
    }

    public void setViewLayoutParams(ViewGroup.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public void show() {
        this.f4367a.mo14166q();
    }

    public void cache(String str) {
        this.f4367a.mo14148a(str);
    }

    public ChartboostBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        BannerSize bannerSize;
        C1814c cVar = new C1814c();
        this.f4367a = cVar;
        C1814c.C1815a a = cVar.mo14144a(context.getTheme(), attributeSet);
        if (a == null || (str = a.f4351a) == null || (bannerSize = a.f4352b) == null) {
            CBLogging.m3993b(f4366b, "Error creating ChartboostBanner, make sure the attributes declared in the XML are correct");
            return;
        }
        this.f4367a.mo14146a(this, str, bannerSize, (ChartboostBannerListener) null, new C1971q());
    }

    public ChartboostBanner(Context context, String str, BannerSize bannerSize, ChartboostBannerListener chartboostBannerListener) {
        super(context);
        C1814c cVar = new C1814c();
        this.f4367a = cVar;
        cVar.mo14146a(this, str, bannerSize, chartboostBannerListener, new C1971q());
    }

    public ChartboostBanner(Context context, C1817e eVar, String str, BannerSize bannerSize, ChartboostBannerListener chartboostBannerListener) {
        super(context);
        C1814c cVar = new C1814c();
        this.f4367a = cVar;
        cVar.mo14146a(eVar, str, bannerSize, chartboostBannerListener, new C1971q());
    }
}
