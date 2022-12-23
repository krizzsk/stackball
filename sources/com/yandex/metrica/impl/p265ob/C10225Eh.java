package com.yandex.metrica.impl.p265ob;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Eh */
public class C10225Eh {

    /* renamed from: a */
    public final List<C10341Hh> f24588a;

    /* renamed from: b */
    public final String f24589b;

    /* renamed from: c */
    public final long f24590c;

    /* renamed from: d */
    public final boolean f24591d;

    /* renamed from: e */
    public final boolean f24592e;

    public C10225Eh(List<C10341Hh> list, String str, long j, boolean z, boolean z2) {
        this.f24588a = Collections.unmodifiableList(list);
        this.f24589b = str;
        this.f24590c = j;
        this.f24591d = z;
        this.f24592e = z2;
    }

    public String toString() {
        return "SdkFingerprintingState{sdkItemList=" + this.f24588a + ", etag='" + this.f24589b + '\'' + ", lastAttemptTime=" + this.f24590c + ", hasFirstCollectionOccurred=" + this.f24591d + ", shouldRetry=" + this.f24592e + '}';
    }
}
