package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ft0 {

    /* renamed from: a */
    private final C14444r9 f33733a;

    /* renamed from: b */
    private final fj0 f33734b;

    /* renamed from: c */
    private final vg1 f33735c = new vg1();

    /* renamed from: d */
    private final qd0 f33736d;

    /* renamed from: e */
    private final C14835uu f33737e;

    /* renamed from: f */
    private final nd0 f33738f;

    public ft0(Context context) {
        fj0 fj0 = new fj0();
        this.f33734b = fj0;
        this.f33733a = new C14444r9(context, fj0);
        this.f33736d = new qd0();
        this.f33737e = new C14835uu();
        this.f33738f = new nd0();
    }

    /* renamed from: b */
    private List<String> m36304b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("renderTrackingUrls");
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<k81> m36305d(JSONObject jSONObject) throws JSONException, xr0 {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("showNotices");
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(mo67082c(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x01a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0197 A[LOOP:1: B:10:0x0050->B:70:0x0197, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.as0 mo67081a(java.lang.String r21) throws org.json.JSONException, com.yandex.mobile.ads.impl.xr0 {
        /*
            r20 = this;
            r1 = r20
            org.json.JSONObject r0 = new org.json.JSONObject
            r2 = r21
            r0.<init>(r2)
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Class<com.yandex.mobile.ads.impl.as0> r4 = com.yandex.mobile.ads.impl.as0.class
            java.lang.Object r3 = com.yandex.mobile.ads.impl.h31.m36785a(r4, (java.lang.Object[]) r3)
            com.yandex.mobile.ads.impl.as0 r3 = (com.yandex.mobile.ads.impl.as0) r3
            java.lang.String r4 = "Native Ad json has not required attributes"
            if (r3 == 0) goto L_0x02da
            java.lang.String r6 = "native"
            org.json.JSONObject r6 = r0.getJSONObject(r6)
            java.lang.String r7 = "ads"
            java.lang.String[] r0 = new java.lang.String[]{r7}
            boolean r0 = com.yandex.mobile.ads.impl.gt0.m36700a(r6, r0)
            if (r0 == 0) goto L_0x02d4
            java.util.Iterator r8 = r6.keys()
        L_0x002e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02da
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r9 = r7.equals(r0)
            java.lang.String r10 = "renderTrackingUrls"
            java.lang.String r11 = "showNotices"
            java.lang.String r12 = "assets"
            if (r9 == 0) goto L_0x01b7
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            org.json.JSONArray r14 = r6.getJSONArray(r7)
            r15 = 0
        L_0x0050:
            int r0 = r14.length()
            if (r15 >= r0) goto L_0x01af
            org.json.JSONObject r5 = r14.getJSONObject(r15)
            java.lang.String r2 = "adType"
            java.lang.String r13 = "link"
            java.lang.String[] r0 = new java.lang.String[]{r2, r12, r13}
            boolean r0 = com.yandex.mobile.ads.impl.gt0.m36700a(r5, r0)
            if (r0 == 0) goto L_0x01a9
            r16 = r7
            com.yandex.mobile.ads.impl.pq0 r7 = new com.yandex.mobile.ads.impl.pq0
            r7.<init>()
            java.util.Iterator r17 = r5.keys()
        L_0x0073:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r17.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r18 = r2.equals(r0)
            if (r18 == 0) goto L_0x008d
            java.lang.String r0 = m36302a(r5, r0)
            r7.mo69414d(r0)
            goto L_0x0073
        L_0x008d:
            boolean r18 = r12.equals(r0)
            if (r18 == 0) goto L_0x009b
            java.util.List r0 = r1.m36303a((org.json.JSONObject) r5)
            r7.mo69412c((java.util.List<com.yandex.mobile.ads.impl.C13690k9>) r0)
            goto L_0x0073
        L_0x009b:
            boolean r18 = r13.equals(r0)
            if (r18 == 0) goto L_0x00b3
            org.json.JSONObject r0 = r5.getJSONObject(r0)
            r18 = r2
            com.yandex.mobile.ads.impl.fj0 r2 = r1.f33734b
            com.yandex.mobile.ads.impl.ej0 r0 = r2.mo67022a(r0)
            r7.mo69401a((com.yandex.mobile.ads.impl.ej0) r0)
        L_0x00b0:
            r2 = r18
            goto L_0x0073
        L_0x00b3:
            r18 = r2
            java.lang.String r2 = "showNotice"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00c9
            org.json.JSONObject r0 = r5.getJSONObject(r0)
            com.yandex.mobile.ads.impl.k81 r0 = r1.mo67082c(r0)
            r7.mo69402a((com.yandex.mobile.ads.impl.k81) r0)
            goto L_0x00b0
        L_0x00c9:
            boolean r2 = r11.equals(r0)
            if (r2 == 0) goto L_0x00d7
            java.util.List r0 = r1.m36305d(r5)
            r7.mo69409b((java.util.List<com.yandex.mobile.ads.impl.k81>) r0)
            goto L_0x00b0
        L_0x00d7:
            java.lang.String r2 = "info"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00e8
            r2 = 0
            java.lang.String r0 = r5.optString(r0, r2)
            r7.mo69416e(r0)
            goto L_0x00b0
        L_0x00e8:
            java.lang.String r2 = "hideConditions"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00fd
            com.yandex.mobile.ads.impl.bh r2 = new com.yandex.mobile.ads.impl.bh
            r2.<init>()
            com.yandex.mobile.ads.impl.y60 r0 = r2.mo66070a(r5, r0)
            r7.mo69403a((com.yandex.mobile.ads.impl.y60) r0)
            goto L_0x00b0
        L_0x00fd:
            java.lang.String r2 = "showConditions"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0112
            com.yandex.mobile.ads.impl.bh r2 = new com.yandex.mobile.ads.impl.bh
            r2.<init>()
            com.yandex.mobile.ads.impl.y60 r0 = r2.mo66070a(r5, r0)
            r7.mo69408b((com.yandex.mobile.ads.impl.y60) r0)
            goto L_0x00b0
        L_0x0112:
            java.lang.String r2 = "renderTrackingUrl"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0124
            com.yandex.mobile.ads.impl.vg1 r2 = r1.f33735c
            java.lang.String r0 = r2.mo70490a(r5, r0)
            r7.mo69404a((java.lang.String) r0)
            goto L_0x00b0
        L_0x0124:
            boolean r2 = r10.equals(r0)
            if (r2 == 0) goto L_0x0133
            java.util.List r0 = r1.m36304b(r5)
            r7.mo69405a((java.util.List<java.lang.String>) r0)
            goto L_0x00b0
        L_0x0133:
            java.lang.String r2 = "id"
            boolean r19 = r2.equals(r0)
            if (r19 == 0) goto L_0x0146
            r19 = r8
            r8 = 0
            java.lang.String r0 = r5.optString(r2, r8)
            r7.mo69411c((java.lang.String) r0)
            goto L_0x016e
        L_0x0146:
            r19 = r8
            r8 = 0
            java.lang.String r2 = "impressionData"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x016e
            com.yandex.mobile.ads.impl.qd0 r0 = r1.f33736d
            r0.getClass()
            java.lang.String r0 = m36302a(r5, r2)     // Catch:{ Exception -> 0x0160 }
            com.yandex.mobile.ads.common.AdImpressionData r2 = new com.yandex.mobile.ads.common.AdImpressionData     // Catch:{ Exception -> 0x0160 }
            r2.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0160 }
            goto L_0x016b
        L_0x0160:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "ImpressionDataParser"
            android.util.Log.e(r2, r0)
            r2 = r8
        L_0x016b:
            r7.mo69400a((com.yandex.mobile.ads.common.AdImpressionData) r2)
        L_0x016e:
            r2 = r18
            r8 = r19
            goto L_0x0073
        L_0x0174:
            r19 = r8
            r8 = 0
            java.util.List r0 = r7.mo69407b()
            com.yandex.mobile.ads.impl.ej0 r2 = r7.mo69415e()
            com.yandex.mobile.ads.nativeads.m0 r5 = r7.mo69419g()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0194
            if (r2 == 0) goto L_0x018d
            r0 = 1
            goto L_0x018e
        L_0x018d:
            r0 = 0
        L_0x018e:
            if (r0 == 0) goto L_0x0194
            if (r5 == 0) goto L_0x0194
            r0 = 1
            goto L_0x0195
        L_0x0194:
            r0 = 0
        L_0x0195:
            if (r0 == 0) goto L_0x01a3
            r9.add(r7)
            int r15 = r15 + 1
            r7 = r16
            r8 = r19
            r2 = 0
            goto L_0x0050
        L_0x01a3:
            com.yandex.mobile.ads.impl.xr0 r0 = new com.yandex.mobile.ads.impl.xr0
            r0.<init>(r4)
            throw r0
        L_0x01a9:
            com.yandex.mobile.ads.impl.xr0 r0 = new com.yandex.mobile.ads.impl.xr0
            r0.<init>(r4)
            throw r0
        L_0x01af:
            r16 = r7
            r19 = r8
            r3.mo65857c(r9)
            goto L_0x01d9
        L_0x01b7:
            r16 = r7
            r19 = r8
            r8 = 0
            boolean r2 = r12.equals(r0)
            if (r2 == 0) goto L_0x01dc
            java.util.List r0 = r1.m36303a((org.json.JSONObject) r6)
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01d1
            r13 = r8
            goto L_0x01d2
        L_0x01d1:
            r13 = r0
        L_0x01d2:
            r3.mo65853a((java.util.List<com.yandex.mobile.ads.impl.C13690k9>) r13)
        L_0x01d5:
            r7 = r16
            r8 = r19
        L_0x01d9:
            r2 = 0
            goto L_0x002e
        L_0x01dc:
            java.lang.String r2 = "settings"
            boolean r5 = r2.equals(r0)
            if (r5 == 0) goto L_0x023d
            r5 = 0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Class<com.yandex.mobile.ads.impl.d81> r7 = com.yandex.mobile.ads.impl.d81.class
            java.lang.Object r0 = com.yandex.mobile.ads.impl.h31.m36785a(r7, (java.lang.Object[]) r0)
            com.yandex.mobile.ads.impl.d81 r0 = (com.yandex.mobile.ads.impl.d81) r0
            if (r0 == 0) goto L_0x0239
            org.json.JSONObject r2 = r6.getJSONObject(r2)
            java.util.Iterator r7 = r2.keys()
        L_0x01f9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0239
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "templateType"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x0215
            java.lang.String r8 = m36302a(r2, r8)
            r0.mo66528a((java.lang.String) r8)
            goto L_0x01f9
        L_0x0215:
            java.lang.String r9 = "highlightingEnabled"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x0225
            boolean r8 = r2.getBoolean(r8)
            r0.mo66529a((boolean) r8)
            goto L_0x01f9
        L_0x0225:
            java.lang.String r9 = "multiBannerAutoScrollInterval"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x01f9
            long r8 = r2.getLong(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0.mo66527a((java.lang.Long) r8)
            goto L_0x01f9
        L_0x0239:
            r3.mo65850a((com.yandex.mobile.ads.impl.d81) r0)
            goto L_0x01d5
        L_0x023d:
            r5 = 0
            boolean r2 = r11.equals(r0)
            if (r2 == 0) goto L_0x024c
            java.util.List r0 = r1.m36305d(r6)
            r3.mo65861e(r0)
            goto L_0x01d5
        L_0x024c:
            java.lang.String r2 = "ver"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x025d
            java.lang.String r0 = m36302a(r6, r0)
            r3.mo65851a((java.lang.String) r0)
            goto L_0x01d5
        L_0x025d:
            boolean r2 = r10.equals(r0)
            if (r2 == 0) goto L_0x026c
            java.util.List r0 = r1.m36304b(r6)
            r3.mo65859d(r0)
            goto L_0x01d5
        L_0x026c:
            java.lang.String r2 = "designs"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01d5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.json.JSONArray r2 = r6.getJSONArray(r2)
            r7 = 0
        L_0x027e:
            int r9 = r2.length()
            if (r7 >= r9) goto L_0x02cf
            org.json.JSONObject r9 = r2.getJSONObject(r7)
            java.lang.String r10 = "type"
            boolean r11 = r9.has(r10)
            if (r11 == 0) goto L_0x02cc
            java.lang.String r11 = "layout"
            boolean r12 = r9.has(r11)
            if (r12 == 0) goto L_0x02cc
            java.lang.String r12 = "target"
            boolean r13 = r9.has(r12)
            if (r13 == 0) goto L_0x02cc
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r12 = r9.getString(r12)
            java.lang.String r11 = r9.getString(r11)
            java.lang.String r13 = "images"
            org.json.JSONArray r9 = r9.optJSONArray(r13)
            if (r9 == 0) goto L_0x02bb
            com.yandex.mobile.ads.impl.nd0 r13 = r1.f33738f
            java.util.List r9 = r13.mo69024a(r9)
            goto L_0x02bc
        L_0x02bb:
            r9 = r8
        L_0x02bc:
            com.yandex.mobile.ads.impl.dl r13 = new com.yandex.mobile.ads.impl.dl
            r13.<init>(r10, r12, r11, r9)
            com.yandex.mobile.ads.impl.uu r9 = r1.f33737e
            com.yandex.mobile.ads.impl.ru r9 = r9.mo70407a(r13)
            if (r9 == 0) goto L_0x02cc
            r0.add(r9)
        L_0x02cc:
            int r7 = r7 + 1
            goto L_0x027e
        L_0x02cf:
            r3.mo65855b(r0)
            goto L_0x01d5
        L_0x02d4:
            com.yandex.mobile.ads.impl.xr0 r0 = new com.yandex.mobile.ads.impl.xr0
            r0.<init>(r4)
            throw r0
        L_0x02da:
            r5 = 0
            if (r3 == 0) goto L_0x02ea
            java.util.List r0 = r3.mo65856c()
            if (r0 == 0) goto L_0x02ea
            boolean r0 = r0.isEmpty()
            r2 = 1
            r2 = r2 ^ r0
            goto L_0x02eb
        L_0x02ea:
            r2 = 0
        L_0x02eb:
            if (r2 == 0) goto L_0x02ee
            return r3
        L_0x02ee:
            com.yandex.mobile.ads.impl.xr0 r0 = new com.yandex.mobile.ads.impl.xr0
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ft0.mo67081a(java.lang.String):com.yandex.mobile.ads.impl.as0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public k81 mo67082c(JSONObject jSONObject) throws xr0, JSONException {
        if (gt0.m36700a(jSONObject, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY, "url")) {
            k81 k81 = new k81();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY.equals(next)) {
                    k81.mo68160a(jSONObject.getLong(next));
                } else if ("url".equals(next)) {
                    k81.mo68161a(this.f33735c.mo70490a(jSONObject, next));
                } else if ("visibilityPercent".equals(next)) {
                    k81.mo68159a(Math.max(Math.min(jSONObject.optInt(next, 0), 100), 0));
                }
            }
            return k81;
        }
        throw new xr0("Native Ad json has not required attributes");
    }

    /* renamed from: a */
    private List<C13690k9> m36303a(JSONObject jSONObject) throws JSONException, xr0 {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            boolean z = jSONObject2.getBoolean(CompanionAds.REQUIRED);
            try {
                arrayList.add(this.f33733a.mo69704a(jSONObject2));
            } catch (xr0 | JSONException e) {
                if (z) {
                    throw e;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m36302a(JSONObject jSONObject, String str) throws JSONException, xr0 {
        String string = jSONObject.getString(str);
        if (!TextUtils.isEmpty(string) && !"null".equals(string)) {
            return string;
        }
        throw new xr0("Native Ad json has not required attributes");
    }
}
