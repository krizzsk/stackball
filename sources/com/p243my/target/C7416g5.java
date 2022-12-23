package com.p243my.target;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.g5 */
public final class C7416g5 extends C7438h5 {

    /* renamed from: a */
    public volatile boolean f18611a = true;

    /* renamed from: b */
    public volatile boolean f18612b = true;

    /* renamed from: com.my.target.g5$a */
    public static class C7417a implements C7418b {

        /* renamed from: a */
        public final String f18613a = "cdma";

        /* renamed from: b */
        public final int f18614b;

        /* renamed from: c */
        public final int f18615c;

        /* renamed from: d */
        public final int f18616d;

        /* renamed from: e */
        public final int f18617e;

        /* renamed from: f */
        public final int f18618f;

        /* renamed from: g */
        public final int f18619g;

        /* renamed from: h */
        public final int f18620h;

        /* renamed from: i */
        public final int f18621i;

        /* renamed from: j */
        public final int f18622j;

        /* renamed from: k */
        public final int f18623k;

        /* renamed from: l */
        public final int f18624l;

        /* renamed from: m */
        public final int f18625m;

        /* renamed from: n */
        public final int f18626n;

        /* renamed from: o */
        public final int f18627o;

        /* renamed from: p */
        public final int f18628p;

        public C7417a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f18614b = i;
            this.f18615c = i2;
            this.f18616d = i3;
            this.f18617e = i4;
            this.f18618f = i5;
            this.f18619g = i6;
            this.f18620h = i7;
            this.f18621i = i8;
            this.f18622j = i9;
            this.f18623k = i10;
            this.f18624l = i11;
            this.f18625m = i12;
            this.f18626n = i13;
            this.f18627o = i14;
            this.f18628p = i15;
        }

