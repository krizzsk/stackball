package com.ironsource.p133c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C5505a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.tapjoy.TapjoyConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.c.a */
public class C5499a {

    /* renamed from: a */
    private boolean f12658a = true;

    /* renamed from: b */
    private IronSourceError f12659b = null;

    /* renamed from: a */
    public static String m13042a(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? m13043a(m13045b(context), context) : m13048d(context);
    }

    /* renamed from: a */
    public static String m13043a(Network network, Context context) {
        String str;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return m13048d(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    str = TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                } else if (!networkCapabilities.hasTransport(0)) {
                    return m13048d(context);
                } else {
                    str = "3g";
                }
            } else {
                str = m13048d(context);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public static JSONObject m13044a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (!(connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null)) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", m13047c(context));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static Network m13045b(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m13046b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (!(Build.VERSION.SDK_INT < 23 || network == null || context == null)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "wifiAware";
                }
                if (networkCapabilities.hasTransport(6)) {
                    return "lowpan";
                }
                if (networkCapabilities.hasTransport(2)) {
                    return "bluetooth";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m13047c(Context context) {
        return m13046b(context, m13045b(context)).equals("vpn");
    }

    /* renamed from: d */
    private static String m13048d(Context context) {
        String a = C5505a.C55061.m13069a(context);
        return TextUtils.isEmpty(a) ? "none" : a;
    }

    /* renamed from: a */
    public void mo41202a(IronSourceError ironSourceError) {
        this.f12658a = false;
        this.f12659b = ironSourceError;
    }

    /* renamed from: a */
    public boolean mo41203a() {
        return this.f12658a;
    }

    /* renamed from: b */
    public IronSourceError mo41204b() {
        return this.f12659b;
    }

    public String toString() {
        StringBuilder sb;
        if (mo41203a()) {
            sb = new StringBuilder("valid:");
            sb.append(this.f12658a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.f12658a);
            sb.append(", IronSourceError:");
            sb.append(this.f12659b);
        }
        return sb.toString();
    }
}
