package com.ogury.p245ed.internal;

import android.os.Build;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.io.File;

/* renamed from: com.ogury.ed.internal.gr */
public final class C8268gr {
    /* renamed from: a */
    public static final void m23213a(WebView webView) {
        C8467mq.m23881b(webView, "<this>");
        webView.getSettings().setAppCacheEnabled(true);
        File cacheDir = webView.getContext().getCacheDir();
        String absolutePath = cacheDir == null ? null : cacheDir.getAbsolutePath();
        if (absolutePath != null) {
            webView.getSettings().setAppCachePath(absolutePath);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
    }

    /* renamed from: b */
    public static final void m23216b(WebView webView) {
        C8467mq.m23881b(webView, "<this>");
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setScrollContainer(false);
    }

    /* renamed from: c */
    public static final void m23217c(WebView webView) {
        C8467mq.m23881b(webView, "<this>");
        if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
    }

    /* renamed from: d */
    public static final void m23218d(WebView webView) {
        C8467mq.m23881b(webView, "<this>");
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.setWebChromeClient(new C8269a());
    }

    /* renamed from: com.ogury.ed.internal.gr$a */
    public static final class C8269a extends WebChromeClient {
        C8269a() {
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            C8467mq.m23881b(webView, "view");
            WebView.HitTestResult hitTestResult = webView.getHitTestResult();
            CharSequence extra = hitTestResult == null ? null : hitTestResult.getExtra();
            if (!(extra == null || C8516oc.m23948a(extra))) {
                webView.loadUrl(webView.getHitTestResult().getExtra());
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final void m23214a(WebView webView, C8431lj<C8386ke> ljVar) {
        C8467mq.m23881b(webView, "<this>");
        C8467mq.m23881b(ljVar, "callback");
        if (webView.getHeight() > 0 || webView.getWidth() > 0) {
            ljVar.mo53190a();
        } else {
            webView.post(new Runnable() {
                public final void run() {
                    C8268gr.m23215a(C8431lj.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m23215a(C8431lj ljVar) {
        C8467mq.m23881b(ljVar, "$callback");
        ljVar.mo53190a();
    }

    /* renamed from: e */
    public static final boolean m23219e(WebView webView) {
        C8467mq.m23881b(webView, "<this>");
        if (Build.VERSION.SDK_INT >= 19) {
            return webView.isAttachedToWindow();
        }
        return webView.getParent() != null;
    }

    /* renamed from: f */
    public static final void m23220f(WebView webView) {
        C8467mq.m23881b(webView, "<this>");
        if (!m23219e(webView)) {
            webView.destroy();
        }
    }
}
