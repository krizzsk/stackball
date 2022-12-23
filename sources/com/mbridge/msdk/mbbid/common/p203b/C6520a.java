package com.mbridge.msdk.mbbid.common.p203b;

import android.content.Context;
import android.os.Build;
import com.appsflyer.ServerParameters;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.net.p179h.C6288e;
import com.mbridge.msdk.foundation.same.net.p179h.C6289f;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p158b.C6076b;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;

/* renamed from: com.mbridge.msdk.mbbid.common.b.a */
/* compiled from: BidRequest */
public final class C6520a extends C6289f {
    public C6520a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo42743a(String str, C6287d dVar) {
        super.mo42743a(str, dVar);
        if (C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e()) == null) {
            C6076b.m15089a().mo42748b();
        }
        dVar.mo43870a("platform", "1");
        dVar.mo43870a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
        dVar.mo43870a(CampaignEx.JSON_KEY_PACKAGE_NAME, C6349m.m16117k(this.f15597a));
        dVar.mo43870a(ServerParameters.APP_VERSION_NAME, C6349m.m16107f(this.f15597a));
        dVar.mo43870a(ServerParameters.APP_VERSION_CODE, C6349m.m16104e(this.f15597a) + "");
        dVar.mo43870a(ServerParameters.MODEL, C6349m.m16091a());
        dVar.mo43870a(ServerParameters.BRAND, C6349m.m16099c());
        dVar.mo43870a(VungleApiClient.GAID, "");
        dVar.mo43870a("gaid2", C6349m.m16114j());
        int n = C6349m.m16123n(this.f15597a);
        dVar.mo43870a("network_type", n + "");
        dVar.mo43870a("network_str", C6349m.m16092a(this.f15597a, n) + "");
        dVar.mo43870a("language", C6349m.m16100c(this.f15597a));
        dVar.mo43870a(TapjoyConstants.TJC_DEVICE_TIMEZONE, C6349m.m16105e());
        dVar.mo43870a("useragent", C6349m.m16103d());
        dVar.mo43870a(ServerParameters.SDK_DATA_SDK_VERSION, MBConfiguration.SDK_VERSION);
        dVar.mo43870a("screen_size", C6349m.m16111h(this.f15597a) + "x" + C6349m.m16112i(this.f15597a));
        C6288e.m15894a(dVar, this.f15597a);
        C6288e.m15893a(dVar);
    }
}
