package com.ogury.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ogury.sdk.internal.k */
/* compiled from: SharedPreferencesCreator.kt */
public final class C8565k {

    /* renamed from: a */
    private final Context f21787a;

    public C8565k(Context context) {
        C8567m.m24059b(context, "context");
        this.f21787a = context;
    }

    /* renamed from: a */
    public final SharedPreferences mo54047a(String str) {
        C8567m.m24059b(str, "name");
        SharedPreferences sharedPreferences = this.f21787a.getSharedPreferences(str, 0);
        C8567m.m24057a((Object) sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
