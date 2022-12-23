package com.iab.omid.library.adcolony.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.p090b.C4566d;
import com.iab.omid.library.adcolony.p090b.C4567e;
import com.iab.omid.library.adcolony.p092d.C4577b;
import com.iab.omid.library.adcolony.p092d.C4580d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.publisher.b */
public class C4587b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f10329f;

    /* renamed from: g */
    private Long f10330g = null;

    /* renamed from: h */
    private Map<String, VerificationScriptResource> f10331h;

    /* renamed from: i */
    private final String f10332i;

    /* renamed from: com.iab.omid.library.adcolony.publisher.b$a */
    class C4588a implements Runnable {

        /* renamed from: a */
        private WebView f10333a;

        C4588a() {
            this.f10333a = C4587b.this.f10329f;
        }

        public void run() {
            this.f10333a.destroy();
        }
    }

    public C4587b(Map<String, VerificationScriptResource> map, String str) {
        this.f10331h = map;
        this.f10332i = str;
    }

    /* renamed from: a */
    public void mo38621a() {
        super.mo38621a();
        mo38645j();
    }

    /* renamed from: a */
    public void mo38627a(C4560a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4577b.m9597a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo38628a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo38635b() {
        super.mo38635b();
        new Handler().postDelayed(new C4588a(), Math.max(4000 - (this.f10330g == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4580d.m9609a() - this.f10330g.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f10329f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo38645j() {
        WebView webView = new WebView(C4566d.m9542a().mo38593b());
        this.f10329f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo38623a(this.f10329f);
        C4567e.m9545a().mo38604a(this.f10329f, this.f10332i);
        for (String next : this.f10331h.keySet()) {
            C4567e.m9545a().mo38597a(this.f10329f, this.f10331h.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f10330g = Long.valueOf(C4580d.m9609a());
    }
}
