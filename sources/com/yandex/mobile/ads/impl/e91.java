package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.instream.player.p267ad.C15420a;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class e91 implements bl1 {

    /* renamed from: a */
    private final C15420a f32934a = new C15420a();

    /* renamed from: b */
    private final vf0 f32935b;

    /* renamed from: c */
    private final SkipInfo f32936c;

    /* renamed from: d */
    private boolean f32937d;

    public e91(vf0 vf0, VideoAd videoAd) {
        this.f32935b = vf0;
        this.f32936c = videoAd.getSkipInfo();
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        SkipInfo skipInfo;
        qj1 a;
        if (!this.f32937d && (skipInfo = this.f32936c) != null && j2 >= skipInfo.getSkipOffset()) {
            uf0 a2 = this.f32935b.mo70480a();
            View view = null;
            InstreamAdView b = a2 != null ? a2.mo70346b() : null;
            if (!(b == null || (a = this.f32934a.mo71356a(b)) == null)) {
                view = a.mo69610g();
            }
            if (view != null) {
                this.f32937d = true;
                view.setVisibility(0);
                view.setEnabled(true);
            }
        }
    }
}
