package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.aabac */
public final class aabac extends aabab {

    /* renamed from: a */
    private final String f20335a;

    /* renamed from: b */
    private final aabba f20336b;

    /* renamed from: c */
    private final Integer[] f20337c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aabac(String str, aabba aabba, Integer[] numArr) {
        super(2, str, aabba);
        bbabc.m22051b(str, "iabString");
        bbabc.m22051b(aabba, "method");
        bbabc.m22051b(numArr, "nonIabVendorIdsAccepted");
        this.f20335a = str;
        this.f20336b = aabba;
        this.f20337c = numArr;
    }

    public /* synthetic */ aabac(String str, aabba aabba, Integer[] numArr, int i, bbabb bbabb) {
        this(str, aabba.UNKNOWN, numArr);
    }

    /* renamed from: b */
    public final String mo52648b() {
        return this.f20335a;
    }

    /* renamed from: d */
    public final Integer[] mo52650d() {
        return this.f20337c;
    }
}
