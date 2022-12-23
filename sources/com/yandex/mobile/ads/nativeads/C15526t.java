package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.C14535ru;
import com.yandex.mobile.ads.impl.ht0;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.t */
public interface C15526t extends NativeAd, OpenLinksInAppProvider, CustomClickable {
    /* renamed from: a */
    ht0 mo71674a();

    /* renamed from: a */
    void mo71675a(NativeBannerView nativeBannerView) throws NativeAdException;

    /* renamed from: b */
    List<C14535ru> mo71676b();

    void destroy();
}
