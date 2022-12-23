package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.c */
public final class C5685c {

    /* renamed from: d */
    private static final C5685c f13528d = new C5685c();

    /* renamed from: e */
    private static final Object f13529e = new Object();

    /* renamed from: a */
    String f13530a;

    /* renamed from: b */
    String f13531b;

    /* renamed from: c */
    final ConcurrentHashMap<String, List<String>> f13532c = new ConcurrentHashMap<>();

    /* renamed from: f */
    private final ConcurrentHashMap<String, AbstractAdapter> f13533f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f13534g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private Boolean f13535h;

    /* renamed from: i */
    private Boolean f13536i;

    /* renamed from: j */
    private final AtomicBoolean f13537j = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.c$1 */
    static /* synthetic */ class C56861 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13538a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13538a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13538a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5685c.C56861.<clinit>():void");
        }
    }

    private C5685c() {
    }

    /* renamed from: a */
    private AbstractAdapter m13963a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + str2.toLowerCase(Locale.ENGLISH) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            m13968a(str3);
            return null;
        }
    }

    /* renamed from: a */
    private AdapterBaseInterface m13964a(String str, String str2, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + str2;
            try {
                BaseAdapter baseAdapter = (BaseAdapter) Class.forName(str3).newInstance();
                IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
                if (this.f13536i != null && (baseAdapter instanceof AdapterDebugInterface)) {
                    try {
                        baseAdapter.setAdapterDebug(this.f13536i.booleanValue());
                    } catch (Exception e) {
                        String str4 = "error while setting adapterDebug of " + baseAdapter.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                        m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
                        m13971b(str4);
                        e.printStackTrace();
                    }
                }
                this.f13534g.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
                return baseAdapter;
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String str5 = "failed to load " + str3;
                    IronLog.INTERNAL.error(str5);
                    m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str5);
                }
                return null;
            }
        } else {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
    }

    /* renamed from: a */
    public static C5685c m13965a() {
        return f13528d;
    }

    /* renamed from: a */
    private static void m13966a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
            }
            C5642d.m13798e().mo41689b(new C5641c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m13967a(AbstractAdapter abstractAdapter) {
        try {
            if (this.f13535h != null) {
                abstractAdapter.setConsent(this.f13535h.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
            m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            m13971b(str);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m13968a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 3);
    }

    /* renamed from: b */
    private static String m13969b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    /* renamed from: b */
    private void m13970b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f13536i;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                m13971b(str);
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private static void m13971b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 0);
    }

    /* renamed from: c */
    private BaseAdAdapter<?> m13972c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
            try {
                return (BaseAdAdapter) Class.forName(str).getConstructor(new Class[]{NetworkSettings.class}).newInstance(new Object[]{networkSettings});
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String str2 = "failed to load " + str;
                    IronLog.INTERNAL.error(str2);
                    m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                }
                return null;
            }
        } else {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
    }

    /* renamed from: c */
    private void m13973c(AbstractAdapter abstractAdapter) {
        for (String next : this.f13532c.keySet()) {
            try {
                List list = this.f13532c.get(next);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + next + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(next, (List<String>) list);
                }
            } catch (Throwable th) {
                String str = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                m13971b(str);
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final AbstractAdapter mo41823a(NetworkSettings networkSettings) {
        String b = m13969b(networkSettings);
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.f13533f.get(b) : m13963a(b, networkSettings.getProviderTypeForReflection());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.AbstractAdapter mo41824a(com.ironsource.mediationsdk.model.NetworkSettings r7, org.json.JSONObject r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = m13969b((com.ironsource.mediationsdk.model.NetworkSettings) r7)
            if (r9 == 0) goto L_0x0009
            java.lang.String r7 = "IronSource"
            goto L_0x000d
        L_0x0009:
            java.lang.String r7 = r7.getProviderTypeForReflection()
        L_0x000d:
            java.lang.Object r9 = f13529e
            monitor-enter(r9)
            if (r10 != 0) goto L_0x0024
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r1 = r6.f13533f     // Catch:{ all -> 0x0112 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0024
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r7 = r6.f13533f     // Catch:{ all -> 0x0112 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0112 }
            com.ironsource.mediationsdk.AbstractAdapter r7 = (com.ironsource.mediationsdk.AbstractAdapter) r7     // Catch:{ all -> 0x0112 }
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            return r7
        L_0x0024:
            com.ironsource.mediationsdk.AbstractAdapter r1 = r6.m13963a((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ all -> 0x0112 }
            if (r1 != 0) goto L_0x0041
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r7.<init>()     // Catch:{ all -> 0x0112 }
            r7.append(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r8 = " adapter was not loaded"
            r7.append(r8)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0112 }
            m13968a((java.lang.String) r7)     // Catch:{ all -> 0x0112 }
            r7 = 0
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            return r7
        L_0x0041:
            r2 = 88001(0x157c1, float:1.23316E-40)
            java.lang.String r3 = r1.getCoreSDKVersion()     // Catch:{ Exception -> 0x0049 }
            goto L_0x0072
        L_0x0049:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = "error while retrieving coreSDKVersion "
            r4.<init>(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r1.getProviderName()     // Catch:{ all -> 0x0112 }
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r3.getLocalizedMessage()     // Catch:{ all -> 0x0112 }
            r4.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0112 }
            m13966a((int) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0112 }
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0112 }
            r4.error(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "Unknown"
        L_0x0072:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r4.<init>()     // Catch:{ all -> 0x0112 }
            r4.append(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = " was allocated (adapter version: "
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r1.getVersion()     // Catch:{ all -> 0x0112 }
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = ", sdk version: "
            r4.append(r5)     // Catch:{ all -> 0x0112 }
            r4.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = ")"
            r4.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0112 }
            m13971b((java.lang.String) r3)     // Catch:{ all -> 0x0112 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0112 }
            r1.setLogListener(r3)     // Catch:{ all -> 0x0112 }
            r6.m13973c(r1)     // Catch:{ all -> 0x0112 }
            r6.m13967a((com.ironsource.mediationsdk.AbstractAdapter) r1)     // Catch:{ all -> 0x0112 }
            r6.m13970b((com.ironsource.mediationsdk.AbstractAdapter) r1)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "SupersonicAds"
            boolean r3 = r7.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0112 }
            if (r3 != 0) goto L_0x00ba
            java.lang.String r3 = "IronSource"
            boolean r3 = r7.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x0109
        L_0x00ba:
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f13537j     // Catch:{ all -> 0x0112 }
            r4 = 0
            r5 = 1
            boolean r3 = r3.compareAndSet(r4, r5)     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x0109
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = "SDK5 earlyInit  <"
            r3.<init>(r4)     // Catch:{ all -> 0x0112 }
            r3.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = ">"
            r3.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0112 }
            m13971b((java.lang.String) r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r6.f13530a     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r3 = r6.f13531b     // Catch:{ Exception -> 0x00e2 }
            r1.earlyInit(r7, r3, r8)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x0109
        L_0x00e2:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "error while calling early init for "
            r8.<init>(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r1.getProviderName()     // Catch:{ all -> 0x0112 }
            r8.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = ": "
            r8.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ all -> 0x0112 }
            r8.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0112 }
            m13966a((int) r2, (java.lang.String) r7)     // Catch:{ all -> 0x0112 }
            com.ironsource.mediationsdk.logger.IronLog r8 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0112 }
            r8.error(r7)     // Catch:{ all -> 0x0112 }
        L_0x0109:
            if (r10 != 0) goto L_0x0110
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r7 = r6.f13533f     // Catch:{ all -> 0x0112 }
            r7.put(r0, r1)     // Catch:{ all -> 0x0112 }
        L_0x0110:
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            return r1
        L_0x0112:
            r7 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5685c.mo41824a(com.ironsource.mediationsdk.model.NetworkSettings, org.json.JSONObject, boolean, boolean):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* renamed from: a */
    public final AdapterBaseInterface mo41825a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        String b = m13969b(networkSettings);
        if (this.f13534g.containsKey(b)) {
            return this.f13534g.get(b).getAdapterBaseInterface();
        }
        AdapterBaseInterface a = m13964a(b, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName((IronSource.AD_UNIT) null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (a != null) {
            return a;
        }
        int i = C56861.f13538a[ad_unit.ordinal()];
        AbstractAdapter a2 = mo41824a(networkSettings, i != 1 ? i != 2 ? i != 3 ? null : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false, true);
        if (a2 != null) {
            C5577J j = new C5577J(a2, networkSettings, ad_unit);
            this.f13534g.put(b, new AdapterBaseWrapper(j, networkSettings));
            return j;
        }
        String str = "error creating network adapter " + networkSettings.getProviderName();
        m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    /* renamed from: a */
    public final void mo41826a(String str, List<String> list) {
        synchronized (f13529e) {
            this.f13532c.put(str, list);
            if (!this.f13533f.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter next : this.f13533f.values()) {
                    try {
                        next.setMetaData(str, list);
                    } catch (Throwable th) {
                        String str2 = "error while setting metadata of " + next.getProviderName() + ": " + th.getLocalizedMessage();
                        m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        m13971b(str2);
                        th.printStackTrace();
                    }
                }
                for (AdapterBaseWrapper next2 : this.f13534g.values()) {
                    AdapterBaseInterface adapterBaseInterface = next2.getAdapterBaseInterface();
                    if (!next2.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                        try {
                            ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                        } catch (Exception e) {
                            String str3 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                            m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                            m13971b(str3);
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41827a(boolean z) {
        synchronized (f13529e) {
            this.f13535h = Boolean.valueOf(z);
            for (AbstractAdapter a : this.f13533f.values()) {
                m13967a(a);
            }
            for (AdapterBaseWrapper next : this.f13534g.values()) {
                AdapterBaseInterface adapterBaseInterface = next.getAdapterBaseInterface();
                if (!next.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterConsentInterface)) {
                    try {
                        ((AdapterConsentInterface) adapterBaseInterface).setConsent(z);
                    } catch (Exception e) {
                        String str = "error while setting consent of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
                        m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        m13971b(str);
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final BaseAdAdapter<?> mo41828b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?> c = m13972c(networkSettings, ad_unit);
        if (c != null) {
            return c;
        }
        AbstractAdapter a = mo41823a(networkSettings);
        if (a != null) {
            return new C5577J(a, networkSettings, ad_unit);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        m13966a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    /* renamed from: b */
    public final void mo41829b(boolean z) {
        synchronized (f13529e) {
            this.f13536i = Boolean.valueOf(z);
            for (AbstractAdapter b : this.f13533f.values()) {
                m13970b(b);
            }
        }
    }
}
