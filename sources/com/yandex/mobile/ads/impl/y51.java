package com.yandex.mobile.ads.impl;

import android.content.Context;

public class y51 implements C14384qh, u51 {

    /* renamed from: a */
    private final Context f42777a;

    /* renamed from: b */
    private final C14384qh f42778b;

    /* renamed from: c */
    private final C12382ag f42779c;

    /* renamed from: d */
    private boolean f42780d;

    public y51(Context context, C12382ag agVar, C14384qh qhVar) {
        this.f42777a = context;
        this.f42778b = qhVar;
        this.f42779c = agVar;
    }

    /* renamed from: b */
    public void mo69496b() {
        this.f42780d = true;
        this.f42779c.mo65751a();
    }

    /* renamed from: g */
    public void mo67136g() {
        if (this.f42780d) {
            this.f42778b.mo67136g();
        } else {
            this.f42779c.mo65752a(this.f42777a);
        }
    }
}
