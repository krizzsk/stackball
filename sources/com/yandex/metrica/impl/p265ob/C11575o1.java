package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.o1 */
public class C11575o1 {

    /* renamed from: a */
    private final C10876W6 f27804a;

    /* renamed from: b */
    private final C11130d3 f27805b;

    /* renamed from: c */
    private final C10413K f27806c;

    /* renamed from: d */
    private final C10199E f27807d;

    /* renamed from: e */
    private final List<C10237F2> f27808e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11575o1(Context context, C11769sn snVar) {
        this(C10796U2.m27890a(21) ? new C10916X6(context) : new C10948Y6(), new C11130d3(context, snVar), new C10413K(context, snVar), new C10199E());
    }

    /* renamed from: a */
    public synchronized void mo63391a(C10237F2 f2) {
        this.f27808e.add(f2);
    }

    /* renamed from: b */
    public C10413K mo63392b() {
        return this.f27806c;
    }

    /* renamed from: c */
    public C10876W6 mo63393c() {
        return this.f27804a;
    }

    /* renamed from: d */
    public C11130d3 mo63394d() {
        return this.f27805b;
    }

    /* renamed from: e */
    public synchronized void mo63395e() {
        for (C10237F2 a : this.f27808e) {
            a.mo61207a();
        }
    }

    /* renamed from: f */
    public synchronized void mo63396f() {
        for (C10237F2 b : this.f27808e) {
            b.mo61209b();
        }
    }

    /* renamed from: a */
    public C10199E mo63390a() {
        return this.f27807d;
    }

    C11575o1(C10876W6 w6, C11130d3 d3Var, C10413K k, C10199E e) {
        ArrayList arrayList = new ArrayList();
        this.f27808e = arrayList;
        this.f27804a = w6;
        arrayList.add(w6);
        this.f27805b = d3Var;
        arrayList.add(d3Var);
        this.f27806c = k;
        arrayList.add(k);
        this.f27807d = e;
        arrayList.add(e);
    }
}
