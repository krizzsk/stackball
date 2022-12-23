package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(mo72092d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0002J$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo72093d2 = {"Lcom/facebook/appevents/internal/SessionLogger;", "", "()V", "INACTIVE_SECONDS_QUANTA", "", "PACKAGE_CHECKSUM", "", "TAG", "computePackageChecksum", "context", "Landroid/content/Context;", "getQuantaIndex", "", "timeBetweenSessions", "", "logActivateApp", "", "activityName", "sourceApplicationInfo", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "appId", "logClockSkewEvent", "logDeactivateApp", "sessionInfo", "Lcom/facebook/appevents/internal/SessionInfo;", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: SessionLogger.kt */
public final class SessionLogger {
    private static final long[] INACTIVE_SECONDS_QUANTA = {300000, TapjoyConstants.PAID_APP_TIME, TapjoyConstants.SESSION_ID_INACTIVITY_TIME, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};
    public static final SessionLogger INSTANCE = new SessionLogger();
    private static final String PACKAGE_CHECKSUM = "PCKGCHKSUM";
    private static final String TAG = SessionLogger.class.getCanonicalName();

    private SessionLogger() {
    }

    @JvmStatic
    public static final void logActivateApp(String str, SourceApplicationInfo sourceApplicationInfo, String str2, Context context) {
        String str3;
        Class<SessionLogger> cls = SessionLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(str, "activityName");
                Intrinsics.checkNotNullParameter(context, "context");
                if (sourceApplicationInfo == null || (str3 = sourceApplicationInfo.toString()) == null) {
                    str3 = "Unclassified";
                }
                Bundle bundle = new Bundle();
                bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str3);
                bundle.putString(AppEventsConstants.EVENT_PARAM_PACKAGE_FP, INSTANCE.computePackageChecksum(context));
                bundle.putString(AppEventsConstants.EVENT_PARAM_APP_CERT_HASH, CertificateUtil.getCertificateHash(context));
                InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(str, str2, (AccessToken) null);
                internalAppEventsLogger.logEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, bundle);
                if (InternalAppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                    internalAppEventsLogger.flush();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void logDeactivateApp(String str, SessionInfo sessionInfo, String str2) {
        long j;
        String str3;
        String str4 = str;
        Class<SessionLogger> cls = SessionLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(str, "activityName");
                if (sessionInfo != null) {
                    Long diskRestoreTime = sessionInfo.getDiskRestoreTime();
                    long j2 = 0;
                    if (diskRestoreTime != null) {
                        j = diskRestoreTime.longValue();
                    } else {
                        Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                        j = 0 - (sessionLastEventTime != null ? sessionLastEventTime.longValue() : 0);
                    }
                    if (j < 0) {
                        INSTANCE.logClockSkewEvent();
                        j = 0;
                    }
                    long sessionLength = sessionInfo.getSessionLength();
                    if (sessionLength < 0) {
                        INSTANCE.logClockSkewEvent();
                        sessionLength = 0;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(AppEventsConstants.EVENT_NAME_SESSION_INTERRUPTIONS, sessionInfo.getInterruptionCount());
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(getQuantaIndex(j))}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    bundle.putString(AppEventsConstants.EVENT_NAME_TIME_BETWEEN_SESSIONS, format);
                    SourceApplicationInfo sourceApplicationInfo = sessionInfo.getSourceApplicationInfo();
                    if (sourceApplicationInfo == null || (str3 = sourceApplicationInfo.toString()) == null) {
                        str3 = "Unclassified";
                    }
                    bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str3);
                    Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
                    if (sessionLastEventTime2 != null) {
                        j2 = sessionLastEventTime2.longValue();
                    }
                    bundle.putLong(Constants.LOG_TIME_APP_EVENT_KEY, j2 / ((long) 1000));
                    new InternalAppEventsLogger(str, str2, (AccessToken) null).logEvent(AppEventsConstants.EVENT_NAME_DEACTIVATED_APP, ((double) sessionLength) / ((double) 1000), bundle);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void logClockSkewEvent() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String str = TAG;
                Intrinsics.checkNotNull(str);
                companion.log(loggingBehavior, str, "Clock skew detected");
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @JvmStatic
    public static final int getQuantaIndex(long j) {
        Class<SessionLogger> cls = SessionLogger.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return 0;
        }
        int i = 0;
        while (i < INACTIVE_SECONDS_QUANTA.length && INACTIVE_SECONDS_QUANTA[i] < j) {
            try {
                i++;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
                return 0;
            }
        }
        return i;
    }

    public final String computePackageChecksum(Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
                SharedPreferences sharedPreferences = context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
                String string = sharedPreferences.getString(str, (String) null);
                if (string != null && string.length() == 32) {
                    return string;
                }
                String computeChecksumWithPackageManager = HashUtils.computeChecksumWithPackageManager(context, (Long) null);
                if (computeChecksumWithPackageManager == null) {
                    computeChecksumWithPackageManager = HashUtils.computeChecksum(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                }
                sharedPreferences.edit().putString(str, computeChecksumWithPackageManager).apply();
                return computeChecksumWithPackageManager;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
