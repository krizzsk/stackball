package com.mbridge.msdk.video.signal.p235a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6203m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6158p;
import com.mbridge.msdk.foundation.tools.C6331b;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6368w;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.videocommon.p239d.C7176a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.j */
/* compiled from: JSCommon */
public final class C7062j extends C7053c {

    /* renamed from: n */
    private Activity f17564n;

    /* renamed from: o */
    private String f17565o;

    /* renamed from: p */
    private String f17566p;

    /* renamed from: q */
    private CampaignEx f17567q;

    /* renamed from: r */
    private List<CampaignEx> f17568r;

    /* renamed from: s */
    private int f17569s;

    /* renamed from: t */
    private String f17570t = "";

    /* renamed from: u */
    private String f17571u = "";

    /* renamed from: v */
    private boolean f17572v = false;

    /* renamed from: w */
    private boolean f17573w = false;

    /* renamed from: a */
    public final void mo48838a(CampaignEx campaignEx) {
        this.f17567q = campaignEx;
    }

    /* renamed from: a */
    public final void mo48839a(List<CampaignEx> list) {
        this.f17568r = list;
    }

    /* renamed from: c */
    public final void mo48841c(boolean z) {
        this.f17572v = z;
    }

    public C7062j(Activity activity, CampaignEx campaignEx) {
        this.f17564n = activity;
        this.f17567q = campaignEx;
    }

    public C7062j(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f17564n = activity;
        this.f17567q = campaignEx;
        this.f17568r = list;
    }

    /* renamed from: n */
    public final void mo48845n() {
        this.f17565o = "";
    }

    /* renamed from: c */
    public final void mo48840c(String str) {
        this.f17570t = str;
    }

    /* renamed from: d */
    public final void mo48842d(String str) {
        this.f17571u = str;
    }

    /* renamed from: o */
    public final int mo48846o() {
        return this.f17569s;
    }

    /* renamed from: i */
    public final void mo48844i(int i) {
        this.f17569s = i;
    }

    /* renamed from: d */
    public final void mo48843d(boolean z) {
        this.f17573w = z;
    }

    /* renamed from: c */
    public final String mo48812c() {
        this.f17556l.mo48316a();
        this.f17545a = true;
        if (TextUtils.isEmpty(this.f17565o)) {
            this.f17565o = m17878p();
        }
        return this.f17565o;
    }

