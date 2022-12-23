package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C12352a3;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C14736u3;
import com.yandex.mobile.ads.impl.C15224y1;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.h41;

/* renamed from: com.yandex.mobile.ads.banner.d */
public class C12077d implements C15224y1 {

    /* renamed from: a */
    private final Handler f29050a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final C12352a3 f29051b;

    /* renamed from: c */
    private BannerAdEventListener f29052c;

    public C12077d(Context context, C15230y2 y2Var) {
        this.f29051b = new C12352a3(context, y2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m31216c() {
        BannerAdEventListener bannerAdEventListener = this.f29052c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onReturnedToApplication();
        }
    }

    /* renamed from: a */
    public void mo64379a(C14645t1 t1Var) {
        this.f29051b.mo65660b(new C14736u3(C12115n.BANNER, t1Var));
    }

    /* renamed from: b */
    public void mo64380b(AdImpressionData adImpressionData) {
        this.f29050a.post(new Runnable(adImpressionData) {
            public final /* synthetic */ AdImpressionData f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C12077d.this.m31213a(this.f$1);
            }
        });
    }

    /* renamed from: d */
    public void mo64381d() {
        this.f29051b.mo65657a();
        this.f29050a.post(new Runnable() {
            public final void run() {
                C12077d.this.m31212a();
            }
        });
    }

    /* renamed from: e */
    public void mo64382e() {
        this.f29050a.post(new Runnable() {
            public final void run() {
                C12077d.this.m31215b();
            }
        });
    }

    /* renamed from: f */
    public void mo64383f() {
        this.f29050a.post(new Runnable() {
            public final void run() {
                C12077d.this.m31216c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31215b() {
        BannerAdEventListener bannerAdEventListener = this.f29052c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdClicked();
            bannerAdEventListener.onLeftApplication();
        }
    }

    /* renamed from: a */
    public void mo64378a(h41.C13275a aVar) {
        this.f29051b.mo65658a(aVar);
    }

    /* renamed from: a */
    public void mo64377a(C12350a2 a2Var) {
        this.f29051b.mo65659a(a2Var.mo65652b());
        this.f29050a.post(new Runnable(new AdRequestError(a2Var.mo65651a(), a2Var.mo65652b())) {
            public final /* synthetic */ AdRequestError f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C12077d.this.m31214a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31214a(AdRequestError adRequestError) {
        BannerAdEventListener bannerAdEventListener = this.f29052c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(adRequestError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31213a(AdImpressionData adImpressionData) {
        BannerAdEventListener bannerAdEventListener = this.f29052c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(adImpressionData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31212a() {
        BannerAdEventListener bannerAdEventListener = this.f29052c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdLoaded();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo64376a(BannerAdEventListener bannerAdEventListener) {
        this.f29052c = bannerAdEventListener;
    }
}
