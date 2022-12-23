package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.nativeads.C15526t;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import java.util.ArrayList;
import java.util.List;

public class v80 {

    /* renamed from: a */
    private final C13371i0 f41212a;

    /* renamed from: b */
    private final int f41213b;

    /* renamed from: c */
    private final wi0 f41214c = new wi0();

    public v80(C13371i0 i0Var, int i) {
        this.f41212a = i0Var;
        this.f41213b = i;
    }

    /* renamed from: a */
    public u80 mo70457a(Context context, AdResponse<?> adResponse, C15526t tVar, ViewGroup viewGroup, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        C13210gl glVar;
        C13371i0 i0Var = this.f41212a;
        int i = this.f41213b;
        if (adResponse.mo64432l() == C12115n.REWARDED) {
            glVar = new f61(i0Var, i);
        } else {
            glVar = new ph0(i0Var, i);
        }
        List<w80> a = glVar.mo66932a(context, adResponse, tVar, qhVar, nativeAdEventListener, e0Var);
        this.f41214c.getClass();
        ArrayList arrayList = new ArrayList();
        for (w80 a2 : a) {
            arrayList.add(a2.mo67427a(context, adResponse, tVar, qhVar, nativeAdEventListener, e0Var));
        }
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        return new u80(new vi0(context, viewGroup, arrayList), qhVar);
    }
}
