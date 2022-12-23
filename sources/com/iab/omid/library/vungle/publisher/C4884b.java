package com.iab.omid.library.vungle.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C4857a;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.p126b.C4863d;
import com.iab.omid.library.vungle.p126b.C4864e;
import com.iab.omid.library.vungle.p128d.C4874b;
import com.iab.omid.library.vungle.p128d.C4877d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.publisher.b */
public class C4884b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f10991a;

    /* renamed from: b */
    private Long f10992b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f10993c;

    /* renamed from: d */
    private final String f10994d;

    public C4884b(Map<String, VerificationScriptResource> map, String str) {
        this.f10993c = map;
        this.f10994d = str;
    }

    /* renamed from: a */
    public void mo39737a() {
        super.mo39737a();
        mo39761j();
    }

    /* renamed from: a */
    public void mo39743a(C4857a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4874b.m10909a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo39744a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo39751b() {
        super.mo39751b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f10996b = C4884b.this.f10991a;

            public void run() {
                this.f10996b.destroy();
            }
        }, Math.max(4000 - (this.f10992b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4877d.m10921a() - this.f10992b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f10991a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo39761j() {
        WebView webView = new WebView(C4863d.m10853a().mo39709b());
        this.f10991a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo39739a(this.f10991a);
        C4864e.m10856a().mo39720a(this.f10991a, this.f10994d);
        for (String next : this.f10993c.keySet()) {
            C4864e.m10856a().mo39713a(this.f10991a, this.f10993c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f10992b = Long.valueOf(C4877d.m10921a());
    }
}
