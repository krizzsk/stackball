package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.C14535ru;
import com.yandex.mobile.ads.impl.au0;
import com.yandex.mobile.ads.impl.ht0;
import com.yandex.mobile.ads.impl.yu0;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.i0 */
public class C15500i0 implements C15526t {

    /* renamed from: a */
    private final List<C15526t> f43857a;

    /* renamed from: b */
    private final C15526t f43858b;

    public C15500i0(List<C15526t> list) {
        this.f43857a = list;
        this.f43858b = list.isEmpty() ? null : list.get(0);
    }

    /* renamed from: a */
    public void mo71675a(NativeBannerView nativeBannerView) throws NativeAdException {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.mo71675a(nativeBannerView);
        }
    }

    public void addImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.addImageLoadingListener(nativeAdImageLoadingListener);
        }
    }

    /* renamed from: b */
    public List<C14535ru> mo71676b() {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            return tVar.mo71676b();
        }
        return null;
    }

    public void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.bindNativeAd(nativeAdViewBinder);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C15526t> mo71677c() {
        return this.f43857a;
    }

    public void destroy() {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.destroy();
        }
    }

    public NativeAdAssets getAdAssets() {
        C15526t tVar = this.f43858b;
        return tVar != null ? tVar.getAdAssets() : new C15484e();
    }

    public NativeAdType getAdType() {
        C15526t tVar = this.f43858b;
        return tVar != null ? tVar.getAdType() : NativeAdType.CONTENT;
    }

    public String getInfo() {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            return tVar.getInfo();
        }
        return null;
    }

    public void loadImages() {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.loadImages();
        }
    }

    public void removeImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.removeImageLoadingListener(nativeAdImageLoadingListener);
        }
    }

    public void setCustomClickHandler(CustomClickHandler customClickHandler) {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.setCustomClickHandler(customClickHandler);
        }
    }

    public void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.setNativeAdEventListener(nativeAdEventListener);
        }
    }

    public void setShouldOpenLinksInApp(boolean z) {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            tVar.setShouldOpenLinksInApp(z);
        }
    }

    /* renamed from: a */
    public ht0 mo71674a() {
        C15526t tVar = this.f43858b;
        if (tVar != null) {
            return tVar.mo71674a();
        }
        return new ht0((au0) null, (yu0) null);
    }
}
