package com.yandex.mobile.ads.instream.inroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.gk0;
import com.yandex.mobile.ads.impl.mk0;
import com.yandex.mobile.ads.impl.ne0;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

public class InrollQueueProvider {

    /* renamed from: a */
    private final mk0<Inroll> f43564a;

    /* renamed from: b */
    private final gk0<Inroll> f43565b = new ne0();

    public InrollQueueProvider(Context context, InstreamAd instreamAd) {
        this.f43564a = new mk0<>(context, instreamAd);
    }

    public InstreamAdBreakQueue<Inroll> getQueue() {
        return this.f43564a.mo68710a(this.f43565b, InstreamAdBreakType.INROLL);
    }
}
