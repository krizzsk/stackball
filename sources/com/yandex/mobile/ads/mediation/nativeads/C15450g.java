package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.pd0;
import com.yandex.mobile.ads.impl.xc0;
import com.yandex.mobile.ads.nativeads.C15511m0;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.g */
class C15450g {

    /* renamed from: a */
    private final xc0 f43651a;

    /* renamed from: b */
    private final C15453h f43652b;

    /* renamed from: c */
    private final C15461p f43653c;

    /* renamed from: com.yandex.mobile.ads.mediation.nativeads.g$a */
    class C15451a implements pd0 {

        /* renamed from: a */
        final /* synthetic */ MediatedNativeAd f43654a;

        /* renamed from: b */
        final /* synthetic */ C15511m0 f43655b;

        /* renamed from: c */
        final /* synthetic */ C15452b f43656c;

        C15451a(MediatedNativeAd mediatedNativeAd, C15511m0 m0Var, C15452b bVar) {
            this.f43654a = mediatedNativeAd;
            this.f43655b = m0Var;
            this.f43656c = bVar;
        }

        /* renamed from: a */
        public void mo66874a(Map<String, Bitmap> map) {
            C15450g.m44969a(C15450g.this, this.f43654a, map, this.f43655b, this.f43656c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.mediation.nativeads.g$b */
    interface C15452b {
        /* renamed from: a */
        void mo71402a(AdResponse<as0> adResponse);
    }

    C15450g(Context context, xc0 xc0, C15453h hVar) {
        this.f43651a = xc0;
        this.f43652b = hVar;
        this.f43653c = new C15461p(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71464a(MediatedNativeAd mediatedNativeAd, C15511m0 m0Var, List<MediatedNativeAdImage> list, C15452b bVar) {
        this.f43651a.mo70873a(this.f43652b.mo71465a(list), new C15451a(mediatedNativeAd, m0Var, bVar));
    }

    /* renamed from: a */
    static void m44969a(C15450g gVar, MediatedNativeAd mediatedNativeAd, Map map, C15511m0 m0Var, C15452b bVar) {
        bVar.mo71402a(gVar.f43653c.mo71468a(mediatedNativeAd, map, m0Var));
    }
}
