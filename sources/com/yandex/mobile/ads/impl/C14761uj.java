package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.nativeads.C15501j;

/* renamed from: com.yandex.mobile.ads.impl.uj */
public class C14761uj {

    /* renamed from: a */
    private final k41 f40657a;

    /* renamed from: b */
    private final ex0 f40658b;

    /* renamed from: c */
    private final C15501j f40659c;

    /* renamed from: d */
    private final d11 f40660d = new d11();

    public C14761uj(k41 k41, ex0 ex0, C15501j jVar) {
        this.f40657a = k41;
        this.f40658b = ex0;
        this.f40659c = jVar;
    }

    /* renamed from: a */
    public void mo70351a(Context context, C14466rj rjVar) {
        if (this.f40660d.mo66390a(context, rjVar.mo69774c())) {
            ((C13198gf) this.f40657a).mo67276a(h41.C13276b.DEEPLINK);
            this.f40659c.mo71685d();
            return;
        }
        this.f40658b.mo66882a(rjVar.mo69773b());
    }
}
