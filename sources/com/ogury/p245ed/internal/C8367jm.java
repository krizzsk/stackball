package com.ogury.p245ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.CreativeType;
import com.iab.omid.library.oguryco.adsession.ImpressionType;
import com.iab.omid.library.oguryco.adsession.Owner;
import com.iab.omid.library.oguryco.adsession.Partner;

/* renamed from: com.ogury.ed.internal.jm */
public final class C8367jm {

    /* renamed from: a */
    public static final C8367jm f21616a = new C8367jm();

    private C8367jm() {
    }

    /* renamed from: a */
    public static C8368jn m23719a(WebView webView, boolean z) {
        C8467mq.m23881b(webView, "adWebView");
        C8368jn jnVar = new C8368jn();
        Partner a = m23718a();
        if (a == null) {
            return null;
        }
        jnVar.mo53845a(m23717a(a, webView));
        jnVar.mo53844a(m23716a(z));
        return jnVar;
    }

    /* renamed from: a */
    private static Partner m23718a() {
        try {
            return Partner.createPartner("Ogury", "4.2.0");
        } catch (IllegalArgumentException e) {
            C8369jo joVar = C8369jo.f21619a;
            C8369jo.m23724a(e);
            return null;
        }
    }

    /* renamed from: a */
    private static AdSessionContext m23717a(Partner partner, WebView webView) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(partner, webView, "", (String) null);
        } catch (IllegalArgumentException e) {
            C8369jo joVar = C8369jo.f21619a;
            C8369jo.m23724a(e);
            return null;
        }
    }

    /* renamed from: a */
    private static AdSessionConfiguration m23716a(boolean z) {
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        Owner owner2 = Owner.NONE;
        if (z) {
            owner2 = Owner.JAVASCRIPT;
        }
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner2, false);
        } catch (IllegalArgumentException e) {
            C8369jo joVar = C8369jo.f21619a;
            C8369jo.m23724a(e);
            return null;
        }
    }
}
