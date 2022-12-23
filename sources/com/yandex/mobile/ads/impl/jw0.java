package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

public final class jw0 {

    /* renamed from: a */
    private final long f35656a;

    /* renamed from: b */
    private final SSLSocketFactory f35657b;

    public jw0(long j, SSLSocketFactory sSLSocketFactory) {
        this.f35656a = j;
        this.f35657b = sSLSocketFactory;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw0)) {
            return false;
        }
        jw0 jw0 = (jw0) obj;
        return this.f35656a == jw0.f35656a && Intrinsics.areEqual((Object) this.f35657b, (Object) jw0.f35657b);
    }

    public int hashCode() {
        int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f35656a) * 31;
        SSLSocketFactory sSLSocketFactory = this.f35657b;
        return hashCode + (sSLSocketFactory == null ? 0 : sSLSocketFactory.hashCode());
    }

    public String toString() {
        return "OkHttpConfiguration(timeout=" + this.f35656a + ", sslSocketFactory=" + this.f35657b + ')';
    }
}
