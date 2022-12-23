package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public class InAppPurchaseLoggerManager {
    private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
    private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
    private static final String LAST_QUERY_PURCHASE_HISTORY_TIME = "LAST_QUERY_PURCHASE_HISTORY_TIME";
    private static final String PRODUCT_DETAILS_STORE = "com.facebook.internal.iap.PRODUCT_DETAILS";
    private static final String PURCHASE_DETAILS_SET = "PURCHASE_DETAILS_SET";
    private static final int PURCHASE_IN_CACHE_INTERVAL = 86400;
    private static final String PURCHASE_TIME = "purchaseTime";
    private static final Map<String, Long> cachedPurchaseMap = new ConcurrentHashMap();
    private static final Set<String> cachedPurchaseSet = new CopyOnWriteArraySet();
    private static SharedPreferences sharedPreferences;

    private static void readPurchaseCache() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
                SharedPreferences sharedPreferences3 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
                if (sharedPreferences2.contains(LAST_CLEARED_TIME)) {
                    sharedPreferences2.edit().clear().apply();
                    sharedPreferences3.edit().clear().apply();
                }
                SharedPreferences sharedPreferences4 = FacebookSdk.getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, 0);
                sharedPreferences = sharedPreferences4;
                cachedPurchaseSet.addAll(sharedPreferences4.getStringSet(PURCHASE_DETAILS_SET, new HashSet()));
                for (String split : cachedPurchaseSet) {
                    String[] split2 = split.split(";", 2);
                    cachedPurchaseMap.put(split2[0], Long.valueOf(Long.parseLong(split2[1])));
                }
                clearOutdatedProductInfoInCache();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static void filterPurchaseLogging(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                readPurchaseCache();
                logPurchases(new HashMap(constructLoggingReadyMap(cacheDeDupPurchase(map), map2)));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    static void logPurchases(Map<String, String> map) {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    String str2 = (String) next.getValue();
                    if (!(str == null || str2 == null)) {
                        AutomaticAnalyticsLogger.logPurchase(str, str2, false);
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    static Map<String, JSONObject> cacheDeDupPurchase(Map<String, JSONObject> map) {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                try {
                    JSONObject jSONObject = (JSONObject) entry.getValue();
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (cachedPurchaseMap.containsKey(string)) {
                            map.remove(entry.getKey());
                        } else {
                            Set<String> set = cachedPurchaseSet;
                            set.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            sharedPreferences.edit().putStringSet(PURCHASE_DETAILS_SET, cachedPurchaseSet).apply();
            return new HashMap(map);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static void clearOutdatedProductInfoInCache() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long j = sharedPreferences.getLong(LAST_CLEARED_TIME, 0);
                if (j == 0) {
                    sharedPreferences.edit().putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
                } else if (currentTimeMillis - j > 604800) {
                    for (Map.Entry entry : new HashMap(cachedPurchaseMap).entrySet()) {
                        String str = (String) entry.getKey();
                        Long l = (Long) entry.getValue();
                        if (currentTimeMillis - l.longValue() > 86400) {
                            Set<String> set = cachedPurchaseSet;
                            set.remove(str + ";" + l);
                            cachedPurchaseMap.remove(str);
                        }
                    }
                    sharedPreferences.edit().putStringSet(PURCHASE_DETAILS_SET, cachedPurchaseSet).putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static boolean eligibleQueryPurchaseHistory() {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            readPurchaseCache();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j = sharedPreferences.getLong(LAST_QUERY_PURCHASE_HISTORY_TIME, 0);
            if (j != 0 && currentTimeMillis - j < 86400) {
                return false;
            }
            sharedPreferences.edit().putLong(LAST_QUERY_PURCHASE_HISTORY_TIME, currentTimeMillis).apply();
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    static Map<String, String> constructLoggingReadyMap(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        Class<InAppPurchaseLoggerManager> cls = InAppPurchaseLoggerManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            HashMap hashMap = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                JSONObject jSONObject = map2.get(next.getKey());
                JSONObject jSONObject2 = (JSONObject) next.getValue();
                if (jSONObject2 != null && jSONObject2.has(PURCHASE_TIME)) {
                    try {
                        if (currentTimeMillis - (jSONObject2.getLong(PURCHASE_TIME) / 1000) <= 86400) {
                            if (jSONObject != null) {
                                hashMap.put(jSONObject2.toString(), jSONObject.toString());
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return hashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }
}
