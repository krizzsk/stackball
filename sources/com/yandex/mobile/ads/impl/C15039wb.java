package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.wb */
public final class C15039wb implements of1 {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f41907a;

    public C15039wb(X509Certificate... x509CertificateArr) {
        Intrinsics.checkNotNullParameter(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f41907a = linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.cert.X509Certificate mo69154a(java.security.cert.X509Certificate r5) {
        /*
            r4 = this;
            java.lang.String r0 = "cert"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.f41907a
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch:{ Exception -> 0x002f }
            r5.verify(r3)     // Catch:{ Exception -> 0x002f }
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x0019
            r1 = r2
        L_0x0033:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15039wb.mo69154a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C15039wb) && Intrinsics.areEqual((Object) ((C15039wb) obj).f41907a, (Object) this.f41907a));
    }

    public int hashCode() {
        return this.f41907a.hashCode();
    }
}
