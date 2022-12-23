package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.yandex.metrica.C10078e;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.b2 */
public final class C11060b2 {

    /* renamed from: a */
    private static final C10898Wn f26549a = new C10898Wn();

    /* renamed from: b */
    private static final C10264Fm<Integer, C11064d> f26550b;

    /* renamed from: c */
    private static final C10264Fm<Integer, C11064d> f26551c;

    /* renamed from: d */
    private static final C10264Fm<C11064d, Integer> f26552d = new C11063c(2);

    /* renamed from: com.yandex.metrica.impl.ob.b2$a */
    class C11061a extends C10264Fm<Integer, C11064d> {
        C11061a(C11064d dVar) {
            super(dVar);
            mo61336a(1, C11064d.WIFI);
            mo61336a(0, C11064d.CELL);
            mo61336a(7, C11064d.BLUETOOTH);
            mo61336a(9, C11064d.ETHERNET);
            mo61336a(4, C11064d.MOBILE_DUN);
            mo61336a(5, C11064d.MOBILE_HIPRI);
            mo61336a(2, C11064d.MOBILE_MMS);
            mo61336a(3, C11064d.MOBILE_SUPL);
            mo61336a(6, C11064d.WIMAX);
            if (C10796U2.m27890a(21)) {
                mo61336a(17, C11064d.VPN);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$b */
    class C11062b extends C10264Fm<Integer, C11064d> {
        C11062b(C11064d dVar) {
            super(dVar);
            mo61336a(1, C11064d.WIFI);
            mo61336a(0, C11064d.CELL);
            mo61336a(3, C11064d.ETHERNET);
            mo61336a(2, C11064d.BLUETOOTH);
            mo61336a(4, C11064d.VPN);
            if (C10796U2.m27890a(27)) {
                mo61336a(6, C11064d.LOWPAN);
            }
            if (C10796U2.m27890a(26)) {
                mo61336a(5, C11064d.WIFI_AWARE);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$c */
    class C11063c extends C10264Fm<C11064d, Integer> {
        C11063c(Integer num) {
            super(num);
            mo61336a(C11064d.CELL, 0);
            mo61336a(C11064d.WIFI, 1);
            mo61336a(C11064d.BLUETOOTH, 3);
            mo61336a(C11064d.ETHERNET, 4);
            mo61336a(C11064d.MOBILE_DUN, 5);
            mo61336a(C11064d.MOBILE_HIPRI, 6);
            mo61336a(C11064d.MOBILE_MMS, 7);
            mo61336a(C11064d.MOBILE_SUPL, 8);
            mo61336a(C11064d.VPN, 9);
            mo61336a(C11064d.WIMAX, 10);
            mo61336a(C11064d.LOWPAN, 11);
            mo61336a(C11064d.WIFI_AWARE, 12);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$d */
    public enum C11064d {
        WIFI,
        CELL,
        ETHERNET,
        BLUETOOTH,
        VPN,
        LOWPAN,
        WIFI_AWARE,
        MOBILE_DUN,
        MOBILE_HIPRI,
        MOBILE_MMS,
        MOBILE_SUPL,
        WIMAX,
        OFFLINE,
        UNDEFINED
    }

    static {
        C11064d dVar = C11064d.UNDEFINED;
        f26550b = new C11061a(dVar);
        f26551c = new C11062b(dVar);
    }

    /* renamed from: a */
    public static C10078e m28556a(Context context, Point point) {
        float f;
        try {
            f = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f = 0.0f;
        }
        if (f == 0.0f) {
            return C10078e.PHONE;
        }
        float f2 = (float) point.x;
        float f3 = (float) point.y;
        float min = Math.min(f2 / f, f3 / f);
        float f4 = f * 160.0f;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        double sqrt = Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        if (sqrt >= 15.0d && !f26549a.mo62461a(context, "android.hardware.touchscreen")) {
            return C10078e.TV;
        }
        if (sqrt >= 7.0d || min >= 600.0f) {
            return C10078e.TABLET;
        }
        return C10078e.PHONE;
    }

    /* renamed from: b */
    static C11064d m28562b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return C11064d.OFFLINE;
        }
        return f26550b.mo61334a(Integer.valueOf(activeNetworkInfo.getType()));
    }

    /* renamed from: b */
    public static int m28561b(Context context) {
        return f26552d.mo61334a(m28557a(context)).intValue();
    }

    /* renamed from: a */
    public static String m28559a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (C10796U2.m27890a(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb.append('-');
                sb.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.metrica.impl.p265ob.C11060b2.C11064d m28557a(android.content.Context r2) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            com.yandex.metrica.impl.ob.b2$d r0 = com.yandex.metrica.impl.p265ob.C11060b2.C11064d.UNDEFINED
            if (r2 == 0) goto L_0x001e
            r1 = 23
            boolean r1 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r1)     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0019
            com.yandex.metrica.impl.ob.b2$d r2 = m28558a((android.net.ConnectivityManager) r2)     // Catch:{ all -> 0x001e }
            goto L_0x001f
        L_0x0019:
            com.yandex.metrica.impl.ob.b2$d r2 = m28562b((android.net.ConnectivityManager) r2)     // Catch:{ all -> 0x001e }
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            if (r2 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11060b2.m28557a(android.content.Context):com.yandex.metrica.impl.ob.b2$d");
    }

    /* renamed from: a */
    static C11064d m28558a(ConnectivityManager connectivityManager) {
        C11064d dVar = C11064d.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (m28560a(connectivityManager, activeNetwork)) {
            return C11064d.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return dVar;
        }
        for (Integer next : f26551c.mo61335a()) {
            if (networkCapabilities.hasTransport(next.intValue())) {
                return f26551c.mo61334a(next);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static boolean m28560a(ConnectivityManager connectivityManager, Network network) {
        if (C10796U2.m27890a(29)) {
            return network == null;
        }
        if (network == null) {
            return true;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
        if (networkInfo == null || networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
