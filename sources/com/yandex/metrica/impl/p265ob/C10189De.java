package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10135Be;
import com.yandex.metrica.impl.p265ob.C11283gg;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.De */
public class C10189De implements C11194ea<C10135Be, C11283gg> {

    /* renamed from: a */
    private final C10521Me f24495a;

    /* renamed from: b */
    private final C12027ze f24496b;

    public C10189De() {
        this(new C10521Me(), new C12027ze());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10459Le le;
        C11283gg ggVar = (C11283gg) obj;
        ArrayList arrayList = new ArrayList(ggVar.f26987c.length);
        for (C11283gg.C11285b a : ggVar.f26987c) {
            arrayList.add(this.f24496b.mo61049a(a));
        }
        C11283gg.C11284a aVar = ggVar.f26986b;
        if (aVar == null) {
            le = this.f24495a.mo61049a(new C11283gg.C11284a());
        } else {
            le = this.f24495a.mo61049a(aVar);
        }
        return new C10135Be(le, arrayList);
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C10135Be be = (C10135Be) obj;
        C11283gg ggVar = new C11283gg();
        ggVar.f26986b = this.f24495a.mo61050b(be.f24401a);
        ggVar.f26987c = new C11283gg.C11285b[be.f24402b.size()];
        int i = 0;
        for (C10135Be.C10136a a : be.f24402b) {
            ggVar.f26987c[i] = this.f24496b.mo61050b(a);
            i++;
        }
        return ggVar;
    }

    C10189De(C10521Me me, C12027ze zeVar) {
        this.f24495a = me;
        this.f24496b = zeVar;
    }
}
