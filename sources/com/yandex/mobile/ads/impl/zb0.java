package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.config.VersionInfo;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

public final class zb0 {
    @JvmStatic
    /* renamed from: a */
    public static final boolean m44524a(String str) {
        Intrinsics.checkNotNullParameter(str, "method");
        return !Intrinsics.areEqual((Object) str, (Object) "GET") && !Intrinsics.areEqual((Object) str, (Object) VersionInfo.GIT_BRANCH);
    }
}
