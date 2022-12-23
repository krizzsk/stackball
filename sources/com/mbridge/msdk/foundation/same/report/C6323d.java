package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.C6235Aa;
import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6368w;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.d */
/* compiled from: ReportUtil */
public class C6323d {

    /* renamed from: a */
    public static final String f15697a = C6323d.class.getSimpleName();

    /* renamed from: b */
    private static String m16042b(Context context, String str) {
        if (context == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pf", "1");
            jSONObject.put("ov", C6349m.m16106f());
            jSONObject.put("pn", C6349m.m16117k(context));
            jSONObject.put("vn", C6349m.m16107f(context));
            jSONObject.put("vc", C6349m.m16104e(context));
            jSONObject.put("ot", C6349m.m16102d(context));
            jSONObject.put("dm", C6349m.m16091a());
            jSONObject.put("bd", C6349m.m16099c());
            jSONObject.put(VungleApiClient.GAID, C6349m.m16113i());
            int n = C6349m.m16123n(context);
            jSONObject.put("nt", n);
            jSONObject.put("nts", C6349m.m16092a(context, n));
            jSONObject.put("l", C6349m.m16100c(context));
            jSONObject.put("tz", C6349m.m16105e());
            jSONObject.put("ua", C6349m.m16103d());
            jSONObject.put("app_id", C6122a.m15302b().mo42896e());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sv", MBConfiguration.SDK_VERSION);
            jSONObject.put("ss", C6349m.m16111h(context) + "x" + C6349m.m16112i(context));
            if (C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e()) != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(C6349m.m16116k())) {
                        jSONObject2.put("manufacturer", C6349m.m16116k());
                    }
                    if (C6349m.m16110h() != -1) {
                        jSONObject2.put("sdkint", C6349m.m16110h());
                    }
                    if (!TextUtils.isEmpty(C6349m.m16127p(context))) {
                        jSONObject2.put("is24H", C6349m.m16127p(context));
                    }
                    if (!TextUtils.isEmpty(C6349m.m16118l())) {
                        jSONObject2.put("totalram", C6349m.m16118l());
                    }
                    if (!TextUtils.isEmpty(C6349m.m16129q(context))) {
                        jSONObject2.put("totalmemory", C6349m.m16129q(context));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(jSONObject2.toString())) {
                    String a = C6348l.m16087a(jSONObject2.toString());
                    if (!TextUtils.isEmpty(a)) {
                        jSONObject.put("dvi", URLEncoder.encode(a, "utf-8"));
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m16029a(Campaign campaign, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put("label", i);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put("title", campaign.getAppName());
                jSONObject.put("value", jSONObject2);
            } else {
                jSONObject.put("value", "");
            }
        } catch (Exception e) {
            C6361q.m16158d(f15697a, e.getMessage());
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static C6287d m16028a(String str, String str2, Context context, String str3) {
        if (context != null) {
            context = context.getApplicationContext();
        }
        C6287d dVar = new C6287d();
        dVar.mo43870a("m_device_info", m16042b(context, str3));
        dVar.mo43870a("m_action", str);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String a = C6235Aa.m15777a();
                if (a == null) {
                    a = "";
                }
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("channel", a);
                str2 = jSONObject.toString();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        dVar.mo43870a("m_data", str2);
        dVar.mo43870a("m_sdk", "msdk");
        return dVar;
    }

    /* renamed from: a */
    public static C6287d m16024a(Context context) {
        C6287d dVar = new C6287d();
        try {
            dVar.mo43870a("platform", "1");
            dVar.mo43870a(CampaignEx.JSON_KEY_PACKAGE_NAME, URLEncoder.encode(C6349m.m16117k(context)));
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                dVar.mo43870a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
                dVar.mo43870a(ServerParameters.BRAND, URLEncoder.encode(C6349m.m16099c()));
                dVar.mo43870a(ServerParameters.MODEL, URLEncoder.encode(C6349m.m16091a()));
                dVar.mo43870a(VungleApiClient.GAID, C6349m.m16113i());
                int n = C6349m.m16123n(context);
                dVar.mo43870a("network_type", n + "");
                dVar.mo43870a("network_str", C6349m.m16092a(context, n));
                dVar.mo43870a("language", URLEncoder.encode(C6349m.m16100c(context)));
                dVar.mo43870a(TapjoyConstants.TJC_DEVICE_TIMEZONE, URLEncoder.encode(C6349m.m16105e()));
                dVar.mo43870a("ua", URLEncoder.encode(C6349m.m16103d()));
            }
            dVar.mo43870a(ServerParameters.SDK_DATA_SDK_VERSION, MBConfiguration.SDK_VERSION);
            dVar.mo43870a(ServerParameters.APP_VERSION_NAME, URLEncoder.encode(C6349m.m16107f(context)));
            dVar.mo43870a("orientation", URLEncoder.encode(C6349m.m16102d(context) + ""));
            dVar.mo43870a("screen_size", C6349m.m16111h(context) + "x" + C6349m.m16112i(context));
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b == null) {
                b = C6076b.m15089a().mo42748b();
            }
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        if (!TextUtils.isEmpty(C6349m.m16116k())) {
                            jSONObject.put("manufacturer", C6349m.m16116k());
                        }
                        if (C6349m.m16110h() != -1) {
                            jSONObject.put("sdkint", C6349m.m16110h());
                        }
                        if (!TextUtils.isEmpty(C6349m.m16127p(context))) {
                            jSONObject.put("is24H", C6349m.m16127p(context));
                        }
                        if (!TextUtils.isEmpty(C6349m.m16118l())) {
                            jSONObject.put("totalram", C6349m.m16118l());
                        }
                        if (!TextUtils.isEmpty(C6349m.m16129q(context))) {
                            jSONObject.put("totalmemory", C6349m.m16129q(context));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String a = C6348l.m16087a(jSONObject.toString());
                    if (!TextUtils.isEmpty(a)) {
                        dVar.mo43870a("dvi", a);
                    }
                }
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                e3.printStackTrace();
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static C6287d m16025a(Context context, String str) {
        C6287d a = m16024a(context);
        a.mo43870a("app_id", C6122a.m15302b().mo42896e() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                a.mo43870a("data", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    /* renamed from: a */
    public static C6287d m16027a(String str, Context context, String str2) {
        C6287d a = m16024a(context);
        a.mo43870a("app_id", C6122a.m15302b().mo42896e() + "");
        a.mo43870a(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        if (!TextUtils.isEmpty(str)) {
            try {
                a.mo43870a("data", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        a.mo43870a("m_sdk", "msdk");
        return a;
    }

    /* renamed from: a */
    public static C6287d m16026a(String str, Context context) {
        C6287d a = m16024a(context);
        a.mo43870a("app_id", C6122a.m15302b().mo42896e() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                a.mo43870a("data", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        a.mo43870a("m_sdk", "msdk");
        return a;
    }

    /* renamed from: a */
    public static String m16030a(String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("key=" + str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                sb.append("&" + ((String) next.getKey()) + "=" + next.getValue());
            }
        }
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m16041a() {
        try {
            if (System.currentTimeMillis() - 86400000 > ((Long) C6368w.m16234b(C6122a.m15302b().mo42895d(), "privateAuthorityTimesTamp", 0L)).longValue()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static void m16043b() {
        try {
            C6368w.m16233a(C6122a.m15302b().mo42895d(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m16038a(Context context, String str, String str2, boolean z) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000047&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("hb=");
                    stringBuffer.append(z ? 1 : 0);
                    stringBuffer.append("&");
                    stringBuffer.append("reason=" + str);
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                        return;
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    if (context != null && !TextUtils.isEmpty(stringBuffer2)) {
                        new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, m16026a(stringBuffer2, context), new C6327b() {
                            /* renamed from: a */
                            public final void mo43811a(String str) {
                                C6361q.m16158d(C6323d.f15697a, str);
                            }

                            /* renamed from: b */
                            public final void mo43812b(String str) {
                                C6361q.m16158d(C6323d.f15697a, str);
                            }
                        });
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f15697a, e.getMessage());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m16039a(Context context, List<CampaignEx> list, String str, boolean z) {
        if (context != null && list != null) {
            try {
                if (list.size() > 0 && !TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000048&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    CampaignEx campaignEx = list.get(0);
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    if (z) {
                        stringBuffer.append("hb=");
                        stringBuffer.append(1);
                        stringBuffer.append("&");
                    }
                    String requestId = campaignEx.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(requestId);
                        stringBuffer.append("&");
                    }
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    if (!TextUtils.isEmpty(requestIdNotice)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(requestIdNotice);
                        stringBuffer.append("&");
                    }
                    StringBuilder sb = new StringBuilder("rtins_type=");
                    for (int i = 0; i < list.size(); i++) {
                        CampaignEx campaignEx2 = list.get(i);
                        if (i < list.size() - 1) {
                            sb.append(campaignEx2.getRtinsType());
                            sb.append(",");
                        } else {
                            sb.append(campaignEx2.getRtinsType());
                        }
                    }
                    stringBuffer.append(sb);
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m16036a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                C6361q.m16158d(f15697a, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m16032a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=");
                    stringBuffer.append(C6349m.m16123n(context));
                    stringBuffer.append("&");
                    stringBuffer.append("unit_id=");
                    stringBuffer.append(str);
                    stringBuffer.append("&");
                    stringBuffer.append("cid=");
                    stringBuffer.append(campaignEx.getId());
                    stringBuffer.append("&");
                    stringBuffer.append("reason=&");
                    stringBuffer.append("result=2&");
                    if (!TextUtils.isEmpty(str2)) {
                        stringBuffer.append(str2);
                    }
                    if (campaignEx.getAdType() == 287) {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=3&");
                    } else if (campaignEx.getAdType() == 94) {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=1&");
                    } else if (campaignEx.getAdType() == 296) {
                        stringBuffer.append("ad_type=5&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else if (campaignEx.getAdType() == 297) {
                        stringBuffer.append("ad_type=6&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else if (campaignEx.getAdType() == 298) {
                        stringBuffer.append("ad_type=7&");
                        stringBuffer.append("creative=");
                        stringBuffer.append(campaignEx.getCreativeId());
                        stringBuffer.append("&");
                    } else {
                        stringBuffer.append("creative=");
                        stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                        stringBuffer.append("&");
                        stringBuffer.append("ad_type=1&");
                    }
                    stringBuffer.append("devid=");
                    stringBuffer.append(C6349m.m16113i());
                    stringBuffer.append("&");
                    if (campaignEx != null) {
                        if (campaignEx.isBidCampaign()) {
                            stringBuffer.append("hb=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m16036a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m16044b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    stringBuffer.append("devid=" + C6349m.m16113i() + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                        if (campaignEx.getAdType() == 287) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=3&");
                        } else if (campaignEx.getAdType() == 94) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        } else if (campaignEx.getAdType() == 296) {
                            stringBuffer.append("ad_type=5&");
                            stringBuffer.append("creative=" + campaignEx.getCreativeId() + "&");
                        } else if (campaignEx.getAdType() == 297) {
                            stringBuffer.append("ad_type=6&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else if (campaignEx.getAdType() == 298) {
                            stringBuffer.append("ad_type=7&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + "&");
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + "&");
                        } else {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                            stringBuffer.append("ad_type=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append("&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m16036a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m16035a(Context context, CampaignEx campaignEx, String str, String str2, int i, String str3) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000073&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=" + str3 + "&");
                    stringBuffer.append("result=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m16036a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m16033a(Context context, CampaignEx campaignEx, String str, String str2, int i) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000074&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("type=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m16036a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m16034a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000075&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("type=" + i + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                    stringBuffer.append("statue=" + i2 + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m16036a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m16037a(Context context, String str, String str2, int i, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000076&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    stringBuffer.append("reason=" + str3 + "&");
                    stringBuffer.append("result=" + i + "&");
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, "utf-8"));
                    stringBuffer.append(sb.toString());
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m16036a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m16036a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, m16027a(str, context, str2), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6361q.m16158d(C6323d.f15697a, str);
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        C6361q.m16158d(C6323d.f15697a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f15697a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m16040a(String str) {
        C6326a aVar = new C6326a(C6122a.m15302b().mo42895d());
        String str2 = "key=2000088&state=" + str + "&network_type=" + C6349m.m16123n(C6122a.m15302b().mo42895d());
        C6361q.m16158d(f15697a, str2);
        aVar.mo43867c(0, C6280d.m15868c().f15565a, m16027a(str2, C6122a.m15302b().mo42895d(), ""), (C6263e) null);
    }

    /* renamed from: a */
    public static void m16031a(int i, String str, String str2) {
        try {
            C6326a aVar = new C6326a(C6122a.m15302b().mo42895d());
            aVar.mo43867c(0, C6280d.m15868c().f15565a, m16027a("key=" + "2000080" + "&" + "reason=" + str2 + "&" + "ad_type=" + i + "&" + "url=" + URLEncoder.encode(str, "utf-8"), C6122a.m15302b().mo42895d(), ""), (C6263e) null);
        } catch (Exception e) {
            C6361q.m16158d(f15697a, e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m16045b(String str) {
        try {
            C6326a aVar = new C6326a(C6122a.m15302b().mo42895d());
            StringBuilder sb = new StringBuilder();
            sb.append("key=");
            sb.append("2000090");
            sb.append("&");
            sb.append("reason=");
            sb.append(TextUtils.isEmpty(str) ? "" : str);
            sb.append("&");
            sb.append("result=");
            sb.append(!TextUtils.isEmpty(str));
            aVar.mo43867c(0, C6280d.m15868c().f15565a, m16027a(sb.toString(), C6122a.m15302b().mo42895d(), ""), (C6263e) null);
        } catch (Exception e) {
            C6361q.m16158d(f15697a, e.getMessage());
        }
    }
}
