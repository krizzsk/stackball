package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C15526t;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class f61 implements C13210gl {

    /* renamed from: a */
    private final C13371i0 f33250a;

    /* renamed from: b */
    private final b61 f33251b;

    /* renamed from: c */
    private final c61 f33252c;

    public f61(C13371i0 i0Var, int i) {
        this.f33250a = i0Var;
        this.f33251b = new b61(i0Var);
        this.f33252c = new c61(i0Var, i);
    }

    /* renamed from: a */
    public List<w80> mo66932a(Context context, AdResponse<?> adResponse, C15526t tVar, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        C12982el<NativeAdView> a = new x51(adResponse, tVar, e0Var, qhVar, this.f33250a).mo70830a(new cr0(), new be1());
        C13036f8 f8Var = new C13036f8(a);
        ArrayList arrayList = new ArrayList();
        List<w80> a2 = f8Var.mo66936a();
        List asList = Arrays.asList(new w80[]{new o01(a), new mi0(a)});
        o80 a3 = this.f33251b.mo66009a(context, adResponse, tVar, e0Var, qhVar);
        w80 b = this.f33252c.mo66209b(context, adResponse, tVar, e0Var, qhVar);
        if (b != null) {
            arrayList.add(b);
        }
        arrayList.add(a3);
        arrayList.addAll(a2);
        arrayList.addAll(asList);
        return arrayList;
    }
}
