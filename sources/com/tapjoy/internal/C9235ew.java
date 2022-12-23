package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;
import java.util.List;

/* renamed from: com.tapjoy.internal.ew */
public final class C9235ew extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22733c = new C9237b();

    /* renamed from: d */
    public final List f22734d;

    public C9235ew(List list, C9434iu iuVar) {
        super(f22733c, iuVar);
        this.f22734d = C9217eo.m24676a("events", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9235ew)) {
            return false;
        }
        C9235ew ewVar = (C9235ew) obj;
        return mo57988a().equals(ewVar.mo57988a()) && this.f22734d.equals(ewVar.f22734d);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = (mo57988a().hashCode() * 37) + this.f22734d.hashCode();
        this.f22593b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f22734d.isEmpty()) {
            sb.append(", events=");
            sb.append(this.f22734d);
        }
        StringBuilder replace = sb.replace(0, 2, "EventBatch{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ew$a */
    public static final class C9236a extends C9194eh.C9195a {

        /* renamed from: c */
        public List f22735c = C9217eo.m24675a();

        /* renamed from: b */
        public final C9235ew mo58093b() {
            return new C9235ew(this.f22735c, super.mo57992a());
        }
    }

    /* renamed from: com.tapjoy.internal.ew$b */
    static final class C9237b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9235ew ewVar = (C9235ew) obj;
            return C9232ev.f22672c.mo57994a().mo57993a(1, (Object) ewVar.f22734d) + ewVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9235ew ewVar = (C9235ew) obj;
            C9232ev.f22672c.mo57994a().mo57997a(elVar, 1, ewVar.f22734d);
            elVar.mo58009a(ewVar.mo57988a());
        }

        C9237b() {
            super(C9192eg.LENGTH_DELIMITED, C9235ew.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9236a aVar = new C9236a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58093b();
                } else if (b != 1) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22735c.add(C9232ev.f22672c.mo57985a(ekVar));
                }
            }
        }
    }
}
