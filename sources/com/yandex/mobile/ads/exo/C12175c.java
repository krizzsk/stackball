package com.yandex.mobile.ads.exo;

import com.yandex.mobile.ads.exo.C12227m;
import com.yandex.mobile.ads.exo.C12270q;

/* renamed from: com.yandex.mobile.ads.exo.c */
public abstract class C12175c implements C12227m {

    /* renamed from: a */
    protected final C12270q.C12273c f29560a = new C12270q.C12273c();

    /* renamed from: com.yandex.mobile.ads.exo.c$a */
    protected static final class C12176a {

        /* renamed from: a */
        public final C12227m.C12228a f29561a;

        /* renamed from: b */
        private boolean f29562b;

        public C12176a(C12227m.C12228a aVar) {
            this.f29561a = aVar;
        }

        /* renamed from: a */
        public void mo64790a() {
            this.f29562b = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12176a.class != obj.getClass()) {
                return false;
            }
            return this.f29561a.equals(((C12176a) obj).f29561a);
        }

        public int hashCode() {
            return this.f29561a.hashCode();
        }

        /* renamed from: a */
        public void mo64791a(C12177b bVar) {
            if (!this.f29562b) {
                bVar.mo64762a(this.f29561a);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.c$b */
    protected interface C12177b {
        /* renamed from: a */
        void mo64762a(C12227m.C12228a aVar);
    }

    /* renamed from: k */
    public final boolean mo64789k() {
        return mo64917g() == 3 && mo64915e() && mo64914d() == 0;
    }
}
