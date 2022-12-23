package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.p108b.C4714d;
import com.iab.omid.library.ironsrc.p108b.C4715e;
import com.iab.omid.library.ironsrc.p110d.C4724a;
import com.iab.omid.library.ironsrc.p110d.C4725b;
import com.iab.omid.library.ironsrc.p110d.C4728d;
import com.iab.omid.library.ironsrc.p111e.C4732b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4732b f10649a = new C4732b((WebView) null);

    /* renamed from: b */
    private AdEvents f10650b;

    /* renamed from: c */
    private MediaEvents f10651c;

    /* renamed from: d */
    private C4733a f10652d;

    /* renamed from: e */
    private long f10653e;

    /* renamed from: com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher$a */
    enum C4733a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo39190i();
    }

    /* renamed from: a */
    public void mo39167a() {
    }

    /* renamed from: a */
    public void mo39168a(float f) {
        C4715e.m10200a().mo39141a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39169a(WebView webView) {
        this.f10649a = new C4732b(webView);
    }

    /* renamed from: a */
    public void mo39170a(AdEvents adEvents) {
        this.f10650b = adEvents;
    }

    /* renamed from: a */
    public void mo39171a(AdSessionConfiguration adSessionConfiguration) {
        C4715e.m10200a().mo39148a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo39172a(ErrorType errorType, String str) {
        C4715e.m10200a().mo39142a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo39173a(C4708a aVar, AdSessionContext adSessionContext) {
        mo39174a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39174a(C4708a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4725b.m10252a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C4725b.m10252a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4725b.m10252a(jSONObject2, "deviceInfo", C4724a.m10245d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4725b.m10252a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4725b.m10252a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4725b.m10252a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4725b.m10252a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4725b.m10252a(jSONObject4, "libraryVersion", "1.3.12-Ironsrc");
        C4725b.m10252a(jSONObject4, "appId", C4714d.m10197a().mo39139b().getApplicationContext().getPackageName());
        C4725b.m10252a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4725b.m10252a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4725b.m10252a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4725b.m10252a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4715e.m10200a().mo39145a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo39175a(MediaEvents mediaEvents) {
        this.f10651c = mediaEvents;
    }

    /* renamed from: a */
    public void mo39176a(String str) {
        C4715e.m10200a().mo39144a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo39177a(String str, long j) {
        if (j >= this.f10653e) {
            this.f10652d = C4733a.AD_STATE_VISIBLE;
            C4715e.m10200a().mo39152b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo39178a(String str, JSONObject jSONObject) {
        C4715e.m10200a().mo39144a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo39179a(JSONObject jSONObject) {
        C4715e.m10200a().mo39153b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo39180a(boolean z) {
        if (mo39185e()) {
            C4715e.m10200a().mo39155c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo39181b() {
        this.f10649a.clear();
    }

    /* renamed from: b */
    public void mo39182b(String str, long j) {
        if (j >= this.f10653e && this.f10652d != C4733a.AD_STATE_NOTVISIBLE) {
            this.f10652d = C4733a.AD_STATE_NOTVISIBLE;
            C4715e.m10200a().mo39152b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo39183c() {
        return this.f10650b;
    }

    /* renamed from: d */
    public MediaEvents mo39184d() {
        return this.f10651c;
    }

    /* renamed from: e */
    public boolean mo39185e() {
        return this.f10649a.get() != null;
    }

    /* renamed from: f */
    public void mo39186f() {
        C4715e.m10200a().mo39140a(getWebView());
    }

    /* renamed from: g */
    public void mo39187g() {
        C4715e.m10200a().mo39151b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10649a.get();
    }

    /* renamed from: h */
    public void mo39189h() {
        C4715e.m10200a().mo39154c(getWebView());
    }

    /* renamed from: i */
    public void mo39190i() {
        this.f10653e = C4728d.m10264a();
        this.f10652d = C4733a.AD_STATE_IDLE;
    }
}
