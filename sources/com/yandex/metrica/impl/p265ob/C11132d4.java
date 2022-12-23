package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10210E4;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.impl.ob.d4 */
public class C11132d4<CU extends C10210E4> {

    /* renamed from: a */
    private final List<CU> f26684a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo62742a(CU cu) {
        this.f26684a.add(cu);
    }

    /* renamed from: b */
    public void mo62743b(CU cu) {
        this.f26684a.remove(cu);
    }

    /* renamed from: a */
    public List<CU> mo62741a() {
        return this.f26684a;
    }
}
