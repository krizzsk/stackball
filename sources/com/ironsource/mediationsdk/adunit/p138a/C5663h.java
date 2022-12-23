package com.ironsource.mediationsdk.adunit.p138a;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.a.h */
public final class C5663h extends C5661f {
    public C5663h(C5657d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo41740a() {
        mo41736a(C5655b.LOAD_AD);
    }

    /* renamed from: a */
    public final void mo41741a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        mo41737a(C5655b.LOAD_AD_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo41742a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo41737a(C5655b.LOAD_AD_NO_FILL, hashMap);
    }

    /* renamed from: a */
    public final void mo41743a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.LOAD_AD_FAILED, hashMap);
    }
}
