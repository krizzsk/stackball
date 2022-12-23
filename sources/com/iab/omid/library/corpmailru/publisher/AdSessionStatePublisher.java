package com.iab.omid.library.corpmailru.publisher;

import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.AdEvents;
import com.iab.omid.library.corpmailru.adsession.AdSessionConfiguration;
import com.iab.omid.library.corpmailru.adsession.AdSessionContext;
import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.adsession.ErrorType;
import com.iab.omid.library.corpmailru.adsession.VerificationScriptResource;
import com.iab.omid.library.corpmailru.adsession.media.MediaEvents;
import com.iab.omid.library.corpmailru.p096b.C4616d;
import com.iab.omid.library.corpmailru.p096b.C4617e;
import com.iab.omid.library.corpmailru.p098d.C4626a;
import com.iab.omid.library.corpmailru.p098d.C4627b;
import com.iab.omid.library.corpmailru.p098d.C4630d;
import com.iab.omid.library.corpmailru.p099e.C4634b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4634b f10433a = new C4634b((WebView) null);

    /* renamed from: b */
    private AdEvents f10434b;

    /* renamed from: c */
    private MediaEvents f10435c;

    /* renamed from: d */
    private C4635a f10436d;

    /* renamed from: e */
    private long f10437e;

    /* renamed from: com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher$a */
    public enum C4635a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo38838i();
    }

    /* renamed from: a */
    public void mo38815a() {
    }

    /* renamed from: a */
    public void mo38816a(float f) {
        C4617e.m9768a().mo38789a(getWebView(), f);
    }

    /* renamed from: a */
    public void mo38817a(WebView webView) {
        this.f10433a = new C4634b(webView);
    }

    /* renamed from: a */
    public void mo38818a(AdEvents adEvents) {
        this.f10434b = adEvents;
    }

    /* renamed from: a */
    public void mo38819a(AdSessionConfiguration adSessionConfiguration) {
        C4617e.m9768a().mo38796a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo38820a(ErrorType errorType, String str) {
        C4617e.m9768a().mo38790a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo38821a(C4610a aVar, AdSessionContext adSessionContext) {
        mo38822a(aVar, adSessionContext, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo38822a(C4610a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4627b.m9821a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C4627b.m9821a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4627b.m9821a(jSONObject2, "deviceInfo", C4626a.m9814d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4627b.m9821a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4627b.m9821a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4627b.m9821a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4627b.m9821a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4627b.m9821a(jSONObject4, "libraryVersion", "1.3.20-Corpmailru");
        C4627b.m9821a(jSONObject4, "appId", C4616d.m9765a().mo38787b().getApplicationContext().getPackageName());
        C4627b.m9821a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4627b.m9821a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4627b.m9821a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4627b.m9821a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4617e.m9768a().mo38793a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo38823a(MediaEvents mediaEvents) {
        this.f10435c = mediaEvents;
    }

    /* renamed from: a */
    public void mo38824a(String str) {
        C4617e.m9768a().mo38792a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo38825a(String str, long j) {
        if (j >= this.f10437e) {
            this.f10436d = C4635a.AD_STATE_VISIBLE;
            C4617e.m9768a().mo38800b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo38826a(String str, JSONObject jSONObject) {
        C4617e.m9768a().mo38792a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo38827a(JSONObject jSONObject) {
        C4617e.m9768a().mo38801b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo38828a(boolean z) {
        if (mo38833e()) {
            C4617e.m9768a().mo38803c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo38829b() {
        this.f10433a.clear();
    }

    /* renamed from: b */
    public void mo38830b(String str, long j) {
        C4635a aVar;
        if (j >= this.f10437e && this.f10436d != (aVar = C4635a.AD_STATE_NOTVISIBLE)) {
            this.f10436d = aVar;
            C4617e.m9768a().mo38800b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo38831c() {
        return this.f10434b;
    }

    /* renamed from: d */
    public MediaEvents mo38832d() {
        return this.f10435c;
    }

    /* renamed from: e */
    public boolean mo38833e() {
        return this.f10433a.get() != null;
    }

    /* renamed from: f */
    public void mo38834f() {
        C4617e.m9768a().mo38788a(getWebView());
    }

    /* renamed from: g */
    public void mo38835g() {
        C4617e.m9768a().mo38799b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10433a.get();
    }

    /* renamed from: h */
    public void mo38837h() {
        C4617e.m9768a().mo38802c(getWebView());
    }

    /* renamed from: i */
    public void mo38838i() {
        this.f10437e = C4630d.m9833a();
        this.f10436d = C4635a.AD_STATE_IDLE;
    }
}
