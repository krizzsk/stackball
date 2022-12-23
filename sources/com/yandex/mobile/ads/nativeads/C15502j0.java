package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.pq0;
import com.yandex.mobile.ads.impl.vq0;
import com.yandex.mobile.ads.nativeads.C15504k0;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.j0 */
class C15502j0 extends C15504k0 implements SliderAd, C15526t {

    /* renamed from: B */
    private final ed0 f43861B;

    /* renamed from: C */
    private final C15500i0 f43862C;

    C15502j0(Context context, C15500i0 i0Var, ed0 ed0, C15470a aVar) {
        super(context, aVar);
        this.f43861B = ed0;
        this.f43862C = i0Var;
        vq0 c = aVar.mo71615c();
        mo71692a(m45168a(c.mo70515c().mo65856c(), c.mo70513a()));
    }

    /* renamed from: a */
    private h41.C13275a m45168a(List<pq0> list, C14645t1 t1Var) {
        String a = C12127t.SLIDER.mo64660a();
        C15485e0 e0Var = new C15485e0(list, t1Var);
        e0Var.mo71657a(C15504k0.C15507c.CUSTOM);
        e0Var.mo71658a(a);
        return e0Var;
    }

    public void addImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f43862C.addImageLoadingListener(nativeAdImageLoadingListener);
    }

    public void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        this.f43862C.bindNativeAd(nativeAdViewBinder);
    }

    public void bindSliderAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        mo71691a(nativeAdViewBinder.getNativeAdView(), this.f43861B, new C15556y(nativeAdViewBinder), C15476c.f43821a);
    }

    public NativeAdAssets getAdAssets() {
        return this.f43862C.getAdAssets();
    }

    public NativeAdType getAdType() {
        return this.f43862C.getAdType();
    }

    public String getInfo() {
        return this.f43862C.getInfo();
    }

    public List<NativeAd> getNativeAds() {
        return new ArrayList(this.f43862C.mo71677c());
    }

    public void loadImages() {
        this.f43862C.loadImages();
    }

    public void removeImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f43862C.removeImageLoadingListener(nativeAdImageLoadingListener);
    }

    /* renamed from: a */
    public void mo71675a(NativeBannerView nativeBannerView) throws NativeAdException {
        this.f43862C.mo71675a(nativeBannerView);
    }
}
