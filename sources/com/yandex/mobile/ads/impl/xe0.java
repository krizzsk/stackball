package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class xe0 {

    /* renamed from: a */
    private final ue0 f42544a;

    /* renamed from: com.yandex.mobile.ads.impl.xe0$b */
    public interface C15168b {
    }

    /* renamed from: com.yandex.mobile.ads.impl.xe0$c */
    private static final class C15169c implements r41<og0> {

        /* renamed from: a */
        private final AtomicInteger f42545a;

        /* renamed from: b */
        private final C15168b f42546b;

        /* renamed from: c */
        private final List<og0> f42547c;

        /* renamed from: a */
        public void mo66590a(Object obj) {
            this.f42547c.add((og0) obj);
            if (this.f42545a.decrementAndGet() == 0) {
                ((nf0) this.f42546b).mo69026a(this.f42547c);
            }
        }

        private C15169c(int i, C15168b bVar) {
            this.f42545a = new AtomicInteger(i);
            this.f42546b = bVar;
            this.f42547c = new ArrayList();
        }

        /* renamed from: a */
        public void mo66589a(wj1 wj1) {
            if (this.f42545a.decrementAndGet() == 0) {
                ((nf0) this.f42546b).mo69026a(this.f42547c);
            }
        }
    }

    public xe0(hk1 hk1) {
        this.f42544a = new ue0(hk1);
    }

    /* renamed from: a */
    public void mo70894a(Context context, List<C12563b1> list, C15168b bVar) {
        C15169c cVar = new C15169c(list.size(), bVar);
        for (C12563b1 a : list) {
            this.f42544a.mo70342a(context, a, cVar);
        }
    }
}
