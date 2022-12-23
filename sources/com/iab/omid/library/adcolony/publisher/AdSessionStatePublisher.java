package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.p090b.C4566d;
import com.iab.omid.library.adcolony.p090b.C4567e;
import com.iab.omid.library.adcolony.p092d.C4576a;
import com.iab.omid.library.adcolony.p092d.C4577b;
import com.iab.omid.library.adcolony.p092d.C4580d;
import com.iab.omid.library.adcolony.p093e.C4584b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4584b f10320a = new C4584b((WebView) null);

    /* renamed from: b */
    private AdEvents f10321b;

    /* renamed from: c */
    private MediaEvents f10322c;

    /* renamed from: d */
    private C4585a f10323d;

    /* renamed from: e */
    private long f10324e;

    /* renamed from: com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher$a */
    enum C4585a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo38644i();
    }

    /* renamed from: a */
    public void mo38621a() {
    }

    /* renamed from: a */
    public void mo38622a(float f) {
        C4567e.m9545a().mo38595a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38623a(WebView webView) {
        this.f10320a = new C4584b(webView);
    }

    /* renamed from: a */
    public void mo38624a(AdEvents adEvents) {
        this.f10321b = adEvents;
    }

    /* renamed from: a */
    public void mo38625a(AdSessionConfiguration adSessionConfiguration) {
        C4567e.m9545a().mo38602a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo38626a(ErrorType errorType, String str) {
        C4567e.m9545a().mo38596a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo38627a(C4560a aVar, AdSessionContext adSessionContext) {
        mo38628a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38628a(C4560a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4577b.m9597a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C4577b.m9597a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4577b.m9597a(jSONObject2, "deviceInfo", C4576a.m9590d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4577b.m9597a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4577b.m9597a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4577b.m9597a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4577b.m9597a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4577b.m9597a(jSONObject4, "libraryVersion", "1.3.11-Adcolony");
        C4577b.m9597a(jSONObject4, "appId", C4566d.m9542a().mo38593b().getApplicationContext().getPackageName());
        C4577b.m9597a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4577b.m9597a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4577b.m9597a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4577b.m9597a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4567e.m9545a().mo38599a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo38629a(MediaEvents mediaEvents) {
        this.f10322c = mediaEvents;
    }

    /* renamed from: a */
    public void mo38630a(String str) {
        C4567e.m9545a().mo38598a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo38631a(String str, long j) {
        if (j >= this.f10324e) {
            this.f10323d = C4585a.AD_STATE_VISIBLE;
            C4567e.m9545a().mo38606b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo38632a(String str, JSONObject jSONObject) {
        C4567e.m9545a().mo38598a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo38633a(JSONObject jSONObject) {
        C4567e.m9545a().mo38607b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo38634a(boolean z) {
        if (mo38639e()) {
            C4567e.m9545a().mo38609c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo38635b() {
        this.f10320a.clear();
    }

    /* renamed from: b */
    public void mo38636b(String str, long j) {
        C4585a aVar;
        if (j >= this.f10324e && this.f10323d != (aVar = C4585a.AD_STATE_NOTVISIBLE)) {
            this.f10323d = aVar;
            C4567e.m9545a().mo38606b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo38637c() {
        return this.f10321b;
    }

    /* renamed from: d */
    public MediaEvents mo38638d() {
        return this.f10322c;
    }

    /* renamed from: e */
    public boolean mo38639e() {
        return this.f10320a.get() != null;
    }

    /* renamed from: f */
    public void mo38640f() {
        C4567e.m9545a().mo38594a(getWebView());
    }

    /* renamed from: g */
    public void mo38641g() {
        C4567e.m9545a().mo38605b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10320a.get();
    }

    /* renamed from: h */
    public void mo38643h() {
        C4567e.m9545a().mo38608c(getWebView());
    }

    /* renamed from: i */
    public void mo38644i() {
        this.f10324e = C4580d.m9609a();
        this.f10323d = C4585a.AD_STATE_IDLE;
    }
}
