package com.moat.analytics.mobile.inm;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.appsflyer.ServerParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.moat.analytics.mobile.inm.o */
class C7258o implements LocationListener {

    /* renamed from: a */
    private static C7258o f18212a;

    /* renamed from: b */
    private ScheduledExecutorService f18213b;

    /* renamed from: c */
    private ScheduledFuture<?> f18214c;

    /* renamed from: d */
    private ScheduledFuture<?> f18215d;

    /* renamed from: e */
    private LocationManager f18216e;

    /* renamed from: f */
    private boolean f18217f;

    /* renamed from: g */
    private Location f18218g;

    /* renamed from: h */
    private boolean f18219h;

    private C7258o() {
        try {
            boolean z = ((C7250k) MoatAnalytics.getInstance()).f18189c;
            this.f18217f = z;
            if (z) {
                C7261p.m18544a(3, "LocationManager", (Object) this, "Moat location services disabled");
                return;
            }
            this.f18213b = Executors.newScheduledThreadPool(1);
            LocationManager locationManager = (LocationManager) C7221a.m18375a().getSystemService(FirebaseAnalytics.Param.LOCATION);
            this.f18216e = locationManager;
            if (locationManager.getAllProviders().size() == 0) {
                C7261p.m18544a(3, "LocationManager", (Object) this, "Device has no location providers");
            } else {
                m18529e();
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: a */
    static C7258o m18520a() {
        if (f18212a == null) {
            f18212a = new C7258o();
        }
        return f18212a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18523a(boolean z) {
        try {
            C7261p.m18544a(3, "LocationManager", (Object) this, "stopping location fetch");
            m18532h();
            m18533i();
            if (z) {
                m18535k();
            } else {
                m18534j();
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: a */
    private static boolean m18524a(Location location) {
        if (location == null) {
            return false;
        }
        return !(location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) && location.getAccuracy() >= 0.0f && m18527b(location) < 600.0f;
    }

    /* renamed from: a */
    static boolean m18525a(Location location, Location location2) {
        if (location == location2) {
            return true;
        }
        return (location == null || location2 == null || location.getTime() != location2.getTime()) ? false : true;
    }

    /* renamed from: a */
    private static boolean m18526a(String str) {
        return ContextCompat.checkSelfPermission(C7221a.m18375a().getApplicationContext(), str) == 0;
    }

    /* renamed from: b */
    private static float m18527b(Location location) {
        return (float) ((System.currentTimeMillis() - location.getTime()) / 1000);
    }

    /* renamed from: b */
    private static Location m18528b(Location location, Location location2) {
        boolean a = m18524a(location);
        boolean a2 = m18524a(location2);
        if (a) {
            return (a2 && location.getAccuracy() >= location.getAccuracy()) ? location2 : location;
        }
        if (!a2) {
            return null;
        }
        return location2;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m18529e() {
        try {
            if (this.f18217f) {
                return;
            }
            if (this.f18216e != null) {
                if (this.f18219h) {
                    C7261p.m18544a(3, "LocationManager", (Object) this, "already updating location");
                }
                C7261p.m18544a(3, "LocationManager", (Object) this, "starting location fetch");
                Location b = m18528b(this.f18218g, m18530f());
                this.f18218g = b;
                if (b != null) {
                    C7261p.m18544a(3, "LocationManager", (Object) this, "Have a valid location, won't fetch = " + this.f18218g.toString());
                    m18535k();
                    return;
                }
                m18531g();
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: f */
    private Location m18530f() {
        try {
            boolean l = m18536l();
            boolean m = m18537m();
            if (l && m) {
                return m18528b(this.f18216e.getLastKnownLocation("gps"), this.f18216e.getLastKnownLocation(ServerParameters.NETWORK));
            }
            if (l) {
                return this.f18216e.getLastKnownLocation("gps");
            }
            if (m) {
                return this.f18216e.getLastKnownLocation(ServerParameters.NETWORK);
            }
            return null;
        } catch (SecurityException e) {
            C7252m.m18508a(e);
            return null;
        }
    }

    /* renamed from: g */
    private void m18531g() {
        try {
            if (!this.f18219h) {
                C7261p.m18544a(3, "LocationManager", (Object) this, "Attempting to start update");
                if (m18536l()) {
                    C7261p.m18544a(3, "LocationManager", (Object) this, "start updating gps location");
                    this.f18216e.requestLocationUpdates("gps", 0, 0.0f, this, Looper.getMainLooper());
                    this.f18219h = true;
                }
                if (m18537m()) {
                    C7261p.m18544a(3, "LocationManager", (Object) this, "start updating network location");
                    this.f18216e.requestLocationUpdates(ServerParameters.NETWORK, 0, 0.0f, this, Looper.getMainLooper());
                    this.f18219h = true;
                }
                if (this.f18219h) {
                    m18533i();
                    this.f18215d = this.f18213b.schedule(new Runnable() {
                        public void run() {
                            try {
                                C7261p.m18544a(3, "LocationManager", (Object) this, "fetchTimedOut");
                                C7258o.this.m18523a(true);
                            } catch (Exception e) {
                                C7252m.m18508a(e);
                            }
                        }
                    }, 60, TimeUnit.SECONDS);
                }
            }
        } catch (SecurityException e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: h */
    private void m18532h() {
        try {
            C7261p.m18544a(3, "LocationManager", (Object) this, "Stopping to update location");
            if (m18538n() && this.f18216e != null) {
                this.f18216e.removeUpdates(this);
                this.f18219h = false;
            }
        } catch (SecurityException e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: i */
    private void m18533i() {
        ScheduledFuture<?> scheduledFuture = this.f18215d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f18215d.cancel(true);
            this.f18215d = null;
        }
    }

    /* renamed from: j */
    private void m18534j() {
        ScheduledFuture<?> scheduledFuture = this.f18214c;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f18214c.cancel(true);
            this.f18214c = null;
        }
    }

    /* renamed from: k */
    private void m18535k() {
        C7261p.m18544a(3, "LocationManager", (Object) this, "Resetting fetch timer");
        m18534j();
        Location location = this.f18218g;
        float f = 600.0f;
        if (location != null) {
            f = Math.max(600.0f - m18527b(location), 0.0f);
        }
        this.f18214c = this.f18213b.schedule(new Runnable() {
            public void run() {
                try {
                    C7261p.m18544a(3, "LocationManager", (Object) this, "fetchTimerCompleted");
                    C7258o.this.m18529e();
                } catch (Exception e) {
                    C7252m.m18508a(e);
                }
            }
        }, (long) f, TimeUnit.SECONDS);
    }

    /* renamed from: l */
    private boolean m18536l() {
        return m18526a("android.permission.ACCESS_FINE_LOCATION") && this.f18216e.getProvider("gps") != null && this.f18216e.isProviderEnabled("gps");
    }

    /* renamed from: m */
    private boolean m18537m() {
        return m18538n() && this.f18216e.getProvider(ServerParameters.NETWORK) != null && this.f18216e.isProviderEnabled(ServerParameters.NETWORK);
    }

    /* renamed from: n */
    private static boolean m18538n() {
        return m18526a("android.permission.ACCESS_FINE_LOCATION") || m18526a("android.permission.ACCESS_COARSE_LOCATION");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Location mo49412b() {
        if (this.f18217f || this.f18216e == null) {
            return null;
        }
        return this.f18218g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo49413c() {
        m18529e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo49414d() {
        m18523a(false);
    }

    public void onLocationChanged(Location location) {
        try {
            C7261p.m18544a(3, "LocationManager", (Object) this, "Received an updated location = " + location.toString());
            float b = m18527b(location);
            if (location.hasAccuracy() && location.getAccuracy() <= 100.0f && b < 600.0f) {
                this.f18218g = m18528b(this.f18218g, location);
                C7261p.m18544a(3, "LocationManager", (Object) this, "fetchCompleted");
                m18523a(true);
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
