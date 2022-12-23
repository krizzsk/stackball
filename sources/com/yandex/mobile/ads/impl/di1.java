package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

public class di1 implements r41<ci1> {

    /* renamed from: a */
    private final ki1 f32588a;

    /* renamed from: b */
    private final rl1 f32589b;

    /* renamed from: c */
    private final C15230y2 f32590c;

    /* renamed from: d */
    private final r41<ci1> f32591d;

    di1(Context context, ki1 ki1, C15230y2 y2Var, ai1 ai1, r41<ci1> r41) {
        this.f32588a = ki1;
        this.f32590c = y2Var;
        this.f32591d = r41;
        this.f32589b = new rl1(context, ai1);
    }

    /* renamed from: a */
    static void m35299a(di1 di1) {
        di1.getClass();
        di1.f32590c.mo70967a(C15139x2.VAST_LOADING, new ii1("success", (wj1) null), di1.f32588a);
    }

    /* renamed from: a */
    static void m35300a(di1 di1, wj1 wj1) {
        di1.getClass();
        di1.f32590c.mo70967a(C15139x2.VAST_LOADING, new ii1("error", wj1), di1.f32588a);
    }

    /* renamed from: com.yandex.mobile.ads.impl.di1$a */
    class C12892a implements r41<List<lj1>> {

        /* renamed from: a */
        private final ci1 f32592a;

        /* renamed from: b */
        private final r41<ci1> f32593b;

        C12892a(ci1 ci1, r41<ci1> r41) {
            this.f32592a = ci1;
            this.f32593b = r41;
        }

        /* renamed from: a */
        public void mo66590a(Object obj) {
            di1.m35299a(di1.this);
            this.f32593b.mo66590a(new ci1(new xh1(this.f32592a.mo66309b().mo70897a(), (List) obj), this.f32592a.mo66308a()));
        }

        /* renamed from: a */
        public void mo66589a(wj1 wj1) {
            di1.m35300a(di1.this, wj1);
            this.f32593b.mo66589a(wj1);
        }
    }

    /* renamed from: a */
    public void mo66590a(Object obj) {
        ci1 ci1 = (ci1) obj;
        this.f32589b.mo69783a(ci1.mo66309b().mo70898b(), new C12892a(ci1, this.f32591d));
    }

    /* renamed from: a */
    public void mo66589a(wj1 wj1) {
        this.f32590c.mo70967a(C15139x2.VAST_LOADING, new ii1("error", wj1), this.f32588a);
        this.f32591d.mo66589a(wj1);
    }
}
