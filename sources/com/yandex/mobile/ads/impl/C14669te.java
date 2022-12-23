package com.yandex.mobile.ads.impl;

import com.facebook.internal.security.CertificateUtil;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;

/* renamed from: com.yandex.mobile.ads.impl.te */
public final class C14669te {

    /* renamed from: c */
    public static final C14671b f40290c = new C14671b((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final C14669te f40291d = new C14670a().mo70164a();

    /* renamed from: a */
    private final Set<C14672c> f40292a;

    /* renamed from: b */
    private final C14587se f40293b;

    /* renamed from: com.yandex.mobile.ads.impl.te$a */
    public static final class C14670a {

        /* renamed from: a */
        private final List<C14672c> f40294a = new ArrayList();

        /* renamed from: a */
        public final C14669te mo70164a() {
            return new C14669te(CollectionsKt.toSet(this.f40294a), (C14587se) null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.te$b */
    public static final class C14671b {
        private C14671b() {
        }

        public /* synthetic */ C14671b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ByteString mo70166a(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, (Object) null).sha256();
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo70165a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return Intrinsics.stringPlus("sha256/", mo70166a((X509Certificate) certificate).base64());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.te$c */
    public static final class C14672c {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14672c)) {
                return false;
            }
            C14672c cVar = (C14672c) obj;
            cVar.getClass();
            if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                return false;
            }
            cVar.getClass();
            if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                return false;
            }
            cVar.getClass();
            return Intrinsics.areEqual((Object) null, (Object) null);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append('/');
            throw null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.te$d */
    static final class C14673d extends Lambda implements Function0<List<? extends X509Certificate>> {

        /* renamed from: b */
        final /* synthetic */ C14669te f40295b;

        /* renamed from: c */
        final /* synthetic */ List<Certificate> f40296c;

        /* renamed from: d */
        final /* synthetic */ String f40297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14673d(C14669te teVar, List<? extends Certificate> list, String str) {
            super(0);
            this.f40295b = teVar;
            this.f40296c = list;
            this.f40297d = str;
        }

        public Object invoke() {
            C14587se a = this.f40295b.mo70158a();
            List<Certificate> a2 = a == null ? null : a.mo69500a(this.f40296c, this.f40297d);
            if (a2 == null) {
                a2 = this.f40296c;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
            for (Certificate certificate : a2) {
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C14669te(Set<C14672c> set, C14587se seVar) {
        Intrinsics.checkNotNullParameter(set, "pins");
        this.f40292a = set;
        this.f40293b = seVar;
    }

    /* renamed from: a */
    public final void mo70161a(String str, Function0<? extends List<? extends X509Certificate>> function0) {
        Intrinsics.checkNotNullParameter(str, "hostname");
        Intrinsics.checkNotNullParameter(function0, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(str, "hostname");
        Set<C14672c> set = this.f40292a;
        List<C14672c> emptyList = CollectionsKt.emptyList();
        for (T next : set) {
            ((C14672c) next).getClass();
            Intrinsics.checkNotNullParameter(str, "hostname");
            if (StringsKt.startsWith$default((String) null, "**.", false, 2, (Object) null)) {
                throw null;
            } else if (StringsKt.startsWith$default((String) null, "*.", false, 2, (Object) null)) {
                throw null;
            } else if (Intrinsics.areEqual((Object) str, (Object) null)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                TypeIntrinsics.asMutableList(emptyList).add(next);
            }
        }
        if (!emptyList.isEmpty()) {
            List<X509Certificate> list = (List) function0.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator it = emptyList.iterator();
                ByteString byteString = null;
                ByteString byteString2 = null;
                while (true) {
                    if (it.hasNext()) {
                        ((C14672c) it.next()).getClass();
                        if (Intrinsics.areEqual((Object) null, (Object) "sha256")) {
                            if (byteString == null) {
                                byteString = f40290c.mo70166a(x509Certificate);
                            }
                            if (Intrinsics.areEqual((Object) null, (Object) byteString)) {
                                return;
                            }
                        } else if (Intrinsics.areEqual((Object) null, (Object) "sha1")) {
                            if (byteString2 == null) {
                                Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
                                ByteString.Companion companion = ByteString.Companion;
                                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                                Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
                                byteString2 = ByteString.Companion.of$default(companion, encoded, 0, 0, 3, (Object) null).sha1();
                            }
                            if (Intrinsics.areEqual((Object) null, (Object) byteString2)) {
                                return;
                            }
                        } else {
                            throw new AssertionError(Intrinsics.stringPlus("unsupported hashAlgorithm: ", (Object) null));
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(f40290c.mo70165a((Certificate) x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(CertificateUtil.DELIMITER);
            for (C14672c append : emptyList) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14669te) {
            C14669te teVar = (C14669te) obj;
            return Intrinsics.areEqual((Object) teVar.f40292a, (Object) this.f40292a) && Intrinsics.areEqual((Object) teVar.f40293b, (Object) this.f40293b);
        }
    }

    public int hashCode() {
        int hashCode = (this.f40292a.hashCode() + 1517) * 41;
        C14587se seVar = this.f40293b;
        return hashCode + (seVar != null ? seVar.hashCode() : 0);
    }

    /* renamed from: a */
    public final C14587se mo70158a() {
        return this.f40293b;
    }

    /* renamed from: a */
    public final void mo70160a(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(str, "hostname");
        Intrinsics.checkNotNullParameter(list, "peerCertificates");
        mo70161a(str, (Function0<? extends List<? extends X509Certificate>>) new C14673d(this, list, str));
    }

    /* renamed from: a */
    public final C14669te mo70159a(C14587se seVar) {
        Intrinsics.checkNotNullParameter(seVar, "certificateChainCleaner");
        if (Intrinsics.areEqual((Object) this.f40293b, (Object) seVar)) {
            return this;
        }
        return new C14669te(this.f40292a, seVar);
    }
}
