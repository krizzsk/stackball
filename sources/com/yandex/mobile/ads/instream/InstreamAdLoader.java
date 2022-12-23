package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.cf0;

public class InstreamAdLoader {

    /* renamed from: a */
    private final cf0 f43530a;

    public InstreamAdLoader(Context context) {
        this.f43530a = new cf0(context);
    }

    public void loadInstreamAd(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f43530a.mo66281a(instreamAdRequestConfiguration);
    }

    public void setInstreamAdLoadListener(InstreamAdLoadListener instreamAdLoadListener) {
        this.f43530a.mo66280a(instreamAdLoadListener);
    }
}
