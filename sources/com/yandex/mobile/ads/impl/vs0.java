package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

public class vs0 implements NativeAdEventListener {

    /* renamed from: a */
    private final C13371i0 f41525a;

    public vs0(C13371i0 i0Var) {
        this.f41525a = i0Var;
    }

    public void onAdClicked() {
    }

    public void onImpression(ImpressionData impressionData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", impressionData instanceof AdImpressionData ? (AdImpressionData) impressionData : null);
        ((C14049n0) this.f41525a).mo68877a(16, bundle);
    }

    public void onLeftApplication() {
        ((C14049n0) this.f41525a).mo68877a(17, (Bundle) null);
    }

    public void onReturnedToApplication() {
        ((C14049n0) this.f41525a).mo68877a(18, (Bundle) null);
    }
}
