package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10893Wl;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Jk */
class C10409Jk {

    /* renamed from: a */
    private final List<Object> f25029a;

    C10409Jk(List<Object> list) {
        this.f25029a = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10893Wl.C10895b mo61632a(String str) {
        Iterator<Object> it = this.f25029a.iterator();
        while (it.hasNext()) {
            C11324hm hmVar = (C11324hm) it.next();
            if (hmVar.mo61157a(str)) {
                return hmVar.mo61156a();
            }
        }
        return null;
    }
}
