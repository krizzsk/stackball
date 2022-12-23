package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.core.view.LayoutInflaterCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.yi */
public abstract class C15253yi extends ContextWrapper {

    /* renamed from: a */
    private LayoutInflater f42869a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15253yi(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "baseContext");
    }

    /* renamed from: a */
    public abstract LayoutInflater.Factory2 mo66093a();

    public Object getSystemService(String str) {
        LayoutInflater layoutInflater;
        Intrinsics.checkNotNullParameter(str, "name");
        if (!Intrinsics.areEqual((Object) "layout_inflater", (Object) str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater2 = this.f42869a;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this) {
            layoutInflater = this.f42869a;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                if (layoutInflater != null) {
                    LayoutInflaterCompat.setFactory2(layoutInflater, mo66093a());
                    this.f42869a = layoutInflater;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                }
            }
        }
        return layoutInflater;
    }
}
