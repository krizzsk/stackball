package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tapjoy.TapjoyConstants;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class hz0 {

    /* renamed from: a */
    private static final Comparator<ScanResult> f34717a = new C13369a();

    /* renamed from: com.yandex.mobile.ads.impl.hz0$a */
    class C13369a implements Comparator<ScanResult> {
        C13369a() {
        }

        public int compare(Object obj, Object obj2) {
            return ((ScanResult) obj).level - ((ScanResult) obj2).level;
        }
    }

    /* renamed from: a */
    public static Point m37246a(Context context) {
        int i;
        int i2;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i = intValue;
            } catch (Exception unused) {
                int width = defaultDisplay.getWidth();
                i2 = defaultDisplay.getHeight();
                i = width;
            }
        }
        return new Point(i, i2);
    }

    /* renamed from: b */
    public static String m37247b(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
            if (!wifiManager.isWifiEnabled()) {
                return null;
            }
            List<ScanResult> scanResults = wifiManager.getScanResults();
            ScanResult[] scanResultArr = (ScanResult[]) C13378i5.m37282a((T[]) (ScanResult[]) scanResults.toArray(new ScanResult[scanResults.size()]));
            Arrays.sort(scanResultArr, Collections.reverseOrder(f34717a));
            if (scanResultArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                int min = Math.min(3, scanResultArr.length);
                int i = 0;
                while (i < min) {
                    sb.append(scanResultArr[i].BSSID);
                    sb.append(",");
                    sb.append(scanResultArr[i].level);
                    i++;
                    sb.append(i < min ? ";" : "");
                }
                return sb.toString();
            }
            return null;
        } catch (Exception unused) {
        }
    }
}
