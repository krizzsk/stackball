package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

public class fl1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final wk1 f33387a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final cl1 f33388b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f33389c = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f33390d;

    /* renamed from: com.yandex.mobile.ads.impl.fl1$b */
    private class C13060b implements Runnable {
        private C13060b() {
        }

        public void run() {
            long adPosition = fl1.this.f33387a.getAdPosition();
            fl1.this.f33388b.mo66071a(fl1.this.f33387a.mo68215c(), adPosition);
            if (fl1.this.f33390d) {
                fl1.this.f33389c.postDelayed(this, 200);
            }
        }
    }

    public fl1(wk1 wk1, cl1 cl1) {
        this.f33387a = wk1;
        this.f33388b = cl1;
    }

    /* renamed from: a */
    public void mo67031a() {
        if (!this.f33390d) {
            this.f33390d = true;
            this.f33388b.mo66331b();
            this.f33389c.post(new C13060b());
        }
    }

    /* renamed from: b */
    public void mo67032b() {
        if (this.f33390d) {
            this.f33388b.mo66328a();
            this.f33389c.removeCallbacksAndMessages((Object) null);
            this.f33390d = false;
        }
    }
}
