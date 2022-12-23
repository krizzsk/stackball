package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.yandex.mobile.ads.impl.do */
final class C12907do extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14624so f32723b;

    /* renamed from: c */
    final /* synthetic */ List<C14479rn> f32724c;

    /* renamed from: d */
    final /* synthetic */ View f32725d;

    /* renamed from: e */
    final /* synthetic */ C13513jm f32726e;

    /* renamed from: f */
    final /* synthetic */ j50 f32727f;

    /* renamed from: g */
    final /* synthetic */ List<C14479rn> f32728g;

    /* renamed from: h */
    final /* synthetic */ Ref.ObjectRef<Drawable> f32729h;

    /* renamed from: i */
    final /* synthetic */ Function0<Unit> f32730i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12907do(C14624so soVar, List<? extends C14479rn> list, View view, C13513jm jmVar, j50 j50, List<? extends C14479rn> list2, Ref.ObjectRef<Drawable> objectRef, Function0<Unit> function0) {
        super(1);
        this.f32723b = soVar;
        this.f32724c = list;
        this.f32725d = view;
        this.f32726e = jmVar;
        this.f32727f = j50;
        this.f32728g = list2;
        this.f32729h = objectRef;
        this.f32730i = function0;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        T stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842908}, C14624so.m42094a(this.f32723b, this.f32724c, this.f32725d, this.f32726e, this.f32727f));
        List<C14479rn> list = this.f32728g;
        if (list != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, C14624so.m42094a(this.f32723b, list, this.f32725d, this.f32726e, this.f32727f));
        }
        this.f32729h.element = stateListDrawable;
        this.f32730i.invoke();
        return Unit.INSTANCE;
    }
}
