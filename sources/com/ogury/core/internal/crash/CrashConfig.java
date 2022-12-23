package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7921ai;

/* compiled from: CrashConfig.kt */
public final class CrashConfig {

    /* renamed from: a */
    private final int f20704a;

    /* renamed from: b */
    private final int f20705b;
    private final String packageName;
    private final String url;

    public CrashConfig(String str, String str2, int i, int i2) {
        C7921ai.m22144b(str, "url");
        C7921ai.m22144b(str2, "packageName");
        this.url = str;
        this.packageName = str2;
        this.f20704a = i;
        this.f20705b = i2;
    }

    public final int getDeleteAllCrashesFrequency() {
        return this.f20705b;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getSendCrashFrequency() {
        return this.f20704a;
    }

    public final String getUrl() {
        return this.url;
    }
}
