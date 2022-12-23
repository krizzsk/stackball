package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.r6 */
public class C11705r6 {

    /* renamed from: a */
    private final C12017z6 f28056a;

    /* renamed from: b */
    private final Long f28057b;

    /* renamed from: c */
    private final Long f28058c;

    /* renamed from: d */
    private final Integer f28059d;

    /* renamed from: e */
    private final Long f28060e;

    /* renamed from: f */
    private final Boolean f28061f;

    /* renamed from: g */
    private final Long f28062g;

    /* renamed from: h */
    private final Long f28063h;

    /* renamed from: com.yandex.metrica.impl.ob.r6$b */
    static final class C11707b {

        /* renamed from: a */
        public Long f28064a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C12017z6 f28065b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Long f28066c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Long f28067d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Integer f28068e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Long f28069f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Boolean f28070g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Long f28071h;

        private C11707b(C11778t6 t6Var) {
            this.f28065b = t6Var.mo63700b();
            this.f28068e = t6Var.mo63699a();
        }

        /* renamed from: a */
        public C11707b mo63580a(Long l) {
            this.f28067d = l;
            return this;
        }

        /* renamed from: b */
        public C11707b mo63581b(Long l) {
            this.f28069f = l;
            return this;
        }

        /* renamed from: c */
        public C11707b mo63582c(Long l) {
            this.f28066c = l;
            return this;
        }

        /* renamed from: d */
        public C11707b mo63583d(Long l) {
            this.f28071h = l;
            return this;
        }

        /* renamed from: a */
        public C11707b mo63579a(Boolean bool) {
            this.f28070g = bool;
            return this;
        }
    }

    /* renamed from: a */
    public C12017z6 mo63573a() {
        return this.f28056a;
    }

    /* renamed from: b */
    public long mo63575b(long j) {
        Long l = this.f28060e;
        return l == null ? j : l.longValue();
    }

    /* renamed from: c */
    public long mo63576c(long j) {
        Long l = this.f28057b;
        return l == null ? j : l.longValue();
    }

    /* renamed from: d */
    public long mo63577d(long j) {
        Long l = this.f28063h;
        return l == null ? j : l.longValue();
    }

    /* renamed from: e */
    public long mo63578e(long j) {
        Long l = this.f28062g;
        return l == null ? j : l.longValue();
    }

    private C11705r6(C11707b bVar) {
        this.f28056a = bVar.f28065b;
        this.f28059d = bVar.f28068e;
        this.f28057b = bVar.f28066c;
        this.f28058c = bVar.f28067d;
        this.f28060e = bVar.f28069f;
        this.f28061f = bVar.f28070g;
        this.f28062g = bVar.f28071h;
        this.f28063h = bVar.f28064a;
    }

    /* renamed from: a */
    public long mo63572a(long j) {
        Long l = this.f28058c;
        return l == null ? j : l.longValue();
    }

    /* renamed from: a */
    public int mo63571a(int i) {
        Integer num = this.f28059d;
        return num == null ? i : num.intValue();
    }

    /* renamed from: a */
    public boolean mo63574a(boolean z) {
        Boolean bool = this.f28061f;
        return bool == null ? z : bool.booleanValue();
    }
}
