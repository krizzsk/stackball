package com.yandex.metrica.impl.p265ob;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.metrica.impl.ob.Rm */
public final class C10732Rm {
    /* renamed from: a */
    public final String mo62208a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
        String replace$default = StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        if (replace$default != null) {
            String lowerCase = replace$default.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
