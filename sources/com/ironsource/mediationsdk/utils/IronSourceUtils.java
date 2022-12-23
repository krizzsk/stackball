package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.internal.referrer.Payload;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.environment.C5527g;
import com.ironsource.mediationsdk.C5555D;
import com.ironsource.mediationsdk.C5556E;
import com.ironsource.mediationsdk.C5677b;
import com.ironsource.mediationsdk.C5707k;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.C5715c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.C5749e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.tapjoy.TapjoyConstants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class IronSourceUtils {
    private static final String ADAPTER_VERSION_KEY = "providerAdapterVersion";
    private static final String DEFAULT_IS_EVENTS_FORMATTER_TYPE = "default_is_events_formatter_type";
    private static final String DEFAULT_IS_EVENTS_URL = "default_is_events_url";
    private static final String DEFAULT_IS_NON_CONNECTIVITY_EVENTS = "default_is_non_connectivity_events";
    private static final String DEFAULT_IS_OPT_IN_EVENTS = "default_is_opt_in_events";
    private static final String DEFAULT_IS_OPT_OUT_EVENTS = "default_is_opt_out_events";
    private static final String DEFAULT_IS_TRIGGER_EVENTS = "default_is_trigger_events";
    private static final String DEFAULT_RV_EVENTS_FORMATTER_TYPE = "default_rv_events_formatter_type";
    private static final String DEFAULT_RV_EVENTS_URL = "default_rv_events_url";
    private static final String DEFAULT_RV_NON_CONNECTIVITY_EVENTS = "default_rv_non_connectivity_events";
    private static final String DEFAULT_RV_OPT_IN_EVENTS = "default_rv_opt_in_events";
    private static final String DEFAULT_RV_OPT_OUT_EVENTS = "default_rv_opt_out_events";
    private static final String DEFAULT_RV_TRIGGER_EVENTS = "default_rv_trigger_events";
    private static final String FIRST_SESSION_TIMESTAMP = "firstSessionTimestamp";
    private static final String GENERAL_PROPERTIES = "general_properties";
    private static final String LAST_RESPONSE = "last_response";
    public static final int NOT_SAVED_NUMBER_SHARED_PREFERENCE = -1;
    private static final String PROVIDER_KEY = "provider";
    private static final String PROVIDER_PRIORITY = "providerPriority";
    private static final String SDK_VERSION = "7.1.10.1";
    private static final String SDK_VERSION_KEY = "providerSDKVersion";
    private static final String SHARED_PREFERENCES_NAME = "Mediation_Shared_Preferences";
    private static final String SUB_PROVIDER_ID_KEY = "spId";
    private static IronSourceUtils instance = new IronSourceUtils();
    private static AtomicBoolean mDidCreateSessionID = new AtomicBoolean(false);
    private static Boolean mFirstSession = null;
    private static String mSessionId = null;
    private static int serr = 1;

    public static void createAndStartWorker(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new C5715c());
        thread.start();
    }

    public static boolean doesClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getBase64Auth(String str, String str2) {
        String str3 = str + CertificateUtil.DELIMITER + str2;
        return "Basic " + Base64.encodeToString(str3.getBytes(), 10);
    }

    static boolean getBooleanFromSharedPrefs(Context context, String str, boolean z) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getBoolean(str, z);
    }

    private static JSONObject getCachedInitResponse(Context context) {
        try {
            return new JSONObject(getLastResponse(context));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static String getCachedValueByKeyOfCachedInitResponse(Context context, String str) {
        return getCachedInitResponse(context).optString(str);
    }

    public static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to connection type - exception = " + e);
            return "none";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static synchronized String getDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultFormatterTypeByEventType(str), str2);
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e);
            }
        }
        return str2;
    }

    public static synchronized String getDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultEventsUrlByEventType(str), str2);
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e);
            }
        }
        return str2;
    }

    private static String getDefaultEventsUrlByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_EVENTS_URL : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_EVENTS_URL : "";
    }

    private static String getDefaultFormatterTypeByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_EVENTS_FORMATTER_TYPE : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_EVENTS_FORMATTER_TYPE : "";
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultNonConnectivityEventsByEventType(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e);
            }
        }
        return iArr;
    }

    private static String getDefaultNonConnectivityEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_NON_CONNECTIVITY_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_NON_CONNECTIVITY_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptInEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptInEventsByEventType(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e);
            }
        }
        return iArr;
    }

    private static String getDefaultOptInEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_OPT_IN_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_OPT_IN_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptOutEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptOutEventsByEventType(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e);
            }
        }
        return iArr;
    }

    private static String getDefaultOptOutEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_OPT_OUT_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_OPT_OUT_EVENTS : "";
    }

    public static synchronized int[] getDefaultTriggerEvents(Context context, String str) {
        int[] iArr;
        synchronized (IronSourceUtils.class) {
            iArr = null;
            try {
                String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultTriggerEventsByEventType(str), (String) null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = ((Integer) arrayList.get(i)).intValue();
                    }
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e);
            }
        }
        return iArr;
    }

    private static String getDefaultTriggerEventsByEventType(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? DEFAULT_IS_TRIGGER_EVENTS : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_TRIGGER_EVENTS : "";
    }

    public static String getDeviceType(Context context) {
        return C5527g.m13144d(context) ? "Tablet" : "Phone";
    }

    public static boolean getFirstSession(Context context) {
        if (mFirstSession == null) {
            mFirstSession = Boolean.valueOf(!isInitResponseCached(context));
        }
        return mFirstSession.booleanValue();
    }

    public static long getFirstSessionTimestamp(Context context) {
        if (context == null) {
            return -1;
        }
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong("firstSessionTimestamp", -1);
    }

    public static synchronized JSONObject getGeneralProperties(Context context) {
        JSONObject jSONObject;
        synchronized (IronSourceUtils.class) {
            jSONObject = new JSONObject();
            if (context == null) {
                return jSONObject;
            }
            try {
                jSONObject = new JSONObject(context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(GENERAL_PROPERTIES, jSONObject.toString()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static IronSourceUtils getInstance() {
        return instance;
    }

    static int getIntFromSharedPrefs(Context context, String str, int i) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getInt(str, i);
    }

    public static C5555D getIronSourceAdvId(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        C5556E.m13257a();
        String a = C5556E.m13258a(context);
        if (TextUtils.isEmpty(a)) {
            a = C5527g.m13180y(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            str = IronSourceConstants.TYPE_UUID;
        } else {
            str = IronSourceConstants.TYPE_GAID;
        }
        return new C5555D(a, str);
    }

    public static JSONObject getJsonForMetaData(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("provider", "Mediation");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                if (i2 >= list2.size()) {
                    break;
                }
                String str2 = list.get(i);
                String str3 = list2.get(i2);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i++;
                i2++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getJsonForUserId(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("provider", "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getLastResponse(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(LAST_RESPONSE, "");
    }

    static long getLongFromSharedPrefs(Context context, String str, long j) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong(str, j);
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = AppEventsConstants.EVENT_PARAM_VALUE_NO + bigInteger;
            }
            return bigInteger;
        } catch (Throwable th) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    public static JSONObject getMediationAdditionalData(boolean z) {
        return getMediationAdditionalData(z, false, 1);
    }

    public static JSONObject getMediationAdditionalData(boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("provider", "Mediation");
            if (z) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z2) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static String getMediationUserId() {
        return C5749e.m14210a().mo42052a(DataKeys.USER_ID);
    }

    public static JSONObject getProviderAdditionalData(C5677b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PROVIDER_PRIORITY, bVar.f13502n);
            jSONObject.put(SUB_PROVIDER_ID_KEY, bVar.f13494f);
            jSONObject.put("provider", !TextUtils.isEmpty(bVar.f13495g) ? bVar.f13495g : bVar.mo41811j());
            jSONObject.put(SDK_VERSION_KEY, bVar.f13490b.getCoreSDKVersion());
            jSONObject.put(ADAPTER_VERSION_KEY, bVar.f13490b.getVersion());
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "IronSourceUtils:getProviderAdditionalData(adapter: " + bVar.mo41811j() + ")", e);
        }
        return jSONObject;
    }

    public static JSONObject getProviderAdditionalData(C5707k kVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SUB_PROVIDER_ID_KEY, kVar.f13650b.getSubProviderId());
            jSONObject.put("provider", !TextUtils.isEmpty(kVar.f13650b.getAdSourceNameForEvents()) ? kVar.f13650b.getAdSourceNameForEvents() : kVar.mo41892a());
            jSONObject.put(SDK_VERSION_KEY, kVar.f13649a.getCoreSDKVersion());
            jSONObject.put(ADAPTER_VERSION_KEY, kVar.f13649a.getVersion());
            jSONObject.put(PROVIDER_PRIORITY, kVar.f13654f);
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "IronSourceUtils:getProviderAdditionalData(adapter: " + kVar.mo41892a() + ")", e);
        }
        return jSONObject;
    }

    public static String getSDKVersion() {
        return "7.1.10.1";
    }

    private static String getSHA256(String str) {
        try {
            return String.format("%064x", new Object[]{new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes()))});
        } catch (NoSuchAlgorithmException e) {
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e);
                return "";
            }
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getSHA256(input:" + str + ")", e);
            return "";
        }
    }

    public static int getSerr() {
        return serr;
    }

    public static synchronized String getSessionId() {
        String str;
        synchronized (IronSourceUtils.class) {
            if (mDidCreateSessionID.compareAndSet(false, true)) {
                mSessionId = UUID.randomUUID().toString();
            }
            str = mSessionId;
        }
        return str;
    }

    static String getStringFromSharedPrefs(Context context, String str, String str2) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(str, str2);
    }

    public static long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public static String getTransId(String str) {
        return getSHA256(str);
    }

    public static String getUserIdForNetworks() {
        String a = C5749e.m14210a().mo42052a("userIdType");
        String a2 = C5749e.m14210a().mo42052a(DataKeys.USER_ID);
        if (a == null || !a.equals(IronSourceConstants.TYPE_USER_GENERATED) || TextUtils.isEmpty(a2)) {
            return null;
        }
        return a2;
    }

    public static boolean isAndroidXAvailable() {
        return doesClassExist("androidx.appcompat.app.AppCompatActivity") || doesClassExist("androidx.core.app.CoreComponentFactory") || doesClassExist("androidx.fragment.app.Fragment") || doesClassExist("androidx.lifecycle.LiveData") || doesClassExist("androidx.annotation.Keep");
    }

    public static boolean isInitResponseCached(Context context) {
        return !TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, "appKey")) && !TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID)) && !TextUtils.isEmpty(getCachedValueByKeyOfCachedInitResponse(context, Payload.RESPONSE));
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e) {
            IronLog ironLog = IronLog.NATIVE;
            ironLog.error("failed to check if network is connected - exception = " + e);
            return false;
        }
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            try {
                return new JSONObject();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (jSONObject == null) {
            return jSONObject2;
        } else {
            if (jSONObject2 == null) {
                return jSONObject;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        }
        return jSONObject;
    }

    static Map<String, String> parseJsonToStringMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        hashMap.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    static void saveBooleanToSharedPrefs(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static synchronized void saveDefaultEventsFormatterType(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                edit.putString(getDefaultFormatterTypeByEventType(str), str2);
                edit.commit();
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultEventsURL(Context context, String str, String str2) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                edit.putString(getDefaultEventsUrlByEventType(str), str2);
                edit.commit();
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                logger.logException(ironSourceTag, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(getDefaultNonConnectivityEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultOptInEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(getDefaultOptInEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultOptOutEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(getDefaultOptOutEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e);
            }
        }
    }

    public static synchronized void saveDefaultTriggerEvents(Context context, String str, int[] iArr) {
        synchronized (IronSourceUtils.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
                String str2 = null;
                if (iArr != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int append : iArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                }
                edit.putString(getDefaultTriggerEventsByEventType(str), str2);
                edit.commit();
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e);
            }
        }
    }

    public static void saveFirstSessionTimestamp(Context context, long j) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            edit.putLong("firstSessionTimestamp", j);
            edit.apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void saveGeneralProperties(android.content.Context r3, org.json.JSONObject r4) {
        /*
            java.lang.Class<com.ironsource.mediationsdk.utils.IronSourceUtils> r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.class
            monitor-enter(r0)
            if (r3 == 0) goto L_0x0024
            if (r4 != 0) goto L_0x0008
            goto L_0x0024
        L_0x0008:
            java.lang.String r1 = "Mediation_Shared_Preferences"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0021 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "general_properties"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0021 }
            r3.putString(r1, r4)     // Catch:{ all -> 0x0021 }
            r3.apply()     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)
            return
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0024:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.IronSourceUtils.saveGeneralProperties(android.content.Context, org.json.JSONObject):void");
    }

    static void saveIntToSharedPrefs(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static synchronized void saveLastResponse(Context context, String str) {
        synchronized (IronSourceUtils.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            edit.putString(LAST_RESPONSE, str);
            edit.apply();
        }
    }

    static void saveLongToSharedPrefs(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    static void saveStringToSharedPrefs(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static synchronized void sendAutomationLog(String str) {
        synchronized (IronSourceUtils.class) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 1);
        }
    }

    private static void setSerr(int i) {
        serr = i;
    }
}
