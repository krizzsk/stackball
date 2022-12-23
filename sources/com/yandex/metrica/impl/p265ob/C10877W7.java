package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p264ac.NativeCrashesHelper;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.W7 */
public class C10877W7 implements C10743S7 {
    /* renamed from: a */
    public String mo62220a() {
        return "YandexMetricaNativeCrashes";
    }

    /* renamed from: a */
    public void mo62221a(String str) {
    }

    /* renamed from: a */
    public void mo62222a(String str, String str2, String str3) {
        NativeCrashesHelper.setUpNativeUncaughtExceptionHandler(str2);
    }

    /* renamed from: b */
    public void mo62224b() {
        NativeCrashesHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    /* renamed from: c */
    public String mo62225c() {
        return "YandexMetricaNativeModule";
    }

    /* renamed from: a */
    public void mo62223a(boolean z) {
        NativeCrashesHelper.logsEnabled(z);
    }
}
