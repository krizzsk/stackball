package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.appsflyer.AndroidUtils;
import com.appsflyer.ServerParameters;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.appsflyer.internal.s */
public final class C1772s {

    /* renamed from: com.appsflyer.internal.s$e */
    public static final class C1773e {

        /* renamed from: ǃ */
        public static final C1772s f4246 = new C1772s();
    }

    C1772s() {
    }

    /* renamed from: ι */
    private static boolean m3905(Context context, String[] strArr) {
        for (String isPermissionAvailable : strArr) {
            if (AndroidUtils.isPermissionAvailable(context, isPermissionAvailable)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ǃ */
    public static Location m3904(Context context) {
        Location location;
        Location location2;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            if (m3905(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                location = locationManager.getLastKnownLocation(ServerParameters.NETWORK);
            } else {
                location = null;
            }
            if (m3905(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                location2 = locationManager.getLastKnownLocation("gps");
            } else {
                location2 = null;
            }
            if (location2 == null && location == null) {
                location = null;
            } else if (location2 != null || location == null) {
                if ((location == null && location2 != null) || 60000 >= location.getTime() - location2.getTime()) {
                    location = location2;
                }
            }
            if (location != null) {
                return location;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
