package com.yandex.metrica.gpllibrary;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.gpllibrary.a */
public class C10081a implements C10084b {

    /* renamed from: a */
    private final FusedLocationProviderClient f24271a;

    /* renamed from: b */
    private final LocationListener f24272b;

    /* renamed from: c */
    private final LocationCallback f24273c;

    /* renamed from: d */
    private final Looper f24274d;

    /* renamed from: e */
    private final Executor f24275e;

    /* renamed from: f */
    private final long f24276f;

    /* renamed from: com.yandex.metrica.gpllibrary.a$a */
    static class C10082a {

        /* renamed from: a */
        private final Context f24277a;

        C10082a(Context context) {
            this.f24277a = context;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public FusedLocationProviderClient mo61029a() throws Throwable {
            return new FusedLocationProviderClient(this.f24277a);
        }
    }

    /* renamed from: com.yandex.metrica.gpllibrary.a$b */
    public enum C10083b {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public C10081a(Context context, LocationListener locationListener, Looper looper, Executor executor, long j) throws Throwable {
        this(new C10082a(context), locationListener, looper, executor, j);
    }

    public void startLocationUpdates(C10083b bVar) throws Throwable {
        Log.d("[GplLibraryWrapper]", "startLocationUpdates");
        FusedLocationProviderClient fusedLocationProviderClient = this.f24271a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f24276f);
        int ordinal = bVar.ordinal();
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 105 : 100 : 102 : 104), this.f24273c, this.f24274d);
    }

    public void stopLocationUpdates() throws Throwable {
        Log.d("[GplLibraryWrapper]", "stopLocationUpdates");
        this.f24271a.removeLocationUpdates(this.f24273c);
    }

    public void updateLastKnownLocation() throws Throwable {
        Log.d("[GplLibraryWrapper]", "updateLastKnownLocation");
        this.f24271a.getLastLocation().addOnSuccessListener(this.f24275e, new GplOnSuccessListener(this.f24272b));
    }

    C10081a(C10082a aVar, LocationListener locationListener, Looper looper, Executor executor, long j) throws Throwable {
        this.f24271a = aVar.mo61029a();
        this.f24272b = locationListener;
        this.f24274d = looper;
        this.f24275e = executor;
        this.f24276f = j;
        this.f24273c = new GplLocationCallback(locationListener);
    }
}
