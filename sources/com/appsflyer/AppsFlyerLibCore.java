package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import com.appsflyer.AFFacebookDeferredDeeplink;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.Foreground;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DdlEvent;
import com.appsflyer.deeplink.DeepLinkCallbacks;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.ActivityCompat;
import com.appsflyer.internal.C1740aa;
import com.appsflyer.internal.C1741ab;
import com.appsflyer.internal.C1743ad;
import com.appsflyer.internal.C1758n;
import com.appsflyer.internal.C1774t;
import com.appsflyer.internal.C1777u;
import com.appsflyer.internal.C1778v;
import com.appsflyer.internal.C1779w;
import com.appsflyer.internal.C1780x;
import com.appsflyer.internal.C1781y;
import com.appsflyer.internal.C1783z;
import com.appsflyer.internal.EventDataCollector;
import com.appsflyer.internal.Exlytics;
import com.appsflyer.internal.attribution.RequestErrorMessage;
import com.appsflyer.internal.model.event.AdRevenue;
import com.appsflyer.internal.model.event.Attr;
import com.appsflyer.internal.model.event.BackgroundReferrerLaunch;
import com.appsflyer.internal.model.event.CachedEvent;
import com.appsflyer.internal.model.event.InAppEvent;
import com.appsflyer.internal.model.event.Launch;
import com.appsflyer.internal.model.event.UninstallTokenEvent;
import com.appsflyer.internal.referrer.GoogleReferrer;
import com.appsflyer.internal.referrer.HuaweiReferrer;
import com.appsflyer.internal.referrer.Referrer;
import com.appsflyer.internal.referrer.SamsungReferrer;
import com.appsflyer.share.Constants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.NetworkInterface;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLibCore extends AppsFlyerLib {
    public static final String AF_PRE_INSTALL_PATH = "AF_PRE_INSTALL_PATH";
    public static final String BUILD_NUMBER = "6.1.3";
    public static String FIRST_LAUNCHES_URL = null;
    public static final String INSTALL_REFERRER_PREF = "rfr";
    public static final String IS_STOP_TRACKING_USED = "is_stop_tracking_used";
    public static final String LOG_TAG = "AppsFlyer_6.1.3";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT = "/data/local/tmp/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT_ETC = "/etc/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_RO_PROP = "ro.appsflyer.preinstall.path";
    public static String REFERRER_TRACKING_URL = null;
    public static String REGISTER_URL = null;
    public static final String SERVER_BUILD_NUMBER = "6.1";
    public static AppsFlyerConversionListener conversionDataListener = null;
    public static AppsFlyerLibCore instance = new AppsFlyerLibCore();

    /* renamed from: Ɩ */
    private static final String f4010;

    /* renamed from: ǃ */
    static AppsFlyerInAppPurchaseValidatorListener f4011 = null;

    /* renamed from: ȷ */
    private static final List<String> f4012 = Arrays.asList(new String[]{"is_cache"});

    /* renamed from: ɹ */
    private static String f4013 = null;

    /* renamed from: ɾ */
    private static String f4014 = null;

    /* renamed from: ι */
    public static final String f4015 = "78";

    /* renamed from: І */
    private static String f4016 = "https://%sstats.%s/stats";

    /* renamed from: і */
    private static String f4017;

    /* renamed from: Ӏ */
    private static final String f4018;
    public EventDataCollector eventDataCollector;
    public String[] sharingFilter;

    /* renamed from: ı */
    public String f4019;
    /* access modifiers changed from: private */

    /* renamed from: ŀ */
    public ScheduledExecutorService f4020 = null;
    /* access modifiers changed from: private */

    /* renamed from: ł */
    public long f4021;

    /* renamed from: ſ */
    private boolean f4022;

    /* renamed from: Ɨ */
    private C1783z f4023 = new C1783z();

    /* renamed from: ƚ */
    private String f4024;

    /* renamed from: ǀ */
    private boolean f4025 = false;

    /* renamed from: ɍ */
    private boolean f4026;

    /* renamed from: ɔ */
    private boolean f4027 = false;

    /* renamed from: ɟ */
    private boolean f4028 = false;

    /* renamed from: ɨ */
    private long f4029 = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: ɩ */
    public String f4030;

    /* renamed from: ɪ */
    private long f4031 = -1;
    /* access modifiers changed from: private */

    /* renamed from: ɺ */
    public Application f4032;
    /* access modifiers changed from: private */

    /* renamed from: ɼ */
    public Map<String, Object> f4033;

    /* renamed from: ɿ */
    private boolean f4034 = false;

    /* renamed from: ʅ */
    private Map<Long, String> f4035;
    /* access modifiers changed from: private */

    /* renamed from: ʟ */
    public long f4036;

    /* renamed from: ͻ */
    private String f4037;

    /* renamed from: Ι */
    long f4038;
    /* access modifiers changed from: private */

    /* renamed from: ϲ */
    public SharedPreferences f4039;
    /* access modifiers changed from: private */

    /* renamed from: ϳ */
    public final JSONObject f4040 = new JSONObject();
    /* access modifiers changed from: private */

    /* renamed from: Ј */
    public Map<String, Object> f4041;
    /* access modifiers changed from: private */

    /* renamed from: г */
    public boolean f4042 = false;
    /* access modifiers changed from: private */

    /* renamed from: с */
    public boolean f4043 = false;
    /* access modifiers changed from: private */

    /* renamed from: х */
    public Referrer[] f4044;

    /* renamed from: ӏ */
    private long f4045 = -1;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SERVER_BUILD_NUMBER);
        sb.append("/androidevent?buildnumber=6.1.3&app_id=");
        f4018 = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sregister.%s/api/v");
        sb2.append(f4018);
        REGISTER_URL = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb3.append(SERVER_BUILD_NUMBER);
        sb3.append("/android?buildnumber=6.1.3&app_id=");
        f4017 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(SERVER_BUILD_NUMBER);
        sb4.append("/androidevent?app_id=");
        f4010 = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sconversions.%s/api/v");
        sb5.append(f4010);
        FIRST_LAUNCHES_URL = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%slaunches.%s/api/v");
        sb6.append(f4010);
        f4013 = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sinapps.%s/api/v");
        sb7.append(f4010);
        f4014 = sb7.toString();
        StringBuilder sb8 = new StringBuilder("https://%sattr.%s/api/v");
        sb8.append(f4010);
        REFERRER_TRACKING_URL = sb8.toString();
    }

    public AppsFlyerLibCore() {
        AFVersionDeclaration.init();
    }

    public static AppsFlyerLibCore getInstance() {
        return instance;
    }

    public void performOnAppAttribution(Context context, URI uri) {
        if (uri == null || uri.toString().isEmpty()) {
            StringBuilder sb = new StringBuilder("Link is \"");
            sb.append(uri);
            sb.append("\"");
            DeepLinkCallbacks.onDeepLinkingError(sb.toString());
        } else if (context == null) {
            StringBuilder sb2 = new StringBuilder("Context is \"");
            sb2.append(context);
            sb2.append("\"");
            DeepLinkCallbacks.onDeepLinkingError(sb2.toString());
        } else {
            AFDeepLinkManager.getInstance();
            AFDeepLinkManager.m3692(context, new HashMap(), Uri.parse(uri.toString()));
        }
    }

    public void setSharingFilter(String... strArr) {
        if (strArr != null && !Arrays.equals(this.sharingFilter, new String[]{TtmlNode.COMBINE_ALL})) {
            Pattern compile = Pattern.compile("[\\d\\w_]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || !compile.matcher(str).matches()) {
                    AFLogger.afWarnLog("Invalid partner name :".concat(String.valueOf(str)));
                } else {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                this.sharingFilter = (String[]) arrayList.toArray(new String[0]);
            } else {
                this.sharingFilter = null;
            }
        }
    }

    public void setSharingFilterForAllPartners() {
        this.sharingFilter = new String[]{TtmlNode.COMBINE_ALL};
    }

    public void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        AFDeepLinkManager instance2 = AFDeepLinkManager.getInstance();
        instance2.contains = str;
        instance2.parameters = map;
    }

    public void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        AFDeepLinkManager.getInstance().deepLinkListener = deepLinkListener;
    }

    public void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        DdlEvent.LISTENER_TIMEOUT = j;
        subscribeForDeepLink(deepLinkListener);
    }

    public void addPushNotificationDeepLinkPath(String... strArr) {
        List asList = Arrays.asList(strArr);
        List<List<String>> list = AFDeepLinkManager.getInstance().deepLinkSearchPaths;
        if (!list.contains(asList)) {
            list.add(asList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final void mo13946(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            getInstance();
            String stringExtra = intent.getStringExtra("appsflyer_preinstall");
            try {
                if (new JSONObject(stringExtra).has(Constants.URL_MEDIA_SOURCE)) {
                    AppsFlyerProperties.getInstance().set("preInstallName", stringExtra);
                } else {
                    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e) {
                AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            }
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String stringExtra2 = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putString("referrer", stringExtra2);
            edit.apply();
            AppsFlyerProperties.getInstance().setReferrer(stringExtra2);
            if (AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFEvent context2 = new BackgroundReferrerLaunch().context(context);
                context2.f3948 = stringExtra2;
                if (stringExtra2 != null && stringExtra2.length() > 5 && m3761(context2, getSharedPreferences(context))) {
                    m3779(AFExecutor.getInstance().mo13841(), new C1724e(this, context2, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* renamed from: ǃ */
    private static void m3760(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i2++;
                            str = next;
                        }
                    }
                    continue;
                } catch (JSONException unused2) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    /* renamed from: ǃ */
    static void m3756(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = getSharedPreferences(context).getString("extraReferrers", (String) null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray2 = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray2 = new JSONArray();
                }
                JSONObject jSONObject3 = jSONObject2;
                jSONArray = jSONArray2;
                jSONObject = jSONObject3;
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                m3760(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject4 = jSONObject.toString();
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putString("extraReferrers", jSONObject4);
            edit.apply();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    public void stop(boolean z, Context context) {
        this.f4025 = z;
        C1779w.m3910();
        try {
            File r6 = C1779w.m3913(context);
            if (!r6.exists()) {
                r6.mkdir();
            } else {
                for (File file : r6.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file.getName());
                    AFLogger.afInfoLog(sb.toString());
                    C1779w.m3914(C1779w.m3912(file).f3959, context);
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Could not cache request", e);
        }
        if (this.f4025) {
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putBoolean(IS_STOP_TRACKING_USED, true);
            edit.apply();
        }
    }

    public String getSdkVersion() {
        C1740aa.m3833().mo14060("public_api_call", "getSdkVersion", new String[0]);
        StringBuilder sb = new StringBuilder("version: 6.1.3 (build ");
        sb.append(f4015);
        sb.append(")");
        return sb.toString();
    }

    public void onPause(Context context) {
        if (Foreground.listener != null) {
            Foreground.listener.onBecameBackground(context);
        }
    }

    public void updateServerUninstallToken(Context context, String str) {
        C1743ad.m3850(context, str);
    }

    public void setDebugLog(boolean z) {
        setLogLevel(z ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
    }

    public void setImeiData(String str) {
        C1740aa.m3833().mo14060("public_api_call", "setImeiData", str);
        this.f4019 = str;
    }

    public void setOaidData(String str) {
        C1740aa.m3833().mo14060("public_api_call", "setOaidData", str);
        AdvertisingIdUtil.f4009 = str;
    }

    public void setAndroidIdData(String str) {
        C1740aa.m3833().mo14060("public_api_call", "setAndroidIdData", str);
        this.f4030 = str;
    }

    public AppsFlyerLib enableLocationCollection(boolean z) {
        this.f4034 = z;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: ı */
    public static void m3744(Context context, String str, long j) {
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    /* renamed from: Ι */
    private static boolean m3783(String str, boolean z) {
        return AppsFlyerProperties.getInstance().getBoolean(str, z);
    }

    /* renamed from: ι */
    private static boolean m3792() {
        if (!m3783(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) || AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) != null) {
            return false;
        }
        return true;
    }

    public void waitForCustomerUserId(boolean z) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    public void setCustomerIdAndLogSession(String str, Context context) {
        if (context == null) {
            return;
        }
        if (m3792()) {
            setCustomerUserId(str);
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
            if (referrer == null) {
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            AFEvent context2 = new Launch().context(context);
            context2.f3939 = null;
            AFEvent key = context2.key(string);
            key.f3947 = null;
            key.f3948 = referrer;
            key.f3944 = null;
            m3777(key);
            if (AppsFlyerProperties.getInstance().getString("afUninstallToken") != null) {
                mo13949(context, AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                return;
            }
            return;
        }
        setCustomerUserId(str);
        AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
    }

    public String getOutOfStore(Context context) {
        String str;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        if (context == null) {
            str = null;
        } else {
            str = m3774("AF_STORE", context.getPackageManager(), context.getPackageName());
        }
        if (str != null) {
            return str;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    public void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.m3713("Cannot set setOutOfStore with null");
    }

    public void setAppInviteOneLink(String str) {
        C1740aa.m3833().mo14060("public_api_call", "setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_ID, str);
    }

    public void setAdditionalData(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            C1740aa.m3833().mo14060("public_api_call", "setAdditionalData", hashMap.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(hashMap).toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendPushNotificationData(android.app.Activity r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "c"
            java.lang.String r2 = "pid"
            r3 = 1
            r4 = 0
            r5 = 2
            java.lang.String r6 = "public_api_call"
            java.lang.String r7 = "sendPushNotificationData"
            if (r17 == 0) goto L_0x003d
            android.content.Intent r8 = r17.getIntent()
            if (r8 == 0) goto L_0x003d
            com.appsflyer.internal.aa r8 = com.appsflyer.internal.C1740aa.m3833()
            java.lang.String[] r9 = new java.lang.String[r5]
            java.lang.String r10 = r17.getLocalClassName()
            r9[r4] = r10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r10 = "activity_intent_"
            r4.<init>(r10)
            android.content.Intent r10 = r17.getIntent()
            java.lang.String r10 = r10.toString()
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r9[r3] = r4
            r8.mo14060(r6, r7, r9)
            goto L_0x0060
        L_0x003d:
            if (r17 == 0) goto L_0x0053
            com.appsflyer.internal.aa r8 = com.appsflyer.internal.C1740aa.m3833()
            java.lang.String[] r9 = new java.lang.String[r5]
            java.lang.String r10 = r17.getLocalClassName()
            r9[r4] = r10
            java.lang.String r4 = "activity_intent_null"
            r9[r3] = r4
            r8.mo14060(r6, r7, r9)
            goto L_0x0060
        L_0x0053:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C1740aa.m3833()
            java.lang.String r4 = "activity_null"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r3.mo14060(r6, r7, r4)
        L_0x0060:
            java.lang.String r3 = m3788((android.app.Activity) r17)
            r1.f4024 = r3
            if (r3 == 0) goto L_0x016d
            long r3 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.Long, java.lang.String> r6 = r1.f4035
            java.lang.String r7 = ")"
            if (r6 != 0) goto L_0x0081
            java.lang.String r0 = "pushes: initializing pushes history.."
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f4035 = r0
            r10 = r3
            goto L_0x012f
        L_0x0081:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0114 }
            java.lang.String r8 = "pushPayloadMaxAging"
            r9 = 1800000(0x1b7740, double:8.89318E-318)
            long r8 = r6.getLong(r8, r9)     // Catch:{ all -> 0x0114 }
            java.util.Map<java.lang.Long, java.lang.String> r6 = r1.f4035     // Catch:{ all -> 0x0114 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x0114 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0114 }
            r10 = r3
        L_0x0099:
            boolean r12 = r6.hasNext()     // Catch:{ all -> 0x0112 }
            if (r12 == 0) goto L_0x012f
            java.lang.Object r12 = r6.next()     // Catch:{ all -> 0x0112 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0112 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = r1.f4024     // Catch:{ all -> 0x0112 }
            r13.<init>(r14)     // Catch:{ all -> 0x0112 }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x0112 }
            java.util.Map<java.lang.Long, java.lang.String> r15 = r1.f4035     // Catch:{ all -> 0x0112 }
            java.lang.Object r15 = r15.get(r12)     // Catch:{ all -> 0x0112 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0112 }
            r14.<init>(r15)     // Catch:{ all -> 0x0112 }
            java.lang.Object r15 = r13.opt(r2)     // Catch:{ all -> 0x0112 }
            java.lang.Object r5 = r14.opt(r2)     // Catch:{ all -> 0x0112 }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x00f5
            java.lang.Object r5 = r13.opt(r0)     // Catch:{ all -> 0x0112 }
            java.lang.Object r15 = r14.opt(r0)     // Catch:{ all -> 0x0112 }
            boolean r5 = r5.equals(r15)     // Catch:{ all -> 0x0112 }
            if (r5 == 0) goto L_0x00f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = "PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: "
            r0.<init>(r2)     // Catch:{ all -> 0x0112 }
            r0.append(r14)     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = ", new: "
            r0.append(r2)     // Catch:{ all -> 0x0112 }
            r0.append(r13)     // Catch:{ all -> 0x0112 }
            r0.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0112 }
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x0112 }
            r0 = 0
            r1.f4024 = r0     // Catch:{ all -> 0x0112 }
            return
        L_0x00f5:
            long r13 = r12.longValue()     // Catch:{ all -> 0x0112 }
            long r13 = r3 - r13
            int r5 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0104
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.f4035     // Catch:{ all -> 0x0112 }
            r5.remove(r12)     // Catch:{ all -> 0x0112 }
        L_0x0104:
            long r13 = r12.longValue()     // Catch:{ all -> 0x0112 }
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0110
            long r10 = r12.longValue()     // Catch:{ all -> 0x0112 }
        L_0x0110:
            r5 = 2
            goto L_0x0099
        L_0x0112:
            r0 = move-exception
            goto L_0x0116
        L_0x0114:
            r0 = move-exception
            r10 = r3
        L_0x0116:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Error while handling push notification measurement: "
            r2.<init>(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afErrorLog(r2, r0)
        L_0x012f:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "pushPayloadHistorySize"
            r5 = 2
            int r0 = r0.getInt(r2, r5)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.f4035
            int r2 = r2.size()
            if (r2 != r0) goto L_0x015f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pushes: removing oldest overflowing push (oldest push:"
            r0.<init>(r2)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.f4035
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r0.remove(r2)
        L_0x015f:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.f4035
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r1.f4024
            r0.put(r2, r3)
            r16.start(r17)
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.sendPushNotificationData(android.app.Activity):void");
    }

    public void setUserEmails(String... strArr) {
        C1740aa.m3833().mo14060("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    public void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        C1740aa.m3833().mo14060("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            if (C17218.f4058[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(HashUtils.toSha256(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    public void setCollectAndroidID(boolean z) {
        C1740aa.m3833().mo14060("public_api_call", "setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
    }

    public void setCollectIMEI(boolean z) {
        C1740aa.m3833().mo14060("public_api_call", "setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    public void setCollectOaid(boolean z) {
        C1740aa.m3833().mo14060("public_api_call", "setCollectOaid", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
    }

    public void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        AFDeepLinkManager.f3935 = strArr;
    }

    public void setOneLinkCustomDomain(String... strArr) {
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)}));
        AFDeepLinkManager.f3933 = strArr;
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (this.f4026) {
            return this;
        }
        this.f4026 = true;
        if (context != null) {
            eventDataCollector(context).init();
            this.f4032 = (Application) context.getApplicationContext();
            final GoogleReferrer googleReferrer = new GoogleReferrer(new Runnable() {
                public final void run() {
                    try {
                        AFLogger.afDebugLog("Install Referrer collected locally");
                        AFEvent context = new Attr().context(AppsFlyerLibCore.this.f4032);
                        if (AppsFlyerLibCore.this.m3761(context, AppsFlyerLibCore.getSharedPreferences(AppsFlyerLibCore.this.f4032))) {
                            AppsFlyerLibCore.m3778(AppsFlyerLibCore.this, context);
                        }
                    } catch (Throwable th) {
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                }
            });
            C17184 r4 = new Runnable() {
                public final void run() {
                    SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(AppsFlyerLibCore.this.f4032);
                    boolean z = false;
                    int launchCounter = AppsFlyerLibCore.this.getLaunchCounter(sharedPreferences, false);
                    boolean z2 = sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                    if (googleReferrer.getState() == Referrer.State.NOT_STARTED) {
                        z = true;
                    }
                    if (launchCounter != 1) {
                        return;
                    }
                    if (z || z2) {
                        AppsFlyerLibCore.m3778(AppsFlyerLibCore.this, new Attr().context(AppsFlyerLibCore.this.f4032));
                    }
                }
            };
            Referrer[] referrerArr = {googleReferrer, new HuaweiReferrer(r4), new SamsungReferrer(r4)};
            this.f4044 = referrerArr;
            for (Referrer start : referrerArr) {
                start.start(this.f4032);
            }
            this.f4043 = m3781(context);
            Exlytics.setContext(this.f4032);
        } else {
            AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        C1740aa r11 = C1740aa.m3833();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? "null" : "conversionDataListener";
        r11.mo14060("public_api_call", "init", strArr);
        AFLogger.m3710(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"6.1.3", f4015}));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
        C1741ab.m3848(str);
        conversionDataListener = appsFlyerConversionListener;
        return this;
    }

    public EventDataCollector eventDataCollector(Context context) {
        if (this.eventDataCollector == null) {
            this.eventDataCollector = new EventDataCollector(context);
        }
        return this.eventDataCollector;
    }

    /* renamed from: Ι */
    private boolean m3781(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.f4041 = new ConcurrentHashMap();
            C17173 r4 = new C1758n.C1760d() {
                /* renamed from: ι */
                public final void mo13953(String str, String str2) {
                    AppsFlyerLibCore.this.f4041.put("signedData", str);
                    AppsFlyerLibCore.this.f4041.put(InAppPurchaseMetaData.KEY_SIGNATURE, str2);
                    AppsFlyerLibCore.this.f4041.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }

                /* renamed from: Ι */
                public final void mo13952(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AppsFlyerLibCore.this.f4041.put("error", message);
                    AFLogger.afErrorLog(str, exc, true);
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", new Class[]{Long.TYPE, Context.class, cls2});
                C1758n.C17595 r7 = new InvocationHandler(r4) {

                    /* renamed from: ι */
                    private /* synthetic */ C1760d f4218;

                    public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.internal.n.5.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.n.5.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                method.invoke((Object) null, new Object[]{Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r7)});
            } catch (ClassNotFoundException e) {
                r4.mo13952(e.getClass().getSimpleName(), e);
            } catch (NoSuchMethodException e2) {
                r4.mo13952(e2.getClass().getSimpleName(), e2);
            } catch (IllegalAccessException e3) {
                r4.mo13952(e3.getClass().getSimpleName(), e3);
            } catch (InvocationTargetException e4) {
                r4.mo13952(e4.getClass().getSimpleName(), e4);
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void enableFacebookDeferredApplinks(boolean z) {
        this.f4028 = z;
    }

    public void start(Context context) {
        start(context, (String) null);
    }

    public void start(Context context, String str) {
        start(context, str, (AppsFlyerRequestListener) null);
    }

    public void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        final String str2 = str;
        final AppsFlyerRequestListener appsFlyerRequestListener2 = appsFlyerRequestListener;
        if (Foreground.listener == null) {
            if (!this.f4026) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                if (str2 == null) {
                    if (appsFlyerRequestListener2 != null) {
                        appsFlyerRequestListener2.onError(RequestError.NO_DEV_KEY, RequestErrorMessage.NO_DEV_KEY);
                        return;
                    }
                    return;
                }
            }
            this.f4032 = (Application) context.getApplicationContext();
            C1740aa.m3833().mo14060("public_api_call", "start", str2);
            AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", new Object[]{"6.1.3", f4015}));
            StringBuilder sb = new StringBuilder("Build Number: ");
            sb.append(f4015);
            AFLogger.afInfoLog(sb.toString());
            AppsFlyerProperties.getInstance().loadProperties(this.f4032.getApplicationContext());
            if (!TextUtils.isEmpty(str)) {
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str2);
                C1741ab.m3848(str);
            } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY))) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener2 != null) {
                    appsFlyerRequestListener2.onError(RequestError.NO_DEV_KEY, RequestErrorMessage.NO_DEV_KEY);
                    return;
                }
                return;
            }
            Context baseContext = this.f4032.getBaseContext();
            try {
                if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                    if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                        AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    } else {
                        AFLogger.m3713("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                    }
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("checkBackupRules Exception: ");
                sb2.append(e.toString());
                AFLogger.afRDLog(sb2.toString());
            }
            if (this.f4028) {
                Context applicationContext = this.f4032.getApplicationContext();
                this.f4033 = new HashMap();
                final long currentTimeMillis = System.currentTimeMillis();
                C17162 r9 = new AFFacebookDeferredDeeplink.AppLinkFetchEvents() {
                    public final void onAppLinkFetchFinished(String str, String str2, String str3) {
                        if (str != null) {
                            AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                            AppsFlyerLibCore.this.f4033.put("link", str);
                            if (str2 != null) {
                                AppsFlyerLibCore.this.f4033.put("target_url", str2);
                            }
                            if (str3 != null) {
                                HashMap hashMap = new HashMap();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(ShareConstants.PROMO_CODE, str3);
                                hashMap.put(ShareConstants.DEEPLINK_CONTEXT, hashMap2);
                                AppsFlyerLibCore.this.f4033.put("extras", hashMap);
                            }
                        } else {
                            AppsFlyerLibCore.this.f4033.put("link", "");
                        }
                        AppsFlyerLibCore.this.f4033.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }

                    public final void onAppLinkFetchFailed(String str) {
                        AppsFlyerLibCore.this.f4033.put("error", str);
                    }
                };
                try {
                    Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{applicationContext});
                    Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                    Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                    Method method = cls.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, cls2});
                    AFFacebookDeferredDeeplink.C17075 r13 = new InvocationHandler(cls, r9) {

                        /* renamed from: ı */
                        private /* synthetic */ Class f3962;

                        /* renamed from: ι */
                        private /* synthetic */ AppLinkFetchEvents f3963;

                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.AFFacebookDeferredDeeplink.5.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.AFFacebookDeferredDeeplink.5.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    };
                    Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r13);
                    String string = applicationContext.getString(applicationContext.getResources().getIdentifier("facebook_app_id", "string", applicationContext.getPackageName()));
                    if (TextUtils.isEmpty(string)) {
                        r9.onAppLinkFetchFailed("Facebook app id not defined in resources");
                    } else {
                        method.invoke((Object) null, new Object[]{applicationContext, string, newProxyInstance});
                    }
                } catch (NoSuchMethodException e2) {
                    r9.onAppLinkFetchFailed(e2.toString());
                } catch (InvocationTargetException e3) {
                    r9.onAppLinkFetchFailed(e3.toString());
                } catch (ClassNotFoundException e4) {
                    r9.onAppLinkFetchFailed(e4.toString());
                } catch (IllegalAccessException e5) {
                    r9.onAppLinkFetchFailed(e5.toString());
                }
            }
            Foreground.m3812(context, new Foreground.Listener() {
                public final void onBecameForeground(Activity activity) {
                    long unused = AppsFlyerLibCore.this.f4021 = System.currentTimeMillis();
                    AppsFlyerLibCore.this.eventDataCollector(activity).foreground();
                    AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                    if (appsFlyerLibCore.getLaunchCounter(appsFlyerLibCore.f4039, false) == 0) {
                        try {
                            AppsFlyerLibCore.this.f4040.put(ServerParameters.INIT_TO_FG, AppsFlyerLibCore.this.f4021 - AppsFlyerLibCore.this.eventDataCollector.getLong(ServerParameters.INIT_TS));
                        } catch (JSONException unused2) {
                        }
                    }
                    AFLogger.afInfoLog("onBecameForeground");
                    if (AppsFlyerLibCore.this.getLaunchCounter(AppsFlyerLibCore.getSharedPreferences(activity), false) < 2) {
                        AFSensorManager r0 = AFSensorManager.m3720((Context) activity);
                        r0.f3982.post(r0.f3985);
                        r0.f3982.post(r0.f3974);
                    }
                    Launch launch = new Launch();
                    AFDeepLinkManager instance = AFDeepLinkManager.getInstance();
                    Map<String, Object> params = launch.params();
                    EventDataCollector eventDataCollector = AppsFlyerLibCore.this.eventDataCollector;
                    SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(activity);
                    boolean z = sharedPreferences.getBoolean(AFDeepLinkManager.DDL_SENT, false);
                    int launchCounter = AppsFlyerLibCore.getInstance().getLaunchCounter(sharedPreferences, false);
                    if (!instance.mo13823(activity.getIntent(), activity, params) && instance.deepLinkListener != null && launchCounter == 0 && !z) {
                        new DdlEvent(activity.getApplicationContext(), eventDataCollector).start();
                    }
                    AppsFlyerLibCore.this.mo13947(launch.context(activity).key(str2).requestListener(appsFlyerRequestListener2), activity);
                }

                public final void onBecameBackground(Context context) {
                    AFLogger.afInfoLog("onBecameBackground");
                    long unused = AppsFlyerLibCore.this.f4036 = System.currentTimeMillis();
                    long r0 = AppsFlyerLibCore.this.f4036 - AppsFlyerLibCore.this.f4021;
                    if (r0 > 0 && r0 < 1000) {
                        r0 = 1000;
                    }
                    AppsFlyerLibCore.this.eventDataCollector(context).set(ServerParameters.PREVIOUS_SESSION_DURATION, TimeUnit.MILLISECONDS.toSeconds(r0));
                    AFLogger.afInfoLog("callStatsBackground background call");
                    AppsFlyerLibCore.this.mo13948((WeakReference<Context>) new WeakReference(context));
                    C1740aa r02 = C1740aa.m3833();
                    if (r02.mo14064()) {
                        r02.mo14058();
                        if (context != null) {
                            C1740aa.m3836(context.getPackageName(), context.getPackageManager());
                        }
                        r02.mo14061();
                    } else {
                        AFLogger.afDebugLog("RD status is OFF");
                    }
                    AFExecutor instance = AFExecutor.getInstance();
                    try {
                        AFExecutor.m3699(instance.f3956);
                        if (instance.f3955 instanceof ThreadPoolExecutor) {
                            AFExecutor.m3699((ThreadPoolExecutor) instance.f3955);
                        }
                    } catch (Throwable th) {
                        AFLogger.afErrorLog("failed to stop Executors", th);
                    }
                    AFSensorManager r8 = AFSensorManager.m3720(context);
                    r8.f3982.post(r8.f3985);
                }
            });
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: ɩ */
    private static void m3766(android.content.Context r4) {
        /*
            boolean r0 = com.appsflyer.AndroidUtils.m3736()
            if (r0 == 0) goto L_0x000e
            r0 = 23
            java.lang.String r1 = "OPPO device found"
            com.appsflyer.AFLogger.afRDLog(r1)
            goto L_0x0010
        L_0x000e:
            r0 = 18
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x00c1
            java.lang.String r0 = "keyPropDisableAFKeystore"
            r1 = 1
            boolean r0 = m3783((java.lang.String) r0, (boolean) r1)
            if (r0 != 0) goto L_0x00c1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "OS SDK is="
            r0.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0.append(r2)
            java.lang.String r2 = "; use KeyStore"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afRDLog(r0)
            com.appsflyer.AFKeystoreWrapper r0 = new com.appsflyer.AFKeystoreWrapper
            r0.<init>(r4)
            boolean r2 = r0.mo13852()
            if (r2 != 0) goto L_0x0056
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            java.lang.String r4 = com.appsflyer.internal.C1777u.m3909(r1)
            r0.f3968 = r4
            r4 = 0
            r0.f3966 = r4
            java.lang.String r4 = r0.mo13850()
            r0.mo13849(r4)
            goto L_0x009f
        L_0x0056:
            java.lang.String r4 = r0.mo13850()
            java.lang.Object r2 = r0.f3964
            monitor-enter(r2)
            int r3 = r0.f3966     // Catch:{ all -> 0x00be }
            int r3 = r3 + r1
            r0.f3966 = r3     // Catch:{ all -> 0x00be }
            java.lang.String r1 = "Deleting key with alias: "
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r1.concat(r3)     // Catch:{ all -> 0x00be }
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ all -> 0x00be }
            java.lang.Object r1 = r0.f3964     // Catch:{ KeyStoreException -> 0x007c }
            monitor-enter(r1)     // Catch:{ KeyStoreException -> 0x007c }
            java.security.KeyStore r3 = r0.f3967     // Catch:{ all -> 0x0079 }
            r3.deleteEntry(r4)     // Catch:{ all -> 0x0079 }
            monitor-exit(r1)     // Catch:{ all -> 0x0079 }
            goto L_0x0097
        L_0x0079:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ KeyStoreException -> 0x007c }
            throw r4     // Catch:{ KeyStoreException -> 0x007c }
        L_0x007c:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "Exception "
            r1.<init>(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x00be }
            r1.append(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = " occurred"
            r1.append(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00be }
            com.appsflyer.AFLogger.afErrorLog(r1, r4)     // Catch:{ all -> 0x00be }
        L_0x0097:
            monitor-exit(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r0.mo13850()
            r0.mo13849(r4)
        L_0x009f:
            java.lang.String r4 = "KSAppsFlyerId"
            java.lang.String r1 = r0.mo13851()
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            r2.set((java.lang.String) r4, (java.lang.String) r1)
            java.lang.String r4 = "KSAppsFlyerRICounter"
            int r0 = r0.mo13848()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            r1.set((java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x00be:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L_0x00c1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "OS SDK is="
            r4.<init>(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4.append(r0)
            java.lang.String r0 = "; no KeyStore usage"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.afRDLog(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m3766(android.content.Context):void");
    }

    public void setCustomerUserId(String str) {
        C1740aa.m3833().mo14060("public_api_call", "setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_USER_ID, str);
    }

    public void setPhoneNumber(String str) {
        this.f4037 = HashUtils.toSha256(str);
    }

    public void setAppId(String str) {
        C1740aa.m3833().mo14060("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_ID, str);
    }

    public void setExtension(String str) {
        C1740aa.m3833().mo14060("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    public void setIsUpdate(boolean z) {
        C1740aa.m3833().mo14060("public_api_call", "setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    public void setCurrencyCode(String str) {
        C1740aa.m3833().mo14060("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    public void logLocation(Context context, double d, double d2) {
        C1740aa.m3833().mo14060("public_api_call", "logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        m3776(context, AFInAppEventType.LOCATION_COORDINATES, (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final void mo13948(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences sharedPreferences = getSharedPreferences(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
            long j = this.f4036 - this.f4021;
            HashMap hashMap = new HashMap();
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
            if (string == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", "true");
            }
            AdvertisingIdObject r6 = AdvertisingIdUtil.m3734(weakReference.get().getContentResolver());
            if (r6 != null) {
                hashMap.put(ServerParameters.AMAZON_AID, r6.getAdvertisingId());
                hashMap.put(ServerParameters.AMAZON_AID_LIMIT, String.valueOf(r6.isLimitAdTracking()));
            }
            String string3 = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
            if (string3 != null) {
                hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string3);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put(ServerParameters.DEV_KEY, string);
            hashMap.put(ServerParameters.AF_USER_ID, C1777u.m3909(weakReference));
            hashMap.put(ServerParameters.TIME_SPENT_IN_APP, String.valueOf(j / 1000));
            hashMap.put(ServerParameters.STATUS_TYPE, "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put(ServerParameters.LAUNCH_COUNTER, Integer.toString(getLaunchCounter(sharedPreferences, false)));
            hashMap.put("channel", getConfiguredChannel(weakReference.get()));
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put(ServerParameters.ORIGINAL_AF_UID, string2);
            if (this.f4027) {
                try {
                    AFLogger.afDebugLog("Running callStats task");
                    new Thread(new Runnable() {
                        public final void run(
/*
Method generation error in method: com.appsflyer.BackgroundHttpTask.5.run():void, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.BackgroundHttpTask.5.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    }).start();
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Could not send callStats request", th);
                }
            } else {
                AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            }
        }
    }

    public void logSession(Context context) {
        C1740aa.m3833().mo14060("public_api_call", "logSession", new String[0]);
        C1740aa.m3833().f4131 = false;
        m3776(context, (String) null, (Map<String, Object>) null);
    }

    public void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap;
        AFEvent context2 = new InAppEvent().context(context);
        context2.f3939 = str;
        Activity activity = null;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        context2.f3947 = hashMap;
        AFEvent requestListener = context2.requestListener(appsFlyerRequestListener);
        C1740aa r14 = C1740aa.m3833();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(requestListener.f3947 == null ? new HashMap() : requestListener.f3947).toString();
        r14.mo14060("public_api_call", "logEvent", strArr);
        if (str != null) {
            AFSensorManager r12 = AFSensorManager.m3720(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (r12.f3986 != 0) {
                r12.f3980++;
                if (r12.f3986 - currentTimeMillis < 500) {
                    r12.f3982.removeCallbacks(r12.f3976);
                    r12.f3982.post(r12.f3974);
                }
            } else {
                r12.f3982.post(r12.f3985);
                r12.f3982.post(r12.f3974);
            }
            r12.f3986 = currentTimeMillis;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        mo13947(requestListener, activity);
    }

    public void sendAdRevenue(Context context, Map<String, Object> map) {
        AFEvent context2 = new AdRevenue().context(context);
        context2.f3947 = map;
        Application context3 = context2.context();
        String url = ServerConfigHandler.getUrl(f4017);
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append(context3.getPackageName());
        String obj = sb.toString();
        SharedPreferences sharedPreferences = getSharedPreferences(context3);
        int launchCounter = getLaunchCounter(sharedPreferences, false);
        int r4 = m3784(sharedPreferences, "appsFlyerAdRevenueCount", true);
        HashMap hashMap = new HashMap();
        hashMap.put(ServerParameters.AD_REVENUE_PAYLOAD, context2.f3947);
        hashMap.put(ServerParameters.AD_REVENUE_COUNTER, Integer.valueOf(r4));
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        hashMap.put("af_key", string);
        hashMap.put(ServerParameters.LAUNCH_COUNTER, Integer.valueOf(launchCounter));
        hashMap.put(ServerParameters.TIMESTAMP, Long.toString(new Date().getTime()));
        hashMap.put(ServerParameters.AF_USER_ID, C1777u.m3909(new WeakReference(context3)));
        String string2 = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        hashMap.put(ServerParameters.ADVERTISING_ID_ENABLED_PARAM, AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_ENABLED_PARAM));
        if (string2 != null) {
            hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string2);
        }
        hashMap.put("device", Build.DEVICE);
        m3791((Context) context3, (Map<String, Object>) hashMap);
        try {
            PackageInfo packageInfo = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
            hashMap.put(ServerParameters.APP_VERSION_CODE, Integer.toString(packageInfo.versionCode));
            SimpleDateFormat dataFormatter = AFDateFormat.getDataFormatter("yyyy-MM-dd_HHmmssZ");
            long j = packageInfo.firstInstallTime;
            dataFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("install_date", dataFormatter.format(new Date(j)));
            String string3 = sharedPreferences.getString("appsFlyerFirstInstall", (String) null);
            if (string3 == null) {
                string3 = m3752(dataFormatter, (Context) context3);
            }
            hashMap.put("first_launch_date", string3);
        } catch (Throwable th) {
            AFLogger.afErrorLog("AdRevenue - Exception while collecting app version data ", th);
        }
        AFEvent addParams = context2.urlString(obj).addParams(hashMap);
        addParams.f3951 = launchCounter;
        m3779(AFExecutor.getInstance().mo13841(), new C1722c(this, addParams.key(string), (byte) 0), 1, TimeUnit.MILLISECONDS);
    }

    public void logEvent(Context context, String str, Map<String, Object> map) {
        logEvent(context, str, map, (AppsFlyerRequestListener) null);
    }

    /* renamed from: Ι */
    private void m3776(Context context, String str, Map<String, Object> map) {
        AFEvent context2 = new InAppEvent().context(context);
        context2.f3939 = str;
        context2.f3947 = map;
        mo13947(context2, context instanceof Activity ? (Activity) context : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final void mo13947(AFEvent aFEvent, Activity activity) {
        String str;
        Uri referrer;
        Application context = aFEvent.context();
        String str2 = "";
        if (activity == null || (referrer = ActivityCompat.getReferrer(activity)) == null) {
            str = str2;
        } else {
            str = referrer.toString();
        }
        if (AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY) == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener requestListener = aFEvent.getRequestListener();
            if (requestListener != null) {
                requestListener.onError(RequestError.NO_DEV_KEY, RequestErrorMessage.NO_DEV_KEY);
                return;
            }
            return;
        }
        String referrer2 = AppsFlyerProperties.getInstance().getReferrer(context);
        if (referrer2 != null) {
            str2 = referrer2;
        }
        aFEvent.f3948 = str2;
        aFEvent.f3944 = str;
        m3777(aFEvent);
    }

    /* renamed from: ɩ */
    public final void mo13949(Context context, String str) {
        if (m3792()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        if (string == null) {
            AFLogger.afWarnLog("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put(ServerParameters.APP_VERSION_CODE, Integer.toString(packageInfo.versionCode));
            hashMap.put(ServerParameters.APP_VERSION_NAME, packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            SimpleDateFormat dataFormatter = AFDateFormat.getDataFormatter("yyyy-MM-dd_HHmmssZ");
            dataFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put(ServerParameters.INSTALL_DATE, dataFormatter.format(new Date(j)));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        m3758(context, (Map<String, ? super String>) hashMap);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string2 != null) {
            hashMap.put(ServerParameters.APP_USER_ID, string2);
        }
        try {
            hashMap.put(ServerParameters.MODEL, Build.MODEL);
            hashMap.put(ServerParameters.BRAND, Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            hashMap.put("deviceTrackingDisabled", "true");
        }
        AdvertisingIdObject r2 = AdvertisingIdUtil.m3734(context.getContentResolver());
        if (r2 != null) {
            hashMap.put(ServerParameters.AMAZON_AID, r2.getAdvertisingId());
            hashMap.put(ServerParameters.AMAZON_AID_LIMIT, String.valueOf(r2.isLimitAdTracking()));
        }
        String string3 = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        if (string3 != null) {
            hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, string3);
        }
        hashMap.put(ServerParameters.DEV_KEY, string);
        hashMap.put(ServerParameters.AF_USER_ID, C1777u.m3909(new WeakReference(context)));
        hashMap.put(ServerParameters.AF_FIREBASE_TOKEN, str);
        hashMap.put(ServerParameters.LAUNCH_COUNTER, Integer.toString(getLaunchCounter(getSharedPreferences(context), false)));
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String configuredChannel = getConfiguredChannel(context);
        if (configuredChannel != null) {
            hashMap.put("channel", configuredChannel);
        }
        try {
            AFEvent context2 = new UninstallTokenEvent().trackingStopped(isStopped()).addParams(hashMap).context(context);
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl(REGISTER_URL));
            sb.append(packageName);
            new Thread(new Runnable() {
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.BackgroundHttpTask.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.BackgroundHttpTask.5.run():void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.BackgroundHttpTask.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final void run(
/*
Method generation error in method: com.appsflyer.BackgroundHttpTask.5.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.BackgroundHttpTask.5.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }).start();
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getMessage(), th3);
        }
    }

    public void anonymizeUser(boolean z) {
        C1740aa.m3833().mo14060("public_api_call", "anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", z);
    }

    /* access modifiers changed from: private */
    /* renamed from: ı */
    public static Map<String, Object> m3742(Context context) throws C1778v {
        String string = getSharedPreferences(context).getString("attributionId", (String) null);
        if (string != null && string.length() > 0) {
            return m3775(string);
        }
        throw new C1778v();
    }

    public void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        C1740aa.m3833().mo14060("public_api_call", "registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            conversionDataListener = appsFlyerConversionListener;
        }
    }

    public void unregisterConversionListener() {
        C1740aa.m3833().mo14060("public_api_call", "unregisterConversionListener", new String[0]);
        conversionDataListener = null;
    }

    public void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        C1740aa.m3833().mo14060("public_api_call", "registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            f4011 = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι */
    public static Map<String, Object> m3775(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!f4012.contains(next)) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: ı */
    private boolean m3746() {
        if (this.f4045 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f4045;
            SimpleDateFormat dataFormatter = AFDateFormat.getDataFormatter("yyyy/MM/dd HH:mm:ss.SSS Z");
            long j = this.f4045;
            dataFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = dataFormatter.format(new Date(j));
            long j2 = this.f4031;
            dataFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = dataFormatter.format(new Date(j2));
            if (currentTimeMillis < this.f4029 && !isStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f4029)}));
                return true;
            } else if (!isStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!isStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ */
    public boolean m3761(AFEvent aFEvent, SharedPreferences sharedPreferences) {
        int launchCounter = getLaunchCounter(sharedPreferences, false);
        return (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false) && launchCounter == 1) || (launchCounter == 1 && !(aFEvent instanceof Attr));
    }

    /* renamed from: ɩ */
    private boolean m3769() {
        Map<String, Object> map = this.f4033;
        return map != null && !map.isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι */
    public boolean m3780() {
        Map<String, Object> map = this.f4041;
        return map != null && !map.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0203 */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0323 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0336 A[Catch:{ Exception -> 0x033c }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0379 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037f A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03b4 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03cd A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x045e A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0473 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0474 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0488 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0499 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04a1 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04c4 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04d1 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04d7 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04ee A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0506 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x051d A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x054b A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0567 A[SYNTHETIC, Splitter:B:251:0x0567] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0586 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05a0 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05fe A[SYNTHETIC, Splitter:B:292:0x05fe] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x060a A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0631 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0647 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0663 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x06a4 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x06ae A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x06c4 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x06cf A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0701 A[Catch:{ Exception -> 0x0707 }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x07b4 A[Catch:{ all -> 0x080a }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0832 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x083b A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0870 A[SYNTHETIC, Splitter:B:406:0x0870] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x08b7 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x08dd A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0916 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0918 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0928  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x09a5 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x09a6 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x09e1 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0aaa A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0b0d A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0207 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0214 A[SYNTHETIC, Splitter:B:81:0x0214] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x021e A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0242 A[Catch:{ Exception -> 0x00af, all -> 0x0b21 }] */
    /* renamed from: ι */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> mo13950(com.appsflyer.AFEvent r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            java.lang.String r3 = "extraReferrers"
            java.lang.String r4 = "sdkExtension"
            java.lang.String r5 = "AppsFlyerTimePassedSincePrevLaunch"
            java.lang.String r6 = "yyyy-MM-dd_HHmmssZ"
            java.lang.String r7 = "use cached IMEI: "
            java.lang.String r8 = "appid"
            java.lang.String r9 = "INSTALL_STORE"
            java.lang.String r10 = "gcd"
            java.lang.String r11 = "prev_event_name"
            java.lang.String r12 = "preInstallName"
            android.app.Application r13 = r34.context()
            java.lang.String r14 = r34.key()
            java.lang.String r15 = r2.f3939
            r16 = r6
            org.json.JSONObject r6 = new org.json.JSONObject
            r17 = r7
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f3947
            if (r7 != 0) goto L_0x0032
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            goto L_0x0034
        L_0x0032:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f3947
        L_0x0034:
            r6.<init>(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r2.f3948
            r18 = r8
            android.content.SharedPreferences r8 = getSharedPreferences(r13)
            r19 = r14
            boolean r14 = r34.mo13838()
            r20 = r12
            java.lang.String r12 = r2.f3944
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.params
            com.appsflyer.AdvertisingIdUtil.getGaid(r13, r2)
            java.util.Date r21 = new java.util.Date
            r21.<init>()
            r22 = r11
            r23 = r12
            long r11 = r21.getTime()
            r21 = r9
            java.lang.String r9 = java.lang.Long.toString(r11)
            r24 = r4
            java.lang.String r4 = "af_timestamp"
            r2.put(r4, r9)
            java.lang.String r4 = com.appsflyer.internal.C1750d.m3860((android.content.Context) r13, (long) r11)
            if (r4 == 0) goto L_0x0077
            java.lang.String r9 = "cksm_v1"
            r2.put(r9, r4)
        L_0x0077:
            boolean r4 = r33.isStopped()     // Catch:{ all -> 0x0b21 }
            if (r4 != 0) goto L_0x0095
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = "******* sendTrackingWithEvent: "
            r4.<init>(r9)     // Catch:{ all -> 0x0b21 }
            if (r14 == 0) goto L_0x0089
            java.lang.String r9 = "Launch"
            goto L_0x008a
        L_0x0089:
            r9 = r15
        L_0x008a:
            r4.append(r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0b21 }
            goto L_0x009a
        L_0x0095:
            java.lang.String r4 = "Reporting has been stopped"
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0b21 }
        L_0x009a:
            com.appsflyer.internal.C1779w.m3910()     // Catch:{ all -> 0x0b21 }
            java.io.File r4 = com.appsflyer.internal.C1779w.m3913((android.content.Context) r13)     // Catch:{ Exception -> 0x00af }
            boolean r4 = r4.exists()     // Catch:{ Exception -> 0x00af }
            if (r4 != 0) goto L_0x00b6
            java.io.File r4 = com.appsflyer.internal.C1779w.m3913((android.content.Context) r13)     // Catch:{ Exception -> 0x00af }
            r4.mkdir()     // Catch:{ Exception -> 0x00af }
            goto L_0x00b6
        L_0x00af:
            r0 = move-exception
            r4 = r0
            java.lang.String r9 = "Could not create cache directory"
            com.appsflyer.AFLogger.afErrorLog(r9, r4)     // Catch:{ all -> 0x0b21 }
        L_0x00b6:
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ Exception -> 0x00f2 }
            r11 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r9, r11)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String[] r4 = r4.requestedPermissions     // Catch:{ Exception -> 0x00f2 }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r9 = "android.permission.INTERNET"
            boolean r9 = r4.contains(r9)     // Catch:{ Exception -> 0x00f2 }
            if (r9 != 0) goto L_0x00d7
            java.lang.String r9 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r9)     // Catch:{ Exception -> 0x00f2 }
        L_0x00d7:
            java.lang.String r9 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r9 = r4.contains(r9)     // Catch:{ Exception -> 0x00f2 }
            if (r9 != 0) goto L_0x00e4
            java.lang.String r9 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r9)     // Catch:{ Exception -> 0x00f2 }
        L_0x00e4:
            java.lang.String r9 = "android.permission.ACCESS_WIFI_STATE"
            boolean r4 = r4.contains(r9)     // Catch:{ Exception -> 0x00f2 }
            if (r4 != 0) goto L_0x00f9
            java.lang.String r4 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r4)     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00f9
        L_0x00f2:
            r0 = move-exception
            r4 = r0
            java.lang.String r9 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.afErrorLog(r9, r4)     // Catch:{ all -> 0x0b21 }
        L_0x00f9:
            java.lang.String r4 = "af_events_api"
            java.lang.String r9 = "1"
            r2.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "brand"
            java.lang.String r9 = android.os.Build.BRAND     // Catch:{ all -> 0x0b21 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "device"
            java.lang.String r9 = android.os.Build.DEVICE     // Catch:{ all -> 0x0b21 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "product"
            java.lang.String r9 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0b21 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "sdk"
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0b21 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "model"
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0b21 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "deviceType"
            java.lang.String r9 = android.os.Build.TYPE     // Catch:{ all -> 0x0b21 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            m3791((android.content.Context) r13, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            com.appsflyer.internal.EventDataCollector r9 = r1.eventDataCollector(r13)     // Catch:{ all -> 0x0b21 }
            java.lang.String r11 = "phone"
            r12 = r8
            r34 = r9
            if (r14 == 0) goto L_0x0262
            boolean r9 = r1.isAppsFlyerFirstLaunch(r13)     // Catch:{ all -> 0x0b21 }
            if (r9 == 0) goto L_0x0190
            boolean r9 = r4.isOtherSdkStringDisabled()     // Catch:{ all -> 0x0b21 }
            if (r9 != 0) goto L_0x0159
            float r9 = m3797((android.content.Context) r13)     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "batteryLevel"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0b21 }
            r2.put(r8, r9)     // Catch:{ all -> 0x0b21 }
        L_0x0159:
            m3766((android.content.Context) r13)     // Catch:{ all -> 0x0b21 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0b21 }
            r9 = 23
            if (r8 < r9) goto L_0x016b
            java.lang.Class<android.app.UiModeManager> r8 = android.app.UiModeManager.class
            java.lang.Object r8 = r13.getSystemService(r8)     // Catch:{ all -> 0x0b21 }
            android.app.UiModeManager r8 = (android.app.UiModeManager) r8     // Catch:{ all -> 0x0b21 }
            goto L_0x0173
        L_0x016b:
            java.lang.String r8 = "uimode"
            java.lang.Object r8 = r13.getSystemService(r8)     // Catch:{ all -> 0x0b21 }
            android.app.UiModeManager r8 = (android.app.UiModeManager) r8     // Catch:{ all -> 0x0b21 }
        L_0x0173:
            if (r8 == 0) goto L_0x0183
            int r8 = r8.getCurrentModeType()     // Catch:{ all -> 0x0b21 }
            r9 = 4
            if (r8 != r9) goto L_0x0183
            java.lang.String r8 = "tv"
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0b21 }
            r2.put(r8, r9)     // Catch:{ all -> 0x0b21 }
        L_0x0183:
            boolean r8 = com.appsflyer.internal.instant.AFInstantApps.isInstantApp(r13)     // Catch:{ all -> 0x0b21 }
            if (r8 == 0) goto L_0x0190
            java.lang.String r8 = "inst_app"
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0b21 }
            r2.put(r8, r9)     // Catch:{ all -> 0x0b21 }
        L_0x0190:
            java.lang.String r8 = "timepassedsincelastlaunch"
            android.content.SharedPreferences r9 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            r28 = r14
            r27 = r15
            r14 = 0
            long r29 = r9.getLong(r5, r14)     // Catch:{ all -> 0x0b21 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0b21 }
            m3744((android.content.Context) r13, (java.lang.String) r5, (long) r14)     // Catch:{ all -> 0x0b21 }
            r31 = 0
            int r5 = (r29 > r31 ? 1 : (r29 == r31 ? 0 : -1))
            if (r5 <= 0) goto L_0x01b4
            long r14 = r14 - r29
            r25 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r25
            goto L_0x01b6
        L_0x01b4:
            r14 = -1
        L_0x01b6:
            java.lang.String r5 = java.lang.Long.toString(r14)     // Catch:{ all -> 0x0b21 }
            r2.put(r8, r5)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "oneLinkSlug"
            java.lang.String r5 = r5.getString(r8)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = "onelinkVersion"
            java.lang.String r8 = r8.getString(r9)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x01d8
            java.lang.String r9 = "onelink_id"
            r2.put(r9, r5)     // Catch:{ all -> 0x0b21 }
        L_0x01d8:
            if (r8 == 0) goto L_0x01df
            java.lang.String r5 = "onelink_ver"
            r2.put(r5, r8)     // Catch:{ all -> 0x0b21 }
        L_0x01df:
            com.appsflyer.internal.EventDataCollector r5 = r1.eventDataCollector     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r5.getString(r10)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0203
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0203 }
            r8.<init>(r5)     // Catch:{ JSONException -> 0x0203 }
            java.util.Map r5 = com.appsflyer.AFHelper.toMap(r8)     // Catch:{ JSONException -> 0x0203 }
            boolean r8 = r5.isEmpty()     // Catch:{ JSONException -> 0x0203 }
            if (r8 != 0) goto L_0x0203
            java.util.Map r8 = m3743((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ JSONException -> 0x0203 }
            r8.put(r10, r5)     // Catch:{ JSONException -> 0x0203 }
            com.appsflyer.internal.EventDataCollector r5 = r1.eventDataCollector     // Catch:{ JSONException -> 0x0203 }
            r8 = 0
            r5.set((java.lang.String) r10, (java.lang.String) r8)     // Catch:{ JSONException -> 0x0203 }
        L_0x0203:
            java.lang.String r5 = r1.f4037     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x020c
            java.lang.String r5 = r1.f4037     // Catch:{ all -> 0x0b21 }
            r2.put(r11, r5)     // Catch:{ all -> 0x0b21 }
        L_0x020c:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "referrer"
            if (r5 != 0) goto L_0x0217
            r2.put(r8, r7)     // Catch:{ all -> 0x0b21 }
        L_0x0217:
            r5 = 0
            java.lang.String r7 = r12.getString(r3, r5)     // Catch:{ all -> 0x0b21 }
            if (r7 == 0) goto L_0x0221
            r2.put(r3, r7)     // Catch:{ all -> 0x0b21 }
        L_0x0221:
            java.lang.String r3 = r4.getReferrer(r13)     // Catch:{ all -> 0x0b21 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0b21 }
            if (r5 != 0) goto L_0x0234
            java.lang.Object r5 = r2.get(r8)     // Catch:{ all -> 0x0b21 }
            if (r5 != 0) goto L_0x0234
            r2.put(r8, r3)     // Catch:{ all -> 0x0b21 }
        L_0x0234:
            java.lang.String r3 = "prev_session_dur"
            r5 = r34
            long r7 = r5.getLong(r3)     // Catch:{ all -> 0x0b21 }
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x024b
            java.lang.String r3 = "prev_session_dur"
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0b21 }
            r2.put(r3, r7)     // Catch:{ all -> 0x0b21 }
        L_0x024b:
            java.lang.String r3 = "exception_number"
            long r7 = com.appsflyer.internal.Exlytics.get()     // Catch:{ all -> 0x0b21 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0b21 }
            r2.put(r3, r7)     // Catch:{ all -> 0x0b21 }
            r34 = r5
            r22 = r11
            r29 = r12
            r3 = r27
            goto L_0x02eb
        L_0x0262:
            r5 = r34
            r28 = r14
            r27 = r15
            android.content.SharedPreferences r3 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            android.content.SharedPreferences$Editor r7 = r3.edit()     // Catch:{ all -> 0x0b21 }
            r8 = r22
            r9 = 0
            java.lang.String r10 = r3.getString(r8, r9)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r9 = "prev_event_timestamp"
            java.lang.String r14 = "prev_event_value"
            if (r10 == 0) goto L_0x02c1
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x02b6 }
            r15.<init>()     // Catch:{ Exception -> 0x02b6 }
            r34 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b4 }
            r5.<init>()     // Catch:{ Exception -> 0x02b4 }
            r22 = r11
            r29 = r12
            r11 = -1
            long r11 = r3.getLong(r9, r11)     // Catch:{ Exception -> 0x02b2 }
            r5.append(r11)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x02b2 }
            r15.put(r9, r5)     // Catch:{ Exception -> 0x02b2 }
            r5 = 0
            java.lang.String r3 = r3.getString(r14, r5)     // Catch:{ Exception -> 0x02b2 }
            r15.put(r14, r3)     // Catch:{ Exception -> 0x02b2 }
            r15.put(r8, r10)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r3 = "prev_event"
            java.lang.String r5 = r15.toString()     // Catch:{ Exception -> 0x02b2 }
            r2.put(r3, r5)     // Catch:{ Exception -> 0x02b2 }
            goto L_0x02c7
        L_0x02b2:
            r0 = move-exception
            goto L_0x02bd
        L_0x02b4:
            r0 = move-exception
            goto L_0x02b9
        L_0x02b6:
            r0 = move-exception
            r34 = r5
        L_0x02b9:
            r22 = r11
            r29 = r12
        L_0x02bd:
            r5 = r0
            r3 = r27
            goto L_0x02e6
        L_0x02c1:
            r34 = r5
            r22 = r11
            r29 = r12
        L_0x02c7:
            r3 = r27
            r7.putString(r8, r3)     // Catch:{ Exception -> 0x02da }
            r7.putString(r14, r6)     // Catch:{ Exception -> 0x02da }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02da }
            r7.putLong(r9, r10)     // Catch:{ Exception -> 0x02da }
            r7.apply()     // Catch:{ Exception -> 0x02da }
            goto L_0x02eb
        L_0x02da:
            r0 = move-exception
            goto L_0x02e5
        L_0x02dc:
            r0 = move-exception
            r34 = r5
            r22 = r11
            r29 = r12
            r3 = r27
        L_0x02e5:
            r5 = r0
        L_0x02e6:
            java.lang.String r7 = "Error while processing previous event."
            com.appsflyer.AFLogger.afErrorLog(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x02eb:
            java.lang.String r5 = "KSAppsFlyerId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = "KSAppsFlyerRICounter"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = r8.getString(r7)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0317
            if (r7 == 0) goto L_0x0317
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0b21 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0b21 }
            if (r8 <= 0) goto L_0x0317
            java.lang.String r8 = "reinstallCounter"
            r2.put(r8, r7)     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = "originalAppsflyerId"
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0317:
            java.lang.String r5 = "additionalCustomData"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0328
            java.lang.String r7 = "customData"
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0328:
            android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ Exception -> 0x033c }
            java.lang.String r7 = r13.getPackageName()     // Catch:{ Exception -> 0x033c }
            java.lang.String r5 = r5.getInstallerPackageName(r7)     // Catch:{ Exception -> 0x033c }
            if (r5 == 0) goto L_0x0343
            java.lang.String r7 = "installer_package"
            r2.put(r7, r5)     // Catch:{ Exception -> 0x033c }
            goto L_0x0343
        L_0x033c:
            r0 = move-exception
            r5 = r0
            java.lang.String r7 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0343:
            r5 = r24
            java.lang.String r7 = r4.getString(r5)     // Catch:{ all -> 0x0b21 }
            if (r7 == 0) goto L_0x0354
            int r8 = r7.length()     // Catch:{ all -> 0x0b21 }
            if (r8 <= 0) goto L_0x0354
            r2.put(r5, r7)     // Catch:{ all -> 0x0b21 }
        L_0x0354:
            java.lang.String r5 = r1.getConfiguredChannel(r13)     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = m3789((android.content.Context) r13, (java.lang.String) r5)     // Catch:{ all -> 0x0b21 }
            if (r7 == 0) goto L_0x0364
            boolean r8 = r7.equals(r5)     // Catch:{ all -> 0x0b21 }
            if (r8 == 0) goto L_0x0368
        L_0x0364:
            if (r7 != 0) goto L_0x036d
            if (r5 == 0) goto L_0x036d
        L_0x0368:
            java.lang.String r7 = "af_latestchannel"
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x036d:
            android.content.SharedPreferences r5 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            r7 = r21
            boolean r8 = r5.contains(r7)     // Catch:{ all -> 0x0b21 }
            if (r8 == 0) goto L_0x037f
            r8 = 0
            java.lang.String r5 = r5.getString(r7, r8)     // Catch:{ all -> 0x0b21 }
            goto L_0x03b2
        L_0x037f:
            boolean r5 = r1.isAppsFlyerFirstLaunch(r13)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x03a3
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "api_store_value"
            java.lang.String r5 = r5.getString(r8)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0392
            goto L_0x03a4
        L_0x0392:
            java.lang.String r5 = "AF_STORE"
            if (r13 == 0) goto L_0x03a3
            android.content.pm.PackageManager r8 = r13.getPackageManager()     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = m3774((java.lang.String) r5, (android.content.pm.PackageManager) r8, (java.lang.String) r9)     // Catch:{ all -> 0x0b21 }
            goto L_0x03a4
        L_0x03a3:
            r5 = 0
        L_0x03a4:
            android.content.SharedPreferences r8 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x0b21 }
            r8.putString(r7, r5)     // Catch:{ all -> 0x0b21 }
            r8.apply()     // Catch:{ all -> 0x0b21 }
        L_0x03b2:
            if (r5 == 0) goto L_0x03bd
            java.lang.String r7 = "af_installstore"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x0b21 }
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x03bd:
            android.content.SharedPreferences r5 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            r8 = r20
            java.lang.String r7 = r7.getString(r8)     // Catch:{ all -> 0x0b21 }
            if (r7 != 0) goto L_0x045c
            boolean r9 = r5.contains(r8)     // Catch:{ all -> 0x0b21 }
            if (r9 == 0) goto L_0x03db
            r7 = 0
            java.lang.String r5 = r5.getString(r8, r7)     // Catch:{ all -> 0x0b21 }
            r7 = r5
            goto L_0x0453
        L_0x03db:
            boolean r5 = r1.isAppsFlyerFirstLaunch(r13)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0443
            java.lang.String r5 = "ro.appsflyer.preinstall.path"
            java.lang.String r5 = m3764((java.lang.String) r5)     // Catch:{ all -> 0x0b21 }
            java.io.File r5 = m3787((java.lang.String) r5)     // Catch:{ all -> 0x0b21 }
            boolean r7 = m3794((java.io.File) r5)     // Catch:{ all -> 0x0b21 }
            if (r7 == 0) goto L_0x0403
            java.lang.String r5 = "AF_PRE_INSTALL_PATH"
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = m3774((java.lang.String) r5, (android.content.pm.PackageManager) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0b21 }
            java.io.File r5 = m3787((java.lang.String) r5)     // Catch:{ all -> 0x0b21 }
        L_0x0403:
            boolean r7 = m3794((java.io.File) r5)     // Catch:{ all -> 0x0b21 }
            if (r7 == 0) goto L_0x040f
            java.lang.String r5 = "/data/local/tmp/pre_install.appsflyer"
            java.io.File r5 = m3787((java.lang.String) r5)     // Catch:{ all -> 0x0b21 }
        L_0x040f:
            boolean r7 = m3794((java.io.File) r5)     // Catch:{ all -> 0x0b21 }
            if (r7 == 0) goto L_0x041b
            java.lang.String r5 = "/etc/pre_install.appsflyer"
            java.io.File r5 = m3787((java.lang.String) r5)     // Catch:{ all -> 0x0b21 }
        L_0x041b:
            boolean r7 = m3794((java.io.File) r5)     // Catch:{ all -> 0x0b21 }
            if (r7 != 0) goto L_0x042c
            java.lang.String r7 = r13.getPackageName()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = m3751((java.io.File) r5, (java.lang.String) r7)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x042c
            goto L_0x042d
        L_0x042c:
            r5 = 0
        L_0x042d:
            if (r5 == 0) goto L_0x0430
            goto L_0x0442
        L_0x0430:
            java.lang.String r5 = "AF_PRE_INSTALL_NAME"
            if (r13 != 0) goto L_0x0436
            r5 = 0
            goto L_0x0442
        L_0x0436:
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = m3774((java.lang.String) r5, (android.content.pm.PackageManager) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0b21 }
        L_0x0442:
            r7 = r5
        L_0x0443:
            if (r7 == 0) goto L_0x0453
            android.content.SharedPreferences r5 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x0b21 }
            r5.putString(r8, r7)     // Catch:{ all -> 0x0b21 }
            r5.apply()     // Catch:{ all -> 0x0b21 }
        L_0x0453:
            if (r7 == 0) goto L_0x045c
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            r5.set((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x0b21 }
        L_0x045c:
            if (r7 == 0) goto L_0x0467
            java.lang.String r5 = "af_preinstall_name"
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ all -> 0x0b21 }
            r2.put(r5, r7)     // Catch:{ all -> 0x0b21 }
        L_0x0467:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = "api_store_value"
            java.lang.String r5 = r5.getString(r7)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0474
            goto L_0x0486
        L_0x0474:
            java.lang.String r5 = "AF_STORE"
            if (r13 != 0) goto L_0x047a
            r5 = 0
            goto L_0x0486
        L_0x047a:
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = r13.getPackageName()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = m3774((java.lang.String) r5, (android.content.pm.PackageManager) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0b21 }
        L_0x0486:
            if (r5 == 0) goto L_0x0491
            java.lang.String r7 = "af_currentstore"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x0b21 }
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0491:
            if (r19 == 0) goto L_0x04a1
            int r5 = r19.length()     // Catch:{ all -> 0x0b21 }
            if (r5 <= 0) goto L_0x04a1
            java.lang.String r5 = "appsflyerKey"
            r7 = r19
            r2.put(r5, r7)     // Catch:{ all -> 0x0b21 }
            goto L_0x04b8
        L_0x04a1:
            java.lang.String r5 = "AppsFlyerKey"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0b15
            int r7 = r5.length()     // Catch:{ all -> 0x0b21 }
            if (r7 <= 0) goto L_0x0b15
            java.lang.String r7 = "appsflyerKey"
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x04b8:
            java.lang.String r5 = "AppUserId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x04c9
            java.lang.String r7 = "appUserId"
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x04c9:
            java.lang.String r5 = "userEmails"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x04d7
            java.lang.String r7 = "user_emails"
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
            goto L_0x04ec
        L_0x04d7:
            java.lang.String r5 = "userEmail"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x04ec
            java.lang.String r7 = "sha1_el"
            java.lang.String r5 = com.appsflyer.HashUtils.toSHA1(r5)     // Catch:{ all -> 0x0b21 }
            r2.put(r7, r5)     // Catch:{ all -> 0x0b21 }
        L_0x04ec:
            if (r3 == 0) goto L_0x04fa
            java.lang.String r5 = "eventName"
            r2.put(r5, r3)     // Catch:{ all -> 0x0b21 }
            if (r6 == 0) goto L_0x04fa
            java.lang.String r5 = "eventValue"
            r2.put(r5, r6)     // Catch:{ all -> 0x0b21 }
        L_0x04fa:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            r6 = r18
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0511
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x0b21 }
            r2.put(r6, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0511:
            java.lang.String r5 = "currencyCode"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r6.getString(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x053f
            int r6 = r5.length()     // Catch:{ all -> 0x0b21 }
            r7 = 3
            if (r6 == r7) goto L_0x053a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = "WARNING: currency code should be 3 characters!!! '"
            r6.<init>(r7)     // Catch:{ all -> 0x0b21 }
            r6.append(r5)     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = "' is not a legal value."
            r6.append(r7)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ all -> 0x0b21 }
        L_0x053a:
            java.lang.String r6 = "currency"
            r2.put(r6, r5)     // Catch:{ all -> 0x0b21 }
        L_0x053f:
            java.lang.String r5 = "IS_UPDATE"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r6.getString(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0550
            java.lang.String r6 = "isUpdate"
            r2.put(r6, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0550:
            boolean r5 = r1.isPreInstalledApp(r13)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = "af_preinstalled"
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch:{ all -> 0x0b21 }
            r2.put(r6, r5)     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = "collectFacebookAttrId"
            r6 = 1
            boolean r5 = r4.getBoolean(r5, r6)     // Catch:{ all -> 0x0b21 }
            r7 = 0
            if (r5 == 0) goto L_0x058b
            android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x057e, all -> 0x0575 }
            java.lang.String r8 = "com.facebook.katana"
            r5.getApplicationInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x057e, all -> 0x0575 }
            java.lang.String r5 = r1.getAttributionId(r13)     // Catch:{ NameNotFoundException -> 0x057e, all -> 0x0575 }
            goto L_0x0584
        L_0x0575:
            r0 = move-exception
            r5 = r0
            java.lang.String r8 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.afErrorLog(r8, r5)     // Catch:{ all -> 0x0b21 }
        L_0x057c:
            r5 = 0
            goto L_0x0584
        L_0x057e:
            java.lang.String r5 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.afWarnLog(r5)     // Catch:{ all -> 0x0b21 }
            goto L_0x057c
        L_0x0584:
            if (r5 == 0) goto L_0x058b
            java.lang.String r8 = "fb"
            r2.put(r8, r5)     // Catch:{ all -> 0x0b21 }
        L_0x058b:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "deviceTrackingDisabled"
            boolean r8 = r5.getBoolean(r8, r7)     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = "true"
            if (r8 == 0) goto L_0x05a0
            java.lang.String r5 = "deviceTrackingDisabled"
            r2.put(r5, r9)     // Catch:{ all -> 0x0b21 }
            goto L_0x06f6
        L_0x05a0:
            android.content.SharedPreferences r8 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = "collectIMEI"
            boolean r10 = r5.getBoolean(r10, r6)     // Catch:{ all -> 0x0b21 }
            java.lang.String r11 = "imeiCached"
            r12 = 0
            java.lang.String r11 = r8.getString(r11, r12)     // Catch:{ all -> 0x0b21 }
            if (r10 == 0) goto L_0x0626
            java.lang.String r10 = r1.f4019     // Catch:{ all -> 0x0b21 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0b21 }
            if (r10 == 0) goto L_0x0626
            boolean r10 = m3770((android.content.Context) r13)     // Catch:{ all -> 0x0b21 }
            if (r10 == 0) goto L_0x062e
            r10 = r22
            java.lang.Object r10 = r13.getSystemService(r10)     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            java.lang.Class r12 = r10.getClass()     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            java.lang.String r14 = "getDeviceId"
            java.lang.Class[] r15 = new java.lang.Class[r7]     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            java.lang.reflect.Method r12 = r12.getMethod(r14, r15)     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            java.lang.Object r10 = r12.invoke(r10, r14)     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            if (r10 == 0) goto L_0x05e0
            goto L_0x062c
        L_0x05e0:
            if (r11 == 0) goto L_0x062e
            java.lang.String r10 = java.lang.String.valueOf(r11)     // Catch:{ InvocationTargetException -> 0x05f9, Exception -> 0x05f4 }
            r12 = r17
            java.lang.String r10 = r12.concat(r10)     // Catch:{ InvocationTargetException -> 0x05f2, Exception -> 0x05f0 }
            com.appsflyer.AFLogger.afDebugLog(r10)     // Catch:{ InvocationTargetException -> 0x05f2, Exception -> 0x05f0 }
            goto L_0x062f
        L_0x05f0:
            r0 = move-exception
            goto L_0x05f7
        L_0x05f2:
            goto L_0x0611
        L_0x05f4:
            r0 = move-exception
            r12 = r17
        L_0x05f7:
            r10 = r0
            goto L_0x05fc
        L_0x05f9:
            r12 = r17
            goto L_0x0611
        L_0x05fc:
            if (r11 == 0) goto L_0x060a
            java.lang.String r14 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0b21 }
            java.lang.String r12 = r12.concat(r14)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afDebugLog(r12)     // Catch:{ all -> 0x0b21 }
            goto L_0x060b
        L_0x060a:
            r11 = 0
        L_0x060b:
            java.lang.String r12 = "WARNING: other reason: "
            com.appsflyer.AFLogger.afErrorLog(r12, r10)     // Catch:{ all -> 0x0b21 }
            goto L_0x062f
        L_0x0611:
            if (r11 == 0) goto L_0x061f
            java.lang.String r10 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = r12.concat(r10)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afDebugLog(r10)     // Catch:{ all -> 0x0b21 }
            goto L_0x0620
        L_0x061f:
            r11 = 0
        L_0x0620:
            java.lang.String r10 = "WARNING: READ_PHONE_STATE is missing."
            com.appsflyer.AFLogger.afWarnLog(r10)     // Catch:{ all -> 0x0b21 }
            goto L_0x062f
        L_0x0626:
            java.lang.String r10 = r1.f4019     // Catch:{ all -> 0x0b21 }
            if (r10 == 0) goto L_0x062e
            java.lang.String r10 = r1.f4019     // Catch:{ all -> 0x0b21 }
        L_0x062c:
            r11 = r10
            goto L_0x062f
        L_0x062e:
            r11 = 0
        L_0x062f:
            if (r11 == 0) goto L_0x0647
            java.lang.String r10 = "imeiCached"
            android.content.SharedPreferences r12 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch:{ all -> 0x0b21 }
            r12.putString(r10, r11)     // Catch:{ all -> 0x0b21 }
            r12.apply()     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = "imei"
            r2.put(r10, r11)     // Catch:{ all -> 0x0b21 }
            goto L_0x064c
        L_0x0647:
            java.lang.String r10 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r10)     // Catch:{ all -> 0x0b21 }
        L_0x064c:
            java.lang.String r10 = "collectAndroidId"
            boolean r5 = r5.getBoolean(r10, r6)     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = "androidIdCached"
            r11 = 0
            java.lang.String r8 = r8.getString(r10, r11)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x06a4
            java.lang.String r5 = r1.f4030     // Catch:{ all -> 0x0b21 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x06a4
            boolean r5 = m3770((android.content.Context) r13)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x06ab
            android.content.ContentResolver r5 = r13.getContentResolver()     // Catch:{ Exception -> 0x0688 }
            java.lang.String r10 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r10)     // Catch:{ Exception -> 0x0688 }
            if (r5 == 0) goto L_0x0676
            goto L_0x06ac
        L_0x0676:
            if (r8 == 0) goto L_0x0686
            java.lang.String r5 = "use cached AndroidId: "
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0688 }
            java.lang.String r5 = r5.concat(r10)     // Catch:{ Exception -> 0x0688 }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ Exception -> 0x0688 }
            goto L_0x06a2
        L_0x0686:
            r8 = 0
            goto L_0x06a2
        L_0x0688:
            r0 = move-exception
            r5 = r0
            if (r8 == 0) goto L_0x069a
            java.lang.String r10 = "use cached AndroidId: "
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = r10.concat(r11)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afDebugLog(r10)     // Catch:{ all -> 0x0b21 }
            goto L_0x069b
        L_0x069a:
            r8 = 0
        L_0x069b:
            java.lang.String r10 = r5.getMessage()     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afErrorLog(r10, r5)     // Catch:{ all -> 0x0b21 }
        L_0x06a2:
            r5 = r8
            goto L_0x06ac
        L_0x06a4:
            java.lang.String r5 = r1.f4030     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x06ab
            java.lang.String r5 = r1.f4030     // Catch:{ all -> 0x0b21 }
            goto L_0x06ac
        L_0x06ab:
            r5 = 0
        L_0x06ac:
            if (r5 == 0) goto L_0x06c4
            java.lang.String r8 = "androidIdCached"
            android.content.SharedPreferences r10 = getSharedPreferences(r13)     // Catch:{ all -> 0x0b21 }
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch:{ all -> 0x0b21 }
            r10.putString(r8, r5)     // Catch:{ all -> 0x0b21 }
            r10.apply()     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "android_id"
            r2.put(r8, r5)     // Catch:{ all -> 0x0b21 }
            goto L_0x06c9
        L_0x06c4:
            java.lang.String r5 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r5)     // Catch:{ all -> 0x0b21 }
        L_0x06c9:
            com.appsflyer.AdvertisingIdObject r5 = com.appsflyer.AdvertisingIdUtil.getOaid(r13)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x06f6
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0b21 }
            r8.<init>()     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = "isManual"
            java.lang.Boolean r11 = r5.isManual()     // Catch:{ all -> 0x0b21 }
            r8.put(r10, r11)     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = "val"
            java.lang.String r11 = r5.getAdvertisingId()     // Catch:{ all -> 0x0b21 }
            r8.put(r10, r11)     // Catch:{ all -> 0x0b21 }
            java.lang.Boolean r5 = r5.isLimitAdTracking()     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x06f1
            java.lang.String r10 = "isLat"
            r8.put(r10, r5)     // Catch:{ all -> 0x0b21 }
        L_0x06f1:
            java.lang.String r5 = "oaid"
            r2.put(r5, r8)     // Catch:{ all -> 0x0b21 }
        L_0x06f6:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x0707 }
            r5.<init>(r13)     // Catch:{ Exception -> 0x0707 }
            java.lang.String r5 = com.appsflyer.internal.C1777u.m3909(r5)     // Catch:{ Exception -> 0x0707 }
            if (r5 == 0) goto L_0x071e
            java.lang.String r8 = "uid"
            r2.put(r8, r5)     // Catch:{ Exception -> 0x0707 }
            goto L_0x071e
        L_0x0707:
            r0 = move-exception
            r5 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = "ERROR: could not get uid "
            r8.<init>(r10)     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = r5.getMessage()     // Catch:{ all -> 0x0b21 }
            r8.append(r10)     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afErrorLog(r8, r5)     // Catch:{ all -> 0x0b21 }
        L_0x071e:
            java.lang.String r5 = "lang"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x072c }
            java.lang.String r8 = r8.getDisplayLanguage()     // Catch:{ Exception -> 0x072c }
            r2.put(r5, r8)     // Catch:{ Exception -> 0x072c }
            goto L_0x0733
        L_0x072c:
            r0 = move-exception
            r5 = r0
            java.lang.String r8 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.afErrorLog(r8, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0733:
            java.lang.String r5 = "lang_code"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0741 }
            java.lang.String r8 = r8.getLanguage()     // Catch:{ Exception -> 0x0741 }
            r2.put(r5, r8)     // Catch:{ Exception -> 0x0741 }
            goto L_0x0748
        L_0x0741:
            r0 = move-exception
            r5 = r0
            java.lang.String r8 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.afErrorLog(r8, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0748:
            java.lang.String r5 = "country"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0756 }
            java.lang.String r8 = r8.getCountry()     // Catch:{ Exception -> 0x0756 }
            r2.put(r5, r8)     // Catch:{ Exception -> 0x0756 }
            goto L_0x075d
        L_0x0756:
            r0 = move-exception
            r5 = r0
            java.lang.String r8 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.afErrorLog(r8, r5)     // Catch:{ all -> 0x0b21 }
        L_0x075d:
            java.lang.String r5 = "platformextension"
            com.appsflyer.internal.z r8 = r1.f4023     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = r8.mo14109()     // Catch:{ all -> 0x0b21 }
            r2.put(r5, r8)     // Catch:{ all -> 0x0b21 }
            m3758((android.content.Context) r13, (java.util.Map<java.lang.String, ? super java.lang.String>) r2)     // Catch:{ all -> 0x0b21 }
            java.text.SimpleDateFormat r5 = com.appsflyer.AFDateFormat.getDataFormatter(r16)     // Catch:{ all -> 0x0b21 }
            android.content.pm.PackageManager r8 = r13.getPackageManager()     // Catch:{ Exception -> 0x0795 }
            java.lang.String r10 = r13.getPackageName()     // Catch:{ Exception -> 0x0795 }
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r10, r7)     // Catch:{ Exception -> 0x0795 }
            long r10 = r8.firstInstallTime     // Catch:{ Exception -> 0x0795 }
            java.lang.String r8 = "installDate"
            java.lang.String r12 = "UTC"
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r12)     // Catch:{ Exception -> 0x0795 }
            r5.setTimeZone(r12)     // Catch:{ Exception -> 0x0795 }
            java.util.Date r12 = new java.util.Date     // Catch:{ Exception -> 0x0795 }
            r12.<init>(r10)     // Catch:{ Exception -> 0x0795 }
            java.lang.String r10 = r5.format(r12)     // Catch:{ Exception -> 0x0795 }
            r2.put(r8, r10)     // Catch:{ Exception -> 0x0795 }
            goto L_0x079c
        L_0x0795:
            r0 = move-exception
            r8 = r0
            java.lang.String r10 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.afErrorLog(r10, r8)     // Catch:{ all -> 0x0b21 }
        L_0x079c:
            android.content.pm.PackageManager r8 = r13.getPackageManager()     // Catch:{ all -> 0x080c }
            java.lang.String r10 = r13.getPackageName()     // Catch:{ all -> 0x080c }
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r10, r7)     // Catch:{ all -> 0x080c }
            java.lang.String r10 = "versionCode"
            r11 = r29
            int r10 = r11.getInt(r10, r7)     // Catch:{ all -> 0x080a }
            int r12 = r8.versionCode     // Catch:{ all -> 0x080a }
            if (r12 <= r10) goto L_0x07c6
            java.lang.String r10 = "versionCode"
            int r12 = r8.versionCode     // Catch:{ all -> 0x080a }
            android.content.SharedPreferences r14 = getSharedPreferences(r13)     // Catch:{ all -> 0x080a }
            android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch:{ all -> 0x080a }
            r14.putInt(r10, r12)     // Catch:{ all -> 0x080a }
            r14.apply()     // Catch:{ all -> 0x080a }
        L_0x07c6:
            java.lang.String r10 = "app_version_code"
            int r12 = r8.versionCode     // Catch:{ all -> 0x080a }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ all -> 0x080a }
            r2.put(r10, r12)     // Catch:{ all -> 0x080a }
            java.lang.String r10 = "app_version_name"
            java.lang.String r12 = r8.versionName     // Catch:{ all -> 0x080a }
            r2.put(r10, r12)     // Catch:{ all -> 0x080a }
            long r14 = r8.firstInstallTime     // Catch:{ all -> 0x080a }
            long r6 = r8.lastUpdateTime     // Catch:{ all -> 0x080a }
            java.lang.String r8 = "date1"
            java.text.SimpleDateFormat r10 = com.appsflyer.AFDateFormat.getDataFormatter(r16)     // Catch:{ all -> 0x080a }
            java.util.Date r12 = new java.util.Date     // Catch:{ all -> 0x080a }
            r12.<init>(r14)     // Catch:{ all -> 0x080a }
            java.lang.String r10 = r10.format(r12)     // Catch:{ all -> 0x080a }
            r2.put(r8, r10)     // Catch:{ all -> 0x080a }
            java.lang.String r8 = "date2"
            java.text.SimpleDateFormat r10 = com.appsflyer.AFDateFormat.getDataFormatter(r16)     // Catch:{ all -> 0x080a }
            java.util.Date r12 = new java.util.Date     // Catch:{ all -> 0x080a }
            r12.<init>(r6)     // Catch:{ all -> 0x080a }
            java.lang.String r6 = r10.format(r12)     // Catch:{ all -> 0x080a }
            r2.put(r8, r6)     // Catch:{ all -> 0x080a }
            java.lang.String r5 = r1.m3752((java.text.SimpleDateFormat) r5, (android.content.Context) r13)     // Catch:{ all -> 0x080a }
            java.lang.String r6 = "firstLaunchDate"
            r2.put(r6, r5)     // Catch:{ all -> 0x080a }
            goto L_0x0815
        L_0x080a:
            r0 = move-exception
            goto L_0x080f
        L_0x080c:
            r0 = move-exception
            r11 = r29
        L_0x080f:
            r5 = r0
            java.lang.String r6 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.afErrorLog(r6, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0815:
            boolean r5 = com.appsflyer.internal.C1743ad.m3851(r13)     // Catch:{ all -> 0x0b21 }
            r1.f4022 = r5     // Catch:{ all -> 0x0b21 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = "didConfigureTokenRefreshService="
            r5.<init>(r6)     // Catch:{ all -> 0x0b21 }
            boolean r6 = r1.f4022     // Catch:{ all -> 0x0b21 }
            r5.append(r6)     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x0b21 }
            boolean r5 = r1.f4022     // Catch:{ all -> 0x0b21 }
            if (r5 != 0) goto L_0x0839
            java.lang.String r5 = "tokenRefreshConfigured"
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0b21 }
            r2.put(r5, r6)     // Catch:{ all -> 0x0b21 }
        L_0x0839:
            if (r28 == 0) goto L_0x086c
            java.lang.String r5 = r1.f4024     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x0862
            java.lang.String r5 = "af_deeplink"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ all -> 0x0b21 }
            if (r5 == 0) goto L_0x084d
            java.lang.String r5 = "Skip 'af' payload as deeplink was found by path"
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x0b21 }
            goto L_0x0862
        L_0x084d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = r1.f4024     // Catch:{ all -> 0x0b21 }
            r5.<init>(r6)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = "isPush"
            r5.put(r6, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = "af_deeplink"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0b21 }
            r2.put(r6, r5)     // Catch:{ all -> 0x0b21 }
        L_0x0862:
            r5 = 0
            r1.f4024 = r5     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = "open_referrer"
            r6 = r23
            r2.put(r5, r6)     // Catch:{ all -> 0x0b21 }
        L_0x086c:
            java.lang.String r5 = "sensors"
            if (r28 != 0) goto L_0x08ab
            com.appsflyer.AFSensorManager r6 = com.appsflyer.AFSensorManager.m3720((android.content.Context) r13)     // Catch:{ Exception -> 0x0894 }
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x0894 }
            r7.<init>()     // Catch:{ Exception -> 0x0894 }
            java.util.List r6 = r6.mo13855()     // Catch:{ Exception -> 0x0894 }
            boolean r8 = r6.isEmpty()     // Catch:{ Exception -> 0x0894 }
            if (r8 != 0) goto L_0x088b
            java.util.Map r6 = com.appsflyer.internal.C1754j.m3882(r6)     // Catch:{ Exception -> 0x0894 }
            r7.put(r5, r6)     // Catch:{ Exception -> 0x0894 }
            goto L_0x0890
        L_0x088b:
            java.lang.String r6 = "na"
            r7.put(r5, r6)     // Catch:{ Exception -> 0x0894 }
        L_0x0890:
            r2.putAll(r7)     // Catch:{ Exception -> 0x0894 }
            goto L_0x08ab
        L_0x0894:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "Unexpected exception from AFSensorManager: "
            r7.<init>(r8)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0b21 }
            r7.append(r6)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AFLogger.afRDLog(r6)     // Catch:{ all -> 0x0b21 }
        L_0x08ab:
            java.lang.String r6 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = r7.getString(r6)     // Catch:{ all -> 0x0b21 }
            if (r6 != 0) goto L_0x08d3
            com.appsflyer.AdvertisingIdUtil.getGaid(r13, r2)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = r7.getString(r6)     // Catch:{ all -> 0x0b21 }
            if (r6 == 0) goto L_0x08cc
            java.lang.String r6 = "GAID_retry"
            r2.put(r6, r9)     // Catch:{ all -> 0x0b21 }
            goto L_0x08d3
        L_0x08cc:
            java.lang.String r6 = "GAID_retry"
            java.lang.String r7 = "false"
            r2.put(r6, r7)     // Catch:{ all -> 0x0b21 }
        L_0x08d3:
            android.content.ContentResolver r6 = r13.getContentResolver()     // Catch:{ all -> 0x0b21 }
            com.appsflyer.AdvertisingIdObject r6 = com.appsflyer.AdvertisingIdUtil.m3734(r6)     // Catch:{ all -> 0x0b21 }
            if (r6 == 0) goto L_0x08f3
            java.lang.String r7 = "amazon_aid"
            java.lang.String r8 = r6.getAdvertisingId()     // Catch:{ all -> 0x0b21 }
            r2.put(r7, r8)     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = "amazon_aid_limit"
            java.lang.Boolean r6 = r6.isLimitAdTracking()     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0b21 }
            r2.put(r7, r6)     // Catch:{ all -> 0x0b21 }
        L_0x08f3:
            java.lang.String r6 = "sentRegisterRequestToAF"
            r7 = 0
            boolean r6 = r11.getBoolean(r6, r7)     // Catch:{ all -> 0x0b21 }
            java.lang.String r7 = "registeredUninstall"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0b21 }
            r2.put(r7, r6)     // Catch:{ all -> 0x0b21 }
            r6 = r28
            int r7 = r1.getLaunchCounter(r11, r6)     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "counter"
            java.lang.String r9 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0b21 }
            r2.put(r8, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = "iaecounter"
            if (r3 == 0) goto L_0x0918
            r10 = 1
            goto L_0x0919
        L_0x0918:
            r10 = 0
        L_0x0919:
            java.lang.String r3 = "appsFlyerInAppEventCount"
            int r3 = m3784(r11, r3, r10)     // Catch:{ all -> 0x0b21 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0b21 }
            r2.put(r8, r3)     // Catch:{ all -> 0x0b21 }
            if (r6 == 0) goto L_0x099a
            java.lang.String r3 = "first_launch"
            r8 = 1
            if (r7 == r8) goto L_0x0950
            r4 = 2
            if (r7 == r4) goto L_0x0931
            goto L_0x099a
        L_0x0931:
            java.util.Map r4 = m3743((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0b21 }
            r8 = r34
            java.lang.String r9 = r8.getString(r3)     // Catch:{ all -> 0x0b21 }
            if (r9 == 0) goto L_0x099c
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x0b21 }
            r14.<init>(r9)     // Catch:{ all -> 0x0b21 }
            java.util.Map r9 = com.appsflyer.AFHelper.toMap(r14)     // Catch:{ all -> 0x0b21 }
            boolean r14 = r9.isEmpty()     // Catch:{ all -> 0x0b21 }
            if (r14 != 0) goto L_0x099c
            r4.put(r3, r9)     // Catch:{ all -> 0x0b21 }
            goto L_0x099c
        L_0x0950:
            r8 = r34
            r4.setFirstLaunchCalled()     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "waitForCustomerId"
            r9 = 0
            boolean r4 = m3783((java.lang.String) r4, (boolean) r9)     // Catch:{ all -> 0x0b21 }
            if (r4 == 0) goto L_0x0969
            java.lang.String r4 = "wait_cid"
            r9 = 1
            java.lang.String r10 = java.lang.Boolean.toString(r9)     // Catch:{ all -> 0x0b21 }
            r2.put(r4, r10)     // Catch:{ all -> 0x0b21 }
            goto L_0x096a
        L_0x0969:
            r9 = 1
        L_0x096a:
            java.util.Map r4 = m3743((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = "ddl"
            java.lang.String r10 = r8.getString(r10)     // Catch:{ all -> 0x0b21 }
            if (r10 == 0) goto L_0x098a
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x0b21 }
            r14.<init>(r10)     // Catch:{ all -> 0x0b21 }
            java.util.Map r10 = com.appsflyer.AFHelper.toMap(r14)     // Catch:{ all -> 0x0b21 }
            boolean r14 = r10.isEmpty()     // Catch:{ all -> 0x0b21 }
            if (r14 != 0) goto L_0x098a
            java.lang.String r14 = "ddl"
            r4.put(r14, r10)     // Catch:{ all -> 0x0b21 }
        L_0x098a:
            org.json.JSONObject r10 = r1.f4040     // Catch:{ all -> 0x0b21 }
            java.util.Map r10 = com.appsflyer.AFHelper.toMap(r10)     // Catch:{ all -> 0x0b21 }
            boolean r14 = r10.isEmpty()     // Catch:{ all -> 0x0b21 }
            if (r14 != 0) goto L_0x099d
            r4.put(r3, r10)     // Catch:{ all -> 0x0b21 }
            goto L_0x099d
        L_0x099a:
            r8 = r34
        L_0x099c:
            r9 = 1
        L_0x099d:
            java.lang.String r3 = "isFirstCall"
            boolean r4 = m3747((android.content.SharedPreferences) r11)     // Catch:{ all -> 0x0b21 }
            if (r4 != 0) goto L_0x09a6
            goto L_0x09a7
        L_0x09a6:
            r9 = 0
        L_0x09a7:
            java.lang.String r4 = java.lang.Boolean.toString(r9)     // Catch:{ all -> 0x0b21 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0b21 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0b21 }
            r3.<init>()     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "cpu_abi"
            java.lang.String r9 = "ro.product.cpu.abi"
            java.lang.String r9 = m3764((java.lang.String) r9)     // Catch:{ all -> 0x0b21 }
            r3.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "cpu_abi2"
            java.lang.String r9 = "ro.product.cpu.abi2"
            java.lang.String r9 = m3764((java.lang.String) r9)     // Catch:{ all -> 0x0b21 }
            r3.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "arch"
            java.lang.String r9 = "os.arch"
            java.lang.String r9 = m3764((java.lang.String) r9)     // Catch:{ all -> 0x0b21 }
            r3.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "build_display_id"
            java.lang.String r9 = "ro.build.display.id"
            java.lang.String r9 = m3764((java.lang.String) r9)     // Catch:{ all -> 0x0b21 }
            r3.put(r4, r9)     // Catch:{ all -> 0x0b21 }
            if (r6 == 0) goto L_0x0a6b
            boolean r4 = r1.f4034     // Catch:{ all -> 0x0b21 }
            if (r4 == 0) goto L_0x0a25
            com.appsflyer.internal.s r4 = com.appsflyer.internal.C1772s.C1773e.f4246     // Catch:{ all -> 0x0b21 }
            android.location.Location r4 = com.appsflyer.internal.C1772s.m3904(r13)     // Catch:{ all -> 0x0b21 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0b21 }
            r9 = 3
            r6.<init>(r9)     // Catch:{ all -> 0x0b21 }
            if (r4 == 0) goto L_0x0a1a
            java.lang.String r9 = "lat"
            double r14 = r4.getLatitude()     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0b21 }
            r6.put(r9, r10)     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = "lon"
            double r14 = r4.getLongitude()     // Catch:{ all -> 0x0b21 }
            java.lang.String r10 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0b21 }
            r6.put(r9, r10)     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = "ts"
            long r14 = r4.getTime()     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0b21 }
            r6.put(r9, r4)     // Catch:{ all -> 0x0b21 }
        L_0x0a1a:
            boolean r4 = r6.isEmpty()     // Catch:{ all -> 0x0b21 }
            if (r4 != 0) goto L_0x0a25
            java.lang.String r4 = "loc"
            r3.put(r4, r6)     // Catch:{ all -> 0x0b21 }
        L_0x0a25:
            com.appsflyer.internal.b r4 = com.appsflyer.internal.C1747b.C1749d.f4166     // Catch:{ all -> 0x0b21 }
            com.appsflyer.internal.b$a r4 = r4.mo14075(r13)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = "btl"
            float r9 = r4.f4164     // Catch:{ all -> 0x0b21 }
            java.lang.String r9 = java.lang.Float.toString(r9)     // Catch:{ all -> 0x0b21 }
            r3.put(r6, r9)     // Catch:{ all -> 0x0b21 }
            java.lang.String r6 = r4.f4165     // Catch:{ all -> 0x0b21 }
            if (r6 == 0) goto L_0x0a41
            java.lang.String r6 = "btch"
            java.lang.String r4 = r4.f4165     // Catch:{ all -> 0x0b21 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0b21 }
        L_0x0a41:
            r4 = 2
            if (r7 > r4) goto L_0x0a6b
            com.appsflyer.AFSensorManager r4 = com.appsflyer.AFSensorManager.m3720((android.content.Context) r13)     // Catch:{ all -> 0x0b21 }
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0b21 }
            r6.<init>()     // Catch:{ all -> 0x0b21 }
            java.util.List r7 = r4.mo13854()     // Catch:{ all -> 0x0b21 }
            boolean r9 = r7.isEmpty()     // Catch:{ all -> 0x0b21 }
            if (r9 != 0) goto L_0x0a5b
            r6.put(r5, r7)     // Catch:{ all -> 0x0b21 }
            goto L_0x0a68
        L_0x0a5b:
            java.util.List r4 = r4.mo13855()     // Catch:{ all -> 0x0b21 }
            boolean r7 = r4.isEmpty()     // Catch:{ all -> 0x0b21 }
            if (r7 != 0) goto L_0x0a68
            r6.put(r5, r4)     // Catch:{ all -> 0x0b21 }
        L_0x0a68:
            r3.putAll(r6)     // Catch:{ all -> 0x0b21 }
        L_0x0a6b:
            java.util.Map r4 = com.appsflyer.internal.C1761p.m3885(r13)     // Catch:{ all -> 0x0b21 }
            java.lang.String r5 = "dim"
            r3.put(r5, r4)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "deviceData"
            r2.put(r4, r3)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.HashUtils r3 = new com.appsflyer.HashUtils     // Catch:{ all -> 0x0b21 }
            r3.<init>()     // Catch:{ all -> 0x0b21 }
            java.lang.String r3 = r3.getHashCode(r2)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "af_v"
            r2.put(r4, r3)     // Catch:{ all -> 0x0b21 }
            com.appsflyer.HashUtils r3 = new com.appsflyer.HashUtils     // Catch:{ all -> 0x0b21 }
            r3.<init>()     // Catch:{ all -> 0x0b21 }
            java.lang.String r3 = r3.getHashCodeV2(r2)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "af_v2"
            r2.put(r4, r3)     // Catch:{ all -> 0x0b21 }
            boolean r3 = m3750((android.content.Context) r13)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "ivc"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0b21 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0b21 }
            java.lang.String r3 = "is_stop_tracking_used"
            boolean r3 = r11.contains(r3)     // Catch:{ all -> 0x0b21 }
            if (r3 == 0) goto L_0x0aba
            java.lang.String r3 = "istu"
            java.lang.String r4 = "is_stop_tracking_used"
            r5 = 0
            boolean r4 = r11.getBoolean(r4, r5)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0b21 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0b21 }
        L_0x0aba:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0b21 }
            r3.<init>()     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "mcc"
            android.content.res.Resources r5 = r13.getResources()     // Catch:{ all -> 0x0b21 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0b21 }
            int r5 = r5.mcc     // Catch:{ all -> 0x0b21 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0b21 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "mnc"
            android.content.res.Resources r5 = r13.getResources()     // Catch:{ all -> 0x0b21 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0b21 }
            int r5 = r5.mnc     // Catch:{ all -> 0x0b21 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0b21 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = "cell"
            r2.put(r4, r3)     // Catch:{ all -> 0x0b21 }
            java.lang.String r3 = "sig"
            java.lang.String r4 = r8.signature()     // Catch:{ all -> 0x0b21 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0b21 }
            java.lang.String r3 = "last_boot_time"
            long r4 = r8.bootTime()     // Catch:{ all -> 0x0b21 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b21 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0b21 }
            java.lang.String r3 = "disk"
            java.lang.String r4 = r8.disk()     // Catch:{ all -> 0x0b21 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0b21 }
            java.lang.String[] r3 = r1.sharingFilter     // Catch:{ all -> 0x0b21 }
            if (r3 == 0) goto L_0x0b2a
            java.lang.String r3 = "sharing_filter"
            java.lang.String[] r4 = r1.sharingFilter     // Catch:{ all -> 0x0b21 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0b21 }
            goto L_0x0b2a
        L_0x0b15:
            java.lang.String r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0b21 }
            java.lang.String r3 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0b21 }
            r2 = 0
            return r2
        L_0x0b21:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = r3.getLocalizedMessage()
            com.appsflyer.AFLogger.afErrorLog(r4, r3)
        L_0x0b2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.mo13950(com.appsflyer.AFEvent):java.util.Map");
    }

    /* renamed from: ı */
    static Map<String, Object> m3743(Map<String, Object> map) {
        if (map.containsKey(ServerParameters.META)) {
            return (Map) map.get(ServerParameters.META);
        }
        HashMap hashMap = new HashMap();
        map.put(ServerParameters.META, hashMap);
        return hashMap;
    }

    /* renamed from: ı */
    public static boolean m3747(SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", (String) null));
    }

    /* renamed from: ι */
    private static void m3791(Context context, Map<String, Object> map) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : "pr" : "l" : "p");
        }
    }

    /* renamed from: ι */
    private static String m3788(Activity activity) {
        Intent intent;
        String str = null;
        if (!(activity == null || (intent = activity.getIntent()) == null)) {
            try {
                Bundle extras = intent.getExtras();
                if (!(extras == null || (str = extras.getString("af")) == null)) {
                    AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(str)));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public void handleDeepLinkCallback(Context context, Map<String, Object> map, Uri uri) {
        String str;
        if (!map.containsKey(ServerParameters.DEEP_LINK)) {
            String obj = uri.toString();
            if (obj == null) {
                obj = null;
            } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                int indexOf = obj.indexOf(63);
                if (indexOf == -1) {
                    str = "";
                } else {
                    str = obj.substring(indexOf);
                }
                if (str.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (str.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(str.split("&")));
                    } else {
                        arrayList.add(str);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (str2.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append("&");
                            } else if (!str2.startsWith("?")) {
                                sb.append("?");
                            }
                            sb.append(str2);
                        }
                    }
                    obj = obj.replace(str, sb.toString());
                }
            }
            AFDeepLinkManager instance2 = AFDeepLinkManager.getInstance();
            if (!(instance2.contains == null || instance2.parameters == null || !obj.contains(instance2.contains))) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry next : instance2.parameters.entrySet()) {
                    buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                    buildUpon2.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                }
                obj = buildUpon.build().toString();
                map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
            }
            map.put(ServerParameters.DEEP_LINK, obj);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        C1781y yVar = new C1781y(uri, this);
        if (yVar.f4256) {
            map.put(ServerParameters.IS_BRANDED, Boolean.TRUE);
        }
        yVar.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        if (yVar.mo14108()) {
            yVar.f4257 = new C1781y.C1782b() {
                /* renamed from: ǃ */
                public final void mo13957(String str) {
                    DeepLinkCallbacks.onDeepLinkingError(str);
                }

                /* renamed from: ɩ */
                public final void mo13958(Map<String, String> map) {
                    for (String next : map.keySet()) {
                        hashMap.put(next, map.get(next));
                    }
                    DeepLinkCallbacks.onDeepLinkingSuccess(hashMap);
                }
            };
            AFExecutor.getInstance().getThreadPoolExecutor().execute(yVar);
            return;
        }
        AndroidUtils.m3735(context, hashMap, uri);
        DeepLinkCallbacks.onDeepLinkingSuccess(hashMap);
    }

    /* renamed from: ι */
    private static boolean m3793(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* renamed from: ɹ */
    private static boolean m3770(Context context) {
        if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) || !m3793(context)) {
            return true;
        }
        return false;
    }

    public boolean isAppsFlyerFirstLaunch(Context context) {
        return !getSharedPreferences(context).contains("appsFlyerCount");
    }

    /* renamed from: ɩ */
    private static String m3764(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: Ι */
    private static String m3774(String str, PackageManager packageManager, String str2) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str2, 128).metaData;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(str);
            sb.append(" value in the manifest");
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put(Constants.URL_MEDIA_SOURCE, str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            jSONObject.put(Constants.URL_CAMPAIGN, str2);
        }
        if (str3 != null) {
            jSONObject.put(Constants.URL_SITE_ID, str3);
        }
        if (jSONObject.has(Constants.URL_MEDIA_SOURCE)) {
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0028=Splitter:B:13:0x0028, B:22:0x003f=Splitter:B:22:0x003f} */
    /* renamed from: ǃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m3751(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r4 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x0028
        L_0x0026:
            r4 = move-exception
            r2 = r0
        L_0x0028:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0059
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r5, r4)
            goto L_0x0059
        L_0x003e:
            r2 = r0
        L_0x003f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x005a }
            r5.append(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0059:
            return r0
        L_0x005a:
            r4 = move-exception
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0069:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m3751(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: ι */
    private static boolean m3794(File file) {
        return file == null || !file.exists();
    }

    /* renamed from: ι */
    private static File m3787(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    public String getConfiguredChannel(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = context == null ? null : m3774("CHANNEL", context.getPackageManager(), context.getPackageName());
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public boolean isPreInstalledApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι */
    public static String m3789(Context context, String str) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        if (sharedPreferences.contains("CACHED_CHANNEL")) {
            return sharedPreferences.getString("CACHED_CHANNEL", (String) null);
        }
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putString("CACHED_CHANNEL", str);
        edit.apply();
        return str;
    }

    /* renamed from: ǃ */
    private String m3752(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        String string = getSharedPreferences(context).getString("appsFlyerFirstInstall", (String) null);
        if (string == null) {
            if (isAppsFlyerFirstLaunch(context)) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            string = str;
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putString("appsFlyerFirstInstall", string);
            edit.apply();
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    public String getAttributionId(Context context) {
        try {
            return new C1780x(context).mo14107();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    public static SharedPreferences getSharedPreferences(Context context) {
        if (getInstance().f4039 == null) {
            getInstance().f4039 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        }
        return getInstance().f4039;
    }

    public final int getLaunchCounter(SharedPreferences sharedPreferences, boolean z) {
        return m3784(sharedPreferences, "appsFlyerCount", z);
    }

    /* renamed from: ι */
    private static int m3784(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            edit.apply();
        }
        if (C1740aa.m3833().mo14064()) {
            C1740aa.m3833().mo14062(String.valueOf(i));
        }
        return i;
    }

    public String getAppsFlyerUID(Context context) {
        C1740aa.m3833().mo14060("public_api_call", "getAppsFlyerUID", new String[0]);
        return C1777u.m3909(new WeakReference(context));
    }

    public void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Context context2 = context;
        String str6 = str3;
        String str7 = str4;
        String str8 = str5;
        C1740aa r1 = C1740aa.m3833();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str6;
        strArr[3] = str7;
        strArr[4] = str8;
        strArr[5] = map == null ? "" : map.toString();
        r1.mo14060("public_api_call", "validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str7);
            sb.append(" ");
            sb.append(str8);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str == null || str7 == null || str2 == null || str8 == null || str6 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = f4011;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        if (context2 instanceof Activity) {
            ((Activity) context2).getIntent();
        }
        new Thread(new AFValidateInAppPurchase(applicationContext, string, str, str2, str3, str4, str5, map)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι */
    public static void m3779(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    public boolean isStopped() {
        return this.f4025;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[SYNTHETIC, Splitter:B:29:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[Catch:{ all -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String readServerResponse(java.net.HttpURLConnection r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r2 = r8.getErrorStream()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x0010
            java.io.InputStream r2 = r8.getInputStream()     // Catch:{ all -> 0x0047 }
        L_0x0010:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0047 }
            r3.<init>(r2)     // Catch:{ all -> 0x0047 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0045 }
            r2.<init>(r3)     // Catch:{ all -> 0x0045 }
            r1 = 0
        L_0x001b:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x002a
            r1 = 10
            java.lang.Character r1 = java.lang.Character.valueOf(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = ""
        L_0x002c:
            r0.append(r1)     // Catch:{ all -> 0x0040 }
            r0.append(r4)     // Catch:{ all -> 0x0040 }
            r1 = 1
            goto L_0x001b
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x003b }
            r3.close()     // Catch:{ all -> 0x003b }
            goto L_0x006c
        L_0x003b:
            r8 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r8)
            goto L_0x006c
        L_0x0040:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            goto L_0x0049
        L_0x0047:
            r2 = move-exception
            r3 = r1
        L_0x0049:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Could not read connection response from: "
            r4.<init>(r5)     // Catch:{ all -> 0x008f }
            java.net.URL r8 = r8.getURL()     // Catch:{ all -> 0x008f }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x008f }
            r4.append(r8)     // Catch:{ all -> 0x008f }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x008f }
            com.appsflyer.AFLogger.afErrorLog(r8, r2)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x0067:
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x006c:
            java.lang.String r8 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0076 }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x0076 }
            return r8
        L_0x0076:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r8 = r0.toString()     // Catch:{ JSONException -> 0x0085 }
            return r8
        L_0x0085:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r8 = r8.toString()
            return r8
        L_0x008f:
            r8 = move-exception
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            r0 = move-exception
            goto L_0x009e
        L_0x0098:
            if (r3 == 0) goto L_0x00a1
            r3.close()     // Catch:{ all -> 0x0096 }
            goto L_0x00a1
        L_0x009e:
            com.appsflyer.AFLogger.afErrorLog(r0)
        L_0x00a1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.readServerResponse(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: Ӏ */
    private static float m3797(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return 1.0f;
        }
    }

    /* renamed from: Ɩ */
    private static boolean m3750(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e);
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            }
        }
        return false;
    }

    public void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z = logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel();
        C1740aa.m3833().mo14060("public_api_call", "log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("shouldLog", z);
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    public void setMinTimeBetweenSessions(int i) {
        this.f4029 = TimeUnit.SECONDS.toMillis((long) i);
    }

    public Referrer[] getReferrers() {
        return this.f4044;
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$e */
    class C1724e implements Runnable {

        /* renamed from: Ι */
        private AFEvent f4070;

        /* synthetic */ C1724e(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }

        private C1724e(AFEvent aFEvent) {
            this.f4070 = aFEvent;
        }

        public final void run() {
            AppsFlyerLibCore.m3778(AppsFlyerLibCore.this, this.f4070);
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$c */
    class C1722c implements Runnable {

        /* renamed from: ı */
        private final AFEvent f4066;

        /* synthetic */ C1722c(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }

        private C1722c(AFEvent aFEvent) {
            this.f4066 = aFEvent;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: byte[]} */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x024e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x024f, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0261, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0262, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0183, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0184, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0, true);
            r2 = r1.f4066.getRequestListener();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0191, code lost:
            if (r2 != null) goto L_0x0193;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0193, code lost:
            r2.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x019d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x019e, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c4, code lost:
            r3.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c9, code lost:
            r3 = r3.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cd, code lost:
            if (r3 == null) goto L_0x01db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d4, code lost:
            com.appsflyer.AFLogger.afInfoLog("reached cache limit, not caching request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x01db, code lost:
            com.appsflyer.AFLogger.afInfoLog("caching request...");
            r3 = new java.io.File(com.appsflyer.internal.C1779w.m3913((android.content.Context) r5), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r3.createNewFile();
            r5 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r3.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            r5.write("version=");
            r5.write(r0.f3961);
            r5.write(10);
            r5.write("url=");
            r5.write(r0.f3958);
            r5.write(10);
            r5.write("data=");
            r5.write(android.util.Base64.encodeToString(r0.mo13844(), 2));
            r5.write(10);
            r5.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0238, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0239, code lost:
            r2 = r0;
            r4 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x023c, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x023d, code lost:
            r4 = r5;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x024a A[SYNTHETIC, Splitter:B:106:0x024a] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x025d A[SYNTHETIC, Splitter:B:112:0x025d] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x026f  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0183 A[ExcHandler: all (r0v24 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:38:0x0120] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01c4 A[Catch:{ Exception -> 0x0242 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01c9 A[Catch:{ Exception -> 0x0242 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r17 = this;
                r1 = r17
                com.appsflyer.AFEvent r0 = r1.f4066
                java.util.Map r2 = r0.params()
                com.appsflyer.AFEvent r0 = r1.f4066
                boolean r0 = r0.mo13838()
                com.appsflyer.AFEvent r3 = r1.f4066
                java.lang.String r3 = r3.urlString()
                com.appsflyer.AFEvent r4 = r1.f4066
                int r4 = r4.f3951
                com.appsflyer.AFEvent r5 = r1.f4066
                android.app.Application r5 = r5.context()
                com.appsflyer.AppsFlyerLibCore r6 = com.appsflyer.AppsFlyerLibCore.this
                boolean r6 = r6.isStopped()
                if (r6 == 0) goto L_0x0036
                com.appsflyer.AFEvent r0 = r1.f4066
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.getRequestListener()
                if (r0 == 0) goto L_0x0035
                int r2 = com.appsflyer.attribution.RequestError.STOP_TRACKING
                java.lang.String r3 = com.appsflyer.internal.attribution.RequestErrorMessage.STOP_TRACKING
                r0.onError(r2, r3)
            L_0x0035:
                return
            L_0x0036:
                r6 = 0
                byte[] r7 = new byte[r6]
                r8 = 2
                r9 = 1
                if (r0 == 0) goto L_0x0111
                if (r4 > r8) goto L_0x0111
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.appsflyer.AppsFlyerLibCore r10 = com.appsflyer.AppsFlyerLibCore.this
                com.appsflyer.internal.referrer.Referrer[] r10 = r10.f4044
                if (r10 == 0) goto L_0x00b5
                com.appsflyer.AppsFlyerLibCore r10 = com.appsflyer.AppsFlyerLibCore.this
                com.appsflyer.internal.referrer.Referrer[] r10 = r10.f4044
                int r11 = r10.length
                r12 = 0
            L_0x0054:
                if (r12 >= r11) goto L_0x00b5
                r13 = r10[r12]
                boolean r14 = r13 instanceof com.appsflyer.internal.referrer.GoogleReferrer
                int[] r15 = com.appsflyer.AppsFlyerLibCore.C17218.f4057
                com.appsflyer.internal.referrer.Referrer$State r16 = r13.getState()
                int r16 = r16.ordinal()
                r15 = r15[r16]
                if (r15 == r9) goto L_0x0090
                if (r15 == r8) goto L_0x006b
                goto L_0x00b2
            L_0x006b:
                if (r4 != r8) goto L_0x00b2
                if (r14 != 0) goto L_0x00b2
                java.util.HashMap r14 = new java.util.HashMap
                r14.<init>()
                java.lang.String r15 = "source"
                java.lang.String r13 = r13.getSource()
                r14.put(r15, r13)
                java.lang.String r13 = "response"
                java.lang.String r15 = "TIMEOUT"
                r14.put(r13, r15)
                com.appsflyer.internal.referrer.MandatoryFields r13 = new com.appsflyer.internal.referrer.MandatoryFields
                r13.<init>()
                r14.putAll(r13)
                r0.add(r14)
                goto L_0x00b2
            L_0x0090:
                if (r14 == 0) goto L_0x00ad
                java.lang.String r14 = "rfr"
                r15 = r13
                com.appsflyer.internal.referrer.GoogleReferrer r15 = (com.appsflyer.internal.referrer.GoogleReferrer) r15
                java.util.Map<java.lang.String, java.lang.Object> r15 = r15.oldMap
                r2.put(r14, r15)
                android.content.SharedPreferences r14 = com.appsflyer.AppsFlyerLibCore.getSharedPreferences(r5)
                android.content.SharedPreferences$Editor r14 = r14.edit()
                java.lang.String r15 = "newGPReferrerSent"
                android.content.SharedPreferences$Editor r14 = r14.putBoolean(r15, r9)
                r14.apply()
            L_0x00ad:
                java.util.Map<java.lang.String, java.lang.Object> r13 = r13.map
                r0.add(r13)
            L_0x00b2:
                int r12 = r12 + 1
                goto L_0x0054
            L_0x00b5:
                boolean r4 = r0.isEmpty()
                if (r4 != 0) goto L_0x00c0
                java.lang.String r4 = "referrers"
                r2.put(r4, r0)
            L_0x00c0:
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r0 = r0.f4033
                if (r0 == 0) goto L_0x00d3
                java.lang.String r0 = "fb_ddl"
                com.appsflyer.AppsFlyerLibCore r4 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r4 = r4.f4033
                r2.put(r0, r4)
            L_0x00d3:
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                boolean r0 = r0.m3780()
                if (r0 == 0) goto L_0x00e7
                java.lang.String r0 = "lvl"
                com.appsflyer.AppsFlyerLibCore r4 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r4 = r4.f4041
                r2.put(r0, r4)
                goto L_0x0111
            L_0x00e7:
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                boolean r0 = r0.f4043
                if (r0 == 0) goto L_0x0111
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.util.Map unused = r0.f4041 = r4
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r0 = r0.f4041
                java.lang.String r4 = "error"
                java.lang.String r10 = "operation timed out."
                r0.put(r4, r10)
                java.lang.String r0 = "lvl"
                com.appsflyer.AppsFlyerLibCore r4 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r4 = r4.f4041
                r2.put(r0, r4)
            L_0x0111:
                com.appsflyer.AFEvent r0 = r1.f4066
                boolean r0 = r0 instanceof com.appsflyer.internal.model.event.AdRevenue
                if (r0 != 0) goto L_0x011f
                com.appsflyer.internal.d$c r0 = new com.appsflyer.internal.d$c
                r0.<init>(r2, r5)
                r2.putAll(r0)
            L_0x011f:
                r4 = 0
                com.appsflyer.AFEvent r0 = r1.f4066     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                com.appsflyer.AFEvent r10 = r1.f4066     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                boolean r10 = r10 instanceof com.appsflyer.internal.model.event.AdRevenue     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                if (r10 == 0) goto L_0x0131
                java.lang.String r10 = "af_key"
                java.lang.Object r10 = r2.get(r10)     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                goto L_0x0139
            L_0x0131:
                java.lang.String r10 = "appsflyerKey"
                java.lang.Object r10 = r2.get(r10)     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
            L_0x0139:
                r0.key(r10)     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                monitor-enter(r2)     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                com.appsflyer.AFEvent r0 = r1.f4066     // Catch:{ all -> 0x0180 }
                java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0177 }
                r10[r6] = r0     // Catch:{ all -> 0x0177 }
                r0 = 48
                r11 = 24
                r12 = 32213(0x7dd5, float:4.514E-41)
                java.lang.Object r0 = com.appsflyer.internal.C1753e.m3880(r0, r11, r12)     // Catch:{ all -> 0x0177 }
                java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0177 }
                java.lang.String r11 = "Ι"
                java.lang.Class[] r12 = new java.lang.Class[r9]     // Catch:{ all -> 0x0177 }
                java.lang.Class<com.appsflyer.AFEvent> r13 = com.appsflyer.AFEvent.class
                r12[r6] = r13     // Catch:{ all -> 0x0177 }
                java.lang.reflect.Method r0 = r0.getMethod(r11, r12)     // Catch:{ all -> 0x0177 }
                java.lang.Object r0 = r0.invoke(r4, r10)     // Catch:{ all -> 0x0177 }
                r6 = r0
                byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0177 }
                monitor-exit(r2)     // Catch:{ all -> 0x0174 }
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this     // Catch:{ IOException -> 0x0170, all -> 0x0183 }
                com.appsflyer.AFEvent r2 = r1.f4066     // Catch:{ IOException -> 0x0170, all -> 0x0183 }
                com.appsflyer.AFEvent r2 = r2.post(r6)     // Catch:{ IOException -> 0x0170, all -> 0x0183 }
                com.appsflyer.AppsFlyerLibCore.m3759((com.appsflyer.AppsFlyerLibCore) r0, (com.appsflyer.AFEvent) r2)     // Catch:{ IOException -> 0x0170, all -> 0x0183 }
                return
            L_0x0170:
                r0 = move-exception
                r2 = r0
                r7 = r6
                goto L_0x019f
            L_0x0174:
                r0 = move-exception
                r7 = r6
                goto L_0x0181
            L_0x0177:
                r0 = move-exception
                java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x0180 }
                if (r6 == 0) goto L_0x017f
                throw r6     // Catch:{ all -> 0x0180 }
            L_0x017f:
                throw r0     // Catch:{ all -> 0x0180 }
            L_0x0180:
                r0 = move-exception
            L_0x0181:
                monitor-exit(r2)     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
                throw r0     // Catch:{ IOException -> 0x019d, all -> 0x0183 }
            L_0x0183:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r2, r0, r9)
                com.appsflyer.AFEvent r2 = r1.f4066
                com.appsflyer.attribution.AppsFlyerRequestListener r2 = r2.getRequestListener()
                if (r2 == 0) goto L_0x019c
                int r3 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r0 = r0.getMessage()
                r2.onError(r3, r0)
            L_0x019c:
                return
            L_0x019d:
                r0 = move-exception
                r2 = r0
            L_0x019f:
                java.lang.String r0 = "Exception while sending request to server. "
                com.appsflyer.AFLogger.afErrorLog(r0, r2)
                if (r7 == 0) goto L_0x0267
                if (r5 == 0) goto L_0x0267
                java.lang.String r0 = "&isCachedRequest=true&timeincache="
                boolean r0 = r3.contains(r0)
                if (r0 != 0) goto L_0x0267
                com.appsflyer.internal.C1779w.m3910()
                com.appsflyer.AFFacebookDeferredDeeplink r0 = new com.appsflyer.AFFacebookDeferredDeeplink
                java.lang.String r6 = "6.1.3"
                r0.<init>(r3, r7, r6)
                java.io.File r3 = com.appsflyer.internal.C1779w.m3913((android.content.Context) r5)     // Catch:{ Exception -> 0x0242 }
                boolean r6 = r3.exists()     // Catch:{ Exception -> 0x0242 }
                if (r6 != 0) goto L_0x01c9
                r3.mkdir()     // Catch:{ Exception -> 0x0242 }
                goto L_0x0253
            L_0x01c9:
                java.io.File[] r3 = r3.listFiles()     // Catch:{ Exception -> 0x0242 }
                if (r3 == 0) goto L_0x01db
                int r3 = r3.length     // Catch:{ Exception -> 0x0242 }
                r6 = 40
                if (r3 <= r6) goto L_0x01db
                java.lang.String r0 = "reached cache limit, not caching request"
                com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ Exception -> 0x0242 }
                goto L_0x0253
            L_0x01db:
                java.lang.String r3 = "caching request..."
                com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ Exception -> 0x0242 }
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0242 }
                java.io.File r5 = com.appsflyer.internal.C1779w.m3913((android.content.Context) r5)     // Catch:{ Exception -> 0x0242 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0242 }
                java.lang.String r6 = java.lang.Long.toString(r6)     // Catch:{ Exception -> 0x0242 }
                r3.<init>(r5, r6)     // Catch:{ Exception -> 0x0242 }
                r3.createNewFile()     // Catch:{ Exception -> 0x0242 }
                java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0242 }
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0242 }
                java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0242 }
                r6.<init>(r3, r9)     // Catch:{ Exception -> 0x0242 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x0242 }
                java.lang.String r3 = "version="
                r5.write(r3)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                java.lang.String r3 = r0.f3961     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                r5.write(r3)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                r3 = 10
                r5.write(r3)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                java.lang.String r4 = "url="
                r5.write(r4)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                java.lang.String r4 = r0.f3958     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                r5.write(r4)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                r5.write(r3)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                java.lang.String r4 = "data="
                r5.write(r4)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                byte[] r0 = r0.mo13844()     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                r5.write(r0)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                r5.write(r3)     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                r5.flush()     // Catch:{ Exception -> 0x023c, all -> 0x0238 }
                r5.close()     // Catch:{ IOException -> 0x024e }
                goto L_0x0253
            L_0x0238:
                r0 = move-exception
                r2 = r0
                r4 = r5
                goto L_0x025b
            L_0x023c:
                r0 = move-exception
                r4 = r5
                goto L_0x0243
            L_0x023f:
                r0 = move-exception
                r2 = r0
                goto L_0x025b
            L_0x0242:
                r0 = move-exception
            L_0x0243:
                java.lang.String r3 = "Could not cache request"
                com.appsflyer.AFLogger.afErrorLog(r3, r0)     // Catch:{ all -> 0x023f }
                if (r4 == 0) goto L_0x0253
                r4.close()     // Catch:{ IOException -> 0x024e }
                goto L_0x0253
            L_0x024e:
                r0 = move-exception
                r3 = r0
                com.appsflyer.AFLogger.afErrorLog(r3)
            L_0x0253:
                java.lang.String r0 = r2.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r0, r2)
                goto L_0x0267
            L_0x025b:
                if (r4 == 0) goto L_0x0266
                r4.close()     // Catch:{ IOException -> 0x0261 }
                goto L_0x0266
            L_0x0261:
                r0 = move-exception
                r3 = r0
                com.appsflyer.AFLogger.afErrorLog(r3)
            L_0x0266:
                throw r2
            L_0x0267:
                com.appsflyer.AFEvent r0 = r1.f4066
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.getRequestListener()
                if (r0 == 0) goto L_0x0278
                int r3 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r4 = r2.getMessage()
                r0.onError(r3, r4)
            L_0x0278:
                java.lang.String r0 = r2.getMessage()
                com.appsflyer.AppsFlyerLibCore.InstallAttributionIdFetcher.m3810(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C1722c.run():void");
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$8 */
    static /* synthetic */ class C17218 {

        /* renamed from: ǃ */
        static final /* synthetic */ int[] f4057;

        /* renamed from: ι */
        static final /* synthetic */ int[] f4058;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.appsflyer.internal.referrer.Referrer$State[] r0 = com.appsflyer.internal.referrer.Referrer.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4057 = r0
                r1 = 1
                com.appsflyer.internal.referrer.Referrer$State r2 = com.appsflyer.internal.referrer.Referrer.State.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4057     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.referrer.Referrer$State r3 = com.appsflyer.internal.referrer.Referrer.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f4058 = r2
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r3 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f4058     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C17218.<clinit>():void");
        }
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getValue();
            String str2 = (String) next.getKey();
            char c = 65535;
            switch (str2.hashCode()) {
                case -1407250527:
                    if (str2.equals("launches")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1184318185:
                    if (str2.equals("inapps")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1084269027:
                    if (str2.equals("conversions")) {
                        c = 0;
                        break;
                    }
                    break;
                case -690213213:
                    if (str2.equals("register")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3004913:
                    if (str2.equals("attr")) {
                        c = 1;
                        break;
                    }
                    break;
                case 57793177:
                    if (str2.equals("adrevenue")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757599:
                    if (str2.equals("stats")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    FIRST_LAUNCHES_URL = str;
                    break;
                case 1:
                    REFERRER_TRACKING_URL = str;
                    break;
                case 2:
                    f4013 = str;
                    break;
                case 3:
                    f4014 = str;
                    break;
                case 4:
                    REGISTER_URL = str;
                    break;
                case 5:
                    f4016 = str;
                    break;
                case 6:
                    f4017 = str;
                    break;
            }
        }
    }

    public static class InstallAttributionIdFetcher implements Runnable {
        public static String CONVERSION_DATA_URL = "https://%sgcdsdk.%s/install_data/v4.0/";

        /* renamed from: Ι */
        private static final List<String> f4059 = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});

        /* renamed from: ı */
        private final Application f4060;

        /* renamed from: ǃ */
        private final String f4061;

        /* renamed from: ɩ */
        private final AtomicInteger f4062;

        /* renamed from: ɹ */
        private final int f4063;

        /* renamed from: ι */
        final ScheduledExecutorService f4064;

        /* renamed from: і */
        private AppsFlyerLibCore f4065;

        /* synthetic */ InstallAttributionIdFetcher(AppsFlyerLibCore appsFlyerLibCore, Application application, String str, byte b) {
            this(appsFlyerLibCore, application, str);
        }

        private InstallAttributionIdFetcher(AppsFlyerLibCore appsFlyerLibCore, Application application, String str) {
            this.f4064 = AFExecutor.getInstance().mo13841();
            this.f4062 = new AtomicInteger(0);
            this.f4065 = appsFlyerLibCore;
            this.f4060 = application;
            this.f4061 = str;
            this.f4063 = 0;
        }

        private InstallAttributionIdFetcher(InstallAttributionIdFetcher installAttributionIdFetcher) {
            this.f4064 = AFExecutor.getInstance().mo13841();
            this.f4062 = new AtomicInteger(0);
            this.f4065 = installAttributionIdFetcher.f4065;
            this.f4060 = installAttributionIdFetcher.f4060;
            this.f4061 = installAttributionIdFetcher.f4061;
            this.f4063 = installAttributionIdFetcher.f4063 + 1;
        }

        public static void setUrl(Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                if ("gcdsdk".equals(next.getKey())) {
                    CONVERSION_DATA_URL = (String) next.getValue();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x02d7 A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0130 A[Catch:{ v -> 0x0271, all -> 0x029c }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01a6 A[Catch:{ v -> 0x0271, all -> 0x029c }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0298  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x02a4 A[Catch:{ all -> 0x02e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x02b1 A[Catch:{ all -> 0x02e5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r0 = "is_first_launch"
                java.lang.String r2 = "af_siteid"
                java.lang.String r3 = r1.f4061
                java.lang.String r4 = "[GCD-A02] Calling onConversionFailure with:\n"
                if (r3 == 0) goto L_0x02f1
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0014
                goto L_0x02f1
            L_0x0014:
                com.appsflyer.AppsFlyerLibCore r3 = r1.f4065
                boolean r3 = r3.isStopped()
                if (r3 == 0) goto L_0x0034
                java.lang.String r0 = "[GCD-E03] 'isStopTracking' enabled"
                com.appsflyer.AFLogger.afDebugLog(r0)
                java.lang.String r0 = "'isStopTracking' enabled"
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener
                if (r2 == 0) goto L_0x0033
                java.lang.String r2 = r4.concat(r0)
                com.appsflyer.AFLogger.afDebugLog(r2)
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener
                r2.onConversionDataFail(r0)
            L_0x0033:
                return
            L_0x0034:
                java.util.concurrent.atomic.AtomicInteger r3 = r1.f4062
                r3.incrementAndGet()
                r3 = 0
                r5 = 2
                android.app.Application r6 = r1.f4060     // Catch:{ all -> 0x029f }
                if (r6 != 0) goto L_0x005c
                java.lang.String r0 = "[GCD-E06] Context null"
                com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x029f }
                java.lang.String r0 = "Context null"
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x029f }
                if (r2 == 0) goto L_0x0056
                java.lang.String r2 = r4.concat(r0)     // Catch:{ all -> 0x029f }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x029f }
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x029f }
                r2.onConversionDataFail(r0)     // Catch:{ all -> 0x029f }
            L_0x0056:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f4062
                r0.decrementAndGet()
                return
            L_0x005c:
                android.app.Application r6 = r1.f4060     // Catch:{ all -> 0x029f }
                com.appsflyer.AppsFlyerLibCore r7 = r1.f4065     // Catch:{ all -> 0x029f }
                android.app.Application r8 = r1.f4060     // Catch:{ all -> 0x029f }
                java.lang.String r7 = r7.getConfiguredChannel(r8)     // Catch:{ all -> 0x029f }
                java.lang.String r6 = com.appsflyer.AppsFlyerLibCore.m3789((android.content.Context) r6, (java.lang.String) r7)     // Catch:{ all -> 0x029f }
                java.lang.String r7 = ""
                r8 = 0
                r9 = 1
                if (r6 == 0) goto L_0x0094
                java.util.List<java.lang.String> r10 = f4059     // Catch:{ all -> 0x029f }
                java.lang.String r11 = r6.toLowerCase()     // Catch:{ all -> 0x029f }
                boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x029f }
                if (r10 != 0) goto L_0x0087
                java.lang.String r10 = "-"
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x029f }
                java.lang.String r6 = r10.concat(r6)     // Catch:{ all -> 0x029f }
                goto L_0x0095
            L_0x0087:
                java.lang.String r10 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
                java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x029f }
                r11[r8] = r6     // Catch:{ all -> 0x029f }
                java.lang.String r6 = java.lang.String.format(r10, r11)     // Catch:{ all -> 0x029f }
                com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ all -> 0x029f }
            L_0x0094:
                r6 = r7
            L_0x0095:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
                r10.<init>()     // Catch:{ all -> 0x029f }
                java.lang.String r11 = CONVERSION_DATA_URL     // Catch:{ all -> 0x029f }
                java.lang.String r11 = com.appsflyer.ServerConfigHandler.getUrl(r11)     // Catch:{ all -> 0x029f }
                r10.append(r11)     // Catch:{ all -> 0x029f }
                android.app.Application r11 = r1.f4060     // Catch:{ all -> 0x029f }
                java.lang.String r11 = r11.getPackageName()     // Catch:{ all -> 0x029f }
                r10.append(r11)     // Catch:{ all -> 0x029f }
                r10.append(r6)     // Catch:{ all -> 0x029f }
                java.lang.String r6 = "?devkey="
                r10.append(r6)     // Catch:{ all -> 0x029f }
                java.lang.String r6 = r1.f4061     // Catch:{ all -> 0x029f }
                r10.append(r6)     // Catch:{ all -> 0x029f }
                java.lang.String r6 = "&device_id="
                r10.append(r6)     // Catch:{ all -> 0x029f }
                java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x029f }
                android.app.Application r11 = r1.f4060     // Catch:{ all -> 0x029f }
                r6.<init>(r11)     // Catch:{ all -> 0x029f }
                java.lang.String r6 = com.appsflyer.internal.C1777u.m3909(r6)     // Catch:{ all -> 0x029f }
                r10.append(r6)     // Catch:{ all -> 0x029f }
                java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x029f }
                com.appsflyer.internal.aa r10 = com.appsflyer.internal.C1740aa.m3833()     // Catch:{ all -> 0x029f }
                java.lang.String r11 = "server_request"
                java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch:{ all -> 0x029f }
                r10.mo14060(r11, r6, r7)     // Catch:{ all -> 0x029f }
                java.lang.String r7 = "[GCD-B01] URL: "
                java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x029f }
                java.lang.String r7 = r7.concat(r10)     // Catch:{ all -> 0x029f }
                com.appsflyer.internal.C1741ab.m3849(r7)     // Catch:{ all -> 0x029f }
                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029f }
                java.net.URL r7 = new java.net.URL     // Catch:{ all -> 0x029f }
                r7.<init>(r6)     // Catch:{ all -> 0x029f }
                java.net.URLConnection r7 = r7.openConnection()     // Catch:{ all -> 0x029f }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x029f }
                java.lang.String r3 = "GET"
                r7.setRequestMethod(r3)     // Catch:{ all -> 0x029c }
                r3 = 10000(0x2710, float:1.4013E-41)
                r7.setConnectTimeout(r3)     // Catch:{ all -> 0x029c }
                java.lang.String r3 = "Connection"
                java.lang.String r12 = "close"
                r7.setRequestProperty(r3, r12)     // Catch:{ all -> 0x029c }
                r7.connect()     // Catch:{ all -> 0x029c }
                int r3 = r7.getResponseCode()     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerLibCore r12 = r1.f4065     // Catch:{ all -> 0x029c }
                java.lang.String r12 = r12.readServerResponse(r7)     // Catch:{ all -> 0x029c }
                com.appsflyer.internal.aa r13 = com.appsflyer.internal.C1740aa.m3833()     // Catch:{ all -> 0x029c }
                java.lang.String r14 = "server_response"
                java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ all -> 0x029c }
                java.lang.String r16 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x029c }
                r15[r8] = r16     // Catch:{ all -> 0x029c }
                r15[r9] = r12     // Catch:{ all -> 0x029c }
                r13.mo14060(r14, r6, r15)     // Catch:{ all -> 0x029c }
                r6 = 200(0xc8, float:2.8E-43)
                r13 = 404(0x194, float:5.66E-43)
                if (r3 == r6) goto L_0x016d
                if (r3 != r13) goto L_0x0133
                goto L_0x016d
            L_0x0133:
                r0 = 403(0x193, float:5.65E-43)
                if (r3 == r0) goto L_0x013b
                r0 = 500(0x1f4, float:7.0E-43)
                if (r3 < r0) goto L_0x014d
            L_0x013b:
                int r0 = r1.f4063     // Catch:{ all -> 0x029c }
                if (r0 >= r5) goto L_0x014d
                com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher r0 = new com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher     // Catch:{ all -> 0x029c }
                r0.<init>(r1)     // Catch:{ all -> 0x029c }
                java.util.concurrent.ScheduledExecutorService r2 = r0.f4064     // Catch:{ all -> 0x029c }
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerLibCore.m3779(r2, r0, 10, r3)     // Catch:{ all -> 0x029c }
                goto L_0x0291
            L_0x014d:
                java.lang.String r0 = "Error connection to server: "
                java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x029c }
                java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x029c }
                if (r2 == 0) goto L_0x0291
                java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x029c }
                java.lang.String r2 = r4.concat(r2)     // Catch:{ all -> 0x029c }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x029c }
                r2.onConversionDataFail(r0)     // Catch:{ all -> 0x029c }
                goto L_0x0291
            L_0x016d:
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x029c }
                r6.<init>()     // Catch:{ all -> 0x029c }
                java.lang.String r14 = "net"
                long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029c }
                long r10 = r15 - r10
                r6.put(r14, r10)     // Catch:{ all -> 0x029c }
                java.lang.String r10 = "retries"
                int r11 = r1.f4063     // Catch:{ all -> 0x029c }
                r6.put(r10, r11)     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerLibCore r10 = com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x029c }
                com.appsflyer.internal.EventDataCollector r10 = r10.eventDataCollector     // Catch:{ all -> 0x029c }
                java.lang.String r11 = "gcd"
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x029c }
                r10.set((java.lang.String) r11, (java.lang.String) r6)     // Catch:{ all -> 0x029c }
                java.lang.String r6 = "Attribution data: "
                java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x029c }
                java.lang.String r6 = r6.concat(r10)     // Catch:{ all -> 0x029c }
                com.appsflyer.internal.C1741ab.m3849(r6)     // Catch:{ all -> 0x029c }
                int r6 = r12.length()     // Catch:{ all -> 0x029c }
                if (r6 <= 0) goto L_0x0291
                java.util.Map r6 = com.appsflyer.AppsFlyerLibCore.m3775((java.lang.String) r12)     // Catch:{ all -> 0x029c }
                java.lang.String r10 = "iscache"
                java.lang.Object r10 = r6.get(r10)     // Catch:{ all -> 0x029c }
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x029c }
                if (r3 != r13) goto L_0x01cc
                java.lang.String r3 = "error_reason"
                r6.remove(r3)     // Catch:{ all -> 0x029c }
                java.lang.String r3 = "status_code"
                r6.remove(r3)     // Catch:{ all -> 0x029c }
                java.lang.String r3 = "af_status"
                java.lang.String r11 = "Organic"
                r6.put(r3, r11)     // Catch:{ all -> 0x029c }
                java.lang.String r3 = "af_message"
                java.lang.String r11 = "organic install"
                r6.put(r3, r11)     // Catch:{ all -> 0x029c }
            L_0x01cc:
                if (r10 == 0) goto L_0x01df
                boolean r3 = r10.booleanValue()     // Catch:{ all -> 0x029c }
                if (r3 != 0) goto L_0x01df
                android.app.Application r3 = r1.f4060     // Catch:{ all -> 0x029c }
                java.lang.String r10 = "appsflyerConversionDataCacheExpiration"
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerLibCore.m3744((android.content.Context) r3, (java.lang.String) r10, (long) r13)     // Catch:{ all -> 0x029c }
            L_0x01df:
                boolean r3 = r6.containsKey(r2)     // Catch:{ all -> 0x029c }
                java.lang.String r10 = "[Invite] Detected App-Invite via channel: "
                java.lang.String r11 = "af_channel"
                if (r3 == 0) goto L_0x0214
                boolean r3 = r6.containsKey(r11)     // Catch:{ all -> 0x029c }
                if (r3 == 0) goto L_0x0203
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x029c }
                r3.<init>(r10)     // Catch:{ all -> 0x029c }
                java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x029c }
                r3.append(r13)     // Catch:{ all -> 0x029c }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x029c }
                com.appsflyer.AFLogger.afDebugLog(r3)     // Catch:{ all -> 0x029c }
                goto L_0x0214
            L_0x0203:
                java.lang.String r3 = "[CrossPromotion] App was installed via %s's Cross Promotion"
                java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ all -> 0x029c }
                java.lang.Object r14 = r6.get(r2)     // Catch:{ all -> 0x029c }
                r13[r8] = r14     // Catch:{ all -> 0x029c }
                java.lang.String r3 = java.lang.String.format(r3, r13)     // Catch:{ all -> 0x029c }
                com.appsflyer.AFLogger.afDebugLog(r3)     // Catch:{ all -> 0x029c }
            L_0x0214:
                boolean r2 = r6.containsKey(r2)     // Catch:{ all -> 0x029c }
                if (r2 == 0) goto L_0x022d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x029c }
                r2.<init>(r10)     // Catch:{ all -> 0x029c }
                java.lang.Object r3 = r6.get(r11)     // Catch:{ all -> 0x029c }
                r2.append(r3)     // Catch:{ all -> 0x029c }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x029c }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x029c }
            L_0x022d:
                java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x029c }
                r6.put(r0, r2)     // Catch:{ all -> 0x029c }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x029c }
                r2.<init>(r6)     // Catch:{ all -> 0x029c }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x029c }
                java.lang.String r3 = "attributionId"
                if (r2 == 0) goto L_0x0245
                android.app.Application r10 = r1.f4060     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerLibCore.m3757(r10, r3, r2)     // Catch:{ all -> 0x029c }
                goto L_0x024a
            L_0x0245:
                android.app.Application r2 = r1.f4060     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerLibCore.m3757(r2, r3, r12)     // Catch:{ all -> 0x029c }
            L_0x024a:
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x029c }
                if (r2 == 0) goto L_0x0291
                java.util.concurrent.atomic.AtomicInteger r2 = r1.f4062     // Catch:{ all -> 0x029c }
                int r2 = r2.intValue()     // Catch:{ all -> 0x029c }
                if (r2 > r9) goto L_0x0291
                android.app.Application r2 = r1.f4060     // Catch:{ v -> 0x0271 }
                java.util.Map r2 = com.appsflyer.AppsFlyerLibCore.m3742((android.content.Context) r2)     // Catch:{ v -> 0x0271 }
                android.app.Application r3 = r1.f4060     // Catch:{ v -> 0x0271 }
                android.content.SharedPreferences r3 = com.appsflyer.AppsFlyerLibCore.getSharedPreferences(r3)     // Catch:{ v -> 0x0271 }
                java.lang.String r9 = "sixtyDayConversionData"
                boolean r3 = r3.getBoolean(r9, r8)     // Catch:{ v -> 0x0271 }
                if (r3 != 0) goto L_0x026f
                java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ v -> 0x0271 }
                r2.put(r0, r3)     // Catch:{ v -> 0x0271 }
            L_0x026f:
                r6 = r2
                goto L_0x0277
            L_0x0271:
                r0 = move-exception
                java.lang.String r2 = "Exception while trying to fetch attribution data. "
                com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ all -> 0x029c }
            L_0x0277:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x029c }
                java.lang.String r2 = "[GCD-A02] Calling onConversionDataSuccess with:\n"
                r0.<init>(r2)     // Catch:{ all -> 0x029c }
                java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x029c }
                r0.append(r2)     // Catch:{ all -> 0x029c }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x029c }
                com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x029c }
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x029c }
                r0.onConversionDataSuccess(r6)     // Catch:{ all -> 0x029c }
            L_0x0291:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f4062
                r0.decrementAndGet()
                if (r7 == 0) goto L_0x02da
                r7.disconnect()
                goto L_0x02da
            L_0x029c:
                r0 = move-exception
                r3 = r7
                goto L_0x02a0
            L_0x029f:
                r0 = move-exception
            L_0x02a0:
                int r2 = r1.f4063     // Catch:{ all -> 0x02e5 }
                if (r2 >= r5) goto L_0x02b1
                com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher r2 = new com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher     // Catch:{ all -> 0x02e5 }
                r2.<init>(r1)     // Catch:{ all -> 0x02e5 }
                java.util.concurrent.ScheduledExecutorService r4 = r2.f4064     // Catch:{ all -> 0x02e5 }
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02e5 }
                com.appsflyer.AppsFlyerLibCore.m3779(r4, r2, 10, r5)     // Catch:{ all -> 0x02e5 }
                goto L_0x02c9
            L_0x02b1:
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02e5 }
                com.appsflyer.AppsFlyerConversionListener r5 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x02e5 }
                if (r5 == 0) goto L_0x02c9
                java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x02e5 }
                java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x02e5 }
                com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x02e5 }
                com.appsflyer.AppsFlyerConversionListener r4 = com.appsflyer.AppsFlyerLibCore.conversionDataListener     // Catch:{ all -> 0x02e5 }
                r4.onConversionDataFail(r2)     // Catch:{ all -> 0x02e5 }
            L_0x02c9:
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02e5 }
                com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ all -> 0x02e5 }
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f4062
                r0.decrementAndGet()
                if (r3 == 0) goto L_0x02da
                r3.disconnect()
            L_0x02da:
                java.util.concurrent.ScheduledExecutorService r0 = r1.f4064
                r0.shutdown()
                java.lang.String r0 = "[GCD-A03] Server retrieving attempt finished"
                com.appsflyer.AFLogger.afDebugLog(r0)
                return
            L_0x02e5:
                r0 = move-exception
                java.util.concurrent.atomic.AtomicInteger r2 = r1.f4062
                r2.decrementAndGet()
                if (r3 == 0) goto L_0x02f0
                r3.disconnect()
            L_0x02f0:
                throw r0
            L_0x02f1:
                java.lang.String r0 = "[GCD-E05] AppsFlyer dev key is missing"
                com.appsflyer.AFLogger.afDebugLog(r0)
                java.lang.String r0 = "AppsFlyer dev key is missing"
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener
                if (r2 == 0) goto L_0x0308
                java.lang.String r2 = r4.concat(r0)
                com.appsflyer.AFLogger.afDebugLog(r2)
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.conversionDataListener
                r2.onConversionDataFail(r0)
            L_0x0308:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.InstallAttributionIdFetcher.run():void");
        }

        /* renamed from: ɩ */
        static /* synthetic */ void m3809(Map map) {
            StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            AFLogger.afDebugLog(sb.toString());
            AppsFlyerLibCore.conversionDataListener.onConversionDataSuccess(map);
        }

        /* renamed from: ι */
        static /* synthetic */ void m3810(String str) {
            if (AppsFlyerLibCore.conversionDataListener != null) {
                AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
                AppsFlyerLibCore.conversionDataListener.onConversionDataFail(str);
            }
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$d */
    class C1723d implements Runnable {

        /* renamed from: ı */
        private final Application f4068;

        public C1723d(Context context) {
            this.f4068 = (Application) context.getApplicationContext();
        }

        public final void run() {
            if (!AppsFlyerLibCore.this.f4042) {
                AppsFlyerLibCore.this.f4038 = System.currentTimeMillis();
                boolean unused = AppsFlyerLibCore.this.f4042 = true;
                try {
                    String r1 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                    C1779w.m3910();
                    for (AFFacebookDeferredDeeplink next : C1779w.m3911(this.f4068)) {
                        StringBuilder sb = new StringBuilder("resending request: ");
                        sb.append(next.f3958);
                        AFLogger.afInfoLog(sb.toString());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            long parseLong = Long.parseLong(next.f3959, 10);
                            AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                            CachedEvent cachedEvent = new CachedEvent();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(next.f3958);
                            sb2.append("&isCachedRequest=true&timeincache=");
                            sb2.append((currentTimeMillis - parseLong) / 1000);
                            AFEvent context = cachedEvent.urlString(sb2.toString()).post(next.mo13844()).key(r1).context(this.f4068);
                            context.f3941 = next.f3959;
                            context.f3949 = false;
                            AppsFlyerLibCore.m3759(appsFlyerLibCore, context);
                        } catch (Exception e) {
                            AFLogger.afErrorLog("Failed to resend cached request", e);
                        }
                    }
                } catch (Exception e2) {
                    AFLogger.afErrorLog("failed to check cache. ", e2);
                } catch (Throwable th) {
                    boolean unused2 = AppsFlyerLibCore.this.f4042 = false;
                    throw th;
                }
                boolean unused3 = AppsFlyerLibCore.this.f4042 = false;
                AppsFlyerLibCore.this.f4020.shutdown();
                ScheduledExecutorService unused4 = AppsFlyerLibCore.this.f4020 = null;
            }
        }
    }

    /* renamed from: Ι */
    private void m3777(AFEvent aFEvent) {
        boolean z = aFEvent.f3939 == null;
        if (m3792()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (m3746()) {
                AppsFlyerRequestListener requestListener = aFEvent.getRequestListener();
                if (requestListener != null) {
                    requestListener.onError(RequestError.EVENT_TIMEOUT, RequestErrorMessage.EVENT_TIMEOUT);
                    return;
                }
                return;
            }
            this.f4045 = System.currentTimeMillis();
        }
        m3779(AFExecutor.getInstance().mo13841(), new C1724e(this, aFEvent, (byte) 0), 0, TimeUnit.MILLISECONDS);
    }

    /* renamed from: ǃ */
    private static void m3758(Context context, Map<String, ? super String> map) {
        C1774t tVar = C1774t.C1776e.f4250;
        C1774t.C1775d r2 = C1774t.m3907(context);
        map.put(ServerParameters.NETWORK, r2.f4247);
        if (r2.f4249 != null) {
            map.put(ServerParameters.OPERATOR, r2.f4249);
        }
        if (r2.f4248 != null) {
            map.put(ServerParameters.CARRIER, r2.f4248);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:38|39|40|41|42|43|44|45|(2:47|48)|49|50|(6:(1:54)|(1:56)|(1:58)(2:59|(2:61|(1:63)(2:64|(1:66))))|67|(2:69|(1:71))|72)(1:(1:74))|75|76|(3:78|79|(1:81))|82|(1:(1:88)(1:(2:110|(1:112))(3:95|96|(5:98|99|100|(1:102)|103))))(1:86)|(2:114|135)(1:136)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c8 */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0294 A[SYNTHETIC, Splitter:B:122:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010c A[ADDED_TO_REGION, Catch:{ v -> 0x0272, all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a4 A[Catch:{ v -> 0x0272, all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e0 A[SYNTHETIC, Splitter:B:78:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023b A[Catch:{ v -> 0x0272, all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0241 A[Catch:{ v -> 0x0272, all -> 0x00a2 }] */
    /* renamed from: ɩ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3768(com.appsflyer.AFEvent r24) throws java.io.IOException {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.String r2 = "is_first_launch"
            java.lang.String r3 = "appsflyerConversionDataCacheExpiration"
            java.net.URL r4 = new java.net.URL
            java.lang.String r5 = r0.f3945
            r4.<init>(r5)
            byte[] r5 = r24.mo13839()
            java.lang.String r6 = r24.key()
            java.lang.String r7 = r0.f3941
            boolean r8 = r24.mo13838()
            android.app.Application r9 = r24.context()
            com.appsflyer.attribution.AppsFlyerRequestListener r10 = r24.getRequestListener()
            r11 = 1
            if (r8 == 0) goto L_0x002e
            com.appsflyer.AppsFlyerConversionListener r13 = conversionDataListener
            if (r13 == 0) goto L_0x002e
            r13 = 1
            goto L_0x002f
        L_0x002e:
            r13 = 0
        L_0x002f:
            if (r8 == 0) goto L_0x0039
            int r14 = r0.f3951
            if (r14 != r11) goto L_0x0039
            r16 = r13
            r14 = 1
            goto L_0x003c
        L_0x0039:
            r16 = r13
            r14 = 0
        L_0x003c:
            if (r14 == 0) goto L_0x0056
            org.json.JSONObject r15 = r1.f4040     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r12 = "from_fg"
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0051 }
            r20 = r12
            long r11 = r1.f4021     // Catch:{ JSONException -> 0x0051 }
            long r11 = r18 - r11
            r13 = r20
            r15.put(r13, r11)     // Catch:{ JSONException -> 0x0051 }
        L_0x0051:
            long r11 = java.lang.System.currentTimeMillis()
            goto L_0x0058
        L_0x0056:
            r11 = 0
        L_0x0058:
            java.net.URLConnection r13 = r4.openConnection()     // Catch:{ all -> 0x02a0 }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ all -> 0x02a0 }
            java.lang.String r15 = "POST"
            r13.setRequestMethod(r15)     // Catch:{ all -> 0x029c }
            int r15 = r5.length     // Catch:{ all -> 0x029c }
            r20 = r2
            java.lang.String r2 = "Content-Length"
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x029c }
            r13.setRequestProperty(r2, r15)     // Catch:{ all -> 0x029c }
            java.lang.String r2 = "Content-Type"
            boolean r15 = r24.isEncrypt()     // Catch:{ all -> 0x029c }
            if (r15 == 0) goto L_0x007e
            java.lang.String r15 = "application/octet-stream"
            goto L_0x0080
        L_0x007a:
            r0 = move-exception
            r15 = r13
            goto L_0x02a3
        L_0x007e:
            java.lang.String r15 = "application/json"
        L_0x0080:
            r13.setRequestProperty(r2, r15)     // Catch:{ all -> 0x029c }
            r2 = 10000(0x2710, float:1.4013E-41)
            r13.setConnectTimeout(r2)     // Catch:{ all -> 0x029c }
            r2 = 1
            r13.setDoOutput(r2)     // Catch:{ all -> 0x029c }
            com.appsflyer.AppsFlyerProperties r15 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x029c }
            r18 = r13
            java.lang.String r13 = "http_cache"
            boolean r15 = r15.getBoolean(r13, r2)     // Catch:{ all -> 0x0298 }
            r2 = r18
            if (r15 != 0) goto L_0x00a5
            r15 = 0
            r2.setUseCaches(r15)     // Catch:{ all -> 0x00a2 }
            r13 = 0
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            goto L_0x029e
        L_0x00a5:
            r13 = 0
        L_0x00a6:
            java.io.DataOutputStream r15 = new java.io.DataOutputStream     // Catch:{ all -> 0x028f }
            java.io.OutputStream r13 = r2.getOutputStream()     // Catch:{ all -> 0x028c }
            r15.<init>(r13)     // Catch:{ all -> 0x028c }
            r15.write(r5)     // Catch:{ all -> 0x028a }
            r15.close()     // Catch:{ all -> 0x00a2 }
            int r5 = r2.getResponseCode()     // Catch:{ all -> 0x00a2 }
            if (r14 == 0) goto L_0x00c8
            org.json.JSONObject r13 = r1.f4040     // Catch:{ JSONException -> 0x00c8 }
            java.lang.String r14 = "net"
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00c8 }
            long r11 = r21 - r11
            r13.put(r14, r11)     // Catch:{ JSONException -> 0x00c8 }
        L_0x00c8:
            com.appsflyer.internal.EventDataCollector r11 = r1.eventDataCollector(r9)     // Catch:{ all -> 0x00a2 }
            java.lang.String r12 = "first_launch"
            org.json.JSONObject r13 = r1.f4040     // Catch:{ all -> 0x00a2 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00a2 }
            r11.set((java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x00a2 }
            java.lang.String r11 = r1.readServerResponse(r2)     // Catch:{ all -> 0x00a2 }
            com.appsflyer.internal.aa r12 = com.appsflyer.internal.C1740aa.m3833()     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00a2 }
            java.lang.String r13 = "server_response"
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ all -> 0x00a2 }
            java.lang.String r15 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00a2 }
            r17 = 0
            r14[r17] = r15     // Catch:{ all -> 0x00a2 }
            r17 = 1
            r14[r17] = r11     // Catch:{ all -> 0x00a2 }
            r12.mo14060(r13, r4, r14)     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = "response code: "
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = r4.concat(r12)     // Catch:{ all -> 0x00a2 }
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences r4 = getSharedPreferences(r9)     // Catch:{ all -> 0x00a2 }
            r12 = 200(0xc8, float:2.8E-43)
            if (r5 != r12) goto L_0x01a4
            if (r9 == 0) goto L_0x0116
            if (r8 == 0) goto L_0x0116
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a2 }
            r1.f4031 = r12     // Catch:{ all -> 0x00a2 }
        L_0x0116:
            if (r10 == 0) goto L_0x011b
            r10.onSuccess()     // Catch:{ all -> 0x00a2 }
        L_0x011b:
            if (r7 == 0) goto L_0x0124
            com.appsflyer.internal.C1779w.m3910()     // Catch:{ all -> 0x00a2 }
            com.appsflyer.internal.C1779w.m3914(r7, r9)     // Catch:{ all -> 0x00a2 }
            goto L_0x0164
        L_0x0124:
            java.lang.String r5 = "sentSuccessfully"
            java.lang.String r7 = "true"
            android.content.SharedPreferences r8 = getSharedPreferences(r9)     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x00a2 }
            r8.putString(r5, r7)     // Catch:{ all -> 0x00a2 }
            r8.apply()     // Catch:{ all -> 0x00a2 }
            boolean r5 = r1.f4042     // Catch:{ all -> 0x00a2 }
            if (r5 != 0) goto L_0x0164
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a2 }
            long r12 = r1.f4038     // Catch:{ all -> 0x00a2 }
            long r7 = r7 - r12
            r12 = 15000(0x3a98, double:7.411E-320)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 >= 0) goto L_0x0148
            goto L_0x0164
        L_0x0148:
            java.util.concurrent.ScheduledExecutorService r5 = r1.f4020     // Catch:{ all -> 0x00a2 }
            if (r5 != 0) goto L_0x0164
            com.appsflyer.AFExecutor r5 = com.appsflyer.AFExecutor.getInstance()     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r5.mo13841()     // Catch:{ all -> 0x00a2 }
            r1.f4020 = r5     // Catch:{ all -> 0x00a2 }
            com.appsflyer.AppsFlyerLibCore$d r5 = new com.appsflyer.AppsFlyerLibCore$d     // Catch:{ all -> 0x00a2 }
            r5.<init>(r9)     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.ScheduledExecutorService r7 = r1.f4020     // Catch:{ all -> 0x00a2 }
            r12 = 1
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a2 }
            m3779(r7, r5, r12, r8)     // Catch:{ all -> 0x00a2 }
        L_0x0164:
            java.lang.String r5 = "afUninstallToken"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ all -> 0x00a2 }
            if (r5 == 0) goto L_0x0196
            java.lang.String r7 = "Uninstall Token exists: "
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x00a2 }
            com.appsflyer.AFLogger.afDebugLog(r7)     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = "sentRegisterRequestToAF"
            r8 = 0
            boolean r7 = r4.getBoolean(r7, r8)     // Catch:{ all -> 0x00a2 }
            if (r7 != 0) goto L_0x0196
            java.lang.String r7 = "Resending Uninstall token to AF servers: "
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x00a2 }
            com.appsflyer.AFLogger.afDebugLog(r7)     // Catch:{ all -> 0x00a2 }
            com.appsflyer.internal.C1743ad.m3850(r9, r5)     // Catch:{ all -> 0x00a2 }
        L_0x0196:
            org.json.JSONObject r5 = com.appsflyer.ServerConfigHandler.m3815(r11)     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = "send_background"
            r8 = 0
            boolean r5 = r5.optBoolean(r7, r8)     // Catch:{ all -> 0x00a2 }
            r1.f4027 = r5     // Catch:{ all -> 0x00a2 }
            goto L_0x01c1
        L_0x01a4:
            if (r10 == 0) goto L_0x01c1
            int r7 = com.appsflyer.attribution.RequestError.RESPONSE_CODE_FAILURE     // Catch:{ all -> 0x00a2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r8.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.String r11 = com.appsflyer.internal.attribution.RequestErrorMessage.RESPONSE_CODE_FAILURE     // Catch:{ all -> 0x00a2 }
            r8.append(r11)     // Catch:{ all -> 0x00a2 }
            java.lang.String r11 = " "
            r8.append(r11)     // Catch:{ all -> 0x00a2 }
            r8.append(r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x00a2 }
            r10.onError(r7, r5)     // Catch:{ all -> 0x00a2 }
        L_0x01c1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = "[GCD-A01] Loading conversion data. Counter: "
            r5.<init>(r7)     // Catch:{ all -> 0x00a2 }
            int r0 = r0.f3951     // Catch:{ all -> 0x00a2 }
            r5.append(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00a2 }
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x00a2 }
            r7 = 0
            long r10 = r4.getLong(r3, r7)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "attributionId"
            int r5 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0218
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a2 }
            long r7 = r7 - r10
            r10 = 5184000000(0x134fd9000, double:2.561236308E-314)
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0218
            java.lang.String r5 = "[GCD-E02] Cached conversion data expired"
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = "sixtyDayConversionData"
            android.content.SharedPreferences r7 = getSharedPreferences(r9)     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x00a2 }
            r8 = 1
            r7.putBoolean(r5, r8)     // Catch:{ all -> 0x00a2 }
            r7.apply()     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences r7 = getSharedPreferences(r9)     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x00a2 }
            r8 = 0
            r7.putString(r0, r8)     // Catch:{ all -> 0x00a2 }
            r7.apply()     // Catch:{ all -> 0x00a2 }
            r7 = 0
            m3744((android.content.Context) r9, (java.lang.String) r3, (long) r7)     // Catch:{ all -> 0x00a2 }
        L_0x0218:
            r3 = 0
            java.lang.String r7 = r4.getString(r0, r3)     // Catch:{ all -> 0x00a2 }
            if (r7 != 0) goto L_0x0239
            if (r6 == 0) goto L_0x0239
            if (r16 == 0) goto L_0x0239
            com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher r0 = new com.appsflyer.AppsFlyerLibCore$InstallAttributionIdFetcher     // Catch:{ all -> 0x00a2 }
            android.content.Context r3 = r9.getApplicationContext()     // Catch:{ all -> 0x00a2 }
            android.app.Application r3 = (android.app.Application) r3     // Catch:{ all -> 0x00a2 }
            r4 = 0
            r0.<init>(r1, r3, r6, r4)     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.ScheduledExecutorService r3 = r0.f4064     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00a2 }
            r5 = 10
            m3779(r3, r0, r5, r4)     // Catch:{ all -> 0x00a2 }
            goto L_0x0284
        L_0x0239:
            if (r6 != 0) goto L_0x0241
            java.lang.String r0 = "[GCD-E05] AppsFlyer dev key is missing"
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x0284
        L_0x0241:
            if (r16 == 0) goto L_0x027b
            r3 = 0
            java.lang.String r0 = r4.getString(r0, r3)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x027b
            r0 = 0
            int r0 = r1.getLaunchCounter(r4, r0)     // Catch:{ all -> 0x00a2 }
            r3 = 1
            if (r0 <= r3) goto L_0x027b
            java.util.Map r0 = m3742((android.content.Context) r9)     // Catch:{ v -> 0x0272 }
            if (r0 == 0) goto L_0x0284
            r3 = r20
            boolean r4 = r0.containsKey(r3)     // Catch:{ all -> 0x0269 }
            if (r4 != 0) goto L_0x0265
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0269 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0269 }
        L_0x0265:
            com.appsflyer.AppsFlyerLibCore.InstallAttributionIdFetcher.m3809(r0)     // Catch:{ all -> 0x0269 }
            goto L_0x0284
        L_0x0269:
            r0 = move-exception
            java.lang.String r3 = r0.getLocalizedMessage()     // Catch:{ v -> 0x0272 }
            com.appsflyer.AFLogger.afErrorLog(r3, r0)     // Catch:{ v -> 0x0272 }
            goto L_0x0284
        L_0x0272:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x00a2 }
            com.appsflyer.AFLogger.afErrorLog(r3, r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x0284
        L_0x027b:
            com.appsflyer.AppsFlyerConversionListener r0 = conversionDataListener     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x0284
            java.lang.String r0 = "[GCD-E01] AppsFlyerConversionListener is null - skip gcd"
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x00a2 }
        L_0x0284:
            if (r2 == 0) goto L_0x0289
            r2.disconnect()
        L_0x0289:
            return
        L_0x028a:
            r0 = move-exception
            goto L_0x0292
        L_0x028c:
            r0 = move-exception
            r3 = 0
            goto L_0x0291
        L_0x028f:
            r0 = move-exception
            r3 = r13
        L_0x0291:
            r15 = r3
        L_0x0292:
            if (r15 == 0) goto L_0x0297
            r15.close()     // Catch:{ all -> 0x00a2 }
        L_0x0297:
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x0298:
            r0 = move-exception
            r2 = r18
            goto L_0x029e
        L_0x029c:
            r0 = move-exception
            r2 = r13
        L_0x029e:
            r15 = r2
            goto L_0x02a3
        L_0x02a0:
            r0 = move-exception
            r3 = 0
            r15 = r3
        L_0x02a3:
            if (r15 == 0) goto L_0x02a8
            r15.disconnect()
        L_0x02a8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m3768(com.appsflyer.AFEvent):void");
    }

    public void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.afWarnLog("hostName cannot be null or empty");
        } else {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        }
    }

    public String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        return string != null ? string : ServerParameters.DEFAULT_HOST;
    }

    public String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        return string != null ? string : "";
    }

    /* renamed from: Ι */
    static /* synthetic */ void m3778(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent) {
        String str;
        ScheduledExecutorService scheduledExecutorService;
        Application context = aFEvent.context();
        String str2 = aFEvent.f3939;
        if (context == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
        if (!appsFlyerLibCore.isStopped()) {
            StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
            sb.append(context.getClass().getName());
            AFLogger.afInfoLog(sb.toString());
        }
        int i = 1;
        int i2 = 0;
        boolean z = str2 == null;
        boolean z2 = aFEvent instanceof BackgroundReferrerLaunch;
        boolean z3 = aFEvent instanceof Attr;
        aFEvent.f3949 = z;
        Map<String, Object> r7 = appsFlyerLibCore.mo13950(aFEvent);
        String str3 = (String) r7.get(ServerParameters.AF_DEV_KEY);
        if (str3 == null || str3.length() == 0) {
            AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
            AppsFlyerRequestListener requestListener = aFEvent.getRequestListener();
            if (requestListener != null) {
                requestListener.onError(RequestError.NO_DEV_KEY, RequestErrorMessage.NO_DEV_KEY);
                return;
            }
            return;
        }
        if (!appsFlyerLibCore.isStopped()) {
            AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
        }
        int launchCounter = appsFlyerLibCore.getLaunchCounter(sharedPreferences, false);
        if (z3 || z2) {
            str = ServerConfigHandler.getUrl(REFERRER_TRACKING_URL);
        } else if (!z) {
            str = ServerConfigHandler.getUrl(f4014);
        } else if (launchCounter < 2) {
            str = ServerConfigHandler.getUrl(FIRST_LAUNCHES_URL);
        } else {
            str = ServerConfigHandler.getUrl(f4013);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(context.getPackageName());
        String obj = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append("&buildnumber=6.1.3");
        String obj2 = sb3.toString();
        String configuredChannel = appsFlyerLibCore.getConfiguredChannel(context);
        if (configuredChannel != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj2);
            sb4.append("&channel=");
            sb4.append(configuredChannel);
            obj2 = sb4.toString();
        }
        if (!(AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) && r7.get(ServerParameters.ADVERTISING_ID_PARAM) != null) {
            try {
                if (TextUtils.isEmpty(appsFlyerLibCore.f4030) && r7.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (TextUtils.isEmpty(appsFlyerLibCore.f4019) && r7.remove(ServerParameters.IMEI) != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
        AFEvent addParams = aFEvent.urlString(obj2).addParams(r7);
        addParams.f3951 = launchCounter;
        C1722c cVar = new C1722c(appsFlyerLibCore, addParams, (byte) 0);
        if (z) {
            Referrer[] referrerArr = appsFlyerLibCore.f4044;
            if (referrerArr != null) {
                int length = referrerArr.length;
                int i3 = 0;
                while (i2 < length) {
                    Referrer referrer = referrerArr[i2];
                    if (referrer.getState() == Referrer.State.STARTED) {
                        StringBuilder sb5 = new StringBuilder("Failed to get ");
                        sb5.append(referrer.getSource());
                        sb5.append(" referrer, wait ...");
                        AFLogger.afDebugLog(sb5.toString());
                        i3 = 1;
                    }
                    i2++;
                }
                i2 = i3;
            }
            if (appsFlyerLibCore.f4028 && !appsFlyerLibCore.m3769()) {
                AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                i2 = 1;
            }
            if (!appsFlyerLibCore.f4043 || appsFlyerLibCore.m3780()) {
                i = i2;
            }
        } else {
            i = 0;
        }
        if (AFDeepLinkManager.f3932) {
            AFLogger.afRDLog("ESP deeplink: execute launch on SerialExecutor");
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.f3953 == null) {
                instance2.f3953 = Executors.newSingleThreadScheduledExecutor(instance2.f3954);
            }
            scheduledExecutorService = instance2.f3953;
        } else {
            scheduledExecutorService = AFExecutor.getInstance().mo13841();
        }
        m3779(scheduledExecutorService, cVar, i != 0 ? 500 : 0, TimeUnit.MILLISECONDS);
    }

    /* renamed from: ǃ */
    static /* synthetic */ void m3759(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(aFEvent.urlString());
        AFLogger.afInfoLog(sb.toString());
        if (aFEvent.f3941 != null) {
            str = Base64.encodeToString(aFEvent.mo13839(), 2);
            AFLogger.afInfoLog("cached data: ".concat(String.valueOf(str)));
        } else {
            str = new JSONObject(aFEvent.params()).toString();
            String replaceAll = str.replaceAll("\\p{C}", "*Non-printing character*");
            if (!replaceAll.equals(str)) {
                AFLogger.afWarnLog("Payload contains non-printing characters");
                str = replaceAll;
            }
            C1741ab.m3849("data: ".concat(String.valueOf(str)));
        }
        C1740aa.m3833().mo14060("server_request", aFEvent.urlString(), str);
        try {
            appsFlyerLibCore.m3768(aFEvent);
        } catch (IOException e) {
            AFLogger.afErrorLog("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                appsFlyerLibCore.m3768(aFEvent.urlString(aFEvent.urlString().replace("https:", "http:")));
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send request to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.afInfoLog(sb2.toString());
            throw e;
        }
    }

    /* renamed from: ǃ */
    static /* synthetic */ void m3757(Context context, String str, String str2) {
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
