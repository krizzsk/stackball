package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.qv */
public final class C14423qv implements C15055wl, View.OnLayoutChangeListener {

    /* renamed from: b */
    private int f39300b;

    /* renamed from: c */
    final /* synthetic */ View f39301c;

    /* renamed from: d */
    final /* synthetic */ Function1<Object, Unit> f39302d;

    /* renamed from: com.yandex.mobile.ads.impl.qv$a */
    public static final class C14424a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Function1 f39303b;

        /* renamed from: c */
        final /* synthetic */ View f39304c;

        public C14424a(View view, Function1 function1, View view2) {
            this.f39303b = function1;
            this.f39304c = view2;
        }

        public final void run() {
            this.f39303b.invoke(Integer.valueOf(this.f39304c.getWidth()));
        }
    }

    C14423qv(View view, Function1<Object, Unit> function1) {
        this.f39301c = view;
        this.f39302d = function1;
        this.f39300b = view.getWidth();
        view.addOnLayoutChangeListener(this);
        Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(view, new C14424a(view, function1, view)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
    }

    public void close() {
        this.f39301c.removeOnLayoutChangeListener(this);
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(view, "v");
        int width = view.getWidth();
        if (this.f39300b != width) {
            this.f39300b = width;
            this.f39302d.invoke(Integer.valueOf(width));
        }
    }
}
