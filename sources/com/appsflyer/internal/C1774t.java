package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.t */
public final class C1774t {

    /* renamed from: com.appsflyer.internal.t$e */
    public static final class C1776e {

        /* renamed from: ι */
        public static final C1774t f4250 = new C1774t();
    }

    C1774t() {
    }

    /* renamed from: ǃ */
    private static boolean m3906(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    /* renamed from: com.appsflyer.internal.t$d */
    public static final class C1775d {

        /* renamed from: ı */
        public final String f4247;

        /* renamed from: ǃ */
        public final String f4248;

        /* renamed from: Ι */
        public final String f4249;

        C1775d(String str, String str2, String str3) {
            this.f4247 = str;
            this.f4248 = str2;
            this.f4249 = str3;
        }
    }

    /* renamed from: ι */
    public static C1775d m3907(Context context) {
        String str;
        String str2;
        String str3;
        String str4 = "unknown";
        String str5 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                int i = 0;
                if (21 <= Build.VERSION.SDK_INT) {
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    int length = allNetworks.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                        if (!m3906(networkInfo)) {
                            i++;
                        } else if (1 != networkInfo.getType()) {
                            if (networkInfo.getType() == 0) {
                            }
                        }
                    }
                } else if (!m3906(connectivityManager.getNetworkInfo(1))) {
                    if (!m3906(connectivityManager.getNetworkInfo(0))) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (m3906(activeNetworkInfo)) {
                            if (1 != activeNetworkInfo.getType()) {
                                if (activeNetworkInfo.getType() == 0) {
                                }
                            }
                        }
                    }
                    str4 = "MOBILE";
                }
                str4 = "WIFI";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str = telephonyManager.getSimOperatorName();
            try {
                str2 = telephonyManager.getNetworkOperatorName();
                if ((str2 == null || str2.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    str2 = "CDMA";
                }
            } catch (Throwable th) {
                th = th;
                String str6 = str;
                str3 = null;
                str5 = str6;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str7 = str3;
                str = str5;
                str2 = str7;
                return new C1775d(str4, str2, str);
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = null;
            AFLogger.afErrorLog("Exception while collecting network info. ", th);
            String str72 = str3;
            str = str5;
            str2 = str72;
            return new C1775d(str4, str2, str);
        }
        return new C1775d(str4, str2, str);
    }
}
