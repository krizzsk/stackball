package com.tapjoy;

import android.content.Context;
import com.tapjoy.internal.C9083az;
import com.tapjoy.internal.C9336gv;
import com.tapjoy.internal.C9359he;
import com.tapjoy.internal.C9465jq;

public class TJPlacementManager {

    /* renamed from: a */
    private static final C9083az f22082a = C9083az.m24320a();

    /* renamed from: b */
    private static int f22083b = 0;

    /* renamed from: c */
    private static int f22084c = 0;

    /* renamed from: d */
    private static int f22085d = 3;

    /* renamed from: e */
    private static int f22086e = 3;

    public static TJPlacement createPlacement(Context context, String str, boolean z, TJPlacementListener tJPlacementListener) {
        TJCorePlacement a = m24217a(str, (String) null, (String) null, z, false);
        a.f22006j = z;
        a.f21999c.setPlacementType("sdk");
        a.setContext(context);
        return new TJPlacement(a, tJPlacementListener);
    }

    /* renamed from: a */
    public static TJPlacement m24218a(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f22082a) {
            tJPlacement = new TJPlacement(m24217a(str, str2, str3, false, false), tJPlacementListener);
        }
        return tJPlacement;
    }

    /* renamed from: b */
    public static TJPlacement m24219b(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f22082a) {
            tJPlacement = new TJPlacement(m24217a(str, str2, str3, false, true), tJPlacementListener);
        }
        return tJPlacement;
    }

    /* renamed from: a */
    static TJCorePlacement m24216a(String str) {
        TJCorePlacement tJCorePlacement;
        synchronized (f22082a) {
            tJCorePlacement = (TJCorePlacement) f22082a.get(str);
        }
        return tJCorePlacement;
    }

    public static void setCachedPlacementLimit(int i) {
        f22085d = i;
    }

    public static void setPreRenderedPlacementLimit(int i) {
        f22086e = i;
    }

    public static int getCachedPlacementLimit() {
        return f22085d;
    }

    public static int getPreRenderedPlacementLimit() {
        return f22086e;
    }

    public static int getCachedPlacementCount() {
        return f22083b;
    }

    public static int getPreRenderedPlacementCount() {
        return f22084c;
    }

    public static boolean canCachePlacement() {
        return getCachedPlacementCount() < getCachedPlacementLimit();
    }

    public static boolean canPreRenderPlacement() {
        return getPreRenderedPlacementCount() < getPreRenderedPlacementLimit();
    }

    public static void incrementPlacementCacheCount() {
        int i = f22083b + 1;
        f22083b = i;
        int i2 = f22085d;
        if (i > i2) {
            f22083b = i2;
        }
        printPlacementCacheInformation();
    }

    public static void decrementPlacementCacheCount() {
        int i = f22083b - 1;
        f22083b = i;
        if (i < 0) {
            f22083b = 0;
        }
        printPlacementCacheInformation();
    }

    public static void incrementPlacementPreRenderCount() {
        int i = f22084c + 1;
        f22084c = i;
        int i2 = f22086e;
        if (i > i2) {
            f22084c = i2;
        }
    }

    public static void decrementPlacementPreRenderCount() {
        int i = f22084c - 1;
        f22084c = i;
        if (i < 0) {
            f22084c = 0;
        }
    }

    public static void printPlacementCacheInformation() {
        TapjoyLog.m24276i("TJPlacementManager", "Space available in placement cache: " + f22083b + " out of " + f22085d);
    }

    public static void printPlacementPreRenderInformation() {
        TapjoyLog.m24276i("TJPlacementManager", "Space available for placement pre-render: " + f22084c + " out of " + f22086e);
    }

    public static void dismissContentShowing(boolean z) {
        if (z) {
            TJAdUnitActivity.m24162a();
        }
        C9359he.m25149a();
        C9336gv.m25034a();
    }

    /* renamed from: a */
    static TJCorePlacement m24217a(String str, String str2, String str3, boolean z, boolean z2) {
        TJCorePlacement a;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "!SYSTEM!" : "");
        sb.append(!C9465jq.m25449c(str) ? str : "");
        if (C9465jq.m25449c(str2)) {
            str2 = "";
        }
        sb.append(str2);
        if (C9465jq.m25449c(str3)) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(Boolean.toString(z2));
        String sb2 = sb.toString();
        TapjoyLog.m24273d("TJPlacementManager", "TJCorePlacement key=" + sb2);
        synchronized (f22082a) {
            a = m24216a(sb2);
            if (a == null) {
                a = new TJCorePlacement(str, sb2, z2);
                f22082a.put(sb2, a);
                TapjoyLog.m24273d("TJPlacementManager", "Created TJCorePlacement with GUID: " + a.f22000d);
            }
        }
        return a;
    }
}
