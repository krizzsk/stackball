package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ym */
final class C15258ym extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ C15056wm f42892b;

    /* renamed from: c */
    final /* synthetic */ C13513jm f42893c;

    /* renamed from: d */
    final /* synthetic */ View f42894d;

    /* renamed from: e */
    final /* synthetic */ List<C14687tm> f42895e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15258ym(C15056wm wmVar, C13513jm jmVar, View view, List<? extends C14687tm> list) {
        super(0);
        this.f42892b = wmVar;
        this.f42893c = jmVar;
        this.f42894d = view;
        this.f42895e = list;
    }

    public Object invoke() {
        this.f42892b.mo70715a(this.f42893c, this.f42894d, (List<? extends C14687tm>) this.f42895e, "long_click");
        return Unit.INSTANCE;
    }
}
