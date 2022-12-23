package com.yandex.mobile.ads.impl;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.po */
final class C14301po extends Lambda implements Function1<l10, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14624so f38751b;

    /* renamed from: c */
    final /* synthetic */ View f38752c;

    /* renamed from: d */
    final /* synthetic */ C13513jm f38753d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14301po(C14624so soVar, View view, C13513jm jmVar) {
        super(1);
        this.f38751b = soVar;
        this.f38752c = view;
        this.f38753d = jmVar;
    }

    public Object invoke(Object obj) {
        l10 l10 = (l10) obj;
        Intrinsics.checkNotNullParameter(l10, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY);
        this.f38751b.m42095a(this.f38752c, l10, this.f38753d);
        return Unit.INSTANCE;
    }
}
