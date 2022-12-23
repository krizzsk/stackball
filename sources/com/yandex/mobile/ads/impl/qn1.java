package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;

public class qn1 extends un1<pu0, kj1> {

    /* renamed from: c */
    private final xl1 f39192c;

    /* renamed from: d */
    private final ku0 f39193d;

    /* renamed from: e */
    private final nn1 f39194e = new nn1();

    /* renamed from: f */
    private final on1 f39195f;

    /* renamed from: g */
    private ln1 f39196g;

    public qn1(pu0 pu0, jm1 jm1, C14645t1 t1Var, AdResponse<?> adResponse, sd0 sd0, eu0 eu0) {
        super(pu0);
        Context context = pu0.getContext();
        this.f39192c = new xl1(context, sd0);
        this.f39193d = new ku0(context, this, jm1, t1Var, adResponse, sd0, eu0);
        on1 on1 = new on1();
        this.f39195f = on1;
        sd0.mo69952a((o70) on1);
    }

    /* renamed from: a */
    public void mo65866a(View view) {
        pu0 pu0 = (pu0) view;
        this.f39193d.mo68274a(pu0);
        super.mo65866a(pu0);
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        pu0 pu0 = (pu0) view;
        ck1<fu0> a = ((kj1) obj).mo68242a();
        ln1 a2 = this.f39194e.mo69070a(pu0.getContext(), a, C13156g1.STANDALONE);
        this.f39196g = a2;
        this.f39195f.mo69238a(a2);
        this.f39193d.mo68276a(pu0, a, this.f39196g);
    }

    /* renamed from: a */
    public void mo65867a(C13690k9 k9Var, yn1 yn1, Object obj) {
        kj1 kj1 = (kj1) obj;
        pu0 pu0 = (pu0) mo70379b();
        if (pu0 != null) {
            yn1.mo66921a(k9Var, (View) pu0);
            if (kj1 != null && this.f39196g != null) {
                ck1<fu0> a = kj1.mo68242a();
                yn1.mo66922a(k9Var, this.f39192c.mo70925a(pu0, a.mo66321a()));
                this.f39193d.mo68275a(pu0, a);
            }
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo65825a(View view, Object obj) {
        pu0 pu0 = (pu0) view;
        kj1 kj1 = (kj1) obj;
        return true;
    }

    /* renamed from: a */
    public void mo66668a() {
        ln1 ln1 = this.f39196g;
        if (ln1 != null) {
            ln1.mo65767i();
        }
        this.f39195f.mo69238a((ln1) null);
    }
}
