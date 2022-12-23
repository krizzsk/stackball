package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;

public class pi0 implements vj0 {

    /* renamed from: a */
    private final xj0 f38616a = new xj0();

    /* renamed from: b */
    private final kc1 f38617b;

    /* renamed from: c */
    private final LocationManager f38618c;

    public pi0(Context context) {
        Context applicationContext = context.getApplicationContext();
        LocationManager locationManager = (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION);
        this.f38618c = locationManager;
        this.f38617b = new kc1(applicationContext, locationManager);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location mo69369a() {
        /*
            r4 = this;
            r0 = 0
            android.location.LocationManager r1 = r4.f38618c     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x000a
            java.util.List r1 = r1.getAllProviders()     // Catch:{ all -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            if (r1 == 0) goto L_0x0034
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0016:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.yandex.mobile.ads.impl.kc1 r3 = r4.f38617b
            android.location.Location r2 = r3.mo68198a(r2)
            if (r2 == 0) goto L_0x0016
            r0.add(r2)
            goto L_0x0016
        L_0x002e:
            com.yandex.mobile.ads.impl.xj0 r1 = r4.f38616a
            android.location.Location r0 = r1.mo70907a(r0)
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pi0.mo69369a():android.location.Location");
    }
}
