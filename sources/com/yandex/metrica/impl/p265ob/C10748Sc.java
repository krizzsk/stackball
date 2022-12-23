package com.yandex.metrica.impl.p265ob;

import com.appsflyer.ServerParameters;

/* renamed from: com.yandex.metrica.impl.ob.Sc */
public class C10748Sc extends C11910wc {

    /* renamed from: com.yandex.metrica.impl.ob.Sc$a */
    class C10749a implements C10602Oc {
        C10749a() {
        }

        /* renamed from: a */
        public long mo61727a() {
            return C10748Sc.this.f28641a.mo61518e(0);
        }

        /* renamed from: a */
        public void mo61728a(long j) {
            C10748Sc.this.f28641a.mo61528j(j);
        }
    }

    public C10748Sc(C11425kd kdVar, C10364I9 i9) {
        this(kdVar, i9, new C11012a2());
    }

    /* renamed from: a */
    public C10602Oc mo61793a() {
        return new C10749a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo61795b() {
        return ServerParameters.NETWORK;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo61796c() {
        return "lbs";
    }

    C10748Sc(C11425kd kdVar, C10364I9 i9, C11012a2 a2Var) {
        super(kdVar, i9, a2Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11281ge mo61794a(C11241fe feVar) {
        return this.f28643c.mo62629a(feVar);
    }
}
