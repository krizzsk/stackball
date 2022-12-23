package com.ogury.p245ed.internal;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.hq */
public final class C8301hq implements C8291hj {

    /* renamed from: a */
    public static final C8302a f21438a = new C8302a((byte) 0);

    /* renamed from: b */
    private final C8297ho f21439b;

    /* renamed from: c */
    private final C8300hp f21440c;

    /* renamed from: d */
    private C8431lj<C8386ke> f21441d;

    /* renamed from: e */
    private C8431lj<C8386ke> f21442e;

    /* renamed from: f */
    private C8251gb f21443f = new C8252gc();

    /* renamed from: g */
    private final String[] f21444g = {"ogyCreateWebView", "ogyUpdateWebView", "ogyCloseWebView", "ogyNavigateBack", "ogyNavigateForward"};

    public C8301hq(C8297ho hoVar, C8300hp hpVar) {
        C8467mq.m23881b(hoVar, "browser");
        C8467mq.m23881b(hpVar, "multiWebViewCommandExecutor");
        this.f21439b = hoVar;
        this.f21440c = hpVar;
    }

    /* renamed from: a */
    public final void mo53684a(C8431lj<C8386ke> ljVar) {
        this.f21441d = ljVar;
    }

    /* renamed from: b */
    public final void mo53685b(C8431lj<C8386ke> ljVar) {
        this.f21442e = ljVar;
    }

    /* renamed from: com.ogury.ed.internal.hq$a */
    public static final class C8302a {
        public /* synthetic */ C8302a(byte b) {
            this();
        }

        private C8302a() {
        }
    }

    /* renamed from: a */
    public final boolean mo53657a(String str, C8362jh jhVar, C8185eb ebVar) {
        C8467mq.m23881b(str, "url");
        C8467mq.m23881b(jhVar, "webView");
        C8467mq.m23881b(ebVar, "ad");
        if (!C8294hl.m23327a(str)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(C8264gn.m23206a(C8294hl.m23328b(str)));
        String optString = jSONObject.optString("method", "");
        String optString2 = jSONObject.optString(TJAdUnitConstants.String.CALLBACK_ID, "");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        C8467mq.m23878a((Object) optString, "command");
        C8467mq.m23878a((Object) optString2, TJAdUnitConstants.String.CALLBACK_ID);
        m23376a(optString, optJSONObject, optString2, jhVar);
        return C8388kg.m23747a(this.f21444g, optString);
    }

    /* renamed from: a */
    private final void m23376a(String str, JSONObject jSONObject, String str2, C8362jh jhVar) {
        switch (str.hashCode()) {
            case -1797727422:
                if (str.equals("ogyCloseWebView")) {
                    m23381c(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case -1244773540:
                if (str.equals("ogyCreateWebView")) {
                    m23378a(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case -692274449:
                if (str.equals("ogyUpdateWebView")) {
                    m23380b(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case 960350259:
                if (str.equals("ogyNavigateForward")) {
                    m23379b(jSONObject);
                    return;
                }
                return;
            case 1635219001:
                if (str.equals("ogyNavigateBack")) {
                    m23377a(jSONObject);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m23378a(JSONObject jSONObject, String str, C8362jh jhVar) {
        C8251gb gbVar = this.f21443f;
        Context context = jhVar.getContext();
        C8467mq.m23878a((Object) context, "webView.context");
        if (gbVar.mo53611a(context)) {
            C8312hw hwVar = C8312hw.f21474a;
            C8310hv a = C8312hw.m23431a(jSONObject);
            this.f21439b.mo53664a(a);
            C8300hp.m23369a(jhVar, str, a.mo53701c());
            C8431lj<C8386ke> ljVar = this.f21441d;
            if (ljVar != null) {
                ljVar.mo53190a();
                return;
            }
            return;
        }
        C8431lj<C8386ke> ljVar2 = this.f21442e;
        if (ljVar2 != null) {
            ljVar2.mo53190a();
        }
    }

    /* renamed from: b */
    private final void m23380b(JSONObject jSONObject, String str, C8362jh jhVar) {
        C8312hw hwVar = C8312hw.f21474a;
        C8310hv a = C8312hw.m23431a(jSONObject);
        this.f21439b.mo53668b(a);
        C8300hp.m23369a(jhVar, str, a.mo53701c());
    }

    /* renamed from: c */
    private final void m23381c(JSONObject jSONObject, String str, C8362jh jhVar) {
        String optString = jSONObject.optString("webViewId", "");
        C8297ho hoVar = this.f21439b;
        C8467mq.m23878a((Object) optString, "webViewId");
        hoVar.mo53666a(optString);
        C8300hp.m23369a(jhVar, str, optString);
    }

    /* renamed from: a */
    private final void m23377a(JSONObject jSONObject) {
        String optString = jSONObject.optString("webViewId", "");
        C8297ho hoVar = this.f21439b;
        C8467mq.m23878a((Object) optString, "webViewId");
        hoVar.mo53670b(optString);
    }

    /* renamed from: b */
    private final void m23379b(JSONObject jSONObject) {
        String optString = jSONObject.optString("webViewId", "");
        C8297ho hoVar = this.f21439b;
        C8467mq.m23878a((Object) optString, "webViewId");
        hoVar.mo53673c(optString);
    }
}
