package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import java.util.Collections;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.l */
public final class C7824l {

    /* renamed from: b */
    public static int f19928b = 5;

    /* renamed from: a */
    private volatile boolean f19929a = true;

    /* renamed from: a */
    static void m21252a(C7831m0 m0Var, Context context) {
        List<CellInfo> allCellInfo;
        int i = Build.VERSION.SDK_INT;
        if (i < 17) {
            C7877u0.m21547a("EnvironmentParamsDataProvider: low Android version");
            return;
        }
        if (i < 29) {
            if (!C7815h0.m21188a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                C7877u0.m21547a("EnvironmentParamsDataProvider: can't access information");
                return;
            }
        } else if (!C7815h0.m21188a("android.permission.ACCESS_FINE_LOCATION", context)) {
            C7877u0.m21547a("EnvironmentParamsDataProvider: can't access information");
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && (allCellInfo = telephonyManager.getAllCellInfo()) != null) {
                if (!allCellInfo.isEmpty()) {
                    boolean z = true;
                    for (CellInfo next : allCellInfo) {
                        if (next.isRegistered()) {
                            if (next instanceof CellInfoCdma) {
                                m21253a(m0Var, (CellInfoCdma) next);
                            } else if (next instanceof CellInfoGsm) {
                                m21254a(m0Var, (CellInfoGsm) next);
                            } else if (next instanceof CellInfoLte) {
                                m21255a(m0Var, (CellInfoLte) next);
                            } else {
                                int i2 = Build.VERSION.SDK_INT;
                                if (i2 >= 18 && (next instanceof CellInfoWcdma)) {
                                    m21258a(m0Var, (CellInfoWcdma) next);
                                } else if (i2 >= 29 && (next instanceof CellInfoTdscdma)) {
                                    m21257a(m0Var, (CellInfoTdscdma) next);
                                } else if (i2 >= 29 && (next instanceof CellInfoNr)) {
                                    m21256a(m0Var, (CellInfoNr) next);
                                }
                            }
                            z = false;
                        }
                    }
                    if (z) {
                        m21259a(m0Var, telephonyManager);
                    }
                }
            }
        } catch (Throwable th) {
            C7877u0.m21548a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
        }
    }

    /* renamed from: a */
    static void m21253a(C7831m0 m0Var, CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        m0Var.mo52380a(cellIdentity.getNetworkId(), cellIdentity.getSystemId(), cellIdentity.getBasestationId(), cellIdentity.getLatitude(), cellIdentity.getLongitude(), cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    /* renamed from: a */
    static void m21254a(C7831m0 m0Var, CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        m0Var.mo52390a(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getArfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getBsic() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : Integer.MAX_VALUE);
    }

    /* renamed from: a */
    static void m21255a(C7831m0 m0Var, CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        m0Var.mo52402b(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), i >= 24 ? cellIdentity.getEarfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getPci() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : Integer.MAX_VALUE);
    }

    /* renamed from: a */
    static void m21256a(C7831m0 m0Var, CellInfoNr cellInfoNr) {
        CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
        CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellInfoNr.getCellSignalStrength();
        m0Var.mo52391a(cellIdentityNr.getMccString(), cellIdentityNr.getMncString(), cellIdentityNr.getNci(), cellIdentityNr.getTac(), cellIdentityNr.getNrarfcn(), cellIdentityNr.getPci(), cellSignalStrengthNr.getLevel(), cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getAsuLevel());
    }

    /* renamed from: a */
    static void m21257a(C7831m0 m0Var, CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        m0Var.mo52389a(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    /* renamed from: a */
    static void m21258a(C7831m0 m0Var, CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        m0Var.mo52401b(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getUarfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getPsc() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    /* renamed from: a */
    static void m21259a(C7831m0 m0Var, TelephonyManager telephonyManager) {
        String str;
        String str2;
        String str3;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        if (cellLocation instanceof GsmCellLocation) {
            String networkOperator = telephonyManager.getNetworkOperator();
            String str4 = null;
            if (!TextUtils.isEmpty(networkOperator)) {
                try {
                    str3 = networkOperator.substring(0, 3);
                    try {
                        str4 = networkOperator.substring(3);
                    } catch (Throwable unused) {
                        C7877u0.m21547a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                        str2 = str3;
                        str = str4;
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        m0Var.mo52390a(str2, str, gsmCellLocation.getCid(), gsmCellLocation.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    }
                } catch (Throwable unused2) {
                    str3 = null;
                    C7877u0.m21547a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                    str2 = str3;
                    str = str4;
                    GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
                    m0Var.mo52390a(str2, str, gsmCellLocation2.getCid(), gsmCellLocation2.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                }
                str2 = str3;
                str = str4;
            } else {
                str2 = null;
                str = null;
            }
            GsmCellLocation gsmCellLocation22 = (GsmCellLocation) cellLocation;
            m0Var.mo52390a(str2, str, gsmCellLocation22.getCid(), gsmCellLocation22.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    /* renamed from: a */
    public static boolean m21260a(int i) {
        return Integer.MAX_VALUE != i;
    }

    /* renamed from: a */
    public static boolean m21261a(long j) {
        return Long.MAX_VALUE != j;
    }

    /* renamed from: b */
    static void m21262b(C7831m0 m0Var, Context context) {
        List<ScanResult> scanResults;
        if (C7815h0.m21188a("android.permission.ACCESS_WIFI_STATE", context)) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                if (wifiManager == null) {
                    return;
                }
                if (wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        m0Var.mo52388a(connectionInfo.getSSID(), connectionInfo.getBSSID(), connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                    }
                    if ((Build.VERSION.SDK_INT >= 24 && !C7815h0.m21188a("android.permission.ACCESS_FINE_LOCATION", context) && !C7815h0.m21188a("android.permission.ACCESS_COARSE_LOCATION", context)) || (scanResults = wifiManager.getScanResults()) == null) {
                        return;
                    }
                    if (!scanResults.isEmpty()) {
                        Collections.sort(scanResults, $$Lambda$l$Et7DzeS9hEUVL2jCD186bWN6aW8.INSTANCE);
                        int min = Math.min(scanResults.size(), f19928b);
                        for (int i = 0; i < min; i++) {
                            ScanResult scanResult = scanResults.get(i);
                            m0Var.mo52387a(scanResult.SSID, scanResult.BSSID, scanResult.level);
                        }
                    }
                }
            } catch (Throwable th) {
                C7877u0.m21548a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            }
        }
    }

    /* renamed from: a */
    public void mo52339a(Context context) {
    }

    /* renamed from: a */
    public void mo52340a(boolean z) {
        this.f19929a = z;
    }

    /* renamed from: b */
    public void mo52341b(Context context) {
    }

    /* renamed from: c */
    public void mo52342c(C7831m0 m0Var, Context context) {
        if (this.f19929a) {
            m21252a(m0Var, context);
            m21262b(m0Var, context);
        }
    }
}
