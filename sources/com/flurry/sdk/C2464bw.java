package com.flurry.sdk;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.flurry.sdk.C2612eh;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.flurry.sdk.bw */
public class C2464bw implements C2612eh.C2613a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5742a = C2464bw.class.getSimpleName();

    /* renamed from: b */
    private static int f5743b = -1;

    /* renamed from: c */
    private static int f5744c = -1;

    /* renamed from: d */
    private static int f5745d = -1;

    /* renamed from: e */
    private static C2464bw f5746e;

    /* renamed from: f */
    private boolean f5747f;

    /* renamed from: g */
    private Location f5748g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f5749h = 0;

    /* renamed from: i */
    private LocationManager f5750i = ((LocationManager) C2494ck.m5371a().f5832a.getSystemService(FirebaseAnalytics.Param.LOCATION));

    /* renamed from: j */
    private C2466a f5751j = new C2466a();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Location f5752k;

    /* renamed from: l */
    private boolean f5753l = false;

    /* renamed from: m */
    private int f5754m = 0;

    /* renamed from: n */
    private Timer f5755n = null;

    /* renamed from: c */
    static /* synthetic */ int m5310c(C2464bw bwVar) {
        int i = bwVar.f5754m + 1;
        bwVar.f5754m = i;
        return i;
    }

    private C2464bw() {
        C2611eg a = C2611eg.m5674a();
        this.f5747f = ((Boolean) a.mo17819a("ReportLocation")).booleanValue();
        a.mo17820a("ReportLocation", (C2612eh.C2613a) this);
        String str = f5742a;
        C2530db.m5474a(4, str, "initSettings, ReportLocation = " + this.f5747f);
        this.f5748g = (Location) a.mo17819a("ExplicitLocation");
        a.mo17820a("ExplicitLocation", (C2612eh.C2613a) this);
        String str2 = f5742a;
        C2530db.m5474a(4, str2, "initSettings, ExplicitLocation = " + this.f5748g);
    }

    /* renamed from: a */
    public static synchronized C2464bw m5304a() {
        C2464bw bwVar;
        synchronized (C2464bw.class) {
            if (f5746e == null) {
                f5746e = new C2464bw();
            }
            bwVar = f5746e;
        }
        return bwVar;
    }

    /* renamed from: b */
    public static void m5306b() {
        if (f5746e != null) {
            C2611eg.m5674a().mo17822b("ReportLocation", f5746e);
            C2611eg.m5674a().mo17822b("ExplicitLocation", f5746e);
        }
        f5746e = null;
    }

    /* renamed from: c */
    public static int m5309c() {
        return f5743b;
    }

    /* renamed from: d */
    public static int m5311d() {
        return f5745d;
    }

    /* renamed from: e */
    public final synchronized void mo17654e() {
        C2530db.m5474a(4, f5742a, "Location update requested");
        if (this.f5754m < 3 && !this.f5753l && this.f5747f && this.f5748g == null) {
            Context context = C2494ck.m5371a().f5832a;
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f5754m = 0;
                String str = m5305a(context) ? "passive" : null;
                if (!TextUtils.isEmpty(str)) {
                    this.f5750i.requestLocationUpdates(str, TapjoyConstants.TIMER_INCREMENT, 0.0f, this.f5751j, Looper.getMainLooper());
                }
                this.f5752k = m5303a(str);
                this.f5749h = System.currentTimeMillis() + 90000;
                if (this.f5755n != null) {
                    this.f5755n.cancel();
                    this.f5755n = null;
                }
                C2530db.m5474a(4, f5742a, "Register location timer");
                Timer timer = new Timer();
                this.f5755n = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        if (C2464bw.this.f5749h > 0 && C2464bw.this.f5749h < System.currentTimeMillis()) {
                            C2530db.m5474a(4, C2464bw.f5742a, "No location received in 90 seconds , stopping LocationManager");
                            C2464bw.this.m5313i();
                        }
                    }
                }, 90000);
                this.f5753l = true;
                C2530db.m5474a(4, f5742a, "LocationProvider started");
            }
        }
    }

    /* renamed from: a */
    private static boolean m5305a(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* renamed from: b */
    private static boolean m5308b(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* renamed from: a */
    private Location m5303a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f5750i.getLastKnownLocation(str);
        }
        return null;
    }

    /* renamed from: f */
    public final synchronized void mo17655f() {
        C2530db.m5474a(4, f5742a, "Stop update location requested");
        m5313i();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m5313i() {
        if (this.f5753l) {
            this.f5750i.removeUpdates(this.f5751j);
            this.f5754m = 0;
            this.f5749h = 0;
            m5314j();
            this.f5753l = false;
            C2530db.m5474a(4, f5742a, "LocationProvider stopped");
        }
    }

    /* renamed from: j */
    private void m5314j() {
        C2530db.m5474a(4, f5742a, "Unregister location timer");
        Timer timer = this.f5755n;
        if (timer != null) {
            timer.cancel();
            this.f5755n = null;
        }
    }

    /* renamed from: g */
    public final Location mo17656g() {
        Location location = this.f5748g;
        if (location != null) {
            return location;
        }
        Location location2 = null;
        if (this.f5747f) {
            Context context = C2494ck.m5371a().f5832a;
            if (!m5305a(context) && !m5308b(context)) {
                return null;
            }
            String str = m5305a(context) ? "passive" : null;
            if (str != null) {
                Location a = m5303a(str);
                if (a != null) {
                    this.f5752k = a;
                }
                location2 = this.f5752k;
            }
        }
        C2530db.m5474a(4, f5742a, "getLocation() = ".concat(String.valueOf(location2)));
        return location2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17569a(java.lang.String r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -864112343(0xffffffffcc7eb129, float:-6.6765988E7)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = -300729815(0xffffffffee133a29, float:-1.1391152E28)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "ExplicitLocation"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "ReportLocation"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            r0 = 4
            if (r4 == 0) goto L_0x004d
            if (r4 == r2) goto L_0x0033
            r4 = 6
            java.lang.String r5 = f5742a
            java.lang.String r0 = "LocationProvider internal error! Had to be LocationCriteria, ReportLocation or ExplicitLocation key."
            com.flurry.sdk.C2530db.m5474a((int) r4, (java.lang.String) r5, (java.lang.String) r0)
            return
        L_0x0033:
            android.location.Location r5 = (android.location.Location) r5
            r3.f5748g = r5
            java.lang.String r4 = f5742a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "onSettingUpdate, ExplicitLocation = "
            r5.<init>(r1)
            android.location.Location r1 = r3.f5748g
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r4, (java.lang.String) r5)
            return
        L_0x004d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r3.f5747f = r4
            java.lang.String r4 = f5742a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "onSettingUpdate, ReportLocation = "
            r5.<init>(r1)
            boolean r1 = r3.f5747f
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r4, (java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2464bw.mo17569a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: com.flurry.sdk.bw$a */
    class C2466a implements LocationListener {
        public final void onProviderDisabled(String str) {
        }

        public final void onProviderEnabled(String str) {
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        public C2466a() {
        }

        public final void onLocationChanged(Location location) {
            if (location != null) {
                Location unused = C2464bw.this.f5752k = location;
            }
            if (C2464bw.m5310c(C2464bw.this) >= 3) {
                C2530db.m5474a(4, C2464bw.f5742a, "Max location reports reached, stopping");
                C2464bw.this.m5313i();
            }
        }
    }
}
