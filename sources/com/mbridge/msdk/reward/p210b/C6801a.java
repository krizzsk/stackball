package com.mbridge.msdk.reward.p210b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
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

/* renamed from: com.mbridge.msdk.reward.b.a */
/* compiled from: RewardReport */
public class C6801a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f16787a = C6801a.class.getName();

    /* renamed from: a */
    public static void m17151a(Context context, String str) {
        if (context != null) {
            try {
                C6158p a = C6158p.m15475a((C6146e) C6148f.m15420a(context));
                if (!TextUtils.isEmpty(str) && a != null && a.mo43038a() > 0) {
                    List<C6203m> a2 = a.mo43040a("2000022");
                    List<C6203m> a3 = a.mo43040a("2000021");
                    List<C6203m> a4 = a.mo43040a("2000039");
                    List<C6203m> a5 = a.mo43040a("2000043");
                    List<C6203m> a6 = a.mo43040a("2000045");
                    List<C6203m> a7 = a.mo43040a("2000044");
                    String b = C6203m.m15627b(a3);
                    String c = C6203m.m15629c(a2);
                    String g = C6203m.m15637g(a4);
                    String d = C6203m.m15631d(a5);
                    String e = C6203m.m15633e(a6);
                    String f = C6203m.m15635f(a7);
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(b)) {
                        sb.append(b);
                    }
                    if (!TextUtils.isEmpty(c)) {
                        sb.append(c);
                    }
                    if (!TextUtils.isEmpty(g)) {
                        sb.append(g);
                    }
                    if (!TextUtils.isEmpty(d)) {
                        sb.append(d);
                    }
                    if (!TextUtils.isEmpty(e)) {
                        sb.append(e);
                    }
                    if (!TextUtils.isEmpty(f)) {
                        sb.append(f);
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        String sb2 = sb.toString();
                        if (context != null && !TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(str)) {
                            try {
                                new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(sb2, context, str), new C6327b() {
                                    /* renamed from: a */
                                    public final void mo43811a(String str) {
                                        C6361q.m16158d(C6801a.f16787a, str);
                                    }

                                    /* renamed from: b */
                                    public final void mo43812b(String str) {
                                        C6361q.m16158d(C6801a.f16787a, str);
                                    }
                                });
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                C6361q.m16158d(f16787a, e2.getMessage());
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m17152a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(str, context, str2), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6361q.m16158d(C6801a.f16787a, str);
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        C6361q.m16158d(C6801a.f16787a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f16787a, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private static void m17155b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new C6326a(context).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16026a(str, context), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6361q.m16158d(C6801a.f16787a, str);
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        C6361q.m16158d(C6801a.f16787a, str);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C6361q.m16158d(f16787a, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m17153a(Context context, List<CampaignEx> list, String str, long j) {
        C6361q.m16154a("test_load_time", "time: " + j);
        if (context != null && list != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=");
                    stringBuffer.append("2000048");
                    stringBuffer.append("&");
                    stringBuffer.append("network_type=");
                    stringBuffer.append(C6349m.m16123n(context));
                    stringBuffer.append("&");
                    stringBuffer.append("unit_id=");
                    stringBuffer.append(str);
                    stringBuffer.append("&");
                    stringBuffer.append("load_time=");
                    stringBuffer.append(j);
                    stringBuffer.append("&");
                    if (list != null && list.size() > 0) {
                        stringBuffer.append("cid=");
                        StringBuilder sb = new StringBuilder("rtins_type=");
                        for (int i = 0; i < list.size(); i++) {
                            CampaignEx campaignEx = list.get(i);
                            if (i < list.size() - 1) {
                                stringBuffer.append(campaignEx.getId());
                                stringBuffer.append(",");
                                sb.append(campaignEx.getRtinsType());
                                sb.append(",");
                            } else {
                                stringBuffer.append(campaignEx.getId());
                                stringBuffer.append("&");
                                sb.append(campaignEx.getRtinsType());
                                sb.append("&");
                                if (campaignEx.isBidCampaign()) {
                                    stringBuffer.append("hb=1&");
                                } else {
                                    stringBuffer.append("hb=0&");
                                }
                            }
                        }
                        stringBuffer.append(sb);
                        CampaignEx campaignEx2 = list.get(0);
                        if (campaignEx2 != null) {
                            stringBuffer.append("rid=");
                            stringBuffer.append(campaignEx2.getRequestId());
                            stringBuffer.append("&view=");
                            stringBuffer.append(C6366u.m16221f(campaignEx2.getMof_template_url()) ? 1 : 0);
                        }
                        String str2 = "";
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            str2 = str2 + list.get(i2).getRequestIdNotice();
                            if (i2 < list.size() - 1) {
                                str2 = str2 + ",";
                            }
                        }
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str2);
                        if (C6301a.m15945a().mo43913c()) {
                            C6301a.m15945a().mo43911a(stringBuffer.toString());
                        } else {
                            m17152a(context, stringBuffer.toString(), str);
                        }
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m17154a(CampaignEx campaignEx, Context context, String str, String str2, boolean z, String str3, String str4) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000047&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (!TextUtils.isEmpty(C6204a.f15401k)) {
                        stringBuffer.append("b=" + C6204a.f15401k + "&");
                    }
                    if (!TextUtils.isEmpty(C6204a.f15402l)) {
                        stringBuffer.append("c=" + C6204a.f15402l + "&");
                    }
                    if (z) {
                        stringBuffer.append("hb=1&");
                    } else {
                        stringBuffer.append("hb=0&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str4);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (campaignEx != null) {
                        stringBuffer.append("&view=");
                        stringBuffer.append(C6366u.m16221f(campaignEx.getMof_template_url()) ? 1 : 0);
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m17155b(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m17150a(Context context, CampaignEx campaignEx, String str) {
        if (context != null && campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000048&");
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    }
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str + "&");
                    if (C6366u.m16209b(campaignEx)) {
                        stringBuffer.append("rtins_type=");
                        stringBuffer.append(campaignEx.getRtinsType());
                        stringBuffer.append("&");
                    }
                    if (campaignEx.isBidCampaign()) {
                        stringBuffer.append("hb=1&");
                    } else {
                        stringBuffer.append("hb=0&");
                    }
                    if (campaignEx != null) {
                        stringBuffer.append("rid=" + campaignEx.getRequestId() + "&");
                        StringBuilder sb = new StringBuilder();
                        sb.append("rid_n=");
                        sb.append(campaignEx.getRequestIdNotice());
                        stringBuffer.append(sb.toString());
                    }
                    if (campaignEx != null) {
                        stringBuffer.append("&view=");
                        stringBuffer.append(C6366u.m16221f(campaignEx.getMof_template_url()) ? 1 : 0);
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m17152a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m17156b(CampaignEx campaignEx, Context context, String str, String str2, boolean z, String str3, String str4) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000047&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (!TextUtils.isEmpty(C6204a.f15401k)) {
                        stringBuffer.append("b=" + C6204a.f15401k + "&");
                    }
                    if (!TextUtils.isEmpty(C6204a.f15402l)) {
                        stringBuffer.append("c=" + C6204a.f15402l + "&");
                    }
                    if (z) {
                        stringBuffer.append("hb=1&");
                    } else {
                        stringBuffer.append("hb=0&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str4);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (campaignEx != null) {
                        stringBuffer.append("&view=");
                        stringBuffer.append(C6366u.m16221f(campaignEx.getMof_template_url()) ? 1 : 0);
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m17155b(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m17157c(CampaignEx campaignEx, Context context, String str, String str2, boolean z, String str3, String str4) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000078&");
                    stringBuffer.append("network_type=" + C6349m.m16123n(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (!TextUtils.isEmpty(C6204a.f15401k)) {
                        stringBuffer.append("b=" + C6204a.f15401k + "&");
                    }
                    if (!TextUtils.isEmpty(C6204a.f15402l)) {
                        stringBuffer.append("c=" + C6204a.f15402l + "&");
                    }
                    if (z) {
                        stringBuffer.append("hb=1&");
                    } else {
                        stringBuffer.append("hb=0&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str4);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (campaignEx != null) {
                        stringBuffer.append("&view=");
                        stringBuffer.append(C6366u.m16221f(campaignEx.getMof_template_url()) ? 1 : 0);
                    }
                    if (C6301a.m15945a().mo43913c()) {
                        C6301a.m15945a().mo43911a(stringBuffer.toString());
                    } else {
                        m17155b(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
