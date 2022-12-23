package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.hd */
public class C11313hd implements LocationListener {

    /* renamed from: a */
    private final C11943xd f27046a;

    public C11313hd(C11943xd xdVar) {
        this.f27046a = xdVar;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            this.f27046a.mo64072a(location);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
