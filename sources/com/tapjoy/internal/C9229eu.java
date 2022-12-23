package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;

/* renamed from: com.tapjoy.internal.eu */
public final class C9229eu extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22660c = new C9231b();

    /* renamed from: d */
    public static final Integer f22661d = 0;

    /* renamed from: e */
    public final String f22662e;

    /* renamed from: f */
    public final Integer f22663f;

    /* renamed from: g */
    public final String f22664g;

    /* renamed from: h */
    public final String f22665h;

    /* renamed from: i */
    public final String f22666i;

    public C9229eu(String str, Integer num, String str2, String str3, String str4, C9434iu iuVar) {
        super(f22660c, iuVar);
        this.f22662e = str;
        this.f22663f = num;
        this.f22664g = str2;
        this.f22665h = str3;
        this.f22666i = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9229eu)) {
            return false;
        }
        C9229eu euVar = (C9229eu) obj;
        return mo57988a().equals(euVar.mo57988a()) && C9217eo.m24677a((Object) this.f22662e, (Object) euVar.f22662e) && C9217eo.m24677a((Object) this.f22663f, (Object) euVar.f22663f) && C9217eo.m24677a((Object) this.f22664g, (Object) euVar.f22664g) && C9217eo.m24677a((Object) this.f22665h, (Object) euVar.f22665h) && C9217eo.m24677a((Object) this.f22666i, (Object) euVar.f22666i);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo57988a().hashCode() * 37;
        String str = this.f22662e;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.f22663f;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.f22664g;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f22665h;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f22666i;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.f22593b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f22662e != null) {
            sb.append(", pkgVer=");
            sb.append(this.f22662e);
        }
        if (this.f22663f != null) {
            sb.append(", pkgRev=");
            sb.append(this.f22663f);
        }
        if (this.f22664g != null) {
            sb.append(", dataVer=");
            sb.append(this.f22664g);
        }
        if (this.f22665h != null) {
            sb.append(", installer=");
            sb.append(this.f22665h);
        }
        if (this.f22666i != null) {
            sb.append(", store=");
            sb.append(this.f22666i);
        }
        StringBuilder replace = sb.replace(0, 2, "App{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.eu$a */
    public static final class C9230a extends C9194eh.C9195a {

        /* renamed from: c */
        public String f22667c;

        /* renamed from: d */
        public Integer f22668d;

        /* renamed from: e */
        public String f22669e;

        /* renamed from: f */
        public String f22670f;

        /* renamed from: g */
        public String f22671g;

        /* renamed from: b */
        public final C9229eu mo58087b() {
            return new C9229eu(this.f22667c, this.f22668d, this.f22669e, this.f22670f, this.f22671g, super.mo57992a());
        }
    }

    /* renamed from: com.tapjoy.internal.eu$b */
    static final class C9231b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9229eu euVar = (C9229eu) obj;
            int i = 0;
            int a = (euVar.f22662e != null ? C9197ej.f22611p.mo57993a(1, (Object) euVar.f22662e) : 0) + (euVar.f22663f != null ? C9197ej.f22599d.mo57993a(2, (Object) euVar.f22663f) : 0) + (euVar.f22664g != null ? C9197ej.f22611p.mo57993a(3, (Object) euVar.f22664g) : 0) + (euVar.f22665h != null ? C9197ej.f22611p.mo57993a(4, (Object) euVar.f22665h) : 0);
            if (euVar.f22666i != null) {
                i = C9197ej.f22611p.mo57993a(5, (Object) euVar.f22666i);
            }
            return a + i + euVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9229eu euVar = (C9229eu) obj;
            if (euVar.f22662e != null) {
                C9197ej.f22611p.mo57997a(elVar, 1, euVar.f22662e);
            }
            if (euVar.f22663f != null) {
                C9197ej.f22599d.mo57997a(elVar, 2, euVar.f22663f);
            }
            if (euVar.f22664g != null) {
                C9197ej.f22611p.mo57997a(elVar, 3, euVar.f22664g);
            }
            if (euVar.f22665h != null) {
                C9197ej.f22611p.mo57997a(elVar, 4, euVar.f22665h);
            }
            if (euVar.f22666i != null) {
                C9197ej.f22611p.mo57997a(elVar, 5, euVar.f22666i);
            }
            elVar.mo58009a(euVar.mo57988a());
        }

        C9231b() {
            super(C9192eg.LENGTH_DELIMITED, C9229eu.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9230a aVar = new C9230a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b == -1) {
                    ekVar.mo58001a(a);
                    return aVar.mo58087b();
                } else if (b == 1) {
                    aVar.f22667c = (String) C9197ej.f22611p.mo57985a(ekVar);
                } else if (b == 2) {
                    aVar.f22668d = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                } else if (b == 3) {
                    aVar.f22669e = (String) C9197ej.f22611p.mo57985a(ekVar);
                } else if (b == 4) {
                    aVar.f22670f = (String) C9197ej.f22611p.mo57985a(ekVar);
                } else if (b != 5) {
                    C9192eg c = ekVar.mo58003c();
                    aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                } else {
                    aVar.f22671g = (String) C9197ej.f22611p.mo57985a(ekVar);
                }
            }
        }
    }
}
