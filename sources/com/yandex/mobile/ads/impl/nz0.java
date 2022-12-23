package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.C15418d;
import com.yandex.mobile.ads.instream.C15419e;

class nz0 {

    /* renamed from: a */
    private final Context f38029a;

    /* renamed from: b */
    private final gf0 f38030b;

    /* renamed from: c */
    private final C15419e f38031c;

    /* renamed from: d */
    private final vf0 f38032d;

    /* renamed from: e */
    private final sf0 f38033e;

    /* renamed from: f */
    private final C15418d f38034f;

    /* renamed from: g */
    private final C13465j1 f38035g;

    nz0(Context context, gf0 gf0, C15419e eVar, C15418d dVar, vf0 vf0, lf0 lf0) {
        Context applicationContext = context.getApplicationContext();
        this.f38029a = applicationContext;
        this.f38030b = gf0;
        this.f38031c = eVar;
        this.f38032d = vf0;
        this.f38034f = dVar;
        this.f38033e = new sf0(applicationContext, vf0, eVar, gf0);
        this.f38035g = new C13465j1(lf0);
    }

    /* renamed from: a */
    public u81 mo69089a(og0 og0) {
        return new u81(this.f38029a, og0, this.f38030b, this.f38033e, this.f38032d, this.f38035g.mo67912a());
    }

    /* renamed from: a */
    public vn0 mo69090a(jf0 jf0) {
        return new vn0(this.f38029a, jf0, this.f38035g.mo67912a(), this.f38030b, this.f38033e, this.f38032d, this.f38031c, this.f38034f);
    }
}
