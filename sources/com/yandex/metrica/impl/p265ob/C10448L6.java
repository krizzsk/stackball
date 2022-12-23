package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10539N6;

/* renamed from: com.yandex.metrica.impl.ob.L6 */
public class C10448L6 {

    /* renamed from: a */
    private final C11769sn f25088a;

    /* renamed from: b */
    private final C10330H6 f25089b;

    /* renamed from: com.yandex.metrica.impl.ob.L6$a */
    class C10449a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10450b f25090a;

        C10449a(C10448L6 l6, C10450b bVar) {
            this.f25090a = bVar;
        }

        public void run() {
            try {
                C10539N6.C10540a aVar = (C10539N6.C10540a) this.f25090a;
                C10539N6.this.f25236c.mo61779a();
                C10539N6 n6 = C10539N6.this;
                C10589O6 o6 = aVar.f25239a;
                n6.getClass();
                if (o6 != null) {
                    o6.mo60962a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.L6$b */
    public interface C10450b {
    }

    public C10448L6(C11769sn snVar, C10330H6 h6) {
        this.f25088a = snVar;
        this.f25089b = h6;
    }

    /* renamed from: a */
    public void mo61705a(long j, C10450b bVar) {
        ((C11725rn) this.f25088a).mo63613a(new C10449a(this, bVar), j);
    }

    /* renamed from: a */
    public void mo61706a(long j, boolean z) {
        this.f25089b.mo61171a(j, z);
    }

    /* renamed from: a */
    public void mo61704a() {
        this.f25089b.mo61170a();
    }
}
