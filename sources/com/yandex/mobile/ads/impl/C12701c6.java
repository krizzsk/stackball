package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.nativeads.C15501j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.c6 */
public class C12701c6 {

    /* renamed from: f */
    private static final long f31814f = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a */
    private final C13476j6 f31815a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Dialog f31816b;

    /* renamed from: c */
    private final Handler f31817c = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C15501j f31818d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ex0 f31819e;

    /* renamed from: com.yandex.mobile.ads.impl.c6$b */
    private class C12703b implements C13956m6 {
        private C12703b() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c6$c */
    private class C12704c implements Runnable {
        private C12704c() {
        }

        public void run() {
            C12701c6.this.f31816b.dismiss();
        }
    }

    C12701c6(Dialog dialog, C13476j6 j6Var, C15501j jVar, ex0 ex0) {
        this.f31815a = j6Var;
        this.f31816b = dialog;
        this.f31818d = jVar;
        this.f31819e = ex0;
    }

    /* renamed from: c */
    static void m34594c(C12701c6 c6Var) {
        c6Var.f31817c.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public void mo66205a(String str) {
        this.f31815a.setAdtuneWebViewListener(new C12703b());
        this.f31815a.loadUrl(str);
        this.f31817c.postDelayed(new C12704c(), f31814f);
        this.f31816b.show();
    }
}
