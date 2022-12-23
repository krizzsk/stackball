package com.flurry.sdk;

/* renamed from: com.flurry.sdk.g */
public final class C2649g {

    /* renamed from: a */
    public static final C2649g f6211a = new C2649g(C2650a.SUCCEED, (String) null);

    /* renamed from: b */
    public static final C2649g f6212b = new C2649g(C2650a.NO_CHANGE, (String) null);

    /* renamed from: c */
    String f6213c;

    /* renamed from: d */
    C2650a f6214d;

    public C2649g(C2650a aVar, String str) {
        this.f6214d = aVar;
        this.f6213c = str;
    }

    /* renamed from: com.flurry.sdk.g$a */
    public enum C2650a {
        SUCCEED(1),
        NO_CHANGE(0),
        IO(-1),
        NOT_VALID_JSON(-2),
        AUTHENTICATE(-3),
        UNKNOWN_CERTIFICATE(-4),
        OTHER(-5);
        

        /* renamed from: h */
        int f6223h;

        private C2650a(int i) {
            this.f6223h = i;
        }
    }

    public final String toString() {
        return "[Error:" + this.f6214d.name() + "] " + this.f6213c;
    }
}
