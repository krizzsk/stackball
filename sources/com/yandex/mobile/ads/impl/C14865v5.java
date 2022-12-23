package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C3716C;

/* renamed from: com.yandex.mobile.ads.impl.v5 */
public class C14865v5 {

    /* renamed from: a */
    private final C12952e3 f41185a;

    /* renamed from: b */
    private final C13189gc f41186b;

    /* renamed from: c */
    private final cm1 f41187c;

    /* renamed from: d */
    private final u01 f41188d;

    /* renamed from: e */
    private boolean f41189e;

    public C14865v5(C13189gc gcVar, C12952e3 e3Var, cm1 cm1, u01 u01) {
        this.f41186b = gcVar;
        this.f41185a = e3Var;
        this.f41187c = cm1;
        this.f41188d = u01;
    }

    /* renamed from: a */
    public void mo70446a() {
        t01 b;
        C12965ec a = this.f41186b.mo67226a();
        if (a != null && (b = this.f41188d.mo70264b()) != null) {
            this.f41189e = true;
            int adGroupIndexForPositionUs = this.f41185a.mo66746a().getAdGroupIndexForPositionUs(C3716C.msToUs(((xz0) b).mo70951a()), C3716C.msToUs(this.f41187c.mo66332a()));
            if (adGroupIndexForPositionUs == -1) {
                a.mo66797a();
            } else if (adGroupIndexForPositionUs == this.f41185a.mo66746a().adGroupTimesUs.length) {
                this.f41186b.mo67229c();
            } else {
                a.mo66797a();
            }
        }
    }

    /* renamed from: b */
    public boolean mo70447b() {
        return this.f41189e;
    }
}
