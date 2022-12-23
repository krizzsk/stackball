package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.pq0;
import com.yandex.mobile.ads.impl.vq0;
import com.yandex.mobile.ads.impl.ye1;
import com.yandex.mobile.ads.nativeads.C15504k0;
import com.yandex.mobile.ads.nativeads.template.C15545c;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import java.util.Collections;

/* renamed from: com.yandex.mobile.ads.nativeads.l */
public abstract class C15508l extends C15504k0 implements C15526t {

    /* renamed from: B */
    private final C15519q f43897B;

    /* renamed from: C */
    private final C15476c f43898C;

    /* renamed from: D */
    private final ye1 f43899D = new ye1();

    /* renamed from: E */
    private final C15485e0 f43900E;

    /* renamed from: F */
    private final mt0 f43901F = new mt0();

    /* renamed from: G */
    protected ed0 f43902G;

    C15508l(Context context, pq0 pq0, C15519q qVar, ed0 ed0, C15470a aVar) {
        super(context, aVar);
        this.f43897B = qVar;
        this.f43902G = ed0;
        vq0 c = aVar.mo71615c();
        this.f43898C = C15476c.m45115a(c.mo70515c().mo65863f());
        C15485e0 a = m45187a(pq0, c.mo70513a());
        this.f43900E = a;
        mo71692a((h41.C13275a) a);
    }

    /* renamed from: a */
    private C15485e0 m45187a(pq0 pq0, C14645t1 t1Var) {
        C15485e0 e0Var = new C15485e0(Collections.singletonList(pq0), t1Var);
        C15511m0 g = pq0.mo69419g();
        if (g != null) {
            e0Var.mo71658a(g.mo71709a());
        }
        return e0Var;
    }

    public void addImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f43897B.mo71735a(nativeAdImageLoadingListener);
    }

    public void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        View nativeAdView = nativeAdViewBinder.getNativeAdView();
        this.f43899D.mo71039a(nativeAdView, new C15503k(this));
        C15556y yVar = new C15556y(nativeAdViewBinder);
        C15476c cVar = C15476c.f43821a;
        this.f43900E.mo71657a(C15504k0.C15507c.CUSTOM);
        mo71691a(nativeAdView, this.f43902G, yVar, cVar);
    }

    public NativeAdAssets getAdAssets() {
        return this.f43897B.mo71734a();
    }

    public NativeAdType getAdType() {
        int ordinal;
        C15511m0 b = this.f43897B.mo71736b();
        this.f43901F.getClass();
        NativeAdType nativeAdType = NativeAdType.CONTENT;
        if (b == null || (ordinal = b.ordinal()) == 0) {
            return nativeAdType;
        }
        if (ordinal == 1) {
            return NativeAdType.APP_INSTALL;
        }
        if (ordinal != 2) {
            return nativeAdType;
        }
        return NativeAdType.MEDIA;
    }

    public String getInfo() {
        return this.f43897B.mo71738c();
    }

    public void loadImages() {
        this.f43897B.mo71739d();
    }

    public void removeImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f43897B.mo71737b(nativeAdImageLoadingListener);
    }

    public void setShouldOpenLinksInApp(boolean z) {
        super.setShouldOpenLinksInApp(z);
    }

    /* renamed from: a */
    public void mo71675a(NativeBannerView nativeBannerView) throws NativeAdException {
        C15545c cVar = new C15545c();
        nativeBannerView.mo71704a(this);
        C15476c cVar2 = this.f43898C;
        this.f43900E.mo71657a(C15504k0.C15507c.TEMPLATE);
        mo71691a(nativeBannerView, this.f43902G, cVar, cVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71690a(Context context) {
        this.f43899D.mo71038a(context);
        super.mo71690a(context);
    }
}
