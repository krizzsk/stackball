package com.chartboost.sdk.Tracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.impl.C1965p0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.services.purchasing.core.TransactionDetailsUtilities;
import java.util.EnumMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class CBAnalytics {

    public enum CBIAPPurchaseInfo {
        PRODUCT_ID,
        PRODUCT_TITLE,
        PRODUCT_DESCRIPTION,
        PRODUCT_PRICE,
        PRODUCT_CURRENCY_CODE,
        GOOGLE_PURCHASE_DATA,
        GOOGLE_PURCHASE_SIGNATURE,
        AMAZON_PURCHASE_TOKEN,
        AMAZON_USER_ID
    }

    public enum CBIAPType {
        GOOGLE_PLAY,
        AMAZON
    }

    public enum CBLevelType {
        HIGHEST_LEVEL_REACHED(1),
        CURRENT_AREA(2),
        CHARACTER_LEVEL(3),
        OTHER_SEQUENTIAL(4),
        OTHER_NONSEQUENTIAL(5);
        

        /* renamed from: a */
        private final int f4612a;

        private CBLevelType(int i) {
            this.f4612a = i;
        }

        public int getLevelType() {
            return this.f4612a;
        }
    }

    private CBAnalytics() {
    }

    /* renamed from: a */
    private static synchronized void m4214a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, CBIAPType cBIAPType) {
        CBIAPType cBIAPType2 = cBIAPType;
        synchronized (CBAnalytics.class) {
            C2022j b = C2022j.m4955b();
            if (b == null) {
                CBLogging.m3993b("CBPostInstallTracker", "You need call Chartboost.startWithAppId() before tracking in-app purchases");
            } else if (b.mo14899d() == null) {
                CBLogging.m3993b("CBPostInstallTracker", "You need call Chartboost.init() before calling any public API's");
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
                CBLogging.m3993b("CBPostInstallTracker", "Null object is passed. Please pass a valid value object");
            } else {
                try {
                    String str10 = str4;
                    Matcher matcher = Pattern.compile("(\\d+\\.\\d+)|(\\d+)").matcher(str4);
                    matcher.find();
                    String group = matcher.group();
                    if (TextUtils.isEmpty(group)) {
                        CBLogging.m3993b("CBPostInstallTracker", "Invalid price object");
                        return;
                    }
                    float parseFloat = Float.parseFloat(group);
                    JSONObject jSONObject = null;
                    if (cBIAPType2 == CBIAPType.GOOGLE_PLAY) {
                        if (!TextUtils.isEmpty(str6)) {
                            if (!TextUtils.isEmpty(str7)) {
                                jSONObject = C1825e.m4025a(C1825e.m4023a("purchaseData", (Object) str6), C1825e.m4023a("purchaseSignature", (Object) str7), C1825e.m4023a("type", (Object) Integer.valueOf(CBIAPType.GOOGLE_PLAY.ordinal())));
                            }
                        }
                        CBLogging.m3993b("CBPostInstallTracker", "Null object is passed for for purchase data or purchase signature");
                        return;
                    } else if (cBIAPType2 == CBIAPType.AMAZON) {
                        if (!TextUtils.isEmpty(str8)) {
                            if (!TextUtils.isEmpty(str9)) {
                                jSONObject = C1825e.m4025a(C1825e.m4023a((String) SDKConstants.PARAM_USER_ID, (Object) str8), C1825e.m4023a("purchaseToken", (Object) str9), C1825e.m4023a("type", (Object) Integer.valueOf(CBIAPType.AMAZON.ordinal())));
                            }
                        }
                        CBLogging.m3993b("CBPostInstallTracker", "Null object is passed for for amazon user id or amazon purchase token");
                        return;
                    }
                    if (jSONObject == null) {
                        CBLogging.m3993b("CBPostInstallTracker", "Error while parsing the receipt to a JSON Object, ");
                        return;
                    }
                    String str11 = str2;
                    String str12 = str3;
                    String str13 = str;
                    m4213a(b.f5233w, b.f5234x, C1825e.m4025a(C1825e.m4023a("localized-title", (Object) str2), C1825e.m4023a("localized-description", (Object) str3), C1825e.m4023a("price", (Object) Float.valueOf(parseFloat)), C1825e.m4023a("currency", (Object) str5), C1825e.m4023a("productID", (Object) str), C1825e.m4023a((String) TransactionDetailsUtilities.RECEIPT, (Object) Base64.encodeToString(jSONObject.toString().getBytes(), 2))), "iap", cBIAPType2);
                } catch (IllegalStateException unused) {
                    CBLogging.m3993b("CBPostInstallTracker", "Invalid price object");
                }
            }
        }
    }

    public static synchronized void trackInAppAmazonStorePurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        synchronized (CBAnalytics.class) {
            m4214a(str5, str, str2, str3, str4, (String) null, (String) null, str6, str7, CBIAPType.AMAZON);
        }
    }

    public static synchronized void trackInAppGooglePlayPurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        synchronized (CBAnalytics.class) {
            m4214a(str5, str, str2, str3, str4, str6, str7, (String) null, (String) null, CBIAPType.GOOGLE_PLAY);
        }
    }

    public static synchronized void trackLevelInfo(String str, CBLevelType cBLevelType, int i, String str2) {
        synchronized (CBAnalytics.class) {
            trackLevelInfo(str, cBLevelType, i, 0, str2);
        }
    }

    public synchronized void trackInAppPurchaseEvent(EnumMap<CBIAPPurchaseInfo, String> enumMap, CBIAPType cBIAPType) {
        if (!(enumMap == null || cBIAPType == null)) {
            if (!TextUtils.isEmpty(enumMap.get(CBIAPPurchaseInfo.PRODUCT_ID)) && !TextUtils.isEmpty(enumMap.get(CBIAPPurchaseInfo.PRODUCT_TITLE)) && !TextUtils.isEmpty(enumMap.get(CBIAPPurchaseInfo.PRODUCT_DESCRIPTION)) && !TextUtils.isEmpty(enumMap.get(CBIAPPurchaseInfo.PRODUCT_PRICE))) {
                if (!TextUtils.isEmpty(enumMap.get(CBIAPPurchaseInfo.PRODUCT_CURRENCY_CODE))) {
                    m4214a(enumMap.get(CBIAPPurchaseInfo.PRODUCT_ID), enumMap.get(CBIAPPurchaseInfo.PRODUCT_TITLE), enumMap.get(CBIAPPurchaseInfo.PRODUCT_DESCRIPTION), enumMap.get(CBIAPPurchaseInfo.PRODUCT_PRICE), enumMap.get(CBIAPPurchaseInfo.PRODUCT_CURRENCY_CODE), enumMap.get(CBIAPPurchaseInfo.GOOGLE_PURCHASE_DATA), enumMap.get(CBIAPPurchaseInfo.GOOGLE_PURCHASE_SIGNATURE), enumMap.get(CBIAPPurchaseInfo.AMAZON_USER_ID), enumMap.get(CBIAPPurchaseInfo.AMAZON_PURCHASE_TOKEN), cBIAPType);
                    return;
                }
            }
        }
        CBLogging.m3993b("CBPostInstallTracker", "Null object is passed. Please pass a valid value object");
    }

    public static synchronized void trackLevelInfo(String str, CBLevelType cBLevelType, int i, int i2, String str2) {
        synchronized (CBAnalytics.class) {
            C2022j b = C2022j.m4955b();
            if (b == null) {
                CBLogging.m3993b("CBPostInstallTracker", "trackLevelInfo: SDK is not initialized");
            } else if (TextUtils.isEmpty(str)) {
                CBLogging.m3993b("CBPostInstallTracker", "Invalid value: event label cannot be empty or null");
            } else if (cBLevelType == null) {
                CBLogging.m3993b("CBPostInstallTracker", "Invalid value: level type cannot be empty or null, please choose from one of the CBLevelType enum values");
            } else if (i < 0 || i2 < 0) {
                CBLogging.m3993b("CBPostInstallTracker", "Invalid value: Level number should be > 0");
            } else if (str2.isEmpty()) {
                CBLogging.m3993b("CBPostInstallTracker", "Invalid value: description cannot be empty or null");
            } else {
                Context d = b.mo14899d();
                if (d != null) {
                    C2022j.m4948a(d);
                }
                JSONObject a = C1825e.m4025a(C1825e.m4023a("event_label", (Object) str), C1825e.m4023a("event_field", (Object) Integer.valueOf(cBLevelType.getLevelType())), C1825e.m4023a("main_level", (Object) Integer.valueOf(i)), C1825e.m4023a("sub_level", (Object) Integer.valueOf(i2)), C1825e.m4023a("description", (Object) str2), C1825e.m4023a("timestamp", (Object) Long.valueOf(System.currentTimeMillis())), C1825e.m4023a("data_type", (Object) "level_info"));
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(a);
                m4212a(b.f5233w, b.f5234x, jSONArray, "tracking");
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m4213a(C1855g gVar, C1842g gVar2, JSONObject jSONObject, String str, CBIAPType cBIAPType) {
        synchronized (CBAnalytics.class) {
            C1965p0 p0Var = new C1965p0("https://live.chartboost.com", String.format(Locale.US, "%s%s", new Object[]{"/post-install-event/", str}), gVar2, 2, (C1965p0.C1966a) null);
            p0Var.mo14750a(str, (Object) jSONObject);
            p0Var.f5055m = true;
            p0Var.mo14749a(str);
            gVar.mo14335a(p0Var);
        }
    }

    /* renamed from: a */
    private static synchronized void m4212a(C1855g gVar, C1842g gVar2, JSONArray jSONArray, String str) {
        synchronized (CBAnalytics.class) {
            C1965p0 p0Var = new C1965p0("https://live.chartboost.com", "/post-install-event/".concat("tracking"), gVar2, 2, (C1965p0.C1966a) null);
            p0Var.mo14750a("track_info", (Object) jSONArray);
            p0Var.f5055m = true;
            p0Var.mo14749a(str);
            gVar.mo14335a(p0Var);
        }
    }
}
