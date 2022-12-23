package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wb */
public class C11909wb implements C11488lb<C10400Jb> {

    /* renamed from: a */
    private final C11628pb f28639a;

    /* renamed from: b */
    private final C11745sb f28640b;

    public C11909wb() {
        this(new C11628pb(), new C11745sb());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C11786tb<C10705Rf.C10719m, C10265Fn> tbVar;
        C10400Jb jb = (C10400Jb) obj;
        C10705Rf rf = new C10705Rf();
        rf.f25600b = 3;
        rf.f25603e = new C10705Rf.C10722p();
        C11786tb<C10705Rf.C10717k, C10265Fn> a = this.f28639a.mo61050b(jb.f25017b);
        rf.f25603e.f25651b = (C10705Rf.C10717k) a.f28287a;
        C10308Gb gb = jb.f25018c;
        if (gb != null) {
            tbVar = this.f28640b.mo61050b(gb);
            rf.f25603e.f25652c = (C10705Rf.C10719m) tbVar.f28287a;
        } else {
            tbVar = null;
        }
        return Collections.singletonList(new C11786tb(rf, C10233En.m26217a(a, tbVar)));
    }

    C11909wb(C11628pb pbVar, C11745sb sbVar) {
        this.f28639a = pbVar;
        this.f28640b = sbVar;
    }
}
