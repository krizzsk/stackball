package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.yandex.metrica.impl.ob.Wn */
public class C10898Wn {
    /* renamed from: a */
    public ApplicationInfo mo62460a(Context context, String str, int i) {
        try {
            return context.getPackageManager().getApplicationInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public PackageInfo mo62462b(Context context, String str, int i) {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo62461a(Context context, String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
