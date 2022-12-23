package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class d91 {

    /* renamed from: a */
    private final kg0 f32497a;

    /* renamed from: b */
    private final SkipInfo f32498b;

    public d91(kg0 kg0, VideoAd videoAd) {
        this.f32497a = kg0;
        this.f32498b = videoAd.getSkipInfo();
    }

    /* renamed from: a */
    public void mo66535a(View view, yf0 yf0) {
        if (this.f32498b != null) {
            view.setOnClickListener(new c91(this.f32497a));
            if (yf0.mo71046c()) {
                view.setVisibility(0);
                view.setEnabled(true);
                return;
            }
            view.setEnabled(false);
            return;
        }
        view.setVisibility(8);
    }
}
