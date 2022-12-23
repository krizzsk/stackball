package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import kotlin.text.Typography;
import org.json.JSONObject;

public class vt1 {

    /* renamed from: a */
    private static vt1 f41533a = new vt1();

    private vt1() {
    }

    /* renamed from: a */
    public static final vt1 m43343a() {
        return f41533a;
    }

    /* renamed from: a */
    public void mo70581a(WebView webView) {
        mo70585a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo70582a(WebView webView, float f) {
        mo70585a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo70583a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo70585a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo70585a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo70584a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo70585a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70585a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
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
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new ut1(this, webView, sb2));
            }
        } else {
            int i = at1.f30684a;
        }
    }

    /* renamed from: a */
    public void mo70586a(WebView webView, JSONObject jSONObject) {
        mo70585a(webView, "init", jSONObject);
    }

    /* renamed from: a */
    public boolean mo70587a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo70588b(WebView webView) {
        mo70585a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo70589b(WebView webView, String str) {
        mo70585a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo70590b(WebView webView, JSONObject jSONObject) {
        mo70585a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo70591c(WebView webView, String str) {
        mo70585a(webView, "setState", str);
    }
}
