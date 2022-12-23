package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

public class hx0 {

    /* renamed from: a */
    private final Context f34639a;

    /* renamed from: b */
    private final AdResponse<String> f34640b;

    /* renamed from: c */
    private final C13371i0 f34641c;

    public hx0(Context context, AdResponse<String> adResponse, C13371i0 i0Var) {
        this.f34639a = context.getApplicationContext();
        this.f34640b = adResponse;
        this.f34641c = i0Var;
    }

    /* renamed from: a */
    public void mo67702a() {
        if (!this.f34640b.mo64417H()) {
            new z60(this.f34639a, this.f34640b.mo64413D(), this.f34641c).mo71159a();
        }
    }
}
