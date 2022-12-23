package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class mz0 {

    /* renamed from: a */
    private final C14557s1 f37604a;

    /* renamed from: b */
    private final C12696c3 f37605b;

    /* renamed from: c */
    private final C14735u2 f37606c;

    /* renamed from: d */
    private final C13189gc f37607d;

    /* renamed from: e */
    private final a01 f37608e;

    /* renamed from: f */
    private final r40 f37609f;

    /* renamed from: g */
    private final dn1 f37610g;

    /* renamed from: h */
    private int f37611h = -1;

    /* renamed from: i */
    private int f37612i = -1;

    public mz0(C13189gc gcVar, zz0 zz0, C15029w4 w4Var, bm1 bm1, d60 d60, C14557s1 s1Var) {
        this.f37607d = gcVar;
        a01 d = zz0.mo71287d();
        this.f37608e = d;
        this.f37609f = zz0.mo71286c();
        this.f37606c = w4Var.mo70632a();
        this.f37604a = s1Var;
        this.f37610g = new dn1(d, bm1);
        this.f37605b = new C12696c3(w4Var, d60, bm1);
    }

    /* renamed from: a */
    public void mo68873a() {
        int i;
        Player a = this.f37609f.mo69687a();
        if (this.f37607d.mo67228b() && a != null) {
            this.f37610g.mo66646a(a);
            boolean c = this.f37608e.mo65634c();
            boolean isPlayingAd = a.isPlayingAd();
            int currentAdGroupIndex = a.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = a.getCurrentAdIndexInAdGroup();
            this.f37608e.mo65632a(isPlayingAd);
            if (isPlayingAd) {
                i = currentAdGroupIndex;
            } else {
                i = this.f37611h;
            }
            int i2 = this.f37612i;
            this.f37612i = currentAdIndexInAdGroup;
            this.f37611h = currentAdGroupIndex;
            C14436r2 r2Var = new C14436r2(i, i2);
            VideoAd a2 = this.f37606c.mo70277a(r2Var);
            boolean z = c && (currentAdIndexInAdGroup == -1 || i2 < currentAdIndexInAdGroup);
            if (a2 != null && z) {
                this.f37604a.mo69849a(a2, r2Var);
            }
            this.f37605b.mo66190a(a, c);
        }
    }
}
