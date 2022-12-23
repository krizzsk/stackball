package com.yandex.mobile.ads.impl;

public interface s71 {

    /* renamed from: com.yandex.mobile.ads.impl.s71$a */
    public static final class C14566a {

        /* renamed from: a */
        public final u71 f39865a;

        /* renamed from: b */
        public final u71 f39866b;

        public C14566a(u71 u71) {
            this(u71, u71);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C14566a.class != obj.getClass()) {
                return false;
            }
            C14566a aVar = (C14566a) obj;
            if (!this.f39865a.equals(aVar.f39865a) || !this.f39866b.equals(aVar.f39866b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f39865a.hashCode() * 31) + this.f39866b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f39865a);
            if (this.f39865a.equals(this.f39866b)) {
                str = "";
            } else {
                str = ", " + this.f39866b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C14566a(u71 u71, u71 u712) {
            this.f39865a = (u71) C13479j9.m37703a(u71);
            this.f39866b = (u71) C13479j9.m37703a(u712);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.s71$b */
    public static class C14567b implements s71 {

        /* renamed from: a */
        private final long f39867a;

        /* renamed from: b */
        private final C14566a f39868b;

        public C14567b(long j) {
            this(j, 0);
        }

        /* renamed from: a */
        public boolean mo64897a() {
            return false;
        }

        /* renamed from: b */
        public C14566a mo64898b(long j) {
            return this.f39868b;
        }

        /* renamed from: c */
        public long mo64899c() {
            return this.f39867a;
        }

        public C14567b(long j, long j2) {
            this.f39867a = j;
            this.f39868b = new C14566a(j2 == 0 ? u71.f40581c : new u71(0, j2));
        }
    }

    /* renamed from: a */
    boolean mo64897a();

    /* renamed from: b */
    C14566a mo64898b(long j);

    /* renamed from: c */
    long mo64899c();
}
