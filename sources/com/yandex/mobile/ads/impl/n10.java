package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class n10 extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ Collection<m10> f37623b;

    /* renamed from: c */
    final /* synthetic */ o10 f37624c;

    /* renamed from: d */
    final /* synthetic */ C13513jm f37625d;

    /* renamed from: e */
    final /* synthetic */ View f37626e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n10(Collection<? extends m10> collection, o10 o10, C13513jm jmVar, View view) {
        super(0);
        this.f37623b = collection;
        this.f37624c = o10;
        this.f37625d = jmVar;
        this.f37626e = view;
    }

    public Object invoke() {
        Collection<m10> collection = this.f37623b;
        o10 o10 = this.f37624c;
        C13513jm jmVar = this.f37625d;
        View view = this.f37626e;
        for (m10 a : collection) {
            o10.mo69095a(jmVar, view, a);
        }
        return Unit.INSTANCE;
    }
}
