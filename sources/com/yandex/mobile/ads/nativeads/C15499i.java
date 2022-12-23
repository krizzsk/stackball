package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.n70;
import com.yandex.mobile.ads.impl.or0;
import com.yandex.mobile.ads.impl.pe1;
import com.yandex.mobile.ads.impl.pq0;
import com.yandex.mobile.ads.impl.vq0;
import com.yandex.mobile.ads.impl.wu0;

/* renamed from: com.yandex.mobile.ads.nativeads.i */
public class C15499i {

    /* renamed from: a */
    private final pe1 f43854a = new pe1();

    /* renamed from: b */
    private final ct0 f43855b = new ct0();

    /* renamed from: c */
    private final C15516o0 f43856c = new C15516o0();

    /* renamed from: a */
    public wu0 mo71672a(vq0 vq0, pq0 pq0) {
        return new wu0(pq0.mo69407b(), this.f43854a.mo69363a(pq0.mo69420h(), vq0.mo70515c().mo65864g()), this.f43854a.mo69363a(pq0.mo69418f(), vq0.mo70515c().mo65860e()), pq0.mo69399a(), pq0.mo69410c());
    }

    /* renamed from: a */
    public C15502j0 mo71673a(Context context, vq0 vq0, ed0 ed0, or0 or0) {
        n70 n70 = new n70();
        C15500i0 i0Var = new C15500i0(this.f43855b.mo66354a(context, vq0, ed0, or0, n70));
        return new C15502j0(context, i0Var, ed0, this.f43856c.mo71724a(vq0, i0Var, or0, n70));
    }
}
