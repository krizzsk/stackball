package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.mv0;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.qd */
public class C14379qd implements ed0 {

    /* renamed from: a */
    private final Context f39088a;

    public C14379qd(Context context) {
        this.f39088a = context.getApplicationContext();
    }

    /* renamed from: a */
    public Bitmap mo66167a(hd0 hd0) {
        mv0.C14023c b = mv0.m39740c(this.f39088a).mo68860b();
        String d = hd0.mo67524d();
        if (d == null) {
            return null;
        }
        Bitmap a = b.mo68862a(d);
        if (a == null || a.getWidth() != 1 || a.getHeight() != 1) {
            return a;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, hd0.mo67525e(), hd0.mo67516a(), false);
        b.mo68863a(d, createScaledBitmap);
        return createScaledBitmap;
    }

    /* renamed from: a */
    public void mo66168a(Map<String, Bitmap> map) {
    }
}
