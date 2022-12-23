package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.md */
public class C11526md<T> implements C10924Xc<T> {

    /* renamed from: a */
    private final C11490ld<T> f27728a;

    /* renamed from: b */
    private final C11746sc<T> f27729b;

    /* renamed from: c */
    private final C11598od f27730c;

    /* renamed from: d */
    private final C11942xc<T> f27731d;

    /* renamed from: e */
    private final Runnable f27732e = new C11527a();

    /* renamed from: f */
    private T f27733f;

    /* renamed from: com.yandex.metrica.impl.ob.md$a */
    class C11527a implements Runnable {
        C11527a() {
        }

        public void run() {
            C11526md.this.mo63323b();
        }
    }

    public C11526md(C11490ld<T> ldVar, C11746sc<T> scVar, C11598od odVar, C11942xc<T> xcVar, T t) {
        this.f27728a = ldVar;
        this.f27729b = scVar;
        this.f27730c = odVar;
        this.f27731d = xcVar;
        this.f27733f = t;
    }

    /* renamed from: a */
    public void mo63321a() {
        T t = this.f27733f;
        if (t != null && this.f27729b.mo61385a(t) && this.f27728a.mo61108a(this.f27733f)) {
            this.f27730c.mo63431a();
            this.f27731d.mo61536a(this.f27732e, this.f27733f);
        }
    }

    /* renamed from: b */
    public void mo63323b() {
        this.f27731d.mo61105a();
        this.f27728a.mo61107a();
    }

    /* renamed from: c */
    public void mo63324c() {
        T t = this.f27733f;
        if (t != null && this.f27729b.mo61386b(t)) {
            this.f27728a.mo61109b();
        }
        mo63321a();
    }

    /* renamed from: a */
    public void mo63322a(T t) {
        if (!C10796U2.m27892a((Object) this.f27733f, (Object) t)) {
            this.f27733f = t;
            mo63323b();
            mo63321a();
        }
    }
}
