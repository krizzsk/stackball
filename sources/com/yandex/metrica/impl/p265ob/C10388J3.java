package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10327H3;

/* renamed from: com.yandex.metrica.impl.ob.J3 */
public class C10388J3<T extends C10327H3> {

    /* renamed from: a */
    private final C10358I3<T> f24958a;

    /* renamed from: b */
    private final C10297G3<T> f24959b;

    /* renamed from: com.yandex.metrica.impl.ob.J3$b */
    public static final class C10390b<T extends C10327H3> {

        /* renamed from: a */
        final C10358I3<T> f24960a;

        /* renamed from: b */
        C10297G3<T> f24961b;

        C10390b(C10358I3<T> i3) {
            this.f24960a = i3;
        }

        /* renamed from: a */
        public C10390b<T> mo61594a(C10297G3<T> g3) {
            this.f24961b = g3;
            return this;
        }

        /* renamed from: a */
        public C10388J3<T> mo61595a() {
            return new C10388J3<>(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo61592a(C10327H3 h3) {
        C10297G3<T> g3 = this.f24959b;
        if (g3 == null) {
            return false;
        }
        return g3.mo61125a(h3);
    }

    /* renamed from: b */
    public void mo61593b(C10327H3 h3) {
        this.f24958a.mo61163a(h3);
    }

    private C10388J3(C10390b bVar) {
        this.f24958a = bVar.f24960a;
        this.f24959b = bVar.f24961b;
    }

    /* renamed from: a */
    public static <T extends C10327H3> C10390b<T> m26651a(C10358I3<T> i3) {
        return new C10390b<>(i3);
    }
}
