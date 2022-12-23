package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewTreeObserver;
import com.appsflyer.AppsFlyerProperties;
import com.fyber.inneractive.sdk.C2719b;
import com.fyber.inneractive.sdk.config.C2786d;
import com.fyber.inneractive.sdk.config.C2791i;
import com.fyber.inneractive.sdk.config.C2792j;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.p033c.C2724b;
import com.fyber.inneractive.sdk.p033c.C2727c;
import com.fyber.inneractive.sdk.p033c.C2730d;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3625af;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3681t;
import com.fyber.inneractive.sdk.util.C3691w;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.Thread;

public final class InneractiveAdManager implements C2792j.C2794a {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f6867b;

    /* renamed from: d */
    private static int f6868d;

    /* renamed from: a */
    String f6869a;

    /* renamed from: c */
    private volatile Context f6870c;

    public enum GdprConsentSource {
        Internal,
        External
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdManager$a */
    private static class C2906a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static volatile InneractiveAdManager f6877a = new InneractiveAdManager((byte) 0);
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static String getVersion() {
        return "7.8.4";
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    /* synthetic */ InneractiveAdManager(byte b) {
        this();
    }

    private InneractiveAdManager() {
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, (OnFyberMarketplaceInitializedListener) null);
    }

    public static void initialize(final Context context, String str, final OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        if (context == null || str == null) {
            IAlog.m9037e("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            Object[] objArr = new Object[1];
            objArr[0] = str == null ? AppsFlyerProperties.APP_ID : "context";
            m6495b(onFyberMarketplaceInitializedListener, (str == null || TextUtils.isEmpty(str.trim())) ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, String.format("%s is null", objArr));
            return;
        }
        boolean z = IAConfigManager.m5945p() != null && !IAConfigManager.m5945p().equalsIgnoreCase(str);
        if (C2906a.f6877a.f6870c == null || z) {
            IAlog.m9031a(context);
            C3657l.m9110a((Application) context.getApplicationContext());
            C3681t a = C3681t.C3683a.f9976a;
            Context applicationContext = context.getApplicationContext();
            IAlog.m9034b("%sinit called", IAlog.m9029a((Object) a));
            a.f9973c = applicationContext;
            a.f9974d = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    IAlog.m9034b("%sonReceive. action = %s", IAlog.m9029a((Object) C3681t.this), intent.getAction());
                    C3681t.this.mo19596a(context, intent);
                }
            };
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            a.f9973c.registerReceiver(a.f9974d, intentFilter);
            Intent intent = new Intent();
            intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
            intent.setPackage(C3656k.m9094f());
            int a2 = C2719b.m5890a(context.getApplicationContext(), intent);
            f6868d = a2;
            if (a2 == 0) {
                IAlog.m9037e("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
                m6495b(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, (String) null);
                return;
            }
            C29031 r3 = new IAConfigManager.OnConfigurationReadyAndValidListener() {
                public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
                    if (context.getApplicationContext() != null) {
                        IAConfigManager.removeListener(this);
                        IAConfigManager.OnConfigurationReadyAndValidListener unused = InneractiveAdManager.f6867b = null;
                        if (z) {
                            InneractiveAdManager.m6495b(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, (String) null);
                        } else {
                            InneractiveAdManager.m6495b(onFyberMarketplaceInitializedListener, exc instanceof InvalidAppIdException ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc.getLocalizedMessage());
                        }
                    }
                }
            };
            f6867b = r3;
            IAConfigManager.addListener(r3);
            if (z) {
                IAConfigManager.m5930c(str);
                IAConfigManager.m5938i();
            } else {
                IAConfigManager.m5912a(context.getApplicationContext(), str, "Android", "7.8.4");
            }
            C2906a.f6877a.f6870c = context.getApplicationContext();
            final SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
            String string = sharedPreferences.getString("FyberExceptionKey", "empty");
            String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
            String string3 = sharedPreferences.getString("FyberNameKey", "empty");
            String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
            IAlog.m9034b(" name- %s   description - %s exception - %s", string3, string2, string);
            if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
                IAlog.m9034b("Firing Event 999 for %s", string);
                C2968n.C2969a aVar = new C2968n.C2969a(C2967m.IA_UNCAUGHT_EXCEPTION);
                aVar.mo18433a(new C2968n.C2971b().mo18438a("exception_name", string3).mo18438a("description", string2).mo18438a("stack_trace", string));
                aVar.mo18436b(string4);
                sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove("FyberNameKey").apply();
            }
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    C3657l.m9115a(th, sharedPreferences);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
            IAConfigManager.m5929c().mo18055b(C2906a.f6877a);
            IAConfigManager.m5929c().mo18054a(C2906a.f6877a);
            return;
        }
        IAlog.m9034b("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
        m6495b(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m6495b(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (C2906a.f6877a.f6870c != null && fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            C2968n.C2969a aVar = new C2968n.C2969a(C2966l.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (C3018e) null);
            if (!TextUtils.isEmpty(str)) {
                aVar.mo18435a("message", str);
            }
            aVar.mo18435a("init_status", fyberInitStatus.name());
            aVar.mo18436b((String) null);
        }
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.m5942m().f9878a = onGlobalImpressionDataListener;
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.m5942m().f9878a = null;
    }

    public static void destroy() {
        IAlog.m9034b("InneractiveAdManager:destroy called", new Object[0]);
        if (C2906a.f6877a.f6870c == null) {
            IAlog.m9034b("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        C2906a.f6877a.f6870c = null;
        IAConfigManager.removeListener(f6867b);
        f6867b = null;
        IAConfigManager.m5942m().f9878a = null;
        C3625af.m9048a();
        IAConfigManager.m5911a();
        C3691w a = C3691w.m9191a();
        a.f9991c.clear();
        for (Context context : a.f9990b.keySet()) {
            Pair pair = a.f9990b.get(context);
            if (((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        a.f9990b.clear();
        C3681t.C3683a.f9976a.mo19595a();
        C2727c.C2728a.f6415a.f6414a.clear();
        C2724b.C2726b.f6413a.f6412a.clear();
        C2730d.C2732b.f6417a.f6416a.clear();
        InneractiveAdSpotManager.destroy();
        C3657l.m9126q();
    }

    public static void setLogLevel(int i) {
        IAlog.f9870a = i;
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.m5916a(inneractiveUserConfig);
    }

    public final Context getAppContext() {
        return this.f6870c;
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, GdprConsentSource.Internal);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setGdprConsent(boolean r5, com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource r6) {
        /*
            com.fyber.inneractive.sdk.config.d r0 = com.fyber.inneractive.sdk.config.IAConfigManager.m5936g()
            r1 = 0
            if (r0 == 0) goto L_0x0059
            com.fyber.inneractive.sdk.config.d r0 = com.fyber.inneractive.sdk.config.IAConfigManager.m5936g()
            android.app.Application r2 = com.fyber.inneractive.sdk.util.C3657l.m9125p()
            java.lang.String r3 = "SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed."
            if (r2 != 0) goto L_0x0019
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r3, r5)
            return
        L_0x0019:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r0.f6574a = r2
            android.app.Application r2 = com.fyber.inneractive.sdk.util.C3657l.m9125p()
            if (r2 == 0) goto L_0x003d
            r0.mo18026a()
            android.content.SharedPreferences r2 = r0.f6579f
            if (r2 == 0) goto L_0x003d
            android.content.SharedPreferences r2 = r0.f6579f
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "IAGDPRBool"
            android.content.SharedPreferences$Editor r5 = r2.putBoolean(r4, r5)
            r5.apply()
            r5 = 1
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            if (r5 != 0) goto L_0x0045
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r3, r5)
        L_0x0045:
            r0.f6576c = r6
            java.lang.String r5 = r6.name()
            java.lang.String r6 = "IAGdprSource"
            boolean r5 = r0.mo18027a(r6, r5)
            if (r5 != 0) goto L_0x0058
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r3, r5)
        L_0x0058:
            return
        L_0x0059:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "setGdprConsent() was invoked, but Fyber SDK was not properly initialized"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.external.InneractiveAdManager.setGdprConsent(boolean, com.fyber.inneractive.sdk.external.InneractiveAdManager$GdprConsentSource):void");
    }

    public static GdprConsentSource getGdprStatusSource() {
        if (IAConfigManager.m5936g() != null) {
            return IAConfigManager.m5936g().f6576c;
        }
        IAlog.m9036d("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    public static Boolean getGdprConsent() {
        return IAConfigManager.m5936g().mo18028b();
    }

    public static void setGdprConsentString(String str) {
        if (IAConfigManager.m5936g() != null) {
            C2786d g = IAConfigManager.m5936g();
            if (C3657l.m9125p() == null) {
                IAlog.m9036d("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            g.f6575b = str;
            if (!g.mo18027a("IAGdprConsentData", g.f6575b)) {
                IAlog.m9036d("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m9036d("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setUSPrivacyString(String str) {
        if (IAConfigManager.m5936g() != null) {
            C2786d g = IAConfigManager.m5936g();
            if (C3657l.m9125p() == null) {
                IAlog.m9036d("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            g.f6578e = str;
            if (!g.mo18027a("IACCPAConsentData", g.f6578e)) {
                IAlog.m9036d("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m9036d("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearGdprConsentData() {
        if (IAConfigManager.m5936g() != null) {
            C2786d g = IAConfigManager.m5936g();
            IAlog.m9034b("Clearing GDPR Consent String and status", new Object[0]);
            if (C3657l.m9125p() == null) {
                IAlog.m9036d("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            g.mo18026a();
            g.f6574a = null;
            g.f6575b = null;
            if (g.f6579f != null) {
                g.f6579f.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
                return;
            }
            return;
        }
        IAlog.m9036d("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearUSPrivacyString() {
        C2786d g = IAConfigManager.m5936g();
        IAlog.m9034b("Clearing CCPA Consent String", new Object[0]);
        if (C3657l.m9125p() == null) {
            IAlog.m9036d("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        g.mo18026a();
        g.f6578e = null;
        if (g.f6579f != null) {
            g.f6579f.edit().remove("IACCPAConsentData").apply();
        }
    }

    public static void useSecureConnections(boolean z) {
        IAConfigManager.m5920a(z);
    }

    public static void setUserId(String str) {
        IAConfigManager.m5926b(str);
    }

    public static String getUserId() {
        return IAConfigManager.m5944o();
    }

    public static void setUseLocation(boolean z) {
        IAConfigManager.m5927b(z);
    }

    public final void onGlobalConfigChanged(C2792j jVar, C2791i iVar) {
        if (iVar != null && iVar.mo18049a(GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT, false)) {
            C3662m.m9137a().post(new Runnable() {
                public final void run() {
                    if (!IAConfigManager.m5949t()) {
                        IAConfigManager.m5950u();
                        new C2968n.C2969a(C2967m.FIRST_OPENED, (InneractiveAdRequest) null, (C3018e) null).mo18436b((String) null);
                    }
                }
            });
        }
    }

    public static String getAppId() {
        return IAConfigManager.f6419n.f6432d;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        C2906a.f6877a.f6869a = str;
    }

    @Deprecated
    public static String getDevPlatform() {
        return C2906a.f6877a.f6869a;
    }

    public static boolean wasInitialized() {
        return C2906a.f6877a.f6870c != null;
    }
}
