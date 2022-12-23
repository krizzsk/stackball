package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.C15419e;

public class lf0 {

    /* renamed from: a */
    private final ng0 f36654a;

    /* renamed from: b */
    private final kf0 f36655b;

    /* renamed from: c */
    private jf0 f36656c;

    public lf0(ng0 ng0, C15419e eVar) {
        this.f36654a = ng0;
        this.f36655b = new kf0(eVar);
    }

    /* renamed from: a */
    public jf0 mo68417a() {
        if (this.f36656c == null) {
            this.f36656c = this.f36655b.mo68205a(this.f36654a.getAdBreaks());
        }
        return this.f36656c;
    }
}
