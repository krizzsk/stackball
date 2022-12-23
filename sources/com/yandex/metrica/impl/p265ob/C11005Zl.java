package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Zl */
public class C11005Zl implements C10410Jl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12036zl f26476a;

    /* renamed from: b */
    private final C11826ul f26477b;

    /* renamed from: c */
    private final C10248F9 f26478c;

    /* renamed from: d */
    private final C11052al f26479d;

    /* renamed from: e */
    private final C11569nl f26480e;

    /* renamed from: f */
    private Activity f26481f;

    /* renamed from: g */
    private C10378Il f26482g;

    /* renamed from: com.yandex.metrica.impl.ob.Zl$a */
    class C11006a implements C10820Um<Activity> {
        C11006a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            C11005Zl.this.f26476a.mo64202a((Activity) obj);
        }
    }

    public C11005Zl(Context context, C10248F9 f9, C11406jm jmVar, C11769sn snVar, C10378Il il) {
        this(context, f9, jmVar, snVar, il, new C11052al(il));
    }

    /* renamed from: b */
    public synchronized void mo62599b(Activity activity) {
        this.f26481f = activity;
        this.f26476a.mo64202a(activity);
    }

    private C11005Zl(Context context, C10248F9 f9, C11406jm jmVar, C11769sn snVar, C10378Il il, C11052al alVar) {
        this(f9, jmVar, il, alVar, new C10468Lk(1, f9), new C11292gm(snVar, new C10528Mk(f9), alVar), new C10377Ik(context));
    }

    /* renamed from: a */
    public synchronized void mo62597a(Activity activity) {
        this.f26480e.mo63389a(activity);
        this.f26481f = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C11005Zl(com.yandex.metrica.impl.p265ob.C10248F9 r10, com.yandex.metrica.impl.p265ob.C11406jm r11, com.yandex.metrica.impl.p265ob.C10378Il r12, com.yandex.metrica.impl.p265ob.C11052al r13, com.yandex.metrica.impl.p265ob.C10468Lk r14, com.yandex.metrica.impl.p265ob.C11292gm r15, com.yandex.metrica.impl.p265ob.C10377Ik r16) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.zl r6 = new com.yandex.metrica.impl.ob.zl
            r0 = r6
            r1 = r12
            r2 = r14
            r3 = r10
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.ul r7 = new com.yandex.metrica.impl.ob.ul
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.Nk r8 = new com.yandex.metrica.impl.ob.Nk
            r8.<init>()
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11005Zl.<init>(com.yandex.metrica.impl.ob.F9, com.yandex.metrica.impl.ob.jm, com.yandex.metrica.impl.ob.Il, com.yandex.metrica.impl.ob.al, com.yandex.metrica.impl.ob.Lk, com.yandex.metrica.impl.ob.gm, com.yandex.metrica.impl.ob.Ik):void");
    }

    C11005Zl(C10248F9 f9, C10378Il il, C11406jm jmVar, C11292gm gmVar, C11052al alVar, C12036zl zlVar, C11826ul ulVar, C10578Nk nk) {
        this.f26478c = f9;
        this.f26482g = il;
        this.f26479d = alVar;
        this.f26476a = zlVar;
        this.f26477b = ulVar;
        C11569nl nlVar = new C11569nl(new C11006a(), jmVar);
        this.f26480e = nlVar;
        gmVar.mo62976a(nk, nlVar);
    }

    /* renamed from: a */
    public synchronized void mo62598a(C10615Ol ol, boolean z) {
        this.f26477b.mo63812a(this.f26481f, ol, z);
        this.f26478c.mo61276c(true);
    }

    /* renamed from: a */
    public synchronized void mo61633a(C10378Il il) {
        if (!il.equals(this.f26482g)) {
            this.f26479d.mo62652a(il);
            this.f26477b.mo63813a(il);
            this.f26476a.mo64203a(il);
            this.f26482g = il;
            Activity activity = this.f26481f;
            if (activity != null) {
                this.f26476a.mo64204b(activity);
            }
        }
    }
}
