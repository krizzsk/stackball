package com.iab.omid.library.oguryco.p114b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.ErrorType;
import com.iab.omid.library.oguryco.p116d.C4778c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.b.e */
public class C4766e {

    /* renamed from: a */
    private static C4766e f10744a = new C4766e();

    private C4766e() {
    }

    /* renamed from: a */
    public static C4766e m10428a() {
        return f10744a;
    }

    /* renamed from: a */
    public void mo39354a(WebView webView) {
        mo39360a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo39355a(WebView webView, float f) {
        mo39360a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo39356a(WebView webView, ErrorType errorType, String str) {
        mo39360a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo39357a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo39364a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo39358a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo39360a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo39360a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo39359a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo39360a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39360a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo39363a(sb, objArr);
            sb.append(")}");
            mo39361a(webView, sb);
            return;
        }
        C4778c.m10491a("The WebView is null for ".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39361a(final WebView webView, StringBuilder sb) {
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
    public void mo39362a(WebView webView, JSONObject jSONObject) {
        mo39360a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39363a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo39364a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        return true;
    }

    /* renamed from: b */
    public void mo39365b(WebView webView) {
        mo39360a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo39366b(WebView webView, String str) {
        mo39360a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo39367b(WebView webView, JSONObject jSONObject) {
        mo39360a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo39368c(WebView webView) {
        mo39360a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo39369c(WebView webView, String str) {
        mo39360a(webView, "setState", str);
    }
}
