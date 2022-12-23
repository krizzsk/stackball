package com.yandex.mobile.ads.impl;

import androidx.collection.ArrayMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.fg */
public final class C13050fg {
    /* renamed from: a */
    public static final <K, V> Map<K, V> m36014a() {
        return new ArrayMap();
    }

    /* renamed from: a */
    public static final boolean m36015a(List<?>... listArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(listArr, FirebaseAnalytics.Param.ITEMS);
        int length = listArr.length;
        int i = 0;
        do {
            z = true;
            if (i >= length) {
                return true;
            }
            List<?> list = listArr[i];
            i++;
            if (list != null && !list.isEmpty()) {
                z = false;
                continue;
            }
        } while (z);
        return false;
    }
}
