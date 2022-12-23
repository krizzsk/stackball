package com.yandex.mobile.ads.impl;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

final /* synthetic */ class bj1 implements xi1, FunctionAdapter {

    /* renamed from: a */
    final /* synthetic */ cj1 f31343a;

    bj1(cj1 cj1) {
        this.f31343a = cj1;
    }

    /* renamed from: a */
    public final void mo66079a(wi1 wi1) {
        Intrinsics.checkNotNullParameter(wi1, "p0");
        cj1.m34731a(this.f31343a, wi1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xi1) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.f31343a, cj1.class, "trackVerificationNotExecuted", "trackVerificationNotExecuted(Lcom/yandex/mobile/ads/verification/error/VerificationNotExecutedException;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
