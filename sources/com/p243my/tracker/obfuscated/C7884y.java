package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.appsflyer.ServerParameters;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.my.tracker.obfuscated.y */
public final class C7884y {

    /* renamed from: a */
    Location f20204a;

    /* renamed from: b */
    int f20205b = -1;

    /* renamed from: c */
    private volatile boolean f20206c = true;

    C7884y() {
    }

    /* renamed from: a */
    public void mo52556a(Context context) {
        LocationManager locationManager;
        int i;
        Location location = null;
        this.f20204a = null;
        char c = 65535;
        this.f20205b = -1;
        if (this.f20206c && C7815h0.m21188a("android.permission.ACCESS_FINE_LOCATION", context) && C7815h0.m21188a("android.permission.ACCESS_COARSE_LOCATION", context) && !C7815h0.m21187a() && (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)) != null) {
            String str = null;
            long j = 0;
            float f = Float.MAX_VALUE;
            for (String next : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(next);
                    if (lastKnownLocation != null) {
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f)) {
                            str = next;
                            location = lastKnownLocation;
                            f = accuracy;
                            j = time;
                        }
                    }
                } catch (SecurityException unused) {
                    C7877u0.m21547a("Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
                }
            }
            if (location != null) {
                this.f20204a = location;
                str.hashCode();
                int hashCode = str.hashCode();
                if (hashCode != -792039641) {
                    if (hashCode != 102570) {
                        if (hashCode == 1843485230 && str.equals(ServerParameters.NETWORK)) {
                            c = 2;
                        }
                    } else if (str.equals("gps")) {
                        c = 1;
                    }
                } else if (str.equals("passive")) {
                    c = 0;
                }
                if (c == 0) {
                    i = 4;
                } else if (c == 1) {
                    this.f20205b = 2;
                    return;
                } else if (c != 2) {
                    this.f20205b = 1;
                    return;
                } else {
                    i = 3;
                }
                this.f20205b = i;
            }
        }
    }

    /* renamed from: a */
    public void mo52557a(C7831m0 m0Var, Context context) {
        Location location = this.f20204a;
        if (location != null) {
            m0Var.mo52383a(location, this.f20205b);
        }
    }

    /* renamed from: a */
    public void mo52558a(boolean z) {
        this.f20206c = z;
    }

    /* renamed from: b */
    public void mo52559b(Context context) {
    }
}
