package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C15526t;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class oh0 {

    /* renamed from: a */
    private final C13371i0 f38222a;

    /* renamed from: b */
    private final C14934vu f38223b = new C14934vu();

    /* renamed from: c */
    private final C12456av f38224c = new C12456av();

    /* renamed from: d */
    private final int f38225d;

    public oh0(C13371i0 i0Var, int i) {
        this.f38222a = i0Var;
        this.f38225d = i;
    }

    @Nullable
    /* renamed from: a */
    public w80 mo69162a(Context context, AdResponse<?> adResponse, C15526t tVar, C12947e0 e0Var, C14384qh qhVar) {
        C14535ru a;
        C15340zq zqVar;
        try {
            if (this.f38224c.mo65893a(context) && (a = this.f38223b.mo70592a(tVar)) != null) {
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
                    return new C14712tu(zqVar, new C12586bg(adResponse, e0Var, new yo1(), qhVar, new dr0()), this.f38222a, this.f38225d);
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }
}
