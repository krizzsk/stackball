package com.mbridge.msdk.interactiveads.signalcommon;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6331b;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity;
import com.mbridge.msdk.mbsignalcommon.windvane.C6557a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.C6564h;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p158b.C6076b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Interactive extends C6564h {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(final java.lang.Object r5, java.lang.String r6) {
        /*
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            android.text.TextUtils.isEmpty(r6)
            r1 = 1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001d }
            r2.<init>(r6)     // Catch:{ JSONException -> 0x001d }
            java.lang.String r6 = "pageNo"
            int r6 = r2.optInt(r6)     // Catch:{ JSONException -> 0x001d }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.net.p179h.C6287d.f15600c     // Catch:{ JSONException -> 0x001b }
            org.json.JSONArray r0 = r2.optJSONArray(r3)     // Catch:{ JSONException -> 0x001b }
            goto L_0x0022
        L_0x001b:
            r2 = move-exception
            goto L_0x001f
        L_0x001d:
            r2 = move-exception
            r6 = 1
        L_0x001f:
            r2.printStackTrace()
        L_0x0022:
            if (r5 == 0) goto L_0x0068
            r2 = r5
            com.mbridge.msdk.mbsignalcommon.windvane.a r2 = (com.mbridge.msdk.mbsignalcommon.windvane.C6557a) r2
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r2.f16345a
            java.lang.Object r3 = r3.getObject()
            boolean r3 = r3 instanceof com.mbridge.msdk.interactiveads.signalcommon.C6422a
            if (r3 == 0) goto L_0x0068
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r2.f16345a
            java.lang.Object r2 = r2.getObject()
            com.mbridge.msdk.interactiveads.signalcommon.a r2 = (com.mbridge.msdk.interactiveads.signalcommon.C6422a) r2
            if (r6 != r1) goto L_0x0050
            java.lang.String r6 = r2.mo44124b()
            byte[] r6 = r6.getBytes()
            r0 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r0)
            com.mbridge.msdk.mbsignalcommon.windvane.g r0 = com.mbridge.msdk.mbsignalcommon.windvane.C6563g.m16891a()
            r0.mo44523a(r5, r6)
            goto L_0x0068
        L_0x0050:
            if (r6 <= r1) goto L_0x0068
            if (r2 == 0) goto L_0x0068
            android.app.Activity r1 = r2.mo44127d()
            if (r1 == 0) goto L_0x0068
            boolean r3 = r1 instanceof com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity
            if (r3 == 0) goto L_0x0068
            com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity r1 = (com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity) r1
            com.mbridge.msdk.interactiveads.signalcommon.Interactive$1 r3 = new com.mbridge.msdk.interactiveads.signalcommon.Interactive$1
            r3.<init>(r2, r5)
            r1.webviewLoadMore(r6, r0, r3)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.interactiveads.signalcommon.Interactive.init(java.lang.Object, java.lang.String):void");
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a.getObject() instanceof C6422a) {
                    int optInt = new JSONObject(str).optInt("isReady", 1);
                    ((C6422a) aVar.f16345a.getObject()).mo44119a(optInt);
                    if (aVar.f16345a instanceof WindVaneWebView) {
                        WindVaneWebView windVaneWebView = aVar.f16345a;
                        if (windVaneWebView.getWebViewListener() != null) {
                            windVaneWebView.getWebViewListener().mo44020a((WebView) windVaneWebView, optInt);
                        }
                    }
                }
            } catch (Throwable th) {
                C6361q.m16155a("Interactive", th.getMessage(), th);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    C6097a.m15185a(C6122a.m15302b().mo42895d(), (CampaignEx) null, "", jSONArray.getJSONObject(i).optString("url"), false, true);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendImpressions(Object obj, String str) {
        InteractiveShowActivity a;
        try {
            if (!TextUtils.isEmpty(str) && (a = m16401a(obj)) != null) {
                a.sendImpressions(new JSONArray(str));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void openURL(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    C6103b.m15226a(this.f16369a, optString);
                } else if (optInt == 2) {
                    C6103b.m15227b(this.f16369a, optString);
                }
            } catch (JSONException e) {
                C6361q.m16158d("Interactive", e.getMessage());
            } catch (Throwable th) {
                C6361q.m16158d("Interactive", th.getMessage());
            }
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        InteractiveShowActivity a = m16401a(obj);
        if (a != null) {
            try {
                int optInt = new JSONObject(str).optInt("type");
                if (optInt == 1) {
                    a.onInteractivePlayingComplete(true);
                } else if (optInt != 2) {
                    a.onInteractivePlayingComplete(true);
                } else {
                    a.onInteractivePlayingComplete(false);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (InteractiveShowActivity.interactiveStatusListener != null) {
                InteractiveShowActivity.interactiveStatusListener.mo44085f();
            }
            a.tryReportADTrackingImpression();
            a.tryReportPlayableClosed();
            a.finish();
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                int optInt = new JSONObject(str).optInt("state");
                InteractiveShowActivity a = m16401a(obj);
                if (optInt != 1) {
                    if (optInt == 2) {
                        if (a != null) {
                            a.setCloseButtonVisible(false);
                            a.isADShowing = false;
                        }
                    }
                } else if (a != null) {
                    a.setCloseButtonVisible(true);
                    a.isADShowing = true;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        JSONObject jSONObject;
        String str2;
        if (obj != null) {
            try {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a.getObject() instanceof C6422a) {
                    C6422a aVar2 = (C6422a) aVar.f16345a.getObject();
                    List arrayList = new ArrayList();
                    JSONObject jSONObject2 = new JSONObject();
                    String str3 = "";
                    if (aVar2 != null) {
                        arrayList = aVar2.mo44126c();
                        str2 = aVar2.mo44118a();
                        jSONObject = aVar2.mo44128e();
                    } else {
                        jSONObject = jSONObject2;
                        str2 = str3;
                    }
                    String a = m16402a(arrayList, str2, "MAL_15.7.21,3.0.1", jSONObject);
                    if (!TextUtils.isEmpty(a)) {
                        str3 = Base64.encodeToString(a.getBytes(), 2);
                    }
                    C6563g.m16891a().mo44523a(aVar, str3);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void click(Object obj, String str) {
        InteractiveShowActivity a;
        try {
            if (!TextUtils.isEmpty(str) && (a = m16401a(obj)) != null) {
                JSONObject jSONObject = new JSONObject(str);
                a.click(jSONObject.optInt("type"), CampaignEx.parseCampaignWithBackData(jSONObject.getJSONObject("pt")));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void handlerPlayableException(Object obj, String str) {
        try {
            InteractiveShowActivity a = m16401a(obj);
            if (a != null && !TextUtils.isEmpty(str)) {
                a.handlerPlayableException(new JSONObject(str).optString(NotificationCompat.CATEGORY_MESSAGE));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void showAlertView(Object obj, String str) {
        InteractiveShowActivity a;
        try {
            if (!TextUtils.isEmpty(str) && (a = m16401a(obj)) != null) {
                a.showAlertView();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private InteractiveShowActivity m16401a(Object obj) {
        C6422a aVar;
        Activity d;
        if (obj != null) {
            C6557a aVar2 = (C6557a) obj;
            if ((aVar2.f16345a.getObject() instanceof C6422a) && (aVar = (C6422a) aVar2.f16345a.getObject()) != null && (d = aVar.mo44127d()) != null && (d instanceof InteractiveShowActivity)) {
                return (InteractiveShowActivity) d;
            }
        }
        return null;
    }

    public void install(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(new JSONObject(str));
                InteractiveShowActivity a = m16401a(obj);
                if (a != null) {
                    a.clickPlayer(parseCampaignWithBackData);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                new JSONObject(str).optInt("state");
            }
        } catch (Throwable th) {
            C6361q.m16155a("Interactive", "notifyCloseBtn", th);
        }
    }

    /* renamed from: a */
    private String m16402a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", parseCamplistToJson);
            jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject2.put("sdk_info", str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (C6076b.m15089a() != null) {
                String c = C6076b.m15089a().mo42752c(C6122a.m15302b().mo42896e());
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.put("appSetting", new JSONObject(c));
                }
            }
            jSONObject2.put("device", new C6331b(C6122a.m15302b().mo42895d()).mo43936a());
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
