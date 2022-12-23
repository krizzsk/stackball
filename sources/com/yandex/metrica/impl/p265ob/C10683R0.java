package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.R0 */
public class C10683R0 {

    /* renamed from: a */
    private final C11769sn f25557a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10765T0 f25558b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10687d f25559c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f25560d = new C10684a();

    /* renamed from: e */
    private final Runnable f25561e = new C10685b();

    /* renamed from: com.yandex.metrica.impl.ob.R0$a */
    class C10684a implements Runnable {
        C10684a() {
        }

        public void run() {
            C10683R0.this.f25558b.mo61387a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$b */
    class C10685b implements Runnable {
        C10685b() {
        }

        public void run() {
            if (((C10621P2) C10683R0.this.f25559c).mo61902b()) {
                C10683R0.this.f25560d.run();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$c */
    public static class C10686c {
        /* renamed from: a */
        public C10683R0 mo62100a(C11769sn snVar, C10765T0 t0, C10687d dVar) {
            return new C10683R0(snVar, t0, dVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$d */
    public interface C10687d {
    }

    public C10683R0(C11769sn snVar, C10765T0 t0, C10687d dVar) {
        this.f25557a = snVar;
        this.f25558b = t0;
        this.f25559c = dVar;
    }

    /* renamed from: a */
    public void mo62095a() {
        ((C11725rn) this.f25557a).mo63612a(this.f25560d);
        ((C11725rn) this.f25557a).mo63614a(this.f25560d, 90, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public void mo62096b() {
        ((C11725rn) this.f25557a).execute(this.f25561e);
    }

    /* renamed from: c */
    public void mo62097c() {
        ((C11725rn) this.f25557a).mo63612a(this.f25560d);
        ((C11725rn) this.f25557a).mo63612a(this.f25561e);
    }
}
