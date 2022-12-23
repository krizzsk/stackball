package com.tapjoy.internal;

import android.os.Build;
import android.webkit.WebView;
import com.tapjoy.TapjoyConstants;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.ds */
public abstract class C9170ds {

    /* renamed from: a */
    public C9169dr f22529a = new C9169dr((WebView) null);

    /* renamed from: b */
    public C9137cr f22530b;

    /* renamed from: c */
    public C9149dc f22531c;

    /* renamed from: d */
    public int f22532d;

    /* renamed from: e */
    public long f22533e;

    /* renamed from: com.tapjoy.internal.ds$a */
    public enum C9171a {
        ;
        

        /* renamed from: a */
        public static final int f22534a = 1;

        /* renamed from: b */
        public static final int f22535b = 2;

        /* renamed from: c */
        public static final int f22536c = 3;

        static {
            f22537d = new int[]{1, 2, 3};
        }
    }

    public C9170ds() {
        mo57967d();
    }

    /* renamed from: a */
    public void mo57959a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57961a(WebView webView) {
        this.f22529a = new C9169dr(webView);
    }

    /* renamed from: a */
    public final void mo57963a(String str) {
        C9155dg.m24515a().mo57952a(mo57966c(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo57964a(String str, JSONObject jSONObject) {
        C9155dg.m24515a().mo57952a(mo57966c(), str, jSONObject);
    }

    /* renamed from: b */
    public void mo57965b() {
        this.f22529a.clear();
    }

    /* renamed from: c */
    public final WebView mo57966c() {
        return (WebView) this.f22529a.get();
    }

    /* renamed from: a */
    public final void mo57962a(C9145cz czVar, C9140cu cuVar) {
        String str = czVar.f22483f;
        JSONObject jSONObject = new JSONObject();
        C9163dm.m24535a(jSONObject, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C9163dm.m24535a(jSONObject, "adSessionType", cuVar.f22463f);
        JSONObject jSONObject2 = new JSONObject();
        C9163dm.m24535a(jSONObject2, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C9163dm.m24535a(jSONObject2, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C9163dm.m24535a(jSONObject2, "os", "Android");
        C9163dm.m24535a(jSONObject, "deviceInfo", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C9163dm.m24535a(jSONObject, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C9163dm.m24535a(jSONObject3, "partnerName", cuVar.f22458a.f22473a);
        C9163dm.m24535a(jSONObject3, "partnerVersion", cuVar.f22458a.f22474b);
        C9163dm.m24535a(jSONObject, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C9163dm.m24535a(jSONObject4, "libraryVersion", "1.2.19-Tapjoy");
        C9163dm.m24535a(jSONObject4, "appId", C9154df.m24514a().f22509a.getApplicationContext().getPackageName());
        C9163dm.m24535a(jSONObject, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (cuVar.f22462e != null) {
            C9163dm.m24535a(jSONObject, "customReferenceData", cuVar.f22462e);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (C9144cy cyVar : Collections.unmodifiableList(cuVar.f22460c)) {
            C9163dm.m24535a(jSONObject5, cyVar.f22475a, cyVar.f22477c);
        }
        C9155dg.m24515a().mo57953a(mo57966c(), "startSession", str, jSONObject, jSONObject5);
    }

    /* renamed from: a */
    public final void mo57960a(float f) {
        C9155dg.m24515a().mo57953a(mo57966c(), "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: d */
    public final void mo57967d() {
        this.f22533e = System.nanoTime();
        this.f22532d = C9171a.f22534a;
    }
}
