package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public class ea0 {

    /* renamed from: a */
    private final fa0 f32942a;

    public ea0(fa0 fa0) {
        Intrinsics.checkNotNullParameter(fa0, "histogramReporterDelegate");
        this.f32942a = fa0;
    }

    /* renamed from: a */
    public static void m35609a(ea0 ea0, String str, long j, String str2, String str3, ba0 ba0, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            ba0 = ba0.f31276a.mo66033b();
        }
        ea0.getClass();
        Intrinsics.checkNotNullParameter(str, "histogramName");
        Intrinsics.checkNotNullParameter(ba0, "filter");
        if (ba0.mo65497a((String) null)) {
            ea0.f32942a.mo66947a(str, j, str3);
        }
        if (str2 != null) {
            String str4 = str2 + '.' + str;
            if (ba0.mo65497a(str2)) {
                ea0.f32942a.mo66947a(str4, j, str3);
            }
        }
    }
}
