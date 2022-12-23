package com.amazon.device.ads;

import android.content.Context;
import java.io.File;

class MobileAdsInfoStore {
    private static MobileAdsInfoStore instance = new MobileAdsInfoStore(Settings.getInstance(), DebugProperties.getInstance());
    private AppInfo appInfo;
    protected Context applicationContext;
    private boolean contextReceived;
    private final DebugProperties debugProperties;
    private DeviceInfo deviceInfo;
    private File filesDirectory;
    private boolean isAppDisabled = false;
    private boolean isRegistered;
    private long noRetryTtlExpiresMillis;
    private int noRetryTtlMillis;
    private RegistrationInfo registrationInfo;
    private final Settings settings;
    private SISRegistration sisRegistration;

    protected MobileAdsInfoStore(Settings settings2, DebugProperties debugProperties2) {
        this.settings = settings2;
        this.debugProperties = debugProperties2;
        this.registrationInfo = new RegistrationInfo();
    }

    public static MobileAdsInfoStore getInstance() {
        return instance;
    }

    static void setMobileAdsInfoStore(MobileAdsInfoStore mobileAdsInfoStore) {
        instance = mobileAdsInfoStore;
    }

    public AppInfo getAppInfo() {
        return this.appInfo;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public RegistrationInfo getRegistrationInfo() {
        return this.registrationInfo;
    }

    public synchronized void contextReceived(Context context) {
        if (!this.contextReceived) {
            this.contextReceived = true;
            setApplicationContextFromContext(context);
            setFilesDirectory(context);
            this.settings.contextReceived(context);
            createAppInfo(context);
            this.deviceInfo = createDeviceInfo(context);
            createSISRegistration();
        }
    }

    public boolean isContextReceived() {
        return this.contextReceived;
    }

    /* access modifiers changed from: protected */
    public void setFilesDirectory(Context context) {
        this.filesDirectory = context.getFilesDir();
    }

    /* access modifiers changed from: protected */
    public void createAppInfo(Context context) {
        this.appInfo = new AppInfo(context);
    }

    /* access modifiers changed from: protected */
    public DeviceInfo createDeviceInfo(Context context) {
        return new DeviceInfo(context, new UserAgentManager());
    }

    public void register() {
        getSISRegistration().registerApp();
        this.isRegistered = true;
    }

    /* access modifiers changed from: protected */
    public void createSISRegistration() {
        this.sisRegistration = new SISRegistration();
    }

    public SISRegistration getSISRegistration() {
        return this.sisRegistration;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public int getNoRetryTtlRemainingMillis() {
        if (this.noRetryTtlMillis == 0 || this.noRetryTtlExpiresMillis == 0) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.noRetryTtlExpiresMillis;
        if (currentTimeMillis < j) {
            return (int) (j - currentTimeMillis);
        }
        this.noRetryTtlMillis = 0;
        this.noRetryTtlExpiresMillis = 0;
        return 0;
    }

    public void setNoRetryTtl(int i) {
        int intValue = this.debugProperties.getDebugPropertyAsInteger(DebugProperties.DEBUG_NORETRYTTL_MAX, 300000).intValue();
        if (intValue < i) {
            i = intValue;
        }
        if (i == 0) {
            this.noRetryTtlMillis = 0;
            this.noRetryTtlExpiresMillis = 0;
            return;
        }
        this.noRetryTtlMillis = i * 1000;
        this.noRetryTtlExpiresMillis = System.currentTimeMillis() + ((long) this.noRetryTtlMillis);
    }

    public boolean getIsAppDisabled() {
        return this.isAppDisabled;
    }

    public void setIsAppDisabled(boolean z) {
        this.isAppDisabled = z;
    }

    public File getFilesDir() {
        return this.filesDirectory;
    }

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    /* access modifiers changed from: protected */
    public void setApplicationContextFromContext(Context context) {
        this.applicationContext = context.getApplicationContext();
    }
}
