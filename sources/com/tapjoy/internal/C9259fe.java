package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;

/* renamed from: com.tapjoy.internal.fe */
public final class C9259fe extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22846c = new C9261b();

    /* renamed from: d */
    public static final Long f22847d = 0L;

    /* renamed from: e */
    public static final Long f22848e = 0L;

    /* renamed from: f */
    public final String f22849f;

    /* renamed from: g */
    public final Long f22850g;

    /* renamed from: h */
    public final Long f22851h;

    public C9259fe(String str, Long l) {
        this(str, l, (Long) null, C9434iu.f23449b);
    }

    public C9259fe(String str, Long l, Long l2, C9434iu iuVar) {
        super(f22846c, iuVar);
        this.f22849f = str;
        this.f22850g = l;
        this.f22851h = l2;
    }

    /* renamed from: b */
    public final C9260a mo58112b() {
        C9260a aVar = new C9260a();
        aVar.f22852c = this.f22849f;
        aVar.f22853d = this.f22850g;
        aVar.f22854e = this.f22851h;
        aVar.mo57991a(mo57988a());
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9259fe)) {
            return false;
        }
        C9259fe feVar = (C9259fe) obj;
        return mo57988a().equals(feVar.mo57988a()) && this.f22849f.equals(feVar.f22849f) && this.f22850g.equals(feVar.f22850g) && C9217eo.m24677a((Object) this.f22851h, (Object) feVar.f22851h);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((mo57988a().hashCode() * 37) + this.f22849f.hashCode()) * 37) + this.f22850g.hashCode()) * 37;
        Long l = this.f22851h;
        int hashCode2 = hashCode + (l != null ? l.hashCode() : 0);
        this.f22593b = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.f22849f);
        sb.append(", received=");
        sb.append(this.f22850g);
        if (this.f22851h != null) {
            sb.append(", clicked=");
            sb.append(this.f22851h);
        }
        StringBuilder replace = sb.replace(0, 2, "Push{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fe$a */
    public static final class C9260a extends C9194eh.C9195a {

        /* renamed from: c */
        public String f22852c;

        /* renamed from: d */
        public Long f22853d;

        /* renamed from: e */
        public Long f22854e;

        /* renamed from: b */
        public final C9259fe mo58115b() {
            if (this.f22852c != null && this.f22853d != null) {
                return new C9259fe(this.f22852c, this.f22853d, this.f22854e, super.mo57992a());
            }
            throw C9217eo.m24674a(this.f22852c, "id", this.f22853d, "received");
        }
    }

    /* renamed from: com.tapjoy.internal.fe$b */
    static final class C9261b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9259fe feVar = (C9259fe) obj;
            return C9197ej.f22611p.mo57993a(1, (Object) feVar.f22849f) + C9197ej.f22604i.mo57993a(2, (Object) feVar.f22850g) + (feVar.f22851h != null ? C9197ej.f22604i.mo57993a(3, (Object) feVar.f22851h) : 0) + feVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9259fe feVar = (C9259fe) obj;
            C9197ej.f22611p.mo57997a(elVar, 1, feVar.f22849f);
            C9197ej.f22604i.mo57997a(elVar, 2, feVar.f22850g);
            if (feVar.f22851h != null) {
                C9197ej.f22604i.mo57997a(elVar, 3, feVar.f22851h);
            }
            elVar.mo58009a(feVar.mo57988a());
        }

        C9261b() {
            super(C9192eg.LENGTH_DELIMITED, C9259fe.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9260a aVar = new C9260a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58115b();
                } else if (b == 1) {
                    aVar.f22852c = (String) C9197ej.f22611p.mo57985a(ekVar);
                } else if (b == 2) {
                    aVar.f22853d = (Long) C9197ej.f22604i.mo57985a(ekVar);
                } else if (b != 3) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22854e = (Long) C9197ej.f22604i.mo57985a(ekVar);
                }
            }
        }
    }
}
