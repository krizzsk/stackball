package com.yandex.metrica.impl.p265ob;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Z1 */
public class C10976Z1 {

    /* renamed from: a */
    private final int f26377a;

    /* renamed from: b */
    private final int f26378b;

    /* renamed from: c */
    private final int f26379c;

    public C10976Z1(int i, int i2, int i3) {
        this.f26377a = i;
        this.f26378b = i2;
        this.f26379c = i3;
    }

    /* renamed from: a */
    public final int mo62559a(Boolean bool) {
        if (bool == null) {
            return this.f26377a;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            return this.f26378b;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            return this.f26379c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final Boolean mo62560a(int i) {
        if (i == this.f26378b) {
            return Boolean.FALSE;
        }
        if (i == this.f26379c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
