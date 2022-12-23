package com.smaato.sdk.core.p248ad;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: com.smaato.sdk.core.ad.GeoType */
public enum GeoType {
    GPS("1"),
    IP_ADDRESS("2"),
    USER_PROVIDED(ExifInterface.GPS_MEASUREMENT_3D);
    
    private final String type;

    private GeoType(String str) {
        this.type = str;
    }

    public final String toString() {
        return this.type;
    }
}
