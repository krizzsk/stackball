package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qm */
public class C11694qm<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f28029a;

    /* renamed from: b */
    private final C11769sn f28030b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<C10943Y1<T>> f28031c = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.qm$a */
    class C11695a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10943Y1 f28032a;

        C11695a(C10943Y1 y1) {
            this.f28032a = y1;
        }

        public void run() {
            synchronized (C11694qm.this) {
                Object a = C11694qm.this.f28029a;
                if (a == null) {
                    C11694qm.this.f28031c.add(this.f28032a);
                } else {
                    this.f28032a.mo61124b(a);
                }
            }
        }
    }

    public C11694qm(C11769sn snVar) {
        this.f28030b = snVar;
    }

    /* renamed from: a */
    public void mo63557a(C10943Y1<T> y1) {
        ((C11725rn) this.f28030b).execute(new C11695a(y1));
    }

    /* renamed from: a */
    public synchronized void mo63558a(T t) {
        this.f28029a = t;
        for (C10943Y1<T> b : this.f28031c) {
            b.mo61124b(t);
        }
        this.f28031c.clear();
    }
}
