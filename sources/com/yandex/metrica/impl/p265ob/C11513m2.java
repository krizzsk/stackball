package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C11229f4;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.m2 */
public class C11513m2<C extends C11229f4> extends C10655Q2<C> {

    /* renamed from: e */
    private Runnable f27709e = new C11514a();

    /* renamed from: f */
    private final C11769sn f27710f;

    /* renamed from: com.yandex.metrica.impl.ob.m2$a */
    class C11514a implements Runnable {
        C11514a() {
        }

        public void run() {
            C11513m2.this.mo61947d();
        }
    }

    public C11513m2(C c, C11002Zi zi, C11769sn snVar) {
        super(c, zi);
        this.f27710f = snVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo61946c() {
        ((C11725rn) this.f27710f).mo63612a(this.f27709e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo61949f() {
        super.mo61949f();
        C11384jh m = ((C11229f4) mo61948e()).mo62880m();
        if (m.mo63076G()) {
            String C = m.mo63072C();
            if (!TextUtils.isEmpty(C) && !"-1".equals(C)) {
                try {
                    C11365j2 j2Var = new C11365j2((C11229f4) mo61948e());
                    C10688R1 l = C10619P0.m27164i().mo61884l();
                    if (l != null) {
                        l.mo62102b(j2Var);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: g */
    public void mo63312g() {
        synchronized (this.f25438b) {
            if (!this.f25439c) {
                mo61946c();
                if (((C11229f4) mo61948e()).mo62880m().mo63077H() > 0) {
                    long millis = TimeUnit.SECONDS.toMillis((long) ((C11229f4) mo61948e()).mo62880m().mo63077H());
                    ((C11725rn) this.f27710f).mo63613a(this.f27709e, millis);
                }
            }
        }
    }
}
