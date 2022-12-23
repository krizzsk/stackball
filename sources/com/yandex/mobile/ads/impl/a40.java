package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.a40;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a40<T> {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C12355b<T>> f30438a = new CopyOnWriteArrayList<>();

    /* renamed from: com.yandex.mobile.ads.impl.a40$a */
    public interface C12354a<T> {
        /* renamed from: a */
        void mo64831a(T t);
    }

    /* renamed from: com.yandex.mobile.ads.impl.a40$b */
    private static final class C12355b<T> {

        /* renamed from: a */
        private final Handler f30439a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final T f30440b;

        /* renamed from: c */
        private boolean f30441c;

        public C12355b(Handler handler, T t) {
            this.f30439a = handler;
            this.f30440b = t;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m33609b(C12354a aVar) {
            if (!this.f30441c) {
                aVar.mo64831a(this.f30440b);
            }
        }

        /* renamed from: a */
        public void mo65671a() {
            this.f30441c = true;
        }

        /* renamed from: a */
        public void mo65672a(C12354a<T> aVar) {
            this.f30439a.post(new Runnable(aVar) {
                public final /* synthetic */ a40.C12354a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    a40.C12355b.this.m33609b(this.f$1);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo65668a(Handler handler, T t) {
        C13479j9.m37705a((handler == null || t == null) ? false : true);
        mo65670a(t);
        this.f30438a.add(new C12355b(handler, t));
    }

    /* renamed from: a */
    public void mo65670a(T t) {
        Iterator<C12355b<T>> it = this.f30438a.iterator();
        while (it.hasNext()) {
            C12355b next = it.next();
            if (next.f30440b == t) {
                next.mo65671a();
                this.f30438a.remove(next);
            }
        }
    }

    /* renamed from: a */
    public void mo65669a(C12354a<T> aVar) {
        Iterator<C12355b<T>> it = this.f30438a.iterator();
        while (it.hasNext()) {
            it.next().mo65672a(aVar);
        }
    }
}
