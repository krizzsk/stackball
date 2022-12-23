package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.instream.C15419e;

public class wm1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f42059a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15419e f42060b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public s11 f42061c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f42062d;

    /* renamed from: com.yandex.mobile.ads.impl.wm1$b */
    private class C15063b implements Runnable {
        private C15063b() {
        }

        public void run() {
            long c = wm1.this.f42060b.mo71343c();
            if (wm1.this.f42061c != null) {
                ((h01) wm1.this.f42061c).mo67375a(c);
            }
            if (wm1.this.f42062d) {
                wm1.this.f42059a.postDelayed(this, 200);
            }
        }
    }

    public wm1(C15419e eVar) {
        this.f42060b = eVar;
    }

    /* renamed from: a */
    public void mo70731a(s11 s11) {
        this.f42061c = s11;
    }

    /* renamed from: b */
    public void mo70732b() {
        if (this.f42062d) {
            this.f42059a.removeCallbacksAndMessages((Object) null);
            this.f42062d = false;
        }
    }

    /* renamed from: a */
    public void mo70730a() {
        if (!this.f42062d) {
            this.f42062d = true;
            this.f42059a.post(new C15063b());
        }
    }
}
