package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i50;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class h50 {
    /* renamed from: a */
    public static final List m36803a(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            if (m36804a(str, i)) {
                int i3 = i + 2;
                int i4 = i3;
                while (true) {
                    if (i4 < str.length()) {
                        if (str.charAt(i4) == '}') {
                            break;
                        } else if (m36804a(str, i4)) {
                            i4 = -2;
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -2) {
                    if (i4 == -1) {
                        String substring = str.substring(i2, str.length());
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        arrayList.add(new i50.C13379a(substring));
                        break;
                    }
                    String substring2 = str.substring(i3, i4);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (i2 < i) {
                        String substring3 = str.substring(i2, i);
                        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                        arrayList.add(new i50.C13379a(substring3));
                    }
                    arrayList.add(new i50.C13380b(substring2));
                    i2 = i4 + 1;
                    i = i2;
                }
            }
            i++;
        }
        if (i2 < i) {
            if (i2 == 0) {
                arrayList.add(new i50.C13379a(str));
            } else {
                String substring4 = str.substring(i2, str.length());
                Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(new i50.C13379a(substring4));
            }
        } else if (arrayList.isEmpty()) {
            arrayList.add(new i50.C13379a(""));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final boolean m36804a(String str, int i) {
        if (str.charAt(i) == '@' && i < StringsKt.getLastIndex(str) && str.charAt(i + 1) == '{') {
            return true;
        }
        return false;
    }
}
