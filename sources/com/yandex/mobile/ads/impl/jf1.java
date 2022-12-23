package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12735ch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class jf1 {

    /* renamed from: a */
    private final th1 f35277a;

    /* renamed from: b */
    private final j50 f35278b;

    /* renamed from: c */
    private final C12985en f35279c;

    /* renamed from: d */
    private final uh1 f35280d;

    /* renamed from: e */
    private final List<hf1> f35281e = new ArrayList();

    public jf1(List<? extends s00> list, th1 th1, j50 j50, C12985en enVar, uh1 uh1) {
        Intrinsics.checkNotNullParameter(th1, "variableController");
        Intrinsics.checkNotNullParameter(j50, "expressionResolver");
        Intrinsics.checkNotNullParameter(enVar, "divActionHandler");
        Intrinsics.checkNotNullParameter(uh1, "declarationNotifier");
        this.f35277a = th1;
        this.f35278b = j50;
        this.f35279c = enVar;
        this.f35280d = uh1;
        if (list != null) {
            for (s00 s00 : list) {
                int i = C12735ch.f31922a;
                List<C12735ch> a = C12735ch.C12736a.f31923a.mo66294a(s00.f39781b);
                if (m37784a((List<? extends C12735ch>) a) == null) {
                    this.f35281e.add(new hf1(a, s00.f39780a, s00.f39782c, this.f35278b, this.f35279c, this.f35277a, this.f35280d));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67987a(d10 d10) {
        for (hf1 a : this.f35281e) {
            a.mo67547a(d10);
        }
    }

    /* renamed from: a */
    private final Throwable m37784a(List<? extends C12735ch> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C12735ch) t) instanceof C12735ch.C12738c) {
                break;
            }
        }
        if (t == null) {
            return new RuntimeException("No variables defined!");
        }
        return null;
    }
}
