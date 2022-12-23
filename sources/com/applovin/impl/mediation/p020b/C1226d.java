package com.applovin.impl.mediation.p020b;

import com.applovin.impl.mediation.C1264i;
import com.applovin.impl.sdk.C1469j;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.d */
public class C1226d extends C1223a {
    private C1226d(C1226d dVar, C1264i iVar) {
        super(dVar.mo12335G(), dVar.mo12334F(), iVar, dVar.f2363b);
    }

    public C1226d(JSONObject jSONObject, JSONObject jSONObject2, C1469j jVar) {
        super(jSONObject, jSONObject2, (C1264i) null, jVar);
    }

    /* renamed from: a */
    public C1223a mo12283a(C1264i iVar) {
        return new C1226d(this, iVar);
    }
}
