package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C14662tb;

public abstract class ne1<R, T> extends C14662tb<T> {

    /* renamed from: s */
    private final R f37797s;

    /* renamed from: t */
    private final w41<R, T> f37798t;

    /* renamed from: u */
    private final sn0 f37799u;

    public ne1(Context context, int i, String str, C14662tb.C14663a<T> aVar, R r, w41<R, T> w41) {
        super(i, str, aVar);
        this.f37797s = r;
        this.f37798t = w41;
        this.f37799u = sn0.m42091b(context);
        m40024a(context);
        m40025r();
    }

    /* renamed from: r */
    private void m40025r() {
        this.f37799u.mo70035a(this.f37798t.mo66663a(this.f37797s));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c51<T> mo66994a(fv0 fv0) {
        int i = fv0.f33755a;
        c51<T> a = mo67765a(fv0, i);
        h41 a2 = this.f37798t.mo66662a(a, i, this.f37797s);
        new i41(a2.mo67412a()).mo67731a("server_log_id", fv0.f33757c.get(wb0.YMAD_SERVER_LOG_ID.mo70671a()));
        this.f37799u.mo70035a(a2);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract c51<T> mo67765a(fv0 fv0, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public op1 mo67425b(op1 op1) {
        fv0 fv0 = op1.f38296b;
        this.f37799u.mo70035a(this.f37798t.mo66662a((c51) null, fv0 != null ? fv0.f33755a : -1, this.f37797s));
        return op1;
    }

    /* renamed from: a */
    private void m40024a(Context context) {
        mo68330a(new C12353a4().mo65666a(context));
    }
}
