package com.mbridge.msdk.interactiveads.p189f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6158p;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import java.util.List;

/* renamed from: com.mbridge.msdk.interactiveads.f.a */
/* compiled from: ReportUtils */
public final class C6417a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f15968a = "ReportUtils";

    /* renamed from: a */
    public static void m16392a(Context context, String str) {
        if (context != null) {
            try {
                C6158p a = C6158p.m15475a((C6146e) C6148f.m15420a(context));
                if (!TextUtils.isEmpty(str) && a != null && a.mo43038a() > 0) {
                    List<C6203m> a2 = a.mo43040a("2000054");
                    String d = C6203m.m15631d(a.mo43040a("2000043"));
                    String a3 = C6203m.m15625a(a2);
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(a3)) {
                        sb.append(a3);
                    }
                    if (!TextUtils.isEmpty(d)) {
                        sb.append(d);
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        m16393a(context, sb.toString(), str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m16393a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(str, context, str2), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6361q.m16158d(C6417a.f15968a, str);
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        C6361q.m16158d(C6417a.f15968a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f15968a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m16390a(Context context, CampaignEx campaignEx, int i, int i2, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000055&");
                    if (campaignEx != null) {
                        campaignEx.getKeyIaRst();
                    }
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    stringBuffer.append("action=" + i + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                        stringBuffer.append("rid=" + campaignEx.getRequestId() + "&");
                    }
                    stringBuffer.append("ad_type=" + i2);
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m16393a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m16391a(Context context, CampaignEx campaignEx, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000048&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                        if (campaignEx.isBidCampaign()) {
                            stringBuffer.append("hb=");
                            stringBuffer.append(1);
                            stringBuffer.append("&");
                        }
                        if (C6366u.m16209b(campaignEx)) {
                            stringBuffer.append("rtins_type=");
                            stringBuffer.append(campaignEx.getRtinsType());
                            stringBuffer.append("&");
                        }
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                        stringBuffer.append("&");
                        stringBuffer.append("rid=" + campaignEx.getRequestId());
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                        return;
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    if (context != null && !TextUtils.isEmpty(stringBuffer2) && !TextUtils.isEmpty(str)) {
                        new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(stringBuffer2, context, str), new C6327b() {
                            /* renamed from: a */
                            public final void mo43811a(String str) {
                                C6361q.m16158d(C6417a.f15968a, str);
                            }

                            /* renamed from: b */
                            public final void mo43812b(String str) {
                                C6361q.m16158d(C6417a.f15968a, str);
                            }
                        });
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f15968a, e.getMessage());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m16394a(Context context, String str, String str2, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str2)) && (true ^ TextUtils.isEmpty(str))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000047&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (campaignEx != null) {
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                        stringBuffer.append("rid=" + campaignEx.getRequestId() + "&");
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    }
                    if (!TextUtils.isEmpty(C6204a.f15401k)) {
                        stringBuffer.append("b=" + C6204a.f15401k + "&");
                    }
                    if (!TextUtils.isEmpty(C6204a.f15402l)) {
                        stringBuffer.append("c=" + C6204a.f15402l + "&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                        return;
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    if (context != null && !TextUtils.isEmpty(stringBuffer2)) {
                        new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16026a(stringBuffer2, context), new C6327b() {
                            /* renamed from: a */
                            public final void mo43811a(String str) {
                                C6361q.m16158d(C6417a.f15968a, str);
                            }

                            /* renamed from: b */
                            public final void mo43812b(String str) {
                                C6361q.m16158d(C6417a.f15968a, str);
                            }
                        });
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f15968a, e.getMessage());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
