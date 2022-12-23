package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.bk1;
import com.yandex.mobile.ads.impl.gf0;
import com.yandex.mobile.ads.impl.ng0;
import com.yandex.mobile.ads.impl.oj1;
import com.yandex.mobile.ads.impl.vf0;
import com.yandex.mobile.ads.impl.xg0;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.instream.c */
class C15417c {

    /* renamed from: a */
    private final gf0 f43552a;

    /* renamed from: b */
    private final vf0 f43553b;

    /* renamed from: c */
    private final C15419e f43554c;

    /* renamed from: d */
    private final C15412b f43555d;

    C15417c(Context context, ng0 ng0, gf0 gf0, C15419e eVar) {
        this.f43552a = gf0;
        this.f43554c = eVar;
        vf0 vf0 = new vf0();
        this.f43553b = vf0;
        this.f43555d = new C15412b(context, ng0, gf0, vf0, eVar);
    }

    /* renamed from: a */
    public void mo71328a(xg0 xg0) {
        this.f43555d.mo71316a(xg0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71330b() {
        this.f43555d.mo71319e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo71331c() {
        this.f43552a.mo67279a();
        this.f43555d.mo71323i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo71332d() {
        this.f43555d.mo71325k();
        this.f43553b.mo70482b();
    }

    /* renamed from: a */
    public void mo71327a(oj1 oj1) {
        this.f43555d.mo71315a(oj1);
    }

    /* renamed from: a */
    public void mo71329a(InstreamAdView instreamAdView, List<bk1> list) {
        this.f43553b.mo70481a(instreamAdView, list);
        this.f43552a.mo67279a();
        this.f43554c.mo71347g();
        this.f43555d.mo71314a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71326a() {
        this.f43555d.mo71318d();
    }
}
