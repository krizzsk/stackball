package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.base.C12129u;
import com.yandex.mobile.ads.impl.yr0;

public class SliderAdLoader {

    /* renamed from: a */
    private final C15515o f43775a;

    /* renamed from: b */
    private final Context f43776b;

    public SliderAdLoader(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f43776b = applicationContext;
        this.f43775a = new C15515o(applicationContext);
    }

    public void cancelLoading() {
        this.f43775a.mo71716a();
    }

    public void loadSlider(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        this.f43775a.mo71723b(nativeAdRequestConfiguration, C12127t.SLIDER, C12129u.AD, new yr0(this.f43776b));
    }

    public void setSliderAdLoadListener(SliderAdLoadListener sliderAdLoadListener) {
        this.f43775a.mo71721a(sliderAdLoadListener);
    }
}
