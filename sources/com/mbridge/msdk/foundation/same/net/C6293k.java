package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p177f.C6272c;

/* renamed from: com.mbridge.msdk.foundation.same.net.k */
/* compiled from: Response */
public final class C6293k<T> {

    /* renamed from: a */
    public T f15627a = null;

    /* renamed from: b */
    public C6240a f15628b = null;

    /* renamed from: c */
    public C6272c f15629c = null;

    /* renamed from: a */
    public static <T> C6293k<T> m15930a(T t, C6272c cVar) {
        return new C6293k<>(t, cVar);
    }

    /* renamed from: a */
    public static <T> C6293k<T> m15929a(C6240a aVar) {
        return new C6293k<>(aVar);
    }

    private C6293k(T t, C6272c cVar) {
        this.f15627a = t;
        this.f15629c = cVar;
    }

    private C6293k(C6240a aVar) {
        this.f15628b = aVar;
    }
}
