package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.C12124s;
import com.yandex.mobile.ads.impl.ug1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.g5 */
public final class C13175g5 implements ug1 {

    /* renamed from: a */
    private final h30 f33886a = new h30();

    /* renamed from: a */
    public ug1.C14757a mo67197a() {
        return ug1.C14757a.AD;
    }

    /* renamed from: a */
    public String mo67199a(C14645t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "adConfiguration");
        return C12124s.m31481a(t1Var);
    }

    /* renamed from: a */
    public String mo67198a(Context context, C14645t1 t1Var, y71 y71) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(t1Var, "adConfiguration");
        Intrinsics.checkNotNullParameter(y71, "sensitiveModeChecker");
        String a = C12124s.m31479a(context, t1Var, y71).mo64636a();
        Intrinsics.checkNotNullExpressionValue(a, "configureFetchUrlBuilder(context, adConfiguration, sensitiveModeChecker).build()");
        return this.f33886a.mo67395a(context, a);
    }
}
