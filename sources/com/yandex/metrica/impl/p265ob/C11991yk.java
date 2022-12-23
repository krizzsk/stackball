package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.yk */
public class C11991yk extends C10729Rj {

    /* renamed from: a */
    private int f28809a;

    /* renamed from: b */
    private C10729Rj f28810b;

    public C11991yk(Context context, C11769sn snVar) {
        this(context.getApplicationContext(), new C10898Wn(), snVar);
    }

    /* renamed from: a */
    public synchronized void mo62201a() {
        int i = this.f28809a + 1;
        this.f28809a = i;
        if (i == 1) {
            this.f28810b.mo62201a();
        }
    }

    /* renamed from: b */
    public synchronized void mo62206b() {
        int i = this.f28809a - 1;
        this.f28809a = i;
        if (i == 0) {
            this.f28810b.mo62206b();
        }
    }

    C11991yk(Context context, C10898Wn wn, C11769sn snVar) {
        if (wn.mo62461a(context, "android.hardware.telephony")) {
            this.f28810b = new C11400jk(context, snVar);
        } else {
            this.f28810b = new C11505lk();
        }
    }

    /* renamed from: a */
    public synchronized void mo62202a(C10143Bk bk) {
        this.f28810b.mo62202a(bk);
    }

    /* renamed from: a */
    public synchronized void mo62204a(C10891Wj wj) {
        this.f28810b.mo62204a(wj);
    }

    /* renamed from: a */
    public void mo62205a(boolean z) {
        this.f28810b.mo62205a(z);
    }

    /* renamed from: a */
    public void mo62203a(C10675Qi qi) {
        this.f28810b.mo62203a(qi);
    }

    /* renamed from: a */
    public void mo62378a(C10807Uc uc) {
        this.f28810b.mo62378a(uc);
    }
}
