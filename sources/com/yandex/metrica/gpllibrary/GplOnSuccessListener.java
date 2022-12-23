package com.yandex.metrica.gpllibrary;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

class GplOnSuccessListener implements OnSuccessListener<Location> {
    private final LocationListener mLocationListener;

    GplOnSuccessListener(LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    public void onSuccess(Location location) {
        this.mLocationListener.onLocationChanged(location);
    }
}
