package com.smaato.sdk.core.datacollector;

import android.location.Location;
import com.smaato.sdk.core.util.Clock;
import com.smaato.sdk.core.util.Objects;

public final class LocationProvider {
    final Clock clock;
    DetectedLocation lastKnownLocation;
    final LocationDetector locationDetector;
    long locationRefreshTimeMillis = 1200000;

    LocationProvider(LocationDetector locationDetector2, Clock clock2) {
        this.locationDetector = (LocationDetector) Objects.requireNonNull(locationDetector2);
        this.clock = (Clock) Objects.requireNonNull(clock2);
    }

    public static final class DetectedLocation {
        /* access modifiers changed from: private */
        public final long lastUpdatedMillis;
        final Location location;
        private final TYPE type;

        public enum TYPE {
            GPS,
            NETWORK
        }

        /* synthetic */ DetectedLocation(Location location2, TYPE type2, long j, byte b) {
            this(location2, type2, j);
        }

        private DetectedLocation(Location location2, TYPE type2, long j) {
            this.location = location2;
            this.type = type2;
            this.lastUpdatedMillis = j;
        }

        public final double getLatitude() {
            return this.location.getLatitude();
        }

        public final double getLongitude() {
            return this.location.getLongitude();
        }

        public final float getAccuracy() {
            return this.location.getAccuracy();
        }

        public final TYPE getType() {
            return this.type;
        }

        public final long getLastUpdatedMillis() {
            return this.lastUpdatedMillis;
        }
    }
}
