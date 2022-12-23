package com.yandex.mobile.ads.impl;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

final /* synthetic */ class tw0 implements nw0, FunctionAdapter {

    /* renamed from: a */
    final /* synthetic */ sw0 f40516a;

    tw0(sw0 sw0) {
        this.f40516a = sw0;
    }

    /* renamed from: a */
    public final void mo69083a() {
        this.f40516a.m42179b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nw0) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
    }

    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.f40516a, sw0.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
