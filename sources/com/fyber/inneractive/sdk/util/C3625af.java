package com.fyber.inneractive.sdk.util;

import android.view.WindowManager;
import android.webkit.WebView;

/* renamed from: com.fyber.inneractive.sdk.util.af */
public final class C3625af {

    /* renamed from: a */
    private static boolean f9890a = false;

    /* renamed from: b */
    private static WebView f9891b;

    /* renamed from: c */
    private static WindowManager f9892c;

    /* renamed from: a */
    public static void m9048a() {
        WebView webView;
        f9890a = false;
        if (!(f9892c == null || (webView = f9891b) == null || webView.getParent() == null)) {
            try {
                f9892c.removeView(f9891b);
                IAlog.m9033a("KitKatWebViewUtils | removed static webview from window", new Object[0]);
            } catch (Exception unused) {
            }
        }
        WebView webView2 = f9891b;
        if (webView2 != null) {
            try {
                webView2.destroy();
                IAlog.m9033a("KitKatWebViewUtils | destroyed static webview", new Object[0]);
            } catch (Exception unused2) {
            }
        }
        f9892c = null;
        f9891b = null;
    }
}
