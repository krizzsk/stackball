package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import java.util.Collections;

public class jk0 {

    /* renamed from: a */
    private final pk0 f35339a = pk0.m40793a();

    /* renamed from: b */
    private final vf0 f35340b;

    /* renamed from: c */
    private final gf0 f35341c;

    /* renamed from: d */
    private final C12948e1 f35342d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ok0 f35343e;

    /* renamed from: f */
    private final uk1 f35344f;

    /* renamed from: com.yandex.mobile.ads.impl.jk0$b */
    private class C13509b implements C13020f1 {
        private C13509b() {
        }

        /* renamed from: c */
        public void mo66903c() {
            jk0.this.f35343e.onInstreamAdBreakCompleted();
        }

        /* renamed from: d */
        public void mo66904d() {
            jk0.this.f35343e.onInstreamAdBreakPrepared();
        }

        /* renamed from: f */
        public void mo66905f() {
            jk0.this.f35343e.onInstreamAdBreakStarted();
        }

        /* renamed from: h */
        public void mo66906h() {
        }

        /* renamed from: i */
        public void mo66907i() {
            jk0.this.f35343e.onInstreamAdBreakError("Ad player returned error");
        }
    }

    public jk0(Context context, og0 og0, gf0 gf0, C13372i1 i1Var, ok0 ok0) {
        this.f35341c = gf0;
        this.f35343e = ok0;
        vf0 vf0 = new vf0();
        this.f35340b = vf0;
        this.f35342d = new C12948e1(context, og0, gf0, new sf0(context, vf0, new qk0(), gf0), vf0, i1Var);
        this.f35344f = new uk1();
    }

    /* renamed from: b */
    public void mo68018b() {
        uf0 a = this.f35340b.mo70480a();
        if ((a == null || a.mo70346b() == null) ? false : true) {
            this.f35342d.mo66727a();
        }
    }

    /* renamed from: c */
    public void mo68019c() {
        this.f35341c.mo67279a();
        this.f35342d.mo66728a((C13020f1) new C13509b());
        this.f35342d.mo66732d();
    }

    /* renamed from: d */
    public void mo68020d() {
        uf0 a = this.f35340b.mo70480a();
        if ((a == null || a.mo70346b() == null) ? false : true) {
            this.f35342d.mo66734g();
        }
    }

    /* renamed from: a */
    public void mo68016a(qk1 qk1) {
        this.f35342d.mo66729a(qk1 != null ? this.f35344f.mo70365a(qk1) : null);
    }

    /* renamed from: a */
    public void mo68015a() {
        this.f35342d.mo66730b();
        this.f35341c.mo67283b();
        this.f35340b.mo70482b();
    }

    /* renamed from: a */
    public void mo68017a(InstreamAdView instreamAdView) {
        jk0 a = this.f35339a.mo69375a(instreamAdView);
        if (!equals(a)) {
            if (a != null) {
                a.f35342d.mo66731c();
                a.f35340b.mo70482b();
            }
            if (this.f35339a.mo69377a(this)) {
                this.f35342d.mo66731c();
                this.f35340b.mo70482b();
            }
            this.f35339a.mo69376a(instreamAdView, this);
        }
        this.f35340b.mo70481a(instreamAdView, Collections.emptyList());
        this.f35341c.mo67279a();
        this.f35342d.mo66735h();
    }
}
