package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.hx */
/* compiled from: LocationInfo */
public class C5365hx implements LocationListener {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f12285c = C5365hx.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f12286e = false;

    /* renamed from: a */
    LocationManager f12287a;

    /* renamed from: b */
    GoogleApiClient f12288b;

    /* renamed from: d */
    private HandlerThread f12289d;

    /* renamed from: com.inmobi.media.hx$a */
    /* compiled from: LocationInfo */
    static class C5368a {

        /* renamed from: a */
        static final C5365hx f12292a = new C5365hx((byte) 0);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* synthetic */ C5365hx(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5365hx m12407a() {
        return C5368a.f12292a;
    }

    private C5365hx() {
        HandlerThread handlerThread = new HandlerThread("LThread");
        this.f12289d = handlerThread;
        handlerThread.start();
        Context c = C5314go.m12203c();
        if (c != null) {
            this.f12287a = (LocationManager) c.getSystemService(FirebaseAnalytics.Param.LOCATION);
        }
    }

    /* renamed from: g */
    private static boolean m12413g() {
        try {
            GoogleApiClient.class.getName();
            FusedLocationProviderClient.class.getName();
            LocationServices.class.getName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40725b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = m12411c()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x0072
            boolean r0 = r3.mo40727e()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x0072
            android.location.LocationManager r0 = r3.f12287a     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x0035
            android.location.Criteria r0 = new android.location.Criteria     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r0.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r1 = 2
            r0.setBearingAccuracy(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r0.setPowerRequirement(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r1 = 0
            r0.setCostAllowed(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.location.LocationManager r1 = r3.f12287a     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2 = 1
            java.lang.String r0 = r1.getBestProvider(r0, r2)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x0035
            android.location.LocationManager r1 = r3.f12287a     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.os.HandlerThread r2 = r3.f12289d     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.os.Looper r2 = r2.getLooper()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r1.requestSingleUpdate(r0, r3, r2)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
        L_0x0035:
            boolean r0 = m12413g()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r0 != 0) goto L_0x0072
            android.content.Context r0 = com.inmobi.media.C5314go.m12203c()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient r1 = r3.f12288b     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            if (r1 != 0) goto L_0x006b
            com.google.android.gms.common.api.GoogleApiClient$Builder r1 = new com.google.android.gms.common.api.GoogleApiClient$Builder     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.inmobi.media.hx$2 r0 = new com.inmobi.media.hx$2     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r0.<init>()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = r1.addConnectionCallbacks(r0)     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.inmobi.media.hx$1 r1 = new com.inmobi.media.hx$1     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r1.<init>()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = r0.addOnConnectionFailedListener(r1)     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.Api r1 = com.google.android.gms.location.LocationServices.API     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = r0.addApi(r1)     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            com.google.android.gms.common.api.GoogleApiClient r0 = r0.build()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r3.f12288b = r0     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r0.connect()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            monitor-exit(r3)
            return
        L_0x006b:
            com.google.android.gms.common.api.GoogleApiClient r0 = r3.f12288b     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            r0.connect()     // Catch:{ Exception -> 0x0072, all -> 0x0074 }
            monitor-exit(r3)
            return
        L_0x0072:
            monitor-exit(r3)
            return
        L_0x0074:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0077:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5365hx.mo40725b():void");
    }

    /* renamed from: c */
    public static boolean m12411c() {
        try {
            if (C5329gy.m12278a(C5314go.m12203c(), "android.permission.ACCESS_FINE_LOCATION") || C5329gy.m12278a(C5314go.m12203c(), "android.permission.ACCESS_COARSE_LOCATION")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            try {
                location.getTime();
                location.getLatitude();
                location.getLongitude();
                location.getAccuracy();
            } catch (Exception e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
                return;
            }
        }
        if (m12411c() && this.f12287a != null) {
            this.f12287a.removeUpdates(this);
        }
    }

    /* renamed from: d */
    public final synchronized HashMap<String, String> mo40726d() {
        HashMap<String, String> hashMap;
        Location location;
        HashMap<String, Object> hashMap2;
        hashMap = new HashMap<>();
        C5371hz.m12430a();
        Location location2 = null;
        if (C5371hz.m12432e()) {
            location = m12414h();
        } else {
            location = null;
        }
        if (location != null) {
            if (C5329gy.m12278a(C5314go.m12203c(), "android.permission.ACCESS_FINE_LOCATION")) {
                location2 = m12406a(1, 3);
            }
            hashMap2 = m12409a(location, true, location2);
        } else {
            hashMap2 = m12409a(C5348hj.m12357b(), false, (Location) null);
        }
        for (Map.Entry next : hashMap2.entrySet()) {
            hashMap.put(next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d A[ADDED_TO_REGION] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40727e() {
        /*
            r5 = this;
            android.content.Context r0 = com.inmobi.media.C5314go.m12203c()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            r4 = 1
            if (r2 < r3) goto L_0x001b
            android.location.LocationManager r0 = r5.f12287a
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isLocationEnabled()
            if (r0 == 0) goto L_0x001a
            return r4
        L_0x001a:
            return r1
        L_0x001b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r2 < r3) goto L_0x0031
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x002c }
            java.lang.String r2 = "location_mode"
            int r0 = android.provider.Settings.Secure.getInt(r0, r2)     // Catch:{ SettingNotFoundException -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 == 0) goto L_0x0030
            return r4
        L_0x0030:
            return r1
        L_0x0031:
            android.location.LocationManager r2 = r5.f12287a
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = com.inmobi.media.C5329gy.m12278a(r0, r2)     // Catch:{ Exception -> 0x0059 }
            if (r2 == 0) goto L_0x0048
            android.location.LocationManager r0 = r5.f12287a     // Catch:{ Exception -> 0x0059 }
            java.lang.String r2 = "gps"
            boolean r0 = r0.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0059 }
            r2 = r0
            r0 = 0
            goto L_0x005b
        L_0x0048:
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.inmobi.media.C5329gy.m12278a(r0, r2)     // Catch:{ Exception -> 0x0059 }
            if (r0 == 0) goto L_0x0059
            android.location.LocationManager r0 = r5.f12287a     // Catch:{ Exception -> 0x0059 }
            java.lang.String r2 = "network"
            boolean r0 = r0.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r2 = 0
        L_0x005b:
            if (r0 != 0) goto L_0x0061
            if (r2 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            return r1
        L_0x0061:
            return r4
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5365hx.mo40727e():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.location.Location m12414h() {
        /*
            r11 = this;
            r0 = 0
            boolean r1 = r11.mo40727e()     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x002d
            boolean r1 = m12411c()     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x002d
            boolean r1 = f12286e     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x0016
            android.location.Location r1 = m12415i()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            android.location.LocationManager r2 = r11.f12287a     // Catch:{ Exception -> 0x0031 }
            if (r2 == 0) goto L_0x0031
            android.content.Context r2 = com.inmobi.media.C5314go.m12203c()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = com.inmobi.media.C5329gy.m12278a(r2, r3)     // Catch:{ Exception -> 0x0031 }
            if (r2 == 0) goto L_0x0031
            r2 = 2
            android.location.Location r2 = r11.m12406a(r2, r2)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0032
        L_0x002d:
            r1 = r0
            r2 = r1
            goto L_0x0032
        L_0x0030:
            r1 = r0
        L_0x0031:
            r2 = r0
        L_0x0032:
            if (r1 != 0) goto L_0x0037
            if (r2 != 0) goto L_0x0037
            return r0
        L_0x0037:
            if (r1 != 0) goto L_0x003d
            r2.getTime()
            return r2
        L_0x003d:
            if (r2 != 0) goto L_0x0043
            r1.getTime()
            return r1
        L_0x0043:
            long r3 = r1.getTime()
            long r5 = r2.getTime()
            long r3 = r3 - r5
            r5 = 120000(0x1d4c0, double:5.9288E-319)
            r0 = 1
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0057
            r5 = 1
            goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            r8 = -120000(0xfffffffffffe2b40, double:NaN)
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0061
            r6 = 1
            goto L_0x0062
        L_0x0061:
            r6 = 0
        L_0x0062:
            r8 = 0
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x006a
            r3 = 1
            goto L_0x006b
        L_0x006a:
            r3 = 0
        L_0x006b:
            if (r5 == 0) goto L_0x0071
            r1.getTime()
            return r1
        L_0x0071:
            if (r6 == 0) goto L_0x0077
            r2.getTime()
            return r2
        L_0x0077:
            float r4 = r1.getAccuracy()
            float r5 = r2.getAccuracy()
            float r4 = r4 - r5
            int r4 = (int) r4
            if (r4 <= 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = 0
        L_0x0086:
            if (r4 >= 0) goto L_0x008a
            r6 = 1
            goto L_0x008b
        L_0x008a:
            r6 = 0
        L_0x008b:
            r8 = 200(0xc8, float:2.8E-43)
            if (r4 <= r8) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            if (r6 != 0) goto L_0x009e
            if (r3 == 0) goto L_0x009a
            if (r5 == 0) goto L_0x009e
            if (r0 != 0) goto L_0x009a
            goto L_0x009e
        L_0x009a:
            r2.getTime()
            return r2
        L_0x009e:
            r1.getTime()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5365hx.m12414h():android.location.Location");
    }

    /* renamed from: a */
    private Location m12406a(int i, int i2) {
        String bestProvider;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i);
        criteria.setPowerRequirement(i2);
        criteria.setCostAllowed(false);
        LocationManager locationManager = this.f12287a;
        Location location = null;
        if (locationManager == null || (bestProvider = locationManager.getBestProvider(criteria, true)) == null) {
            return null;
        }
        try {
            location = this.f12287a.getLastKnownLocation(bestProvider);
        } catch (Exception unused) {
        }
        return location == null ? m12416j() : location;
    }

    /* renamed from: i */
    private static Location m12415i() {
        try {
            return (Location) LocationServices.getFusedLocationProviderClient(C5314go.m12203c()).getLastLocation().getResult();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    private Location m12416j() {
        LocationManager locationManager = this.f12287a;
        Location location = null;
        if (locationManager != null) {
            List<String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                String str = providers.get(size);
                try {
                    if (this.f12287a.isProviderEnabled(str)) {
                        try {
                            location = this.f12287a.getLastKnownLocation(str);
                        } catch (SecurityException unused) {
                        }
                        if (location != null) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        return location;
    }

    /* renamed from: a */
    private HashMap<String, Object> m12409a(Location location, boolean z, Location location2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Context c = C5314go.m12203c();
        if (c == null) {
            return hashMap;
        }
        if (location != null) {
            if (location.getTime() > 0) {
                hashMap.put("u-ll-ts", Long.valueOf(location.getTime()));
            }
            hashMap.put("u-latlong-accu", m12408a(location));
            hashMap.put("sdk-collected", Integer.valueOf(z ? 1 : 0));
        }
        C5371hz.m12430a();
        if (C5371hz.m12432e()) {
            hashMap.put("loc-allowed", Integer.valueOf(mo40727e() ? 1 : 0));
        }
        if (location2 != null) {
            hashMap.put("u-latlong-accu-fine", m12408a(location2));
            hashMap.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
        }
        if (!mo40727e() || !m12411c()) {
            hashMap.put("loc-granularity", "none");
        } else if (C5329gy.m12278a(c, "android.permission.ACCESS_COARSE_LOCATION")) {
            hashMap.put("loc-granularity", "coarse");
        }
        return hashMap;
    }

    /* renamed from: a */
    private static String m12408a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy());
    }
}
