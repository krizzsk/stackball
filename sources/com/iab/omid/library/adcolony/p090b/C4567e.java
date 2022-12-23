package com.iab.omid.library.adcolony.p090b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.p092d.C4579c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.b.e */
public class C4567e {

    /* renamed from: a */
    private static C4567e f10294a = new C4567e();

    /* renamed from: com.iab.omid.library.adcolony.b.e$a */
    class C4568a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f10295a;

        /* renamed from: b */
        final /* synthetic */ String f10296b;

        C4568a(WebView webView, String str) {
            this.f10295a = webView;
            this.f10296b = str;
        }

        public void run() {
            this.f10295a.loadUrl(this.f10296b);
        }
    }

    private C4567e() {
    }

    /* renamed from: a */
    public static C4567e m9545a() {
        return f10294a;
    }

    /* renamed from: a */
    public void mo38594a(WebView webView) {
        mo38600a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo38595a(WebView webView, float f) {
        mo38600a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo38596a(WebView webView, ErrorType errorType, String str) {
        mo38600a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo38597a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo38604a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo38598a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo38600a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo38600a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo38599a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo38600a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38600a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo38603a(sb, objArr);
            sb.append(")}");
            mo38601a(webView, sb);
            return;
        }
        C4579c.m9607a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38601a(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new C4568a(webView, sb2));
        }
    }

    /* renamed from: a */
    public void mo38602a(WebView webView, JSONObject jSONObject) {
        mo38600a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38603a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo38604a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo38605b(WebView webView) {
        mo38600a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo38606b(WebView webView, String str) {
        mo38600a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo38607b(WebView webView, JSONObject jSONObject) {
        mo38600a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo38608c(WebView webView) {
        mo38600a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo38609c(WebView webView, String str) {
        mo38600a(webView, "setState", str);
    }
}
