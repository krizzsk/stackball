package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.j */
class C0733j implements C0685f0 {

    /* renamed from: com.adcolony.sdk.j$a */
    class C0734a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1128a;

        /* renamed from: b */
        final /* synthetic */ String f1129b;

        C0734a(String str, String str2) {
            this.f1128a = str;
            this.f1129b = str2;
        }

        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = C0578a.m143c().mo9610n().get(this.f1128a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f1128a, this.f1129b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    C0733j() {
        C0578a.m139a("CustomMessage.controller_send", (C0685f0) this);
    }

    /* renamed from: a */
    public void mo9426a(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        C0849u0.m931b((Runnable) new C0734a(C0894y.m1169h(b, "type"), C0894y.m1169h(b, "message")));
    }
}
