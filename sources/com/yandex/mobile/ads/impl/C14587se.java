package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lz0;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.se */
public abstract class C14587se {

    /* renamed from: a */
    public static final C14588a f39939a = new C14588a((DefaultConstructorMarker) null);

    /* renamed from: com.yandex.mobile.ads.impl.se$a */
    public static final class C14588a {
        private C14588a() {
        }

        public /* synthetic */ C14588a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14587se mo69958a(X509TrustManager x509TrustManager) {
            Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
            lz0.C13944a aVar = lz0.f37135a;
            return lz0.f37136b.mo68532a(x509TrustManager);
        }
    }

    /* renamed from: a */
    public abstract List<Certificate> mo69500a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
