package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12101h;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.C12116o;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.base.C12129u;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C13403ib;
import com.yandex.mobile.ads.impl.C14559s3;
import com.yandex.mobile.ads.impl.C15139x2;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.cs0;
import com.yandex.mobile.ads.impl.er0;
import com.yandex.mobile.ads.impl.fc1;
import com.yandex.mobile.ads.impl.fr0;
import com.yandex.mobile.ads.impl.fs0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.ji0;
import com.yandex.mobile.ads.impl.or0;
import com.yandex.mobile.ads.impl.rr0;
import com.yandex.mobile.ads.impl.t41;
import com.yandex.mobile.ads.impl.vb1;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.n */
public class C15512n extends C12116o<as0> {

    /* renamed from: A */
    private final fs0 f43911A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C15524s f43912B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C15230y2 f43913C;

    /* renamed from: D */
    private final vb1 f43914D;

    /* renamed from: E */
    private t41<as0> f43915E;

    /* renamed from: F */
    private NativeAdRequestConfiguration f43916F;

    /* renamed from: G */
    private rr0 f43917G;

    /* renamed from: x */
    private final er0 f43918x = new C15513a();

    /* renamed from: y */
    private final fr0 f43919y;

    /* renamed from: z */
    private final cs0 f43920z;

    public C15512n(Context context, C15524s sVar, C15230y2 y2Var) {
        super(context, C12115n.NATIVE, y2Var);
        this.f43912B = sVar;
        this.f43913C = y2Var;
        m45195a(context);
        this.f43919y = new fr0(context, mo64592d(), y2Var);
        this.f43920z = new cs0();
        fs0 fs0 = new fs0();
        this.f43911A = fs0;
        sVar.mo71744a((h41.C13275a) fs0);
        this.f43917G = new rr0(context, this);
        this.f43914D = vb1.m43082a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo64582a(AdRequest adRequest) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C12350a2 mo64606s() {
        return this.f29218k.mo68010b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo71715t() {
        mo64583b();
        this.f29219l.mo64751a();
        this.f29210c.mo64524a();
        this.f43912B.mo71743a();
        this.f43914D.mo70468a(ji0.LOAD, this);
        mo64577a(C12101h.CANCELLED);
        this.f43919y.mo67069a();
    }

    /* renamed from: b */
    public synchronized void mo64584b(AdRequest adRequest) {
        mo64589c(adRequest);
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.n$a */
    class C15513a implements er0 {
        C15513a() {
        }

        /* renamed from: a */
        public void mo66860a(C12350a2 a2Var) {
            C15512n.this.f43913C.mo70965a(C15139x2.AD_LOADING);
            C15512n.this.mo64404a(a2Var);
        }

        /* renamed from: a */
        public void mo66861a(NativeAd nativeAd) {
            C15512n.this.mo64602o();
            C15512n.this.f43912B.mo71746a(nativeAd);
        }

        /* renamed from: a */
        public void mo66863a(List<NativeAd> list) {
            C15512n.this.mo64602o();
            C15512n.this.f43912B.mo71751a((List<? extends NativeAd>) list);
        }

        /* renamed from: a */
        public void mo66862a(SliderAd sliderAd) {
            C15512n.this.mo64602o();
            C15512n.this.f43912B.mo71749a(sliderAd);
        }
    }

    /* renamed from: a */
    public void mo64360a(AdResponse<as0> adResponse) {
        super.mo64360a(adResponse);
        this.f43911A.mo67078a(adResponse);
        if (!mo64597i()) {
            this.f43920z.mo66352a(adResponse).mo66334a(this).mo67079a(this.f29209b, adResponse);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo64585b(C12350a2 a2Var) {
        this.f43912B.mo71752b(a2Var);
    }

    /* renamed from: a */
    public void mo71710a(AdResponse<as0> adResponse, or0 or0, String str) {
        mo64591c(str);
        if (!mo64597i()) {
            this.f43919y.mo67070a(this.f29209b, adResponse, adResponse.mo64447z(), or0, this.f43918x);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13403ib<as0> mo64575a(String str, String str2) {
        return this.f43917G.mo69807a(this.f43915E, this.f29213f, this.f43916F, str, str2);
    }

    /* renamed from: a */
    public void mo71712a(NativeAdRequestConfiguration nativeAdRequestConfiguration, C12127t tVar, C12129u uVar, t41<as0> t41, int i) {
        this.f43916F = nativeAdRequestConfiguration;
        this.f43915E = t41;
        if (t41.mo67749a()) {
            this.f43913C.mo70970b(C15139x2.AD_LOADING);
            this.f43914D.mo70469b(ji0.LOAD, this);
            this.f29213f.mo70081a(i);
            this.f29213f.mo70089a(nativeAdRequestConfiguration.mo71551a());
            this.f29213f.mo70083a(tVar);
            this.f29213f.mo70090a(nativeAdRequestConfiguration.mo71559i());
            this.f29213f.mo70084a(uVar);
            AdRequest build = new AdRequest.Builder().setAge(nativeAdRequestConfiguration.mo71552b()).setBiddingData(nativeAdRequestConfiguration.mo71553c()).setContextQuery(nativeAdRequestConfiguration.mo71554d()).setContextTags(nativeAdRequestConfiguration.mo71555e()).setGender(nativeAdRequestConfiguration.mo71556f()).setLocation(nativeAdRequestConfiguration.mo71557g()).setParameters(nativeAdRequestConfiguration.mo71558h()).build();
            synchronized (this) {
                mo64589c(build);
            }
            return;
        }
        mo64404a(C14559s3.f39817j);
    }

    /* renamed from: a */
    private void m45195a(Context context) {
        this.f29213f.mo70091a(fc1.m35987a(context).mo66988a());
    }

    /* renamed from: a */
    public void mo71711a(NativeAdLoadListener nativeAdLoadListener) {
        this.f43912B.mo71747a(nativeAdLoadListener);
    }

    /* renamed from: a */
    public void mo71713a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f43912B.mo71748a(nativeBulkAdLoadListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71714a(SliderAdLoadListener sliderAdLoadListener) {
        this.f43912B.mo71750a(sliderAdLoadListener);
    }
}
