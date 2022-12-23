package com.yandex.mobile.ads.instream.pauseroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.gk0;
import com.yandex.mobile.ads.impl.mk0;
import com.yandex.mobile.ads.impl.yy0;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

public class PauserollQueueProvider {

    /* renamed from: a */
    private final mk0<Pauseroll> f43566a;

    /* renamed from: b */
    private final gk0<Pauseroll> f43567b = new yy0();

    public PauserollQueueProvider(Context context, InstreamAd instreamAd) {
        this.f43566a = new mk0<>(context, instreamAd);
    }

    public InstreamAdBreakQueue<Pauseroll> getQueue() {
        return this.f43566a.mo68710a(this.f43567b, InstreamAdBreakType.PAUSEROLL);
    }
}
