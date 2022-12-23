package com.mbridge.msdk.video.module.p233b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.same.report.p183d.C6326a;
import com.mbridge.msdk.foundation.same.report.p183d.C6327b;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.module.p234c.C7049a;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.module.b.a */
/* compiled from: VideoViewReport */
public final class C7047a {

    /* renamed from: a */
    public static HashMap<String, ArrayList<String>> f17543a = new HashMap<>();

    /* renamed from: a */
    public static void m17791a(String str) {
        f17543a.remove(str);
    }

    /* renamed from: a */
    public static void m17792a(String str, String str2) {
        try {
            if (C6122a.m15302b().mo42895d() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                new C6326a(C6122a.m15302b().mo42895d()).mo43867c(0, C6280d.m15868c().f15565a, C6323d.m16027a(str, C6122a.m15302b().mo42895d(), str2), new C6327b() {
                    /* renamed from: a */
                    public final void mo43811a(String str) {
                        C6361q.m16158d("VideoViewReport", str);
                    }

                    /* renamed from: b */
                    public final void mo43812b(String str) {
                        C6361q.m16158d("VideoViewReport", str);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            C6361q.m16158d("VideoViewReport", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m17785a(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43680k() != null) {
            C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo43680k(), false, false);
        }
    }

    /* renamed from: b */
    public static void m17793b(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43668e() != null) {
            C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo43668e(), false, false);
        }
    }

    /* renamed from: c */
    public static void m17794c(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43670f() != null) {
            C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo43670f(), false, false);
        }
    }

    /* renamed from: d */
    public static void m17795d(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43672g() != null) {
            String campaignUnitId = campaignEx.getCampaignUnitId();
            ArrayList arrayList = f17543a.get(campaignUnitId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                f17543a.put(campaignUnitId, arrayList);
            }
            if (!arrayList.contains(campaignEx.getId())) {
                C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo43672g(), false, false);
                arrayList.add(campaignEx.getId());
            }
        }
    }

    /* renamed from: a */
    public static void m17786a(Context context, CampaignEx campaignEx, int i, int i2) {
        String str;
        try {
            String[] l = campaignEx.getNativeVideoTracking().mo43682l();
            if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && l != null) {
                String[] strArr = new String[l.length];
                for (int i3 = 0; i3 < l.length; i3++) {
                    String str2 = l[i3];
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("endscreen_type", i);
                    String jSONObject2 = jSONObject.toString();
                    String str3 = str2 + "&value=" + URLEncoder.encode(C6348l.m16087a(jSONObject2));
                    if (campaignEx.getSpareOfferFlag() == 1) {
                        str = str3 + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2;
                    } else {
                        str = str3 + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i2;
                    }
                    strArr[i3] = str;
                }
                C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
            }
        } catch (Throwable unused) {
            C6361q.m16158d("VideoViewReport", "reportEndcardshowData error");
        }
    }

    /* renamed from: e */
    public static void m17796e(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43684m() != null) {
            C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo43684m(), false, false);
        }
    }

    /* renamed from: f */
    public static void m17797f(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo43674h() != null) {
            C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo43674h(), false, false);
        }
    }

    /* renamed from: a */
    public static void m17787a(Context context, CampaignEx campaignEx, int i, int i2, int i3) {
        String str;
        int i4 = i3;
        if (i2 != 0 && context != null && campaignEx != null) {
            try {
                List<Map<Integer, String>> d = campaignEx.getNativeVideoTracking().mo43665d();
                int i5 = ((i + 1) * 100) / i2;
                if (d != null) {
                    int i6 = 0;
                    while (i6 < d.size()) {
                        Map map = d.get(i6);
                        if (map != null && map.size() > 0) {
                            Iterator it = map.entrySet().iterator();
                            int i7 = i6;
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                int intValue = ((Integer) entry.getKey()).intValue();
                                String str2 = (String) entry.getValue();
                                if (campaignEx.getSpareOfferFlag() == 1) {
                                    str = str2 + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i4;
                                } else {
                                    str = str2 + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i4;
                                }
                                if (intValue <= i5 && !TextUtils.isEmpty(str)) {
                                    C6097a.m15186a(context, campaignEx, campaignEx.getCampaignUnitId(), new String[]{str}, false, true);
                                    it.remove();
                                    d.remove(i7);
                                    i7--;
                                }
                            }
                            i6 = i7;
                        }
                        i6++;
                    }
                }
            } catch (Throwable unused) {
                C6361q.m16158d("VideoViewReport", "reportPlayPercentageData error");
            }
        }
    }

    /* renamed from: a */
    public static void m17790a(CampaignEx campaignEx, Map<Integer, String> map, String str, int i) {
        if (campaignEx != null && map != null) {
            try {
                if (map.size() > 0) {
                    Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        String str2 = (String) next.getValue();
                        if (i == ((Integer) next.getKey()).intValue() && !TextUtils.isEmpty(str2)) {
                            C6097a.m15185a(C6122a.m15302b().mo42895d(), campaignEx, str, str2, false, false);
                            it.remove();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m17789a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAdUrlList() != null && campaignEx.getAdUrlList().size() > 0) {
                    for (String next : campaignEx.getAdUrlList()) {
                        if (!TextUtils.isEmpty(next)) {
                            C6097a.m15185a(C6122a.m15302b().mo42895d(), campaignEx, str, next, false, false);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m17788a(CampaignEx campaignEx, C7170c cVar, String str, String str2, String str3) {
        String str4 = "&";
        String str5 = "";
        if (campaignEx != null && cVar != null) {
            try {
                C7049a aVar = new C7049a(C6122a.m15302b().mo42895d());
                C6287d dVar = new C6287d();
                dVar.mo43870a("user_id", C6348l.m16087a(str2));
                dVar.mo43870a("cb_type", "1");
                dVar.mo43870a(CampaignEx.JSON_KEY_REWARD_NAME, cVar.mo49082a());
                dVar.mo43870a(CampaignEx.JSON_KEY_REWARD_AMOUNT, cVar.mo49085b() + str5);
                dVar.mo43870a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                dVar.mo43870a("click_id", campaignEx.getRequestIdNotice());
                if (!TextUtils.isEmpty(str3)) {
                    dVar.mo43870a("extra", str3);
                }
                aVar.mo42743a(str5, dVar);
                String str6 = campaignEx.getHost() + "/addReward?";
                String trim = dVar.mo43868a().trim();
                if (!TextUtils.isEmpty(trim)) {
                    if (!str6.endsWith("?") && !str6.endsWith(str4)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str6);
                        if (!str6.contains("?")) {
                            str4 = "?";
                        }
                        sb.append(str4);
                        str6 = sb.toString();
                    }
                    str5 = str6 + trim;
                }
                String str7 = str5;
                C6361q.m16158d("VideoViewReport", "rewardUrl:" + str7);
                C6097a.m15185a(C6122a.m15302b().mo42895d(), campaignEx, campaignEx.getCampaignUnitId(), str7, false, false);
            } catch (Throwable th) {
                C6361q.m16155a("VideoViewReport", th.getMessage(), th);
            }
        }
    }
}
