package com.tapjoy;

import android.content.Context;

public class TapjoyGpsHelper {

    /* renamed from: a */
    private Context f22271a;

    /* renamed from: b */
    private String f22272b;

    /* renamed from: c */
    private boolean f22273c;

    /* renamed from: d */
    private int f22274d = 0;

    /* renamed from: e */
    private int f22275e = 0;

    /* renamed from: f */
    private boolean f22276f;

    /* renamed from: g */
    private Boolean f22277g;

    /* renamed from: h */
    private Boolean f22278h;

    public TapjoyGpsHelper(Context context) {
        this.f22271a = context;
    }

    public void loadAdvertisingId(boolean z) {
        TapjoyLog.m24276i("TapjoyGpsHelper", "Looking for Google Play Services...");
        if (!isGooglePlayServicesAvailable() || !isGooglePlayManifestConfigured()) {
            TapjoyLog.m24276i("TapjoyGpsHelper", "Google Play Services not found");
            return;
        }
        TapjoyLog.m24276i("TapjoyGpsHelper", "Packaged Google Play Services found, fetching advertisingID...");
        TapjoyLog.m24276i("TapjoyGpsHelper", "Packaged Google Play Services version: " + this.f22275e);
        TapjoyAdIdClient tapjoyAdIdClient = new TapjoyAdIdClient(this.f22271a);
        this.f22276f = tapjoyAdIdClient.setupAdIdInfo();
        try {
            this.f22274d = this.f22271a.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            TapjoyLog.m24276i("TapjoyGpsHelper", "Device's Google Play Services version: " + this.f22274d);
        } catch (Exception unused) {
            TapjoyLog.m24276i("TapjoyGpsHelper", "Error getting device's Google Play Services version");
        }
        if (this.f22276f) {
            this.f22273c = tapjoyAdIdClient.isAdTrackingEnabled();
            this.f22272b = tapjoyAdIdClient.getAdvertisingId();
            TapjoyLog.m24276i("TapjoyGpsHelper", "Found advertising ID: " + this.f22272b);
            TapjoyLog.m24276i("TapjoyGpsHelper", "Is ad tracking enabled: " + Boolean.toString(this.f22273c));
            return;
        }
        TapjoyLog.m24276i("TapjoyGpsHelper", "Error getting advertisingID from Google Play Services");
        if (z) {
            this.f22273c = false;
            this.f22272b = "00000000-0000-0000-0000-000000000000";
            this.f22276f = true;
        }
    }

    public void checkGooglePlayIntegration() {
        if (!isGooglePlayServicesAvailable()) {
            throw new TapjoyIntegrationException("Tapjoy SDK is disabled because Google Play Services was not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        } else if (!isGooglePlayManifestConfigured()) {
            throw new TapjoyIntegrationException("Failed to load manifest.xml meta-data, 'com.google.android.gms.version' not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        }
    }

    public boolean isGooglePlayServicesAvailable() {
        if (this.f22277g == null) {
            try {
                this.f22271a.getClassLoader().loadClass("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                this.f22277g = true;
            } catch (Exception unused) {
                this.f22277g = false;
            } catch (Error unused2) {
                this.f22277g = false;
            }
        }
        return this.f22277g.booleanValue();
    }

    public boolean isGooglePlayManifestConfigured() {
        if (this.f22278h == null) {
            try {
                this.f22275e = this.f22271a.getPackageManager().getApplicationInfo(this.f22271a.getPackageName(), 128).metaData.getInt("com.google.android.gms.version");
                this.f22278h = true;
            } catch (Exception unused) {
                this.f22278h = false;
            }
        }
        return this.f22278h.booleanValue();
    }

    public String getAdvertisingId() {
        return this.f22272b;
    }

    public boolean isAdTrackingEnabled() {
        return this.f22273c;
    }

    public boolean isAdIdAvailable() {
        return this.f22276f;
    }

    public int getDeviceGooglePlayServicesVersion() {
        return this.f22274d;
    }

    public int getPackagedGooglePlayServicesVersion() {
        return this.f22275e;
    }
}
