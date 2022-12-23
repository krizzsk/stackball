package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class ld0 {

    /* renamed from: a */
    private final ed0 f36640a;

    /* renamed from: b */
    private final C13852lc f36641b = new C13852lc();

    public ld0(ed0 ed0) {
        this.f36640a = ed0;
    }

    /* renamed from: a */
    public boolean mo68406a(Drawable drawable, hd0 hd0) {
        Bitmap a = this.f36640a.mo66167a(hd0);
        if (drawable == null || a == null) {
            return false;
        }
        return this.f36641b.mo68404a(drawable).mo67392a(drawable, a);
    }
}
