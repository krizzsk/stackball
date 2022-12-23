package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.banner.C12072b;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import java.lang.ref.WeakReference;

public class qr1 implements C12866db {

    /* renamed from: a */
    private final WeakReference<C12072b> f39273a;

    /* renamed from: b */
    private final pr1 f39274b;

    public qr1(C12072b bVar) {
        this.f39273a = new WeakReference<>(bVar);
        this.f39274b = new pr1(bVar.mo64592d());
    }

    /* renamed from: a */
    public void mo66541a(Context context) {
    }

    /* renamed from: a */
    public void mo66542a(Context context, AdResponse<String> adResponse) {
        C12072b bVar = (C12072b) this.f39273a.get();
        if (bVar != null) {
            this.f39274b.mo69425a(context, adResponse, (h41.C13275a) null);
            this.f39274b.mo69426b(context, adResponse, (h41.C13275a) null);
            bVar.mo68674b(adResponse);
        }
    }
}
