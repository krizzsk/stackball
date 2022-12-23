package com.yandex.mobile.ads.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class fh0 {

    /* renamed from: b */
    private static final Object f33361b = new Object();

    /* renamed from: c */
    private static final List<String> f33362c = new C13052a();

    /* renamed from: d */
    private static final List<String> f33363d = new C13053b();

    /* renamed from: e */
    private static volatile fh0 f33364e;

    /* renamed from: f */
    public static final /* synthetic */ int f33365f = 0;

    /* renamed from: a */
    private boolean f33366a = true;

    /* renamed from: com.yandex.mobile.ads.impl.fh0$a */
    class C13052a extends ArrayList<String> {
        private static final long serialVersionUID = 5712356855156500689L;

        C13052a() {
            add("com.yandex.mobile.ads.common.AdActivity");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fh0$b */
    class C13053b extends ArrayList<String> {
        private static final long serialVersionUID = 7066618132468587294L;

        C13053b() {
            add("android.permission.ACCESS_NETWORK_STATE");
            add("android.permission.INTERNET");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fh0$c */
    public static class C13054c extends Exception {
        private static final long serialVersionUID = 3046464751153928670L;

        public C13054c(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static fh0 m36017a() {
        if (f33364e == null) {
            synchronized (f33361b) {
                if (f33364e == null) {
                    f33364e = new fh0();
                }
            }
        }
        return f33364e;
    }

    /* renamed from: b */
    private void m36019b(PackageManager packageManager, String str) throws C13054c {
        try {
            ArrayList arrayList = new ArrayList(f33363d);
            String[] strArr = packageManager.getPackageInfo(str, 4096).requestedPermissions;
            if (strArr != null) {
                arrayList.removeAll(Arrays.asList(strArr));
                if (arrayList.size() > 0) {
                    throw new C13054c(String.format("Please, check %s permission in AndroidManifest file.", new Object[]{arrayList}));
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C13054c(String.format("Please, check %s permission in AndroidManifest file.", new Object[]{f33363d}));
        }
    }

    /* renamed from: a */
    public boolean mo67016a(Context context) throws C13054c {
        if (!this.f33366a) {
            return true;
        }
        synchronized (f33361b) {
            if (this.f33366a) {
                if (C13378i5.m37284b(context)) {
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    m36018a(packageManager, packageName);
                    m36019b(packageManager, packageName);
                }
                this.f33366a = false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m36018a(PackageManager packageManager, String str) throws C13054c {
        Iterator it = new ArrayList(f33362c).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                packageManager.getActivityInfo(new ComponentName(str, str2), 32);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C13054c(String.format("Please, check %s activity in AndroidManifest file.", new Object[]{str2}));
            }
        }
    }
}
