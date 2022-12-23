package com.iab.omid.library.smaato.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.iab.omid.library.smaato.p120b.C4815c;
import com.iab.omid.library.smaato.p120b.C4816d;
import java.util.List;

/* renamed from: com.iab.omid.library.smaato.publisher.b */
public class C4835b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f10883a;

    /* renamed from: b */
    private List<VerificationScriptResource> f10884b;

    /* renamed from: c */
    private final String f10885c;

    public C4835b(List<VerificationScriptResource> list, String str) {
        this.f10884b = list;
        this.f10885c = str;
    }

    /* renamed from: a */
    public void mo39552a() {
        super.mo39552a();
        mo39573i();
    }

    /* renamed from: b */
    public void mo39564b() {
        super.mo39564b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f10887b = C4835b.this.f10883a;

            public void run() {
                this.f10887b.destroy();
            }
        }, 2000);
        this.f10883a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo39573i() {
        WebView webView = new WebView(C4815c.m10650a().mo39527b());
        this.f10883a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo39554a(this.f10883a);
        C4816d.m10653a().mo39537a(this.f10883a, this.f10885c);
        for (VerificationScriptResource resourceUrl : this.f10884b) {
            C4816d.m10653a().mo39539b(this.f10883a, resourceUrl.getResourceUrl().toExternalForm());
        }
    }
}
