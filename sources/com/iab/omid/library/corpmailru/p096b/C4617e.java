package com.iab.omid.library.corpmailru.p096b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.ErrorType;
import com.iab.omid.library.corpmailru.p098d.C4629c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.b.e */
public class C4617e {

    /* renamed from: a */
    private static C4617e f10407a = new C4617e();

    private C4617e() {
    }

    /* renamed from: a */
    public static final C4617e m9768a() {
        return f10407a;
    }

    /* renamed from: a */
    public void mo38788a(WebView webView) {
        mo38794a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo38789a(WebView webView, float f) {
        mo38794a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo38790a(WebView webView, ErrorType errorType, String str) {
        mo38794a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo38791a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo38798a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo38792a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo38794a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo38794a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo38793a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo38794a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public void mo38794a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo38797a(sb, objArr);
            sb.append(")}");
            mo38795a(webView, sb);
            return;
        }
        C4629c.m9831a("The WebView is null for " + str);
    }

    /* renamed from: a */
    public void mo38795a(final WebView webView, StringBuilder sb) {
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
    public void mo38796a(WebView webView, JSONObject jSONObject) {
        mo38794a(webView, "init", jSONObject);
    }

    /* renamed from: a */
    public void mo38797a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo38798a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo38799b(WebView webView) {
        mo38794a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo38800b(WebView webView, String str) {
        mo38794a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo38801b(WebView webView, JSONObject jSONObject) {
        mo38794a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo38802c(WebView webView) {
        mo38794a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo38803c(WebView webView, String str) {
        mo38794a(webView, "setState", str);
    }
}
