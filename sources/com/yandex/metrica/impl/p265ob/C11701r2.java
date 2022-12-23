package com.yandex.metrica.impl.p265ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.r2 */
public final class C11701r2 {

    /* renamed from: a */
    private static final C10442L0 f28043a = new C10442L0();

    /* renamed from: b */
    private static final String[] f28044b = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    /* renamed from: a */
    public static int m30142a() {
        return (m30143b() || m30144c()) ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m30143b() {
        File file;
        try {
            if (C10796U2.m27890a(21)) {
                file = new File("/system/app/Superuser/Superuser.apk");
            } else {
                file = new File("/system/app/Superuser.apk");
            }
            return file.exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m30144c() {
        boolean z;
        String[] strArr = f28044b;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                if (!C10796U2.m27890a(31)) {
                    z = new File(str + "su").exists();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
