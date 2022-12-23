package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.inmobi.media.he */
/* compiled from: DeviceInfo */
public class C5342he {
    /* renamed from: c */
    private static String m12331c() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context c = C5314go.m12203c();
        if (c == null || !C5329gy.m12278a(c, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) c.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 0) {
                return type + "|" + subtype;
            } else if (type != 1) {
                return Integer.toString(type);
            }
        } else {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "0|" + activeNetworkInfo.getSubtype();
            } else if (!networkCapabilities.hasTransport(1)) {
                if (networkCapabilities.hasTransport(2)) {
                    return "7";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "9";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "17";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "10";
                }
                return networkCapabilities.hasTransport(6) ? "11" : "8";
            }
        }
        return "1";
    }

    /* renamed from: a */
    public static String m12327a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
    }

    /* renamed from: a */
    public static Map<String, String> m12328a(boolean z) {
        int i;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-brand-name", Build.BRAND);
            hashMap.put("d-manufacturer-name", Build.MANUFACTURER);
            hashMap.put("d-model-name", Build.MODEL);
            hashMap.put("d-nettype-raw", m12331c());
            hashMap.put("d-localization", Locale.getDefault().toString());
            hashMap.put("d-language", Locale.getDefault().getLanguage());
            Context c = C5314go.m12203c();
            if (c != null) {
                if (!z) {
                    AudioManager audioManager = (AudioManager) c.getSystemService("audio");
                    i = (audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3);
                    hashMap.put("d-media-volume", String.valueOf(i));
                    return hashMap;
                }
            }
            i = 0;
            hashMap.put("d-media-volume", String.valueOf(i));
        } catch (Exception unused) {
            C5342he.class.getSimpleName();
        }
        return hashMap;
    }

    /* renamed from: a */
    public static int m12326a() {
        String c = m12331c();
        if (c.startsWith(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            return 0;
        }
        return c.startsWith("1") ? 1 : 2;
    }

    /* renamed from: b */
    public static String m12330b() {
        int a = m12326a();
        if (a != 0) {
            return a != 1 ? "NIL" : TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
        }
        return ServerParameters.CARRIER;
    }

    /* renamed from: b */
    public static int m12329b(Context context) {
        return ((AudioManager) context.getSystemService("audio")).getStreamVolume(3);
    }
}
