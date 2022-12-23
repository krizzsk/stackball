package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.chartboost.sdk.impl.a1 */
public class C1897a1 {

    /* renamed from: a */
    private C2015x0 f4762a;

    public C1897a1(C2015x0 x0Var) {
        this.f4762a = x0Var;
    }

    /* renamed from: b */
    private HashSet<String> m4466b(C1844h.C1846b bVar) {
        if (bVar != null) {
            return bVar.mo14324a();
        }
        return null;
    }

    /* renamed from: a */
    public List<DataUseConsent> mo14565a(C1844h.C1846b bVar) {
        HashMap<String, DataUseConsent> b = this.f4762a.mo14889b();
        List<DataUseConsent> a = m4464a(b);
        ArrayList arrayList = new ArrayList();
        HashSet<String> b2 = m4466b(bVar);
        if (b2 != null) {
            for (DataUseConsent next : a) {
                if (m4465a(b2, next)) {
                    arrayList.add(next);
                }
            }
        } else if (b.containsKey(CCPA.CCPA_STANDARD)) {
            arrayList.add(b.get(CCPA.CCPA_STANDARD));
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m4465a(HashSet<String> hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandard())) {
            return true;
        }
        CBLogging.m3997e("Chartboost", "DataUseConsent " + dataUseConsent.getPrivacyStandard() + " is not whitelisted.");
        return false;
    }

    /* renamed from: a */
    private List<DataUseConsent> m4464a(HashMap<String, DataUseConsent> hashMap) {
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.remove("gdpr");
        return new ArrayList(hashMap2.values());
    }
}
