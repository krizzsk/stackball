package com.ogury.p245ed.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;

/* renamed from: com.ogury.ed.internal.gj */
public final class C8259gj {
    /* renamed from: a */
    public static final boolean m23197a(Context context) {
        C8467mq.m23881b(context, "<this>");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
            String b = m23198b(context);
            String str = packageInfo.applicationInfo.processName;
            if (b == null) {
                return true;
            }
            return C8467mq.m23880a((Object) b, (Object) str);
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: b */
    private static final String m23198b(Context context) {
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) systemService).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
