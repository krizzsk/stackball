package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

public final class n91 {

    /* renamed from: a */
    private int f37681a;

    /* renamed from: b */
    private int f37682b;

    /* renamed from: a */
    private final int m39889a(Drawable drawable) {
        return (this.f37682b / 2) + (drawable.getIntrinsicHeight() / 2);
    }

    /* renamed from: b */
    private final int m39890b(Drawable drawable) {
        return (this.f37682b / 2) - (drawable.getIntrinsicHeight() / 2);
    }

    /* renamed from: a */
    public final void mo68941a(int i, int i2) {
        this.f37681a = i;
        this.f37682b = i2;
    }

    /* renamed from: a */
    public final void mo68942a(Canvas canvas, Drawable drawable) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable != null) {
            drawable.setBounds(0, m39890b(drawable), this.f37681a, m39889a(drawable));
            drawable.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void mo68944a(Canvas canvas, Drawable drawable, int i, int i2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable != null) {
            drawable.setBounds(i, m39890b(drawable), i2, m39889a(drawable));
            drawable.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void mo68943a(Canvas canvas, Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            drawable.setBounds(i - intrinsicWidth, m39890b(drawable), i + intrinsicWidth, m39889a(drawable));
            drawable.draw(canvas);
        }
    }
}
