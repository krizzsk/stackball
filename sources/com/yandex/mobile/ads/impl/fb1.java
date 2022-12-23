package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lz0;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class fb1 extends C14871v7 {

    /* renamed from: h */
    public static final C13041a f33292h = new C13041a((DefaultConstructorMarker) null);

    /* renamed from: com.yandex.mobile.ads.impl.fb1$a */
    public static final class C13041a {
        private C13041a() {
        }

        public /* synthetic */ C13041a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static ta1 m35948a(C13041a aVar, String str, int i) {
            String str2 = (i & 1) != 0 ? "com.android.org.conscrypt" : null;
            Intrinsics.checkNotNullParameter(str2, "packageName");
            try {
                Class<?> cls = Class.forName(Intrinsics.stringPlus(str2, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(Intrinsics.stringPlus(str2, ".OpenSSLSocketFactoryImpl"));
                Class<?> cls3 = Class.forName(Intrinsics.stringPlus(str2, ".SSLParametersImpl"));
                Intrinsics.checkNotNullExpressionValue(cls3, "paramsClass");
                return new fb1(cls, cls2, cls3);
            } catch (Exception e) {
                lz0.C13944a aVar2 = lz0.f37135a;
                lz0.f37136b.mo68534a("unable to load android socket classes", 5, (Throwable) e);
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fb1(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        Intrinsics.checkNotNullParameter(cls, "sslSocketClass");
        Intrinsics.checkNotNullParameter(cls2, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(cls3, "paramClass");
    }
}
