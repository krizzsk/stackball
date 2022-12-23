package com.mbridge.msdk.mbbanner.common.util;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.C6196f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.same.p169d.C6224a;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class BannerUtils {
    private static final String TAG = BannerUtils.class.getSimpleName();

    public static String getCloseIds(String str) {
        List list;
        try {
            if (C6208d.f15419b == null) {
                return "";
            }
            Map<String, List<C6224a>> map = C6208d.f15419b;
            if (!C6369x.m16236b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                C6224a aVar = (C6224a) list.get(i);
                jSONObject.put(BidResponsedEx.KEY_CID, aVar.mo43801a());
                jSONObject.put("crid", aVar.mo43803c());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void inserCloseId(String str, List<CampaignEx> list) {
        Map<String, List<C6224a>> map = C6208d.f15419b;
        if (map != null && list != null && list.size() > 0) {
            if (C6369x.m16236b(str)) {
                if (map.containsKey(str)) {
                    map.put(str, fillIdInList(map.get(str), list));
                } else {
                    map.put(str, fillIdInList(new ArrayList(), list));
                }
            }
            C6208d.f15419b = map;
        }
    }

    private static synchronized List<C6224a> fillIdInList(List<C6224a> list, List<CampaignEx> list2) {
        synchronized (BannerUtils.class) {
            if (list2 != null) {
                if (list2.size() > 0) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    for (CampaignEx next : list2) {
                        if (next != null) {
                            C6224a aVar = new C6224a(next.getId(), next.getCreativeId());
                            if (list.size() >= 20) {
                                list.remove(0);
                            }
                            list.add(aVar);
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void uisList(Context context, List<CampaignEx> list) {
        if (context != null && list != null && list.size() != 0) {
            C6152j a = C6152j.m15441a((C6146e) C6148f.m15420a(context));
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = list.get(i);
                if (a != null && !a.mo43013a(campaignEx.getId())) {
                    C6196f fVar = new C6196f();
                    fVar.mo43631a(campaignEx.getId());
                    fVar.mo43629a(campaignEx.getFca());
                    fVar.mo43633b(campaignEx.getFcb());
                    fVar.mo43637d(0);
                    fVar.mo43635c(0);
                    fVar.mo43630a(System.currentTimeMillis());
                    a.mo43012a(fVar);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:46|44|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x011c */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0122 A[Catch:{ JSONException -> 0x0143 }, LOOP:1: B:43:0x011c->B:46:0x0122, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.mbridge.msdk.foundation.entity.CampaignEx managerCampaignEX(java.lang.String r7, com.mbridge.msdk.foundation.entity.CampaignEx r8) {
        /*
            java.lang.String r0 = "deep_link"
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x0009
            return r8
        L_0x0009:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x0015
            if (r8 == 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            r8 = 0
            goto L_0x0147
        L_0x0015:
            java.lang.String r1 = "notice"
            boolean r1 = r7.contains(r1)
            java.lang.String r2 = "unitId"
            if (r1 != 0) goto L_0x0104
            org.json.JSONObject r0 = com.mbridge.msdk.foundation.entity.CampaignEx.campaignToJsonObject(r8)     // Catch:{ JSONException -> 0x0147 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r0)     // Catch:{ JSONException -> 0x0147 }
            if (r1 != 0) goto L_0x002a
            r1 = r8
        L_0x002a:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0147 }
            if (r3 != 0) goto L_0x0102
            java.lang.String r0 = r0.optString(r2)     // Catch:{ JSONException -> 0x0147 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0147 }
            if (r2 != 0) goto L_0x003d
            r1.setCampaignUnitId(r0)     // Catch:{ JSONException -> 0x0147 }
        L_0x003d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0147 }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r7 = com.mbridge.msdk.foundation.same.C6204a.f15397g     // Catch:{ JSONException -> 0x0147 }
            org.json.JSONObject r7 = r0.optJSONObject(r7)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r0 = "-999"
            if (r7 == 0) goto L_0x008b
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ JSONException -> 0x0147 }
            android.content.Context r0 = r0.mo42895d()     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C6204a.f15395e     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ JSONException -> 0x0147 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0147 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0147 }
            float r2 = (float) r2     // Catch:{ JSONException -> 0x0147 }
            int r0 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r0, (float) r2)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0147 }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ JSONException -> 0x0147 }
            android.content.Context r2 = r2.mo42895d()     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C6204a.f15396f     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r3 = r7.getString(r3)     // Catch:{ JSONException -> 0x0147 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x0147 }
            int r3 = r3.intValue()     // Catch:{ JSONException -> 0x0147 }
            float r3 = (float) r3     // Catch:{ JSONException -> 0x0147 }
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r2, (float) r3)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ JSONException -> 0x0147 }
            goto L_0x008c
        L_0x008b:
            r2 = r0
        L_0x008c:
            java.lang.String r3 = r1.getClickURL()     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r0 = com.mbridge.msdk.click.C6103b.m15223a((java.lang.String) r3, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ JSONException -> 0x0147 }
            r1.setClickURL(r0)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r0 = r1.getNoticeUrl()     // Catch:{ JSONException -> 0x0147 }
            if (r7 == 0) goto L_0x0102
            java.util.Iterator r2 = r7.keys()     // Catch:{ JSONException -> 0x0147 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0147 }
            r3.<init>()     // Catch:{ JSONException -> 0x0147 }
        L_0x00a6:
            boolean r4 = r2.hasNext()     // Catch:{ JSONException -> 0x0147 }
            if (r4 == 0) goto L_0x00f0
            java.lang.String r4 = "&"
            r3.append(r4)     // Catch:{ JSONException -> 0x0147 }
            java.lang.Object r4 = r2.next()     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r5 = r7.optString(r4)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C6204a.f15395e     // Catch:{ JSONException -> 0x0147 }
            boolean r6 = r6.equals(r4)     // Catch:{ JSONException -> 0x0147 }
            if (r6 != 0) goto L_0x00cb
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C6204a.f15396f     // Catch:{ JSONException -> 0x0147 }
            boolean r6 = r6.equals(r4)     // Catch:{ JSONException -> 0x0147 }
            if (r6 == 0) goto L_0x00e4
        L_0x00cb:
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ JSONException -> 0x0147 }
            android.content.Context r6 = r6.mo42895d()     // Catch:{ JSONException -> 0x0147 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0147 }
            int r5 = r5.intValue()     // Catch:{ JSONException -> 0x0147 }
            float r5 = (float) r5     // Catch:{ JSONException -> 0x0147 }
            int r5 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r6, (float) r5)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x0147 }
        L_0x00e4:
            r3.append(r4)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r4 = "="
            r3.append(r4)     // Catch:{ JSONException -> 0x0147 }
            r3.append(r5)     // Catch:{ JSONException -> 0x0147 }
            goto L_0x00a6
        L_0x00f0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0147 }
            r7.<init>()     // Catch:{ JSONException -> 0x0147 }
            r7.append(r0)     // Catch:{ JSONException -> 0x0147 }
            r7.append(r3)     // Catch:{ JSONException -> 0x0147 }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x0147 }
            r1.setNoticeUrl(r7)     // Catch:{ JSONException -> 0x0147 }
        L_0x0102:
            r8 = r1
            goto L_0x0147
        L_0x0104:
            org.json.JSONObject r1 = com.mbridge.msdk.foundation.entity.CampaignEx.campaignToJsonObject(r8)     // Catch:{ JSONException -> 0x0143 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0143 }
            r3.<init>(r7)     // Catch:{ JSONException -> 0x0143 }
            java.util.Iterator r7 = r3.keys()     // Catch:{ JSONException -> 0x0143 }
            boolean r4 = r3.has(r0)     // Catch:{ Exception -> 0x011c }
            if (r4 != 0) goto L_0x011c
            java.lang.String r4 = ""
            r1.put(r0, r4)     // Catch:{ Exception -> 0x011c }
        L_0x011c:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x0143 }
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r7.next()     // Catch:{ JSONException -> 0x0143 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0143 }
            java.lang.String r4 = r3.getString(r0)     // Catch:{ JSONException -> 0x0143 }
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x0143 }
            goto L_0x011c
        L_0x0130:
            com.mbridge.msdk.foundation.entity.CampaignEx r7 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r1)     // Catch:{ JSONException -> 0x0143 }
            java.lang.String r0 = r1.optString(r2)     // Catch:{ JSONException -> 0x0143 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0143 }
            if (r1 != 0) goto L_0x0141
            r7.setCampaignUnitId(r0)     // Catch:{ JSONException -> 0x0143 }
        L_0x0141:
            r8 = r7
            goto L_0x0147
        L_0x0143:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0147:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.util.BannerUtils.managerCampaignEX(java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.foundation.entity.CampaignEx");
    }
}
