package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.J6 */
public class C10393J6 {

    /* renamed from: a */
    private final C11769sn f24966a;

    /* renamed from: com.yandex.metrica.impl.ob.J6$a */
    public static class C10394a implements Runnable {

        /* renamed from: a */
        private final C10626P6 f24967a;

        /* renamed from: b */
        private final Bundle f24968b;

        /* renamed from: c */
        private final C10589O6 f24969c;

        public C10394a(C10626P6 p6, Bundle bundle, C10589O6 o6) {
            this.f24967a = p6;
            this.f24968b = bundle;
            this.f24969c = o6;
        }

        public void run() {
            try {
                this.f24967a.mo61911a(this.f24968b, this.f24969c);
            } catch (Throwable unused) {
                C10589O6 o6 = this.f24969c;
                if (o6 != null) {
                    o6.mo60962a();
                }
            }
        }
    }

    public C10393J6() {
        this(C10619P0.m27164i().mo61891s().mo64205a());
    }

    /* renamed from: a */
    public void mo61600a(C10626P6 p6, Bundle bundle) {
        ((C11725rn) this.f24966a).execute(new C10394a(p6, bundle, (C10589O6) null));
    }

    C10393J6(C11769sn snVar) {
        this.f24966a = snVar;
    }

    /* renamed from: a */
    public void mo61601a(C10626P6 p6, Bundle bundle, C10589O6 o6) {
        ((C11725rn) this.f24966a).execute(new C10394a(p6, bundle, o6));
    }

    /* renamed from: a */
    public C11769sn mo61599a() {
        return this.f24966a;
    }
}
