package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.impl.cd1;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;

public final class zc1 {
    /* renamed from: a */
    public static final void m44530a(xc1 xc1, bd1 bd1, String str) {
        cd1.C12727b bVar = cd1.f31894h;
        Logger a = cd1.f31896j;
        StringBuilder sb = new StringBuilder();
        sb.append(bd1.mo66053f());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(xc1.mo70879b());
        a.fine(sb.toString());
    }

    /* renamed from: a */
    public static final String m44529a(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) DurationKt.NANOS_IN_MILLIS)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) DurationKt.NANOS_IN_MILLIS)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
