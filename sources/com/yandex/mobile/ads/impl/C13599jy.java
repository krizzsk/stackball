package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.jy */
final class C13599jy extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ List<C14687tm> f35664b;

    /* renamed from: c */
    final /* synthetic */ C13458iy f35665c;

    /* renamed from: d */
    final /* synthetic */ C13513jm f35666d;

    /* renamed from: e */
    final /* synthetic */ C14429qy f35667e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13599jy(List<? extends C14687tm> list, C13458iy iyVar, C13513jm jmVar, C14429qy qyVar) {
        super(0);
        this.f35664b = list;
        this.f35665c = iyVar;
        this.f35666d = jmVar;
        this.f35667e = qyVar;
    }

    public Object invoke() {
        List<C14687tm> list = this.f35664b;
        C13458iy iyVar = this.f35665c;
        C13513jm jmVar = this.f35666d;
        C14429qy qyVar = this.f35667e;
        for (C14687tm tmVar : list) {
            iyVar.f35071f.mo70718a(jmVar, tmVar);
            iyVar.f35072g.mo66628a(jmVar, (View) qyVar, tmVar);
        }
        return Unit.INSTANCE;
    }
}
