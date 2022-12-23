package com.chartboost.sdk.Networking;

import com.chartboost.sdk.Model.CBError;

/* renamed from: com.chartboost.sdk.Networking.e */
public class C1853e<T> {

    /* renamed from: a */
    public final T f4572a;

    /* renamed from: b */
    public final CBError f4573b;

    private C1853e(T t, CBError cBError) {
        this.f4572a = t;
        this.f4573b = cBError;
    }

    /* renamed from: a */
    public static <T> C1853e<T> m4181a(T t) {
        return new C1853e<>(t, (CBError) null);
    }

    /* renamed from: a */
    public static <T> C1853e<T> m4180a(CBError cBError) {
        return new C1853e<>((Object) null, cBError);
    }
}
