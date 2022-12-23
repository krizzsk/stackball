package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C15177xl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class r00 {
    /* renamed from: b */
    public static final boolean m41461b(C15177xl xlVar) {
        return !m41462c(xlVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m41462c(C15177xl xlVar) {
        if ((xlVar instanceof C15177xl.C15192o) || (xlVar instanceof C15177xl.C15185h) || (xlVar instanceof C15177xl.C15183f) || (xlVar instanceof C15177xl.C15188k) || (xlVar instanceof C15177xl.C15186i) || (xlVar instanceof C15177xl.C15189l) || (xlVar instanceof C15177xl.C15181d)) {
            return false;
        }
        if ((xlVar instanceof C15177xl.C15180c) || (xlVar instanceof C15177xl.C15184g) || (xlVar instanceof C15177xl.C15182e) || (xlVar instanceof C15177xl.C15187j) || (xlVar instanceof C15177xl.C15191n) || (xlVar instanceof C15177xl.C15190m)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final q00 m41463d(C15177xl xlVar) {
        Intrinsics.checkNotNullParameter(xlVar, "<this>");
        Intrinsics.checkNotNullParameter(xlVar, "root");
        return new q00(xlVar, (Function1) null, (Function1) null, 0, 8);
    }
}
