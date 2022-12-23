package com.ironsource.mediationsdk.adunit.p138a;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.a.i */
public final class C5664i extends C5661f {
    public C5664i(C5657d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo41744a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo41737a(C5655b.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    /* renamed from: a */
    public final void mo41745a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: b */
    public final void mo41746b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: c */
    public final void mo41747c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    /* renamed from: d */
    public final void mo41748d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_BIDDING_DATA_MISSING, hashMap);
    }

    /* renamed from: e */
    public final void mo41749e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    /* renamed from: f */
    public final void mo41750f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    /* renamed from: g */
    public final void mo41751g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: h */
    public final void mo41752h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    /* renamed from: i */
    public final void mo41753i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    /* renamed from: j */
    public final void mo41754j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    /* renamed from: k */
    public final void mo41755k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: l */
    public final void mo41756l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo41737a(C5655b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, hashMap);
    }
}
