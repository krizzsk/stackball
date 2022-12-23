package com.iab.omid.library.corpmailru.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.AdSessionContext;
import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.adsession.VerificationScriptResource;
import com.iab.omid.library.corpmailru.p096b.C4616d;
import com.iab.omid.library.corpmailru.p096b.C4617e;
import com.iab.omid.library.corpmailru.p098d.C4627b;
import com.iab.omid.library.corpmailru.p098d.C4630d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.publisher.b */
public class C4637b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f10442a;

    /* renamed from: b */
    private Long f10443b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f10444c;

    /* renamed from: d */
    private final String f10445d;

    public C4637b(Map<String, VerificationScriptResource> map, String str) {
        this.f10444c = map;
        this.f10445d = str;
    }

    /* renamed from: a */
    public void mo38815a() {
        super.mo38815a();
        mo38839j();
    }

    /* renamed from: a */
    public void mo38821a(C4610a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4627b.m9821a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo38822a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo38829b() {
        super.mo38829b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f10447b;

            {
                this.f10447b = C4637b.this.f10442a;
            }

            public void run() {
                this.f10447b.destroy();
            }
        }, Math.max(4000 - (this.f10443b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4630d.m9833a() - this.f10443b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f10442a = null;
    }

    /* renamed from: j */
    public void mo38839j() {
        WebView webView = new WebView(C4616d.m9765a().mo38787b());
        this.f10442a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo38817a(this.f10442a);
        C4617e.m9768a().mo38798a(this.f10442a, this.f10445d);
        for (String next : this.f10444c.keySet()) {
            C4617e.m9768a().mo38791a(this.f10442a, this.f10444c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f10443b = Long.valueOf(C4630d.m9833a());
    }
}
