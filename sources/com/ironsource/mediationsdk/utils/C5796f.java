package com.ironsource.mediationsdk.utils;

import java.util.Date;

/* renamed from: com.ironsource.mediationsdk.utils.f */
public final class C5796f {

    /* renamed from: a */
    private long f13949a = new Date().getTime();

    /* renamed from: a */
    public static long m14320a(C5796f fVar) {
        if (fVar == null) {
            return 0;
        }
        return new Date().getTime() - fVar.f13949a;
    }
}
