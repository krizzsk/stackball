package com.iab.omid.library.smaato.p120b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.ErrorType;
import com.iab.omid.library.smaato.p122d.C4827c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.b.d */
public class C4816d {

    /* renamed from: a */
    private static C4816d f10856a = new C4816d();

    private C4816d() {
    }

    /* renamed from: a */
    public static C4816d m10653a() {
        return f10856a;
    }

    /* renamed from: a */
    public void mo39528a(WebView webView) {
        mo39533a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo39529a(WebView webView, float f) {
        mo39533a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo39530a(WebView webView, ErrorType errorType, String str) {
        mo39533a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo39531a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo39533a(webView, "publishVideoEvent", str, jSONObject);
            return;
        }
        mo39533a(webView, "publishVideoEvent", str);
    }

    /* renamed from: a */
    public void mo39532a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        mo39533a(webView, "startSession", str, jSONObject, jSONObject2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39533a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo39536a(sb, objArr);
            sb.append(")}");
            mo39534a(webView, sb);
            return;
        }
        C4827c.m10706a("The WebView is null for ".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39534a(final WebView webView, StringBuilder sb) {
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
    public void mo39535a(WebView webView, JSONObject jSONObject) {
        mo39533a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39536a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo39537a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        return true;
    }

    /* renamed from: b */
    public void mo39538b(WebView webView) {
        mo39533a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo39539b(WebView webView, String str) {
        if (str != null) {
            mo39537a(webView, "var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);".replace("%SCRIPT_SRC%", str));
        }
    }

    /* renamed from: c */
    public void mo39540c(WebView webView, String str) {
        mo39533a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: d */
    public void mo39541d(WebView webView, String str) {
        mo39533a(webView, "setState", str);
    }
}
