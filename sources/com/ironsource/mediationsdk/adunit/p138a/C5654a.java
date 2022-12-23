package com.ironsource.mediationsdk.adunit.p138a;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.a.a */
public final class C5654a extends C5661f {
    public C5654a(C5657d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo41721a() {
        mo41736a(C5655b.SESSION_CAPPED);
    }

    /* renamed from: a */
    public final void mo41722a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo41737a(C5655b.SHOW_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo41723a(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str2);
        mo41737a(C5655b.SHOW_AD_FAILED, hashMap);
    }

    /* renamed from: b */
    public final void mo41724b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo41737a(C5655b.SHOW_AD_SUCCESS, hashMap);
    }

    /* renamed from: c */
    public final void mo41725c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo41737a(C5655b.AD_OPENED, hashMap);
    }

    /* renamed from: d */
    public final void mo41726d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo41737a(C5655b.AD_CLICKED, hashMap);
    }

    /* renamed from: e */
    public final void mo41727e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo41737a(C5655b.AD_CLOSED, hashMap);
    }

    /* renamed from: f */
    public final void mo41728f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        mo41737a(C5655b.PLACEMENT_CAPPED, hashMap);
    }
}
