package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.windvane.C6557a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.communication.a */
/* compiled from: CommonBannerSignalCommunicationImp */
public abstract class C6545a implements C6548c {

    /* renamed from: a */
    public static final String f16317a = C6545a.class.getSimpleName();

    /* renamed from: f */
    public void mo44455f(Object obj, String str) {
        try {
            if (obj instanceof C6557a) {
                C6563g.m16891a().mo44521a(((C6557a) obj).f16345a);
            }
        } catch (Throwable th) {
            C6361q.m16155a(f16317a, "onSignalCommunication", th);
        }
    }

    /* renamed from: c */
    public void mo44311c(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "readyStatus: " + str);
    }

    /* renamed from: a */
    public void mo44308a(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "init: " + str);
    }

    /* renamed from: b */
    public void mo44310b(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "click: " + str);
    }

    /* renamed from: d */
    public void mo44312d(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "toggleCloseBtn: " + str);
    }

    /* renamed from: e */
    public void mo44313e(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "triggerCloseBtn: " + str);
    }

    /* renamed from: i */
    public void mo44314i(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "sendImpressions: " + str);
    }

    /* renamed from: k */
    public final void mo44458k(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            C6546b.m16830a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int optInt = jSONObject.optInt("type");
                    C6097a.m15185a(C6122a.m15302b().mo42895d(), (CampaignEx) null, "", jSONObject.optString("url"), false, optInt != 0);
                }
                C6563g.m16891a().mo44523a(obj, C6546b.m16829a(0));
            } catch (Throwable th) {
                C6361q.m16155a(f16317a, "reportUrls", th);
            }
        }
    }

    /* renamed from: l */
    public final void mo44459l(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "increaseOfferFrequence:" + str);
        if (TextUtils.isEmpty(str)) {
            C6546b.m16830a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                C6546b.m16831a(obj, new JSONObject(str));
            } catch (Throwable th) {
                C6361q.m16155a(f16317a, "increaseOfferFrequence", th);
            }
        }
    }

    /* renamed from: h */
    public void mo44457h(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "resetCountdown: " + str);
    }

    /* renamed from: m */
    public final void mo44460m(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "handlerH5Exception: " + str);
    }

    /* renamed from: g */
    public void mo44456g(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "install: " + str);
    }

    /* renamed from: n */
    public final void mo44461n(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        String str2 = f16317a;
        C6361q.m16158d(str2, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C6546b.m16830a(obj, "params is null");
            return;
        }
        Context d = C6122a.m15302b().mo42895d();
        if (!TextUtils.isEmpty(str)) {
            if (d == null) {
                try {
                    if ((obj instanceof C6557a) && (windVaneWebView = ((C6557a) obj).f16345a) != null) {
                        d = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C6361q.m16158d(f16317a, e.getMessage());
                }
            }
            if (d != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("url");
                    int optInt = jSONObject.optInt("type");
                    if (optInt == 1) {
                        C6103b.m15226a(d, optString);
                    } else if (optInt == 2) {
                        C6103b.m15227b(d, optString);
                    }
                } catch (JSONException e2) {
                    C6361q.m16158d(f16317a, e2.getMessage());
                } catch (Throwable th) {
                    C6361q.m16158d(f16317a, th.getMessage());
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo44462o(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        String str2 = f16317a;
        C6361q.m16158d(str2, "getNetstat:" + str);
        if (TextUtils.isEmpty(str)) {
            C6546b.m16830a(obj, "params is null");
            return;
        }
        Context d = C6122a.m15302b().mo42895d();
        if (!TextUtils.isEmpty(str)) {
            if (d == null) {
                try {
                    if ((obj instanceof C6557a) && (windVaneWebView = ((C6557a) obj).f16345a) != null) {
                        d = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C6361q.m16158d(f16317a, e.getMessage());
                }
            }
            if (d == null) {
                C6563g.m16891a().mo44523a(obj, C6546b.m16829a(1));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", C6349m.m16123n(d));
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = Base64.encodeToString(jSONObject2.getBytes(), 2);
                }
                C6563g.m16891a().mo44523a(obj, jSONObject2);
            } catch (Throwable th) {
                C6361q.m16158d(f16317a, th.getMessage());
                C6563g.m16891a().mo44523a(obj, C6546b.m16829a(1));
            }
        }
    }

    /* renamed from: j */
    public void mo44315j(Object obj, String str) {
        String str2 = f16317a;
        C6361q.m16154a(str2, "getFileInfo:" + str);
    }
}
