package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;

public class z70 {

    /* renamed from: a */
    private final Context f43034a;

    /* renamed from: b */
    private final C14645t1 f43035b;

    /* renamed from: c */
    private final AdResponse<String> f43036c;

    /* renamed from: d */
    private final String f43037d;

    /* renamed from: e */
    private final n80 f43038e;

    /* renamed from: f */
    private final j80 f43039f;

    /* renamed from: g */
    private final k80 f43040g;

    /* renamed from: h */
    private final x70 f43041h;

    /* renamed from: i */
    private final i80 f43042i = m44488c();

    /* renamed from: j */
    private final C15050wh f43043j;

    /* renamed from: k */
    private final b80 f43044k;

    /* renamed from: l */
    private final View f43045l;

    public z70(Context context, C14645t1 t1Var, AdResponse<String> adResponse, String str, AdResultReceiver adResultReceiver) {
        Context applicationContext = context.getApplicationContext();
        this.f43034a = applicationContext;
        this.f43035b = t1Var;
        this.f43036c = adResponse;
        this.f43037d = str;
        n80 b = m44487b();
        this.f43038e = b;
        j80 j80 = new j80(applicationContext, t1Var, adResponse, adResultReceiver);
        this.f43039f = j80;
        this.f43040g = new k80(applicationContext, t1Var, adResponse, adResultReceiver);
        x70 x70 = new x70();
        this.f43041h = x70;
        C15050wh a = m44486a();
        this.f43043j = a;
        b80 b80 = new b80(a);
        this.f43044k = b80;
        x70.mo70841a((ch1) b80);
        j80.mo67943a((xe1) b80);
        this.f43045l = a.mo66214a(b, adResponse);
    }

    /* renamed from: a */
    private C15050wh m44486a() {
        boolean a = new zo0().mo71268a(this.f43037d);
        View a2 = C13027f4.m35890a(this.f43034a);
        a2.setOnClickListener(new C14276pf(this.f43041h, this.f43042i));
        return new C15172xh().mo70896a(a2, this.f43036c, a, this.f43036c.mo64417H());
    }

    /* renamed from: b */
    private n80 m44487b() {
        Context context = this.f43034a;
        AdResponse<String> adResponse = this.f43036c;
        C14645t1 t1Var = this.f43035b;
        Context applicationContext = context.getApplicationContext();
        n80 n80 = new n80(applicationContext, adResponse, t1Var);
        n80.setId(2);
        int b = adResponse.mo64421b(applicationContext);
        int a = adResponse.mo64420a(applicationContext);
        if (b > 0 && a > 0) {
            n80.layout(0, 0, b, a);
        }
        return n80;
    }

    /* renamed from: c */
    private i80 m44488c() {
        eb0 a = fb0.m35946a().mo66950a(new zo0().mo71268a(this.f43037d));
        n80 n80 = this.f43038e;
        j80 j80 = this.f43039f;
        k80 k80 = this.f43040g;
        return a.mo66657a(n80, j80, k80, this.f43041h, k80);
    }

    /* renamed from: d */
    public void mo71165d() {
        this.f43041h.mo70842a((C14384qh) null);
        this.f43039f.mo67942a((C14892vh) null);
        this.f43042i.mo66544c();
        this.f43043j.mo66219c();
    }

    /* renamed from: e */
    public a80 mo71166e() {
        return this.f43044k.mo66017a();
    }

    /* renamed from: f */
    public void mo71167f() {
        this.f43043j.mo66218b();
        this.f43038e.mo64618e();
    }

    /* renamed from: g */
    public void mo71168g() {
        this.f43042i.mo66543a(this.f43037d);
    }

    /* renamed from: h */
    public void mo71169h() {
        this.f43038e.mo64619f();
        this.f43043j.mo66215a();
    }

    /* renamed from: a */
    public void mo71163a(C14384qh qhVar) {
        this.f43041h.mo70842a(qhVar);
    }

    /* renamed from: a */
    public void mo71164a(C14892vh vhVar) {
        this.f43039f.mo67942a(vhVar);
    }

    /* renamed from: a */
    public void mo71162a(RelativeLayout relativeLayout) {
        this.f43043j.mo66216a(relativeLayout);
        relativeLayout.addView(this.f43045l);
        this.f43043j.mo66220d();
    }
}
