package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Ua */
public class C10805Ua implements C11108cb {

    /* renamed from: a */
    private final C10348Hm f25909a;

    public C10805Ua(C10348Hm hm) {
        this.f25909a = hm;
    }

    /* renamed from: a */
    public long mo62351a(C10184D9 d9) {
        String b = ((C10197Dm) this.f25909a).mo61204b();
        return d9.mo61443a(new C11984ye("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_" + b, (String) null).mo64145a(), Long.MAX_VALUE);
    }

    /* renamed from: a */
    public void mo62352a(C10184D9 d9, long j) {
        String b = ((C10197Dm) this.f25909a).mo61204b();
        C10184D9 d92 = (C10184D9) d9.mo61448b(new C11984ye("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_" + b, (String) null).mo64145a(), j);
    }
}
