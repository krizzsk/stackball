package com.yandex.mobile.ads.impl;

import android.view.View;

/* renamed from: com.yandex.mobile.ads.impl.yj */
public class C15254yj<V extends View, T> implements C13838l9<T> {

    /* renamed from: a */
    private final un1<V, T> f42874a;

    public C15254yj(un1<V, T> un1) {
        this.f42874a = un1;
    }

    /* renamed from: a */
    public void mo67817a() {
        V b = this.f42874a.mo70379b();
        if (b != null) {
            this.f42874a.mo65866a(b);
        }
    }

    /* renamed from: b */
    public boolean mo67821b() {
        return this.f42874a.mo70381d();
    }

    /* renamed from: c */
    public void mo67823c(T t) {
        V b = this.f42874a.mo70379b();
        if (b != null) {
            this.f42874a.mo65826b(b, t);
            b.setVisibility(0);
        }
    }

    /* renamed from: d */
    public boolean mo67824d() {
        return this.f42874a.mo70380c();
    }

    public void destroy() {
    }

    /* renamed from: a */
    public void mo67818a(C13690k9<T> k9Var, yn1 yn1) {
        this.f42874a.mo65867a(k9Var, yn1, k9Var.mo68169d());
    }

    /* renamed from: a */
    public boolean mo67820a(T t) {
        V b = this.f42874a.mo70379b();
        return b != null && this.f42874a.mo65825a(b, t);
    }

    /* renamed from: c */
    public io1 mo67822c() {
        V b = this.f42874a.mo70379b();
        if (b != null) {
            return new io1(b);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo67819a(int i) {
        return lo1.m38868a((View) this.f42874a.mo70379b(), i);
    }
}
