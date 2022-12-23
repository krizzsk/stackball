package com.yandex.metrica.impl.p265ob;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.tm */
public final class C11797tm {

    /* renamed from: a */
    private static final BigInteger f28342a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b */
    private static final BigInteger f28343b = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: a */
    public static final Pair m30468a(BigDecimal bigDecimal) {
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        Intrinsics.checkNotNullExpressionValue(unscaledValue, "value.unscaledValue()");
        while (true) {
            if (unscaledValue.compareTo(f28342a) <= 0 && unscaledValue.compareTo(f28343b) >= 0) {
                return TuplesKt.m45515to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            Intrinsics.checkNotNullExpressionValue(unscaledValue, "bigIntMantissa.divide(BigInteger.TEN)");
            i++;
        }
    }
}
