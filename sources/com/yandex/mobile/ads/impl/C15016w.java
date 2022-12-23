package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.h41;

/* renamed from: com.yandex.mobile.ads.impl.w */
public class C15016w {

    /* renamed from: a */
    private final Context f41821a;

    /* renamed from: b */
    private final C14645t1 f41822b;

    /* renamed from: c */
    private final C15126x f41823c;

    /* renamed from: d */
    private C14857v f41824d;

    public C15016w(Context context, C14645t1 t1Var, C15126x xVar) {
        this.f41821a = context.getApplicationContext();
        this.f41822b = t1Var;
        this.f41823c = xVar;
    }

    /* renamed from: a */
    public void mo70605a(FalseClick falseClick) {
        this.f41824d = new C14857v(this.f41821a, this.f41822b, this.f41823c, falseClick);
    }

    /* renamed from: b */
    public void mo70607b() {
        C14857v vVar = this.f41824d;
        if (vVar != null) {
            vVar.mo70426b();
        }
    }

    /* renamed from: c */
    public void mo70608c() {
        C14857v vVar = this.f41824d;
        if (vVar != null) {
            vVar.mo70427c();
        }
    }

    /* renamed from: d */
    public void mo70609d() {
        C14857v vVar = this.f41824d;
        if (vVar != null) {
            vVar.mo70429e();
        }
    }

    /* renamed from: e */
    public void mo70610e() {
        C14857v vVar = this.f41824d;
        if (vVar != null) {
            vVar.mo70430f();
        }
    }

    /* renamed from: f */
    public void mo70611f() {
        C14857v vVar = this.f41824d;
        if (vVar != null) {
            vVar.mo70431g();
        }
    }

    /* renamed from: a */
    public void mo70604a() {
        C14857v vVar = this.f41824d;
        if (vVar != null) {
            vVar.mo70424a();
        }
    }

    /* renamed from: a */
    public void mo70606a(h41.C13275a aVar) {
        C14857v vVar = this.f41824d;
        if (vVar != null) {
            vVar.mo70425a(aVar);
        }
    }
}
