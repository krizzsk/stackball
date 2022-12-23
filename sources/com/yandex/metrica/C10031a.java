package com.yandex.metrica;

import com.yandex.metrica.impl.p265ob.C10941Y;
import com.yandex.metrica.impl.p265ob.C11725rn;
import com.yandex.metrica.impl.p265ob.C11769sn;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.a */
public class C10031a {

    /* renamed from: a */
    private final C11769sn f24069a;

    /* renamed from: b */
    private final Set<C10033b> f24070b;

    /* renamed from: com.yandex.metrica.a$a */
    public interface C10032a {
        /* renamed from: a */
        void mo60928a();

        /* renamed from: b */
        void mo60929b();
    }

    /* renamed from: com.yandex.metrica.a$b */
    private class C10033b {

        /* renamed from: a */
        final C11769sn f24071a;

        /* renamed from: b */
        final C10032a f24072b;

        /* renamed from: c */
        private final long f24073c;

        /* renamed from: d */
        private boolean f24074d = true;

        /* renamed from: e */
        private final Runnable f24075e = new C10034a();

        /* renamed from: com.yandex.metrica.a$b$a */
        class C10034a implements Runnable {
            C10034a() {
            }

            public void run() {
                C10033b.this.f24072b.mo60928a();
            }
        }

        C10033b(C10031a aVar, C10032a aVar2, C11769sn snVar, long j) {
            this.f24072b = aVar2;
            this.f24071a = snVar;
            this.f24073c = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo60930a() {
            if (!this.f24074d) {
                this.f24074d = true;
                ((C11725rn) this.f24071a).mo63613a(this.f24075e, this.f24073c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo60931b() {
            if (this.f24074d) {
                this.f24074d = false;
                ((C11725rn) this.f24071a).mo63612a(this.f24075e);
                this.f24072b.mo60929b();
            }
        }
    }

    public C10031a(long j) {
        this(j, C10941Y.m28234g().mo62500d().mo63561b());
    }

    /* renamed from: a */
    public synchronized void mo60925a() {
        for (C10033b a : this.f24070b) {
            a.mo60930a();
        }
    }

    /* renamed from: b */
    public synchronized void mo60927b() {
        for (C10033b b : this.f24070b) {
            b.mo60931b();
        }
    }

    C10031a(long j, C11769sn snVar) {
        this.f24070b = new HashSet();
        this.f24069a = snVar;
    }

    /* renamed from: a */
    public synchronized void mo60926a(C10032a aVar, long j) {
        this.f24070b.add(new C10033b(this, aVar, this.f24069a, j));
    }
}
