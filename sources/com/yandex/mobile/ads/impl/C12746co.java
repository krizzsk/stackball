package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.yandex.mobile.ads.impl.co */
final class C12746co extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ Ref.ObjectRef<Drawable> f31977b;

    /* renamed from: c */
    final /* synthetic */ List<C14479rn> f31978c;

    /* renamed from: d */
    final /* synthetic */ C14624so f31979d;

    /* renamed from: e */
    final /* synthetic */ View f31980e;

    /* renamed from: f */
    final /* synthetic */ C13513jm f31981f;

    /* renamed from: g */
    final /* synthetic */ j50 f31982g;

    /* renamed from: h */
    final /* synthetic */ Function0<Unit> f31983h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12746co(Ref.ObjectRef<Drawable> objectRef, List<? extends C14479rn> list, C14624so soVar, View view, C13513jm jmVar, j50 j50, Function0<Unit> function0) {
        super(1);
        this.f31977b = objectRef;
        this.f31978c = list;
        this.f31979d = soVar;
        this.f31980e = view;
        this.f31981f = jmVar;
        this.f31982g = j50;
        this.f31983h = function0;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        Ref.ObjectRef<Drawable> objectRef = this.f31977b;
        List<C14479rn> list = this.f31978c;
        objectRef.element = list == null ? null : C14624so.m42094a(this.f31979d, list, this.f31980e, this.f31981f, this.f31982g);
        this.f31983h.invoke();
        return Unit.INSTANCE;
    }
}
