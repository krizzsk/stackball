package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ua */
public class C11812ua implements Object<C10221Ed, C11428kg.C11462y> {

    /* renamed from: a */
    private final C11678qa f28373a;

    public C11812ua() {
        this(new C11678qa());
    }

    C11812ua(C11678qa qaVar) {
        this.f28373a = qaVar;
    }

    /* renamed from: a */
    public C11428kg.C11462y mo63780b(C10221Ed ed) {
        C11428kg.C11462y.C11463a[] aVarArr;
        C11428kg.C11462y yVar = new C11428kg.C11462y();
        yVar.f27592b = ed.f24584a;
        yVar.f27593c = ed.f24585b;
        List<C10547Nc> list = ed.f24586c;
        if (list == null) {
            aVarArr = new C11428kg.C11462y.C11463a[0];
        } else {
            aVarArr = this.f28373a.mo63534b(list);
        }
        yVar.f27594d = aVarArr;
        return yVar;
    }

    /* renamed from: a */
    public C10221Ed mo63779a(C11428kg.C11462y yVar) {
        List<C10547Nc> list;
        long j = yVar.f27592b;
        boolean z = yVar.f27593c;
        if (C10796U2.m27894a((T[]) yVar.f27594d)) {
            list = null;
        } else {
            list = this.f28373a.mo63531a(yVar.f27594d);
        }
        return new C10221Ed(j, z, list);
    }
}
