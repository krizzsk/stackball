package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class jg1 {

    /* renamed from: a */
    private final af0 f35293a;

    /* renamed from: b */
    private final hg0 f35294b = hg0.m36966a();

    public jg1(af0 af0) {
        this.f35293a = af0;
    }

    /* renamed from: a */
    public ig1 mo67989a(Context context, og0 og0, ck1<VideoAd> ck1, kg0 kg0, ln1 ln1, oj1 oj1) {
        if (!this.f35294b.mo67552c()) {
            return new C15307ze(context, og0, kg0, ck1, ln1, oj1);
        }
        return new C12388ai(context, this.f35293a, kg0, og0, ck1, ln1, oj1);
    }
}
