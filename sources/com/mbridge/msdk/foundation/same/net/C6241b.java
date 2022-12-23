package com.mbridge.msdk.foundation.same.net;

/* renamed from: com.mbridge.msdk.foundation.same.net.b */
/* compiled from: DefaultRetryPolicy */
public final class C6241b implements C6294l {

    /* renamed from: a */
    private int f15492a;

    /* renamed from: b */
    private final int f15493b;

    public C6241b() {
        this(30000, 0);
    }

    public C6241b(int i, int i2) {
        this.f15492a = i <= 0 ? 30000 : i;
        this.f15493b = i2;
    }

    /* renamed from: a */
    public final int mo43816a() {
        return this.f15492a;
    }
}
