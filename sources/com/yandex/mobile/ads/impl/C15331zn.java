package com.yandex.mobile.ads.impl;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.zn */
public final class C15331zn implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f43236a;

    public C15331zn(View view) {
        this.f43236a = view;
    }

    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f43236a.removeOnAttachStateChangeListener(this);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setLayerType(1, (Paint) null);
            viewGroup.setClipChildren(false);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
