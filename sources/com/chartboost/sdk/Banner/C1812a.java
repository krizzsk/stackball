package com.chartboost.sdk.Banner;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.chartboost.sdk.C1882c;
import com.chartboost.sdk.C1883d;
import com.chartboost.sdk.C1885e;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.ChartboostBanner;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.C1832j;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.Networking.C1856h;
import com.chartboost.sdk.Networking.C1857i;
import com.chartboost.sdk.Networking.C1860j;
import com.chartboost.sdk.Tracking.C1876g;
import com.chartboost.sdk.impl.C1894a;
import com.chartboost.sdk.impl.C1904d;
import com.chartboost.sdk.impl.C1913g;
import com.chartboost.sdk.impl.C1952n;
import com.chartboost.sdk.impl.C2014x;
import com.chartboost.sdk.impl.C2020z;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.chartboost.sdk.Banner.a */
public class C1812a extends C1913g implements C1813b {

    /* renamed from: E */
    private C1904d f4342E;

    /* renamed from: F */
    private Handler f4343F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1812a(Context context, C1904d dVar, ScheduledExecutorService scheduledExecutorService, C1952n nVar, C1828g gVar, C1855g gVar2, C1856h hVar, C1842g gVar3, AtomicReference<C1844h> atomicReference, SharedPreferences sharedPreferences, C1832j jVar, Handler handler, C1883d dVar2, C1857i iVar, C1885e eVar, C1860j jVar2, C1876g gVar4) {
        super(context, dVar, scheduledExecutorService, nVar, gVar, gVar2, hVar, gVar3, atomicReference, sharedPreferences, jVar, handler, dVar2, iVar, eVar, jVar2, gVar4);
        this.f4342E = dVar;
        this.f4343F = handler;
    }

    /* renamed from: i */
    private boolean m3931i(String str) {
        if (!C2014x.m4911b().mo14884a((CharSequence) str)) {
            return true;
        }
        CBLogging.m3993b("AdUnitBannerManager", "Location cannot be empty");
        ChartboostCacheError chartboostCacheError = new ChartboostCacheError(ChartboostCacheError.Code.INTERNAL);
        Handler handler = this.f4343F;
        C1904d dVar = this.f4342E;
        dVar.getClass();
        handler.post(new C1894a.C1895a(6, str, (CBError.CBImpressionError) null, chartboostCacheError, false, ""));
        return false;
    }

    /* renamed from: j */
    private void m3932j(String str) {
        ChartboostCacheError chartboostCacheError = new ChartboostCacheError(ChartboostCacheError.Code.SESSION_NOT_STARTED);
        String location = this.f4820p.getLocation();
        C1904d dVar = this.f4342E;
        dVar.getClass();
        this.f4343F.post(new C1894a.C1895a(6, location, (CBError.CBImpressionError) null, chartboostCacheError, false, str));
    }

    /* renamed from: k */
    private void m3933k(String str) {
        ChartboostShowError chartboostShowError = new ChartboostShowError(ChartboostShowError.Code.SESSION_NOT_STARTED, false);
        String location = this.f4820p.getLocation();
        C1904d dVar = this.f4342E;
        dVar.getClass();
        this.f4343F.post(new C1894a.C1895a(7, location, (CBError.CBImpressionError) null, chartboostShowError, true, str));
    }

    /* renamed from: a */
    public void mo14137a(String str) {
        if (mo14143h()) {
            this.f4805a.execute(new C1913g.C1915b(3, this.f4820p.getLocation(), (C1920h) null, (CBError.CBImpressionError) null));
            return;
        }
        m3932j(str);
    }

    /* renamed from: b */
    public void mo14140b(String str) {
        if (mo14143h()) {
            this.f4805a.execute(new C1913g.C1915b(4, this.f4820p.getLocation(), (C1920h) null, (CBError.CBImpressionError) null));
            return;
        }
        m3933k(str);
    }

    /* renamed from: c */
    public void mo14141c(String str) {
        if (mo14143h()) {
            ChartboostBanner chartboostBanner = this.f4820p;
            chartboostBanner.didClickBanner(chartboostBanner.getLocation(), str, (ChartboostClickError) null);
        }
    }

    /* renamed from: g */
    public C1904d mo14142g() {
        return this.f4342E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo14143h() {
        ChartboostBanner chartboostBanner;
        if (!m3930a(C2022j.m4955b()) || (chartboostBanner = this.f4820p) == null) {
            return false;
        }
        return m3931i(chartboostBanner.getLocation());
    }

    /* renamed from: a */
    public void mo14138a(String str, String str2) {
        if (mo14143h()) {
            C2020z.m4943a(this.f4820p.getLocation(), str, 3);
        } else {
            m3933k(str2);
        }
    }

    /* renamed from: a */
    private boolean m3930a(C2022j jVar) {
        if (jVar == null || !C1882c.m4363c()) {
            return false;
        }
        return C2022j.m4962l();
    }

    /* renamed from: a */
    public boolean mo14139a() {
        return mo14610f(this.f4820p.getLocation()) != null;
    }

    /* renamed from: a */
    public void mo14136a(ChartboostBanner chartboostBanner) {
        this.f4820p = chartboostBanner;
    }
}
