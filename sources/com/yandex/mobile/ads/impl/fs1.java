package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.nativeads.C15512n;
import java.lang.ref.WeakReference;

public class fs1 implements os0 {

    /* renamed from: a */
    private final WeakReference<C15512n> f33709a;

    /* renamed from: b */
    private final es1 f33710b = new es1();

    /* renamed from: c */
    private final pr1 f33711c;

    /* renamed from: d */
    private final h41.C13275a f33712d;

    public fs1(C15512n nVar) {
        this.f33709a = new WeakReference<>(nVar);
        this.f33711c = new pr1(nVar.mo64592d());
        this.f33712d = new ks0(nVar.mo64592d());
    }

    /* renamed from: a */
    public void mo67079a(Context context, AdResponse<as0> adResponse) {
        C15512n nVar = (C15512n) this.f33709a.get();
        if (nVar != null) {
            nVar.mo64593e().mo70970b(C15139x2.ADAPTER_LOADING);
            ls0 ls0 = new ls0(adResponse.mo64447z());
            this.f33711c.mo69425a(context, adResponse, this.f33712d);
            this.f33711c.mo69426b(context, adResponse, ls0);
            nVar.mo71710a(adResponse, this.f33710b.mo66871a(adResponse), "Yandex");
        }
    }
}
