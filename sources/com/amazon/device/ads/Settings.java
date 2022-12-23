package com.amazon.device.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.device.ads.JSONUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

class Settings {
    private static final String LOGTAG = Settings.class.getSimpleName();
    private static final String PREFS_NAME = "AmazonMobileAds";
    public static final String SETTING_ENABLE_WEBVIEW_PAUSE_LOGIC = "shouldPauseWebViewTimersInWebViewRelatedActivities";
    protected static final String SETTING_TESTING_ENABLED = "testingEnabled";
    protected static final String SETTING_TLS_ENABLED = "tlsEnabled";
    private static Settings instance = new Settings();
    /* access modifiers changed from: private */
    public final ConcurrentHashMap<String, Value> cache;
    private DebugProperties debugProperties;
    private JSONUtils.JSONUtilities jsonUtilities;
    private LinkedBlockingQueue<SettingsListener> listeners;
    private final MobileAdsLogger logger;
    private final CountDownLatch settingsLoadedLatch;
    private SharedPreferences sharedPreferences;
    /* access modifiers changed from: private */
    public final ReentrantLock writeToSharedPreferencesLock;

    public interface SettingsListener {
        void settingsLoaded();
    }

    public Settings() {
        this(new JSONUtils.JSONUtilities(), DebugProperties.getInstance());
    }

    Settings(JSONUtils.JSONUtilities jSONUtilities, DebugProperties debugProperties2) {
        this.logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
        this.listeners = new LinkedBlockingQueue<>();
        this.writeToSharedPreferencesLock = new ReentrantLock();
        this.settingsLoadedLatch = new CountDownLatch(1);
        this.cache = new ConcurrentHashMap<>();
        this.jsonUtilities = jSONUtilities;
        this.debugProperties = debugProperties2;
    }

    public static Settings getInstance() {
        return instance;
    }

    /* access modifiers changed from: package-private */
    public void contextReceived(Context context) {
        if (context != null) {
            beginFetch(context);
        }
    }

    /* access modifiers changed from: package-private */
    public void beginFetch(final Context context) {
        ThreadUtils.scheduleRunnable(new Runnable() {
            public void run() {
                Settings.this.fetchSharedPreferences(context);
            }
        });
    }

    public boolean isSettingsLoaded() {
        return this.sharedPreferences != null;
    }

