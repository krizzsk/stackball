package com.amazon.device.ads;

import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;

class MobileAdsLogger implements Logger {
    private static final String DEFAULT_LOGTAG_PREFIX = "AmazonMobileAds";
    private static final int DEFAULT_MAX_LENGTH = 1000;
    static final String LOGGING_ENABLED = "loggingEnabled";
    private final DebugProperties debugProperties;
    private final Logger logger;
    private int maxLength;
    private final Settings settings;

    public enum Level {
        DEBUG,
        ERROR,
        INFO,
        VERBOSE,
        WARN
    }

    public MobileAdsLogger(Logger logger2) {
        this(logger2, DebugProperties.getInstance(), Settings.getInstance());
    }

    MobileAdsLogger(Logger logger2, DebugProperties debugProperties2, Settings settings2) {
        this.maxLength = 1000;
        this.logger = logger2.withLogTag(DEFAULT_LOGTAG_PREFIX);
        this.debugProperties = debugProperties2;
        this.settings = settings2;
    }

    public MobileAdsLogger withMaxLength(int i) {
        this.maxLength = i;
        return this;
    }

    public MobileAdsLogger withLogTag(String str) {
        Logger logger2 = this.logger;
        logger2.withLogTag("AmazonMobileAds " + str);
        return this;
    }

    public void enableLogging(boolean z) {
        this.settings.putTransientBoolean(LOGGING_ENABLED, z);
    }

    public boolean canLog() {
        DebugProperties debugProperties2;
        if (this.logger == null || (debugProperties2 = this.debugProperties) == null) {
            return false;
        }
        return debugProperties2.getDebugPropertyAsBoolean(DebugProperties.DEBUG_LOGGING, Boolean.valueOf(this.settings.getBoolean(LOGGING_ENABLED, false))).booleanValue();
    }

    public final void enableLoggingWithSetterNotification(boolean z) {
        if (!z) {
            logSetterNotification("Debug logging", Boolean.valueOf(z));
        }
        enableLogging(z);
        if (z) {
            logSetterNotification("Debug logging", Boolean.valueOf(z));
            mo11019d("Amazon Mobile Ads API Version: %s", Version.getRawSDKVersion());
        }
    }

    public void logSetterNotification(String str, Object obj) {
        if (canLog()) {
            if (obj instanceof Boolean) {
                Object[] objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = ((Boolean) obj).booleanValue() ? TJAdUnitConstants.String.ENABLED : "disabled";
                mo11019d("%s has been %s.", objArr);
                return;
            }
            mo11019d("%s has been set: %s", str, String.valueOf(obj));
        }
    }

    /* renamed from: i */
    public void mo11024i(String str, Object... objArr) {
        log(Level.INFO, str, objArr);
    }

    /* renamed from: v */
    public void mo11027v(String str, Object... objArr) {
        log(Level.VERBOSE, str, objArr);
    }

    /* renamed from: d */
    public void mo11019d(String str, Object... objArr) {
        log(Level.DEBUG, str, objArr);
    }

    /* renamed from: w */
    public void mo11028w(String str, Object... objArr) {
        log(Level.WARN, str, objArr);
    }

    /* renamed from: e */
    public void mo11020e(String str, Object... objArr) {
        log(Level.ERROR, str, objArr);
    }

    /* renamed from: i */
    public void mo10940i(String str) {
        mo11024i(str, (Object[]) null);
    }

    /* renamed from: v */
    public void mo10941v(String str) {
        mo11027v(str, (Object[]) null);
    }

    /* renamed from: d */
    public void mo10938d(String str) {
        mo11019d(str, (Object[]) null);
    }

    /* renamed from: w */
    public void mo10942w(String str) {
        mo11028w(str, (Object[]) null);
    }

    /* renamed from: e */
    public void mo10939e(String str) {
        mo11020e(str, (Object[]) null);
    }

    public void log(Level level, String str, Object... objArr) {
        doLog(false, level, str, objArr);
    }

    public void forceLog(Level level, String str, Object... objArr) {
        doLog(true, level, str, objArr);
    }

    private void doLog(boolean z, Level level, String str, Object... objArr) {
        if (canLog() || z) {
            for (String next : formatAndSplit(str, objArr)) {
                int i = C09701.$SwitchMap$com$amazon$device$ads$MobileAdsLogger$Level[level.ordinal()];
                if (i == 1) {
                    this.logger.mo10938d(next);
                } else if (i == 2) {
                    this.logger.mo10939e(next);
                } else if (i == 3) {
                    this.logger.mo10940i(next);
                } else if (i == 4) {
                    this.logger.mo10941v(next);
                } else if (i == 5) {
                    this.logger.mo10942w(next);
                }
            }
        }
    }

    /* renamed from: com.amazon.device.ads.MobileAdsLogger$1 */
    static /* synthetic */ class C09701 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MobileAdsLogger$Level;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.amazon.device.ads.MobileAdsLogger$Level[] r0 = com.amazon.device.ads.MobileAdsLogger.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$MobileAdsLogger$Level = r0
                com.amazon.device.ads.MobileAdsLogger$Level r1 = com.amazon.device.ads.MobileAdsLogger.Level.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MobileAdsLogger$Level     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.MobileAdsLogger$Level r1 = com.amazon.device.ads.MobileAdsLogger.Level.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MobileAdsLogger$Level     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.MobileAdsLogger$Level r1 = com.amazon.device.ads.MobileAdsLogger.Level.INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MobileAdsLogger$Level     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.MobileAdsLogger$Level r1 = com.amazon.device.ads.MobileAdsLogger.Level.VERBOSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MobileAdsLogger$Level     // Catch:{ NoSuchFieldError -> 0x003e }
                com.amazon.device.ads.MobileAdsLogger$Level r1 = com.amazon.device.ads.MobileAdsLogger.Level.WARN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.MobileAdsLogger.C09701.<clinit>():void");
        }
    }

    private Iterable<String> formatAndSplit(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return split(str, this.maxLength);
    }

    private Iterable<String> split(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (!(str == null || str.length() == 0)) {
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = i2 + i;
                arrayList.add(str.substring(i2, Math.min(str.length(), i3)));
                i2 = i3;
            }
        }
        return arrayList;
    }
}
