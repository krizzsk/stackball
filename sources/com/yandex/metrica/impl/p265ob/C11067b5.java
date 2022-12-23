package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.b5 */
public class C11067b5 extends C11231f5<C11305h5> {

    /* renamed from: a */
    private final C10588O5 f26582a;

    public C11067b5(C10978Z3 z3) {
        this.f26582a = new C10588O5(z3);
    }

    /* renamed from: a */
    public C11102c5<C11305h5> mo62686a(int i) {
        ArrayList arrayList = new ArrayList();
        int ordinal = C11413k1.m29450a(i).ordinal();
        if (ordinal == 16) {
            arrayList.add(this.f26582a.mo61852a());
        } else if (ordinal == 24) {
            arrayList.add(this.f26582a.mo61853b());
        } else if (ordinal == 46) {
            arrayList.add(this.f26582a.mo61854c());
        }
        return new C11102c5<>(arrayList);
    }
}
