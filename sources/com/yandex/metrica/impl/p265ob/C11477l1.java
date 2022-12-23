package com.yandex.metrica.impl.p265ob;

import android.os.Handler;
import android.os.SystemClock;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.yandex.metrica.impl.ob.l1 */
class C11477l1 {

    /* renamed from: a */
    private final Handler f27622a;

    /* renamed from: b */
    private final C10382J f27623b;

    /* renamed from: c */
    private final C11512m1 f27624c;

    C11477l1(Handler handler, C10382J j) {
        this.f27622a = handler;
        this.f27623b = j;
        this.f27624c = new C11512m1(handler, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63251a() {
        this.f27622a.removeCallbacks(this.f27624c, this.f27623b.f24932b.mo62272b().mo60794a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63252b() {
        m29674a(this.f27622a, this.f27623b, this.f27624c);
    }

    /* renamed from: a */
    static void m29674a(Handler handler, C10382J j, Runnable runnable) {
        handler.removeCallbacks(runnable, j.f24932b.mo62272b().mo60794a());
        String a = j.f24932b.mo62272b().mo60794a();
        long uptimeMillis = SystemClock.uptimeMillis();
        Integer l = j.f24932b.mo62272b().mo60813l();
        if (l == null) {
            l = 10;
        }
        handler.postAtTime(runnable, a, uptimeMillis + ((long) (l.intValue() * TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL)));
    }
}
