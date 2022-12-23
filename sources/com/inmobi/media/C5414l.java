package com.inmobi.media;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.l */
/* compiled from: NetworkBlocker */
final class C5414l implements Runnable {

    /* renamed from: a */
    private WeakReference<WebView> f12419a;

    C5414l(WebView webView) {
        this.f12419a = new WeakReference<>(webView);
    }

    public final void run() {
        WebView webView = (WebView) this.f12419a.get();
        if (webView != null) {
            webView.getSettings().setBlockNetworkLoads(true);
        }
    }
}
