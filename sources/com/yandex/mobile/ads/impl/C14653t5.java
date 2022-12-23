package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;

/* renamed from: com.yandex.mobile.ads.impl.t5 */
public class C14653t5 {

    /* renamed from: a */
    private final Context f40234a;

    /* renamed from: b */
    private final InstreamAdRequestConfiguration f40235b;

    /* renamed from: c */
    private final C13273h3 f40236c = new C13273h3();

    /* renamed from: d */
    private final qm1 f40237d = new qm1();

    /* renamed from: e */
    private final p40 f40238e = new p40();

    public C14653t5(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f40234a = context.getApplicationContext();
        this.f40235b = instreamAdRequestConfiguration;
    }

    /* renamed from: a */
    public wf0 mo70128a() {
        oj0 oj0 = new oj0(this.f40234a, this.f40235b);
        C15029w4 w4Var = new C15029w4();
        zz0 zz0 = new zz0();
        cm1 a = zz0.mo71284a();
        r40 c = zz0.mo71286c();
        u01 u01 = new u01();
        C13472j3 j3Var = new C13472j3(new C14864v4(new d60(u01, a)));
        rm1 rm1 = new rm1();
        C13189gc gcVar = new C13189gc();
        this.f40238e.getClass();
        C15146x4 b = w4Var.mo70633b();
        C12952e3 c2 = w4Var.mo70634c();
        r40 c3 = zz0.mo71286c();
        cm1 a2 = zz0.mo71284a();
        C14557s1 s1Var = new C14557s1(gcVar, w4Var, zz0, j3Var);
        bm1 bm1 = new bm1(c2, a2, u01, rm1);
        yz0 yz0 = new yz0(b, s1Var, bm1, j3Var);
        oj0 oj02 = oj0;
        r40 r40 = c;
        rm1 rm12 = rm1;
        yz0 yz02 = yz0;
        bm1 bm12 = bm1;
        zz0 zz02 = zz0;
        C13472j3 j3Var2 = j3Var;
        C15029w4 w4Var2 = w4Var;
        C12952e3 e3Var = c2;
        C13189gc gcVar2 = gcVar;
        mz0 mz0 = new mz0(gcVar, zz02, w4Var, bm12, new d60(u01, a2), s1Var);
        Player.Listener o40 = new o40(gcVar2, c3, new uz0(c2, u01, a2, yz0), yz02, new wz0(b, j3Var), new xd1(e3Var, zz0, new C14865v5(gcVar2, e3Var, a2, u01), mz0), mz0);
        C13025f3 f3Var = new C13025f3(a);
        this.f40236c.getClass();
        C15146x4 b2 = w4Var2.mo70633b();
        C12952e3 c4 = w4Var2.mo70634c();
        cm1 a3 = zz0.mo71284a();
        r40 c5 = zz0.mo71286c();
        m11 m11 = new m11(new C14052n3(b2, zz0));
        c5.mo69689a((b01) m11);
        C12847d2 d2Var = new C12847d2(a3, c4);
        C15029w4 w4Var3 = w4Var2;
        C13472j3 j3Var3 = j3Var2;
        h40 h40 = new h40(b2, zz02, m11, new C13829l3(w4Var3, d2Var), new C13678k3(w4Var3, zz0, j3Var3), j3Var3);
        this.f40237d.getClass();
        C15146x4 b3 = w4Var3.mo70633b();
        r40 c6 = zz0.mo71286c();
        m11 m112 = new m11(new xm1(b3, zz0, u01));
        c6.mo69689a((b01) m112);
        return new wf0(w4Var3, f3Var, new C13042fc(this.f40234a, h40, new rs1(m112, zz0.mo71288e(), rm12)), gcVar2, oj02, zz0, new l40(gcVar2, w4Var3, j3Var3, r40), u01, o40);
    }
}
