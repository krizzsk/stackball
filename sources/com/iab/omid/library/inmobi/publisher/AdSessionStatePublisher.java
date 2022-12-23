package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.C4660a;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.video.VideoEvents;
import com.iab.omid.library.inmobi.p102b.C4666c;
import com.iab.omid.library.inmobi.p102b.C4667d;
import com.iab.omid.library.inmobi.p104d.C4675a;
import com.iab.omid.library.inmobi.p104d.C4676b;
import com.iab.omid.library.inmobi.p104d.C4679d;
import com.iab.omid.library.inmobi.p105e.C4683b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4683b f10538a = new C4683b((WebView) null);

    /* renamed from: b */
    private AdEvents f10539b;

    /* renamed from: c */
    private VideoEvents f10540c;

    /* renamed from: d */
    private C4684a f10541d;

    /* renamed from: e */
    private long f10542e;

    /* renamed from: com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher$a */
    enum C4684a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo39007h();
    }

    /* renamed from: a */
    public void mo38987a() {
    }

    /* renamed from: a */
    public void mo38988a(float f) {
        C4667d.m9993a().mo38963a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38989a(WebView webView) {
        this.f10538a = new C4683b(webView);
    }

    /* renamed from: a */
    public void mo38990a(AdEvents adEvents) {
        this.f10539b = adEvents;
    }

    /* renamed from: a */
    public void mo38991a(AdSessionConfiguration adSessionConfiguration) {
        C4667d.m9993a().mo38969a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo38992a(ErrorType errorType, String str) {
        C4667d.m9993a().mo38964a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo38993a(C4660a aVar, AdSessionContext adSessionContext) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject = new JSONObject();
        C4676b.m10037a(jSONObject, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C4676b.m10037a(jSONObject, "adSessionType", adSessionContext.getAdSessionContextType());
        C4676b.m10037a(jSONObject, "deviceInfo", C4675a.m10031d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4676b.m10037a(jSONObject, "supports", jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        C4676b.m10037a(jSONObject2, "partnerName", adSessionContext.getPartner().getName());
        C4676b.m10037a(jSONObject2, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4676b.m10037a(jSONObject, "omidNativeInfo", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C4676b.m10037a(jSONObject3, "libraryVersion", "1.2.19-Inmobi");
        C4676b.m10037a(jSONObject3, "appId", C4666c.m9990a().mo38961b().getApplicationContext().getPackageName());
        C4676b.m10037a(jSONObject, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject3);
        if (adSessionContext.getCustomReferenceData() != null) {
            C4676b.m10037a(jSONObject, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject4 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4676b.m10037a(jSONObject4, next.getVendorKey(), next.getVerificationParameters());
        }
        C4667d.m9993a().mo38966a(getWebView(), adSessionId, jSONObject, jSONObject4);
    }

    /* renamed from: a */
    public void mo38994a(VideoEvents videoEvents) {
        this.f10540c = videoEvents;
    }

    /* renamed from: a */
    public void mo38995a(String str) {
        C4667d.m9993a().mo38965a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo38996a(String str, long j) {
        if (j >= this.f10542e) {
            this.f10541d = C4684a.AD_STATE_VISIBLE;
            C4667d.m9993a().mo38974c(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo38997a(String str, JSONObject jSONObject) {
        C4667d.m9993a().mo38965a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo38998a(boolean z) {
        if (mo39003e()) {
            C4667d.m9993a().mo38975d(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo38999b() {
        this.f10538a.clear();
    }

    /* renamed from: b */
    public void mo39000b(String str, long j) {
        if (j >= this.f10542e && this.f10541d != C4684a.AD_STATE_NOTVISIBLE) {
            this.f10541d = C4684a.AD_STATE_NOTVISIBLE;
            C4667d.m9993a().mo38974c(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo39001c() {
        return this.f10539b;
    }

    /* renamed from: d */
    public VideoEvents mo39002d() {
        return this.f10540c;
    }

    /* renamed from: e */
    public boolean mo39003e() {
        return this.f10538a.get() != null;
    }

    /* renamed from: f */
    public void mo39004f() {
        C4667d.m9993a().mo38962a(getWebView());
    }

    /* renamed from: g */
    public void mo39005g() {
        C4667d.m9993a().mo38972b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10538a.get();
    }

    /* renamed from: h */
    public void mo39007h() {
        this.f10542e = C4679d.m10050a();
        this.f10541d = C4684a.AD_STATE_IDLE;
    }
}
