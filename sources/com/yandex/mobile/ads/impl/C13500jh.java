package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.C15164xe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.jh */
public final class C13500jh {

    /* renamed from: e */
    public static final C13500jh f35295e;

    /* renamed from: f */
    public static final C13500jh f35296f = new C13501a(false).mo68003a();

    /* renamed from: a */
    private final boolean f35297a;

    /* renamed from: b */
    private final boolean f35298b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f35299c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String[] f35300d;

    static {
        C15164xe xeVar = C15164xe.f42540r;
        C15164xe xeVar2 = C15164xe.f42541s;
        C15164xe xeVar3 = C15164xe.f42542t;
        C15164xe xeVar4 = C15164xe.f42534l;
        C15164xe xeVar5 = C15164xe.f42536n;
        C15164xe xeVar6 = C15164xe.f42535m;
        C15164xe xeVar7 = C15164xe.f42537o;
        C15164xe xeVar8 = C15164xe.f42539q;
        C15164xe xeVar9 = C15164xe.f42538p;
        C15164xe[] xeVarArr = {xeVar, xeVar2, xeVar3, xeVar4, xeVar5, xeVar6, xeVar7, xeVar8, xeVar9, C15164xe.f42532j, C15164xe.f42533k, C15164xe.f42530h, C15164xe.f42531i, C15164xe.f42528f, C15164xe.f42529g, C15164xe.f42527e};
        C13501a a = new C13501a(true).mo68001a((C15164xe[]) Arrays.copyOf(new C15164xe[]{xeVar, xeVar2, xeVar3, xeVar4, xeVar5, xeVar6, xeVar7, xeVar8, xeVar9}, 9));
        fe1 fe1 = fe1.TLS_1_3;
        fe1 fe12 = fe1.TLS_1_2;
        a.mo68000a(fe1, fe12).mo67999a(true).mo68003a();
        f35295e = new C13501a(true).mo68001a((C15164xe[]) Arrays.copyOf(xeVarArr, 16)).mo68000a(fe1, fe12).mo67999a(true).mo68003a();
        new C13501a(true).mo68001a((C15164xe[]) Arrays.copyOf(xeVarArr, 16)).mo68000a(fe1, fe12, fe1.TLS_1_1, fe1.TLS_1_0).mo67999a(true).mo68003a();
    }

    public C13500jh(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f35297a = z;
        this.f35298b = z2;
        this.f35299c = strArr;
        this.f35300d = strArr2;
    }

    /* renamed from: c */
    public final boolean mo67994c() {
        return this.f35298b;
    }

