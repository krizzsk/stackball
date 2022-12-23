package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.banner.C12072b;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C14167o5;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.rd0;
import com.yandex.mobile.ads.mediation.banner.C15428f;
import com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.mediation.banner.a */
class C15421a implements MediatedBannerAdapter.MediatedBannerAdapterListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakReference<C12072b> f43575a;

    /* renamed from: b */
    private final C15428f f43576b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final om0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f43577c;

    /* renamed from: d */
    private final rd0 f43578d;

    /* renamed from: e */
    private boolean f43579e;

    /* renamed from: com.yandex.mobile.ads.mediation.banner.a$b */
    private class C15423b implements C15428f.C15430b {
        private C15423b() {
        }
    }

    C15421a(C12072b bVar, om0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> om0, C15428f fVar) {
        this.f43577c = om0;
        this.f43576b = fVar;
        this.f43575a = new WeakReference<>(bVar);
        this.f43578d = new rd0(om0);
    }

    public void onAdClicked() {
        C12072b bVar = (C12072b) this.f43575a.get();
        if (bVar != null) {
            this.f43577c.mo69216c(bVar.mo64596h());
        }
    }

    public void onAdFailedToLoad(AdRequestError adRequestError) {
        C12072b bVar = (C12072b) this.f43575a.get();
        if (bVar != null) {
            Context h = bVar.mo64596h();
            C12350a2 a2Var = new C12350a2(adRequestError.getCode(), adRequestError.getDescription());
            if (!this.f43579e) {
                this.f43577c.mo69214b(h, a2Var, this);
            } else {
                this.f43577c.mo69209a(h, a2Var, this);
            }
        }
    }

    public void onAdImpression() {
        if (!this.f43577c.mo69218c()) {
            m44934a();
        }
    }

    public void onAdLeftApplication() {
        C12072b bVar = (C12072b) this.f43575a.get();
        if (bVar != null) {
            bVar.onLeftApplication();
        }
    }

    public void onAdLoaded(View view) {
        C12072b bVar = (C12072b) this.f43575a.get();
        if (bVar != null) {
            Context context = view.getContext();
            if (!this.f43579e) {
                this.f43579e = true;
                this.f43577c.mo69221e(context);
            } else {
                this.f43577c.mo69213b(context);
            }
            this.f43576b.mo71374a(view, (C15428f.C15430b) new C15423b());
            bVar.mo64591c(new C14167o5(this.f43577c).mo69115a());
            bVar.onAdLoaded();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m44934a() {
        C12072b bVar = (C12072b) this.f43575a.get();
        if (bVar != null) {
            this.f43577c.mo69219d(bVar.mo64596h());
            bVar.mo64359a(this.f43578d.mo69754a());
        }
    }
}
