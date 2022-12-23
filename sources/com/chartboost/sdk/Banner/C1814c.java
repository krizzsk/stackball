package com.chartboost.sdk.Banner;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.chartboost.sdk.C1865R;
import com.chartboost.sdk.C1881b;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.ChartboostBannerListener;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostCacheEvent;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostClickEvent;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Events.ChartboostShowEvent;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.Tracking.C1875f;
import com.chartboost.sdk.impl.C1901c;
import com.chartboost.sdk.impl.C1971q;
import com.chartboost.sdk.impl.C1974r;
import com.chartboost.sdk.impl.C1980t;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.chartboost.sdk.Banner.c */
public class C1814c implements C1901c, C1974r, C1980t {

    /* renamed from: a */
    public String f4344a;

    /* renamed from: b */
    public BannerSize f4345b;

    /* renamed from: c */
    private ChartboostBannerListener f4346c;

    /* renamed from: d */
    private C1817e f4347d;

    /* renamed from: e */
    private C1816d f4348e;

    /* renamed from: f */
    private C1881b f4349f;

    /* renamed from: g */
    private C1971q f4350g;

    /* renamed from: com.chartboost.sdk.Banner.c$a */
    public static class C1815a {

        /* renamed from: a */
        public String f4351a;

        /* renamed from: b */
        public BannerSize f4352b;
    }

    /* renamed from: b */
    private void m3953b(String str) {
        if (str != null) {
            this.f4349f.mo14479a(mo14158e(), str, "");
        } else {
            this.f4349f.mo14478a(mo14158e(), "");
        }
    }