    /* renamed from: p */
    private String m17878p() {
        JSONObject jSONObject = new JSONObject();
        C6331b bVar = new C6331b(C6122a.m15302b().mo42895d());
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17553i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.f17570t);
            jSONObject2.put("rootViewInstanceId", this.f17571u);
            jSONObject2.put("isRootTemplateWebView", this.f17572v);
            jSONObject.put("sdk_info", "MAL_15.7.21,3.0.1");
            jSONObject2.put("playVideoMute", this.f17557m);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", bVar.mo43936a());
            JSONArray jSONArray = new JSONArray();
            if (this.f17568r == null || this.f17568r.size() <= 0) {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f17567q));
            } else {
                for (CampaignEx next : this.f17568r) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(next, next.isReady(), m17877b(next)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m17887y());
            String c = C6076b.m15089a().mo42752c(C6122a.m15302b().mo42896e());
            if (!TextUtils.isEmpty(c)) {
                JSONObject jSONObject3 = new JSONObject(c);
                m17875a(jSONObject3);
                String d = C6076b.m15089a().mo42754d(this.f17553i);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject3.put("ivreward", new JSONObject(d));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", m17888z());
            if (!TextUtils.isEmpty(this.f17553i)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17553i);
            }
            jSONObject.put("rw_plus", this.f17573w ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private void m17875a(JSONObject jSONObject) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            String obj = C6368w.m16234b(d, "MBridge_ConfirmTitle" + this.f17553i, "").toString();
            String obj2 = C6368w.m16234b(d, "MBridge_ConfirmContent" + this.f17553i, "").toString();
            String obj3 = C6368w.m16234b(d, "MBridge_CancelText" + this.f17553i, "").toString();
            String obj4 = C6368w.m16234b(d, "MBridge_ConfirmText" + this.f17553i, "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put("confirm_title", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put("confirm_description", obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put("confirm_t", obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put("confirm_c_play", obj4);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put("confirm_c_rv", obj4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:38|39|40|41|(1:43)|44|45|(2:48|46)|56|49|50|61) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010e A[Catch:{ JSONException -> 0x0125 }, LOOP:1: B:46:0x0108->B:48:0x010e, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.mbridge.msdk.foundation.entity.CampaignEx m17874a(java.lang.String r8, com.mbridge.msdk.foundation.entity.CampaignEx r9) {
        /*
            r7 = this;
            java.lang.String r0 = "deep_link"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L_0x0009
            return r9
        L_0x0009:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L_0x0015
            if (r9 == 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            r9 = 0
            goto L_0x0129
        L_0x0015:
            java.lang.String r1 = "notice"
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L_0x00f0
            org.json.JSONObject r0 = com.mbridge.msdk.foundation.entity.CampaignEx.campaignToJsonObject(r9)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r1 != 0) goto L_0x0028
            r1 = r9
        L_0x0028:
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r2 != 0) goto L_0x00e4
            r7.m17876a((org.json.JSONObject) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r1)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r8 = com.mbridge.msdk.foundation.same.C6204a.f15397g     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            org.json.JSONObject r8 = r0.optJSONObject(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = "-999"
            if (r8 == 0) goto L_0x0073
            android.app.Activity r0 = r7.f17564n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = com.mbridge.msdk.foundation.same.C6204a.f15395e     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = r8.getString(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r2 = (float) r2     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r0 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r0, (float) r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            android.app.Activity r2 = r7.f17564n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C6204a.f15396f     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r3 = r8.getString(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r3 = r3.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r3 = (float) r3     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r2, (float) r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            goto L_0x0074
        L_0x0073:
            r2 = r0
        L_0x0074:
            java.lang.String r3 = r1.getClickURL()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = com.mbridge.msdk.click.C6103b.m15223a((java.lang.String) r3, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r1.setClickURL(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r0 = r1.getNoticeUrl()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r8 == 0) goto L_0x00e4
            java.util.Iterator r2 = r8.keys()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r3.<init>()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x008e:
            boolean r4 = r2.hasNext()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00d2
            java.lang.String r4 = "&"
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Object r4 = r2.next()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r5 = r8.optString(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C6204a.f15395e     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            boolean r6 = r6.equals(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r6 != 0) goto L_0x00b3
            java.lang.String r6 = com.mbridge.msdk.foundation.same.C6204a.f15396f     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            boolean r6 = r6.equals(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            if (r6 == 0) goto L_0x00c6
        L_0x00b3:
            android.app.Activity r6 = r7.f17564n     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r5 = r5.intValue()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            float r5 = (float) r5     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            int r5 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r6, (float) r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x00c6:
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r4 = "="
            r3.append(r4)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r3.append(r5)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            goto L_0x008e
        L_0x00d2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.<init>()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.append(r0)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r8.append(r3)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
            r1.setNoticeUrl(r8)     // Catch:{ JSONException -> 0x00eb, all -> 0x00e6 }
        L_0x00e4:
            r9 = r1
            goto L_0x0129
        L_0x00e6:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0129
        L_0x00eb:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x0129
        L_0x00f0:
            org.json.JSONObject r1 = com.mbridge.msdk.foundation.entity.CampaignEx.campaignToJsonObject(r9)     // Catch:{ JSONException -> 0x0125 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0125 }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x0125 }
            boolean r8 = r2.has(r0)     // Catch:{ Exception -> 0x0104 }
            if (r8 != 0) goto L_0x0104
            java.lang.String r8 = ""
            r1.put(r0, r8)     // Catch:{ Exception -> 0x0104 }
        L_0x0104:
            java.util.Iterator r8 = r2.keys()     // Catch:{ JSONException -> 0x0125 }
        L_0x0108:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x0125 }
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r8.next()     // Catch:{ JSONException -> 0x0125 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0125 }
            java.lang.String r3 = r2.getString(r0)     // Catch:{ JSONException -> 0x0125 }
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x0125 }
            goto L_0x0108
        L_0x011c:
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r1)     // Catch:{ JSONException -> 0x0125 }
            r7.m17876a((org.json.JSONObject) r1, (com.mbridge.msdk.foundation.entity.CampaignEx) r8)     // Catch:{ JSONException -> 0x0125 }
            r9 = r8
            goto L_0x0129
        L_0x0125:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0129:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p235a.C7062j.m17874a(java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.foundation.entity.CampaignEx");
    }

    /* renamed from: a */
    private void m17876a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String optString = jSONObject.optString("unitId");
            if (!TextUtils.isEmpty(optString)) {
                campaignEx.setCampaignUnitId(optString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        com.mbridge.msdk.foundation.tools.C6361q.m16155a("DefaultJSCommon", "INSTALL", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        com.mbridge.msdk.foundation.tools.C6361q.m16155a("DefaultJSCommon", r6.getMessage(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000d, B:22:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074 A[Catch:{ all -> 0x0068, all -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[Catch:{ all -> 0x0068, all -> 0x0095 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void click(int r6, java.lang.String r7) {
        /*
            r5 = this;
            super.click(r6, r7)
            java.lang.String r0 = "DefaultJSCommon"
            r1 = 1
            if (r6 == r1) goto L_0x0029
            r2 = 3
            if (r6 == r2) goto L_0x000d
            goto L_0x009d
        L_0x000d:
            com.mbridge.msdk.videocommon.d.c r6 = r5.f17554j     // Catch:{ all -> 0x0095 }
            if (r6 == 0) goto L_0x0024
            com.mbridge.msdk.videocommon.d.c r6 = r5.f17554j     // Catch:{ all -> 0x0095 }
            int r6 = r6.mo49148n()     // Catch:{ all -> 0x0095 }
            r2 = -1
            if (r6 != r2) goto L_0x0024
            com.mbridge.msdk.video.signal.a.c$b r6 = new com.mbridge.msdk.video.signal.a.c$b     // Catch:{ all -> 0x0095 }
            com.mbridge.msdk.video.signal.c$a r2 = r5.f17556l     // Catch:{ all -> 0x0095 }
            r6.<init>(r5, r2)     // Catch:{ all -> 0x0095 }
            r5.mo48804a((com.mbridge.msdk.video.signal.C7068c.C7069a) r6)     // Catch:{ all -> 0x0095 }
        L_0x0024:
            r5.click(r1, r7)     // Catch:{ all -> 0x0095 }
            goto L_0x009d
        L_0x0029:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f17567q     // Catch:{ all -> 0x0095 }
            r2 = 0
            if (r6 != 0) goto L_0x0044
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f17568r     // Catch:{ all -> 0x0095 }
            if (r6 == 0) goto L_0x0044
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f17568r     // Catch:{ all -> 0x0095 }
            int r6 = r6.size()     // Catch:{ all -> 0x0095 }
            if (r6 <= 0) goto L_0x0044
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r5.f17568r     // Catch:{ all -> 0x0095 }
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x0095 }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ all -> 0x0095 }
            r5.f17567q = r6     // Catch:{ all -> 0x0095 }
        L_0x0044:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f17567q     // Catch:{ all -> 0x0095 }
            if (r6 != 0) goto L_0x0049
            return
        L_0x0049:
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f17567q     // Catch:{ all -> 0x0095 }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.m17874a((java.lang.String) r7, (com.mbridge.msdk.foundation.entity.CampaignEx) r6)     // Catch:{ all -> 0x0095 }
            java.lang.String r7 = r6.getNoticeUrl()     // Catch:{ all -> 0x0095 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.C6204a.f15398h     // Catch:{ all -> 0x0068 }
            java.lang.String r7 = r7.getQueryParameter(r3)     // Catch:{ all -> 0x0068 }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x006e
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x0068 }
            goto L_0x006f
        L_0x0068:
            r7 = move-exception
            java.lang.String r3 = "INSTALL"
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r3, r7)     // Catch:{ all -> 0x0095 }
        L_0x006e:
            r7 = 0
        L_0x006f:
            com.mbridge.msdk.video.signal.c$a r3 = r5.f17556l     // Catch:{ all -> 0x0095 }
            r4 = 2
            if (r7 != r4) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            r3.mo48318a(r1)     // Catch:{ all -> 0x0095 }
            com.mbridge.msdk.click.a r7 = r5.m17879q()     // Catch:{ all -> 0x0095 }
            com.mbridge.msdk.video.signal.c$a r1 = r5.f17556l     // Catch:{ all -> 0x0095 }
            r7.mo42841a((com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r1)     // Catch:{ all -> 0x0095 }
            com.mbridge.msdk.click.a r7 = r5.m17879q()     // Catch:{ all -> 0x0095 }
            r7.mo42838a((com.mbridge.msdk.foundation.entity.CampaignEx) r6)     // Catch:{ all -> 0x0095 }
            com.mbridge.msdk.foundation.controller.a r7 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x0095 }
            android.content.Context r7 = r7.mo42895d()     // Catch:{ all -> 0x0095 }
            com.mbridge.msdk.video.module.p233b.C7047a.m17795d(r7, r6)     // Catch:{ all -> 0x0095 }
            goto L_0x009d
        L_0x0095:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16155a(r0, r7, r6)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p235a.C7062j.click(int, java.lang.String):void");
    }

    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.f17556l.mo48317a(i, str);
        } catch (Throwable th) {
            C6361q.m16155a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public final void mo48802a(int i, String str) {
        super.mo48802a(i, str);
        if (i == 2) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("event", "event");
                String optString2 = jSONObject.optString("template", "-1");
                String optString3 = jSONObject.optString("layout", "-1");
                String optString4 = jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17553i);
                int n = C6349m.m16123n(this.f17564n.getApplication());
                C6158p.m15475a((C6146e) C6148f.m15420a((Context) this.f17564n.getApplication())).mo43039a(new C6203m("2000039", optString, optString2, optString3, optString4, this.f17567q.getId(), n, C6349m.m16092a((Context) this.f17564n.getApplication(), n)));
            } catch (Throwable th) {
                C6361q.m16155a("DefaultJSCommon", th.getMessage(), th);
            }
        }
    }

    /* renamed from: f */
    public final void mo48818f() {
        super.mo48818f();
        if (this.f17556l != null) {
            this.f17556l.mo48319b();
        }
    }

    /* renamed from: d */
    public final void mo48814d() {
        super.mo48814d();
        try {
            if (this.f17564n != null) {
                this.f17564n.finish();
            }
        } catch (Throwable th) {
            C6361q.m16155a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    /* renamed from: q */
    private C6097a m17879q() {
        if (this.f17555k == null) {
            this.f17555k = new C6097a(C6122a.m15302b().mo42895d(), this.f17553i);
        }
        return this.f17555k;
    }

    /* renamed from: g */
    public final String mo48821g(int i) {
        switch (i) {
            case 1:
                return m17881s().toString();
            case 2:
                return m17882t().toString();
            case 3:
                return m17883u().toString();
            case 4:
                return m17884v().toString();
            case 5:
                return m17885w().toString();
            case 6:
                return m17886x().toString();
            default:
                return m17880r().toString();
        }
    }

    /* renamed from: r */
    private JSONObject m17880r() {
        JSONObject jSONObject = new JSONObject();
        C6331b bVar = new C6331b(C6122a.m15302b().mo42895d());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f17557m);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", bVar.mo43936a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f17567q));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", m17887y());
            String c = C6076b.m15089a().mo42752c(C6122a.m15302b().mo42896e());
            if (!TextUtils.isEmpty(c)) {
                JSONObject jSONObject3 = new JSONObject(c);
                m17875a(jSONObject3);
                String d = C6076b.m15089a().mo42754d(this.f17553i);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject3.put("ivreward", d);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", m17888z());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: s */
    private JSONObject m17881s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_15.7.21,3.0.1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: t */
    private JSONObject m17882t() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f17553i)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17553i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: u */
    private JSONObject m17883u() {
        JSONObject jSONObject = new JSONObject();
        try {
            String c = C6076b.m15089a().mo42752c(C6122a.m15302b().mo42896e());
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("appSetting", new JSONObject(c));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: v */
    private JSONObject m17884v() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f17554j != null) {
                jSONObject.put("unitSetting", this.f17554j.mo49116C());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: w */
    private JSONObject m17885w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", new C6331b(C6122a.m15302b().mo42895d()).mo43936a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: x */
    private JSONObject m17886x() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f17557m);
            jSONObject2.put("instanceId", this.f17570t);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: y */
    private JSONObject m17887y() {
        return this.f17554j != null ? this.f17554j.mo49116C() : new JSONObject();
    }

    /* renamed from: z */
    private JSONObject m17888z() {
        JSONObject jSONObject = new JSONObject();
        C7176a b = C7177b.m18135a().mo49112b();
        return b != null ? b.mo49106j() : jSONObject;
    }

    /* renamed from: a */
    public final void mo48803a(Activity activity) {
        this.f17564n = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r0 = com.mbridge.msdk.p158b.C6076b.m15089a().mo42749b(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m17877b(com.mbridge.msdk.foundation.entity.CampaignEx r7) {
        /*
            r6 = this;
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = r0.mo42896e()     // Catch:{ Exception -> 0x0039 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0039 }
            r2 = 0
            if (r1 != 0) goto L_0x0023
            com.mbridge.msdk.b.b r1 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x0039 }
            com.mbridge.msdk.b.a r0 = r1.mo42749b(r0)     // Catch:{ Exception -> 0x0039 }
            if (r0 == 0) goto L_0x0023
            long r0 = r0.mo42726p()     // Catch:{ Exception -> 0x0039 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            goto L_0x0024
        L_0x0023:
            r0 = r2
        L_0x0024:
            com.mbridge.msdk.videocommon.d.b r4 = com.mbridge.msdk.videocommon.p239d.C7177b.m18135a()     // Catch:{ Exception -> 0x0039 }
            com.mbridge.msdk.videocommon.d.a r4 = r4.mo49112b()     // Catch:{ Exception -> 0x0039 }
            if (r4 == 0) goto L_0x0032
            long r2 = r4.mo49098d()     // Catch:{ Exception -> 0x0039 }
        L_0x0032:
            if (r7 == 0) goto L_0x0039
            boolean r7 = r7.isSpareOffer(r2, r0)     // Catch:{ Exception -> 0x0039 }
            return r7
        L_0x0039:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.p235a.C7062j.m17877b(com.mbridge.msdk.foundation.entity.CampaignEx):boolean");
    }

    /* renamed from: b */
    public final void mo48809b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17566p = str;
        }
    }

    /* renamed from: i */
    public final String mo48824i() {
        C6361q.m16154a("DefaultJSCommon", "getNotchArea");
        return this.f17566p;
    }
}
