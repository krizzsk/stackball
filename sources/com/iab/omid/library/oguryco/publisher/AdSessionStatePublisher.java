package com.iab.omid.library.oguryco.publisher;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdEvents;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.adsession.ErrorType;
import com.iab.omid.library.oguryco.adsession.VerificationScriptResource;
import com.iab.omid.library.oguryco.adsession.media.MediaEvents;
import com.iab.omid.library.oguryco.p114b.C4765d;
import com.iab.omid.library.oguryco.p114b.C4766e;
import com.iab.omid.library.oguryco.p116d.C4775a;
import com.iab.omid.library.oguryco.p116d.C4776b;
import com.iab.omid.library.oguryco.p116d.C4779d;
import com.iab.omid.library.oguryco.p117e.C4783b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4783b f10770a = new C4783b((WebView) null);

    /* renamed from: b */
    private AdEvents f10771b;

    /* renamed from: c */
    private MediaEvents f10772c;

    /* renamed from: d */
    private C4784a f10773d;

    /* renamed from: e */
    private long f10774e;

    /* renamed from: com.iab.omid.library.oguryco.publisher.AdSessionStatePublisher$a */
    enum C4784a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo39404i();
    }

    /* renamed from: a */
    public void mo39381a() {
    }

    /* renamed from: a */
    public void mo39382a(float f) {
        C4766e.m10428a().mo39355a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39383a(WebView webView) {
        this.f10770a = new C4783b(webView);
    }

    /* renamed from: a */
    public void mo39384a(AdEvents adEvents) {
        this.f10771b = adEvents;
    }

    /* renamed from: a */
    public void mo39385a(AdSessionConfiguration adSessionConfiguration) {
        C4766e.m10428a().mo39362a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo39386a(ErrorType errorType, String str) {
        C4766e.m10428a().mo39356a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo39387a(C4758a aVar, AdSessionContext adSessionContext) {
        mo39388a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39388a(C4758a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4776b.m10481a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C4776b.m10481a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4776b.m10481a(jSONObject2, "deviceInfo", C4775a.m10474d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4776b.m10481a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4776b.m10481a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4776b.m10481a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4776b.m10481a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4776b.m10481a(jSONObject4, "libraryVersion", "1.3.1-Oguryco");
        C4776b.m10481a(jSONObject4, "appId", C4765d.m10425a().mo39353b().getApplicationContext().getPackageName());
        C4776b.m10481a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4776b.m10481a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4776b.m10481a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4776b.m10481a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4766e.m10428a().mo39359a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo39389a(MediaEvents mediaEvents) {
        this.f10772c = mediaEvents;
    }

    /* renamed from: a */
    public void mo39390a(String str) {
        C4766e.m10428a().mo39358a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo39391a(String str, long j) {
        if (j >= this.f10774e) {
            this.f10773d = C4784a.AD_STATE_VISIBLE;
            C4766e.m10428a().mo39366b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo39392a(String str, JSONObject jSONObject) {
        C4766e.m10428a().mo39358a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo39393a(JSONObject jSONObject) {
        C4766e.m10428a().mo39367b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo39394a(boolean z) {
        if (mo39399e()) {
            C4766e.m10428a().mo39369c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo39395b() {
        this.f10770a.clear();
    }

    /* renamed from: b */
    public void mo39396b(String str, long j) {
        if (j >= this.f10774e && this.f10773d != C4784a.AD_STATE_NOTVISIBLE) {
            this.f10773d = C4784a.AD_STATE_NOTVISIBLE;
            C4766e.m10428a().mo39366b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo39397c() {
        return this.f10771b;
    }

    /* renamed from: d */
    public MediaEvents mo39398d() {
        return this.f10772c;
    }

    /* renamed from: e */
    public boolean mo39399e() {
        return this.f10770a.get() != null;
    }

    /* renamed from: f */
    public void mo39400f() {
        C4766e.m10428a().mo39354a(getWebView());
    }

    /* renamed from: g */
    public void mo39401g() {
        C4766e.m10428a().mo39365b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10770a.get();
    }

    /* renamed from: h */
    public void mo39403h() {
        C4766e.m10428a().mo39368c(getWebView());
    }

    /* renamed from: i */
    public void mo39404i() {
        this.f10774e = C4779d.m10493a();
        this.f10773d = C4784a.AD_STATE_IDLE;
    }
}
