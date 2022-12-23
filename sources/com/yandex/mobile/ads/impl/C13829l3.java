package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.l3 */
public class C13829l3 {

    /* renamed from: a */
    private final C12847d2 f36497a;

    /* renamed from: b */
    private final C14735u2 f36498b;

    /* renamed from: c */
    private final C12952e3 f36499c;

    public C13829l3(C15029w4 w4Var, C12847d2 d2Var) {
        this.f36497a = d2Var;
        this.f36498b = w4Var.mo70632a();
        this.f36499c = w4Var.mo70634c();
    }

    /* renamed from: a */
    public void mo68310a(VideoAd videoAd) {
        if (videoAd.getMediaFile() instanceof eg0) {
            eg0 eg0 = (eg0) videoAd.getMediaFile();
            C14436r2 r2Var = new C14436r2(this.f36497a.mo66391a(eg0.mo66823a()), videoAd.getAdPodInfo().getAdPosition() - 1);
            this.f36498b.mo70278a(videoAd, r2Var);
            AdPlaybackState a = this.f36499c.mo66746a();
            if (!a.isAdInErrorState(r2Var.mo69678a(), r2Var.mo69679b())) {
                this.f36499c.mo66747a(a.withAdCount(r2Var.mo69678a(), videoAd.getAdPodInfo().getAdsCount()).withAdUri(r2Var.mo69678a(), r2Var.mo69679b(), Uri.parse(eg0.getUrl())));
            }
        }
    }
}
