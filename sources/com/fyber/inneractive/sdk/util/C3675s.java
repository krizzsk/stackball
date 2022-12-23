package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.fyber.inneractive.sdk.util.C3651h;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.fyber.inneractive.sdk.util.s */
public final class C3675s {

    /* renamed from: a */
    public Context f9959a;

    /* renamed from: b */
    Location f9960b;

    /* renamed from: c */
    public C3651h.C3652a f9961c;

    /* renamed from: d */
    Runnable f9962d;

    /* renamed from: e */
    public LocationListener f9963e;

    /* renamed from: f */
    public LocationListener f9964f;

    /* renamed from: g */
    long f9965g;

    /* renamed from: com.fyber.inneractive.sdk.util.s$a */
    private static class C3680a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C3675s f9970a = new C3675s((byte) 0);
    }

    /* synthetic */ C3675s(byte b) {
        this();
    }

    private C3675s() {
        this.f9960b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014f, code lost:
        if (r7 == false) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.location.Location mo19583a() {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "network"
            android.content.Context r2 = r0.f9959a
            r3 = 0
            java.lang.String r4 = "Location Manager: "
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x0017
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "%sgetBestLastKnownLocation called, but context is null!"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            return r3
        L_0x0017:
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r7 = com.fyber.inneractive.sdk.util.C3657l.m9123d(r2)
            java.lang.String r8 = "android.permission.ACCESS_COARSE_LOCATION"
            if (r7 == 0) goto L_0x002c
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r9 = "%sgetBestLastKnownLocation: Found fine location permission"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r7)
            r7 = 1
            goto L_0x003c
        L_0x002c:
            boolean r7 = com.fyber.inneractive.sdk.util.C3657l.m9123d(r8)
            if (r7 == 0) goto L_0x01f3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r9 = "%sgetBestLastKnownLocation: Found coarse location permission"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r7)
            r7 = 0
        L_0x003c:
            android.content.Context r9 = r0.f9959a
            java.lang.String r10 = "location"
            java.lang.Object r9 = r9.getSystemService(r10)
            android.location.LocationManager r9 = (android.location.LocationManager) r9
            java.lang.String r11 = "%slast known network location time delta = %d"
            java.lang.String r12 = "gps"
            r13 = 2
            if (r7 == 0) goto L_0x0085
            boolean r7 = r9.isProviderEnabled(r12)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x007c
            android.location.Location r7 = r9.getLastKnownLocation(r12)     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = "%slast known GPS location: %s"
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ all -> 0x0085 }
            r15[r5] = r4     // Catch:{ all -> 0x0085 }
            r15[r6] = r7     // Catch:{ all -> 0x0085 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r14, r15)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0086
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0085 }
            r14[r5] = r4     // Catch:{ all -> 0x0085 }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r17 = r7.getTime()     // Catch:{ all -> 0x0085 }
            long r15 = r15 - r17
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0085 }
            r14[r6] = r15     // Catch:{ all -> 0x0085 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r11, r14)     // Catch:{ all -> 0x0085 }
            goto L_0x0086
        L_0x007c:
            java.lang.String r7 = "%sgetBestLastKnownLocation: Gps location permission available, but GPS provider is disabled!"
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0085 }
            r14[r5] = r4     // Catch:{ all -> 0x0085 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r7, r14)     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r7 = r3
        L_0x0086:
            boolean r14 = r9.isProviderEnabled(r1)     // Catch:{ all -> 0x00be }
            if (r14 == 0) goto L_0x00b5
            android.location.Location r9 = r9.getLastKnownLocation(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r14 = "%slast known network location: %s"
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ all -> 0x00be }
            r15[r5] = r4     // Catch:{ all -> 0x00be }
            r15[r6] = r9     // Catch:{ all -> 0x00be }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r14, r15)     // Catch:{ all -> 0x00be }
            if (r9 == 0) goto L_0x00bf
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x00be }
            r14[r5] = r4     // Catch:{ all -> 0x00be }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00be }
            long r17 = r9.getTime()     // Catch:{ all -> 0x00be }
            long r15 = r15 - r17
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00be }
            r14[r6] = r15     // Catch:{ all -> 0x00be }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r11, r14)     // Catch:{ all -> 0x00be }
            goto L_0x00bf
        L_0x00b5:
            java.lang.String r9 = "%sgetBestLastKnownLocation: Network location permission available, but Network provider is disabled!"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x00be }
            r11[r5] = r4     // Catch:{ all -> 0x00be }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r11)     // Catch:{ all -> 0x00be }
        L_0x00be:
            r9 = r3
        L_0x00bf:
            android.location.Location r7 = m9165a((android.location.Location) r7, (android.location.Location) r9)     // Catch:{ all -> 0x00d6 }
            android.location.Location r9 = r0.f9960b     // Catch:{ all -> 0x00d6 }
            android.location.Location r7 = m9165a((android.location.Location) r7, (android.location.Location) r9)     // Catch:{ all -> 0x00d6 }
            java.lang.String r9 = "%sgetBestLastKnownLocation: returning - %s"
            java.lang.Object[] r11 = new java.lang.Object[r13]     // Catch:{ all -> 0x00d6 }
            r11[r5] = r4     // Catch:{ all -> 0x00d6 }
            r11[r6] = r7     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r11)     // Catch:{ all -> 0x00d6 }
            r3 = r7
            goto L_0x00d7
        L_0x00d6:
        L_0x00d7:
            android.content.Context r7 = r0.f9959a
            if (r7 == 0) goto L_0x00e2
            com.fyber.inneractive.sdk.util.h$a r9 = r0.f9961c
            if (r9 == 0) goto L_0x00e2
            com.fyber.inneractive.sdk.util.C3651h.m9077a(r7, r9)
        L_0x00e2:
            if (r3 == 0) goto L_0x0151
            com.fyber.inneractive.sdk.config.IAConfigManager r7 = com.fyber.inneractive.sdk.config.IAConfigManager.f6419n
            com.fyber.inneractive.sdk.config.m r7 = r7.f6436h
            int r7 = r7.f6614i
            java.lang.Object[] r9 = new java.lang.Object[r13]
            r9[r5] = r4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r9[r6] = r11
            java.lang.String r11 = "%sisLastKnownLocationGoodEnough: maxTimeAccInMin = %d"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r11, r9)
            int r7 = r7 * 60
            int r7 = r7 * 1000
            long r14 = (long) r7
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r5] = r4
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r7[r6] = r9
            java.lang.String r9 = "%sisLastKnownLocationGoodEnough: max time accuracy in msec = %d"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r7)
            long r16 = java.lang.System.currentTimeMillis()
            long r18 = r3.getTime()
            long r16 = r16 - r18
            long r16 = java.lang.Math.abs(r16)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r4
            r7[r6] = r3
            java.lang.Long r9 = java.lang.Long.valueOf(r16)
            r7[r13] = r9
            r9 = 3
            r18 = 60000(0xea60, double:2.9644E-319)
            long r18 = r16 / r18
            java.lang.Long r11 = java.lang.Long.valueOf(r18)
            r7[r9] = r11
            java.lang.String r9 = "%sisLastKnownLocationGoodEnough: location: = %s tss = %d tssM = %d"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r7)
            int r7 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x013f
            r7 = 1
            goto L_0x0140
        L_0x013f:
            r7 = 0
        L_0x0140:
            java.lang.Object[] r9 = new java.lang.Object[r13]
            r9[r5] = r4
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            r9[r6] = r11
            java.lang.String r11 = "%sisLastKnownLocationGoodEnough: returns - %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r11, r9)
            if (r7 != 0) goto L_0x01f2
        L_0x0151:
            android.content.Context r7 = r0.f9959a
            if (r7 != 0) goto L_0x0160
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "%sregisterForLocationUpdates called, but context is null!"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            goto L_0x01f2
        L_0x0160:
            java.lang.Object r7 = r7.getSystemService(r10)
            android.location.LocationManager r7 = (android.location.LocationManager) r7
            android.location.LocationListener r9 = r0.f9963e
            if (r9 != 0) goto L_0x0191
            boolean r8 = com.fyber.inneractive.sdk.util.C3657l.m9123d(r8)
            if (r8 != 0) goto L_0x0176
            boolean r8 = com.fyber.inneractive.sdk.util.C3657l.m9123d(r2)
            if (r8 == 0) goto L_0x019a
        L_0x0176:
            boolean r8 = r7.isProviderEnabled(r1)
            if (r8 == 0) goto L_0x019a
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r5] = r4
            java.lang.String r9 = "%sregisterting for network location updates"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r8)
            com.fyber.inneractive.sdk.util.s$2 r8 = new com.fyber.inneractive.sdk.util.s$2
            r8.<init>()
            r0.f9963e = r8
            r0.m9166a((java.lang.String) r1, (android.location.LocationListener) r8)
            r1 = 1
            goto L_0x019b
        L_0x0191:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r8 = "%snetwork location listener already registered"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r8, r1)
        L_0x019a:
            r1 = 0
        L_0x019b:
            android.location.LocationListener r8 = r0.f9964f
            if (r8 != 0) goto L_0x01bf
            boolean r2 = com.fyber.inneractive.sdk.util.C3657l.m9123d(r2)
            if (r2 == 0) goto L_0x01c8
            boolean r2 = r7.isProviderEnabled(r12)
            if (r2 == 0) goto L_0x01c8
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "%sregisterting for gps location updates"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            com.fyber.inneractive.sdk.util.s$3 r1 = new com.fyber.inneractive.sdk.util.s$3
            r1.<init>()
            r0.f9964f = r1
            r0.m9166a((java.lang.String) r12, (android.location.LocationListener) r1)
            goto L_0x01c9
        L_0x01bf:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r4
            java.lang.String r4 = "%sgps location listener already registered"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r4, r2)
        L_0x01c8:
            r6 = r1
        L_0x01c9:
            if (r6 == 0) goto L_0x01f2
            long r1 = java.lang.System.currentTimeMillis()
            r0.f9965g = r1
            java.lang.Runnable r1 = r0.f9962d
            if (r1 != 0) goto L_0x01dc
            com.fyber.inneractive.sdk.util.s$4 r1 = new com.fyber.inneractive.sdk.util.s$4
            r1.<init>()
            r0.f9962d = r1
        L_0x01dc:
            java.lang.Runnable r1 = r0.f9962d
            if (r1 == 0) goto L_0x01f2
            android.os.Handler r1 = com.fyber.inneractive.sdk.util.C3662m.m9137a()
            java.lang.Runnable r2 = r0.f9962d
            com.fyber.inneractive.sdk.config.IAConfigManager r4 = com.fyber.inneractive.sdk.config.IAConfigManager.f6419n
            com.fyber.inneractive.sdk.config.m r4 = r4.f6436h
            int r4 = r4.f6615j
            int r4 = r4 * 1000
            long r4 = (long) r4
            r1.postDelayed(r2, r4)
        L_0x01f2:
            return r3
        L_0x01f3:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "%sgetBestLastKnownLocation: did not find any location permissions"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3675s.mo19583a():android.location.Location");
    }

    /* renamed from: b */
    public final void mo19585b() {
        if (this.f9962d != null) {
            C3662m.m9137a().removeCallbacks(this.f9962d);
        }
    }

    /* renamed from: a */
    public final void mo19584a(LocationListener locationListener) {
        if (locationListener != null) {
            IAlog.m9034b("%sunregistering location listener: %s", "Location Manager: ", locationListener);
            Context context = this.f9959a;
            if (context == null) {
                IAlog.m9034b("%sunregisterFromLocationUpdates called, but context is null!", "Location Manager: ");
            } else if (locationListener != null) {
                try {
                    ((LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)).removeUpdates(locationListener);
                } catch (Exception unused) {
                    IAlog.m9034b("%sError retrieved when trying to stop location updates - updates were already paused.", "Location Manager: ");
                }
            }
        }
    }

    /* renamed from: a */
    private void m9166a(String str, LocationListener locationListener) {
        Context context = this.f9959a;
        if (context == null) {
            IAlog.m9034b("%sregisterForASingleLocationUpdate called, but context is null!", "Location Manager: ");
            return;
        }
        try {
            ((LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)).requestLocationUpdates(str, 0, 0.0f, locationListener, this.f9959a.getMainLooper());
            IAlog.m9034b("%sSuccessfully registered for %s location update", "Location Manager: ", str);
        } catch (SecurityException unused) {
            IAlog.m9034b("%sError retrieved when trying to get the network location - access appears to be disabled.", "Location Manager: ");
        } catch (IllegalArgumentException unused2) {
            IAlog.m9034b("%sError retrieved when trying to get the network location - device has no network provider.", "Location Manager: ");
        } catch (NullPointerException unused3) {
            IAlog.m9034b("%sError retrieved when trying to get the network location - NPE.", "Location Manager: ");
        }
    }

    /* renamed from: a */
    private static Location m9165a(Location location, Location location2) {
        if (location == null && location2 == null) {
            return null;
        }
        return (location == null || location2 == null) ? location != null ? location : location2 : location.getTime() > location2.getTime() ? location : location2;
    }
}
