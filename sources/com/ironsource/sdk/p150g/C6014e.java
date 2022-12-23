package com.ironsource.sdk.p150g;

/* renamed from: com.ironsource.sdk.g.e */
public final class C6014e {

    /* renamed from: a */
    public String f14776a;

    /* renamed from: b */
    public int f14777b;

    public C6014e(int i, String str) {
        this.f14777b = i;
        this.f14776a = str == null ? "" : str;
    }

    public final String toString() {
        return "error - code:" + this.f14777b + ", message:" + this.f14776a;
    }
}
