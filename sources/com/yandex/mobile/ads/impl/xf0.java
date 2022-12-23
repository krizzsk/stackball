package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class xf0 {

    /* renamed from: a */
    private final Context f42548a;

    /* renamed from: b */
    private final og0 f42549b;

    /* renamed from: c */
    private final ck1<VideoAd> f42550c;

    public xf0(Context context, og0 og0, ck1<VideoAd> ck1) {
        this.f42548a = context.getApplicationContext();
        this.f42549b = og0;
        this.f42550c = ck1;
    }

    /* renamed from: a */
    public C14340q1 mo70895a() {
        C14893vi b = this.f42549b.mo69157b();
        dg0 dg0 = new dg0(this.f42548a, this.f42550c.mo66321a());
        if (b != null) {
            return new zf0(dg0, this.f42550c.mo66323c(), b);
        }
        return new bg0(dg0);
    }
}
