package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class sf0 {

    /* renamed from: a */
    private final Context f39950a;

    /* renamed from: b */
    private final vf0 f39951b;

    /* renamed from: c */
    private final af0 f39952c;

    /* renamed from: d */
    private final lg1 f39953d;

    /* renamed from: e */
    private kg1 f39954e;

    public sf0(Context context, vf0 vf0, d01 d01, gf0 gf0) {
        this.f39950a = context.getApplicationContext();
        this.f39951b = vf0;
        af0 af0 = new af0();
        this.f39952c = af0;
        this.f39953d = new lg1(d01, gf0, af0);
    }

    /* renamed from: a */
    public void mo69969a(qj1 qj1) {
        this.f39952c.mo65746a(qj1);
    }

    /* renamed from: a */
    public void mo69968a(og0 og0, ck1<VideoAd> ck1, ln1 ln1, oj1 oj1) {
        mo69966a();
        uf0 a = this.f39951b.mo70480a();
        if (a != null) {
            kg1 a2 = this.f39953d.mo68433a(this.f39950a, a, og0, ck1, ln1, oj1);
            this.f39954e = a2;
            a2.mo68223a();
        }
    }

    /* renamed from: a */
    public void mo69966a() {
        kg1 kg1 = this.f39954e;
        if (kg1 != null) {
            kg1.mo68225b();
            this.f39954e = null;
        }
    }

    /* renamed from: a */
    public void mo69967a(ck1<VideoAd> ck1) {
        kg1 kg1 = this.f39954e;
        if (kg1 != null) {
            kg1.mo68224a(ck1);
        }
    }
}
