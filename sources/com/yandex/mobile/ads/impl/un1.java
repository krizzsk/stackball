package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.ref.WeakReference;

public abstract class un1<V extends View, T> {

    /* renamed from: a */
    private final WeakReference<V> f40815a;

    /* renamed from: b */
    private final wn1 f40816b;

    public un1(V v) {
        this.f40815a = new WeakReference<>(v);
        this.f40816b = new wn1(v.getContext());
    }

    /* renamed from: a */
    public void mo66668a() {
    }

    /* renamed from: a */
    public void mo65866a(V v) {
        v.setVisibility(8);
        v.setOnClickListener((View.OnClickListener) null);
        v.setOnTouchListener((View.OnTouchListener) null);
        v.setSelected(false);
    }

    /* renamed from: a */
    public abstract boolean mo65825a(V v, T t);

    /* renamed from: b */
    public V mo70379b() {
        return (View) this.f40815a.get();
    }

    /* renamed from: b */
    public abstract void mo65826b(V v, T t);

    /* renamed from: c */
    public boolean mo70380c() {
        View b = mo70379b();
        if (b == null || lo1.m38874d(b)) {
            return false;
        }
        if (!(b.getWidth() < 1 || b.getHeight() < 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo70381d() {
        return mo70379b() != null;
    }

    /* renamed from: a */
    public void mo65867a(C13690k9 k9Var, yn1 yn1, T t) {
        View b = mo70379b();
        if (b != null) {
            yn1.mo66921a(k9Var, b);
            yn1.mo66922a(k9Var, this.f40816b.mo70734a(b));
        }
    }
}
