package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.C1825e;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.g1 */
public class C1919g1 {
    /* renamed from: a */
    public JSONObject mo14621a(C1909e1 e1Var) {
        if (e1Var == null) {
            return new JSONObject();
        }
        return C1825e.m4025a(C1825e.m4023a("carrier-name", (Object) e1Var.mo14595d()), C1825e.m4023a("mobile-country-code", (Object) e1Var.mo14592a()), C1825e.m4023a("mobile-network-code", (Object) e1Var.mo14593b()), C1825e.m4023a("iso-country-code", (Object) e1Var.mo14594c()), C1825e.m4023a("phone-type", (Object) Integer.valueOf(e1Var.mo14596e())));
    }
}
