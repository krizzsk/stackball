package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;

/* renamed from: com.tapjoy.internal.fb */
public final class C9250fb extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22799c = new C9252b();

    /* renamed from: d */
    public final C9247fa f22800d;

    /* renamed from: e */
    public final C9229eu f22801e;

    /* renamed from: f */
    public final C9268fh f22802f;

    public C9250fb(C9247fa faVar, C9229eu euVar, C9268fh fhVar) {
        this(faVar, euVar, fhVar, C9434iu.f23449b);
    }

    public C9250fb(C9247fa faVar, C9229eu euVar, C9268fh fhVar, C9434iu iuVar) {
        super(f22799c, iuVar);
        this.f22800d = faVar;
        this.f22801e = euVar;
        this.f22802f = fhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9250fb)) {
            return false;
        }
        C9250fb fbVar = (C9250fb) obj;
        return mo57988a().equals(fbVar.mo57988a()) && C9217eo.m24677a((Object) this.f22800d, (Object) fbVar.f22800d) && C9217eo.m24677a((Object) this.f22801e, (Object) fbVar.f22801e) && C9217eo.m24677a((Object) this.f22802f, (Object) fbVar.f22802f);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo57988a().hashCode() * 37;
        C9247fa faVar = this.f22800d;
        int i2 = 0;
        int hashCode2 = (hashCode + (faVar != null ? faVar.hashCode() : 0)) * 37;
        C9229eu euVar = this.f22801e;
        int hashCode3 = (hashCode2 + (euVar != null ? euVar.hashCode() : 0)) * 37;
        C9268fh fhVar = this.f22802f;
        if (fhVar != null) {
            i2 = fhVar.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.f22593b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f22800d != null) {
            sb.append(", info=");
            sb.append(this.f22800d);
        }
        if (this.f22801e != null) {
            sb.append(", app=");
            sb.append(this.f22801e);
        }
        if (this.f22802f != null) {
            sb.append(", user=");
            sb.append(this.f22802f);
        }
        StringBuilder replace = sb.replace(0, 2, "InfoSet{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fb$a */
    public static final class C9251a extends C9194eh.C9195a {

        /* renamed from: c */
        public C9247fa f22803c;

        /* renamed from: d */
        public C9229eu f22804d;

        /* renamed from: e */
        public C9268fh f22805e;

        /* renamed from: b */
        public final C9250fb mo58105b() {
            return new C9250fb(this.f22803c, this.f22804d, this.f22805e, super.mo57992a());
        }
    }

    /* renamed from: com.tapjoy.internal.fb$b */
    static final class C9252b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9250fb fbVar = (C9250fb) obj;
            int i = 0;
            int a = (fbVar.f22800d != null ? C9247fa.f22759c.mo57993a(1, (Object) fbVar.f22800d) : 0) + (fbVar.f22801e != null ? C9229eu.f22660c.mo57993a(2, (Object) fbVar.f22801e) : 0);
            if (fbVar.f22802f != null) {
                i = C9268fh.f22861c.mo57993a(3, (Object) fbVar.f22802f);
            }
            return a + i + fbVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9250fb fbVar = (C9250fb) obj;
            if (fbVar.f22800d != null) {
                C9247fa.f22759c.mo57997a(elVar, 1, fbVar.f22800d);
            }
            if (fbVar.f22801e != null) {
                C9229eu.f22660c.mo57997a(elVar, 2, fbVar.f22801e);
            }
            if (fbVar.f22802f != null) {
                C9268fh.f22861c.mo57997a(elVar, 3, fbVar.f22802f);
            }
            elVar.mo58009a(fbVar.mo57988a());
        }

        C9252b() {
            super(C9192eg.LENGTH_DELIMITED, C9250fb.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9251a aVar = new C9251a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58105b();
                } else if (b == 1) {
                    aVar.f22803c = (C9247fa) C9247fa.f22759c.mo57985a(ekVar);
                } else if (b == 2) {
                    aVar.f22804d = (C9229eu) C9229eu.f22660c.mo57985a(ekVar);
                } else if (b != 3) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22805e = (C9268fh) C9268fh.f22861c.mo57985a(ekVar);
                }
            }
        }
    }
}
