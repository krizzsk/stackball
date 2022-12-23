package com.iab.omid.library.oguryco.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.adsession.VerificationScriptResource;
import com.iab.omid.library.oguryco.p114b.C4765d;
import com.iab.omid.library.oguryco.p114b.C4766e;
import com.iab.omid.library.oguryco.p116d.C4776b;
import com.iab.omid.library.oguryco.p116d.C4779d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.publisher.b */
public class C4786b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f10779a;

    /* renamed from: b */
    private Long f10780b = null;

    /* renamed from: c */
    private Map<String, VerificationScriptResource> f10781c;

    /* renamed from: d */
    private final String f10782d;

    public C4786b(Map<String, VerificationScriptResource> map, String str) {
        this.f10781c = map;
        this.f10782d = str;
    }

    /* renamed from: a */
    public void mo39381a() {
        super.mo39381a();
        mo39405j();
    }

    /* renamed from: a */
    public void mo39387a(C4758a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4776b.m10481a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo39388a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo39395b() {
        super.mo39395b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f10784b = C4786b.this.f10779a;

            public void run() {
                this.f10784b.destroy();
            }
        }, Math.max(4000 - (this.f10780b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4779d.m10493a() - this.f10780b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f10779a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo39405j() {
        WebView webView = new WebView(C4765d.m10425a().mo39353b());
        this.f10779a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo39383a(this.f10779a);
        C4766e.m10428a().mo39364a(this.f10779a, this.f10782d);
        for (String next : this.f10781c.keySet()) {
            C4766e.m10428a().mo39357a(this.f10779a, this.f10781c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f10780b = Long.valueOf(C4779d.m10493a());
    }
}
