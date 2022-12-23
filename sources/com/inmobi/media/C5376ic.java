package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.inmobi.media.ic */
/* compiled from: CellularInfoUtil */
public class C5376ic {

    /* renamed from: a */
    private static final String f12314a = C5376ic.class.getSimpleName();

    /* renamed from: a */
    private static boolean m12444a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static Map<String, String> m12443a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        Context c = C5314go.m12203c();
        if (c == null) {
            return hashMap;
        }
        C5371hz.m12430a();
        String m = C5314go.m12220m();
        C5382ig b = C5384ii.m12471b();
        String str3 = null;
        String e = b != null ? b.mo40745e() : null;
        if (!((m == null || C5371hz.m12429a(m).f12044c.f12043oe) && (e == null || b.mo40743c()) && (!(b != null && b.mo40744d()) || C5371hz.m12429a(e).f12044c.f12043oe))) {
            return hashMap;
        }
        String g = "InMobi".equals(str) ? C5314go.m12213g() : C5314go.m12215h();
        C5371hz.m12430a();
        int i = C5371hz.m12429a(g).f12044c.cof;
        boolean a = m12444a(i, 2);
        boolean a2 = m12444a(i, 1);
        C5374ia iaVar = new C5374ia();
        TelephonyManager telephonyManager = (TelephonyManager) c.getSystemService("phone");
        if (!a) {
            int[] b2 = m12446b(telephonyManager.getNetworkOperator());
            iaVar.f12305a = b2[0];
            iaVar.f12306b = b2[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                iaVar.f12309e = networkCountryIso.toLowerCase(Locale.ENGLISH);
            }
        }
        if (!a2) {
            int[] b3 = m12446b(telephonyManager.getSimOperator());
            iaVar.f12307c = b3[0];
            iaVar.f12308d = b3[1];
        }
        if (iaVar.f12307c == -1 && iaVar.f12308d == -1) {
            str2 = null;
        } else {
            str2 = iaVar.f12307c + "_" + iaVar.f12308d;
        }
        hashMap.put("s-ho", str2);
        if (!(iaVar.f12305a == -1 && iaVar.f12306b == -1)) {
            str3 = iaVar.f12305a + "_" + iaVar.f12306b;
        }
        hashMap.put("s-co", str3);
        hashMap.put("s-iso", iaVar.f12309e);
        hashMap.put("s-cn", C5342he.m12327a(c));
        return hashMap;
    }

    /* renamed from: b */
    private static int[] m12446b(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !"".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str.substring(0, 3));
                int parseInt2 = Integer.parseInt(str.substring(3));
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static boolean m12447c() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        LocationManager locationManager = (LocationManager) C5314go.m12203c().getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (locationManager == null || !locationManager.isLocationEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m12448d() {
        if (!C5314go.m12197a()) {
            return false;
        }
        boolean a = C5329gy.m12278a(C5314go.m12203c(), "android.permission.READ_PHONE_STATE");
        boolean a2 = C5329gy.m12278a(C5314go.m12203c(), "android.permission.ACCESS_FINE_LOCATION");
        if (Build.VERSION.SDK_INT == 29) {
            return a2;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (!a2 || !a) {
                return false;
            }
            return true;
        } else if (C5329gy.m12278a(C5314go.m12203c(), "android.permission.ACCESS_COARSE_LOCATION") || a2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static int m12441a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return telephonyManager.getDataNetworkType();
        }
        return telephonyManager.getNetworkType();
    }

    /* renamed from: a */
    public static Map<String, String> m12442a() {
        Context c;
        List<CellInfo> allCellInfo;
        C5371hz.m12430a();
        String m = C5314go.m12220m();
        C5382ig b = C5384ii.m12471b();
        C5375ib ibVar = null;
        String e = b != null ? b.mo40745e() : null;
        if (((m == null || C5371hz.m12429a(m).f12044c.cce) && (e == null || b.mo40743c()) && (!(b != null && b.mo40744d()) || C5371hz.m12429a(e).f12044c.cce)) && m12448d() && m12447c() && (c = C5314go.m12203c()) != null) {
            TelephonyManager telephonyManager = (TelephonyManager) c.getSystemService("phone");
            int[] b2 = m12446b(telephonyManager.getNetworkOperator());
            String valueOf = String.valueOf(b2[0]);
            String valueOf2 = String.valueOf(b2[1]);
            if (Build.VERSION.SDK_INT >= 17 && (allCellInfo = telephonyManager.getAllCellInfo()) != null) {
                CellInfo cellInfo = null;
                for (int i = 0; i < allCellInfo.size(); i++) {
                    cellInfo = allCellInfo.get(i);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    ibVar = new C5375ib(cellInfo, valueOf, valueOf2, m12441a(telephonyManager));
                }
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (!(cellLocation == null || b2[0] == -1)) {
                ibVar = new C5375ib();
                if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    ibVar.f12312b = Integer.MAX_VALUE;
                    ibVar.f12313c = m12441a(telephonyManager);
                    ibVar.f12311a = C5375ib.m12438a(valueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                } else {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    ibVar.f12312b = Integer.MAX_VALUE;
                    ibVar.f12313c = m12441a(telephonyManager);
                    ibVar.f12311a = C5375ib.m12439a(valueOf, valueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                }
            }
        }
        HashMap hashMap = new HashMap();
        if (ibVar != null) {
            hashMap.put("c-sc", ibVar.mo40738a().toString());
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m12445b() {
        /*
            boolean r0 = com.inmobi.media.C5314go.m12197a()
            r1 = 1
            if (r0 == 0) goto L_0x00c8
            boolean r0 = m12448d()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = m12447c()
            if (r0 == 0) goto L_0x00c8
            com.inmobi.media.C5371hz.m12430a()
            java.lang.String r0 = com.inmobi.media.C5314go.m12220m()
            com.inmobi.media.ig r2 = com.inmobi.media.C5384ii.m12471b()
            if (r2 == 0) goto L_0x0025
            java.lang.String r3 = r2.mo40745e()
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r4 = 0
            if (r2 == 0) goto L_0x0031
            boolean r5 = r2.mo40744d()
            if (r5 == 0) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0041
            com.inmobi.media.fl$b r0 = com.inmobi.media.C5371hz.m12429a(r0)
            com.inmobi.media.fl$a r0 = r0.f12044c
            boolean r0 = r0.vce
            if (r0 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r0 = 0
            goto L_0x0042
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r3 == 0) goto L_0x004d
            boolean r2 = r2.mo40743c()
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = 0
            goto L_0x004e
        L_0x004d:
            r2 = 1
        L_0x004e:
            if (r5 == 0) goto L_0x005d
            com.inmobi.media.fl$b r3 = com.inmobi.media.C5371hz.m12429a(r3)
            com.inmobi.media.fl$a r3 = r3.f12044c
            boolean r3 = r3.vce
            if (r3 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r3 = 0
            goto L_0x005e
        L_0x005d:
            r3 = 1
        L_0x005e:
            if (r0 == 0) goto L_0x0066
            if (r2 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0066
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            if (r0 != 0) goto L_0x006a
            goto L_0x00c8
        L_0x006a:
            android.content.Context r0 = com.inmobi.media.C5314go.m12203c()
            if (r0 != 0) goto L_0x0076
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x00cd
        L_0x0076:
            java.lang.String r2 = "phone"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r0.getNetworkOperator()
            int[] r3 = m12446b(r3)
            r4 = r3[r4]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3 = r3[r1]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 < r6) goto L_0x00c6
            java.util.List r5 = r0.getAllCellInfo()
            if (r5 == 0) goto L_0x00c6
            java.util.Iterator r5 = r5.iterator()
        L_0x00a7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c6
            java.lang.Object r6 = r5.next()
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6
            boolean r7 = r6.isRegistered()
            if (r7 != 0) goto L_0x00a7
            com.inmobi.media.ib r7 = new com.inmobi.media.ib
            int r8 = m12441a((android.telephony.TelephonyManager) r0)
            r7.<init>(r6, r4, r3, r8)
            r2.add(r7)
            goto L_0x00a7
        L_0x00c6:
            r0 = r2
            goto L_0x00cd
        L_0x00c8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00cd:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x00f8
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            int r4 = r0.size()
            int r4 = r4 - r1
            java.lang.Object r0 = r0.get(r4)
            com.inmobi.media.ib r0 = (com.inmobi.media.C5375ib) r0
            org.json.JSONObject r0 = r0.mo40738a()
            r3.put(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "v-sc"
            r2.put(r1, r0)
        L_0x00f8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5376ic.m12445b():java.util.Map");
    }
}
