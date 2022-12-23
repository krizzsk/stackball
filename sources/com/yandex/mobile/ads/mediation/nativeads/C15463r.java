package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C14167o5;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.bn0;
import com.yandex.mobile.ads.impl.dn0;
import com.yandex.mobile.ads.impl.fn0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.or0;
import com.yandex.mobile.ads.impl.qm0;
import com.yandex.mobile.ads.impl.rd0;
import com.yandex.mobile.ads.impl.xc0;
import com.yandex.mobile.ads.mediation.nativeads.C15450g;
import com.yandex.mobile.ads.nativeads.C15511m0;
import com.yandex.mobile.ads.nativeads.C15512n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.r */
class C15463r implements MediatedNativeAdapterListener {

    /* renamed from: a */
    private final Context f43677a;

    /* renamed from: b */
    private final AdResponse<as0> f43678b;

    /* renamed from: c */
    private final om0<MediatedNativeAdapter, MediatedNativeAdapterListener> f43679c;

    /* renamed from: d */
    private final WeakReference<C15512n> f43680d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15449f f43681e;

    /* renamed from: f */
    private final xc0 f43682f;

    /* renamed from: g */
    private final C15450g f43683g;

    /* renamed from: h */
    private final Map<String, Object> f43684h;

    /* renamed from: i */
    private final Map<String, Object> f43685i = new HashMap();

    /* renamed from: j */
    private final C15454i f43686j;

    /* renamed from: k */
    private final C15453h f43687k;

    /* renamed from: l */
    private final rd0 f43688l;

    /* renamed from: m */
    private final dn0 f43689m;

    /* renamed from: n */
    private boolean f43690n;

    C15463r(AdResponse<as0> adResponse, C15512n nVar, om0<MediatedNativeAdapter, MediatedNativeAdapterListener> om0) {
        HashMap hashMap = new HashMap();
        this.f43684h = hashMap;
        Context h = nVar.mo64596h();
        Context applicationContext = h.getApplicationContext();
        this.f43677a = applicationContext;
        this.f43678b = adResponse;
        this.f43679c = om0;
        this.f43680d = new WeakReference<>(nVar);
        this.f43681e = new C15449f();
        xc0 xc0 = new xc0(h);
        this.f43682f = xc0;
        this.f43686j = new C15454i();
        C15453h hVar = new C15453h(h);
        this.f43687k = hVar;
        this.f43683g = new C15450g(h, xc0, hVar);
        this.f43688l = new rd0(om0);
        this.f43689m = new dn0(applicationContext, om0, hashMap);
    }

    public void onAdClicked() {
        this.f43679c.mo69211a(this.f43677a, this.f43684h);
        m44987a(this.f43677a, h41.C13276b.CLICK);
        this.f43681e.mo71458a();
    }

    public void onAdClosed() {
        this.f43681e.mo71461b();
    }

    public void onAdFailedToLoad(AdRequestError adRequestError) {
        C15512n nVar = (C15512n) this.f43680d.get();
        if (nVar != null) {
            this.f43679c.mo69214b(nVar.mo64596h(), new C12350a2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    public void onAdImpression() {
        if (!this.f43690n) {
            this.f43690n = true;
            this.f43679c.mo69215b(this.f43677a, this.f43684h);
            m44987a(this.f43677a, h41.C13276b.IMPRESSION_TRACKING_SUCCESS);
            this.f43681e.mo71459a(this.f43688l.mo69754a());
        }
    }

    public void onAdLeftApplication() {
        this.f43681e.mo71462c();
    }

    public void onAdOpened() {
        this.f43681e.mo71463d();
    }

    public void onAppInstallAdLoaded(MediatedNativeAd mediatedNativeAd) {
        m44988a(mediatedNativeAd, C15511m0.APP_INSTALL);
    }

    public void onContentAdLoaded(MediatedNativeAd mediatedNativeAd) {
        m44988a(mediatedNativeAd, C15511m0.CONTENT);
    }

    /* renamed from: a */
    private void m44987a(Context context, h41.C13276b bVar) {
        HashMap hashMap = new HashMap(this.f43684h);
        hashMap.put("event_type", bVar.mo67416a());
        hashMap.put("ad_info", this.f43685i);
        this.f43679c.mo69220d(context, hashMap);
    }

    /* renamed from: a */
    private void m44988a(MediatedNativeAd mediatedNativeAd, C15511m0 m0Var) {
        C15512n nVar = (C15512n) this.f43680d.get();
        if (nVar != null) {
            Context h = nVar.mo64596h();
            this.f43684h.put("native_ad_type", m0Var.mo71709a());
            this.f43679c.mo69217c(h, this.f43684h);
            HashMap hashMap = new HashMap();
            hashMap.put("title", mediatedNativeAd.getMediatedNativeAdAssets().getTitle());
            this.f43685i.putAll(hashMap);
            this.f43686j.getClass();
            MediatedNativeAdAssets mediatedNativeAdAssets = mediatedNativeAd.getMediatedNativeAdAssets();
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediatedNativeAdAssets.getFavicon());
            arrayList.add(mediatedNativeAdAssets.getIcon());
            arrayList.add(mediatedNativeAdAssets.getImage());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
                if (mediatedNativeAdImage != null) {
                    arrayList2.add(mediatedNativeAdImage);
                }
            }
            this.f43682f.mo70872a(this.f43687k.mo71466b(arrayList2));
            this.f43683g.mo71464a(mediatedNativeAd, m0Var, arrayList2, new C15450g.C15452b(mediatedNativeAd, nVar) {
                public final /* synthetic */ MediatedNativeAd f$1;
                public final /* synthetic */ C15512n f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                /* renamed from: a */
                public final void mo71402a(AdResponse adResponse) {
                    C15463r.this.m44989a(this.f$1, this.f$2, adResponse);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m44989a(MediatedNativeAd mediatedNativeAd, C15512n nVar, AdResponse adResponse) {
        C15459n nVar2 = new C15459n(mediatedNativeAd, this.f43689m);
        nVar.mo71710a(adResponse, new or0(new qm0(this.f43678b, this.f43679c.mo69212b()), new C15447e(new C15462q(this)), nVar2, new bn0(), new fn0()), new C14167o5(this.f43679c).mo69115a());
    }
}
