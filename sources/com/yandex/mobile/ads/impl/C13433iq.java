package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.iq */
final class C13433iq extends Lambda implements Function0<Unit> {

    /* renamed from: b */
    final /* synthetic */ LinkedList<View> f34990b;

    /* renamed from: c */
    final /* synthetic */ C13513jm f34991c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13433iq(LinkedList<View> linkedList, C13513jm jmVar) {
        super(0);
        this.f34990b = linkedList;
        this.f34991c = jmVar;
    }

    public Object invoke() {
        LinkedList<View> linkedList = this.f34990b;
        C13513jm jmVar = this.f34991c;
        for (View a : linkedList) {
            i10.m37254a(jmVar.mo68042m(), a);
        }
        return Unit.INSTANCE;
    }
}
