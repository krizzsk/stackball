package com.smaato.sdk.core.datacollector;

import android.location.LocationManager;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Objects;

final class LocationDetector {
    private final AppMetaData appMetaData;
    final LocationManager locationManager;

    LocationDetector(LocationManager locationManager2, AppMetaData appMetaData2) {
        this.locationManager = (LocationManager) Objects.requireNonNull(locationManager2);
        this.appMetaData = (AppMetaData) Objects.requireNonNull(appMetaData2);
    }

    /* access modifiers changed from: package-private */
    public final boolean hasPermission(String str) {
        return this.appMetaData.isPermissionGranted(str);
    }
}
