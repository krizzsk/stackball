package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.m0 */
class C0755m0 {

    /* renamed from: a */
    private static int f1194a = 0;

    /* renamed from: b */
    private static HashMap<String, Integer> f1195b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, Integer> f1196c = new HashMap<>();

    /* renamed from: d */
    static final int f1197d = 5;

    /* renamed from: e */
    static final int f1198e = 1;

    /* renamed from: f */
    static final int f1199f = 3;

    /* renamed from: g */
    static final int f1200g = 0;

    /* renamed from: h */
    static final int f1201h = 1;

    C0755m0() {
    }

    /* renamed from: a */
    static boolean m623a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i != 0) {
            if (i != 1 || bundle == null) {
                return false;
            }
            String string = bundle.getString("zone_id");
            if (f1195b.get(string) == null) {
                f1195b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f1196c.get(string) == null) {
                f1196c.put(string, 0);
            }
            if (currentTimeMillis - f1195b.get(string).intValue() > 1) {
                f1196c.put(string, 1);
                f1195b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f1196c.get(string).intValue() + 1;
            f1196c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else if (currentTimeMillis - f1194a < 5) {
            return true;
        } else {
            f1194a = currentTimeMillis;
            return false;
        }
    }
}
