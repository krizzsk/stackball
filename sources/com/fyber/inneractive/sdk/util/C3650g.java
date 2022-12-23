package com.fyber.inneractive.sdk.util;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: com.fyber.inneractive.sdk.util.g */
public final class C3650g {
    /* renamed from: a */
    static boolean m9076a(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable th) {
            IAlog.m9033a(C3670q.m9154a(th), new Object[0]);
            return false;
        }
    }
}
