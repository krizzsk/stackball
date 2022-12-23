package com.ogury.p245ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSession;

/* renamed from: com.ogury.ed.internal.jq */
public final class C8371jq {

    /* renamed from: a */
    private AdSession f21622a;

    /* renamed from: b */
    private C8372jr f21623b = new C8372jr();

    /* renamed from: a */
    public final void mo53848a(WebView webView, boolean z) {
        C8467mq.m23881b(webView, "adWebView");
        AdSession a = C8372jr.m23730a(webView, z);
        this.f21622a = a;
        if (a != null) {
            a.start();
        }
    }

    /* renamed from: a */
    public final void mo53847a() {
        AdSession adSession = this.f21622a;
        if (adSession != null) {
            adSession.finish();
        }
    }
}
