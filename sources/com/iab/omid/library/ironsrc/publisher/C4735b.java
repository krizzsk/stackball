package com.iab.omid.library.ironsrc.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.p108b.C4714d;
import com.iab.omid.library.ironsrc.p108b.C4715e;
import com.iab.omid.library.ironsrc.p110d.C4725b;
import com.iab.omid.library.ironsrc.p110d.C4728d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.publisher.b */
public class C4735b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f10658a;

    /* renamed from: b */
    private Long f10659b = null;

    /* renamed from: c */
    private Map<String, VerificationScriptResource> f10660c;

    /* renamed from: d */
    private final String f10661d;

    public C4735b(Map<String, VerificationScriptResource> map, String str) {
        this.f10660c = map;
        this.f10661d = str;
    }

    /* renamed from: a */
    public void mo39167a() {
        super.mo39167a();
        mo39191j();
    }

    /* renamed from: a */
    public void mo39173a(C4708a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4725b.m10252a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo39174a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo39181b() {
        super.mo39181b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f10663b = C4735b.this.f10658a;

            public void run() {
                this.f10663b.destroy();
            }
        }, Math.max(4000 - (this.f10659b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4728d.m10264a() - this.f10659b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f10658a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo39191j() {
        WebView webView = new WebView(C4714d.m10197a().mo39139b());
        this.f10658a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo39169a(this.f10658a);
        C4715e.m10200a().mo39150a(this.f10658a, this.f10661d);
        for (String next : this.f10660c.keySet()) {
            C4715e.m10200a().mo39143a(this.f10658a, this.f10660c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f10659b = Long.valueOf(C4728d.m10264a());
    }
}
