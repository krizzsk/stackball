package com.ogury.sdk.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.ogury.core.internal.InternalCore;
import com.ogury.sdk.OguryConfiguration;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.f */
/* compiled from: MonitoringInfoHelper.kt */
public final class C8558f {

    /* renamed from: a */
    private final OguryConfiguration f21780a;

    public C8558f(OguryConfiguration oguryConfiguration) {
        C8567m.m24059b(oguryConfiguration, "oguryConfiguration");
        this.f21780a = oguryConfiguration;
    }

    /* renamed from: a */
    public final String mo54038a() {
        return this.f21780a.getAssetKey();
    }

    /* renamed from: b */
    public static String m24044b() {
        String frameworkName = InternalCore.getFrameworkName();
        C8567m.m24057a((Object) frameworkName, "InternalCore.getFrameworkName()");
        return frameworkName;
    }

    /* renamed from: c */
    public final String mo54039c() {
        String packageName = this.f21780a.getContext().getPackageName();
        C8567m.m24057a((Object) packageName, "oguryConfiguration.context.packageName");
        return packageName;
    }

    /* renamed from: d */
    public final String mo54040d() throws PackageManager.NameNotFoundException {
        Context context = this.f21780a.getContext();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    /* renamed from: e */
    public final Map<String, String> mo54041e() {
        return this.f21780a.getMonitoringInfoList();
    }
}
