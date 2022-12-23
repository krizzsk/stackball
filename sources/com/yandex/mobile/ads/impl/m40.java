package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.exo.C12266p;

public class m40 {

    /* renamed from: a */
    private final Context f37186a;

    /* renamed from: b */
    private final C14645t1 f37187b;

    /* renamed from: c */
    private final AdResponse f37188c;

    public m40(Context context, C14645t1 t1Var, AdResponse adResponse) {
        this.f37186a = context.getApplicationContext();
        this.f37187b = t1Var;
        this.f37188c = adResponse;
    }

    /* renamed from: a */
    public w40 mo68560a() {
        Context context = this.f37186a;
        return new w40(new C12266p.C12268b(context, new C14467rk(context)).mo65161a(), new am0(this.f37186a), new tm1(this.f37186a, this.f37187b, this.f37188c));
    }
}
