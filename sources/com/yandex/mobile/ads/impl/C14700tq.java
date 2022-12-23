package com.yandex.mobile.ads.impl;

import android.view.View;

/* renamed from: com.yandex.mobile.ads.impl.tq */
public class C14700tq implements C15202xq {

    /* renamed from: a */
    private final C15202xq[] f40418a;

    public C14700tq(C15202xq... xqVarArr) {
        this.f40418a = xqVarArr;
    }

    /* renamed from: a */
    public View mo70215a(C14406qq qqVar, C13513jm jmVar) {
        String str = qqVar.f39250h;
        for (C15202xq xqVar : this.f40418a) {
            if (xqVar.mo70218a(str)) {
                return xqVar.mo70215a(qqVar, jmVar);
            }
        }
        return new View(jmVar.getContext());
    }

    /* renamed from: a */
    public void mo70216a(View view, C14406qq qqVar) {
    }

    /* renamed from: a */
    public void mo70217a(View view, C14406qq qqVar, C13513jm jmVar) {
    }

    /* renamed from: a */
    public boolean mo70218a(String str) {
        for (C15202xq a : this.f40418a) {
            if (a.mo70218a(str)) {
                return true;
            }
        }
        return false;
    }
}
