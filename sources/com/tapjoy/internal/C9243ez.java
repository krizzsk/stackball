package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;

/* renamed from: com.tapjoy.internal.ez */
public final class C9243ez extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22746c = new C9245b();

    /* renamed from: d */
    public static final Long f22747d = 0L;

    /* renamed from: e */
    public final String f22748e;

    /* renamed from: f */
    public final Long f22749f;

    public C9243ez(String str, Long l) {
        this(str, l, C9434iu.f23449b);
    }

    public C9243ez(String str, Long l, C9434iu iuVar) {
        super(f22746c, iuVar);
        this.f22748e = str;
        this.f22749f = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9243ez)) {
            return false;
        }
        C9243ez ezVar = (C9243ez) obj;
        return mo57988a().equals(ezVar.mo57988a()) && this.f22748e.equals(ezVar.f22748e) && this.f22749f.equals(ezVar.f22749f);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((mo57988a().hashCode() * 37) + this.f22748e.hashCode()) * 37) + this.f22749f.hashCode();
        this.f22593b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.f22748e);
        sb.append(", value=");
        sb.append(this.f22749f);
        StringBuilder replace = sb.replace(0, 2, "EventValue{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ez$a */
    public static final class C9244a extends C9194eh.C9195a {

        /* renamed from: c */
        public String f22750c;

        /* renamed from: d */
        public Long f22751d;

        /* renamed from: b */
        public final C9243ez mo58099b() {
            if (this.f22750c != null && this.f22751d != null) {
                return new C9243ez(this.f22750c, this.f22751d, super.mo57992a());
            }
            throw C9217eo.m24674a(this.f22750c, "name", this.f22751d, "value");
        }
    }

    /* renamed from: com.tapjoy.internal.ez$b */
    static final class C9245b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9243ez ezVar = (C9243ez) obj;
            return C9197ej.f22611p.mo57993a(1, (Object) ezVar.f22748e) + C9197ej.f22604i.mo57993a(2, (Object) ezVar.f22749f) + ezVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9243ez ezVar = (C9243ez) obj;
            C9197ej.f22611p.mo57997a(elVar, 1, ezVar.f22748e);
            C9197ej.f22604i.mo57997a(elVar, 2, ezVar.f22749f);
            elVar.mo58009a(ezVar.mo57988a());
        }

        C9245b() {
            super(C9192eg.LENGTH_DELIMITED, C9243ez.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9244a aVar = new C9244a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58099b();
                } else if (b == 1) {
                    aVar.f22750c = (String) C9197ej.f22611p.mo57985a(ekVar);
                } else if (b != 2) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22751d = (Long) C9197ej.f22604i.mo57985a(ekVar);
                }
            }
        }
    }
}
