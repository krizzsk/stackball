package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.nativeads.C15501j;
import com.yandex.mobile.ads.nativeads.C15550v;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.p */
public class C14239p {

    /* renamed from: a */
    private final C13663k f38424a;

    public C14239p(C14645t1 t1Var, AdResponse adResponse, k41 k41, fx0 fx0, C15550v vVar, C15501j jVar, h41.C13275a aVar) {
        this.f38424a = new C13663k(t1Var, adResponse, k41, fx0, vVar, jVar, aVar);
    }

    /* renamed from: a */
    public void mo69289a(View view, List<C13370i> list) {
        if (list != null && !list.isEmpty()) {
            for (C13370i next : list) {
                C13462j a = this.f38424a.mo68111a(view.getContext(), next);
                if (a != null) {
                    a.mo66948a(view, next);
                }
            }
        }
    }
}
