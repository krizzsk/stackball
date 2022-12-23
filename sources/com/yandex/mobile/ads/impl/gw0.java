package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

public final class gw0 implements HostnameVerifier {

    /* renamed from: a */
    public static final gw0 f34161a = new gw0();

    private gw0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0155 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo67356a(java.lang.String r21, java.security.cert.X509Certificate r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            boolean r3 = com.yandex.mobile.ads.impl.jh1.m37829a((java.lang.String) r21)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0049
            java.lang.String r1 = com.yandex.mobile.ads.impl.ra0.m41511a(r21)
            r3 = 7
            java.util.List r2 = r0.m36707a((java.security.cert.X509Certificate) r2, (int) r3)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002d
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x002d
            goto L_0x0154
        L_0x002d:
            java.util.Iterator r2 = r2.iterator()
        L_0x0031:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0154
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.yandex.mobile.ads.impl.ra0.m41511a(r3)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0155
        L_0x0049:
            boolean r3 = r20.m36708a((java.lang.String) r21)
            java.lang.String r6 = "(this as java.lang.String).toLowerCase(locale)"
            java.lang.String r7 = "US"
            if (r3 == 0) goto L_0x005f
            java.util.Locale r3 = java.util.Locale.US
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            java.lang.String r1 = r1.toLowerCase(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
        L_0x005f:
            r3 = 2
            java.util.List r2 = r0.m36707a((java.security.cert.X509Certificate) r2, (int) r3)
            boolean r8 = r2 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0070
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L_0x0070
            goto L_0x0154
        L_0x0070:
            java.util.Iterator r2 = r2.iterator()
        L_0x0074:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0154
            java.lang.Object r8 = r2.next()
            java.lang.String r8 = (java.lang.String) r8
            com.yandex.mobile.ads.impl.gw0 r9 = f34161a
            if (r1 == 0) goto L_0x008d
            int r10 = r1.length()
            if (r10 != 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r10 = 0
            goto L_0x008e
        L_0x008d:
            r10 = 1
        L_0x008e:
            if (r10 != 0) goto L_0x0150
            java.lang.String r10 = "."
            r11 = 0
            boolean r12 = kotlin.text.StringsKt.startsWith$default(r1, r10, r5, r3, r11)
            if (r12 != 0) goto L_0x0150
            java.lang.String r12 = ".."
            boolean r13 = kotlin.text.StringsKt.endsWith$default(r1, r12, r5, r3, r11)
            if (r13 == 0) goto L_0x00a3
            goto L_0x0150
        L_0x00a3:
            if (r8 == 0) goto L_0x00ae
            int r13 = r8.length()
            if (r13 != 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r13 = 0
            goto L_0x00af
        L_0x00ae:
            r13 = 1
        L_0x00af:
            if (r13 != 0) goto L_0x0150
            boolean r13 = kotlin.text.StringsKt.startsWith$default(r8, r10, r5, r3, r11)
            if (r13 != 0) goto L_0x0150
            boolean r12 = kotlin.text.StringsKt.endsWith$default(r8, r12, r5, r3, r11)
            if (r12 == 0) goto L_0x00bf
            goto L_0x0150
        L_0x00bf:
            boolean r12 = kotlin.text.StringsKt.endsWith$default(r1, r10, r5, r3, r11)
            if (r12 != 0) goto L_0x00cb
            java.lang.String r12 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r10)
            r13 = r12
            goto L_0x00cc
        L_0x00cb:
            r13 = r1
        L_0x00cc:
            boolean r12 = kotlin.text.StringsKt.endsWith$default(r8, r10, r5, r3, r11)
            if (r12 != 0) goto L_0x00d6
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r10)
        L_0x00d6:
            boolean r9 = r9.m36708a((java.lang.String) r8)
            if (r9 == 0) goto L_0x00e8
            java.util.Locale r9 = java.util.Locale.US
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
            java.lang.String r8 = r8.toLowerCase(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
        L_0x00e8:
            java.lang.String r9 = "*"
            boolean r9 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r5, (int) r3, (java.lang.Object) r11)
            if (r9 != 0) goto L_0x00f5
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r8)
            goto L_0x0151
        L_0x00f5:
            java.lang.String r9 = "*."
            boolean r10 = kotlin.text.StringsKt.startsWith$default(r8, r9, r5, r3, r11)
            if (r10 == 0) goto L_0x0150
            r15 = 42
            r16 = 1
            r17 = 0
            r18 = 4
            r19 = 0
            r14 = r8
            int r10 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r14, (char) r15, (int) r16, (boolean) r17, (int) r18, (java.lang.Object) r19)
            r12 = -1
            if (r10 == r12) goto L_0x0110
            goto L_0x0150
        L_0x0110:
            int r10 = r13.length()
            int r14 = r8.length()
            if (r10 >= r14) goto L_0x011b
            goto L_0x0150
        L_0x011b:
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r8)
            if (r9 == 0) goto L_0x0122
            goto L_0x0150
        L_0x0122:
            java.lang.String r8 = r8.substring(r4)
            java.lang.String r9 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            boolean r9 = kotlin.text.StringsKt.endsWith$default(r13, r8, r5, r3, r11)
            if (r9 != 0) goto L_0x0132
            goto L_0x0150
        L_0x0132:
            int r9 = r13.length()
            int r8 = r8.length()
            int r9 = r9 - r8
            if (r9 <= 0) goto L_0x014e
            int r15 = r9 + -1
            r14 = 46
            r16 = 0
            r17 = 4
            r18 = 0
            int r8 = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) r13, (char) r14, (int) r15, (boolean) r16, (int) r17, (java.lang.Object) r18)
            if (r8 == r12) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r8 = 1
            goto L_0x0151
        L_0x0150:
            r8 = 0
        L_0x0151:
            if (r8 == 0) goto L_0x0074
            goto L_0x0155
        L_0x0154:
            r4 = 0
        L_0x0155:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gw0.mo67356a(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public boolean verify(String str, SSLSession sSLSession) {
        Intrinsics.checkNotNullParameter(str, "host");
        Intrinsics.checkNotNullParameter(sSLSession, "session");
        if (!m36708a(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return mo67356a(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m36708a(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, (Object) null));
    }

    /* renamed from: a */
    public final List<String> mo67355a(X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(x509Certificate, "certificate");
        return CollectionsKt.plus(m36707a(x509Certificate, 7), m36707a(x509Certificate, 2));
    }

    /* renamed from: a */
    private final List<String> m36707a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (Intrinsics.areEqual(next.get(0), (Object) Integer.valueOf(i))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }
}
