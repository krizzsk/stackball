package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p020b.C1223a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.k */
public class C1306k {

    /* renamed from: a */
    private final List<C1307a> f2549a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.mediation.k$a */
    public interface C1307a {
        /* renamed from: a */
        void mo12497a(C1223a aVar);
    }

    /* renamed from: a */
    public void mo12494a(C1223a aVar) {
        Iterator it = new ArrayList(this.f2549a).iterator();
        while (it.hasNext()) {
            ((C1307a) it.next()).mo12497a(aVar);
        }
    }

    /* renamed from: a */
    public void mo12495a(C1307a aVar) {
        this.f2549a.add(aVar);
    }

    /* renamed from: b */
    public void mo12496b(C1307a aVar) {
        this.f2549a.remove(aVar);
    }
}
