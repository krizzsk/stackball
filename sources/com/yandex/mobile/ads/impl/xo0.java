package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;

class xo0 implements C14381qf {

    /* renamed from: a */
    private final View f42663a;

    /* renamed from: b */
    private final Handler f42664b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final bh1 f42665c;

    /* renamed from: d */
    private boolean f42666d;

    /* renamed from: com.yandex.mobile.ads.impl.xo0$a */
    private static class C15199a implements Runnable {

        /* renamed from: b */
        private final WeakReference<View> f42667b;

        C15199a(View view) {
            this.f42667b = new WeakReference<>(view);
        }

        public void run() {
            View view = (View) this.f42667b.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    xo0(View view, bh1 bh1) {
        this.f42663a = view;
        view.setVisibility(8);
        this.f42665c = bh1;
    }

    /* renamed from: a */
    public void mo66083a() {
    }

    /* renamed from: a */
    public void mo66084a(boolean z) {
        this.f42666d = true;
        this.f42664b.removeCallbacksAndMessages((Object) null);
        bh1 bh1 = this.f42665c;
        View view = this.f42663a;
        bh1.getClass();
        view.setVisibility(z ? 8 : 0);
    }

    /* renamed from: b */
    public void mo66085b() {
    }

    /* renamed from: d */
    public void mo66086d() {
        if (!this.f42666d) {
            this.f42664b.postDelayed(new C15199a(this.f42663a), 200);
        }
    }

    /* renamed from: e */
    public View mo66087e() {
        return this.f42663a;
    }

    public void invalidate() {
    }
}
