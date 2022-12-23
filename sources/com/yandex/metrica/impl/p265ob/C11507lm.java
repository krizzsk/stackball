package com.yandex.metrica.impl.p265ob;

import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.lm */
class C11507lm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C11570nm f27699a;

    /* renamed from: b */
    final /* synthetic */ WebView f27700b;

    /* renamed from: c */
    final /* synthetic */ CountDownLatch f27701c;

    C11507lm(C11537mm mmVar, C11570nm nmVar, WebView webView, CountDownLatch countDownLatch) {
        this.f27699a = nmVar;
        this.f27700b = webView;
        this.f27701c = countDownLatch;
    }

    public void run() {
        try {
            this.f27699a.f27800h = this.f27700b.getUrl();
            this.f27699a.f27801i = this.f27700b.getOriginalUrl();
            this.f27701c.countDown();
        } catch (Throwable unused) {
        }
    }
}
