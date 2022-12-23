package com.iab.omid.library.inmobi.p102b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.p104d.C4678c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.b.d */
public class C4667d {

    /* renamed from: a */
    private static C4667d f10519a = new C4667d();

    private C4667d() {
    }

    /* renamed from: a */
    public static C4667d m9993a() {
        return f10519a;
    }

    /* renamed from: a */
    public void mo38962a(WebView webView) {
        mo38967a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo38963a(WebView webView, float f) {
        mo38967a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo38964a(WebView webView, ErrorType errorType, String str) {
        mo38967a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo38965a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo38967a(webView, "publishVideoEvent", str, jSONObject);
            return;
        }
        mo38967a(webView, "publishVideoEvent", str);
    }

    /* renamed from: a */
    public void mo38966a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        mo38967a(webView, "startSession", str, jSONObject, jSONObject2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38967a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo38970a(sb, objArr);
            sb.append(")}");
            mo38968a(webView, sb);
            return;
        }
        C4678c.m10048a("The WebView is null for ".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38968a(final WebView webView, StringBuilder sb) {
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
    public void mo38969a(WebView webView, JSONObject jSONObject) {
        mo38967a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38970a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo38971a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        return true;
    }

    /* renamed from: b */
    public void mo38972b(WebView webView) {
        mo38967a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo38973b(WebView webView, String str) {
        if (str != null) {
            mo38971a(webView, "var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);".replace("%SCRIPT_SRC%", str));
        }
    }

    /* renamed from: c */
    public void mo38974c(WebView webView, String str) {
        mo38967a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: d */
    public void mo38975d(WebView webView, String str) {
        mo38967a(webView, "setState", str);
    }
}
