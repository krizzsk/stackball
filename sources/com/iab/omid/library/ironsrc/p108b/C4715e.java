package com.iab.omid.library.ironsrc.p108b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.p110d.C4727c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.b.e */
public class C4715e {

    /* renamed from: a */
    private static C4715e f10623a = new C4715e();

    private C4715e() {
    }

    /* renamed from: a */
    public static C4715e m10200a() {
        return f10623a;
    }

    /* renamed from: a */
    public void mo39140a(WebView webView) {
        mo39146a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo39141a(WebView webView, float f) {
        mo39146a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo39142a(WebView webView, ErrorType errorType, String str) {
        mo39146a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo39143a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo39150a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo39144a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo39146a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo39146a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo39145a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo39146a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39146a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo39149a(sb, objArr);
            sb.append(")}");
            mo39147a(webView, sb);
            return;
        }
        C4727c.m10262a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39147a(final WebView webView, StringBuilder sb) {
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
    public void mo39148a(WebView webView, JSONObject jSONObject) {
        mo39146a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39149a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo39150a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo39151b(WebView webView) {
        mo39146a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo39152b(WebView webView, String str) {
        mo39146a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo39153b(WebView webView, JSONObject jSONObject) {
        mo39146a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo39154c(WebView webView) {
        mo39146a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo39155c(WebView webView, String str) {
        mo39146a(webView, "setState", str);
    }
}
