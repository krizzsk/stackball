package com.ironsource.mediationsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.C5749e;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ironsource.mediationsdk.utils.h */
public final class C5798h implements Runnable {

    /* renamed from: A */
    private final String f13954A = "mnc";

    /* renamed from: B */
    private final String f13955B = "icc";

    /* renamed from: C */
    private final String f13956C = "tz";

    /* renamed from: D */
    private final String f13957D = "auid";

    /* renamed from: E */
    private Context f13958E;

    /* renamed from: a */
    private final String f13959a = getClass().getSimpleName();

    /* renamed from: b */
    private final String f13960b = "bundleId";

    /* renamed from: c */
    private final String f13961c = "advertisingId";

    /* renamed from: d */
    private final String f13962d = "isLimitAdTrackingEnabled";

    /* renamed from: e */
    private final String f13963e = "appKey";

    /* renamed from: f */
    private final String f13964f = "deviceOS";

    /* renamed from: g */
    private final String f13965g = "osVersion";

    /* renamed from: h */
    private final String f13966h = "connectionType";

    /* renamed from: i */
    private final String f13967i = "language";

    /* renamed from: j */
    private final String f13968j = "deviceOEM";

    /* renamed from: k */
    private final String f13969k = "deviceModel";

    /* renamed from: l */
    private final String f13970l = "mobileCarrier";

    /* renamed from: m */
    private final String f13971m = "externalFreeMemory";

    /* renamed from: n */
    private final String f13972n = "internalFreeMemory";

    /* renamed from: o */
    private final String f13973o = "battery";

    /* renamed from: p */
    private final String f13974p = "gmtMinutesOffset";

    /* renamed from: q */
    private final String f13975q = "appVersion";

    /* renamed from: r */
    private final String f13976r = "sessionId";

    /* renamed from: s */
    private final String f13977s = "pluginType";

    /* renamed from: t */
    private final String f13978t = "pluginVersion";

    /* renamed from: u */
    private final String f13979u = "plugin_fw_v";

    /* renamed from: v */
    private final String f13980v = "jb";

    /* renamed from: w */
    private final String f13981w = "advertisingIdType";

    /* renamed from: x */
    private final String f13982x = "mt";

    /* renamed from: y */
    private final String f13983y = "firstSession";

    /* renamed from: z */
    private final String f13984z = "mcc";

    private C5798h() {
    }

