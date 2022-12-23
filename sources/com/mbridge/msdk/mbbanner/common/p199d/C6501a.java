package com.mbridge.msdk.mbbanner.common.p199d;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6305b;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.mbbanner.common.p196a.C6464a;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.mbbanner.common.d.a */
/* compiled from: BannerReport */
public final class C6501a {
    /* renamed from: a */
    public static void m16725a(String str, CampaignEx campaignEx, String str2) {
        try {
            C6326a aVar = new C6326a(C6122a.m15302b().mo42895d());
            StringBuilder sb = new StringBuilder();
            if (campaignEx.isBidCampaign()) {
                sb.append("hb=");
                sb.append(1);
                sb.append("&");
            }
            sb.append(SDKConstants.PARAM_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000070", "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
            sb.append("&");
            sb.append(BidResponsedEx.KEY_CID);
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getId(), "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("click_url");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(String.valueOf(C6349m.m16123n(C6122a.m15302b().mo42895d())), "utf-8"));
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(sb.toString());
                return;
            }
            aVar.mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(sb.toString(), C6122a.m15302b().mo42895d(), str), new C6327b() {
                /* renamed from: a */
                public final void mo43811a(String str) {
                }

                /* renamed from: b */
                public final void mo43812b(String str) {
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m16724a(C6464a aVar, String str) {
        if (aVar != null) {
            aVar.mo44272a("2000068");
            if (C6301a.m15945a().mo43913c()) {
                C6301a.m15945a().mo43911a(aVar.mo44275b());
            } else {
                C6305b.m15967a(aVar.mo44275b(), C6122a.m15302b().mo42895d(), str);
            }
        }
    }
}
