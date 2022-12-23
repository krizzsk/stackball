package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.k3 */
public class C11415k3 {

    /* renamed from: a */
    private final C10649Pm f27375a;

    /* renamed from: b */
    private Boolean f27376b;

    /* renamed from: c */
    private C11098c1 f27377c;

    /* renamed from: d */
    private C11126d1 f27378d;

    public C11415k3() {
        this(new C10649Pm());
    }

    /* renamed from: a */
    public synchronized C11098c1 mo63179a(Context context, C11696qn qnVar) {
        if (this.f27377c == null) {
            if (m29462a(context)) {
                this.f27377c = new C10613Oj(qnVar.mo63561b(), qnVar.mo63561b().mo63610a(), qnVar.mo63560a(), new C10974Z());
            } else {
                this.f27377c = new C11368j3(context, qnVar);
            }
        }
        return this.f27377c;
    }

    C11415k3(C10649Pm pm) {
        this.f27375a = pm;
    }

    /* renamed from: a */
    public synchronized C11126d1 mo63180a(Context context, C11098c1 c1Var) {
        if (this.f27378d == null) {
            if (m29462a(context)) {
                this.f27378d = new C10646Pj();
            } else {
                this.f27378d = new C11550n3(context, c1Var);
            }
        }
        return this.f27378d;
    }

    /* renamed from: a */
    private synchronized boolean m29462a(Context context) {
        if (this.f27376b == null) {
            this.f27376b = Boolean.valueOf(!this.f27375a.mo61939a(context));
        }
        return this.f27376b.booleanValue();
    }
}
