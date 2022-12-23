package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.sq0;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;

/* renamed from: com.yandex.mobile.ads.nativeads.x */
public class C15555x {
    /* renamed from: a */
    public NativeAdViewBinder mo71937a(View view, sq0 sq0) {
        NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(view);
        NativeAdViewBinder.Builder priceView = builder.setAgeView(sq0.mo65904d(view)).setBodyView(sq0.mo65901a(view)).setCallToActionView(sq0.mo65911k(view)).setDomainView(sq0.mo65912l(view)).setFaviconView(sq0.mo65903c(view)).setFeedbackView(sq0.mo65909i(view)).setIconView(sq0.mo65913m(view)).setMediaView(sq0.mo65906f(view)).setPriceView(sq0.mo65908h(view));
        View e = sq0.mo65905e(view);
        if (!(e instanceof Rating)) {
            e = null;
        }
        priceView.setRatingView(e).setReviewCountView(sq0.mo65914n(view)).setSponsoredView(sq0.mo65910j(view)).setTitleView(sq0.mo65907g(view)).setWarningView(sq0.mo65902b(view));
        return builder.build();
    }
}
