package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.base.C12129u;
import com.yandex.mobile.ads.impl.yr0;

public class NativeBulkAdLoader {

    /* renamed from: a */
    private final C15515o f43773a;

    /* renamed from: b */
    private final Context f43774b;

    public NativeBulkAdLoader(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f43774b = applicationContext;
        this.f43773a = new C15515o(applicationContext);
    }

    public void cancelLoading() {
        this.f43773a.mo71716a();
    }

    public void loadAds(NativeAdRequestConfiguration nativeAdRequestConfiguration, int i) {
        NativeAdRequestConfiguration nativeAdRequestConfiguration2 = nativeAdRequestConfiguration;
        this.f43773a.mo71719a(nativeAdRequestConfiguration2, C12127t.BULK, C12129u.AD, new yr0(this.f43774b), i);
    }

    public void setNativeBulkAdLoadListener(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f43773a.mo71720a(nativeBulkAdLoadListener);
    }
}
