package com.mbridge.msdk.video.p214bt.p215a;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.p205a.C6528a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.a.b */
/* compiled from: HandlerH5MessageManager */
public final class C6874b {

    /* renamed from: a */
    int f16842a;

    /* renamed from: b */
    int f16843b;

    /* renamed from: c */
    private String f16844c;

    /* renamed from: com.mbridge.msdk.video.bt.a.b$a */
    /* compiled from: HandlerH5MessageManager */
    private static final class C6876a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C6874b f16845a = new C6874b();
    }

    private C6874b() {
        this.f16844c = "handlerNativeResult";
        this.f16842a = 0;
        this.f16843b = 1;
    }

    /* renamed from: a */
    public static C6874b m17214a() {
        return C6876a.f16845a;
    }

    /* renamed from: a */
    public final void mo48177a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String optString = jSONObject.optString("uniqueIdentifier");
                    String optString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        if (!TextUtils.isEmpty(optString2)) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                            JSONObject optJSONObject = jSONObject.optJSONObject(IronSourceConstants.EVENTS_RESULT);
                            int i = 0;
                            if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                                i = optJSONObject.optInt("type", 0);
                            }
                            m17215a(this.f16842a, "receivedMessage", obj);
                            if (optString.equalsIgnoreCase("reporter")) {
                                C6528a.m16770a().mo44404a(obj, optString2, optJSONArray, i);
                                return;
                            } else if (optString.equalsIgnoreCase("MediaPlayer")) {
                                C6872a.m17208a().mo48174a(obj, optString2, optJSONArray, i);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    m17215a(this.f16843b, "module or method is null", obj);
                    return;
                }
            } catch (Exception e) {
                C6361q.m16154a("HandlerH5MessageManager", e.getMessage());
                m17215a(this.f16843b, e.getMessage(), obj);
                return;
            } catch (Throwable th) {
                C6361q.m16154a("HandlerH5MessageManager", th.getMessage());
                m17215a(this.f16843b, th.getMessage(), obj);
                return;
            }
        }
        m17215a(this.f16843b, "params is null", obj);
    }

    /* renamed from: a */
    private void m17215a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C6361q.m16154a("HandlerH5MessageManager", e.getMessage());
        } catch (Throwable th) {
            C6361q.m16154a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
