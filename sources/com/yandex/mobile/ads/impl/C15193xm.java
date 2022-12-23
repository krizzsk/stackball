package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.xm */
final class C15193xm extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ C15056wm f42627b;

    /* renamed from: c */
    final /* synthetic */ C13513jm f42628c;

    /* renamed from: d */
    final /* synthetic */ View f42629d;

    /* renamed from: e */
    final /* synthetic */ C14687tm f42630e;

    /* renamed from: f */
    final /* synthetic */ nx0 f42631f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15193xm(C15056wm wmVar, C13513jm jmVar, View view, C14687tm tmVar, nx0 nx0) {
        super(0);
        this.f42627b = wmVar;
        this.f42628c = jmVar;
        this.f42629d = view;
        this.f42630e = tmVar;
        this.f42631f = nx0;
    }

    public Object invoke() {
        this.f42627b.f42036b.mo66634b(this.f42628c, this.f42629d, this.f42630e);
        this.f42627b.f42037c.mo70373a(this.f42630e, this.f42628c.mo66388b());
        this.f42631f.mo69085a().onClick(this.f42629d);
        return Unit.INSTANCE;
    }
}