    /* renamed from: g */
    private void m3959g() {
        m3962l();
        if (this.f4348e.mo14167a(this.f4347d, this.f4345b)) {
            this.f4349f.mo14483c(mo14158e(), "");
            return;
        }
        CBLogging.m3993b("BannerPresenter", "Banner size was not set successfully. Detach and re-create the banner");
        ChartboostShowError chartboostShowError = new ChartboostShowError(ChartboostShowError.Code.BANNER_VIEW_IS_DETACHED, false);
        m3952b(chartboostShowError);
        ChartboostBannerListener chartboostBannerListener = this.f4346c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), chartboostShowError);
        }
    }

    /* renamed from: j */
    private void m3960j() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Register refresh for location: " + mo14158e() + " at intervals of " + this.f4350g.mo14772f() + " sec");
            this.f4350g.mo14767a((C1974r) this);
            this.f4350g.mo14776j();
        }
    }

    /* renamed from: k */
    private void m3961k() {
        if (this.f4349f == null) {
            C1881b c = C2022j.m4957c();
            this.f4349f = c;
            if (c != null) {
                m3964p();
                this.f4350g.mo14767a((C1974r) this);
                this.f4350g.mo14768a((C1980t) this);
            }
        }
    }

    /* renamed from: l */
    private void m3962l() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Register timeout for location: " + mo14158e() + " at intervals of " + this.f4350g.mo14773g() + " sec");
            this.f4350g.mo14768a((C1980t) this);
            this.f4350g.mo14777k();
        }
    }

    /* renamed from: o */
    private boolean m3963o() {
        C2022j b = C2022j.m4955b();
        return b == null || !b.mo14907m();
    }

    /* renamed from: p */
    private void m3964p() {
        C2022j b = C2022j.m4955b();
        C1817e eVar = this.f4347d;
        if (eVar == null || b == null) {
            CBLogging.m3993b("BannerPresenter", "Please start with Chartboost SDK before creating any ChartboostBanner objects");
            return;
        }
        C2022j.C2024b sdkCommand = eVar.getSdkCommand();
        if (sdkCommand != null) {
            C2022j.m4961e(this.f4347d.attachBannerToSDKCommand(sdkCommand));
        }
    }

    /* renamed from: r */
    private void m3965r() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Unregister refresh for location: " + mo14158e());
            this.f4350g.mo14780n();
        }
    }

    /* renamed from: s */
    private void m3966s() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Un-register timeout for location: " + mo14158e());
            this.f4350g.mo14781o();
        }
    }

    /* renamed from: a */
    public C1815a mo14144a(Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1865R.styleable.ChartboostBanner, 0, 0);
        String string = obtainStyledAttributes.getString(C1865R.styleable.ChartboostBanner_location);
        BannerSize fromInteger = BannerSize.fromInteger(obtainStyledAttributes.getInt(C1865R.styleable.ChartboostBanner_size, 0));
        obtainStyledAttributes.recycle();
        C1815a aVar = new C1815a();
        aVar.f4351a = string;
        aVar.f4352b = fromInteger;
        return aVar;
    }

    /* renamed from: c */
    public String mo14152c(String str) {
        this.f4344a = str;
        return str;
    }

    /* renamed from: d */
    public void mo14154d() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Unregister refresh and timeout for location: " + mo14158e());
            this.f4350g.mo14781o();
            this.f4350g.mo14780n();
            this.f4350g.mo14766a();
            this.f4350g = null;
        }
        this.f4347d = null;
        this.f4344a = null;
        this.f4346c = null;
        this.f4348e = null;
        this.f4349f = null;
    }

    public void didCacheBanner(String str, String str2, ChartboostCacheError chartboostCacheError) {
        m3954c(chartboostCacheError);
        ChartboostBannerListener chartboostBannerListener = this.f4346c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdCached(new ChartboostCacheEvent(str2), chartboostCacheError);
        }
    }

    public void didClickBanner(String str, String str2, ChartboostClickError chartboostClickError) {
        C1971q qVar = this.f4350g;
        if (qVar != null && qVar.mo14771d()) {
            mo14166q();
        }
        ChartboostBannerListener chartboostBannerListener = this.f4346c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdClicked(new ChartboostClickEvent(str2), chartboostClickError);
        }
    }

    public void didShowBanner(String str, String str2, ChartboostShowError chartboostShowError) {
        m3957d(chartboostShowError);
        m3955c(chartboostShowError);
        m3966s();
        ChartboostShowEvent chartboostShowEvent = new ChartboostShowEvent(str2);
        chartboostShowEvent.location = str;
        ChartboostBannerListener chartboostBannerListener = this.f4346c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdShown(chartboostShowEvent, chartboostShowError);
            C1971q qVar = this.f4350g;
            if (qVar != null && qVar.mo14771d()) {
                mo14153c();
                m3960j();
            }
        }
    }

    /* renamed from: e */
    public String mo14158e() {
        return this.f4344a;
    }

    /* renamed from: f */
    public Boolean mo14159f() {
        C1881b bVar = this.f4349f;
        if (bVar != null) {
            return Boolean.valueOf(bVar.mo14482b(mo14158e()));
        }
        ChartboostBannerListener chartboostBannerListener = this.f4346c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.INTERNAL));
        }
        return Boolean.FALSE;
    }

    /* renamed from: h */
    public void mo14160h() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Pause refresh for location: " + mo14158e());
            this.f4350g.mo14774h();
        }
    }

    /* renamed from: i */
    public void mo14161i() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Pause timeout for location: " + mo14158e());
            this.f4350g.mo14775i();
        }
    }

    /* renamed from: m */
    public void mo14162m() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Restart refresh if was paused for location: " + mo14158e());
            this.f4350g.mo14778l();
        }
    }

    /* renamed from: n */
    public void mo14163n() {
        if (this.f4350g != null) {
            CBLogging.m3991a("BannerPresenter", "Resume timeout if was paused for location: " + mo14158e());
            this.f4350g.mo14779m();
        }
    }

    public void onBannerCacheFail(String str, String str2, ChartboostCacheError chartboostCacheError) {
        m3960j();
        didCacheBanner(str, str2, chartboostCacheError);
    }

    public void onBannerShowFail(String str, String str2, ChartboostShowError chartboostShowError) {
        m3960j();
        didShowBanner(str, str2, chartboostShowError);
        if (chartboostShowError != null && chartboostShowError.shouldRetry) {
            mo14166q();
        }
    }

    /* renamed from: q */
    public void mo14166q() {
        if (m3963o()) {
            CBLogging.m3993b("BannerPresenter", "Chartboost SDK is not initialised");
            ChartboostBannerListener chartboostBannerListener = this.f4346c;
            if (chartboostBannerListener != null) {
                chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.SESSION_NOT_STARTED, false));
                return;
            }
            return;
        }
        C1817e eVar = this.f4347d;
        if (eVar == null) {
            CBLogging.m3993b("BannerPresenter", "Banner View is not attached, re-create banner.");
            ChartboostBannerListener chartboostBannerListener2 = this.f4346c;
            if (chartboostBannerListener2 != null) {
                chartboostBannerListener2.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.BANNER_VIEW_IS_DETACHED, false));
            }
        } else if (eVar.isBelowLollipop()) {
            CBLogging.m3993b("BannerPresenter", "Banner is not supported for this Android version");
            ChartboostBannerListener chartboostBannerListener3 = this.f4346c;
            if (chartboostBannerListener3 != null) {
                chartboostBannerListener3.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.NO_CACHED_AD, false));
            }
        } else {
            m3961k();
            if (m3956c(2)) {
                m3966s();
                m3965r();
                m3959g();
            }
        }
    }

    /* renamed from: c */
    public void mo14153c() {
        m3958d((String) null);
    }

    /* renamed from: c */
    private boolean m3956c(int i) {
        C1881b bVar = this.f4349f;
        if (bVar == null) {
            m3950b(i);
            return false;
        } else if (bVar.mo14481b()) {
            return true;
        } else {
            m3949a(i);
            return false;
        }
    }

    /* renamed from: b */
    private void m3950b(int i) {
        ChartboostBannerListener chartboostBannerListener = this.f4346c;
        if (chartboostBannerListener == null) {
            return;
        }
        if (i == 1) {
            chartboostBannerListener.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.INTERNAL));
        } else if (i == 2) {
            chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.INTERNAL, false));
        }
    }

    /* renamed from: a */
    public void mo14146a(C1817e eVar, String str, BannerSize bannerSize, ChartboostBannerListener chartboostBannerListener, C1971q qVar) {
        this.f4347d = eVar;
        this.f4344a = str;
        this.f4345b = bannerSize;
        this.f4346c = chartboostBannerListener;
        this.f4350g = qVar;
        this.f4348e = new C1816d();
    }

    /* renamed from: b */
    public void mo14151b() {
        CBLogging.m3991a("BannerPresenter", "Notify timeout finished for location: " + mo14158e());
        m3966s();
        m3960j();
        ChartboostBannerListener chartboostBannerListener = this.f4346c;
        if (chartboostBannerListener != null) {
            chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.INTERNAL, false));
            C2022j b = C2022j.m4955b();
            if (b != null) {
                b.mo14908o();
            }
        }
    }

    /* renamed from: c */
    private void m3955c(ChartboostShowError chartboostShowError) {
        if (chartboostShowError != null) {
            m3952b(chartboostShowError);
        } else {
            C1874e.m4311e(new C1875f("show_finish_success", "", IronSourceConstants.BANNER_AD_UNIT, this.f4344a));
        }
    }

    /* renamed from: d */
    private void m3958d(String str) {
        if (m3963o()) {
            CBLogging.m3993b("BannerPresenter", "Chartboost SDK is not initialised");
            ChartboostBannerListener chartboostBannerListener = this.f4346c;
            if (chartboostBannerListener != null) {
                chartboostBannerListener.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.SESSION_NOT_STARTED));
                return;
            }
            return;
        }
        C1817e eVar = this.f4347d;
        if (eVar == null) {
            CBLogging.m3993b("BannerPresenter", "Banner View is not attached, re-create banner.");
            ChartboostBannerListener chartboostBannerListener2 = this.f4346c;
            if (chartboostBannerListener2 != null) {
                chartboostBannerListener2.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.BANNER_VIEW_IS_DETACHED));
            }
        } else if (eVar.isBelowLollipop()) {
            CBLogging.m3993b("BannerPresenter", "Banner is not supported for this Android version");
            ChartboostBannerListener chartboostBannerListener3 = this.f4346c;
            if (chartboostBannerListener3 != null) {
                chartboostBannerListener3.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.NO_AD_FOUND));
            }
        } else {
            m3961k();
            if (m3956c(1)) {
                m3953b(str);
            } else {
                CBLogging.m3991a("BannerPresenter", "Banner is currently processing action cache");
            }
        }
    }

    /* renamed from: c */
    private void m3954c(ChartboostCacheError chartboostCacheError) {
        if (chartboostCacheError != null) {
            m3951b(chartboostCacheError);
        } else {
            C1874e.m4311e(new C1875f("cache_finish_success", "", IronSourceConstants.BANNER_AD_UNIT, this.f4344a));
        }
    }

    /* renamed from: a */
    public void mo14147a(ChartboostBannerListener chartboostBannerListener) {
        this.f4346c = chartboostBannerListener;
    }

    /* renamed from: a */
    public void mo14150a(boolean z) {
        C1971q qVar = this.f4350g;
        if (qVar != null) {
            qVar.mo14769a(z);
        }
    }

    /* renamed from: b */
    private void m3952b(ChartboostShowError chartboostShowError) {
        String a = m3948a(chartboostShowError);
        C1874e.m4311e(new C1875f("show_finish_failure", a, IronSourceConstants.BANNER_AD_UNIT, this.f4344a));
        CBLogging.m3991a("BannerPresenter", "onBannerShowFail: " + a);
    }

    /* renamed from: a */
    public void mo14148a(String str) {
        m3958d(str);
    }

    /* renamed from: a */
    private void m3949a(int i) {
        ChartboostBannerListener chartboostBannerListener = this.f4346c;
        if (chartboostBannerListener == null) {
            return;
        }
        if (i == 1) {
            chartboostBannerListener.onAdCached(new ChartboostCacheEvent(""), new ChartboostCacheError(ChartboostCacheError.Code.BANNER_DISABLED));
        } else if (i == 2) {
            chartboostBannerListener.onAdShown(new ChartboostShowEvent(""), new ChartboostShowError(ChartboostShowError.Code.BANNER_DISABLED, false));
        }
    }

    /* renamed from: b */
    private void m3951b(ChartboostCacheError chartboostCacheError) {
        String a = m3947a(chartboostCacheError);
        C1874e.m4311e(new C1875f("cache_finish_failure", a, IronSourceConstants.BANNER_AD_UNIT, this.f4344a));
        CBLogging.m3991a("BannerPresenter", "onBannerCacheFail: " + a);
    }

    /* renamed from: a */
    public void mo14149a(String str, String str2, ChartboostClickError chartboostClickError) {
        CBLogging.m3991a("BannerPresenter", "onBannerClickFail: " + chartboostClickError.code.name());
        m3960j();
        didClickBanner(str, str2, chartboostClickError);
    }

    /* renamed from: a */
    public void mo14145a() {
        CBLogging.m3991a("BannerPresenter", "Notify refresh finished for location: " + mo14158e());
        mo14166q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.code;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m3948a(com.chartboost.sdk.Events.ChartboostShowError r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x000b
            com.chartboost.sdk.Events.ChartboostShowError$Code r1 = r1.code
            if (r1 == 0) goto L_0x000b
            java.lang.String r1 = r1.name()
            goto L_0x000d
        L_0x000b:
            java.lang.String r1 = ""
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.Banner.C1814c.m3948a(com.chartboost.sdk.Events.ChartboostShowError):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.code;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m3947a(com.chartboost.sdk.Events.ChartboostCacheError r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x000b
            com.chartboost.sdk.Events.ChartboostCacheError$Code r1 = r1.code
            if (r1 == 0) goto L_0x000b
            java.lang.String r1 = r1.name()
            goto L_0x000d
        L_0x000b:
            java.lang.String r1 = ""
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.Banner.C1814c.m3947a(com.chartboost.sdk.Events.ChartboostCacheError):java.lang.String");
    }

    /* renamed from: d */
    private void m3957d(ChartboostShowError chartboostShowError) {
        C2022j b = C2022j.m4955b();
        if (b != null && chartboostShowError == null) {
            b.mo14894a(3);
        }
    }
}
