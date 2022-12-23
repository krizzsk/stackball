package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.m3 */
class C11515m3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C11479l3 f27712a;

    /* renamed from: com.yandex.metrica.impl.ob.m3$a */
    class C11516a implements Runnable {
        C11516a() {
        }

        public void run() {
            C10611Oh.m27143a(C11515m3.this.f27712a.f27635a);
        }
    }

    C11515m3(C11479l3 l3Var) {
        this.f27712a = l3Var;
    }

    public void run() {
        ((C11725rn) this.f27712a.f27639e.mo63560a()).execute(new C11516a());
    }
}
