package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.List;

public class ab0 {

    /* renamed from: a */
    private final C12356a5 f30496a;

    public ab0(Context context, C14645t1 t1Var) {
        this.f30496a = new C12356a5(context, t1Var);
    }

    /* renamed from: a */
    public void mo65717a(String str, AdResponse adResponse, wc1 wc1) {
        List<String> q = adResponse.mo64437q();
        if (q != null) {
            for (String a : q) {
                this.f30496a.mo65674a(a);
            }
        }
        this.f30496a.mo65675a(str, adResponse, wc1);
    }
}
