package com.fyber.inneractive.sdk.p029a;

/* renamed from: com.fyber.inneractive.sdk.a.e */
public final class C2704e<ResultData> {

    /* renamed from: a */
    public ResultData f6371a;

    /* renamed from: b */
    public String f6372b;

    /* renamed from: c */
    private Exception f6373c;

    public C2704e(ResultData resultdata, String str) {
        this.f6371a = resultdata;
        this.f6372b = str;
    }

    private C2704e(Exception exc) {
        this.f6373c = exc;
    }

    /* renamed from: a */
    public static <ResultData> C2704e<ResultData> m5876a(Exception exc) {
        return new C2704e<>(exc);
    }
}
