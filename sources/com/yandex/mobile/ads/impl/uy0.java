package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.C12124s;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.ug1;
import kotlin.jvm.internal.Intrinsics;

public final class uy0 implements ug1 {

    /* renamed from: a */
    private final MediationData f41155a;

    /* renamed from: b */
    private final h30 f41156b = new h30();

    public uy0(MediationData mediationData) {
        Intrinsics.checkNotNullParameter(mediationData, "mMediationData");
        this.f41155a = mediationData;
    }

    /* renamed from: a */
    public ug1.C14757a mo67197a() {
        return ug1.C14757a.PASSBACK;
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
        String a = C12124s.m31479a(context, t1Var, y71).mo64635a(this.f41155a.mo64547d()).mo64636a();
        Intrinsics.checkNotNullExpressionValue(a, "configureFetchUrlBuilder(context, adConfiguration, sensitiveModeChecker)\n            .withAdditionalParameters(mMediationData.passbackParameters)\n            .build()");
        return this.f41156b.mo67395a(context, a);
    }
}
