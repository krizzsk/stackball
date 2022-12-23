package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.C15496h;
import com.yandex.mobile.ads.nativeads.C15499i;
import com.yandex.mobile.ads.nativeads.C15519q;
import com.yandex.mobile.ads.nativeads.NativeAd;

public class pr0 {

    /* renamed from: a */
    private final bt0 f38808a = new bt0();

    /* renamed from: b */
    private final C15496h f38809b = new C15496h();

    pr0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public NativeAd mo69423a(Context context, vq0 vq0, ed0 ed0, C15499i iVar, or0 or0, pq0 pq0) {
        if (pq0 == null) {
            return null;
        }
        at0 a = this.f38808a.mo66114a();
        uu0 a2 = or0.mo69262d().mo70593a(pq0);
        n70 n70 = new n70();
        return a.mo65883a(context, pq0, new C15519q(context, pq0, ed0, a2), ed0, this.f38809b.mo71669a(vq0, iVar.mo71672a(vq0, pq0), a2, or0, n70));
    }
}
