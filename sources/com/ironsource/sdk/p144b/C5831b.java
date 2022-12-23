package com.ironsource.sdk.p144b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.b */
public class C5831b {

    /* renamed from: a */
    public static Handler f14192a;

    /* renamed from: b */
    public C5830a f14193b;

    /* renamed from: c */
    public C5834d f14194c = new C5834d();

    /* renamed from: d */
    public WebView f14195d;

    /* renamed from: e */
    public String f14196e;

    /* renamed from: f */
    public String f14197f = C5831b.class.getSimpleName();

    /* renamed from: g */
    private String[] f14198g = {"handleGetViewVisibility"};

    /* renamed from: h */
    private final String[] f14199h = {"loadWithUrl", "updateAd", "isExternalAdViewInitiated", "handleGetViewVisibility", "sendMessage"};

    /* renamed from: a */
    static /* synthetic */ void m14405a(C5831b bVar, String str) {
        try {
            String str2 = "javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}";
            if (Build.VERSION.SDK_INT >= 19) {
                bVar.f14195d.evaluateJavascript(str2, (ValueCallback) null);
            } else {
                bVar.f14195d.loadUrl(str2);
            }
        } catch (Throwable th) {
            Log.e(bVar.f14197f, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + str + "Android API level: " + Build.VERSION.SDK_INT);
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private Handler m14406b() {
        try {
            if (f14192a == null) {
                f14192a = new Handler(Looper.getMainLooper());
            }
        } catch (Exception e) {
            Log.e(this.f14197f, "Error while trying execute method getUIThreadHandler");
            e.printStackTrace();
        }
        return f14192a;
    }

    /* renamed from: d */
    private static String m14407d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", new Object[]{str});
    }

    /* renamed from: a */
    public JSONObject mo42162a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f14194c.mo42176a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f14196e);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public JSONObject mo42163a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f14194c.mo42176a());
        } catch (Exception e) {
            String str = this.f14197f;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e.printStackTrace();
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo42164a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f14196e);
            mo42168a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo42165a(String str, int i, boolean z) {
        C5834d dVar = this.f14194c;
        boolean z2 = true;
        if (dVar.f14204a.containsKey(str)) {
            dVar.f14204a.put(str, Boolean.valueOf(i == 0));
        }
        dVar.f14204a.put("isShown", Boolean.valueOf(z));
        if ((!dVar.f14204a.get("isWindowVisible").booleanValue() && !dVar.f14204a.get("isVisible").booleanValue()) || !dVar.f14204a.get("isShown").booleanValue()) {
            z2 = false;
        }
        dVar.f14204a.put("isViewVisible", Boolean.valueOf(z2));
        if ((Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) && this.f14193b != null && this.f14194c != null) {
            mo42168a("containerIsVisible", mo42162a());
        }
    }

    /* renamed from: a */
    public final void mo42166a(String str, String str2) {
        C5830a aVar = this.f14193b;
        if (aVar != null) {
            aVar.mo42160a(str, str2, this.f14196e);
        }
    }

    /* renamed from: a */
    public final void mo42167a(String str, String str2, String str3) {
        if (this.f14195d == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f14197f, str4);
            this.f14193b.mo42160a(str3, str4, this.f14196e);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        final String d = m14407d(str);
        m14406b().post(new Runnable() {
            public final void run() {
                C5831b.m14405a(C5831b.this, d);
            }
        });
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f14196e);
        mo42168a(str2, jSONObject);
    }

    /* renamed from: a */
    public final void mo42168a(String str, JSONObject jSONObject) {
        C5830a aVar = this.f14193b;
        if (aVar != null) {
            aVar.mo42161a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo42169b(String str) {
        JSONObject a = this.f14194c.mo42176a();
        a.put("adViewId", this.f14196e);
        mo42168a(str, a);
    }

    /* renamed from: c */
    public boolean mo42170c(String str) {
        for (String equalsIgnoreCase : this.f14198g) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
