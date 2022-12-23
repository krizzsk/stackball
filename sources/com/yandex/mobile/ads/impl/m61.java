package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class m61 extends RuntimeException {

    /* renamed from: b */
    private final IOException f37203b;

    /* renamed from: c */
    private IOException f37204c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m61(IOException iOException) {
        super(iOException);
        Intrinsics.checkNotNullParameter(iOException, "firstConnectException");
        this.f37203b = iOException;
        this.f37204c = iOException;
    }

    /* renamed from: a */
    public final IOException mo68581a() {
        return this.f37203b;
    }

    /* renamed from: b */
    public final IOException mo68583b() {
        return this.f37204c;
    }

    /* renamed from: a */
    public final void mo68582a(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "e");
        ExceptionsKt.addSuppressed(this.f37203b, iOException);
        this.f37204c = iOException;
    }
}
