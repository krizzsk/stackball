package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;

/* renamed from: com.yandex.mobile.ads.impl.j5 */
public final class C13474j5 {
    /* renamed from: a */
    public static boolean m37668a(Context context, SizeInfo sizeInfo, SizeInfo sizeInfo2) {
        return m37670b(context, sizeInfo, sizeInfo2) && m37667a(context, sizeInfo, lo1.m38873d(context), lo1.m38869b(context));
    }

    /* renamed from: b */
    public static boolean m37670b(Context context, SizeInfo sizeInfo, SizeInfo sizeInfo2) {
        int c = sizeInfo2.mo64491c(context);
        int a = sizeInfo2.mo64488a(context);
        int c2 = sizeInfo.mo64491c(context);
        int a2 = sizeInfo.mo64488a(context);
        int ordinal = sizeInfo2.mo64493d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return false;
                    }
                }
            }
            if (c2 > c || c <= 0) {
                return false;
            }
            return a2 <= a || a == 0;
        } else if (c2 > c || c <= 0 || a2 > a) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m37666a(Context context, SizeInfo sizeInfo) {
        return m37667a(context, sizeInfo, lo1.m38869b(context), lo1.m38873d(context));
    }

    /* renamed from: a */
    private static boolean m37667a(Context context, SizeInfo sizeInfo, int i, int i2) {
        if (sizeInfo == null) {
            return false;
        }
        int c = sizeInfo.mo64491c(context);
        int a = sizeInfo.mo64488a(context);
        if (c > i || a > i2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m37669b(Context context, SizeInfo sizeInfo) {
        return m37667a(context, sizeInfo, lo1.m38873d(context), lo1.m38869b(context));
    }
}
