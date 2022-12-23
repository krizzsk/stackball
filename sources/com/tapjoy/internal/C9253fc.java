package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;

/* renamed from: com.tapjoy.internal.fc */
public final class C9253fc extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22806c = new C9255b();

    /* renamed from: d */
    public final String f22807d;

    /* renamed from: e */
    public final String f22808e;

    /* renamed from: f */
    public final String f22809f;

    public C9253fc(String str, String str2, String str3) {
        this(str, str2, str3, C9434iu.f23449b);
    }

    public C9253fc(String str, String str2, String str3, C9434iu iuVar) {
        super(f22806c, iuVar);
        this.f22807d = str;
        this.f22808e = str2;
        this.f22809f = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9253fc)) {
            return false;
        }
        C9253fc fcVar = (C9253fc) obj;
        return mo57988a().equals(fcVar.mo57988a()) && C9217eo.m24677a((Object) this.f22807d, (Object) fcVar.f22807d) && C9217eo.m24677a((Object) this.f22808e, (Object) fcVar.f22808e) && C9217eo.m24677a((Object) this.f22809f, (Object) fcVar.f22809f);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo57988a().hashCode() * 37;
        String str = this.f22807d;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f22808e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f22809f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.f22593b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f22807d != null) {
            sb.append(", fq7Change=");
            sb.append(this.f22807d);
        }
        if (this.f22808e != null) {
            sb.append(", fq30Change=");
            sb.append(this.f22808e);
        }
        if (this.f22809f != null) {
            sb.append(", pushId=");
            sb.append(this.f22809f);
        }
        StringBuilder replace = sb.replace(0, 2, "Meta{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fc$a */
    public static final class C9254a extends C9194eh.C9195a {

        /* renamed from: c */
        public String f22810c;

        /* renamed from: d */
        public String f22811d;

        /* renamed from: e */
        public String f22812e;

        /* renamed from: b */
        public final C9253fc mo58108b() {
            return new C9253fc(this.f22810c, this.f22811d, this.f22812e, super.mo57992a());
        }
    }

    /* renamed from: com.tapjoy.internal.fc$b */
    static final class C9255b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9253fc fcVar = (C9253fc) obj;
            int i = 0;
            int a = (fcVar.f22807d != null ? C9197ej.f22611p.mo57993a(1, (Object) fcVar.f22807d) : 0) + (fcVar.f22808e != null ? C9197ej.f22611p.mo57993a(2, (Object) fcVar.f22808e) : 0);
            if (fcVar.f22809f != null) {
                i = C9197ej.f22611p.mo57993a(3, (Object) fcVar.f22809f);
            }
            return a + i + fcVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9253fc fcVar = (C9253fc) obj;
            if (fcVar.f22807d != null) {
                C9197ej.f22611p.mo57997a(elVar, 1, fcVar.f22807d);
            }
            if (fcVar.f22808e != null) {
                C9197ej.f22611p.mo57997a(elVar, 2, fcVar.f22808e);
            }
            if (fcVar.f22809f != null) {
                C9197ej.f22611p.mo57997a(elVar, 3, fcVar.f22809f);
            }
            elVar.mo58009a(fcVar.mo57988a());
        }

        C9255b() {
            super(C9192eg.LENGTH_DELIMITED, C9253fc.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9254a aVar = new C9254a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58108b();
                } else if (b == 1) {
                    aVar.f22810c = (String) C9197ej.f22611p.mo57985a(ekVar);
                } else if (b == 2) {
                    aVar.f22811d = (String) C9197ej.f22611p.mo57985a(ekVar);
                } else if (b != 3) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22812e = (String) C9197ej.f22611p.mo57985a(ekVar);
                }
            }
        }
    }
}
