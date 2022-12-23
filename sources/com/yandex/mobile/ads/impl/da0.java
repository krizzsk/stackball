package com.yandex.mobile.ads.impl;

import com.tapjoy.TapjoyConstants;
import java.util.concurrent.TimeUnit;

public class da0 {

    /* renamed from: a */
    private final v90 f32505a;

    public da0(v90 v90) {
        this.f32505a = v90;
    }

    /* renamed from: a */
    public void mo66539a(String str, long j, TimeUnit timeUnit) {
        this.f32505a.mo69827a(str, timeUnit.toMillis(j), 1, (long) TapjoyConstants.TIMER_INCREMENT, TimeUnit.MILLISECONDS, 50);
    }
}
