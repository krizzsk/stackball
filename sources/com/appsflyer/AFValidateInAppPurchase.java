package com.appsflyer;

import android.content.Context;
import com.applovin.sdk.AppLovinEventParameters;
import com.appsflyer.internal.C1740aa;
import com.appsflyer.internal.model.event.Purchase;
import com.appsflyer.internal.model.event.SdkServices;
import com.appsflyer.internal.model.event.Validate;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AFValidateInAppPurchase implements Runnable {

    /* renamed from: ı */
    private static String f3994 = "https://%ssdk-services.%s/validate-android-signature";

    /* renamed from: ɩ */
    private static String f3995;

    /* renamed from: Ɩ */
    private String f3996;

    /* renamed from: ǃ */
    private String f3997;
    /* access modifiers changed from: private */

    /* renamed from: ɹ */
    public Map<String, String> f3998;
    /* access modifiers changed from: private */

    /* renamed from: Ι */
    public WeakReference<Context> f3999;

    /* renamed from: ι */
    private String f4000;

    /* renamed from: І */
    private String f4001;

    /* renamed from: і */
    private String f4002;

    /* renamed from: Ӏ */
    private String f4003;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AppsFlyerLibCore.SERVER_BUILD_NUMBER);
        sb.append("/androidevent?buildnumber=6.1.3&app_id=");
        f3995 = sb.toString();
    }

    AFValidateInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.f3999 = new WeakReference<>(context);
        this.f4000 = str;
        this.f3997 = str2;
        this.f3996 = str4;
        this.f4002 = str5;
        this.f4003 = str6;
        this.f3998 = map;
        this.f4001 = str3;
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getValue();
            String str2 = (String) next.getKey();
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1421272810) {
                if (hashCode == 454162577 && str2.equals("sdk-services")) {
                    c = 0;
                }
            } else if (str2.equals("validate")) {
                c = 1;
            }
            if (c == 0) {
                f3994 = str;
            } else if (c == 1) {
                f3995 = str;
            }
        }
    }

    public void run() {
        String str = this.f4000;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.f3999.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.f3997);
                    hashMap.put("sig-data", this.f3996);
                    hashMap.put(InAppPurchaseMetaData.KEY_SIGNATURE, this.f4001);
                    final HashMap hashMap2 = new HashMap(hashMap);
                    new Thread(new Runnable() {
                        public final void run() {
                            AFValidateInAppPurchase aFValidateInAppPurchase = AFValidateInAppPurchase.this;
                            AFValidateInAppPurchase.m3732(aFValidateInAppPurchase, hashMap2, aFValidateInAppPurchase.f3998, AFValidateInAppPurchase.this.f3999);
                        }
                    }).start();
                    hashMap.put("dev_key", this.f4000);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put(ServerParameters.AF_USER_ID, AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM));
                    String jSONObject = new JSONObject(hashMap).toString();
                    String url = ServerConfigHandler.getUrl(f3994);
                    C1740aa.m3833().mo14060("server_request", url, jSONObject);
                    HttpURLConnection r1 = m3730((Purchase) new SdkServices().addParams(hashMap).urlString(url));
                    int i = -1;
                    if (r1 != null) {
                        i = r1.getResponseCode();
                    }
                    String readServerResponse = AppsFlyerLibCore.getInstance().readServerResponse(r1);
                    C1740aa.m3833().mo14060("server_response", url, String.valueOf(i), readServerResponse);
                    JSONObject jSONObject2 = new JSONObject(readServerResponse);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                        sb.append(jSONObject2.toString());
                        AFLogger.afInfoLog(sb.toString());
                        m3729(jSONObject2.optBoolean(IronSourceConstants.EVENTS_RESULT), this.f3996, this.f4002, this.f4003, jSONObject2.toString());
                    } else {
                        AFLogger.afInfoLog("Failed Validate request");
                        m3729(false, this.f3996, this.f4002, this.f4003, jSONObject2.toString());
                    }
                    if (r1 != null) {
                        r1.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ɩ */
    private static HttpURLConnection m3730(Purchase purchase) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(purchase.urlString());
        AFLogger.afDebugLog(sb.toString());
        return new BackgroundHttpTask(purchase.trackingStopped(AppsFlyerLib.getInstance().isStopped())).doInBackground();
    }

    /* renamed from: ı */
    private static void m3729(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLibCore.f4011 != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AppsFlyerLibCore.f4011.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLibCore.f4011;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    /* renamed from: Ι */
    static /* synthetic */ void m3732(AFValidateInAppPurchase aFValidateInAppPurchase, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl(f3995));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            String string = AppsFlyerLibCore.getSharedPreferences((Context) weakReference.get()).getString("referrer", "");
            AFEvent key = new Validate((Context) weakReference.get()).key(aFValidateInAppPurchase.f4000);
            key.f3948 = string;
            Validate validate = (Validate) key;
            Map<String, Object> r1 = AppsFlyerLibCore.getInstance().mo13950((AFEvent) validate);
            r1.put("price", aFValidateInAppPurchase.f4002);
            r1.put("currency", aFValidateInAppPurchase.f4003);
            r1.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, map);
            if (map2 != null) {
                r1.put("extra_prms", map2);
            }
            String jSONObject = new JSONObject(r1).toString();
            C1740aa.m3833().mo14060("server_request", obj, jSONObject);
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection r6 = m3730((Purchase) validate.addParams(r1).urlString(obj));
                int i = -1;
                if (r6 != null) {
                    i = r6.getResponseCode();
                }
                String readServerResponse = AppsFlyerLibCore.getInstance().readServerResponse(r6);
                C1740aa.m3833().mo14060("server_response", obj, String.valueOf(i), readServerResponse);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(i);
                sb2.append(": ");
                sb2.append(new JSONObject(readServerResponse).toString());
                AFLogger.afInfoLog(sb2.toString());
                if (r6 != null) {
                    r6.disconnect();
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }
}
