package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;
import com.tapjoy.internal.C9197ej;

/* renamed from: com.tapjoy.internal.ex */
public final class C9238ex extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22736c = new C9240b();

    /* renamed from: d */
    public static final C9241ey f22737d = C9241ey.APP;

    /* renamed from: e */
    public final C9241ey f22738e;

    /* renamed from: f */
    public final String f22739f;

    /* renamed from: g */
    public final String f22740g;

    public C9238ex(C9241ey eyVar, String str, String str2, C9434iu iuVar) {
        super(f22736c, iuVar);
        this.f22738e = eyVar;
        this.f22739f = str;
        this.f22740g = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9238ex)) {
            return false;
        }
        C9238ex exVar = (C9238ex) obj;
        return mo57988a().equals(exVar.mo57988a()) && this.f22738e.equals(exVar.f22738e) && this.f22739f.equals(exVar.f22739f) && C9217eo.m24677a((Object) this.f22740g, (Object) exVar.f22740g);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((mo57988a().hashCode() * 37) + this.f22738e.hashCode()) * 37) + this.f22739f.hashCode()) * 37;
        String str = this.f22740g;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.f22593b = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.f22738e);
        sb.append(", name=");
        sb.append(this.f22739f);
        if (this.f22740g != null) {
            sb.append(", category=");
            sb.append(this.f22740g);
        }
        StringBuilder replace = sb.replace(0, 2, "EventGroup{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ex$a */
    public static final class C9239a extends C9194eh.C9195a {

        /* renamed from: c */
        public C9241ey f22741c;

        /* renamed from: d */
        public String f22742d;

        /* renamed from: e */
        public String f22743e;

        /* renamed from: b */
        public final C9238ex mo58096b() {
            if (this.f22741c != null && this.f22742d != null) {
                return new C9238ex(this.f22741c, this.f22742d, this.f22743e, super.mo57992a());
            }
            throw C9217eo.m24674a(this.f22741c, "type", this.f22742d, "name");
        }
    }

    /* renamed from: com.tapjoy.internal.ex$b */
    static final class C9240b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9238ex exVar = (C9238ex) obj;
            return C9241ey.ADAPTER.mo57993a(1, (Object) exVar.f22738e) + C9197ej.f22611p.mo57993a(2, (Object) exVar.f22739f) + (exVar.f22740g != null ? C9197ej.f22611p.mo57993a(3, (Object) exVar.f22740g) : 0) + exVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return m24829b(ekVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9238ex exVar = (C9238ex) obj;
            C9241ey.ADAPTER.mo57997a(elVar, 1, exVar.f22738e);
            C9197ej.f22611p.mo57997a(elVar, 2, exVar.f22739f);
            if (exVar.f22740g != null) {
                C9197ej.f22611p.mo57997a(elVar, 3, exVar.f22740g);
            }
            elVar.mo58009a(exVar.mo57988a());
        }

        C9240b() {
            super(C9192eg.LENGTH_DELIMITED, C9238ex.class);
        }

        /* renamed from: b */
        private static C9238ex m24829b(C9213ek ekVar) {
            C9239a aVar = new C9239a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58096b();
                } else if (b == 1) {
                    try {
                        aVar.f22741c = (C9241ey) C9241ey.ADAPTER.mo57985a(ekVar);
                    } catch (C9197ej.C9212a e) {
                        aVar.mo57990a(b, C9192eg.VARINT, Long.valueOf((long) e.f22617a));
                    }
                } else if (b == 2) {
                    aVar.f22742d = (String) C9197ej.f22611p.mo57985a(ekVar);
                } else if (b != 3) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22743e = (String) C9197ej.f22611p.mo57985a(ekVar);
                }
            }
        }
    }
}
