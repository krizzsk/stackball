package com.ogury.core.internal.crash;

import android.content.Context;
import android.content.SharedPreferences;
import com.ogury.core.internal.C7921ai;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ogury.core.internal.crash.f */
/* compiled from: CrashReportDao.kt */
public final class C7954f {

    /* renamed from: a */
    private final SharedPreferences f20731a;

    static {
        new C7955a((byte) 0);
    }

    public C7954f(Context context) {
        C7921ai.m22144b(context, "context");
        this.f20731a = context.getSharedPreferences("crash_report", 0);
    }

    /* renamed from: com.ogury.core.internal.crash.f$a */
    /* compiled from: CrashReportDao.kt */
    public static final class C7955a {
        private C7955a() {
        }

        public /* synthetic */ C7955a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo52936a(String str, String str2) {
        C7921ai.m22144b(str, "sdkKey");
        C7921ai.m22144b(str2, "uploadUrl");
        this.f20731a.edit().putString(m22189e(str), str2).apply();
    }

    /* renamed from: a */
    public final String mo52934a(String str) {
        C7921ai.m22144b(str, "sdkKey");
        String string = this.f20731a.getString(m22189e(str), "");
        return string == null ? "" : string;
    }

    /* renamed from: e */
    private static String m22189e(String str) {
        return "url_" + str;
    }

    /* renamed from: a */
    public final void mo52937a(String str, boolean z) {
        C7921ai.m22144b(str, "sdkKey");
        this.f20731a.edit().putBoolean(m22190f(str), z).apply();
    }

    /* renamed from: b */
    public final boolean mo52939b(String str) {
        C7921ai.m22144b(str, "sdkKey");
        return this.f20731a.getBoolean(m22190f(str), false);
    }

    /* renamed from: f */
    private static String m22190f(String str) {
        return "sdk_state_" + str;
    }

    /* renamed from: b */
    public final void mo52938b(String str, String str2) {
        C7921ai.m22144b(str, "packageName");
        C7921ai.m22144b(str2, "sdkKey");
        this.f20731a.edit().putString(m22191g(str), str2).apply();
    }

    /* renamed from: c */
    public final String mo52940c(String str) {
        C7921ai.m22144b(str, "packageName");
        return this.f20731a.getString(m22191g(str), (String) null);
    }

    /* renamed from: g */
    private static String m22191g(String str) {
        return "package_" + str;
    }

    /* renamed from: d */
    public final void mo52941d(String str) {
        C7921ai.m22144b(str, "packageName");
        Set<String> a = mo52935a();
        if (a == null) {
            a = new LinkedHashSet<>();
        }
        if (!a.contains(str)) {
            a.add(str);
            this.f20731a.edit().putStringSet("sdk_packages", a).apply();
        }
    }

    /* renamed from: a */
    public final Set<String> mo52935a() {
        return this.f20731a.getStringSet("sdk_packages", (Set) null);
    }
}
