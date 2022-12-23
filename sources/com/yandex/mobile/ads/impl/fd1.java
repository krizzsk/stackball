package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ny0;
import kotlin.jvm.internal.Intrinsics;

public final class fd1 implements ny0 {

    /* renamed from: c */
    private final ny0 f33334c;

    /* renamed from: d */
    private final String f33335d;

    public fd1(ny0 ny0, String str) {
        Intrinsics.checkNotNullParameter(ny0, "logger");
        Intrinsics.checkNotNullParameter(str, "templateId");
        this.f33334c = ny0;
        this.f33335d = str;
    }

    /* renamed from: a */
    public /* synthetic */ void mo65564a(Exception exc, String str) {
        ny0.CC.$default$a(this, exc, str);
    }

    /* renamed from: c */
    public void mo65565c(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
        this.f33334c.mo65564a(exc, this.f33335d);
    }
}
