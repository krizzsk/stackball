package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.aabab */
public class aabab extends aaacc {

    /* renamed from: a */
    private final int f20332a;

    /* renamed from: b */
    private final String f20333b;

    /* renamed from: c */
    private final aabba f20334c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aabab(int i, String str, aabba aabba) {
        super((bbabb) null);
        bbabc.m22051b(str, "iabString");
        bbabc.m22051b(aabba, "retrievalMethod");
        this.f20332a = i;
        this.f20333b = str;
        this.f20334c = aabba;
    }

    public /* synthetic */ aabab(int i, String str, aabba aabba, int i2, bbabb bbabb) {
        this(i, str, aabba.UNKNOWN);
    }

    /* renamed from: a */
    public final int mo52647a() {
        return this.f20332a;
    }

    /* renamed from: b */
    public String mo52648b() {
        return this.f20333b;
    }

    /* renamed from: c */
    public final aabba mo52649c() {
        return this.f20334c;
    }
}
