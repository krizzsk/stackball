package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bu0;
import com.yandex.mobile.ads.impl.et0;
import com.yandex.mobile.ads.impl.pt0;
import java.util.concurrent.atomic.AtomicInteger;

class jt0 {

    /* renamed from: a */
    private final et0 f35634a;

    /* renamed from: b */
    private final bu0 f35635b;

    /* renamed from: c */
    private final pt0 f35636c;

    /* renamed from: com.yandex.mobile.ads.impl.jt0$a */
    interface C13586a {
        /* renamed from: a */
        void mo65503a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.jt0$b */
    private static class C13587b implements et0.C13007b, bu0.C12657a, pt0.C14313b {

        /* renamed from: a */
        private final AtomicInteger f35637a = new AtomicInteger(3);

        /* renamed from: b */
        private final C13586a f35638b;

        public C13587b(C13586a aVar) {
            this.f35638b = aVar;
        }

        /* renamed from: a */
        private void m38036a() {
            if (this.f35637a.decrementAndGet() == 0) {
                this.f35638b.mo65503a();
            }
        }

        /* renamed from: b */
        public void mo68092b() {
            m38036a();
        }

        /* renamed from: c */
        public void mo68093c() {
            m38036a();
        }

        /* renamed from: d */
        public void mo68094d() {
            m38036a();
        }
    }

    jt0(Context context, C15230y2 y2Var) {
        this.f35634a = new et0(context, y2Var);
        this.f35635b = new bu0(context, y2Var);
        this.f35636c = new pt0(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68091a(vq0 vq0, ed0 ed0, C13586a aVar) {
        C13587b bVar = new C13587b(aVar);
        this.f35635b.mo66120a(vq0, bVar);
        this.f35634a.mo66873a(vq0, ed0, bVar);
        this.f35636c.mo69435a(vq0, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68090a() {
        this.f35635b.mo66119a();
        this.f35634a.getClass();
        this.f35636c.mo69434a();
    }
}
