package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m90 {

    /* renamed from: e */
    public static final C13962a f37265e = new C13962a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final fe1 f37266a;

    /* renamed from: b */
    private final C15164xe f37267b;

    /* renamed from: c */
    private final List<Certificate> f37268c;

    /* renamed from: d */
    private final Lazy f37269d;

    /* renamed from: com.yandex.mobile.ads.impl.m90$a */
    public static final class C13962a {

        /* renamed from: com.yandex.mobile.ads.impl.m90$a$a */
        static final class C13963a extends Lambda implements Function0<List<? extends Certificate>> {

            /* renamed from: b */
            final /* synthetic */ List<Certificate> f37270b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13963a(List<? extends Certificate> list) {
                super(0);
                this.f37270b = list;
            }

            public Object invoke() {
                return this.f37270b;
            }
        }

        private C13962a() {
        }

        public /* synthetic */ C13962a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final m90 mo68630a(SSLSession sSLSession) throws IOException {
            fe1 fe1;
            List list;
            List list2;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!(Intrinsics.areEqual((Object) cipherSuite, (Object) "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual((Object) cipherSuite, (Object) "SSL_NULL_WITH_NULL_NULL"))) {
                    C15164xe a = C15164xe.f42524b.mo70893a(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null".toString());
                    } else if (!Intrinsics.areEqual((Object) "NONE", (Object) protocol)) {
                        Intrinsics.checkNotNullParameter(protocol, "javaName");
                        int hashCode = protocol.hashCode();
                        if (hashCode == 79201641) {
                            if (protocol.equals("SSLv3")) {
                                fe1 = fe1.SSL_3_0;
                            }
                            throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", protocol));
                        } else if (hashCode != 79923350) {
                            switch (hashCode) {
                                case -503070503:
                                    if (protocol.equals("TLSv1.1")) {
                                        fe1 = fe1.TLS_1_1;
                                        break;
                                    }
                                    break;
                                case -503070502:
                                    if (protocol.equals("TLSv1.2")) {
                                        fe1 = fe1.TLS_1_2;
                                        break;
                                    }
                                    break;
                                case -503070501:
                                    if (protocol.equals("TLSv1.3")) {
                                        fe1 = fe1.TLS_1_3;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            if (protocol.equals("TLSv1")) {
                                fe1 = fe1.TLS_1_0;
                            }
                            throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", protocol));
                        }
                        try {
                            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                            if (peerCertificates != null) {
                                list = jh1.m37823a((T[]) Arrays.copyOf(peerCertificates, peerCertificates.length));
                            } else {
                                list = CollectionsKt.emptyList();
                            }
                        } catch (SSLPeerUnverifiedException unused) {
                            list = CollectionsKt.emptyList();
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            list2 = jh1.m37823a((T[]) Arrays.copyOf(localCertificates, localCertificates.length));
                        } else {
                            list2 = CollectionsKt.emptyList();
                        }
                        return new m90(fe1, a, list2, new C13963a(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException(Intrinsics.stringPlus("cipherSuite == ", cipherSuite));
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.m90$b */
    static final class C13964b extends Lambda implements Function0<List<? extends Certificate>> {

        /* renamed from: b */
        final /* synthetic */ Function0<List<Certificate>> f37271b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13964b(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.f37271b = function0;
        }

        public Object invoke() {
            try {
                return this.f37271b.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    public m90(fe1 fe1, C15164xe xeVar, List<? extends Certificate> list, Function0<? extends List<? extends Certificate>> function0) {
        Intrinsics.checkNotNullParameter(fe1, "tlsVersion");
        Intrinsics.checkNotNullParameter(xeVar, "cipherSuite");
        Intrinsics.checkNotNullParameter(list, "localCertificates");
        Intrinsics.checkNotNullParameter(function0, "peerCertificatesFn");
        this.f37266a = fe1;
        this.f37267b = xeVar;
        this.f37268c = list;
        this.f37269d = LazyKt.lazy(new C13964b(function0));
    }

    /* renamed from: a */
    public final C15164xe mo68623a() {
        return this.f37267b;
    }

    /* renamed from: b */
    public final List<Certificate> mo68624b() {
        return this.f37268c;
    }

    /* renamed from: c */
    public final List<Certificate> mo68625c() {
        return (List) this.f37269d.getValue();
    }

    /* renamed from: d */
    public final fe1 mo68626d() {
        return this.f37266a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m90) {
            m90 m90 = (m90) obj;
            return m90.f37266a == this.f37266a && Intrinsics.areEqual((Object) m90.f37267b, (Object) this.f37267b) && Intrinsics.areEqual((Object) m90.mo68625c(), (Object) mo68625c()) && Intrinsics.areEqual((Object) m90.f37268c, (Object) this.f37268c);
        }
    }

    public int hashCode() {
        return ((((((this.f37266a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f37267b.hashCode()) * 31) + mo68625c().hashCode()) * 31) + this.f37268c.hashCode();
    }

    public String toString() {
        String str;
        String str2;
        List<Certificate> c = mo68625c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c, 10));
        for (Certificate certificate : c) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(str2, "type");
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f37266a);
        sb.append(" cipherSuite=");
        sb.append(this.f37267b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f37268c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(str, "type");
            }
            arrayList2.add(str);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
