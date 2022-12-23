package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C15526t;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ph0 implements C13210gl {

    /* renamed from: a */
    private final nh0 f38610a = new nh0();

    /* renamed from: b */
    private final oh0 f38611b;

    public ph0(C13371i0 i0Var, int i) {
        this.f38611b = new oh0(i0Var, i);
    }

    /* renamed from: a */
    public List<w80> mo66932a(Context context, AdResponse<?> adResponse, C15526t tVar, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        C12982el<NativeAdView> a = new lh0(adResponse, e0Var, qhVar).mo68434a(new cr0());
        C13036f8 f8Var = new C13036f8(a);
        ArrayList arrayList = new ArrayList();
        List<w80> a2 = f8Var.mo66936a();
        List asList = Arrays.asList(new w80[]{new p01(a), new oi0(a), new ni0(a)});
        this.f38610a.getClass();
        o80 o80 = new o80(new C12586bg(adResponse, e0Var, new f30(), qhVar, new cr0()));
        w80 a3 = this.f38611b.mo69162a(context, adResponse, tVar, e0Var, qhVar);
        if (a3 != null) {
            arrayList.add(a3);
        }
        arrayList.add(o80);
        arrayList.addAll(a2);
        arrayList.addAll(asList);
        return arrayList;
    }
}
