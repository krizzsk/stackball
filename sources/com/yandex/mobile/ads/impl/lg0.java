package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class lg0 {

    /* renamed from: a */
    private final yh1<VideoAd> f36662a;

    /* renamed from: b */
    private final kg0 f36663b;

    public lg0(Context context, gf0 gf0, vf0 vf0, og0 og0, ck1<VideoAd> ck1, ll1 ll1, ln1 ln1, mk1<VideoAd> mk1) {
        og0 og02 = og0;
        VideoAd c = ck1.mo66323c();
        vf0 vf02 = vf0;
        zg0 zg0 = new zg0(vf02);
        kg0 kg0 = new kg0(c, gf0);
        this.f36663b = kg0;
        cl1 cl1 = new cl1();
        new mf0(c, zg0, kg0, vf02, ll1).mo68680a(cl1);
        ck1<VideoAd> ck12 = ck1;
        yh1 yh1 = new yh1(context, kg0, zg0, ck12, new yg0(og02, ck12, ll1, zg0), ll1, ln1, cl1, mk1);
        this.f36662a = yh1;
        bf0 bf0 = new bf0(c);
        we0 we0 = new we0(og02);
        yh1.mo71080a(bf0);
        yh1.mo71082b(we0);
    }

    /* renamed from: a */
    public void mo68426a() {
        this.f36662a.mo71079a();
    }

    /* renamed from: b */
    public void mo68427b() {
        this.f36662a.mo71081b();
    }

    /* renamed from: c */
    public void mo68428c() {
        this.f36662a.mo71083c();
    }

    /* renamed from: d */
    public void mo68429d() {
        this.f36662a.mo71084d();
    }

    /* renamed from: e */
    public void mo68430e() {
        this.f36663b.mo68219g();
    }

    /* renamed from: f */
    public void mo68431f() {
        this.f36662a.mo71085e();
    }

    /* renamed from: g */
    public void mo68432g() {
        this.f36662a.mo71086f();
    }
}
