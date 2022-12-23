package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14871v7;
import com.yandex.mobile.ads.impl.C15327zk;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.impl.u7 */
public final class C14744u7 implements C15327zk.C15328a {

    /* renamed from: a */
    final /* synthetic */ String f40580a;

    C14744u7(String str) {
        this.f40580a = str;
    }

    /* renamed from: a */
    public boolean mo70297a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return StringsKt.startsWith$default(name, Intrinsics.stringPlus(this.f40580a, "."), false, 2, (Object) null);
    }

    /* renamed from: b */
    public ta1 mo70298b(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        C14871v7.C14872a aVar = C14871v7.f41203f;
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!Intrinsics.areEqual((Object) cls2.getSimpleName(), (Object) "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(Intrinsics.stringPlus("No OpenSSLSocketImpl superclass of socket of type ", cls));
            }
        }
        Intrinsics.checkNotNull(cls2);
        return new C14871v7(cls2);
    }
}
