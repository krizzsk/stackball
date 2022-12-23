package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.C15418d;
import com.yandex.mobile.ads.instream.C15419e;

public class oz0 {

    /* renamed from: a */
    private final lf0 f38419a;

    /* renamed from: b */
    private final nz0 f38420b;

    /* renamed from: c */
    private C13679k4 f38421c;

    /* renamed from: d */
    private C13679k4 f38422d;

    /* renamed from: e */
    private C13679k4 f38423e;

    public oz0(Context context, ng0 ng0, gf0 gf0, vf0 vf0, C15419e eVar, C15418d dVar) {
        lf0 lf0 = new lf0(ng0, eVar);
        this.f38419a = lf0;
        this.f38420b = new nz0(context, gf0, eVar, dVar, vf0, lf0);
    }

    /* renamed from: a */
    public C13679k4 mo69286a() {
        if (this.f38422d == null) {
            this.f38422d = this.f38420b.mo69090a(this.f38419a.mo68417a());
        }
        return this.f38422d;
    }

    /* renamed from: b */
    public C13679k4 mo69287b() {
        og0 b;
        if (this.f38423e == null && (b = this.f38419a.mo68417a().mo67985b()) != null) {
            this.f38423e = this.f38420b.mo69089a(b);
        }
        return this.f38423e;
    }

    /* renamed from: c */
    public C13679k4 mo69288c() {
        og0 c;
        if (this.f38421c == null && (c = this.f38419a.mo68417a().mo67986c()) != null) {
            this.f38421c = this.f38420b.mo69089a(c);
        }
        return this.f38421c;
    }
}
