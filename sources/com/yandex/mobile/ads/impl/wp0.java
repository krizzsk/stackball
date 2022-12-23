package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

public final class wp0 extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final vn1<ImageView, hd0> f42080a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp0(ImageView imageView, od0 od0) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(od0, "imageViewAdapter");
        this.f42080a = new vn1<>(od0);
    }

    /* renamed from: a */
    public final void mo70735a(hd0 hd0) {
        Intrinsics.checkNotNullParameter(hd0, "value");
        this.f42080a.mo70508b(hd0);
    }
}
