package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.webkit.WebView;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.s4 */
public abstract class C14560s4 {

    /* renamed from: a */
    private gt1 f39833a = new gt1((WebView) null);

    /* renamed from: b */
    private C14861v1 f39834b;

    /* renamed from: c */
    private tl0 f39835c;

    /* renamed from: d */
    private C14561a f39836d;

    /* renamed from: e */
    private long f39837e;

    /* renamed from: com.yandex.mobile.ads.impl.s4$a */
    enum C14561a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public C14560s4() {
        mo69868f();
    }

    /* renamed from: a */
    public void mo66115a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69857a(WebView webView) {
        this.f39833a = new gt1(webView);
    }

    /* renamed from: a */
    public void mo69858a(C14253p4 p4Var) {
        vt1.m43343a().mo70586a(mo69867e(), p4Var.mo69317c());
    }

    /* renamed from: a */
    public void mo69859a(tl0 tl0) {
        this.f39835c = tl0;
    }

    /* renamed from: a */
    public void mo66116a(ts1 ts1, C14353q4 q4Var) {
        mo69860a(ts1, q4Var, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69860a(ts1 ts1, C14353q4 q4Var, JSONObject jSONObject) {
        String h = ts1.mo70227h();
        JSONObject jSONObject2 = new JSONObject();
        ft1.m36312a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        ft1.m36312a(jSONObject2, "adSessionType", q4Var.mo69477a());
        JSONObject jSONObject3 = new JSONObject();
        ft1.m36312a(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        ft1.m36312a(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        ft1.m36312a(jSONObject3, "os", "Android");
        ft1.m36312a(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        ft1.m36312a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        ft1.m36312a(jSONObject4, "partnerName", q4Var.mo69482f().mo69836a());
        ft1.m36312a(jSONObject4, "partnerVersion", q4Var.mo69482f().mo69837b());
        ft1.m36312a(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        ft1.m36312a(jSONObject5, "libraryVersion", "1.3.26-Yandex");
        ft1.m36312a(jSONObject5, "appId", qt1.m41436a().mo69650b().getApplicationContext().getPackageName());
        ft1.m36312a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject5);
        if (q4Var.mo69478b() != null) {
            ft1.m36312a(jSONObject2, "contentUrl", q4Var.mo69478b());
        }
        if (q4Var.mo69479c() != null) {
            ft1.m36312a(jSONObject2, "customReferenceData", q4Var.mo69479c());
        }
        JSONObject jSONObject6 = new JSONObject();
        for (aj1 next : q4Var.mo69483g()) {
            ft1.m36312a(jSONObject6, next.mo65786b(), next.mo65787c());
        }
        vt1.m43343a().mo70584a(mo69867e(), h, jSONObject2, jSONObject6, jSONObject);
    }

    /* renamed from: a */
    public void mo69861a(C14861v1 v1Var) {
        this.f39834b = v1Var;
    }

    /* renamed from: a */
    public void mo69862a(String str, long j) {
        if (j >= this.f39837e) {
            this.f39836d = C14561a.AD_STATE_VISIBLE;
            vt1.m43343a().mo70589b(mo69867e(), str);
        }
    }

    /* renamed from: b */
    public void mo66117b() {
        this.f39833a.clear();
    }

    /* renamed from: b */
    public void mo69864b(String str, long j) {
        C14561a aVar;
        if (j >= this.f39837e && this.f39836d != (aVar = C14561a.AD_STATE_NOTVISIBLE)) {
            this.f39836d = aVar;
            vt1.m43343a().mo70589b(mo69867e(), str);
        }
    }

    /* renamed from: c */
    public C14861v1 mo69865c() {
        return this.f39834b;
    }

    /* renamed from: d */
    public tl0 mo69866d() {
        return this.f39835c;
    }

    /* renamed from: e */
    public WebView mo69867e() {
        return (WebView) this.f39833a.get();
    }

    /* renamed from: f */
    public void mo69868f() {
        this.f39837e = System.nanoTime();
        this.f39836d = C14561a.AD_STATE_IDLE;
    }

    /* renamed from: a */
    public void mo69863a(boolean z) {
        if (this.f39833a.get() != null) {
            vt1.m43343a().mo70591c(mo69867e(), z ? "foregrounded" : "backgrounded");
        }
    }
}
