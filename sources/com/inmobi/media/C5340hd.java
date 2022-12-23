package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.hd */
/* compiled from: AppInfo */
public class C5340hd {

    /* renamed from: e */
    private static final String f12228e = C5340hd.class.getSimpleName();

    /* renamed from: a */
    public String f12229a;

    /* renamed from: b */
    public String f12230b;

    /* renamed from: c */
    public Map<String, String> f12231c;

    /* renamed from: d */
    public byte f12232d;

    /* renamed from: f */
    private String f12233f;

    /* renamed from: g */
    private String f12234g;

    /* renamed from: h */
    private long f12235h;

    /* renamed from: com.inmobi.media.hd$a */
    /* compiled from: AppInfo */
    static class C5341a {

        /* renamed from: a */
        static final C5340hd f12236a = new C5340hd((byte) 0);
    }

    /* synthetic */ C5340hd(byte b) {
        this();
    }

    private C5340hd() {
        this.f12231c = new HashMap();
        Context c = C5314go.m12203c();
        try {
            PackageManager packageManager = c.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(c.getPackageName(), 128);
            if (applicationInfo != null) {
                this.f12229a = applicationInfo.packageName;
                this.f12233f = applicationInfo.loadLabel(packageManager).toString();
                this.f12230b = packageManager.getInstallerPackageName(this.f12229a);
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(c.getPackageName(), 128);
            this.f12235h = packageInfo.firstInstallTime;
            String str = null;
            if (packageInfo != null) {
                str = packageInfo.versionName;
                if (str == null || "".equals(str)) {
                    if (Build.VERSION.SDK_INT < 28) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(packageInfo.versionCode);
                        str = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(packageInfo.getLongVersionCode());
                        str = sb2.toString();
                    }
                }
            }
            if (str != null && !"".equals(str)) {
                this.f12234g = str;
            }
        } catch (Exception unused) {
        }
        this.f12232d = m12325b();
        this.f12231c.put("u-appbid", this.f12229a);
        this.f12231c.put("u-appdnm", this.f12233f);
        this.f12231c.put("u-appver", this.f12234g);
        this.f12231c.put("u-appsecure", Byte.toString(this.f12232d));
        this.f12231c.put("u-app-it", String.valueOf(this.f12235h));
    }

    /* renamed from: a */
    public static C5340hd m12324a() {
        return C5341a.f12236a;
    }

    /* renamed from: b */
    private static byte m12325b() {
        try {
            if (Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return 0;
            }
            return 1;
        } catch (Exception unused) {
            return 2;
        }
    }
}
