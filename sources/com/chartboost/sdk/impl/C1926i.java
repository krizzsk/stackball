package com.chartboost.sdk.impl;

import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Tracking.C1872c;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1965p0;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.i */
public class C1926i implements C1965p0.C1966a {

    /* renamed from: a */
    private final C1913g f4886a;

    /* renamed from: b */
    private final String f4887b;

    public C1926i(C1913g gVar, String str) {
        this.f4886a = gVar;
        this.f4887b = str;
    }

    /* renamed from: a */
    public void mo14615a(C1965p0 p0Var, JSONObject jSONObject) {
        if (this.f4886a.f4819o.f4754g || C2026k.f5257n) {
            synchronized (this.f4886a) {
                if (this.f4886a.f4819o.f4748a != 3) {
                    this.f4886a.mo14607d(this.f4887b);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo14614a(C1965p0 p0Var, CBError cBError) {
        C1913g gVar = this.f4886a;
        if (gVar.f4819o.f4754g) {
            synchronized (gVar) {
                this.f4886a.mo14607d(this.f4887b);
            }
        }
        C1874e.m4311e(new C1872c("show_request_error", cBError.getErrorDesc(), this.f4886a.f4819o.f4749b, this.f4887b));
    }
}
