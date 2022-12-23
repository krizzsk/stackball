package com.yandex.metrica.impl.p265ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.M9 */
public final class C10500M9 extends C10453L9<C11152dg> {
    /* renamed from: a */
    public Object mo61390a() {
        return new C11152dg();
    }

    /* renamed from: a */
    public Object mo61391a(byte[] bArr) {
        C11152dg dgVar = (C11152dg) C11169e.m28803a(new C11152dg(), bArr);
        Intrinsics.checkNotNullExpressionValue(dgVar, "ClidsInfoProto.ClidsInfo.parseFrom(data)");
        return dgVar;
    }
}
