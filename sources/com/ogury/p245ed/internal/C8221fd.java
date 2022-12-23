package com.ogury.p245ed.internal;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fd */
public final class C8221fd {

    /* renamed from: a */
    private final C8212ez f21282a;

    /* renamed from: b */
    private final C8216fa f21283b;

    /* renamed from: c */
    private final C8244fx f21284c;

    public C8221fd(C8212ez ezVar, C8216fa faVar, C8244fx fxVar) {
        C8467mq.m23881b(ezVar, "device");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(fxVar, "coreWrapper");
        this.f21282a = ezVar;
        this.f21283b = faVar;
        this.f21284c = fxVar;
    }

    /* renamed from: a */
    public final JSONObject mo53484a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TapjoyConstants.TJC_DEVICE_TIMEZONE, C8212ez.m22973f());
        jSONObject.put("aaid", "00000000-0000-0000-0000-000000000000");
        jSONObject.put(TapjoyConstants.TJC_DEVICE_LANGUAGE, this.f21283b.mo53474c());
        jSONObject.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, this.f21283b.mo53475d());
        jSONObject.put("install_unknown_sources", this.f21282a.mo53455h());
        jSONObject.put("aaid_optin", this.f21284c.mo53566a().isAdTrackingEnabled());
        jSONObject.put("privacy_compliancy", m23024a(this.f21284c.mo53568c()));
        jSONObject.put("instance_token", this.f21284c.mo53569d());
        jSONObject.put("device", m23025b());
        jSONObject.put("permissions", m23027d());
        return jSONObject;
    }

    /* renamed from: b */
    private final JSONObject m23025b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.f21282a.mo53456i());
        jSONObject.put("screen", m23026c());
        jSONObject.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, C8212ez.m22966a());
        jSONObject.put("vm_name", C8212ez.m22971d());
        jSONObject.put("phone_arch", C8212ez.m22972e());
        jSONObject.put("vm_version", C8212ez.m22970c());
        return jSONObject;
    }

    /* renamed from: c */
    private static JSONObject m23026c() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("density", Float.valueOf(displayMetrics.density));
        jSONObject.put("height", displayMetrics.heightPixels);
        jSONObject.put("width", displayMetrics.widthPixels);
        return jSONObject;
    }

    /* renamed from: d */
    private final JSONObject m23027d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ACCESS_NETWORK_STATE", this.f21283b.mo53472a("android.permission.ACCESS_NETWORK_STATE"));
        jSONObject.put("RECEIVE_BOOT_COMPLETED", this.f21283b.mo53472a("android.permission.RECEIVE_BOOT_COMPLETED"));
        jSONObject.put("SYSTEM_ALERT_WINDOW", this.f21283b.mo53472a("android.permission.SYSTEM_ALERT_WINDOW"));
        jSONObject.put("GET_ACCOUNTS", this.f21283b.mo53472a("android.permission.GET_ACCOUNTS"));
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m23024a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("consent_token", str);
        return jSONObject;
    }
}
