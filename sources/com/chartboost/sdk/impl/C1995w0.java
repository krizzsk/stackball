package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.w0 */
public class C1995w0 {

    /* renamed from: a */
    private C1900b1 f5152a;

    /* renamed from: b */
    private C2019y0 f5153b;

    /* renamed from: c */
    private C1903c1 f5154c;

    /* renamed from: d */
    private C2021z0 f5155d;

    /* renamed from: e */
    private C1897a1 f5156e;

    /* renamed from: f */
    private C1906d1 f5157f;

    /* renamed from: g */
    private C1844h.C1846b f5158g;

    public C1995w0(C1900b1 b1Var, C2019y0 y0Var, C1903c1 c1Var, C2021z0 z0Var, C1897a1 a1Var, C1906d1 d1Var) {
        this.f5152a = b1Var;
        this.f5153b = y0Var;
        this.f5154c = c1Var;
        this.f5155d = z0Var;
        this.f5156e = a1Var;
        this.f5157f = d1Var;
        m4896e();
    }

    /* renamed from: e */
    private void m4896e() {
        C1906d1 d1Var = this.f5157f;
        if (d1Var != null) {
            d1Var.mo14578a();
        }
    }

    /* renamed from: a */
    public void mo14856a(C1844h.C1846b bVar) {
        this.f5158g = bVar;
    }

    /* renamed from: b */
    public DataUseConsent mo14859b(String str) {
        C1903c1 c1Var = this.f5154c;
        if (c1Var != null) {
            return c1Var.mo14571a(str);
        }
        return null;
    }

    /* renamed from: c */
    public JSONObject mo14860c() {
        List<DataUseConsent> d = mo14861d();
        C2021z0 z0Var = this.f5155d;
        if (z0Var == null || d == null) {
            return null;
        }
        return z0Var.mo14893a(d);
    }

    /* renamed from: d */
    public List<DataUseConsent> mo14861d() {
        C1844h.C1846b bVar;
        C1897a1 a1Var = this.f5156e;
        if (a1Var == null || (bVar = this.f5158g) == null) {
            return null;
        }
        return a1Var.mo14565a(bVar);
    }

    /* renamed from: a */
    public void mo14857a(DataUseConsent dataUseConsent) {
        C1900b1 b1Var = this.f5152a;
        if (b1Var != null) {
            b1Var.mo14566a(dataUseConsent);
        }
    }

    /* renamed from: b */
    public int mo14858b() {
        return this.f5157f.mo14580c();
    }

    /* renamed from: a */
    public DataUseConsent mo14855a(String str) {
        C2019y0 y0Var = this.f5153b;
        if (y0Var != null) {
            return y0Var.mo14892a(str);
        }
        return null;
    }

    /* renamed from: a */
    public int mo14854a() {
        return this.f5157f.mo14579b();
    }
}
