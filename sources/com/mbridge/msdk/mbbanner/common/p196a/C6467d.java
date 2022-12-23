package com.mbridge.msdk.mbbanner.common.p196a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p178g.C6275b;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.p243my.tracker.ads.AdFormat;

/* renamed from: com.mbridge.msdk.mbbanner.common.a.d */
/* compiled from: BannerV3Params */
public class C6467d {

    /* renamed from: a */
    private static final String f16122a = C6467d.class.getSimpleName();

    /* renamed from: a */
    public static C6287d m16595a(boolean z, Context context, String str, String str2, int i, C6465b bVar) {
        String e = C6122a.m15302b().mo42896e();
        String md5 = SameMD5.getMD5(C6122a.m15302b().mo42896e() + C6122a.m15302b().mo42897f());
        String b = C6366u.m16205b(context, str);
        String a = C6208d.m15701a(str, AdFormat.BANNER);
        String closeIds = BannerUtils.getCloseIds(str);
        C6287d dVar = new C6287d();
        C6275b.m15859a(dVar, "app_id", e);
        C6275b.m15859a(dVar, MBridgeConstans.PROPERTIES_UNIT_ID, str);
        if (!TextUtils.isEmpty(bVar.mo44286d())) {
            C6275b.m15859a(dVar, MBridgeConstans.PLACEMENT_ID, bVar.mo44286d());
        }
        C6275b.m15859a(dVar, "sign", md5);
        C6275b.m15859a(dVar, "only_impression", "1");
        C6275b.m15859a(dVar, "ping_mode", "1");
        C6275b.m15859a(dVar, C6287d.f15600c, b);
        C6275b.m15859a(dVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        C6275b.m15859a(dVar, C6287d.f15598a, str2);
        C6275b.m15859a(dVar, "ad_type", "296");
        C6275b.m15859a(dVar, "offset", i + "");
        C6275b.m15859a(dVar, C6287d.f15599b, a);
        C6275b.m15859a(dVar, "close_id", closeIds);
        C6275b.m15859a(dVar, CampaignUnit.JSON_KEY_UNIT_SIZE, bVar.mo44281a() + "");
        C6275b.m15859a(dVar, "refresh_time", bVar.mo44283b() + "");
        if (!TextUtils.isEmpty(bVar.mo44285c())) {
            C6275b.m15859a(dVar, "token", bVar.mo44285c() + "");
        }
        return dVar;
    }
}
