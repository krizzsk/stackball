package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;

public class bz0 implements ed0 {

    /* renamed from: a */
    private Map<String, Bitmap> f31742a;

    /* renamed from: a */
    public void mo66168a(Map<String, Bitmap> map) {
        this.f31742a = map;
    }

    /* renamed from: a */
    public Bitmap mo66167a(hd0 hd0) {
        String d = hd0.mo67524d();
        Map<String, Bitmap> map = this.f31742a;
        if (map != null) {
            return map.get(d);
        }
        return null;
    }
}
