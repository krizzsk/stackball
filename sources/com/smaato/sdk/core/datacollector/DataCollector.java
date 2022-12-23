package com.smaato.sdk.core.datacollector;

import android.location.Location;
import com.appsflyer.ServerParameters;
import com.smaato.sdk.core.datacollector.LocationProvider;
import com.smaato.sdk.core.util.Objects;

public class DataCollector {
    private final LocationProvider locationProvider;
    private final SystemInfoProvider systemInfoProvider;

    DataCollector(SystemInfoProvider systemInfoProvider2, LocationProvider locationProvider2) {
        this.systemInfoProvider = (SystemInfoProvider) Objects.requireNonNull(systemInfoProvider2, "Parameter systemInfoProvider cannot be null for DataCollector::new");
        this.locationProvider = (LocationProvider) Objects.requireNonNull(locationProvider2, "Parameter locationProvider cannot be null for DataCollector::new");
    }

    public SystemInfo getSystemInfo() {
        return this.systemInfoProvider.getSystemInfoSnapshot();
    }

    public LocationProvider.DetectedLocation getLocationData() {
        Location location;
        LocationProvider.DetectedLocation detectedLocation;
        Location location2;
        LocationProvider locationProvider2 = this.locationProvider;
        if (locationProvider2.lastKnownLocation != null && locationProvider2.clock.elapsedRealtime() - locationProvider2.lastKnownLocation.lastUpdatedMillis <= locationProvider2.locationRefreshTimeMillis) {
            return locationProvider2.lastKnownLocation;
        }
        LocationDetector locationDetector = locationProvider2.locationDetector;
        LocationProvider.DetectedLocation detectedLocation2 = null;
        if (locationDetector.hasPermission("android.permission.ACCESS_FINE_LOCATION") && locationDetector.locationManager.isProviderEnabled("gps")) {
            location = locationDetector.locationManager.getLastKnownLocation("gps");
        } else {
            location = null;
        }
        if (location == null) {
            detectedLocation = null;
        } else {
            detectedLocation = new LocationProvider.DetectedLocation(location, LocationProvider.DetectedLocation.TYPE.GPS, locationProvider2.clock.elapsedRealtime(), (byte) 0);
        }
        if (detectedLocation != null) {
            detectedLocation2 = detectedLocation;
        } else {
            LocationDetector locationDetector2 = locationProvider2.locationDetector;
            if ((locationDetector2.hasPermission("android.permission.ACCESS_FINE_LOCATION") || locationDetector2.hasPermission("android.permission.ACCESS_COARSE_LOCATION")) && locationDetector2.locationManager.isProviderEnabled(ServerParameters.NETWORK)) {
                location2 = locationDetector2.locationManager.getLastKnownLocation(ServerParameters.NETWORK);
            } else {
                location2 = null;
            }
            if (location2 != null) {
                detectedLocation2 = new LocationProvider.DetectedLocation(location2, LocationProvider.DetectedLocation.TYPE.NETWORK, locationProvider2.clock.elapsedRealtime(), (byte) 0);
            }
        }
        locationProvider2.lastKnownLocation = detectedLocation2;
        return locationProvider2.lastKnownLocation;
    }
}
