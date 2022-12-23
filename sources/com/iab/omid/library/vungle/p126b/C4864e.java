package com.iab.omid.library.vungle.p126b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.p128d.C4876c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.b.e */
public class C4864e {

    /* renamed from: a */
    private static C4864e f10956a = new C4864e();

    private C4864e() {
    }

    /* renamed from: a */
    public static final C4864e m10856a() {
        return f10956a;
    }

    /* renamed from: a */
    public void mo39710a(WebView webView) {
        mo39716a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo39711a(WebView webView, float f) {
        mo39716a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo39712a(WebView webView, ErrorType errorType, String str) {
        mo39716a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo39713a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo39720a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo39714a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo39716a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo39716a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo39715a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo39716a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39716a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo39719a(sb, objArr);
            sb.append(")}");
            mo39717a(webView, sb);
            return;
        }
        C4876c.m10919a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39717a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() {
                public void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo39718a(WebView webView, JSONObject jSONObject) {
        mo39716a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39719a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append(Typography.quote);
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append(Typography.quote);
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append(Typography.quote);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: a */
    public boolean mo39720a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo39721b(WebView webView) {
        mo39716a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo39722b(WebView webView, String str) {
        mo39716a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo39723b(WebView webView, JSONObject jSONObject) {
        mo39716a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo39724c(WebView webView) {
        mo39716a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo39725c(WebView webView, String str) {
        mo39716a(webView, "setState", str);
    }
}
