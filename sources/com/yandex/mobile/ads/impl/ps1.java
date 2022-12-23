package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ps1 {

    /* renamed from: a */
    private final C15051wi f38817a;

    /* renamed from: b */
    private final Lazy f38818b = LazyKt.lazy(C14309a.f38822b);

    /* renamed from: c */
    private KeyStore f38819c;

    /* renamed from: d */
    private X509TrustManager f38820d;

    /* renamed from: e */
    private final Object f38821e = new Object();

    /* renamed from: com.yandex.mobile.ads.impl.ps1$a */
    static final class C14309a extends Lambda implements Function0<X509TrustManager> {

        /* renamed from: b */
        public static final C14309a f38822b = new C14309a();

        C14309a() {
            super(0);
        }

        public Object invoke() {
            X509TrustManager a = pf1.m40774a((KeyStore) null);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Failed to create default TrustManager");
        }
    }

    public ps1(C15051wi wiVar) {
        Intrinsics.checkNotNullParameter(wiVar, "customCertificatesProvider");
        this.f38817a = wiVar;
    }

    /* renamed from: b */
    private final void m40947b() {
        if (!Thread.holdsLock(this.f38821e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    /* renamed from: d */
    private final X509TrustManager m40948d() {
        return (X509TrustManager) this.f38818b.getValue();
    }

    /* renamed from: a */
    public final void mo69427a(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        m40948d().checkClientTrusted(x509CertificateArr, str);
    }

    /* renamed from: c */
    public final X509Certificate[] mo69433c() {
        X509Certificate[] acceptedIssuers = m40948d().getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "defaultTrustManager.acceptedIssuers");
        return acceptedIssuers;
    }

    /* renamed from: a */
    public final void mo69428a(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        if (pf1.m40775a()) {
            C12364a8.m33630a(m40948d(), x509CertificateArr, str, socket);
        } else {
            m40948d().checkClientTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: b */
    public final void mo69430b(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Unit unit;
        try {
            m40948d().checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            synchronized (this.f38821e) {
                m40946a();
                m40947b();
                X509TrustManager x509TrustManager = this.f38820d;
                if (x509TrustManager == null) {
                    unit = null;
                } else {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    Log.w("YandexTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69429a(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        if (pf1.m40775a()) {
            C12364a8.m33631a(m40948d(), x509CertificateArr, str, sSLEngine);
        } else {
            m40948d().checkClientTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private final void m40946a() {
        KeyStore keyStore;
        m40947b();
        m40947b();
        if (this.f38819c == null) {
            int i = pf1.f38605b;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load((KeyStore.LoadStoreParameter) null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("YandexTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                byte[][] a = this.f38817a.mo65721a();
                ArrayList arrayList = new ArrayList();
                for (byte[] a2 : a) {
                    X509Certificate a3 = pf1.m40773a(a2);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        keyStore.setCertificateEntry(Intrinsics.stringPlus("custom_cert_", Integer.valueOf(keyStore.size())), (X509Certificate) it.next());
                    } catch (KeyStoreException e) {
                        Log.w("YandexTrustManager", "Failed to store certificate", e);
                    }
                }
                keyStore2 = keyStore;
            }
            this.f38819c = keyStore2;
        }
        m40947b();
        if (this.f38820d == null) {
            m40947b();
            if (this.f38819c != null) {
                m40947b();
                this.f38820d = pf1.m40774a(this.f38819c);
            }
        }
    }

    /* renamed from: b */
    public final void mo69431b(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        Unit unit;
        try {
            X509TrustManager d = m40948d();
            if (pf1.m40775a()) {
                C12364a8.m33632b(d, x509CertificateArr, str, socket);
            } else {
                d.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            synchronized (this.f38821e) {
                m40946a();
                m40947b();
                X509TrustManager x509TrustManager = this.f38820d;
                if (x509TrustManager == null) {
                    unit = null;
                } else {
                    if (pf1.m40775a()) {
                        C12364a8.m33632b(x509TrustManager, x509CertificateArr, str, socket);
                    } else {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    Log.w("YandexTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo69432b(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        Unit unit;
        try {
            X509TrustManager d = m40948d();
            if (pf1.m40775a()) {
                C12364a8.m33633b(d, x509CertificateArr, str, sSLEngine);
            } else {
                d.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            synchronized (this.f38821e) {
                m40946a();
                m40947b();
                X509TrustManager x509TrustManager = this.f38820d;
                if (x509TrustManager == null) {
                    unit = null;
                } else {
                    if (pf1.m40775a()) {
                        C12364a8.m33633b(x509TrustManager, x509CertificateArr, str, sSLEngine);
                    } else {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    Log.w("YandexTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }
}
