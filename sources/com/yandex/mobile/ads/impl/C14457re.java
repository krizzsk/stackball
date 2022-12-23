package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.ke1;

/* renamed from: com.yandex.mobile.ads.impl.re */
public final class C14457re {
    /* renamed from: a */
    public static void m41571a(long j, fy0 fy0, ke1[] ke1Arr) {
        int i;
        while (true) {
            boolean z = true;
            if (fy0.mo67098a() > 1) {
                int i2 = 0;
                while (true) {
                    if (fy0.mo67098a() != 0) {
                        int r = fy0.mo67126r();
                        i2 += r;
                        if (r != 255) {
                            i = i2;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (fy0.mo67098a() != 0) {
                        int r2 = fy0.mo67126r();
                        i3 += r2;
                        if (r2 != 255) {
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                int b = fy0.mo67105b() + i3;
                if (i3 == -1 || i3 > fy0.mo67098a()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    b = fy0.mo67107c();
                } else if (i == 4 && i3 >= 8) {
                    int r3 = fy0.mo67126r();
                    int x = fy0.mo67132x();
                    int f = x == 49 ? fy0.mo67113f() : 0;
                    int r4 = fy0.mo67126r();
                    if (x == 47) {
                        fy0.mo67114f(1);
                    }
                    boolean z2 = r3 == 181 && (x == 49 || x == 47) && r4 == 3;
                    if (x == 49) {
                        if (f != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m41572b(j, fy0, ke1Arr);
                    }
                }
                fy0.mo67112e(b);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m41572b(long j, fy0 fy0, ke1[] ke1Arr) {
        int r = fy0.mo67126r();
        if ((r & 64) != 0) {
            fy0.mo67114f(1);
            int i = (r & 31) * 3;
            int b = fy0.mo67105b();
            for (ke1 ke1 : ke1Arr) {
                fy0.mo67112e(b);
                ke1.mo65341a(fy0, i);
                ke1.mo65337a(j, 1, i, 0, (ke1.C13702a) null);
            }
        }
    }
}
