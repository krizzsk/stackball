package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.base.C12129u;
import com.yandex.mobile.ads.impl.yr0;

public class NativeAdLoader {

    /* renamed from: a */
    private final C15515o f43720a;

    /* renamed from: b */
    protected final Context f43721b;

    public NativeAdLoader(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f43721b = applicationContext;
        this.f43720a = new C15515o(applicationContext);
    }

    public void cancelLoading() {
        this.f43720a.mo71716a();
    }

    public void loadAd(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        yr0 yr0 = new yr0(this.f43721b);
        this.f43720a.mo71718a(nativeAdRequestConfiguration, C12127t.AD, C12129u.AD, yr0);
    }

    public void setNativeAdLoadListener(NativeAdLoadListener nativeAdLoadListener) {
        this.f43720a.mo71717a(nativeAdLoadListener);
    }
}
