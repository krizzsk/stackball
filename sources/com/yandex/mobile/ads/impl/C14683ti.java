package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;

/* renamed from: com.yandex.mobile.ads.impl.ti */
public class C14683ti {

    /* renamed from: f */
    public static final C14683ti f40336f = new C14683ti((CharSequence) "", (Layout.Alignment) null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, false, (int) ViewCompat.MEASURED_STATE_MASK);

    /* renamed from: b */
    public final CharSequence f40337b;

    /* renamed from: c */
    public final float f40338c;

    /* renamed from: d */
    public final float f40339d;

    /* renamed from: e */
    public final int f40340e;

    public C14683ti(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this((CharSequence) null, (Layout.Alignment) null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, -3.4028235E38f, f3, f4, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C14683ti(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, (int) ViewCompat.MEASURED_STATE_MASK);
    }

    public C14683ti(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, (Layout.Alignment) null, (Bitmap) null, f, i, i2, f2, i3, i4, f4, f3, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C14683ti(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, (Bitmap) null, f, i, i2, f2, i3, Integer.MIN_VALUE, -3.4028235E38f, f3, -3.4028235E38f, z, i4);
    }

    private C14683ti(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.f40337b = charSequence;
        this.f40338c = f;
        this.f40339d = f2;
        this.f40340e = i3;
    }
}
