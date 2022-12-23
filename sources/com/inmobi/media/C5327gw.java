package com.inmobi.media;

import android.util.Log;

/* renamed from: com.inmobi.media.gw */
/* compiled from: Logger */
public final class C5327gw {

    /* renamed from: a */
    private static byte f12211a;

    /* renamed from: a */
    public static void m12263a(byte b, String str, String str2) {
        if (b == 1) {
            byte b2 = f12211a;
            if (2 == b2 || 1 == b2 || 3 == b2) {
                Log.e("[InMobi]", str2);
            }
        } else if (b == 2) {
            byte b3 = f12211a;
            if (2 == b3 || 3 == b3) {
                Log.d("[InMobi]", str2);
            }
        } else if (b == 3) {
            if (str2.length() > 4000) {
                while (str2.length() > 4000) {
                    Log.d(str, str2.substring(0, 4000));
                    str2 = str2.substring(4000);
                }
                Log.d(str, str2);
                return;
            }
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m12265a(String str, String str2) {
        m12263a((byte) 3, str, str2);
    }

    /* renamed from: a */
    public static void m12266a(String str, String str2, Throwable th) {
        m12264a((byte) 3, str, str2, th);
    }

    /* renamed from: a */
    public static void m12264a(byte b, String str, String str2, Throwable th) {
        if (b == 1) {
            byte b2 = f12211a;
            if (2 == b2 || 1 == b2 || 3 == b2) {
                Log.e("[InMobi]", str2, th);
            }
        } else if (b == 2) {
            byte b3 = f12211a;
            if (2 == b3 || 3 == b3) {
                Log.d("[InMobi]", str2, th);
            }
        } else if (b == 3) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m12262a(byte b) {
        f12211a = b;
    }
}
