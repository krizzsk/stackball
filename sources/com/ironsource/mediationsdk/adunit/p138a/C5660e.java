package com.ironsource.mediationsdk.adunit.p138a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.a.e */
public final class C5660e extends C5661f {
    public C5660e(C5657d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo41731a() {
        mo41736a(C5655b.AUCTION_REQUEST);
    }

    /* renamed from: a */
    public final void mo41732a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        mo41737a(C5655b.AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo41733a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo41737a(C5655b.AUCTION_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo41734a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo41737a(C5655b.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    /* renamed from: b */
    public final void mo41735b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo41737a(C5655b.AUCTION_RESULT_WATERFALL, hashMap);
    }
}
