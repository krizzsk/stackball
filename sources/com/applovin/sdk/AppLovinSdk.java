package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1514c;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.nativeAds.AppLovinNativeAdService;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap();
    private static final Object sdkInstancesLock = new Object();
    private final C1469j mSdkImpl;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* renamed from: com.applovin.sdk.AppLovinSdk$a */
    private static class C1699a extends AppLovinSdkSettings {
        C1699a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(C1469j jVar) {
        this.mSdkImpl = jVar;
    }

    /* renamed from: a */
    public static List<AppLovinSdk> m3688a() {
        return new ArrayList(sdkInstances.values());
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new C1699a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(C1514c.m3412a(context).mo13302a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        } else if (context != null) {
            synchronized (sdkInstancesLock) {
                if (sdkInstances.containsKey(str)) {
                    AppLovinSdk appLovinSdk = sdkInstances.get(str);
                    return appLovinSdk;
                }
                if (!TextUtils.isEmpty(str) && str.contains(File.separator)) {
                    C1505q.m3345i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                    if (!sdkInstances.isEmpty()) {
                        AppLovinSdk next = sdkInstances.values().iterator().next();
                        return next;
                    }
                    str = str.replace(File.separator, "");
                }
                C1469j jVar = new C1469j();
                jVar.mo13100a(str, appLovinSdkSettings, context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(jVar);
                jVar.mo13098a(appLovinSdk2);
                sdkInstances.put(str, appLovinSdk2);
                return appLovinSdk2;
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    private static String getVersion() {
        return "9.12.4";
    }

    private static int getVersionCode() {
        return 91204;
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, (SdkInitializationListener) null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk instance = getInstance(context);
            if (instance != null) {
                instance.initializeSdk(sdkInitializationListener);
            } else {
                C1505q.m3345i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk next : sdkInstances.values()) {
                next.mSdkImpl.mo13115b();
                if (bool != null) {
                    C1505q v = next.mSdkImpl.mo13139v();
                    v.mo13279c(TAG, "Toggled 'huc' to " + bool);
                    next.getEventService().trackEvent("huc", C1517e.m3426a("value", bool.toString()));
                }
                if (bool2 != null) {
                    C1505q v2 = next.mSdkImpl.mo13139v();
                    v2.mo13279c(TAG, "Toggled 'aru' to " + bool2);
                    next.getEventService().trackEvent("aru", C1517e.m3426a("value", bool2.toString()));
                }
                if (bool3 != null) {
                    C1505q v3 = next.mSdkImpl.mo13139v();
                    v3.mo13279c(TAG, "Toggled 'dns' to " + bool3);
                    next.getEventService().trackEvent("dns", C1517e.m3426a("value", bool3.toString()));
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.mSdkImpl.mo13131o();
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public Context getApplicationContext() {
        return this.mSdkImpl.mo13065D();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.mSdkImpl.mo13129m();
    }

    public AppLovinEventService getEventService() {
        return this.mSdkImpl.mo13133q();
    }

    @Deprecated
    public C1505q getLogger() {
        return this.mSdkImpl.mo13139v();
    }

    public String getMediationProvider() {
        return this.mSdkImpl.mo13130n();
    }

    public AppLovinNativeAdService getNativeAdService() {
        return this.mSdkImpl.mo13132p();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.mSdkImpl.mo13077Q();
    }

    public String getSdkKey() {
        return this.mSdkImpl.mo13136t();
    }

    public AppLovinSdkSettings getSettings() {
        return this.mSdkImpl.mo13128l();
    }

    public String getUserIdentifier() {
        return this.mSdkImpl.mo13125i();
    }

    public AppLovinUserService getUserService() {
        return this.mSdkImpl.mo13134r();
    }

    public AppLovinVariableService getVariableService() {
        return this.mSdkImpl.mo13135s();
    }

    public boolean hasCriticalErrors() {
        return this.mSdkImpl.mo13138u();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.mSdkImpl.mo13097a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.mSdkImpl.mo13120d();
    }

    public void setMediationProvider(String str) {
        this.mSdkImpl.mo13118c(str);
    }

    public void setPluginVersion(String str) {
        this.mSdkImpl.mo13099a(str);
    }

    public void setUserIdentifier(String str) {
        this.mSdkImpl.mo13117b(str);
    }

    public void showMediationDebugger() {
        this.mSdkImpl.mo13124h();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.mSdkImpl.mo13068H() + '}';
    }
}
