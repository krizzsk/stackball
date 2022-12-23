package com.applovin.impl.sdk.p027d;

import com.applovin.impl.p008a.C1006c;
import com.applovin.impl.p008a.C1007d;
import com.applovin.impl.p008a.C1013i;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1560t;
import com.applovin.impl.sdk.utils.C1561u;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.u */
abstract class C1442u extends C1392a {

    /* renamed from: a */
    private final AppLovinAdLoadListener f3399a;

    /* renamed from: c */
    private final C1443a f3400c;

    /* renamed from: com.applovin.impl.sdk.d.u$a */
    private static final class C1443a extends C1006c {
        C1443a(JSONObject jSONObject, JSONObject jSONObject2, C1346b bVar, C1469j jVar) {
            super(jSONObject, jSONObject2, bVar, jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo13029a(C1560t tVar) {
            if (tVar != null) {
                this.f1670a.add(tVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    /* renamed from: com.applovin.impl.sdk.d.u$b */
    private static final class C1444b extends C1442u {

        /* renamed from: a */
        private final JSONObject f3401a;

        C1444b(C1006c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
            super(cVar, appLovinAdLoadListener, jVar);
            if (appLovinAdLoadListener != null) {
                this.f3401a = cVar.mo11703c();
                return;
            }
            throw new IllegalArgumentException("No callback specified.");
        }

        public void run() {
            C1007d dVar;
            mo12944a("Processing SDK JSON response...");
            String b = C1521i.m3487b(this.f3401a, "xml", (String) null, this.f3279b);
            if (!C1553o.m3554b(b)) {
                mo12949d("No VAST response received.");
                dVar = C1007d.NO_WRAPPER_RESPONSE;
            } else if (b.length() < ((Integer) this.f3279b.mo13088a(C1369c.f3072eF)).intValue()) {
                try {
                    mo13028a(C1561u.m3647a(b, this.f3279b));
                    return;
                } catch (Throwable th) {
                    mo12945a("Unable to parse VAST response", th);
                }
            } else {
                mo12949d("VAST response is over max length");
                dVar = C1007d.XML_PARSING;
            }
            mo13027a(dVar);
        }
    }

    /* renamed from: com.applovin.impl.sdk.d.u$c */
    private static final class C1445c extends C1442u {

        /* renamed from: a */
        private final C1560t f3402a;

        C1445c(C1560t tVar, C1006c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
            super(cVar, appLovinAdLoadListener, jVar);
            if (tVar == null) {
                throw new IllegalArgumentException("No response specified.");
            } else if (cVar == null) {
                throw new IllegalArgumentException("No context specified.");
            } else if (appLovinAdLoadListener != null) {
                this.f3402a = tVar;
            } else {
                throw new IllegalArgumentException("No callback specified.");
            }
        }

        public void run() {
            mo12944a("Processing VAST Wrapper response...");
            mo13028a(this.f3402a);
        }
    }

    C1442u(C1006c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        super("TaskProcessVastResponse", jVar);
        if (cVar != null) {
            this.f3399a = appLovinAdLoadListener;
            this.f3400c = (C1443a) cVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    /* renamed from: a */
    public static C1442u m2968a(C1560t tVar, C1006c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        return new C1445c(tVar, cVar, appLovinAdLoadListener, jVar);
    }

    /* renamed from: a */
    public static C1442u m2969a(JSONObject jSONObject, JSONObject jSONObject2, C1346b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        return new C1444b(new C1443a(jSONObject, jSONObject2, bVar, jVar), appLovinAdLoadListener, jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13027a(C1007d dVar) {
        mo12949d("Failed to process VAST response due to VAST error code " + dVar);
        C1013i.m1367a((C1006c) this.f3400c, this.f3399a, dVar, -6, this.f3279b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13028a(C1560t tVar) {
        C1007d dVar;
        C1392a aVar;
        int a = this.f3400c.mo11701a();
        mo12944a("Finished parsing XML at depth " + a);
        this.f3400c.mo13029a(tVar);
        if (C1013i.m1373a(tVar)) {
            int intValue = ((Integer) this.f3279b.mo13088a(C1369c.f3073eG)).intValue();
            if (a < intValue) {
                mo12944a("VAST response is wrapper. Resolving...");
                aVar = new C1395ab(this.f3400c, this.f3399a, this.f3279b);
            } else {
                mo12949d("Reached beyond max wrapper depth of " + intValue);
                dVar = C1007d.WRAPPER_LIMIT_REACHED;
                mo13027a(dVar);
                return;
            }
        } else if (C1013i.m1376b(tVar)) {
            mo12944a("VAST response is inline. Rendering ad...");
            aVar = new C1448x(this.f3400c, this.f3399a, this.f3279b);
        } else {
            mo12949d("VAST response is an error");
            dVar = C1007d.NO_WRAPPER_RESPONSE;
            mo13027a(dVar);
            return;
        }
        this.f3279b.mo13071K().mo13013a(aVar);
    }
}
