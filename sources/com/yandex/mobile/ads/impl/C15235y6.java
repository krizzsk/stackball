package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.y6 */
final class C15235y6 implements C12573b7 {

    /* renamed from: e */
    private static final long f42781e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: f */
    private static final Object f42782f = new Object();

    /* renamed from: g */
    private static volatile C15235y6 f42783g;

    /* renamed from: a */
    private final Handler f42784a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final C12857d7 f42785b;

    /* renamed from: c */
    private final C12706c7 f42786c;

    /* renamed from: d */
    private boolean f42787d;

    private C15235y6(Context context) {
        this.f42785b = new C12857d7(context);
        this.f42786c = new C12706c7();
    }

    /* renamed from: a */
    static C15235y6 m44212a(Context context) {
        if (f42783g == null) {
            synchronized (f42782f) {
                if (f42783g == null) {
                    f42783g = new C15235y6(context);
                }
            }
        }
        return f42783g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71001b(C12958e7 e7Var) {
        synchronized (f42782f) {
            this.f42786c.mo66211a(e7Var);
            if (!this.f42787d) {
                this.f42787d = true;
                this.f42784a.postDelayed(new C15148x6(this), f42781e);
                this.f42785b.mo66434a((C12573b7) this);
            }
        }
    }

    /* renamed from: a */
    public void mo71000a(C15033w6 w6Var) {
        synchronized (f42782f) {
            this.f42784a.removeCallbacksAndMessages((Object) null);
            this.f42787d = false;
            this.f42786c.mo66213b(w6Var);
        }
    }

    /* renamed from: a */
    public void mo70998a() {
        synchronized (f42782f) {
            this.f42784a.removeCallbacksAndMessages((Object) null);
            this.f42787d = false;
            this.f42786c.mo66210a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70999a(C12958e7 e7Var) {
        synchronized (f42782f) {
            this.f42786c.mo66212b(e7Var);
        }
    }
}
