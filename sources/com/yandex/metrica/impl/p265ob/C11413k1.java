package com.yandex.metrica.impl.p265ob;

import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.FragmentTransaction;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.k1 */
public enum C11413k1 {
    EVENT_TYPE_UNDEFINED(-1, "Unrecognized action"),
    EVENT_TYPE_INIT(0, "First initialization event"),
    EVENT_TYPE_REGULAR(1, "Regular event"),
    EVENT_TYPE_UPDATE_FOREGROUND_TIME(3, "Update foreground time"),
    EVENT_TYPE_EXCEPTION_USER(5, "Error from developer"),
    EVENT_TYPE_ALIVE(7, "App is still alive"),
    EVENT_TYPE_SET_USER_INFO(9, "User info"),
    EVENT_TYPE_REPORT_USER_INFO(10, "Report user info"),
    EVENT_TYPE_SEND_USER_PROFILE(40961, "Send user profile"),
    EVENT_TYPE_SET_USER_PROFILE_ID(40962, "Set user profile ID"),
    EVENT_TYPE_SEND_REVENUE_EVENT(40976, "Send revenue event"),
    EVENT_TYPE_SEND_AD_REVENUE_EVENT(40977, "Send ad revenue event"),
    EVENT_TYPE_SEND_ECOMMERCE_EVENT(41000, "Send e-commerce event"),
    EVENT_TYPE_PURGE_BUFFER(256, "Forcible buffer clearing"),
    EVENT_TYPE_PREV_SESSION_NATIVE_CRASH(768, "Native crash of app, read from file"),
    EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH(769, "Native crash of app, caught by FileObserver"),
    EVENT_TYPE_STARTUP(1536, "Sending the startup due to lack of data"),
    EVENT_TYPE_IDENTITY(1792, "System identification"),
    EVENT_TYPE_IDENTITY_LIGHT(1793, "Identity light"),
    EVENT_TYPE_DIAGNOSTIC(2048, "Diagnostic event"),
    EVENT_TYPE_DIAGNOSTIC_STATBOX(2049, "Diagnostic statbox event"),
    EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING(2050, "Disable stat send"),
    EVENT_TYPE_STATBOX(2304, "Event with statistical data"),
    EVENT_TYPE_SEND_REFERRER(FragmentTransaction.TRANSIT_FRAGMENT_OPEN, "Send referrer"),
    EVENT_TYPE_REQUEST_REFERRER(InputDeviceCompat.SOURCE_TOUCHSCREEN, "Request referrer"),
    EVENT_TYPE_APP_ENVIRONMENT_UPDATED(5376, "App Environment Updated"),
    EVENT_TYPE_APP_ENVIRONMENT_CLEARED(5632, "App Environment Cleared"),
    EVENT_TYPE_EXCEPTION_UNHANDLED(5888, "Crash of App"),
    EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE(5889, "Crash of App, read from file"),
    EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT(5890, "Crash of App, passed to server via intent"),
    EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF(5891, "Crash of App"),
    EVENT_TYPE_EXCEPTION_USER_PROTOBUF(5892, "Error from developer"),
    EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF(5893, "Native crash of app, read from file"),
    EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF(5894, "Native crash of app, caught by FileObserver"),
    EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF(5895, "Native crash of app, passed to public API"),
    EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF(5896, "Error from developer with payload"),
    EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF(5897, "Crashpad crash of app from socket"),
    EVENT_TYPE_ANR(5968, "ANR"),
    EVENT_TYPE_ACTIVATION(6144, "Activation of metrica"),
    EVENT_TYPE_FIRST_ACTIVATION(6145, "First activation of metrica"),
    EVENT_TYPE_START(6400, "Start of new session"),
    EVENT_TYPE_CUSTOM_EVENT(8192, "Custom event"),
    EVENT_TYPE_APP_OPEN(8208, "App open event"),
    EVENT_TYPE_APP_UPDATE(8224, "App update event"),
    EVENT_TYPE_PERMISSIONS(12288, "Permissions changed event"),
    EVENT_TYPE_APP_FEATURES(12289, "Features, required by application"),
    EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG(16384, "Update pre-activation config"),
    EVENT_TYPE_CLEANUP(12290, "Cleanup database"),
    EVENT_TYPE_VIEW_TREE(12291, "View tree event"),
    EVENT_TYPE_RAW_VIEW_TREE(12292, "Raw view tree event"),
    EVENT_TYPE_APPMETRICA_DIAGNOSTICS(12300, "AppMetrica diagnostics event"),
    EVENT_TYPE_STATBOX_EXP(12310, "AppMetrica experimental statbox event"),
    EVENT_TYPE_WEBVIEW_SYNC(12320, "Counter init event");
    

    /* renamed from: d0 */
    static final HashMap<Integer, C11413k1> f27345d0 = null;

    /* renamed from: a */
    private final int f27369a;

    /* renamed from: b */
    private final String f27370b;

    static {
        f27345d0 = new HashMap<>();
        C11413k1[] values = values();
        for (int i = 0; i < 53; i++) {
            C11413k1 k1Var = values[i];
            f27345d0.put(Integer.valueOf(k1Var.f27369a), k1Var);
        }
    }

    private C11413k1(int i, String str) {
        this.f27369a = i;
        this.f27370b = str;
    }

    /* renamed from: a */
    public String mo63169a() {
        return this.f27370b;
    }

    /* renamed from: b */
    public int mo63170b() {
        return this.f27369a;
    }

    /* renamed from: a */
    public static C11413k1 m29450a(int i) {
        C11413k1 k1Var = f27345d0.get(Integer.valueOf(i));
        return k1Var == null ? EVENT_TYPE_UNDEFINED : k1Var;
    }
}
