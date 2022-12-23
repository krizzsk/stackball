package com.yandex.mobile.ads.exo.source;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.impl.C13477j7;
import com.yandex.mobile.ads.impl.af1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.exo.source.f */
public interface C12287f {

    /* renamed from: com.yandex.mobile.ads.exo.source.f$a */
    public static final class C12288a {

        /* renamed from: a */
        public final Object f30085a;

        /* renamed from: b */
        public final int f30086b;

        /* renamed from: c */
        public final int f30087c;

        /* renamed from: d */
        public final long f30088d;

        /* renamed from: e */
        public final int f30089e;

        public C12288a(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        /* renamed from: a */
        public boolean mo65283a() {
            return this.f30086b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12288a.class != obj.getClass()) {
                return false;
            }
            C12288a aVar = (C12288a) obj;
            if (this.f30085a.equals(aVar.f30085a) && this.f30086b == aVar.f30086b && this.f30087c == aVar.f30087c && this.f30088d == aVar.f30088d && this.f30089e == aVar.f30089e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((this.f30085a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f30086b) * 31) + this.f30087c) * 31) + ((int) this.f30088d)) * 31) + this.f30089e;
        }

        public C12288a(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public C12288a(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        private C12288a(Object obj, int i, int i2, long j, int i3) {
            this.f30085a = obj;
            this.f30086b = i;
            this.f30087c = i2;
            this.f30088d = j;
            this.f30089e = i3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.f$b */
    public interface C12289b {
        /* renamed from: a */
        void mo64927a(C12287f fVar, C12270q qVar);
    }

    /* renamed from: a */
    C12285e mo65280a(C12288a aVar, C13477j7 j7Var, long j);

    /* renamed from: a */
    void mo65281a() throws IOException;

    /* renamed from: a */
    void mo65282a(C12285e eVar);

    /* renamed from: a */
    void mo65250a(C12289b bVar);

    /* renamed from: a */
    void mo65251a(C12289b bVar, af1 af1);

    /* renamed from: a */
    void mo65252a(C12290g gVar);
}
