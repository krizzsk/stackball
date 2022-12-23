package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.br */
public class C12606br {
    /* renamed from: a */
    public C15340zq mo66108a(C14535ru ruVar) {
        try {
            JSONObject a = ruVar.mo69818a();
            JSONObject d = ruVar.mo69821d();
            ny0 ny0 = ny0.f38022a;
            Intrinsics.checkNotNullParameter(ny0, "logger");
            C15215xv xvVar = new C15215xv(ny0, (ek0) null, 2);
            if (d != null) {
                xvVar.mo66817a(d);
            }
            return C15340zq.f43278g.mo71274a(xvVar, a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