    public C5798h(Context context) {
        this.f13958E = context.getApplicationContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0212  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.Object> m14325a() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()
            java.lang.String r3 = "sessionId"
            r1.put(r3, r2)
            java.lang.String r2 = r9.m14329e()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = "bundleId"
            r1.put(r3, r2)
            android.content.Context r3 = r9.f13958E
            java.lang.String r2 = com.ironsource.environment.C5517c.m13106c(r3, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = "appVersion"
            r1.put(r3, r2)
        L_0x0030:
            com.ironsource.mediationsdk.E r2 = com.ironsource.mediationsdk.C5556E.m13257a()
            java.lang.String r2 = r2.f12854j
            java.lang.String r3 = "appKey"
            r1.put(r3, r2)
            r2 = 1
            r3 = 0
            android.content.Context r4 = r9.f13958E     // Catch:{ Exception -> 0x005a }
            java.lang.String[] r4 = com.ironsource.environment.C5527g.m13136a((android.content.Context) r4)     // Catch:{ Exception -> 0x005a }
            r5 = r4[r3]     // Catch:{ Exception -> 0x005a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x005a }
            if (r5 != 0) goto L_0x004e
            r5 = r4[r3]     // Catch:{ Exception -> 0x005a }
            goto L_0x004f
        L_0x004e:
            r5 = r0
        L_0x004f:
            r4 = r4[r2]     // Catch:{ Exception -> 0x005b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x005b }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x005b }
            goto L_0x005c
        L_0x005a:
            r5 = r0
        L_0x005b:
            r4 = 0
        L_0x005c:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0065
            java.lang.String r0 = "GAID"
            goto L_0x0073
        L_0x0065:
            android.content.Context r5 = r9.f13958E
            java.lang.String r5 = com.ironsource.environment.C5527g.m13180y(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0073
            java.lang.String r0 = "UUID"
        L_0x0073:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x008c
            java.lang.String r6 = "advertisingId"
            r1.put(r6, r5)
            java.lang.String r5 = "advertisingIdType"
            r1.put(r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.String r4 = "isLimitAdTrackingEnabled"
            r1.put(r4, r0)
        L_0x008c:
            java.lang.String r0 = "deviceOS"
            java.lang.String r4 = "Android"
            r1.put(r0, r4)
            java.lang.String r0 = m14330f()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = m14330f()
            java.lang.String r4 = "osVersion"
            r1.put(r4, r0)
        L_0x00a6:
            android.content.Context r0 = r9.f13958E
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getConnectionType(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00b7
            java.lang.String r4 = "connectionType"
            r1.put(r4, r0)
        L_0x00b7:
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()
            java.lang.String r4 = "sdkVersion"
            r1.put(r4, r0)
            java.lang.String r0 = m14331g()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00cf
            java.lang.String r4 = "language"
            r1.put(r4, r0)
        L_0x00cf:
            java.lang.String r0 = m14332h()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00de
            java.lang.String r4 = "deviceOEM"
            r1.put(r4, r0)
        L_0x00de:
            java.lang.String r0 = m14333i()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00ed
            java.lang.String r4 = "deviceModel"
            r1.put(r4, r0)
        L_0x00ed:
            java.lang.String r0 = r9.m14334j()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00fc
            java.lang.String r4 = "mobileCarrier"
            r1.put(r4, r0)
        L_0x00fc:
            long r4 = m14336l()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "internalFreeMemory"
            r1.put(r4, r0)
            boolean r0 = m14335k()
            if (r0 == 0) goto L_0x012d
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            android.os.StatFs r4 = new android.os.StatFs
            java.lang.String r0 = r0.getPath()
            r4.<init>(r0)
            int r0 = r4.getBlockSize()
            long r5 = (long) r0
            int r0 = r4.getAvailableBlocks()
            long r7 = (long) r0
            long r7 = r7 * r5
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r7 = r7 / r4
            goto L_0x012f
        L_0x012d:
            r7 = -1
        L_0x012f:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.String r4 = "externalFreeMemory"
            r1.put(r4, r0)
            int r0 = r9.m14337m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "battery"
            r1.put(r4, r0)
            int r0 = r9.m14338n()
            r4 = 840(0x348, float:1.177E-42)
            if (r0 > r4) goto L_0x0156
            r4 = -720(0xfffffffffffffd30, float:NaN)
            if (r0 < r4) goto L_0x0156
            int r4 = r0 % 15
            if (r4 != 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r2 = 0
        L_0x0157:
            if (r2 == 0) goto L_0x0162
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "gmtMinutesOffset"
            r1.put(r2, r0)
        L_0x0162:
            java.lang.String r0 = m14326b()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0171
            java.lang.String r2 = "pluginType"
            r1.put(r2, r0)
        L_0x0171:
            java.lang.String r0 = m14327c()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0180
            java.lang.String r2 = "pluginVersion"
            r1.put(r2, r0)
        L_0x0180:
            java.lang.String r0 = m14328d()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x018f
            java.lang.String r2 = "plugin_fw_v"
            r1.put(r2, r0)
        L_0x018f:
            boolean r0 = com.ironsource.environment.C5527g.m13156j()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01a2
            java.lang.String r2 = "jb"
            r1.put(r2, r0)
        L_0x01a2:
            com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.C5556E.m13257a()
            java.lang.String r0 = r0.f12859o
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01b3
            java.lang.String r2 = "mt"
            r1.put(r2, r0)
        L_0x01b3:
            android.content.Context r0 = r9.f13958E
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSession(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01c8
            java.lang.String r2 = "firstSession"
            r1.put(r2, r0)
        L_0x01c8:
            android.content.Context r0 = r9.f13958E
            java.lang.String r0 = com.ironsource.environment.C5527g.m13181z(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "auid"
            r1.put(r2, r0)
        L_0x01d9:
            android.content.Context r0 = r9.f13958E
            int r0 = com.ironsource.environment.C5505a.C55061.m13080c((android.content.Context) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "mcc"
            r1.put(r2, r0)
            android.content.Context r0 = r9.f13958E
            int r0 = com.ironsource.environment.C5505a.C55061.m13083d(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "mnc"
            r1.put(r2, r0)
            android.content.Context r0 = r9.f13958E
            java.lang.String r0 = com.ironsource.environment.C5527g.m13158k(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0208
            java.lang.String r2 = "icc"
            r1.put(r2, r0)
        L_0x0208:
            java.lang.String r0 = com.ironsource.environment.C5527g.m13140c()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0217
            java.lang.String r2 = "tz"
            r1.put(r2, r0)
        L_0x0217:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "collecting data for events: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.info(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C5798h.m14325a():java.util.Map");
    }

    /* renamed from: b */
    private static String m14326b() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    /* renamed from: c */
    private static String m14327c() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    /* renamed from: d */
    private static String m14328d() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    /* renamed from: e */
    private String m14329e() {
        try {
            return this.f13958E.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    private static String m14330f() {
        try {
            String str = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            return i + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    private static String m14331g() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    private static String m14332h() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    private static String m14333i() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: j */
    private String m14334j() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f13958E.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f13959a + ":getMobileCarrier()", e);
            return "";
        }
    }

    /* renamed from: k */
    private static boolean m14335k() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static long m14336l() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: m */
    private int m14337m() {
        try {
            Intent registerReceiver = this.f13958E.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("scale", -1);
            }
            if (intExtra == -1 || i == -1) {
                return -1;
            }
            return (int) ((((float) intExtra) / ((float) i)) * 100.0f);
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f13959a + ":getBatteryLevel()", e);
            return -1;
        }
    }

    /* renamed from: n */
    private int m14338n() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round((float) (((timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15)) * 15;
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f13959a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    public final void run() {
        try {
            C5749e.m14210a().mo42054a(m14325a());
            IronSourceUtils.saveGeneralProperties(this.f13958E, C5749e.m14210a().mo42055b());
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "Thread name = " + getClass().getSimpleName(), e);
        }
    }
}
