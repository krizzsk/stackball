package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dg */
public final class C9155dg {

    /* renamed from: a */
    private static C9155dg f22510a = new C9155dg();

    private C9155dg() {
    }

    /* renamed from: a */
    public static C9155dg m24515a() {
        return f22510a;
    }

    /* renamed from: a */
    private static void m24516a(StringBuilder sb, Object[] objArr) {
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
    public static boolean m24517a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: a */
    public final void mo57952a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo57953a(webView, "publishVideoEvent", str, jSONObject);
            return;
        }
        mo57953a(webView, "publishVideoEvent", str);
    }

    /* renamed from: b */
    public final void mo57954b(WebView webView, String str) {
        mo57953a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: a */
    public final void mo57953a(final WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            m24516a(sb, objArr);
            sb.append(")}");
            final String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new Runnable() {
                    public final void run() {
                        webView.loadUrl(sb2);
                    }
                });
            }
        }
    }
}
