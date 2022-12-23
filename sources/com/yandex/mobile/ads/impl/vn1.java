package com.yandex.mobile.ads.impl;

import android.view.View;

public class vn1<V extends View, T> {

    /* renamed from: a */
    private final un1<V, T> f41340a;

    vn1(un1<V, T> un1) {
        this.f41340a = un1;
    }

    /* renamed from: a */
    public void mo70504a() {
        V b = this.f41340a.mo70379b();
        if (b != null) {
            this.f41340a.mo65866a(b);
        }
    }

    /* renamed from: b */
    public void mo70508b(T t) {
        V b = this.f41340a.mo70379b();
        if (b != null) {
            this.f41340a.mo65826b(b, t);
            b.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70505a(C13690k9 k9Var, yn1 yn1, T t) {
        if (this.f41340a.mo70379b() != null) {
            this.f41340a.mo65867a(k9Var, yn1, t);
        }
    }

    /* renamed from: b */
    public void mo70507b() {
        this.f41340a.mo66668a();
    }

    /* renamed from: a */
    public boolean mo70506a(T t) {
        V b = this.f41340a.mo70379b();
        return b != null && this.f41340a.mo65825a(b, t);
    }
}
