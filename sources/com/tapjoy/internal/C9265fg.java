package com.tapjoy.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.tapjoy.internal.C9194eh;
import java.util.List;

/* renamed from: com.tapjoy.internal.fg */
public final class C9265fg extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22858c = new C9267b();

    /* renamed from: d */
    public final List f22859d;

    public C9265fg(List list) {
        this(list, C9434iu.f23449b);
    }

    public C9265fg(List list, C9434iu iuVar) {
        super(f22858c, iuVar);
        this.f22859d = C9217eo.m24676a(MessengerShareContentUtility.ELEMENTS, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9265fg)) {
            return false;
        }
        C9265fg fgVar = (C9265fg) obj;
        return mo57988a().equals(fgVar.mo57988a()) && this.f22859d.equals(fgVar.f22859d);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo57988a().hashCode() * 37) + this.f22859d.hashCode();
        this.f22593b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f22859d.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.f22859d);
        }
        StringBuilder replace = sb.replace(0, 2, "StringList{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fg$a */
    public static final class C9266a extends C9194eh.C9195a {

        /* renamed from: c */
        public List f22860c = C9217eo.m24675a();

        /* renamed from: b */
        public final C9265fg mo58121b() {
            return new C9265fg(this.f22860c, super.mo57992a());
        }
    }

    /* renamed from: com.tapjoy.internal.fg$b */
    static final class C9267b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9265fg fgVar = (C9265fg) obj;
            return C9197ej.f22611p.mo57994a().mo57993a(1, (Object) fgVar.f22859d) + fgVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9265fg fgVar = (C9265fg) obj;
            C9197ej.f22611p.mo57994a().mo57997a(elVar, 1, fgVar.f22859d);
            elVar.mo58009a(fgVar.mo57988a());
        }

        C9267b() {
            super(C9192eg.LENGTH_DELIMITED, C9265fg.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9266a aVar = new C9266a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58121b();
                } else if (b != 1) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22860c.add(C9197ej.f22611p.mo57985a(ekVar));
                }
            }
        }
    }
}
