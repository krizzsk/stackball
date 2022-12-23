package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.tapjoy.TapjoyConstants;

public class sy0 {

    /* renamed from: a */
    private final kb0 f40178a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f40179b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final x81 f40180c = new x81();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C14164o3 f40181d = new C14164o3();

    /* renamed from: e */
    private boolean f40182e;

    /* renamed from: com.yandex.mobile.ads.impl.sy0$a */
    class C14641a implements Runnable {
        C14641a() {
        }

        public void run() {
            sy0.this.f40179b.postDelayed(sy0.this.f40181d, TapjoyConstants.TIMER_INCREMENT);
        }
    }

    public sy0(kb0 kb0) {
        this.f40178a = kb0;
    }

    /* renamed from: a */
    public void mo70071a(int i, String str) {
        this.f40182e = true;
        this.f40179b.removeCallbacks(this.f40181d);
        this.f40179b.post(new gq1(i, str, this.f40178a));
    }

    /* renamed from: b */
    public void mo70073b() {
        if (!this.f40182e) {
            this.f40180c.mo70847a(new C14641a());
        }
    }

    /* renamed from: a */
    public void mo70072a(jb0 jb0) {
        this.f40181d.mo69098a(jb0);
    }

    /* renamed from: a */
    public void mo70070a() {
        this.f40179b.removeCallbacksAndMessages((Object) null);
        this.f40181d.mo69098a((jb0) null);
    }
}