        /* renamed from: a */
        public String mo50225a() {
            return this.f18613a + "," + this.f18614b + "," + this.f18615c + "," + this.f18616d + "," + this.f18617e + "," + this.f18618f + "," + this.f18619g + "," + this.f18620h + "," + this.f18621i + "," + this.f18622j + "," + this.f18623k + "," + this.f18624l + "," + this.f18625m + "," + this.f18626n + "," + this.f18627o + "," + this.f18628p;
        }
    }

    /* renamed from: com.my.target.g5$b */
    public interface C7418b {
        /* renamed from: a */
        String mo50225a();
    }

    /* renamed from: com.my.target.g5$c */
    public static final class C7419c {

        /* renamed from: a */
        public List<C7418b> f18629a = null;

        public C7419c(Context context) {
            C7418b b;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    boolean z = true;
                    boolean z2 = i < 29 && C7438h5.checkPermission("android.permission.ACCESS_COARSE_LOCATION", context);
                    boolean checkPermission = C7438h5.checkPermission("android.permission.ACCESS_FINE_LOCATION", context);
                    if (z2 || checkPermission) {
                        if (i < 17) {
                            z = false;
                        }
                        if (z) {
                            this.f18629a = m19188a(telephonyManager);
                        }
                        List<C7418b> list = this.f18629a;
                        if ((list == null || list.isEmpty()) && (b = m19189b(telephonyManager)) != null) {
                            ArrayList arrayList = new ArrayList();
                            this.f18629a = arrayList;
                            arrayList.add(b);
                        }
                    }
                } catch (Throwable th) {
                    C7374e0.m18989a("Environment provider error " + th.getMessage());
                }
            }
        }

        /* JADX WARNING: type inference failed for: r22v0 */
        /* JADX WARNING: type inference failed for: r4v9, types: [com.my.target.g5$d] */
        /* JADX WARNING: type inference failed for: r4v10, types: [com.my.target.g5$d] */
        /* JADX WARNING: type inference failed for: r4v11, types: [com.my.target.g5$a] */
        /* JADX WARNING: type inference failed for: r7v10, types: [com.my.target.g5$d] */
        /* JADX WARNING: type inference failed for: r7v11, types: [com.my.target.g5$d] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<com.p243my.target.C7416g5.C7418b> m19188a(android.telephony.TelephonyManager r24) {
            /*
                java.util.List r0 = r24.getAllCellInfo()
                if (r0 != 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0011:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x026a
                java.lang.Object r2 = r0.next()
                android.telephony.CellInfo r2 = (android.telephony.CellInfo) r2
                boolean r3 = r2.isRegistered()
                if (r3 != 0) goto L_0x0024
                goto L_0x0011
            L_0x0024:
                boolean r3 = r2 instanceof android.telephony.CellInfoLte
                r4 = 24
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = 28
                if (r3 == 0) goto L_0x0094
                android.telephony.CellInfoLte r2 = (android.telephony.CellInfoLte) r2
                android.telephony.CellIdentityLte r3 = r2.getCellIdentity()
                android.telephony.CellSignalStrengthLte r2 = r2.getCellSignalStrength()
                com.my.target.g5$d r22 = new com.my.target.g5$d
                int r7 = r3.getCi()
                long r9 = (long) r7
                r11 = 2147483647(0x7fffffff, float:NaN)
                int r7 = android.os.Build.VERSION.SDK_INT
                if (r7 < r6) goto L_0x004c
                java.lang.String r8 = r3.getMccString()
                goto L_0x0054
            L_0x004c:
                int r8 = r3.getMcc()
                java.lang.String r8 = java.lang.String.valueOf(r8)
            L_0x0054:
                r12 = r8
                if (r7 < r6) goto L_0x005c
                java.lang.String r6 = r3.getMncString()
                goto L_0x0064
            L_0x005c:
                int r6 = r3.getMnc()
                java.lang.String r6 = java.lang.String.valueOf(r6)
            L_0x0064:
                r13 = r6
                int r14 = r2.getLevel()
                int r15 = r2.getDbm()
                int r16 = r2.getAsuLevel()
                int r17 = r2.getTimingAdvance()
                if (r7 < r4) goto L_0x007e
                int r5 = r3.getEarfcn()
                r18 = r5
                goto L_0x0081
            L_0x007e:
                r18 = 2147483647(0x7fffffff, float:NaN)
            L_0x0081:
                int r21 = r3.getTac()
                r19 = 2147483647(0x7fffffff, float:NaN)
                r20 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r8 = "lte"
                r7 = r22
                r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                goto L_0x01c8
            L_0x0094:
                boolean r3 = r2 instanceof android.telephony.CellInfoGsm
                if (r3 == 0) goto L_0x0108
                android.telephony.CellInfoGsm r2 = (android.telephony.CellInfoGsm) r2
                android.telephony.CellIdentityGsm r3 = r2.getCellIdentity()
                android.telephony.CellSignalStrengthGsm r2 = r2.getCellSignalStrength()
                com.my.target.g5$d r22 = new com.my.target.g5$d
                int r7 = r3.getCid()
                long r9 = (long) r7
                int r11 = r3.getLac()
                int r7 = android.os.Build.VERSION.SDK_INT
                if (r7 < r6) goto L_0x00b6
                java.lang.String r8 = r3.getMccString()
                goto L_0x00be
            L_0x00b6:
                int r8 = r3.getMcc()
                java.lang.String r8 = java.lang.String.valueOf(r8)
            L_0x00be:
                r12 = r8
                if (r7 < r6) goto L_0x00c6
                java.lang.String r6 = r3.getMncString()
                goto L_0x00ce
            L_0x00c6:
                int r6 = r3.getMnc()
                java.lang.String r6 = java.lang.String.valueOf(r6)
            L_0x00ce:
                r13 = r6
                int r14 = r2.getLevel()
                int r15 = r2.getDbm()
                int r16 = r2.getAsuLevel()
                r6 = 26
                if (r7 < r6) goto L_0x00e6
                int r2 = r2.getTimingAdvance()
                r17 = r2
                goto L_0x00e9
            L_0x00e6:
                r17 = 2147483647(0x7fffffff, float:NaN)
            L_0x00e9:
                r18 = 2147483647(0x7fffffff, float:NaN)
                if (r7 < r4) goto L_0x00f5
                int r5 = r3.getBsic()
                r19 = r5
                goto L_0x00f8
            L_0x00f5:
                r19 = 2147483647(0x7fffffff, float:NaN)
            L_0x00f8:
                int r20 = r3.getPsc()
                r21 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r8 = "gsm"
                r7 = r22
                r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                goto L_0x01c8
            L_0x0108:
                int r3 = android.os.Build.VERSION.SDK_INT
                r7 = 18
                if (r3 < r7) goto L_0x0177
                boolean r7 = r2 instanceof android.telephony.CellInfoWcdma
                if (r7 == 0) goto L_0x0177
                android.telephony.CellInfoWcdma r2 = (android.telephony.CellInfoWcdma) r2
                android.telephony.CellIdentityWcdma r7 = r2.getCellIdentity()
                android.telephony.CellSignalStrengthWcdma r2 = r2.getCellSignalStrength()
                com.my.target.g5$d r23 = new com.my.target.g5$d
                int r8 = r7.getCid()
                long r10 = (long) r8
                int r12 = r7.getLac()
                if (r3 < r6) goto L_0x012e
                java.lang.String r8 = r7.getMccString()
                goto L_0x0136
            L_0x012e:
                int r8 = r7.getMcc()
                java.lang.String r8 = java.lang.String.valueOf(r8)
            L_0x0136:
                r13 = r8
                if (r3 < r6) goto L_0x013e
                java.lang.String r6 = r7.getMncString()
                goto L_0x0146
            L_0x013e:
                int r6 = r7.getMnc()
                java.lang.String r6 = java.lang.String.valueOf(r6)
            L_0x0146:
                r14 = r6
                int r15 = r2.getLevel()
                int r16 = r2.getDbm()
                int r17 = r2.getAsuLevel()
                r18 = 2147483647(0x7fffffff, float:NaN)
                if (r3 < r4) goto L_0x015f
                int r5 = r7.getUarfcn()
                r19 = r5
                goto L_0x0162
            L_0x015f:
                r19 = 2147483647(0x7fffffff, float:NaN)
            L_0x0162:
                int r21 = r7.getPsc()
                r20 = 2147483647(0x7fffffff, float:NaN)
                r22 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r9 = "wcdma"
                r8 = r23
                r8.<init>(r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r2 = r23
                goto L_0x0265
            L_0x0177:
                boolean r4 = r2 instanceof android.telephony.CellInfoCdma
                if (r4 == 0) goto L_0x01cc
                android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2
                android.telephony.CellIdentityCdma r3 = r2.getCellIdentity()
                android.telephony.CellSignalStrengthCdma r2 = r2.getCellSignalStrength()
                com.my.target.g5$a r22 = new com.my.target.g5$a
                int r5 = r3.getNetworkId()
                int r6 = r3.getSystemId()
                int r7 = r3.getBasestationId()
                int r8 = r3.getLatitude()
                int r9 = r3.getLongitude()
                int r10 = r2.getCdmaLevel()
                int r11 = r2.getLevel()
                int r12 = r2.getEvdoLevel()
                int r13 = r2.getAsuLevel()
                int r14 = r2.getCdmaDbm()
                int r15 = r2.getDbm()
                int r16 = r2.getEvdoDbm()
                int r17 = r2.getEvdoEcio()
                int r18 = r2.getCdmaEcio()
                int r19 = r2.getEvdoSnr()
                r4 = r22
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x01c8:
                r2 = r22
                goto L_0x0265
            L_0x01cc:
                r4 = 29
                if (r3 < r4) goto L_0x0218
                boolean r4 = r2 instanceof android.telephony.CellInfoNr
                if (r4 == 0) goto L_0x0218
                android.telephony.CellInfoNr r2 = (android.telephony.CellInfoNr) r2
                android.telephony.CellIdentity r3 = r2.getCellIdentity()
                android.telephony.CellIdentityNr r3 = (android.telephony.CellIdentityNr) r3
                android.telephony.CellSignalStrength r2 = r2.getCellSignalStrength()
                android.telephony.CellSignalStrengthNr r2 = (android.telephony.CellSignalStrengthNr) r2
                com.my.target.g5$d r22 = new com.my.target.g5$d
                long r6 = r3.getNci()
                java.lang.String r9 = r3.getMccString()
                java.lang.String r10 = r3.getMncString()
                int r11 = r2.getLevel()
                int r12 = r2.getDbm()
                int r13 = r2.getAsuLevel()
                int r15 = r3.getNrarfcn()
                int r18 = r3.getTac()
                r8 = 2147483647(0x7fffffff, float:NaN)
                r14 = 2147483647(0x7fffffff, float:NaN)
                r16 = 2147483647(0x7fffffff, float:NaN)
                r17 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r5 = "nr"
                r4 = r22
                r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                goto L_0x01c8
            L_0x0218:
                r4 = 30
                if (r3 < r4) goto L_0x0011
                boolean r3 = r2 instanceof android.telephony.CellInfoTdscdma
                if (r3 == 0) goto L_0x0011
                r3 = r2
                android.telephony.CellInfoTdscdma r3 = (android.telephony.CellInfoTdscdma) r3
                android.telephony.CellIdentityTdscdma r3 = r3.getCellIdentity()
                android.telephony.CellSignalStrength r2 = r2.getCellSignalStrength()
                android.telephony.CellSignalStrengthTdscdma r2 = (android.telephony.CellSignalStrengthTdscdma) r2
                com.my.target.g5$d r22 = new com.my.target.g5$d
                int r4 = r3.getCid()
                long r6 = (long) r4
                int r8 = r3.getLac()
                java.lang.String r9 = r3.getMccString()
                java.lang.String r10 = r3.getMncString()
                int r11 = r2.getLevel()
                int r12 = r2.getDbm()
                int r13 = r2.getAsuLevel()
                int r15 = r3.getUarfcn()
                r14 = 2147483647(0x7fffffff, float:NaN)
                r16 = 2147483647(0x7fffffff, float:NaN)
                r17 = 2147483647(0x7fffffff, float:NaN)
                r18 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r5 = "tdscdma"
                r4 = r22
                r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                goto L_0x01c8
            L_0x0265:
                r1.add(r2)
                goto L_0x0011
            L_0x026a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7416g5.C7419c.m19188a(android.telephony.TelephonyManager):java.util.List");
        }

        /* renamed from: b */
        public static C7418b m19189b(TelephonyManager telephonyManager) {
            String str;
            String str2;
            String str3;
            CellLocation cellLocation = telephonyManager.getCellLocation();
            String str4 = null;
            if (!(cellLocation instanceof GsmCellLocation)) {
                return null;
            }
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator == null || networkOperator.length() == 0) {
                str2 = null;
                str = null;
            } else {
                try {
                    str3 = networkOperator.substring(0, 3);
                    try {
                        str4 = networkOperator.substring(3);
                    } catch (Throwable unused) {
                        C7374e0.m18989a("unable to substring network operator " + networkOperator);
                        str = str4;
                        str2 = str3;
                        return new C7420d("gsm", (long) gsmCellLocation.getCid(), gsmCellLocation.getLac(), str2, str, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    }
                } catch (Throwable unused2) {
                    str3 = null;
                    C7374e0.m18989a("unable to substring network operator " + networkOperator);
                    str = str4;
                    str2 = str3;
                    return new C7420d("gsm", (long) gsmCellLocation.getCid(), gsmCellLocation.getLac(), str2, str, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                }
                str = str4;
                str2 = str3;
            }
            return new C7420d("gsm", (long) gsmCellLocation.getCid(), gsmCellLocation.getLac(), str2, str, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    /* renamed from: com.my.target.g5$d */
    public static class C7420d implements C7418b {

        /* renamed from: a */
        public final String f18630a;

        /* renamed from: b */
        public final String f18631b;

        /* renamed from: c */
        public final String f18632c;

        /* renamed from: d */
        public final long f18633d;

        /* renamed from: e */
        public final int f18634e;

        /* renamed from: f */
        public final int f18635f;

        /* renamed from: g */
        public final int f18636g;

        /* renamed from: h */
        public final int f18637h;

        /* renamed from: i */
        public final int f18638i;

        /* renamed from: j */
        public final int f18639j;

        /* renamed from: k */
        public final int f18640k;

        /* renamed from: l */
        public final int f18641l;

        /* renamed from: m */
        public final int f18642m;

        public C7420d(String str, long j, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f18630a = str;
            this.f18633d = j;
            this.f18634e = i;
            this.f18631b = str2 == null ? String.valueOf(Integer.MAX_VALUE) : str2;
            this.f18632c = str3 == null ? String.valueOf(Integer.MAX_VALUE) : str3;
            this.f18635f = i2;
            this.f18636g = i3;
            this.f18637h = i4;
            this.f18638i = i5;
            this.f18639j = i6;
            this.f18640k = i7;
            this.f18641l = i8;
            this.f18642m = i9;
        }

        /* renamed from: a */
        public String mo50225a() {
            return this.f18630a + "," + this.f18633d + "," + this.f18634e + "," + this.f18631b + "," + this.f18632c + "," + this.f18635f + "," + this.f18636g + "," + this.f18637h + "," + this.f18638i + "," + this.f18639j + "," + this.f18640k + "," + this.f18641l + "," + this.f18642m;
        }
    }

    /* renamed from: com.my.target.g5$e */
    public static final class C7421e {

        /* renamed from: a */
        public WifiInfo f18643a;

        /* renamed from: b */
        public List<ScanResult> f18644b;

        public C7421e(Context context) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                if (wifiManager == null) {
                    return;
                }
                if (wifiManager.isWifiEnabled()) {
                    this.f18643a = wifiManager.getConnectionInfo();
                    if (Build.VERSION.SDK_INT < 24 || C7416g5.m19178a(context)) {
                        this.f18644b = wifiManager.getScanResults();
                    }
                    List<ScanResult> list = this.f18644b;
                    if (list != null) {
                        Collections.sort(list, $$Lambda$zeRthRYdRcsQHFgQxLsrmCvhmZM.INSTANCE);
                    }
                }
            } catch (Throwable unused) {
                C7374e0.m18989a("No permissions for access to wifi state");
            }
        }

        /* renamed from: a */
        public static /* synthetic */ int m19191a(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    /* renamed from: a */
    public static boolean m19178a(Context context) {
        return C7438h5.checkPermission("android.permission.ACCESS_FINE_LOCATION", context) || C7438h5.checkPermission("android.permission.ACCESS_COARSE_LOCATION", context);
    }

    /* renamed from: b */
    public static void m19179b(Context context, Map<String, String> map) {
        LocationManager locationManager;
        if (m19178a(context) && (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)) != null) {
            float f = Float.MAX_VALUE;
            long j = 0;
            Location location = null;
            String str = null;
            for (String next : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(next);
                    if (lastKnownLocation != null) {
                        C7374e0.m18989a("locationProvider: " + next);
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f)) {
                            str = next;
                            location = lastKnownLocation;
                            f = accuracy;
                            j = time;
                        }
                    }
                } catch (Throwable unused) {
                    C7374e0.m18989a("No permissions for get geo data");
                }
            }
            if (location != null) {
                String str2 = location.getLatitude() + "," + location.getLongitude() + "," + location.getAccuracy() + "," + location.getSpeed() + "," + (j / 1000);
                map.put(FirebaseAnalytics.Param.LOCATION, str2);
                C7374e0.m18989a("location: " + str2);
                map.put("location_provider", str);
            }
        }
    }

    /* renamed from: a */
    public final void mo50220a(Context context, Map<String, String> map) {
        List<C7418b> list;
        if (this.f18612b && C7438h5.checkPermission("android.permission.ACCESS_COARSE_LOCATION", context) && (list = new C7419c(context).f18629a) != null) {
            int i = 0;
            while (i < list.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("cell");
                sb.append(i != 0 ? Integer.valueOf(i) : "");
                map.put(sb.toString(), list.get(i).mo50225a());
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo50221a(boolean z) {
        this.f18612b = z;
    }

    /* renamed from: b */
    public void m19180c(Context context) {
        if (!this.f18611a) {
            removeAll();
            return;
        }
        HashMap hashMap = new HashMap();
        m19179b(context, hashMap);
        mo50224c(context, hashMap);
        mo50220a(context, hashMap);
        synchronized (this) {
            removeAll();
            addParams(hashMap);
        }
    }

    /* renamed from: b */
    public void mo50223b(boolean z) {
        this.f18611a = z;
    }

    /* renamed from: c */
    public final void mo50224c(Context context, Map<String, String> map) {
        if (this.f18612b && C7438h5.checkPermission("android.permission.ACCESS_WIFI_STATE", context)) {
            C7421e eVar = new C7421e(context);
            WifiInfo wifiInfo = eVar.f18643a;
            if (wifiInfo != null) {
                String bssid = wifiInfo.getBSSID();
                if (bssid == null) {
                    bssid = "";
                }
                int linkSpeed = wifiInfo.getLinkSpeed();
                int networkId = wifiInfo.getNetworkId();
                int rssi = wifiInfo.getRssi();
                String ssid = wifiInfo.getSSID();
                if (ssid == null) {
                    ssid = "";
                }
                String str = bssid + "," + ssid + "," + rssi + "," + networkId + "," + linkSpeed;
                map.put(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI, str);
                C7374e0.m18989a("ip: " + wifiInfo.getIpAddress());
                C7374e0.m18989a("wifi: " + str);
            }
            List<ScanResult> list = eVar.f18644b;
            if (list != null) {
                int i = 0;
                int min = Math.min(list.size(), 5);
                while (i < min) {
                    ScanResult scanResult = list.get(i);
                    C7374e0.m18989a(scanResult.level + "");
                    String str2 = scanResult.BSSID;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = scanResult.SSID;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str2 + "," + str3 + "," + scanResult.level;
                    StringBuilder sb = new StringBuilder();
                    sb.append(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                    i++;
                    sb.append(i);
                    map.put(sb.toString(), str4);
                    C7374e0.m18989a(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI + i + ": " + str4);
                }
            }
        }
    }

    public void collectData(Context context) {
        C7395f0.m19088b(new Runnable(context) {
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7416g5.this.m19180c(this.f$1);
            }
        });
    }
}
