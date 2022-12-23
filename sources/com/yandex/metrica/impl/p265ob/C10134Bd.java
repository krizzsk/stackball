package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.Bd */
class C10134Bd extends C11490ld<C10220Ec> {

    /* renamed from: f */
    private final LocationManager f24399f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final String f24400g;

    C10134Bd(Context context, Looper looper, LocationManager locationManager, C11281ge geVar, String str, LocationListener locationListener) {
        super(context, locationListener, geVar, looper);
        this.f24399f = locationManager;
        this.f24400g = str;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo61108a(Object obj) {
        C10220Ec ec = (C10220Ec) obj;
        return mo61110c();
    }

    /* renamed from: b */
    public void mo61109b() {
        Location location;
        if (this.f27658b.mo62489a(this.f27657a)) {
            LocationManager locationManager = this.f24399f;
            if (locationManager != null) {
                try {
                    location = locationManager.getLastKnownLocation(this.f24400g);
                } catch (Throwable unused) {
                }
                this.f27659c.onLocationChanged(location);
            }
            location = null;
            this.f27659c.onLocationChanged(location);
        }
    }

    /* renamed from: c */
    public boolean mo61110c() {
        if (!this.f27658b.mo62489a(this.f27657a)) {
            return false;
        }
        String str = this.f24400g;
        long j = C11490ld.f27656e;
        LocationListener locationListener = this.f27659c;
        Looper looper = this.f27660d;
        LocationManager locationManager = this.f24399f;
        if (locationManager == null) {
            return false;
        }
        try {
            locationManager.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo61107a() {
        LocationManager locationManager = this.f24399f;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.f27659c);
            } catch (Throwable unused) {
            }
        }
    }
}
