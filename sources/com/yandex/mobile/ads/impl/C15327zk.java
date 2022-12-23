package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.zk */
public final class C15327zk implements ta1 {

    /* renamed from: a */
    private final C15328a f43220a;

    /* renamed from: b */
    private ta1 f43221b;

    /* renamed from: com.yandex.mobile.ads.impl.zk$a */
    public interface C15328a {
        /* renamed from: a */
        boolean mo70297a(SSLSocket sSLSocket);

        /* renamed from: b */
        ta1 mo70298b(SSLSocket sSLSocket);
    }

    public C15327zk(C15328a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "socketAdapterFactory");
        this.f43220a = aVar;
    }

    /* renamed from: a */
    public boolean mo69321a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo69322a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return this.f43220a.mo70297a(sSLSocket);
    }

    /* renamed from: b */
    public String mo69323b(SSLSocket sSLSocket) {
        ta1 ta1;
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        synchronized (this) {
            if (this.f43221b == null && this.f43220a.mo70297a(sSLSocket)) {
                this.f43221b = this.f43220a.mo70298b(sSLSocket);
            }
            ta1 = this.f43221b;
        }
        if (ta1 == null) {
            return null;
        }
        return ta1.mo69323b(sSLSocket);
    }

    /* renamed from: a */
    public void mo69320a(SSLSocket sSLSocket, String str, List<? extends w11> list) {
        ta1 ta1;
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        synchronized (this) {
            if (this.f43221b == null && this.f43220a.mo70297a(sSLSocket)) {
                this.f43221b = this.f43220a.mo70298b(sSLSocket);
            }
            ta1 = this.f43221b;
        }
        if (ta1 != null) {
            ta1.mo69320a(sSLSocket, str, list);
        }
    }
}
