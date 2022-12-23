package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

class un0 {

    /* renamed from: a */
    private final Context f40808a;

    /* renamed from: b */
    private final C13372i1 f40809b;

    /* renamed from: c */
    private final gf0 f40810c;

    /* renamed from: d */
    private final sf0 f40811d;

    /* renamed from: e */
    private final vf0 f40812e;

    /* renamed from: f */
    private final oj1 f40813f;

    /* renamed from: g */
    private final Map<og0, C12948e1> f40814g = new HashMap();

    un0(Context context, C13372i1 i1Var, gf0 gf0, sf0 sf0, vf0 vf0, oj1 oj1) {
        this.f40808a = context.getApplicationContext();
        this.f40809b = i1Var;
        this.f40810c = gf0;
        this.f40811d = sf0;
        this.f40812e = vf0;
        this.f40813f = oj1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12948e1 mo70378a(og0 og0) {
        C12948e1 e1Var = this.f40814g.get(og0);
        if (e1Var != null) {
            return e1Var;
        }
        C12948e1 e1Var2 = new C12948e1(this.f40808a, og0, this.f40810c, this.f40811d, this.f40812e, this.f40809b);
        e1Var2.mo66729a(this.f40813f);
        this.f40814g.put(og0, e1Var2);
        return e1Var2;
    }
}
