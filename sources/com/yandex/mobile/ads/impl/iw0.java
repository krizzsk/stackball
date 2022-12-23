package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import com.yandex.mobile.ads.impl.hw0;
import java.io.IOException;
import java.net.URL;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class iw0 {

    /* renamed from: a */
    public static final iw0 f35056a = new iw0();

    /* renamed from: b */
    private static final ConcurrentHashMap<jw0, hw0> f35057b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final nf1 f35058c = new nf1();

    private iw0() {
    }

    /* renamed from: a */
    public final hw0 mo67898a(l41<?> l41, wg1 wg1, SSLSocketFactory sSLSocketFactory) {
        Intrinsics.checkNotNullParameter(l41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        Intrinsics.checkNotNullParameter(l41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        String l = l41.mo67768l();
        if (wg1 != null) {
            String a = wg1.mo65926a(l);
            if (a != null) {
                l = a;
            } else {
                throw new IOException(Intrinsics.stringPlus("URL blocked by rewriter: ", l));
            }
        }
        URL url = new URL(l);
        f35058c.getClass();
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        SSLSocketFactory sSLSocketFactory2 = null;
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        Intrinsics.checkNotNullExpressionValue(trustManagers, "trustManagers");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList.add(trustManager);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) CollectionsKt.firstOrNull(arrayList);
        if ((!Intrinsics.areEqual((Object) "https", (Object) url.getProtocol()) || sSLSocketFactory == null || x509TrustManager == null) ? false : true) {
            sSLSocketFactory2 = sSLSocketFactory;
        }
        jw0 jw0 = new jw0((long) l41.mo68347j(), sSLSocketFactory2);
        ConcurrentHashMap<jw0, hw0> concurrentHashMap = f35057b;
        if (!concurrentHashMap.containsKey(jw0)) {
            long j = (long) l41.mo68347j();
            hw0.C13355a aVar = new hw0.C13355a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            hw0.C13355a a2 = aVar.mo67672b(j, timeUnit).mo67668a(j, timeUnit).mo67670a(true);
            if (!(!Intrinsics.areEqual((Object) "https", (Object) url.getProtocol()) || sSLSocketFactory == null || x509TrustManager == null)) {
                z = true;
            }
            if (z) {
                if (sSLSocketFactory == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (x509TrustManager != null) {
                    a2 = a2.mo67669a(sSLSocketFactory, x509TrustManager);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            concurrentHashMap.put(jw0, new hw0(a2));
        }
        hw0 hw0 = concurrentHashMap.get(jw0);
        if (hw0 != null) {
            return hw0;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
