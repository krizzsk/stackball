package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.mv0;

class tg1 implements mv0.C14023c {

    /* renamed from: a */
    private final LruCache<String, Bitmap> f40321a;

    /* renamed from: b */
    private final vc0 f40322b;

    tg1(LruCache<String, Bitmap> lruCache, vc0 vc0) {
        this.f40321a = lruCache;
        this.f40322b = vc0;
    }

    /* renamed from: b */
    private String m42342b(String str) {
        this.f40322b.getClass();
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        return "#S" + scaleType.ordinal() + str;
    }

    /* renamed from: a */
    public Bitmap mo68862a(String str) {
        return this.f40321a.get(m42342b(str));
    }

    /* renamed from: a */
    public void mo68863a(String str, Bitmap bitmap) {
        this.f40321a.put(m42342b(str), bitmap);
    }
}
