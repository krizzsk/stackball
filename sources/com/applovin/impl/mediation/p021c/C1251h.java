package com.applovin.impl.mediation.p021c;

import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p023a.C1342c;
import com.applovin.impl.sdk.p027d.C1401af;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.h */
public class C1251h extends C1401af {

    /* renamed from: a */
    private final C1225c f2426a;

    public C1251h(C1225c cVar, C1469j jVar) {
        super("TaskValidateMaxReward", jVar);
        this.f2426a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo12389a() {
        return "2.0/mvr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12390a(int i) {
        super.mo12390a(i);
        this.f2426a.mo12318a(C1342c.m2403a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12395a(C1342c cVar) {
        this.f2426a.mo12318a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12391a(JSONObject jSONObject) {
        C1521i.m3477a(jSONObject, "ad_unit_id", this.f2426a.getAdUnitId(), this.f3279b);
        C1521i.m3477a(jSONObject, "placement", this.f2426a.mo12344P(), this.f3279b);
        String x = this.f2426a.mo12331x();
        if (!C1553o.m3554b(x)) {
            x = "NO_MCODE";
        }
        C1521i.m3477a(jSONObject, "mcode", x, this.f3279b);
        String w = this.f2426a.mo12330w();
        if (!C1553o.m3554b(w)) {
            w = "NO_BCODE";
        }
        C1521i.m3477a(jSONObject, "bcode", w, this.f3279b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo12396b() {
        return this.f2426a.mo12332y();
    }
}
