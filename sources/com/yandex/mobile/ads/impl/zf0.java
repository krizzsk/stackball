package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class zf0 implements C14340q1 {

    /* renamed from: a */
    private final C14893vi f43104a;

    /* renamed from: b */
    private final VideoAd f43105b;

    /* renamed from: c */
    private final dg0 f43106c;

    zf0(dg0 dg0, VideoAd videoAd, C14893vi viVar) {
        this.f43104a = viVar;
        this.f43105b = videoAd;
        this.f43106c = dg0;
    }

    /* renamed from: a */
    public void mo66065a(Context context, String str) {
        this.f43104a.mo70491a(str, this.f43105b, new ag0(this.f43106c));
    }
}
