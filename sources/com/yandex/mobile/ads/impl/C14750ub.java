package com.yandex.mobile.ads.impl;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ub */
public final class C14750ub extends C14587se {

    /* renamed from: b */
    private final of1 f40613b;

    public C14750ub(of1 of1) {
        Intrinsics.checkNotNullParameter(of1, "trustRootIndex");
        this.f40613b = of1;
    }

    /* renamed from: a */
    public List<Certificate> mo69500a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(list, "chain");
        Intrinsics.checkNotNullParameter(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i = 0;
        boolean z = false;
        do {
            i++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a = this.f40613b.mo69154a(x509Certificate);
            if (a != null) {
                if (arrayList.size() > 1 || !Intrinsics.areEqual((Object) x509Certificate, (Object) a)) {
                    arrayList.add(a);
                }
                if (m42648a(a, a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        X509Certificate x509Certificate2 = (X509Certificate) next;
                        if (m42648a(x509Certificate, x509Certificate2)) {
                            it.remove();
                            arrayList.add(x509Certificate2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Failed to find a trusted cert that signed ", x509Certificate));
            }
        } while (i < 9);
        throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Certificate chain too long: ", arrayList));
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C14750ub) && Intrinsics.areEqual((Object) ((C14750ub) obj).f40613b, (Object) this.f40613b));
    }

    public int hashCode() {
        return this.f40613b.hashCode();
    }

    /* renamed from: a */
    private final boolean m42648a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!Intrinsics.areEqual((Object) x509Certificate.getIssuerDN(), (Object) x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
