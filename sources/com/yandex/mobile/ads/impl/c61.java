package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C15526t;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class c61 {

    /* renamed from: a */
    private final C13371i0 f31825a;

    /* renamed from: b */
    private final C14934vu f31826b = new C14934vu();

    /* renamed from: c */
    private final C12456av f31827c = new C12456av();

    /* renamed from: d */
    private final int f31828d;

    public c61(C13371i0 i0Var, int i) {
        this.f31825a = i0Var;
        this.f31828d = i;
    }

    /* renamed from: a */
    private C12982el<NativeAdView> m34599a(Context context, AdResponse<?> adResponse, C15526t tVar, C12947e0 e0Var, C14384qh qhVar) {
        AdResponse<?> adResponse2 = adResponse;
        C12947e0 e0Var2 = e0Var;
        C14384qh qhVar2 = qhVar;
        y51 y51 = new y51(context, new C13588ju(tVar, qhVar2), qhVar2);
        C15249yg ygVar = new C15249yg(y51, new q51(this.f31825a));
        ce1 ce1 = new ce1();
        dr0 dr0 = new dr0();
        ht0 a = tVar.mo71674a();
        return new C14383qg(new a61(adResponse, e0Var, y51, dr0, a), new p51(adResponse2, e0Var2, ygVar, a), new g61(adResponse2, e0Var2, ce1, a));
    }

    @Nullable
    /* renamed from: b */
    public w80 mo66209b(Context context, AdResponse<?> adResponse, C15526t tVar, C12947e0 e0Var, C14384qh qhVar) {
        C14535ru a;
        C15340zq zqVar;
        try {
            if (this.f31827c.mo65893a(context) && (a = this.f31826b.mo70592a(tVar)) != null) {
                try {
                    JSONObject a2 = a.mo69818a();
                    JSONObject d = a.mo69821d();
                    ny0 ny0 = ny0.f38022a;
                    Intrinsics.checkNotNullParameter(ny0, "logger");
                    C15215xv xvVar = new C15215xv(ny0, (ek0) null, 2);
                    if (d != null) {
                        xvVar.mo66817a(d);
                    }
                    zqVar = C15340zq.f43278g.mo71274a(xvVar, a2);
                } catch (Throwable unused) {
                    zqVar = null;
                }
                if (zqVar != null) {
                    return new C14712tu(zqVar, m34599a(context, adResponse, tVar, e0Var, qhVar), this.f31825a, this.f31828d);
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }
}
