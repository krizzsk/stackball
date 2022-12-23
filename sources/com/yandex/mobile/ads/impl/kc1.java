package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class kc1 {

    /* renamed from: c */
    private static final Set<String> f36092c = new HashSet(Collections.singletonList("gps"));

    /* renamed from: d */
    private static final Set<String> f36093d = new HashSet(Arrays.asList(new String[]{"gps", "passive"}));

    /* renamed from: a */
    private final LocationManager f36094a;

    /* renamed from: b */
    private final az0 f36095b;

    kc1(Context context, LocationManager locationManager) {
        this.f36094a = locationManager;
        this.f36095b = new az0(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m38294b(java.lang.String r6) {
        /*
            r5 = this;
            com.yandex.mobile.ads.impl.az0 r0 = r5.f36095b
            boolean r0 = r0.mo65923a()
            com.yandex.mobile.ads.impl.az0 r1 = r5.f36095b
            boolean r1 = r1.mo65924b()
            java.util.Set<java.lang.String> r2 = f36092c
            java.util.HashSet r2 = (java.util.HashSet) r2
            boolean r2 = r2.contains(r6)
            r3 = 1
            r2 = r2 ^ r3
            java.util.Set<java.lang.String> r4 = f36093d
            java.util.HashSet r4 = (java.util.HashSet) r4
            boolean r6 = r4.contains(r6)
            if (r6 == 0) goto L_0x0027
            if (r2 == 0) goto L_0x002c
            if (r0 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            goto L_0x002d
        L_0x0027:
            if (r2 == 0) goto L_0x002c
            if (r0 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kc1.m38294b(java.lang.String):boolean");
    }

    /* renamed from: a */
    public Location mo68198a(String str) {
        if (!m38294b(str)) {
            return null;
        }
        try {
            LocationManager locationManager = this.f36094a;
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
