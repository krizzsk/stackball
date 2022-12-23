package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;

public class og0 implements InstreamAdBreak {

    /* renamed from: a */
    private final List<ck1<VideoAd>> f38216a;

    /* renamed from: b */
    private final String f38217b;

    /* renamed from: c */
    private final C12563b1 f38218c;

    /* renamed from: d */
    private final InstreamAdBreakPosition f38219d;

    /* renamed from: e */
    private C14893vi f38220e;

    public og0(List<ck1<VideoAd>> list, List<VideoAd> list2, String str, C12563b1 b1Var, InstreamAdBreakPosition instreamAdBreakPosition) {
        this.f38216a = list;
        this.f38217b = str;
        this.f38218c = b1Var;
        this.f38219d = instreamAdBreakPosition;
    }

    /* renamed from: a */
    public C12563b1 mo69155a() {
        return this.f38218c;
    }

    /* renamed from: b */
    public C14893vi mo69157b() {
        return this.f38220e;
    }

    /* renamed from: c */
    public List<ck1<VideoAd>> mo69158c() {
        return this.f38216a;
    }

    public InstreamAdBreakPosition getAdBreakPosition() {
        return this.f38219d;
    }

    public String getType() {
        return this.f38217b;
    }

    /* renamed from: a */
    public void mo69156a(C14893vi viVar) {
        this.f38220e = viVar;
    }
}
