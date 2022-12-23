package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class x31 {

    /* renamed from: com.yandex.mobile.ads.impl.x31$a */
    private static class C15144a implements Runnable {

        /* renamed from: b */
        private final pu0 f42401b;

        /* renamed from: c */
        private final a41 f42402c;

        C15144a(pu0 pu0, a41 a41) {
            this.f42401b = pu0;
            this.f42402c = a41;
        }

        public void run() {
            this.f42401b.mo69438c().setVisibility(4);
            this.f42402c.mo65673a().setVisibility(0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x31$b */
    private static class C15145b implements Runnable {

        /* renamed from: b */
        private final a41 f42403b;

        /* renamed from: c */
        private final Bitmap f42404c;

        C15145b(a41 a41, Bitmap bitmap) {
            this.f42403b = a41;
            this.f42404c = bitmap;
        }

        public void run() {
            this.f42403b.setBackground(new BitmapDrawable(this.f42403b.getResources(), this.f42404c));
            this.f42403b.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo70819a(pu0 pu0, a41 a41, Bitmap bitmap) {
        a41.setAlpha(0.0f);
        a41.animate().alpha(1.0f).setDuration(700).withStartAction(new C15145b(a41, bitmap)).withEndAction(new C15144a(pu0, a41)).start();
    }
}
