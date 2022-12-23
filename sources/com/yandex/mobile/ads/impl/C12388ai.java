package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.player.p267ad.C15420a;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.ai */
public class C12388ai implements ig1 {

    /* renamed from: a */
    private final C12589bi f30552a;

    /* renamed from: b */
    private final C15420a f30553b = new C15420a();

    /* renamed from: c */
    private final rf0 f30554c;

    public C12388ai(Context context, af0 af0, kg0 kg0, og0 og0, ck1<VideoAd> ck1, ln1 ln1, oj1 oj1) {
        this.f30554c = new rf0(af0);
        this.f30552a = new C12589bi(context, kg0, og0, ck1, ln1, oj1);
    }

    /* renamed from: a */
    public void mo65777a(InstreamAdView instreamAdView) {
        qj1 a = this.f30553b.mo71356a(instreamAdView);
        if (a != null) {
            instreamAdView.removeView(a.mo69604a());
        }
        this.f30553b.mo71357a(instreamAdView, (qj1) null);
    }

    /* renamed from: a */
    public void mo65778a(InstreamAdView instreamAdView, yf0 yf0) {
        qj1 a = this.f30554c.mo69760a(instreamAdView);
        if (a != null) {
            this.f30552a.mo66072a(a, yf0);
            instreamAdView.addView(a.mo69604a(), new ViewGroup.LayoutParams(-1, -1));
        }
        this.f30553b.mo71357a(instreamAdView, a);
    }
}
