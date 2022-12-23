package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.C13486jc;

/* renamed from: com.yandex.mobile.ads.impl.ic */
class C13404ic implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Bitmap f34821b;

    /* renamed from: c */
    final /* synthetic */ C13486jc.C13487a f34822c;

    C13404ic(C13486jc.C13487a aVar, Bitmap bitmap) {
        this.f34822c = aVar;
        this.f34821b = bitmap;
    }

    public void run() {
        this.f34822c.f35219e.mo67965a(this.f34821b);
    }
}
