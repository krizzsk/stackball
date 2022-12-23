package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.jt0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

class bu0 {

    /* renamed from: a */
    private final Object f31581a = new Object();

    /* renamed from: b */
    private final yt0 f31582b;

    /* renamed from: c */
    private final C15230y2 f31583c;

    /* renamed from: d */
    private final ou0 f31584d;

    /* renamed from: com.yandex.mobile.ads.impl.bu0$a */
    interface C12657a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.bu0$b */
    private static class C12658b implements vl1 {

        /* renamed from: a */
        private final AtomicInteger f31585a;

        /* renamed from: b */
        private final C15230y2 f31586b;

        /* renamed from: c */
        private final C12657a f31587c;

        public C12658b(C15230y2 y2Var, int i, C12657a aVar) {
            this.f31585a = new AtomicInteger(i);
            this.f31586b = y2Var;
            this.f31587c = aVar;
        }

        /* renamed from: a */
        public void mo66121a() {
            if (this.f31585a.decrementAndGet() == 0) {
                this.f31586b.mo70965a(C15139x2.VIDEO_CACHING);
                ((jt0.C13587b) this.f31587c).mo68094d();
            }
        }
    }

    bu0(Context context, C15230y2 y2Var) {
        this.f31582b = new yt0(context);
        this.f31583c = y2Var;
        this.f31584d = new ou0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66120a(vq0 vq0, C12657a aVar) {
        synchronized (this.f31581a) {
            boolean G = vq0.mo70514b().mo64416G();
            Set<String> a = this.f31584d.mo69269a(vq0.mo70515c());
            if (G) {
                HashSet hashSet = (HashSet) a;
                if (hashSet.size() != 0) {
                    C12658b bVar = new C12658b(this.f31583c, hashSet.size(), aVar);
                    this.f31583c.mo70970b(C15139x2.VIDEO_CACHING);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        this.f31582b.mo71127a((String) it.next(), bVar);
                    }
                }
            }
            ((jt0.C13587b) aVar).mo68094d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66119a() {
        synchronized (this.f31581a) {
            this.f31582b.mo71126a();
        }
    }
}
