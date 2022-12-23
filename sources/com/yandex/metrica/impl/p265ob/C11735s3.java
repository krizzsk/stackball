package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.billing_interface.C10068a;
import com.yandex.metrica.impl.p265ob.C11113cg;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.s3 */
public class C11735s3 implements C11194ea<C11702r3, C11113cg> {

    /* renamed from: a */
    private final C11804u3 f28119a;

    public C11735s3() {
        this(new C11804u3());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11113cg cgVar = (C11113cg) obj;
        ArrayList arrayList = new ArrayList(cgVar.f26652b.length);
        for (C11113cg.C11114a a : cgVar.f26652b) {
            arrayList.add(this.f28119a.mo61049a(a));
        }
        return new C11702r3(arrayList, cgVar.f26653c);
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C11702r3 r3Var = (C11702r3) obj;
        C11113cg cgVar = new C11113cg();
        cgVar.f26652b = new C11113cg.C11114a[r3Var.f28045a.size()];
        int i = 0;
        for (C10068a a : r3Var.f28045a) {
            cgVar.f26652b[i] = this.f28119a.mo61050b(a);
            i++;
        }
        cgVar.f26653c = r3Var.f28046b;
        return cgVar;
    }

    C11735s3(C11804u3 u3Var) {
        this.f28119a = u3Var;
    }
}
