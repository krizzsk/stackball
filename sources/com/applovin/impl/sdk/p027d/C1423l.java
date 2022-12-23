package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.d.l */
public class C1423l extends C1424m {

    /* renamed from: a */
    private final List<String> f3325a;

    public C1423l(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        super(C1349d.m2454a(m2899a(list), jVar), appLovinAdLoadListener, "TaskFetchMultizoneAd", jVar);
        this.f3325a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    private static String m2899a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new IllegalArgumentException("No zone identifiers specified");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, String> mo12998a() {
        HashMap hashMap = new HashMap(1);
        List<String> list = this.f3325a;
        hashMap.put("zone_ids", C1553o.m3557e(C1517e.m3419a((Collection<String>) list, list.size())));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1346b mo12999b() {
        return C1346b.APPLOVIN_MULTIZONE;
    }
}
