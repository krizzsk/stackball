package com.yandex.mobile.ads.impl;

import android.graphics.ColorFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.lt */
final class C13894lt extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ C13444it f36911b;

    /* renamed from: c */
    final /* synthetic */ C14933vt f36912c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13894lt(C13444it itVar, C14933vt vtVar) {
        super(1);
        this.f36911b = itVar;
        this.f36912c = vtVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C13444it itVar = this.f36911b;
        C14933vt vtVar = this.f36912c;
        Integer valueOf = Integer.valueOf(intValue);
        itVar.getClass();
        if (valueOf != null) {
            vtVar.setColorFilter(valueOf.intValue());
        } else {
            vtVar.setColorFilter((ColorFilter) null);
        }
        return Unit.INSTANCE;
    }
}
