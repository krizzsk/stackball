package com.yandex.mobile.ads.impl;

public class z31 {

    /* renamed from: a */
    private final qn1 f43011a;

    /* renamed from: b */
    private final C13486jc f43012b = new C13486jc();

    /* renamed from: c */
    private final b41 f43013c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final x31 f43014d;

    public z31(qn1 qn1, f41 f41) {
        this.f43011a = qn1;
        this.f43013c = new b41(qn1, f41);
        this.f43014d = new x31();
    }

    /* renamed from: a */
    public void mo71151a() {
        pu0 pu0 = (pu0) this.f43011a.mo70379b();
        if (pu0 != null) {
            a41 b = pu0.mo69436a().mo69648b();
            this.f43013c.mo65967a(b);
            this.f43012b.mo67963a(pu0.mo69438c().getBitmap(), new y31(this, pu0, b));
        }
    }
}
