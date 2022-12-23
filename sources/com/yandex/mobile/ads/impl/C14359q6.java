package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.q6 */
public class C14359q6 {

    /* renamed from: a */
    private final ck1<VideoAd> f39007a;

    /* renamed from: b */
    private final C14441r6 f39008b;

    public C14359q6(ck1<VideoAd> ck1) {
        this.f39007a = ck1;
        this.f39008b = new C14441r6(ck1.mo66325e());
    }

    /* renamed from: a */
    public C14257p6 mo69497a() {
        qa1 d = this.f39007a.mo66324d();
        if (d != null) {
            return new pa1(d);
        }
        if (this.f39008b.mo69696a()) {
            return new c30();
        }
        return new C15053wj();
    }
}
