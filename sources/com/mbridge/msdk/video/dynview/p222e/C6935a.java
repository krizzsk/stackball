package com.mbridge.msdk.video.dynview.p222e;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6370y;

/* renamed from: com.mbridge.msdk.video.dynview.e.a */
/* compiled from: MOfferReport */
public class C6935a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f17094a = C6935a.class.getName();

    /* renamed from: a */
    public static void m17518a(CampaignEx campaignEx, Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000091&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (!TextUtils.isEmpty(C6204a.f15401k)) {
                        stringBuffer.append("b=" + C6204a.f15401k + "&");
                    }
                    if (!TextUtils.isEmpty(C6204a.f15402l)) {
                        stringBuffer.append("c=" + C6204a.f15402l + "&");
                    }
                    stringBuffer.append("hb=0&");
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (campaignEx != null) {
                        stringBuffer.append("&view=");
                        stringBuffer.append(C6366u.m16221f(campaignEx.getMof_template_url()) ? 1 : 0);
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                        return;
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    if (context != null && !TextUtils.isEmpty(stringBuffer2)) {
                        new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16026a(stringBuffer2, context), new C6327b() {
                            /* renamed from: a */
                            public final void mo43811a(String str) {
                                C6361q.m16158d(C6935a.f17094a, str);
                            }

                            /* renamed from: b */
                            public final void mo43812b(String str) {
                                C6361q.m16158d(C6935a.f17094a, str);
                            }
                        });
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f17094a, e.getMessage());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m17519a(CampaignUnit campaignUnit, int i, int i2, String str) {
        String impressionURL;
        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && campaignUnit.getAds().get(i) != null) {
            String a = C6370y.m16238a(campaignUnit.getAds().get(i).getendcard_url(), "mof_testuid");
            if (TextUtils.isEmpty(a)) {
                a = C6370y.m16238a(campaignUnit.getAds().get(i).getendcard_url(), "mof_uid");
            }
            String str2 = TextUtils.isEmpty(a) ? str : a;
            if (i2 == 0) {
                impressionURL = campaignUnit.getAds().get(i).getImpressionURL();
            } else if (i2 != 1) {
                impressionURL = "";
            } else {
                impressionURL = campaignUnit.getAds().get(i).getOnlyImpressionURL();
            }
            String str3 = impressionURL;
            if (!TextUtils.isEmpty(str3)) {
                C6097a.m15185a(C6122a.m15302b().mo42895d(), campaignUnit.getAds().get(i), str2, str3, false, true);
            }
        }
    }

    /* renamed from: a */
    public static void m17517a(Context context, CampaignEx campaignEx, String str) {
        if (context != null && campaignEx != null) {
            if (!(campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().mo43672g() == null)) {
                C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo43672g(), false, false);
            }
            new C6097a(context, str).mo42838a(campaignEx);
        }
    }
}
