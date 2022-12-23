package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

public class mh0 extends m80 {

    /* renamed from: T */
    private final kh0 f37381T;

    /* renamed from: U */
    private final xa0 f37382U;

    public mh0(Context context, kh0 kh0, C15230y2 y2Var) {
        super(context, C12115n.INTERSTITIAL, kh0, y2Var, new v70());
        this.f37381T = kh0;
        xa0 xa0 = new xa0();
        this.f37382U = xa0;
        kh0.mo68228a((h41.C13275a) xa0);
    }

    /* renamed from: a */
    public void mo68690a(InterstitialAdEventListener interstitialAdEventListener) {
        this.f37381T.mo68230a(interstitialAdEventListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public d80 mo68611a(e80 e80) {
        return e80.mo66774a((m80) this);
    }

    /* renamed from: a */
    public void mo64360a(AdResponse<String> adResponse) {
        super.mo64360a(adResponse);
        this.f37382U.mo70852a(adResponse);
    }
}
