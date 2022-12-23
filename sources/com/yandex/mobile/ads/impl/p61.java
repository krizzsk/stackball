package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

public final class p61 {
    /* renamed from: a */
    public final SSLSocketFactory mo69319a(Context context) {
        Boolean bool;
        X509TrustManager x509TrustManager;
        Intrinsics.checkNotNullParameter(context, "context");
        d71 a = l71.m38631c().mo68362a(context);
        if (a == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(a.mo66478z());
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            C12374ad adVar = new C12374ad(context);
            Intrinsics.checkNotNullParameter(adVar, "customCertificatesProvider");
            if (Build.VERSION.SDK_INT >= 24) {
                x509TrustManager = C12364a8.m33629a(adVar);
            } else {
                x509TrustManager = new qs1(adVar);
            }
            Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
            SSLSocketFactory socketFactory = new o61(x509TrustManager).mo69124a().getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "SSLContextBuilder(trustM…er).build().socketFactory");
            return socketFactory;
        } else if (C13378i5.m37280a(21)) {
            return y01.m44159a();
        } else {
            return null;
        }
    }
}
