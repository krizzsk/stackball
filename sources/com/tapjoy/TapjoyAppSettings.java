package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.internal.C9465jq;

public class TapjoyAppSettings {
    public static final String TAG = TapjoyAppSettings.class.getSimpleName();

    /* renamed from: b */
    private static TapjoyAppSettings f22135b;

    /* renamed from: a */
    String f22136a;

    /* renamed from: c */
    private Context f22137c;

    /* renamed from: d */
    private SharedPreferences f22138d;

    private TapjoyAppSettings(Context context) {
        this.f22137c = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        this.f22138d = sharedPreferences;
        String string = sharedPreferences.getString(TapjoyConstants.PREF_LOG_LEVEL, (String) null);
        this.f22136a = string;
        if (!C9465jq.m25449c(string)) {
            String str = TAG;
            TapjoyLog.m24273d(str, "restoreLoggingLevel from sharedPref -- loggingLevel=" + this.f22136a);
            TapjoyLog.m24272a(this.f22136a, true);
        }
    }

    public static TapjoyAppSettings getInstance() {
        return f22135b;
    }

    public static void init(Context context) {
        TapjoyLog.m24273d(TAG, "initializing app settings");
        f22135b = new TapjoyAppSettings(context);
    }

    public void saveLoggingLevel(String str) {
        if (C9465jq.m25449c(str)) {
            TapjoyLog.m24273d(TAG, "saveLoggingLevel -- server logging level is NULL or Empty string");
            return;
        }
        String str2 = TAG;
        TapjoyLog.m24273d(str2, "saveLoggingLevel -- currentLevel=" + this.f22136a + ";newLevel=" + str);
        if (C9465jq.m25449c(this.f22136a) || !this.f22136a.equals(str)) {
            SharedPreferences.Editor edit = this.f22138d.edit();
            edit.putString(TapjoyConstants.PREF_LOG_LEVEL, str);
            edit.apply();
            this.f22136a = str;
            TapjoyLog.m24272a(str, true);
        }
        boolean isLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging set to '");
        sb.append(str);
        sb.append("'. The SDK Debug-setting is: ");
        sb.append(isLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.m24276i(str3, sb.toString());
    }

    public void clearLoggingLevel() {
        SharedPreferences.Editor edit = this.f22138d.edit();
        edit.remove(TapjoyConstants.PREF_LOG_LEVEL);
        edit.apply();
        this.f22136a = null;
        boolean isLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging 'Disabled'. The SDK Debug-setting is: ");
        sb.append(isLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.m24276i(str, sb.toString());
        TapjoyLog.setDebugEnabled(isLoggingEnabled);
    }

    public void saveConnectResultAndParams(String str, String str2, long j) {
        if (!C9465jq.m25449c(str) && !C9465jq.m25449c(str2)) {
            SharedPreferences.Editor edit = this.f22138d.edit();
            edit.putString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, str);
            edit.putString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, str2);
            if (j >= 0) {
                edit.putLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, j);
            } else {
                edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
            }
            TapjoyLog.m24276i(TAG, "Stored connect result");
            edit.apply();
        }
    }

    public void removeConnectResult() {
        if (this.f22138d.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, (String) null) != null) {
            SharedPreferences.Editor edit = this.f22138d.edit();
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT);
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH);
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
            TapjoyLog.m24276i(TAG, "Removed connect result");
            edit.apply();
        }
    }

    public String getConnectResult(String str, long j) {
        String string = this.f22138d.getString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, (String) null);
        if (!C9465jq.m25449c(string) && !C9465jq.m25449c(str) && str.equals(this.f22138d.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, (String) null))) {
            long j2 = this.f22138d.getLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, -1);
            if (j2 < 0 || j2 >= j) {
                return string;
            }
        }
        return null;
    }
}
