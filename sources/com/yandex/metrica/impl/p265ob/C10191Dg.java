package com.yandex.metrica.impl.p265ob;

import android.os.Handler;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

/* renamed from: com.yandex.metrica.impl.ob.Dg */
public class C10191Dg implements C10224Eg {

    /* renamed from: a */
    private final boolean f24497a;

    /* renamed from: b */
    private final C11544n2 f24498b;

    /* renamed from: c */
    private final C10248F9 f24499c;

    /* renamed from: d */
    private final C11966y0 f24500d;

    /* renamed from: e */
    private final C11172e2 f24501e;

    /* renamed from: f */
    private final Handler f24502f;

    public C10191Dg(C11544n2 n2Var, C10248F9 f9, Handler handler) {
        this(n2Var, f9, handler, f9.mo61320v());
    }

    /* renamed from: a */
    public void mo61191a() {
        if (!this.f24497a) {
            this.f24498b.mo63338a(new C10314Gg(this.f24502f, this));
        }
    }

    private C10191Dg(C11544n2 n2Var, C10248F9 f9, Handler handler, boolean z) {
        this(n2Var, f9, handler, z, new C11966y0(z), new C11172e2());
    }

    /* renamed from: a */
    public void mo61194a(C10255Fg fg) {
        String str = fg == null ? null : fg.f24687a;
        if (!this.f24497a) {
            synchronized (this) {
                this.f24500d.mo64116a(this.f24501e.mo62804a(str));
            }
        }
    }

    C10191Dg(C11544n2 n2Var, C10248F9 f9, Handler handler, boolean z, C11966y0 y0Var, C11172e2 e2Var) {
        this.f24498b = n2Var;
        this.f24499c = f9;
        this.f24497a = z;
        this.f24500d = y0Var;
        this.f24501e = e2Var;
        this.f24502f = handler;
    }

    /* renamed from: a */
    public synchronized void mo61193a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.f24500d.mo64115a(deferredDeeplinkParametersListener);
            this.f24499c.mo61322x();
        } catch (Throwable th) {
            this.f24499c.mo61322x();
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void mo61192a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            this.f24500d.mo64114a(deferredDeeplinkListener);
            this.f24499c.mo61322x();
        } catch (Throwable th) {
            this.f24499c.mo61322x();
            throw th;
        }
    }
}
