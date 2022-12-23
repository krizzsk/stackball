package com.yandex.mobile.ads.impl;

import android.view.View;

public class gc1 implements vh0 {

    /* renamed from: b */
    private final boolean f33937b;

    public gc1(View view) {
        this.f33937b = mo67236a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo67236a(View view) {
        return view.isHardwareAccelerated();
    }

    /* renamed from: a */
    public String mo66428a() {
        return String.format("supports: {inlineVideo: %s}", new Object[]{Boolean.valueOf(this.f33937b)});
    }
}
