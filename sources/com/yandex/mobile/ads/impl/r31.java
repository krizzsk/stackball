package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import java.util.List;

public class r31 {

    /* renamed from: a */
    private final C12356a5 f39356a;

    /* renamed from: b */
    private final q31 f39357b;

    /* renamed from: c */
    private final List<String> f39358c;

    public r31(Context context, AdResponse adResponse, C14645t1 t1Var, List<String> list) {
        this.f39358c = list;
        this.f39356a = new C12356a5(context, t1Var);
        this.f39357b = new q31(context, t1Var, adResponse);
    }

    /* renamed from: a */
    public void mo69685a(h41.C13275a aVar) {
        this.f39357b.mo69476a(aVar);
    }

    /* renamed from: a */
    public void mo69684a() {
        List<String> list = this.f39358c;
        if (list != null) {
            for (String a : list) {
                this.f39356a.mo65674a(a);
            }
        }
        this.f39357b.mo69475a();
    }
}
