package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;
import java.util.List;

/* renamed from: com.tapjoy.internal.ff */
public final class C9262ff extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22855c = new C9264b();

    /* renamed from: d */
    public final List f22856d;

    public C9262ff(List list) {
        this(list, C9434iu.f23449b);
    }

    public C9262ff(List list, C9434iu iuVar) {
        super(f22855c, iuVar);
        this.f22856d = C9217eo.m24676a("pushes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9262ff)) {
            return false;
        }
        C9262ff ffVar = (C9262ff) obj;
        return mo57988a().equals(ffVar.mo57988a()) && this.f22856d.equals(ffVar.f22856d);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo57988a().hashCode() * 37) + this.f22856d.hashCode();
        this.f22593b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f22856d.isEmpty()) {
            sb.append(", pushes=");
            sb.append(this.f22856d);
        }
        StringBuilder replace = sb.replace(0, 2, "PushList{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ff$a */
    public static final class C9263a extends C9194eh.C9195a {

        /* renamed from: c */
        public List f22857c = C9217eo.m24675a();

        /* renamed from: b */
        public final C9262ff mo58118b() {
            return new C9262ff(this.f22857c, super.mo57992a());
        }
    }

    /* renamed from: com.tapjoy.internal.ff$b */
    static final class C9264b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9262ff ffVar = (C9262ff) obj;
            return C9259fe.f22846c.mo57994a().mo57993a(1, (Object) ffVar.f22856d) + ffVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9262ff ffVar = (C9262ff) obj;
            C9259fe.f22846c.mo57994a().mo57997a(elVar, 1, ffVar.f22856d);
            elVar.mo58009a(ffVar.mo57988a());
        }

        C9264b() {
            super(C9192eg.LENGTH_DELIMITED, C9262ff.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9263a aVar = new C9263a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58118b();
                } else if (b != 1) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22857c.add(C9259fe.f22846c.mo57985a(ekVar));
                }
            }
        }
    }
}
