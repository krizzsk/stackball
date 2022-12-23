package com.ogury.p245ed.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ogury.ed.internal.fw */
public final class C8243fw {
    /* renamed from: a */
    public static final NetworkInfo m23156a(Context context) {
        C8467mq.m23881b(context, "<this>");
        if (!C8257gh.m23192a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return null;
        }
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            return ((ConnectivityManager) systemService).getActiveNetworkInfo();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: a */
    public static final boolean m23157a(NetworkInfo networkInfo) {
        C8467mq.m23881b(networkInfo, "<this>");
        return networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    /* renamed from: b */
    public static final boolean m23158b(Context context) {
        C8467mq.m23881b(context, "<this>");
        NetworkInfo a = m23156a(context);
        return a != null && a.isConnected();
    }
}
