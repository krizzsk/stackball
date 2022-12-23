package com.ironsource.sdk.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.C5517c;
import com.ironsource.environment.C5527g;
import com.ironsource.p133c.C5499a;
import com.ironsource.sdk.utils.C6058a;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.b */
public class C6050b {

    /* renamed from: a */
    private static final String f14822a = C6050b.class.getSimpleName();

    /* renamed from: a */
    public static JSONObject m14922a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(advertiserId)) {
            try {
                Logger.m14957i(f14822a, "add AID and LAT");
                jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static void m14923a(JSONObject jSONObject, String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static JSONObject m14924b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            m14923a(jSONObject, "displaySizeWidth", String.valueOf(C5527g.m13157k()));
            m14923a(jSONObject, "displaySizeHeight", String.valueOf(C5527g.m13159l()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String a = C5499a.m13042a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), C5499a.m13047c(context));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C5527g.m13168p())));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL), C5527g.m13178w(context));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("lpm"), C5527g.m13179x(context));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            C6058a.m14963a(context);
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C6058a.m14965b(context));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("sdCardAvailable")) {
                jSONObject.put(SDKUtils.encodeString("sdCardAvailable"), C5527g.m13143d());
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("isCharging")) {
                jSONObject.put(SDKUtils.encodeString("isCharging"), C5527g.m13148f(context));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("chargingType")) {
                jSONObject.put(SDKUtils.encodeString("chargingType"), C5527g.m13149g(context));
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("airplaneMode")) {
                jSONObject.put(SDKUtils.encodeString("airplaneMode"), C5527g.m13152h(context));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("stayOnWhenPluggedIn")) {
                jSONObject.put(SDKUtils.encodeString("stayOnWhenPluggedIn"), C5527g.m13154i(context));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m14925c(Context context) {
        C6058a a = C6058a.m14963a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String str = a.f14845a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f14846b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
            }
            String str3 = a.f14847c;
            if (str3 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
            }
            String str4 = a.f14848d;
            if (str4 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
            }
            String str5 = a.f14848d;
            if (str5 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
            }
            jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), String.valueOf(a.f14849e));
            jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(C6058a.m14964a()));
            if (a.f14850f != null && a.f14850f.length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f14850f));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
            }
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("totalDeviceRAM")) {
                jSONObject.put(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C5527g.m13145e(context))));
            }
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
            }
            String valueOf = String.valueOf(C5527g.m13165o());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(C5527g.m13156j());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), C6052d.m14932a(context));
            jSONObject.put("mcc", C5505a.C55061.m13080c(context));
            jSONObject.put("mnc", C5505a.C55061.m13083d(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), C5505a.C55061.m13086f(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C5505a.C55061.m13085e(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C5517c.m13103b(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C5517c.m13100a(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C5517c.m13105c(context)));
            String d = C5517c.m13107d(context);
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
            }
            jSONObject.put("localTime", SDKUtils.encodeString(String.valueOf(C5527g.m13131a())));
            jSONObject.put("timezoneOffset", SDKUtils.encodeString(String.valueOf(C5527g.m13137b())));
            String k = C5527g.m13158k(context);
            if (!TextUtils.isEmpty(k)) {
                jSONObject.put("icc", k);
            }
            String c = C5527g.m13140c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("tz", SDKUtils.encodeString(c));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
