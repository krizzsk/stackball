package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.ze */
public class C15307ze implements ig1 {

    /* renamed from: a */
    private final View.OnClickListener f43098a;

    /* renamed from: b */
    private final C13952m3 f43099b;

    C15307ze(Context context, og0 og0, kg0 kg0, ck1<VideoAd> ck1, ln1 ln1, oj1 oj1) {
        this.f43098a = new tf0(context, og0, ck1, ln1, oj1);
        this.f43099b = new C13952m3(kg0);
    }

    /* renamed from: a */
    public void mo65778a(InstreamAdView instreamAdView, yf0 yf0) {
        instreamAdView.setOnClickListener(this.f43098a);
        this.f43099b.mo68558a(yf0.mo71044a(), yf0.mo71047d());
    }

    /* renamed from: a */
    public void mo65777a(InstreamAdView instreamAdView) {
        instreamAdView.setOnClickListener((View.OnClickListener) null);
        instreamAdView.setClickable(false);
    }
}
