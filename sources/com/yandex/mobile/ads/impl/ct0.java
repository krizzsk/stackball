package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.C15496h;
import com.yandex.mobile.ads.nativeads.C15519q;
import com.yandex.mobile.ads.nativeads.C15526t;
import java.util.ArrayList;
import java.util.List;

public class ct0 {

    /* renamed from: a */
    private final bt0 f32079a = new bt0();

    /* renamed from: b */
    private final C12570b5 f32080b = new C12570b5();

    /* renamed from: c */
    private final C15496h f32081c = new C15496h();

    /* renamed from: a */
    public List<C15526t> mo66354a(Context context, vq0 vq0, ed0 ed0, or0 or0, n70 n70) {
        ArrayList arrayList = new ArrayList();
        List<pq0> c = vq0.mo70515c().mo65856c();
        vu0 d = or0.mo69262d();
        for (pq0 next : c) {
            uu0 a = d.mo70593a(next);
            arrayList.add(this.f32079a.mo66114a().mo65883a(context, next, new C15519q(context, next, ed0, a), ed0, this.f32081c.mo71669a(vq0, this.f32080b.mo65968a(next), a, or0, n70)));
        }
        return arrayList;
    }
}
