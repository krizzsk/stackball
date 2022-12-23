package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.models.p268ad.C15566b;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import org.json.JSONObject;

public class tg0 implements pk1<VideoAd> {

    /* renamed from: a */
    private final f91 f40319a = new f91();

    /* renamed from: b */
    private final InstreamAdBreakPosition f40320b;

    public tg0(InstreamAdBreakPosition instreamAdBreakPosition) {
        this.f40320b = instreamAdBreakPosition;
    }

    /* renamed from: a */
    public Object mo67352a(C13413ii iiVar, C15566b bVar, AdPodInfo adPodInfo, String str, JSONObject jSONObject) {
        return new mg0(new eg0(this.f40320b, bVar.mo71985d(), bVar.mo71988f(), bVar.mo71983b()), adPodInfo, this.f40319a.mo66944a(iiVar), str, jSONObject);
    }
}
