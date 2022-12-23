package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.h41;

public class yh1<T> {

    /* renamed from: a */
    private final wk1<T> f42860a;

    /* renamed from: b */
    private final ck1<T> f42861b;

    /* renamed from: c */
    private final C15230y2 f42862c;

    /* renamed from: d */
    private final gl1 f42863d;

    /* renamed from: e */
    private final fl1 f42864e;

    /* renamed from: f */
    private final lk1<T> f42865f;

    /* renamed from: g */
    private final ll1 f42866g;

    /* renamed from: h */
    private final ln1 f42867h;

    /* renamed from: i */
    private final rn1 f42868i;

    public yh1(Context context, wk1<T> wk1, rn1 rn1, ck1<T> ck1, ym1 ym1, ll1 ll1, ln1 ln1, cl1 cl1, mk1<T> mk1) {
        wk1<T> wk12 = wk1;
        cl1 cl12 = cl1;
        this.f42860a = wk12;
        ck1<T> ck12 = ck1;
        this.f42861b = ck12;
        this.f42866g = ll1;
        this.f42867h = ln1;
        this.f42868i = rn1;
        Context context2 = context;
        ck1<T> ck13 = ck1;
        ll1 ll12 = ll1;
        new el1(context2, ck13, rn1, ll12, ln1, mk1).mo66844a(cl12);
        C15230y2 y2Var = new C15230y2();
        this.f42862c = y2Var;
        fl1 fl1 = new fl1(wk12, cl12);
        this.f42864e = fl1;
        gl1 gl1 = new gl1(context2, ck13, y2Var, ll12, rn1, ym1, ln1);
        this.f42863d = gl1;
        this.f42865f = new lk1(ck12, wk12, rn1, fl1, gl1, ll1, y2Var, ln1, mk1);
    }

    /* renamed from: a */
    public void mo71080a(h41.C13275a aVar) {
        this.f42863d.mo67321a(aVar);
    }

    /* renamed from: b */
    public void mo71082b(h41.C13275a aVar) {
        this.f42863d.mo67323b(aVar);
    }

    /* renamed from: c */
    public void mo71083c() {
        this.f42860a.mo68217e();
    }

    /* renamed from: d */
    public void mo71084d() {
        this.f42860a.mo68213a((yk1) this.f42865f);
        this.f42860a.mo68212a(this.f42861b);
        this.f42862c.mo70970b(C15139x2.VIDEO_AD_PREPARE);
        View a = this.f42868i.mo69797a();
        if (a != null) {
            this.f42867h.mo65756a(a, this.f42868i.mo69798b());
        }
        this.f42863d.mo67327f();
        this.f42866g.mo68489b(kl1.PREPARING);
    }

    /* renamed from: e */
    public void mo71085e() {
        this.f42860a.mo68218f();
    }

    /* renamed from: f */
    public void mo71086f() {
        this.f42860a.mo68216d();
    }

    /* renamed from: a */
    public void mo71079a() {
        this.f42864e.mo67032b();
        this.f42860a.mo68213a((yk1) null);
        this.f42866g.mo68488b();
        this.f42863d.mo67326e();
        this.f42862c.mo70964a();
    }

    /* renamed from: b */
    public void mo71081b() {
        this.f42864e.mo67032b();
        this.f42860a.mo68210a();
    }
}
