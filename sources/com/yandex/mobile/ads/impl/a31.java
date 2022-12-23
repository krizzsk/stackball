package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class a31 extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* renamed from: b */
    final /* synthetic */ y21 f30435b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a31(y21 y21) {
        super(0);
        this.f30435b = y21;
    }

    public Object invoke() {
        m90 a = this.f30435b.f42751e;
        Intrinsics.checkNotNull(a);
        List<Certificate> c = a.mo68625c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c, 10));
        for (Certificate certificate : c) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
