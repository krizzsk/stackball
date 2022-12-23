package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.ActivityInfo;
import com.yandex.mobile.ads.common.AdActivity;

/* renamed from: com.yandex.mobile.ads.impl.eh */
public final class C12974eh {
    /* renamed from: a */
    public static void m35663a(Context context) {
        try {
            boolean z = true;
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            ActivityInfo activityInfo = null;
            int length = activityInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ActivityInfo activityInfo2 = activityInfoArr[i];
                int i2 = AdActivity.f29418d;
                if ("com.yandex.mobile.ads.common.AdActivity".equals(activityInfo2.name)) {
                    activityInfo = activityInfo2;
                    break;
                }
                i++;
            }
            if (activityInfo != null) {
                int i3 = activityInfo.configChanges;
                boolean z2 = ((i3 & 512) > 0) & ((i3 & 16) > 0) & true & ((i3 & 32) > 0) & ((i3 & 128) > 0) & ((i3 & 256) > 0);
                if (C13378i5.m37280a(13)) {
                    int i4 = activityInfo.configChanges;
                    boolean z3 = z2 & ((i4 & 1024) > 0);
                    if ((i4 & 2048) <= 0) {
                        z = false;
                    }
                    z2 = z3 & z;
                }
                if (z2) {
                    return;
                }
            }
        } catch (Exception unused) {
        }
        throw new IllegalStateException("Ad Activity into the AndroidManifest.xml is integrated wrong");
    }
}
