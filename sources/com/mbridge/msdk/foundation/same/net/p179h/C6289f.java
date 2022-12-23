package com.mbridge.msdk.foundation.same.net.p179h;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;

/* renamed from: com.mbridge.msdk.foundation.same.net.h.f */
/* compiled from: HeaderBiddingRequest */
public class C6289f extends C6285b {
    public C6289f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo42743a(String str, C6287d dVar) {
        try {
            int c = C6366u.m16211c();
            String d = C6366u.m16216d();
            if (dVar != null) {
                dVar.mo43870a("misk_spt", String.valueOf(c));
                if (!TextUtils.isEmpty(d)) {
                    dVar.mo43870a("misk_spt_det", d);
                }
            }
        } catch (Exception e) {
            C6361q.m16154a("CampaignRequest", e.getMessage());
        } catch (Throwable th) {
            super.mo42743a(str, dVar);
            throw th;
        }
        super.mo42743a(str, dVar);
    }
}
