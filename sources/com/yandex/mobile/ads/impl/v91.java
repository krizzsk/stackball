package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

public class v91 {

    /* renamed from: a */
    private final y91 f41216a = new y91();

    /* renamed from: b */
    private final C15157xa f41217b = new C15157xa();

    /* renamed from: c */
    private final C15240yb f41218c = new C15240yb();

    /* renamed from: d */
    private x91 f41219d;

    /* renamed from: a */
    public void mo70460a(ImageView imageView, hd0 hd0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "view");
        Intrinsics.checkNotNullParameter(hd0, "imageValue");
        Intrinsics.checkNotNullParameter(bitmap, "originalBitmap");
        x91 x91 = new x91(this.f41217b, this.f41218c, this.f41216a, hd0, bitmap);
        this.f41219d = x91;
        imageView.addOnLayoutChangeListener(x91);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public final void mo70459a(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "view");
        imageView.removeOnLayoutChangeListener(this.f41219d);
    }
}
