package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.impl.ob.Og */
public final class C10606Og {

    /* renamed from: a */
    private final Lazy f25342a = LazyKt.lazy(new C10609c(this));

    /* renamed from: b */
    private final Lazy f25343b = LazyKt.lazy(new C10608b(this));

    /* renamed from: c */
    private final Lazy f25344c = LazyKt.lazy(new C10610d(this));

    /* renamed from: d */
    private final List<C10255Fg> f25345d = new ArrayList();

    /* renamed from: e */
    private final C10813Ug f25346e;

    /* renamed from: f */
    private final C10962Yg f25347f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10371Ig f25348g;

    /* renamed from: h */
    private final C10998Zg f25349h;

    /* renamed from: com.yandex.metrica.impl.ob.Og$a */
    private interface C10607a {
        /* renamed from: a */
        void mo61862a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$b */
    static final class C10608b extends Lambda implements Function0<C10642Pg> {

        /* renamed from: a */
        final /* synthetic */ C10606Og f25350a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10608b(C10606Og og) {
            super(0);
            this.f25350a = og;
        }

        public Object invoke() {
            return new C10642Pg(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$c */
    static final class C10609c extends Lambda implements Function0<C10672Qg> {

        /* renamed from: a */
        final /* synthetic */ C10606Og f25351a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10609c(C10606Og og) {
            super(0);
            this.f25351a = og;
        }

        public Object invoke() {
            return new C10672Qg(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$d */
    static final class C10610d extends Lambda implements Function0<C10724Rg> {

        /* renamed from: a */
        final /* synthetic */ C10606Og f25352a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10610d(C10606Og og) {
            super(0);
            this.f25352a = og;
        }

        public Object invoke() {
            return new C10724Rg(this);
        }
    }

    public C10606Og(C10813Ug ug, C10962Yg yg, C10371Ig ig, C10998Zg zg) {
        this.f25346e = ug;
        this.f25347f = yg;
        this.f25348g = ig;
        this.f25349h = zg;
    }

    /* renamed from: b */
    public static final C10607a m27137b(C10606Og og) {
        return (C10607a) og.f25343b.getValue();
    }

    /* renamed from: c */
    public static final C10607a m27138c(C10606Og og) {
        return (C10607a) og.f25342a.getValue();
    }

    /* renamed from: a */
    public static final void m27136a(C10606Og og, C10255Fg fg, C10607a aVar) {
        og.f25345d.add(fg);
        if (og.f25349h.mo62587a(fg)) {
            og.f25346e.mo62360a(fg);
        } else {
            aVar.mo61862a();
        }
    }

    /* renamed from: b */
    public final void mo61861b() {
        this.f25347f.mo62548a((C10928Xg) this.f25344c.getValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m27134a() {
        List<C10255Fg> list = this.f25345d;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (this.f25349h.mo62588b((C10255Fg) next)) {
                arrayList.add(next);
            }
        }
        this.f25346e.mo62360a(this.f25349h.mo62586a((List<C10255Fg>) CollectionsKt.filterNotNull(arrayList)));
    }
}
