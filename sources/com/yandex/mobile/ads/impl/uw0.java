package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

public final class uw0 {

    /* renamed from: a */
    private final SharedPreferences f41145a;

    public uw0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41145a = context.getApplicationContext().getSharedPreferences("YadPreferenceFile", 0);
    }

    /* renamed from: a */
    public final String mo70419a() {
        return this.f41145a.getString("YmadOmSdkJs", (String) null);
    }

    /* renamed from: b */
    public final String mo70421b() {
        return this.f41145a.getString("YmadOmSdkJsUrl", (String) null);
    }

    /* renamed from: a */
    public final void mo70420a(String str) {
        this.f41145a.edit().putString("YmadOmSdkJs", str).apply();
    }

    /* renamed from: b */
    public final void mo70422b(String str) {
        this.f41145a.edit().putString("YmadOmSdkJsUrl", str).apply();
    }
}
