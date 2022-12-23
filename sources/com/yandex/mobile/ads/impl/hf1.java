package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12735ch;
import com.yandex.mobile.ads.impl.s00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class hf1 {

    /* renamed from: a */
    private final List<C14687tm> f34387a;

    /* renamed from: b */
    private final f50<s00.C14554d> f34388b;

    /* renamed from: c */
    private final j50 f34389c;

    /* renamed from: d */
    private final C12985en f34390d;

    /* renamed from: e */
    private final th1 f34391e;

    /* renamed from: f */
    private final uh1 f34392f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Function1<sh1, Unit> f34393g = new C13317a(this);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final List<sh1> f34394h = new ArrayList();

    /* renamed from: i */
    private C15055wl f34395i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public s00.C14554d f34396j;

    /* renamed from: k */
    private boolean f34397k;

    /* renamed from: l */
    private d10 f34398l;

    /* renamed from: com.yandex.mobile.ads.impl.hf1$a */
    static final class C13317a extends Lambda implements Function1<sh1, Unit> {

        /* renamed from: b */
        final /* synthetic */ hf1 f34399b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13317a(hf1 hf1) {
            super(1);
            this.f34399b = hf1;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((sh1) obj, "$noName_0");
            hf1.m36961c(this.f34399b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hf1$b */
    static final class C13318b extends Lambda implements Function1<s00.C14554d, Unit> {

        /* renamed from: b */
        final /* synthetic */ hf1 f34400b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13318b(hf1 hf1) {
            super(1);
            this.f34400b = hf1;
        }

        public Object invoke(Object obj) {
            s00.C14554d dVar = (s00.C14554d) obj;
            Intrinsics.checkNotNullParameter(dVar, "it");
            this.f34400b.f34396j = dVar;
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hf1$c */
    static final class C13319c extends Lambda implements Function1<sh1, Unit> {

        /* renamed from: b */
        final /* synthetic */ hf1 f34401b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13319c(hf1 hf1) {
            super(1);
            this.f34401b = hf1;
        }

        public Object invoke(Object obj) {
            sh1 sh1 = (sh1) obj;
            Intrinsics.checkNotNullParameter(sh1, "it");
            sh1.mo69976a((Function1<? super sh1, Unit>) this.f34401b.f34393g);
            this.f34401b.f34394h.add(sh1);
            hf1.m36961c(this.f34401b);
            return Unit.INSTANCE;
        }
    }

    public hf1(List<? extends C12735ch> list, List<? extends C14687tm> list2, f50<s00.C14554d> f50, j50 j50, C12985en enVar, th1 th1, uh1 uh1) {
        Intrinsics.checkNotNullParameter(list, "conditionParts");
        Intrinsics.checkNotNullParameter(list2, "actions");
        Intrinsics.checkNotNullParameter(f50, "mode");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        Intrinsics.checkNotNullParameter(enVar, "divActionHandler");
        Intrinsics.checkNotNullParameter(th1, "variableController");
        Intrinsics.checkNotNullParameter(uh1, "declarationNotifier");
        this.f34387a = list2;
        this.f34388b = f50;
        this.f34389c = j50;
        this.f34390d = enVar;
        this.f34391e = th1;
        this.f34392f = uh1;
        this.f34395i = f50.mo66925b(j50, new C13318b(this));
        this.f34396j = s00.C14554d.ON_CONDITION;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (next instanceof C12735ch.C12738c) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m36959a(((C12735ch.C12738c) it.next()).mo66298a());
        }
    }

    /* renamed from: c */
    public static final void m36961c(hf1 hf1) {
        d10 d10 = hf1.f34398l;
        if (d10 != null) {
            boolean z = hf1.f34397k;
            boolean z2 = true;
            hf1.f34397k = true;
            if (hf1.f34396j == s00.C14554d.ON_CONDITION && z) {
                z2 = false;
            }
            if (z2) {
                for (C14687tm a : hf1.f34387a) {
                    hf1.f34390d.mo66849a(a, d10);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67547a(d10 d10) {
        this.f34398l = d10;
        this.f34395i.close();
        if (this.f34398l == null) {
            for (sh1 b : this.f34394h) {
                b.mo69979b((Function1<? super sh1, Unit>) this.f34393g);
            }
            return;
        }
        for (sh1 a : this.f34394h) {
            a.mo69976a((Function1<? super sh1, Unit>) this.f34393g);
        }
        this.f34395i = this.f34388b.mo66925b(this.f34389c, new if1(this));
    }

    /* renamed from: a */
    private final void m36959a(String str) {
        sh1 a = this.f34391e.mo70185a(str);
        if (a != null) {
            a.mo69976a((Function1<? super sh1, Unit>) this.f34393g);
            this.f34394h.add(a);
            return;
        }
        this.f34392f.mo65496a(str, new C13319c(this));
    }
}
