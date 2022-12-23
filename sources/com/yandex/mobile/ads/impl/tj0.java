package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;

class tj0 {

    /* renamed from: a */
    private static final long f40346a = TimeUnit.MINUTES.toMillis(2);

    tj0() {
    }

    /* renamed from: a */
    private boolean m42359a(Location location, Location location2) {
        boolean z;
        long time = location.getTime() - location2.getTime();
        long j = f40346a;
        boolean z2 = time > j;
        boolean z3 = time < (-j);
        boolean z4 = time > 0;
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z5 = accuracy > 0;
        boolean z6 = accuracy < 0;
        boolean z7 = ((long) accuracy) > 200;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            z = provider2 == null;
        } else {
            z = provider.equals(provider2);
        }
        if (z2) {
            return true;
        }
        if (!z3) {
            if (z6) {
                return true;
            }
            if (z4 && !z5) {
                return true;
            }
            if (!z4 || z7 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo70189b(Location location, Location location2) {
        return location2 == null || m42359a(location, location2);
    }
}
