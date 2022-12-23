package com.yandex.mobile.ads.exo.trackselection;

import com.yandex.mobile.ads.exo.C12178d;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.impl.C12579bb;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.le1;

/* renamed from: com.yandex.mobile.ads.exo.trackselection.f */
public abstract class C12334f {

    /* renamed from: a */
    private C12579bb f30310a;

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.f$a */
    public interface C12335a {
    }

    /* renamed from: a */
    public abstract le1 mo65396a(C12178d[] dVarArr, TrackGroupArray trackGroupArray, C12287f.C12288a aVar, C12270q qVar) throws k40;

    /* renamed from: a */
    public final void mo65406a(C12335a aVar, C12579bb bbVar) {
        this.f30310a = bbVar;
    }

    /* renamed from: a */
    public abstract void mo65397a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C12579bb mo65405a() {
        C12579bb bbVar = this.f30310a;
        bbVar.getClass();
        return bbVar;
    }
}
