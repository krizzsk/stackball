package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.Configuration;

class AdLocation {
    private static final int ARCMINUTE_PRECISION = 6;
    private static final String LOGTAG = AdLocation.class.getSimpleName();
    private static final float MAX_DISTANCE_IN_KILOMETERS = 3.0f;
    private final Configuration configuration;
    private final Context context;
    private final MobileAdsLogger logger;

    private enum LocationAwareness {
        LOCATION_AWARENESS_NORMAL,
        LOCATION_AWARENESS_TRUNCATED,
        LOCATION_AWARENESS_DISABLED
    }

    public AdLocation(Context context2) {
        this(context2, Configuration.getInstance());
    }

    AdLocation(Context context2, Configuration configuration2) {
        this.logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
        this.context = context2;
        this.configuration = configuration2;
    }

    private static double roundToArcminutes(double d) {
        return ((double) Math.round(d * 60.0d)) / 60.0d;
    }

    private LocationAwareness getLocationAwareness() {
        if (this.configuration.getBoolean(Configuration.ConfigOption.TRUNCATE_LAT_LON)) {
            return LocationAwareness.LOCATION_AWARENESS_TRUNCATED;
        }
        return LocationAwareness.LOCATION_AWARENESS_NORMAL;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location getLocation() {
        /*
            r10 = this;
            com.amazon.device.ads.AdLocation$LocationAwareness r0 = r10.getLocationAwareness()
            com.amazon.device.ads.AdLocation$LocationAwareness r1 = com.amazon.device.ads.AdLocation.LocationAwareness.LOCATION_AWARENESS_DISABLED
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.Context r1 = r10.context
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            java.lang.String r3 = "gps"
            android.location.Location r3 = r1.getLastKnownLocation(r3)     // Catch:{ SecurityException -> 0x0027, IllegalArgumentException -> 0x001f }
            goto L_0x002f
        L_0x001f:
            com.amazon.device.ads.MobileAdsLogger r3 = r10.logger
            java.lang.String r4 = "Failed to retrieve GPS location: No GPS found"
            r3.mo10938d(r4)
            goto L_0x002e
        L_0x0027:
            com.amazon.device.ads.MobileAdsLogger r3 = r10.logger
            java.lang.String r4 = "Failed to retrieve GPS location: No permissions to access GPS"
            r3.mo10938d(r4)
        L_0x002e:
            r3 = r2
        L_0x002f:
            java.lang.String r4 = "network"
            android.location.Location r1 = r1.getLastKnownLocation(r4)     // Catch:{ SecurityException -> 0x003e, IllegalArgumentException -> 0x0036 }
            goto L_0x0046
        L_0x0036:
            com.amazon.device.ads.MobileAdsLogger r1 = r10.logger
            java.lang.String r4 = "Failed to retrieve network location: No network provider found"
            r1.mo10938d(r4)
            goto L_0x0045
        L_0x003e:
            com.amazon.device.ads.MobileAdsLogger r1 = r10.logger
            java.lang.String r4 = "Failed to retrieve network location: No permissions to access network location"
            r1.mo10938d(r4)
        L_0x0045:
            r1 = r2
        L_0x0046:
            if (r3 != 0) goto L_0x004b
            if (r1 != 0) goto L_0x004b
            return r2
        L_0x004b:
            if (r3 == 0) goto L_0x00a7
            if (r1 == 0) goto L_0x00a7
            float r2 = r3.distanceTo(r1)
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r4
            r4 = 1077936128(0x40400000, float:3.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x008b
            boolean r2 = r3.hasAccuracy()
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r2 == 0) goto L_0x006a
            float r2 = r3.getAccuracy()
            goto L_0x006d
        L_0x006a:
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x006d:
            boolean r5 = r1.hasAccuracy()
            if (r5 == 0) goto L_0x0077
            float r4 = r1.getAccuracy()
        L_0x0077:
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0083
            com.amazon.device.ads.MobileAdsLogger r1 = r10.logger
            java.lang.String r2 = "Setting lat/long using GPS determined by distance"
            r1.mo10938d(r2)
            goto L_0x00b9
        L_0x0083:
            com.amazon.device.ads.MobileAdsLogger r2 = r10.logger
            java.lang.String r3 = "Setting lat/long using network determined by distance"
            r2.mo10938d(r3)
            goto L_0x00b8
        L_0x008b:
            long r4 = r3.getTime()
            long r6 = r1.getTime()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x009f
            com.amazon.device.ads.MobileAdsLogger r1 = r10.logger
            java.lang.String r2 = "Setting lat/long using GPS"
            r1.mo10938d(r2)
            goto L_0x00b9
        L_0x009f:
            com.amazon.device.ads.MobileAdsLogger r2 = r10.logger
            java.lang.String r3 = "Setting lat/long using network"
            r2.mo10938d(r3)
            goto L_0x00b8
        L_0x00a7:
            if (r3 == 0) goto L_0x00b1
            com.amazon.device.ads.MobileAdsLogger r1 = r10.logger
            java.lang.String r2 = "Setting lat/long using GPS, not network"
            r1.mo10938d(r2)
            goto L_0x00b9
        L_0x00b1:
            com.amazon.device.ads.MobileAdsLogger r2 = r10.logger
            java.lang.String r3 = "Setting lat/long using network location, not GPS"
            r2.mo10938d(r3)
        L_0x00b8:
            r3 = r1
        L_0x00b9:
            com.amazon.device.ads.AdLocation$LocationAwareness r1 = com.amazon.device.ads.AdLocation.LocationAwareness.LOCATION_AWARENESS_TRUNCATED
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00fb
            double r0 = r3.getLatitude()
            double r0 = roundToArcminutes(r0)
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            r6 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r8 = java.lang.Math.pow(r4, r6)
            double r8 = r8 * r0
            long r0 = java.lang.Math.round(r8)
            double r0 = (double) r0
            double r8 = java.lang.Math.pow(r4, r6)
            double r0 = r0 / r8
            r3.setLatitude(r0)
            double r0 = r3.getLongitude()
            double r0 = roundToArcminutes(r0)
            double r8 = java.lang.Math.pow(r4, r6)
            double r8 = r8 * r0
            long r0 = java.lang.Math.round(r8)
            double r0 = (double) r0
            double r4 = java.lang.Math.pow(r4, r6)
            double r0 = r0 / r4
            r3.setLongitude(r0)
        L_0x00fb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdLocation.getLocation():android.location.Location");
    }
}
