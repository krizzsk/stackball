package com.smaato.sdk.core;

import android.os.SystemClock;

public final class LatLng {
    private final float accuracy;
    private final double latitude;
    private final double longitude;
    private final long timestamp;

    public LatLng(double d, double d2, float f, long j) {
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = f;
        this.timestamp = j;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final float getLocationAccuracy() {
        return this.accuracy;
    }

    public final long getLocationTimestamp() {
        return this.timestamp;
    }

    public final float getTimeSinceLastLocationUpdate() {
        return (float) (SystemClock.elapsedRealtime() - this.timestamp);
    }

    public final boolean isValid() {
        double d = this.latitude;
        if (d <= -90.0d || d >= 90.0d) {
            return false;
        }
        double d2 = this.longitude;
        return d2 > -180.0d && d2 < 180.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LatLng latLng = (LatLng) obj;
            if (Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0 && Float.compare(latLng.accuracy, this.accuracy) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        float f = this.accuracy;
        return i + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        return "LatLng{latitude=" + this.latitude + ", longitude=" + this.longitude + ", accuracy=" + this.accuracy + ", timestamp=" + this.timestamp + '}';
    }
}
