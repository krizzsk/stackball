package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

public class n31 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14054b f37631a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f37632b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final C14352q3 f37633c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f37634d;

    /* renamed from: com.yandex.mobile.ads.impl.n31$a */
    private final class C14053a implements Runnable {

        /* renamed from: b */
        private final C14352q3 f37635b;

        public C14053a(C14352q3 q3Var) {
            this.f37635b = q3Var;
        }

        public void run() {
            if (n31.this.f37634d) {
                return;
            }
            if (this.f37635b.mo69473a()) {
                boolean unused = n31.this.f37634d = true;
                ((s31) n31.this.f37631a).mo69853a();
                return;
            }
            n31 n31 = n31.this;
            n31.f37632b.postDelayed(new C14053a(this.f37635b), 300);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n31$b */
    public interface C14054b {
    }

    n31(C14352q3 q3Var, C14054b bVar) {
        this.f37631a = bVar;
        this.f37633c = q3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo68884b() {
        this.f37632b.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68883a() {
        this.f37632b.post(new C14053a(this.f37633c));
    }
}
