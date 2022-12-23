package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.el0;

public class pu0 extends FrameLayout {

    /* renamed from: a */
    private el0 f38831a = new r81();

    /* renamed from: b */
    private final mm1 f38832b;

    /* renamed from: c */
    private final TextureView f38833c;

    /* renamed from: d */
    private final qt0 f38834d;

    pu0(Context context, mm1 mm1, TextureView textureView, qt0 qt0) {
        super(context);
        this.f38832b = mm1;
        this.f38833c = textureView;
        this.f38834d = qt0;
    }

    /* renamed from: a */
    public qt0 mo69436a() {
        return this.f38834d;
    }

    /* renamed from: b */
    public mm1 mo69437b() {
        return this.f38832b;
    }

    /* renamed from: c */
    public TextureView mo69438c() {
        return this.f38833c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        el0.C12983a a = this.f38831a.mo65798a(i, i2);
        super.onMeasure(a.f33000a, a.f33001b);
    }

    public void setAspectRatio(float f) {
        this.f38831a = new u11(f);
    }
}
