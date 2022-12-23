package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

public class iu0 {

    /* renamed from: a */
    private final qn1 f35035a;

    /* renamed from: b */
    private final jm1 f35036b;

    /* renamed from: c */
    private final C14645t1 f35037c;

    /* renamed from: d */
    private final AdResponse<?> f35038d;

    /* renamed from: e */
    private final gm1 f35039e;

    /* renamed from: f */
    private final eu0 f35040f;

    public iu0(qn1 qn1, jm1 jm1, C14645t1 t1Var, AdResponse<?> adResponse, gm1 gm1, eu0 eu0) {
        this.f35035a = qn1;
        this.f35036b = jm1;
        this.f35037c = t1Var;
        this.f35038d = adResponse;
        this.f35039e = gm1;
        this.f35040f = eu0;
    }

    /* renamed from: a */
    public hu0 mo67894a(Context context, st0 st0, ck1<fu0> ck1, ln1 ln1) {
        return new hu0(context, st0, ck1, this.f35036b, this.f35035a, new tk1(this.f35037c, this.f35038d), ln1, this.f35039e, this.f35040f);
    }
}
