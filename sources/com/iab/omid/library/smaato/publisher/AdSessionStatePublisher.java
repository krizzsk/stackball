package com.iab.omid.library.smaato.publisher;

import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.C4809a;
import com.iab.omid.library.smaato.adsession.ErrorType;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.iab.omid.library.smaato.adsession.video.VideoEvents;
import com.iab.omid.library.smaato.p120b.C4815c;
import com.iab.omid.library.smaato.p120b.C4816d;
import com.iab.omid.library.smaato.p122d.C4824a;
import com.iab.omid.library.smaato.p122d.C4825b;
import com.iab.omid.library.smaato.p122d.C4828d;
import com.iab.omid.library.smaato.p123e.C4832b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4832b f10874a = new C4832b((WebView) null);

    /* renamed from: b */
    private AdEvents f10875b;

    /* renamed from: c */
    private VideoEvents f10876c;

    /* renamed from: d */
    private C4833a f10877d;

    /* renamed from: e */
    private double f10878e;

    /* renamed from: com.iab.omid.library.smaato.publisher.AdSessionStatePublisher$a */
    enum C4833a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_HIDDEN
    }

    public AdSessionStatePublisher() {
        mo39572h();
    }

    /* renamed from: a */
    public void mo39552a() {
    }

    /* renamed from: a */
    public void mo39553a(float f) {
        C4816d.m10653a().mo39529a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39554a(WebView webView) {
        this.f10874a = new C4832b(webView);
    }

    /* renamed from: a */
    public void mo39555a(AdEvents adEvents) {
        this.f10875b = adEvents;
    }

    /* renamed from: a */
    public void mo39556a(AdSessionConfiguration adSessionConfiguration) {
        C4816d.m10653a().mo39535a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo39557a(ErrorType errorType, String str) {
        C4816d.m10653a().mo39530a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo39558a(C4809a aVar, AdSessionContext adSessionContext) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject = new JSONObject();
        C4825b.m10696a(jSONObject, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C4825b.m10696a(jSONObject, "adSessionType", adSessionContext.getAdSessionContextType());
        C4825b.m10696a(jSONObject, "deviceInfo", C4824a.m10690d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4825b.m10696a(jSONObject, "supports", jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        C4825b.m10696a(jSONObject2, "partnerName", adSessionContext.getPartner().getName());
        C4825b.m10696a(jSONObject2, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4825b.m10696a(jSONObject, "omidNativeInfo", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C4825b.m10696a(jSONObject3, "libraryVersion", "1.2.13-Smaato");
        C4825b.m10696a(jSONObject3, "appId", C4815c.m10650a().mo39527b().getApplicationContext().getPackageName());
        C4825b.m10696a(jSONObject, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject3);
        if (adSessionContext.getCustomReferenceData() != null) {
            C4825b.m10696a(jSONObject, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject4 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4825b.m10696a(jSONObject4, next.getVendorKey(), next.getVerificationParameters());
        }
        C4816d.m10653a().mo39532a(getWebView(), adSessionId, jSONObject, jSONObject4);
    }

    /* renamed from: a */
    public void mo39559a(VideoEvents videoEvents) {
        this.f10876c = videoEvents;
    }

    /* renamed from: a */
    public void mo39560a(String str) {
        C4816d.m10653a().mo39531a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo39561a(String str, double d) {
        if (d > this.f10878e) {
            this.f10877d = C4833a.AD_STATE_VISIBLE;
            C4816d.m10653a().mo39540c(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo39562a(String str, JSONObject jSONObject) {
        C4816d.m10653a().mo39531a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo39563a(boolean z) {
        if (mo39568e()) {
            C4816d.m10653a().mo39541d(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo39564b() {
        this.f10874a.clear();
    }

    /* renamed from: b */
    public void mo39565b(String str, double d) {
        if (d > this.f10878e && this.f10877d != C4833a.AD_STATE_HIDDEN) {
            this.f10877d = C4833a.AD_STATE_HIDDEN;
            C4816d.m10653a().mo39540c(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo39566c() {
        return this.f10875b;
    }

    /* renamed from: d */
    public VideoEvents mo39567d() {
        return this.f10876c;
    }

    /* renamed from: e */
    public boolean mo39568e() {
        return this.f10874a.get() != null;
    }

    /* renamed from: f */
    public void mo39569f() {
        C4816d.m10653a().mo39528a(getWebView());
    }

    /* renamed from: g */
    public void mo39570g() {
        C4816d.m10653a().mo39538b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10874a.get();
    }

    /* renamed from: h */
    public void mo39572h() {
        this.f10878e = C4828d.m10708a();
        this.f10877d = C4833a.AD_STATE_IDLE;
    }
}
