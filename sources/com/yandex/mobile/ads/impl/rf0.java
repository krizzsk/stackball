package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;

public class rf0 {

    /* renamed from: a */
    private final af0 f39440a;

    /* renamed from: b */
    private final C14895vk f39441b = new C14895vk();

    public rf0(af0 af0) {
        this.f39440a = af0;
    }

    /* renamed from: a */
    public qj1 mo69760a(InstreamAdView instreamAdView) {
        Context context = instreamAdView.getContext();
        qj1 a = this.f39440a.mo65745a();
        return a == null ? this.f39441b.mo70500a(context, instreamAdView) : a;
    }
}
