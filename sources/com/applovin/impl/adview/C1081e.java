package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p026c.C1375b;

/* renamed from: com.applovin.impl.adview.e */
class C1081e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f1930a;

    /* renamed from: b */
    private final WebViewRenderProcessClient f1931b = new WebViewRenderProcessClient() {
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof C1072c) {
                C1355g currentAd = ((C1072c) webView).getCurrentAd();
                C1081e.this.f1930a.mo13083W().mo12885a((AppLovinAdBase) currentAd).mo12893a(C1375b.f3185D).mo12896a();
                C1505q v = C1081e.this.f1930a.mo13139v();
                v.mo13281e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
            }
        }
    };

    C1081e(C1469j jVar) {
        this.f1930a = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public WebViewRenderProcessClient mo11916a() {
        return this.f1931b;
    }
}
