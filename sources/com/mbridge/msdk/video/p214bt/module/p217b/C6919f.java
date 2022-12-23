package com.mbridge.msdk.video.p214bt.module.p217b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import java.net.URLEncoder;

/* renamed from: com.mbridge.msdk.video.bt.module.b.f */
/* compiled from: RewardReport */
public class C6919f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f17064a = C6919f.class.getName();

    /* renamed from: a */
    private static void m17453a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(str, context, str2), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6361q.m16158d(C6919f.f17064a, str);
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        C6361q.m16158d(C6919f.f17064a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f17064a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m17451a(Context context, CampaignEx campaignEx, String str) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=&");
                    stringBuffer.append("result=2&");
                    if (campaignEx == null || campaignEx.getAdType() != 287) {
                        if (campaignEx != null) {
                            if (campaignEx.getAdType() == 94) {
                                stringBuffer.append("ad_type=1&");
                            }
                        }
                        stringBuffer.append("ad_type=1&");
                    } else {
                        stringBuffer.append("ad_type=3&");
                    }
                    stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                    stringBuffer.append("devid=" + C6349m.m16113i() + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m17453a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m17452a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null && campaignEx != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("reason=" + str2 + "&");
                    stringBuffer.append("result=1&");
                    stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                    stringBuffer.append("devid=" + C6349m.m16113i() + "&");
                    if (campaignEx == null || campaignEx.getAdType() != 287) {
                        if (campaignEx != null) {
                            if (campaignEx.getAdType() == 94) {
                                stringBuffer.append("ad_type=1&");
                            }
                        }
                        stringBuffer.append("ad_type=1&");
                    } else {
                        stringBuffer.append("ad_type=3&");
                    }
                    if (campaignEx != null) {
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m17453a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
