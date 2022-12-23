package com.mbridge.msdk.foundation.same.net.p179h;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.appsflyer.share.Constants;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6363s;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.h.e */
/* compiled from: CommonRequestParamsForAdd */
public final class C6288e {

    /* renamed from: a */
    private static String f15608a = "";

    /* renamed from: b */
    private static String f15609b = "";

    /* renamed from: a */
    public static void m15894a(C6287d dVar, Context context) {
        if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            C6129a.m15330a();
            if (C6121a.m15293a().mo42881b(MBridgeConstans.AUTHORITY_DNT, 0) == 1) {
                dVar.mo43870a("dnt", "1");
            }
        }
        if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_OTHER)) {
            String str = C6287d.f15603f;
            dVar.mo43870a(str, C6363s.m16167b() + "");
            String str2 = C6287d.f15604g;
            dVar.mo43870a(str2, C6363s.m16164a() + "");
            dVar.mo43870a(C6287d.f15601d, C6349m.m16120m());
        }
        dVar.mo43870a("pkg_source", C6349m.m16093a(C6349m.m16117k(context), context));
        if (C6122a.m15302b().mo42899h() != null) {
            dVar.mo43870a("web_env", C6122a.m15302b().mo42899h().toString());
        }
        if (Build.VERSION.SDK_INT > 18) {
            dVar.mo43870a("http_req", "2");
        }
        m15895a(dVar, true);
        m15899e(dVar);
        m15898d(dVar);
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b == null) {
            b = C6076b.m15089a().mo42748b();
        }
        if (b.mo42679X()) {
            dVar.mo43870a(InMobiSdk.IM_GDPR_CONSENT_IAB, C6129a.m15330a().mo42927e() + "");
        }
    }

    /* renamed from: a */
    public static void m15893a(C6287d dVar) {
        dVar.mo43870a("api_version", C6204a.f15391a);
    }

    /* renamed from: b */
    public static void m15896b(C6287d dVar) {
        m15895a(dVar, false);
        m15899e(dVar);
        m15898d(dVar);
    }

    /* renamed from: d */
    private static void m15898d(C6287d dVar) {
        try {
            if (TextUtils.isEmpty(C6204a.f15401k)) {
                C6204a.f15401k = C6121a.m15293a().mo42882b("b");
            }
            if (!TextUtils.isEmpty(C6204a.f15401k)) {
                dVar.mo43870a("b", C6204a.f15401k);
            }
            if (TextUtils.isEmpty(C6204a.f15402l)) {
                C6204a.f15402l = C6121a.m15293a().mo42882b(Constants.URL_CAMPAIGN);
            }
            if (!TextUtils.isEmpty(C6204a.f15402l)) {
                dVar.mo43870a(Constants.URL_CAMPAIGN, C6204a.f15402l);
            }
        } catch (Exception e) {
            C6361q.m16158d("CommonRequestParamsForAdd", e.getMessage());
        }
    }

    /* renamed from: e */
    private static void m15899e(C6287d dVar) {
        int p = C6349m.m16126p();
        if (p != -1) {
            dVar.mo43870a("unknown_source", p + "");
        }
    }

    /* renamed from: a */
    private static void m15895a(C6287d dVar, boolean z) {
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b != null) {
            if (!TextUtils.isEmpty(b.mo42690b()) && z) {
                dVar.mo43870a("a_stid", b.mo42690b());
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("dmt", C6349m.m16124o() + "");
                    jSONObject.put("dmf", C6349m.m16122n());
                }
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    if (!jSONObject.equals(f15608a)) {
                        f15609b = C6348l.m16087a(jSONObject.toString());
                    }
                    if (!TextUtils.isEmpty(f15609b)) {
                        dVar.mo43870a("dvi", f15609b);
                    }
                }
            } catch (Exception e) {
                C6361q.m16158d("CommonRequestParamsForAdd", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m15897c(C6287d dVar) {
        if (dVar != null) {
            if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                dVar.mo43869a(ServerParameters.MODEL);
                dVar.mo43869a(ServerParameters.BRAND);
                dVar.mo43869a("screen_size");
                dVar.mo43869a("sub_ip");
                dVar.mo43869a("network_type");
                dVar.mo43869a("useragent");
                dVar.mo43869a("ua");
                dVar.mo43869a("language");
                dVar.mo43869a("network_str");
                dVar.mo43869a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME);
            }
            if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_OTHER)) {
                dVar.mo43869a(C6287d.f15603f);
                dVar.mo43869a(C6287d.f15604g);
                dVar.mo43869a("power_rate");
                dVar.mo43869a("charging");
                dVar.mo43869a(TapjoyConstants.TJC_DEVICE_TIMEZONE);
            }
            if (!C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                dVar.mo43869a(VungleApiClient.GAID);
                dVar.mo43869a("gaid2");
            }
        }
    }
}
