package com.ogury.core.internal.crash;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.ogury.core.internal.C7921ai;

/* renamed from: com.ogury.core.internal.crash.a */
/* compiled from: AppInfo.kt */
public final class C7945a {

    /* renamed from: a */
    public static final C7946a f20709a = new C7946a((byte) 0);

    /* renamed from: b */
    private final String f20710b;

    /* renamed from: c */
    private final String f20711c;

    /* renamed from: com.ogury.core.internal.crash.a$a */
    /* compiled from: AppInfo.kt */
    public static final class C7946a {
        private C7946a() {
        }

        public /* synthetic */ C7946a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C7945a m22170a(Context context) {
            PackageInfo packageInfo;
            String str;
            C7921ai.m22144b(context, "context");
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Exception e) {
                C7958i iVar = C7958i.f20738a;
                C7958i.m22206a(e);
                packageInfo = null;
            }
            if (packageInfo == null || (str = packageInfo.versionName) == null) {
                str = "";
            }
            String packageName = context.getPackageName();
            C7921ai.m22142a((Object) packageName, "context.packageName");
            return new C7945a(str, packageName);
        }
    }

    public C7945a(String str, String str2) {
        C7921ai.m22144b(str, "version");
        C7921ai.m22144b(str2, "packageName");
        this.f20710b = str;
        this.f20711c = str2;
    }

    /* renamed from: a */
    public final String mo52918a() {
        return this.f20710b;
    }

    /* renamed from: b */
    public final String mo52919b() {
        return this.f20711c;
    }
}
