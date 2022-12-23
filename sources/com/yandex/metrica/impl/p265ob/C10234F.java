package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.yandex.metrica.impl.ob.F */
public class C10234F {

    /* renamed from: a */
    private final LocationManager f24630a;

    public C10234F(Context context) {
        this((LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo61252a() {
        /*
            r3 = this;
            android.location.LocationManager r0 = r3.f24630a
            java.util.List r1 = java.util.Collections.emptyList()
            if (r0 == 0) goto L_0x000e
            r2 = 1
            java.util.List r0 = r0.getProviders(r2)     // Catch:{ all -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10234F.mo61252a():java.util.List");
    }

    C10234F(LocationManager locationManager) {
        this.f24630a = locationManager;
    }
}
