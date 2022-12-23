package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C4857a;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.p126b.C4863d;
import com.iab.omid.library.vungle.p126b.C4864e;
import com.iab.omid.library.vungle.p128d.C4873a;
import com.iab.omid.library.vungle.p128d.C4874b;
import com.iab.omid.library.vungle.p128d.C4877d;
import com.iab.omid.library.vungle.p129e.C4881b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4881b f10982a = new C4881b((WebView) null);

    /* renamed from: b */
    private AdEvents f10983b;

    /* renamed from: c */
    private MediaEvents f10984c;

    /* renamed from: d */
    private C4882a f10985d;

    /* renamed from: e */
    private long f10986e;

    /* renamed from: com.iab.omid.library.vungle.publisher.AdSessionStatePublisher$a */
    enum C4882a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo39760i();
    }

    /* renamed from: a */
    public void mo39737a() {
    }

    /* renamed from: a */
    public void mo39738a(float f) {
        C4864e.m10856a().mo39711a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39739a(WebView webView) {
        this.f10982a = new C4881b(webView);
    }

    /* renamed from: a */
    public void mo39740a(AdEvents adEvents) {
        this.f10983b = adEvents;
    }

    /* renamed from: a */
    public void mo39741a(AdSessionConfiguration adSessionConfiguration) {
        C4864e.m10856a().mo39718a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo39742a(ErrorType errorType, String str) {
        C4864e.m10856a().mo39712a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo39743a(C4857a aVar, AdSessionContext adSessionContext) {
        mo39744a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39744a(C4857a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4874b.m10909a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C4874b.m10909a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4874b.m10909a(jSONObject2, "deviceInfo", C4873a.m10902d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4874b.m10909a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4874b.m10909a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4874b.m10909a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4874b.m10909a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4874b.m10909a(jSONObject4, "libraryVersion", "1.3.21-Vungle");
        C4874b.m10909a(jSONObject4, "appId", C4863d.m10853a().mo39709b().getApplicationContext().getPackageName());
        C4874b.m10909a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4874b.m10909a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4874b.m10909a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4874b.m10909a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4864e.m10856a().mo39715a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo39745a(MediaEvents mediaEvents) {
        this.f10984c = mediaEvents;
    }

    /* renamed from: a */
    public void mo39746a(String str) {
        C4864e.m10856a().mo39714a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo39747a(String str, long j) {
        if (j >= this.f10986e) {
            this.f10985d = C4882a.AD_STATE_VISIBLE;
            C4864e.m10856a().mo39722b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo39748a(String str, JSONObject jSONObject) {
        C4864e.m10856a().mo39714a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo39749a(JSONObject jSONObject) {
        C4864e.m10856a().mo39723b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo39750a(boolean z) {
        if (mo39755e()) {
            C4864e.m10856a().mo39725c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo39751b() {
        this.f10982a.clear();
    }

    /* renamed from: b */
    public void mo39752b(String str, long j) {
        if (j >= this.f10986e && this.f10985d != C4882a.AD_STATE_NOTVISIBLE) {
            this.f10985d = C4882a.AD_STATE_NOTVISIBLE;
            C4864e.m10856a().mo39722b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo39753c() {
        return this.f10983b;
    }

    /* renamed from: d */
    public MediaEvents mo39754d() {
        return this.f10984c;
    }

    /* renamed from: e */
    public boolean mo39755e() {
        return this.f10982a.get() != null;
    }

    /* renamed from: f */
    public void mo39756f() {
        C4864e.m10856a().mo39710a(getWebView());
    }

    /* renamed from: g */
    public void mo39757g() {
        C4864e.m10856a().mo39721b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10982a.get();
    }

    /* renamed from: h */
    public void mo39759h() {
        C4864e.m10856a().mo39724c(getWebView());
    }

    /* renamed from: i */
    public void mo39760i() {
        this.f10986e = C4877d.m10921a();
        this.f10985d = C4882a.AD_STATE_IDLE;
    }
}
