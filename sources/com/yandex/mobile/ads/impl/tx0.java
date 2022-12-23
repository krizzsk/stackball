package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

public class tx0 {

    /* renamed from: a */
    private final String f40520a;

    /* renamed from: b */
    private final PackageManager f40521b;

    public tx0(Context context) {
        this.f40520a = context.getPackageName();
        this.f40521b = context.getPackageManager();
    }

    /* renamed from: a */
    public boolean mo70243a(String str) {
        try {
            return this.f40521b.checkPermission(str, this.f40520a) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo70242a(Intent intent) {
        List<ResolveInfo> queryIntentActivities = this.f40521b.queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }
}
