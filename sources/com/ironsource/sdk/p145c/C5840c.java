package com.ironsource.sdk.p145c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.facebook.internal.NativeProtocol;
import com.ironsource.sdk.C5820a;
import com.ironsource.sdk.p143a.C5821a;
import com.ironsource.sdk.p143a.C5825d;
import com.ironsource.sdk.p143a.C5827f;
import com.ironsource.sdk.p144b.C5830a;
import com.ironsource.sdk.p144b.C5831b;
import com.ironsource.sdk.p144b.C5833c;
import com.ironsource.sdk.p145c.C5846e;
import com.ironsource.sdk.utils.C6062d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.vungle.warren.model.Advertisement;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.c */
public class C5840c implements C5846e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f14221f = C5840c.class.getSimpleName();

    /* renamed from: a */
    public final String f14222a;
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public WebView f14223b;

    /* renamed from: c */
    public C5831b f14224c;

    /* renamed from: d */
    public C5820a f14225d;

    /* renamed from: e */
    public Activity f14226e;

    /* renamed from: g */
    private final String f14227g;

    public C5840c(C5830a aVar, Activity activity, String str, C5820a aVar2) {
        this.f14226e = activity;
        C5831b bVar = new C5831b();
        this.f14224c = bVar;
        bVar.f14196e = str;
        this.f14227g = IronSourceStorageUtils.getNetworkStorageDir(activity.getApplicationContext());
        this.f14222a = str;
        this.f14224c.f14193b = aVar;
        this.f14225d = aVar2;
    }

    /* renamed from: a */
    static /* synthetic */ void m14430a(C5840c cVar, final String str) {
        Logger.m14957i(f14221f, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.f14226e);
        cVar.f14223b = webView;
        webView.addJavascriptInterface(new C5839b(cVar), "containerMsgHandler");
        cVar.f14223b.setWebViewClient(new C5833c(new C5846e.C5847a() {
            /* renamed from: a */
            public final void mo42192a(String str) {
                String b = C5840c.f14221f;
                Logger.m14957i(b, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
                C5840c.this.f14224c.mo42166a(str, str);
            }

            /* renamed from: b */
            public final void mo42193b(String str) {
                String b = C5840c.f14221f;
                Logger.m14957i(b, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
                try {
                    ((ViewGroup) C5840c.this.f14223b.getParent()).removeView(C5840c.this.f14223b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C5840c.this.m14435c();
            }
        }));
        C6062d.m14985a(cVar.f14223b);
        cVar.f14224c.f14195d = cVar.f14223b;
    }

    /* renamed from: b */
    static /* synthetic */ String m14433b(C5840c cVar, String str) {
        if (!str.startsWith(".")) {
            return str;
        }
        StringBuilder sb = new StringBuilder(Advertisement.FILE_SCHEME);
        sb.append(cVar.f14227g);
        String substring = str.substring(str.indexOf("/") + 1);
        sb.append(substring.substring(substring.indexOf("/")));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m14435c() {
        mo42179a("", "");
    }

    /* renamed from: a */
    public final WebView mo42178a() {
        return this.f14223b;
    }

    /* renamed from: a */
    public final synchronized void mo42179a(final String str, final String str2) {
        if (this.f14226e != null) {
            this.f14226e.runOnUiThread(new Runnable() {
                public final void run() {
                    Logger.m14957i(C5840c.f14221f, "performCleanup");
                    try {
                        if (C5840c.this.f14223b != null) {
                            C5840c.this.f14223b.destroy();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("adViewId", C5840c.this.f14222a);
                        C5840c.this.f14224c.mo42168a(str, jSONObject);
                        C5831b c = C5840c.this.f14224c;
                        c.f14193b = null;
                        c.f14194c = null;
                        C5831b.f14192a = null;
                        C5831b unused = C5840c.this.f14224c = null;
                        Activity unused2 = C5840c.this.f14226e = null;
                    } catch (Exception e) {
                        String b = C5840c.f14221f;
                        Log.e(b, "performCleanup | could not destroy ISNAdView webView ID: " + C5840c.this.f14222a);
                        C5825d.m14394a(C5827f.f14175p, (Map<String, Object>) new C5821a().mo42154a("callfailreason", e.getMessage()).f14151a);
                        if (C5840c.this.f14224c != null) {
                            C5840c.this.f14224c.mo42166a(str2, e.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42180a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            this.f14224c.mo42166a(str3, "action parameter empty");
            return;
        }
        String str4 = f14221f;
        Logger.m14957i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f14223b.onPause();
            } else if (str.equals("onResume")) {
                this.f14223b.onResume();
            } else {
                this.f14224c.mo42166a(str3, "action not supported");
                return;
            }
            this.f14224c.mo42164a(str2);
        } catch (Exception unused) {
            this.f14224c.mo42166a(str3, "failed to perform action");
        }
    }

    /* renamed from: a */
    public final void mo42181a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f14224c.mo42169b(str);
        } catch (Exception e) {
            String str3 = f14221f;
            Logger.m14957i(str3, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo42182b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f14224c.mo42167a(jSONObject.getString(NativeProtocol.WEB_DIALOG_PARAMS), str, str2);
        } catch (Exception e) {
            String str3 = f14221f;
            Logger.m14957i(str3, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        C5831b bVar = this.f14224c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.mo42170c(optString)) {
                bVar.mo42168a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.mo42167a(bVar.mo42163a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e) {
            String str2 = bVar.f14197f;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e.printStackTrace();
        }
    }
}