    /* renamed from: d */
    public final List<fe1> mo67995d() {
        fe1 fe1;
        String[] strArr = this.f35300d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Intrinsics.checkNotNullParameter(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (!str.equals("TLSv1.1")) {
                                break;
                            } else {
                                fe1 = fe1.TLS_1_1;
                                continue;
                            }
                        case -503070502:
                            if (!str.equals("TLSv1.2")) {
                                break;
                            } else {
                                fe1 = fe1.TLS_1_2;
                                continue;
                            }
                        case -503070501:
                            if (!str.equals("TLSv1.3")) {
                                break;
                            } else {
                                fe1 = fe1.TLS_1_3;
                                continue;
                            }
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", str));
                } else if (str.equals("TLSv1")) {
                    fe1 = fe1.TLS_1_0;
                } else {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", str));
                }
            } else if (str.equals("SSLv3")) {
                fe1 = fe1.SSL_3_0;
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", str));
            }
            arrayList.add(fe1);
        }
        return CollectionsKt.toList(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13500jh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f35297a;
        C13500jh jhVar = (C13500jh) obj;
        if (z != jhVar.f35297a) {
            return false;
        }
        return !z || (Arrays.equals(this.f35299c, jhVar.f35299c) && Arrays.equals(this.f35300d, jhVar.f35300d) && this.f35298b == jhVar.f35298b);
    }

    public int hashCode() {
        if (!this.f35297a) {
            return 17;
        }
        String[] strArr = this.f35299c;
        int i = 0;
        int hashCode = ((strArr == null ? 0 : Arrays.hashCode(strArr)) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String[] strArr2 = this.f35300d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f35298b ^ true ? 1 : 0);
    }

    public String toString() {
        if (!this.f35297a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(mo67990a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(mo67995d(), "[all enabled]") + ", supportsTlsExtensions=" + this.f35298b + ')';
    }

    /* renamed from: com.yandex.mobile.ads.impl.jh$a */
    public static final class C13501a {

        /* renamed from: a */
        private boolean f35301a;

        /* renamed from: b */
        private String[] f35302b;

        /* renamed from: c */
        private String[] f35303c;

        /* renamed from: d */
        private boolean f35304d;

        public C13501a(boolean z) {
            this.f35301a = z;
        }

        /* renamed from: a */
        public final C13501a mo68001a(C15164xe... xeVarArr) {
            Intrinsics.checkNotNullParameter(xeVarArr, "cipherSuites");
            if (this.f35301a) {
                ArrayList arrayList = new ArrayList(xeVarArr.length);
                for (C15164xe c : xeVarArr) {
                    arrayList.add(c.mo70890c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return mo68002a((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: b */
        public final C13501a mo68004b(String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "tlsVersions");
            if (this.f35301a) {
                if (!(strArr.length == 0)) {
                    this.f35303c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C13501a(C13500jh jhVar) {
            Intrinsics.checkNotNullParameter(jhVar, "connectionSpec");
            this.f35301a = jhVar.mo67993b();
            this.f35302b = jhVar.f35299c;
            this.f35303c = jhVar.f35300d;
            this.f35304d = jhVar.mo67994c();
        }

        /* renamed from: a */
        public final C13501a mo68002a(String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "cipherSuites");
            if (this.f35301a) {
                if (!(strArr.length == 0)) {
                    this.f35302b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        /* renamed from: a */
        public final C13501a mo67999a(boolean z) {
            if (this.f35301a) {
                this.f35304d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: a */
        public final C13501a mo68000a(fe1... fe1Arr) {
            Intrinsics.checkNotNullParameter(fe1Arr, "tlsVersions");
            if (this.f35301a) {
                ArrayList arrayList = new ArrayList(fe1Arr.length);
                for (fe1 a : fe1Arr) {
                    arrayList.add(a.mo66998a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return mo68004b((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: a */
        public final C13500jh mo68003a() {
            return new C13500jh(this.f35301a, this.f35304d, this.f35302b, this.f35303c);
        }
    }

    /* renamed from: a */
    public final List<C15164xe> mo67990a() {
        String[] strArr = this.f35299c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C15164xe.f42524b.mo70893a(a));
        }
        return CollectionsKt.toList(arrayList);
    }

    /* renamed from: b */
    public final boolean mo67993b() {
        return this.f35297a;
    }

    /* renamed from: a */
    public final void mo67991a(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        SSLSocket sSLSocket2 = sSLSocket;
        Intrinsics.checkNotNullParameter(sSLSocket2, "sslSocket");
        if (this.f35299c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            String[] strArr3 = this.f35299c;
            C15164xe.C15166b bVar = C15164xe.f42524b;
            strArr = jh1.m37837b(enabledCipherSuites, strArr3, (Comparator<? super String>) C15164xe.f42525c);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f35300d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = jh1.m37837b(enabledProtocols, this.f35300d, (Comparator<? super String>) ComparisonsKt.naturalOrder());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        C15164xe.C15166b bVar2 = C15164xe.f42524b;
        Comparator b = C15164xe.f42525c;
        byte[] bArr = jh1.f35305a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(b, "comparator");
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (((C15164xe.C15165a) b).compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z && i != -1) {
            Intrinsics.checkNotNullExpressionValue(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(strArr, "<this>");
            Intrinsics.checkNotNullParameter(str, "value");
            Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            strArr = (String[]) copyOf;
            strArr[ArraysKt.getLastIndex((T[]) strArr)] = str;
        }
        C13501a aVar = new C13501a(this);
        Intrinsics.checkNotNullExpressionValue(strArr, "cipherSuitesIntersection");
        C13501a a = aVar.mo68002a((String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullExpressionValue(strArr2, "tlsVersionsIntersection");
        C13500jh a2 = a.mo68004b((String[]) Arrays.copyOf(strArr2, strArr2.length)).mo68003a();
        if (a2.mo67995d() != null) {
            sSLSocket2.setEnabledProtocols(a2.f35300d);
        }
        if (a2.mo67990a() != null) {
            sSLSocket2.setEnabledCipherSuites(a2.f35299c);
        }
    }

    /* renamed from: a */
    public final boolean mo67992a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "socket");
        if (!this.f35297a) {
            return false;
        }
        String[] strArr = this.f35300d;
        if (strArr != null && !jh1.m37832a(strArr, sSLSocket.getEnabledProtocols(), (Comparator<? super String>) ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f35299c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        C15164xe.C15166b bVar = C15164xe.f42524b;
        if (!jh1.m37832a(strArr2, enabledCipherSuites, (Comparator<? super String>) C15164xe.f42525c)) {
            return false;
        }
        return true;
    }
}