    public void listenForSettings(SettingsListener settingsListener) {
        if (isSettingsLoaded()) {
            settingsListener.settingsLoaded();
            return;
        }
        try {
            this.listeners.put(settingsListener);
        } catch (InterruptedException e) {
            this.logger.mo11020e("Interrupted exception while adding listener: %s", e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences getSharedPreferencesFromContext(Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0);
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public ConcurrentHashMap<String, Value> getCache() {
        return this.cache;
    }

    private void putSetting(String str, Value value) {
        if (value.value == null) {
            this.logger.mo11028w("Could not set null value for setting: %s", str);
            return;
        }
        putSettingWithNoFlush(str, value);
        if (!value.isTransientData && isSettingsLoaded()) {
            flush();
        }
    }

    private void putSettingWithNoFlush(String str, Value value) {
        if (value.value == null) {
            this.logger.mo11028w("Could not set null value for setting: %s", str);
            return;
        }
        this.cache.put(str, value);
    }

    /* access modifiers changed from: package-private */
    public void readSharedPreferencesIntoCache(SharedPreferences sharedPreferences2) {
        cacheAdditionalEntries(sharedPreferences2.getAll());
    }

    /* access modifiers changed from: package-private */
    public void cacheAdditionalEntries(Map<String, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (str != null && !this.cache.containsKey(str)) {
                Object value = next.getValue();
                if (value != null) {
                    this.cache.put(str, new Value(value.getClass(), value));
                } else {
                    this.logger.mo11028w("Could not cache null value for SharedPreferences setting: %s", str);
                }
            }
        }
    }

    private void writeCacheToSharedPreferences() {
        writeCacheToSharedPreferences(this.sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    public void writeCacheToSharedPreferences(final SharedPreferences sharedPreferences2) {
        ThreadUtils.scheduleRunnable(new Runnable() {
            public void run() {
                Settings.this.writeToSharedPreferencesLock.lock();
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.clear();
                for (Map.Entry entry : Settings.this.cache.entrySet()) {
                    Value value = (Value) entry.getValue();
                    if (!value.isTransientData) {
                        if (value.clazz == String.class) {
                            edit.putString((String) entry.getKey(), (String) value.value);
                        } else if (value.clazz == Long.class) {
                            edit.putLong((String) entry.getKey(), ((Long) value.value).longValue());
                        } else if (value.clazz == Integer.class) {
                            edit.putInt((String) entry.getKey(), ((Integer) value.value).intValue());
                        } else if (value.clazz == Boolean.class) {
                            edit.putBoolean((String) entry.getKey(), ((Boolean) value.value).booleanValue());
                        }
                    }
                }
                Settings.this.commit(edit);
                Settings.this.writeToSharedPreferencesLock.unlock();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void flush() {
        writeCacheToSharedPreferences();
    }

    public boolean containsKey(String str) {
        return this.cache.containsKey(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r2 = r1.jsonUtilities.getJSONObjectFromString((java.lang.String) r2.value);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject getJSONObject(java.lang.String r2, org.json.JSONObject r3) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amazon.device.ads.Settings$Value> r0 = r1.cache
            java.lang.Object r2 = r0.get(r2)
            com.amazon.device.ads.Settings$Value r2 = (com.amazon.device.ads.Settings.Value) r2
            if (r2 != 0) goto L_0x000b
            return r3
        L_0x000b:
            com.amazon.device.ads.JSONUtils$JSONUtilities r0 = r1.jsonUtilities
            java.lang.Object r2 = r2.value
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONObject r2 = r0.getJSONObjectFromString(r2)
            if (r2 == 0) goto L_0x0018
            return r2
        L_0x0018:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.Settings.getJSONObject(java.lang.String, org.json.JSONObject):org.json.JSONObject");
    }

    public void putJSONObject(String str, JSONObject jSONObject) {
        putSetting(str, new Value(String.class, jSONObject.toString()));
    }

    public void putJSONObjectWithNoFlush(String str, JSONObject jSONObject) {
        putSettingWithNoFlush(str, new Value(String.class, jSONObject.toString()));
    }

    public void putTransientJSONObject(String str, JSONObject jSONObject) {
        putSettingWithNoFlush(str, new TransientValue(String.class, jSONObject.toString()));
    }

    public JSONObject getWrittenJSONObject(String str, JSONObject jSONObject) {
        if (!isSettingsLoaded()) {
            return jSONObject;
        }
        return this.jsonUtilities.getJSONObjectFromString(this.sharedPreferences.getString(str, jSONObject.toString()));
    }

    public String getString(String str, String str2) {
        Value value = this.cache.get(str);
        if (value == null) {
            return str2;
        }
        return (String) value.value;
    }

    /* access modifiers changed from: package-private */
    public void putString(String str, String str2) {
        putSetting(str, new Value(String.class, str2));
    }

    /* access modifiers changed from: package-private */
    public void putStringWithNoFlush(String str, String str2) {
        putSettingWithNoFlush(str, new Value(String.class, str2));
    }

    /* access modifiers changed from: package-private */
    public void putTransientString(String str, String str2) {
        putSettingWithNoFlush(str, new TransientValue(String.class, str2));
    }

    public String getWrittenString(String str, String str2) {
        return isSettingsLoaded() ? this.sharedPreferences.getString(str, str2) : str2;
    }

    public int getInt(String str, int i) {
        Value value = this.cache.get(str);
        if (value == null) {
            return i;
        }
        return ((Integer) value.value).intValue();
    }

    /* access modifiers changed from: package-private */
    public void putInt(String str, int i) {
        putSetting(str, new Value(Integer.class, Integer.valueOf(i)));
    }

    /* access modifiers changed from: package-private */
    public void putIntWithNoFlush(String str, int i) {
        putSettingWithNoFlush(str, new Value(Integer.class, Integer.valueOf(i)));
    }

    /* access modifiers changed from: package-private */
    public void putTransientInt(String str, int i) {
        putSettingWithNoFlush(str, new TransientValue(Integer.class, Integer.valueOf(i)));
    }

    public int getWrittenInt(String str, int i) {
        return isSettingsLoaded() ? this.sharedPreferences.getInt(str, i) : i;
    }

    public long getLong(String str, long j) {
        Value value = this.cache.get(str);
        if (value == null) {
            return j;
        }
        return ((Long) value.value).longValue();
    }

    /* access modifiers changed from: package-private */
    public void putLong(String str, long j) {
        putSetting(str, new Value(Long.class, Long.valueOf(j)));
    }

    /* access modifiers changed from: package-private */
    public void putLongWithNoFlush(String str, long j) {
        putSettingWithNoFlush(str, new Value(Long.class, Long.valueOf(j)));
    }

    /* access modifiers changed from: package-private */
    public void putTransientLong(String str, long j) {
        putSettingWithNoFlush(str, new TransientValue(Long.class, Long.valueOf(j)));
    }

    public long getWrittenLong(String str, long j) {
        return isSettingsLoaded() ? this.sharedPreferences.getLong(str, j) : j;
    }

    public boolean getBoolean(String str, boolean z) {
        Boolean bool = getBoolean(str, (Boolean) null);
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public Boolean getBoolean(String str, Boolean bool) {
        Value value = this.cache.get(str);
        if (value == null) {
            return bool;
        }
        return (Boolean) value.value;
    }

    /* access modifiers changed from: package-private */
    public void putBoolean(String str, boolean z) {
        putSetting(str, new Value(Boolean.class, Boolean.valueOf(z)));
    }

    /* access modifiers changed from: package-private */
    public void putBooleanWithNoFlush(String str, boolean z) {
        putSettingWithNoFlush(str, new Value(Boolean.class, Boolean.valueOf(z)));
    }

    /* access modifiers changed from: package-private */
    public void putTransientBoolean(String str, boolean z) {
        putSettingWithNoFlush(str, new TransientValue(Boolean.class, Boolean.valueOf(z)));
    }

    public boolean getWrittenBoolean(String str, boolean z) {
        return isSettingsLoaded() ? this.sharedPreferences.getBoolean(str, z) : z;
    }

    public void putTransientObject(String str, Object obj) {
        putSettingWithNoFlush(str, new TransientValue(obj.getClass(), obj));
    }

    public <T> T getObject(String str, T t, Class<T> cls) {
        Value value = this.cache.get(str);
        return (value == null || !cls.isInstance(value.value)) ? t : value.value;
    }

    /* access modifiers changed from: package-private */
    public void remove(String str) {
        Value remove = this.cache.remove(str);
        if (remove != null && !remove.isTransientData && isSettingsLoaded()) {
            flush();
        }
    }

    /* access modifiers changed from: package-private */
    public void removeWithNoFlush(String str) {
        this.cache.remove(str);
    }

    /* access modifiers changed from: private */
    public void commit(SharedPreferences.Editor editor) {
        editor.apply();
    }

    /* access modifiers changed from: package-private */
    public void notifySettingsListeners() {
        while (true) {
            SettingsListener poll = this.listeners.poll();
            if (poll != null) {
                poll.settingsLoaded();
            } else {
                return;
            }
        }
    }

    class Value {
        public Class<?> clazz;
        public boolean isTransientData;
        public Object value;

        public Value(Class<?> cls, Object obj) {
            this.clazz = cls;
            this.value = obj;
        }
    }

    class TransientValue extends Value {
        public TransientValue(Class<?> cls, Object obj) {
            super(cls, obj);
            this.isTransientData = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void fetchSharedPreferences(Context context) {
        if (!isSettingsLoaded()) {
            SharedPreferences sharedPreferencesFromContext = getSharedPreferencesFromContext(context);
            readSharedPreferencesIntoCache(sharedPreferencesFromContext);
            this.sharedPreferences = sharedPreferencesFromContext;
            writeCacheToSharedPreferences(sharedPreferencesFromContext);
        }
        this.settingsLoadedLatch.countDown();
        notifySettingsListeners();
    }

    static final class SettingsStatics {
        static final String IU_SERVICE_LAST_CHECKIN = "amzn-ad-iu-last-checkin";
        static final String IU_SERVICE_LAST_CHECKIN_USING_SESSIONID = "amzn-ad-iu-last-checkin-using-sessionid";
        static final String VIEWABLE_JS_SETTINGS_NAME = "viewableJSSettingsNameAmazonAdSDK";
        static final String VIEWABLE_JS_VERSION_STORED = "viewableJSVersionStored";

        SettingsStatics() {
        }
    }
}
