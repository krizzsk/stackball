package com.iab.omid.library.inmobi.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.p102b.C4666c;
import com.iab.omid.library.inmobi.p102b.C4667d;
import java.util.List;

/* renamed from: com.iab.omid.library.inmobi.publisher.b */
public class C4686b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f10547a;

    /* renamed from: b */
    private List<VerificationScriptResource> f10548b;

    /* renamed from: c */
    private final String f10549c;

    public C4686b(List<VerificationScriptResource> list, String str) {
        this.f10548b = list;
        this.f10549c = str;
    }

    /* renamed from: a */
    public void mo38987a() {
        super.mo38987a();
        mo39008i();
    }

    /* renamed from: b */
    public void mo38999b() {
        super.mo38999b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f10551b = C4686b.this.f10547a;

            public void run() {
                this.f10551b.destroy();
            }
        }, 2000);
        this.f10547a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo39008i() {
        WebView webView = new WebView(C4666c.m9990a().mo38961b());
        this.f10547a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo38989a(this.f10547a);
        C4667d.m9993a().mo38971a(this.f10547a, this.f10549c);
        for (VerificationScriptResource resourceUrl : this.f10548b) {
            C4667d.m9993a().mo38973b(this.f10547a, resourceUrl.getResourceUrl().toExternalForm());
        }
    }
}
