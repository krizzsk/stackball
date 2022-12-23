package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.my.tracker.obfuscated.h */
public abstract class C7814h {
    /* renamed from: a */
    public static PackageInfo m21185a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            C7877u0.m21551b("InstallHandler: unable to read app version from package manager: " + th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m21186b(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            C7877u0.m21548a("ReferrerHandler: cannot retrieve \"installer\", exception", th);
            return null;
        }
    }
}
