package com.ogury.p245ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSession;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;

/* renamed from: com.ogury.ed.internal.jr */
public final class C8372jr {
    /* renamed from: a */
    public static AdSession m23730a(WebView webView, boolean z) {
        AdSessionConfiguration adSessionConfiguration;
        C8467mq.m23881b(webView, "adWebView");
        try {
            C8367jm jmVar = C8367jm.f21616a;
            C8368jn a = C8367jm.m23719a(webView, z);
            if (a == null) {
                adSessionConfiguration = null;
            } else {
                adSessionConfiguration = a.mo53846b();
            }
            AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, a == null ? null : a.mo53843a());
            createAdSession.registerAdView(webView);
            return createAdSession;
        } catch (Exception e) {
            C8369jo joVar = C8369jo.f21619a;
            C8369jo.m23724a(e);
            return null;
        }
    }
}
