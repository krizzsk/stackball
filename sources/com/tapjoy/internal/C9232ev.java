package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.C9194eh;
import com.tapjoy.internal.C9197ej;
import java.util.List;

/* renamed from: com.tapjoy.internal.ev */
public final class C9232ev extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22672c = new C9234b();

    /* renamed from: d */
    public static final C9241ey f22673d = C9241ey.APP;

    /* renamed from: e */
    public static final Long f22674e = 0L;

    /* renamed from: f */
    public static final Long f22675f = 0L;

    /* renamed from: g */
    public static final Long f22676g = 0L;

    /* renamed from: h */
    public static final Long f22677h = 0L;

    /* renamed from: i */
    public static final Integer f22678i = 0;

    /* renamed from: j */
    public static final Integer f22679j = 0;

    /* renamed from: k */
    public static final Integer f22680k = 0;

    /* renamed from: l */
    public static final Long f22681l = 0L;

    /* renamed from: m */
    public static final Long f22682m = 0L;

    /* renamed from: A */
    public final C9256fd f22683A;

    /* renamed from: B */
    public final String f22684B;

    /* renamed from: C */
    public final String f22685C;

    /* renamed from: D */
    public final C9253fc f22686D;

    /* renamed from: E */
    public final String f22687E;

    /* renamed from: F */
    public final String f22688F;

    /* renamed from: G */
    public final String f22689G;

    /* renamed from: H */
    public final List f22690H;

    /* renamed from: I */
    public final String f22691I;

    /* renamed from: J */
    public final Integer f22692J;

    /* renamed from: K */
    public final Long f22693K;

    /* renamed from: L */
    public final Long f22694L;

    /* renamed from: n */
    public final C9241ey f22695n;

    /* renamed from: o */
    public final String f22696o;

    /* renamed from: p */
    public final Long f22697p;

    /* renamed from: q */
    public final Long f22698q;

    /* renamed from: r */
    public final String f22699r;

    /* renamed from: s */
    public final Long f22700s;

    /* renamed from: t */
    public final Long f22701t;

    /* renamed from: u */
    public final C9247fa f22702u;

    /* renamed from: v */
    public final C9229eu f22703v;

    /* renamed from: w */
    public final C9268fh f22704w;

    /* renamed from: x */
    public final Integer f22705x;

    /* renamed from: y */
    public final Integer f22706y;

    /* renamed from: z */
    public final C9238ex f22707z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9232ev(C9241ey eyVar, String str, Long l, Long l2, String str2, Long l3, Long l4, C9247fa faVar, C9229eu euVar, C9268fh fhVar, Integer num, Integer num2, C9238ex exVar, C9256fd fdVar, String str3, String str4, C9253fc fcVar, String str5, String str6, String str7, List list, String str8, Integer num3, Long l5, Long l6, C9434iu iuVar) {
        super(f22672c, iuVar);
        this.f22695n = eyVar;
        this.f22696o = str;
        this.f22697p = l;
        this.f22698q = l2;
        this.f22699r = str2;
        this.f22700s = l3;
        this.f22701t = l4;
        this.f22702u = faVar;
        this.f22703v = euVar;
        this.f22704w = fhVar;
        this.f22705x = num;
        this.f22706y = num2;
        this.f22707z = exVar;
        this.f22683A = fdVar;
        this.f22684B = str3;
        this.f22685C = str4;
        this.f22686D = fcVar;
        this.f22687E = str5;
        this.f22688F = str6;
        this.f22689G = str7;
        this.f22690H = C9217eo.m24676a(TJAdUnitConstants.String.USAGE_TRACKER_VALUES, list);
        this.f22691I = str8;
        this.f22692J = num3;
        this.f22693K = l5;
        this.f22694L = l6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9232ev)) {
            return false;
        }
        C9232ev evVar = (C9232ev) obj;
        return mo57988a().equals(evVar.mo57988a()) && this.f22695n.equals(evVar.f22695n) && this.f22696o.equals(evVar.f22696o) && this.f22697p.equals(evVar.f22697p) && C9217eo.m24677a((Object) this.f22698q, (Object) evVar.f22698q) && C9217eo.m24677a((Object) this.f22699r, (Object) evVar.f22699r) && C9217eo.m24677a((Object) this.f22700s, (Object) evVar.f22700s) && C9217eo.m24677a((Object) this.f22701t, (Object) evVar.f22701t) && C9217eo.m24677a((Object) this.f22702u, (Object) evVar.f22702u) && C9217eo.m24677a((Object) this.f22703v, (Object) evVar.f22703v) && C9217eo.m24677a((Object) this.f22704w, (Object) evVar.f22704w) && C9217eo.m24677a((Object) this.f22705x, (Object) evVar.f22705x) && C9217eo.m24677a((Object) this.f22706y, (Object) evVar.f22706y) && C9217eo.m24677a((Object) this.f22707z, (Object) evVar.f22707z) && C9217eo.m24677a((Object) this.f22683A, (Object) evVar.f22683A) && C9217eo.m24677a((Object) this.f22684B, (Object) evVar.f22684B) && C9217eo.m24677a((Object) this.f22685C, (Object) evVar.f22685C) && C9217eo.m24677a((Object) this.f22686D, (Object) evVar.f22686D) && C9217eo.m24677a((Object) this.f22687E, (Object) evVar.f22687E) && C9217eo.m24677a((Object) this.f22688F, (Object) evVar.f22688F) && C9217eo.m24677a((Object) this.f22689G, (Object) evVar.f22689G) && this.f22690H.equals(evVar.f22690H) && C9217eo.m24677a((Object) this.f22691I, (Object) evVar.f22691I) && C9217eo.m24677a((Object) this.f22692J, (Object) evVar.f22692J) && C9217eo.m24677a((Object) this.f22693K, (Object) evVar.f22693K) && C9217eo.m24677a((Object) this.f22694L, (Object) evVar.f22694L);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((mo57988a().hashCode() * 37) + this.f22695n.hashCode()) * 37) + this.f22696o.hashCode()) * 37) + this.f22697p.hashCode()) * 37;
        Long l = this.f22698q;
        int i2 = 0;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.f22699r;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l2 = this.f22700s;
        int hashCode4 = (hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.f22701t;
        int hashCode5 = (hashCode4 + (l3 != null ? l3.hashCode() : 0)) * 37;
        C9247fa faVar = this.f22702u;
        int hashCode6 = (hashCode5 + (faVar != null ? faVar.hashCode() : 0)) * 37;
        C9229eu euVar = this.f22703v;
        int hashCode7 = (hashCode6 + (euVar != null ? euVar.hashCode() : 0)) * 37;
        C9268fh fhVar = this.f22704w;
        int hashCode8 = (hashCode7 + (fhVar != null ? fhVar.hashCode() : 0)) * 37;
        Integer num = this.f22705x;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.f22706y;
        int hashCode10 = (hashCode9 + (num2 != null ? num2.hashCode() : 0)) * 37;
        C9238ex exVar = this.f22707z;
        int hashCode11 = (hashCode10 + (exVar != null ? exVar.hashCode() : 0)) * 37;
        C9256fd fdVar = this.f22683A;
        int hashCode12 = (hashCode11 + (fdVar != null ? fdVar.hashCode() : 0)) * 37;
        String str2 = this.f22684B;
        int hashCode13 = (hashCode12 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f22685C;
        int hashCode14 = (hashCode13 + (str3 != null ? str3.hashCode() : 0)) * 37;
        C9253fc fcVar = this.f22686D;
        int hashCode15 = (hashCode14 + (fcVar != null ? fcVar.hashCode() : 0)) * 37;
        String str4 = this.f22687E;
        int hashCode16 = (hashCode15 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.f22688F;
        int hashCode17 = (hashCode16 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.f22689G;
        int hashCode18 = (((hashCode17 + (str6 != null ? str6.hashCode() : 0)) * 37) + this.f22690H.hashCode()) * 37;
        String str7 = this.f22691I;
        int hashCode19 = (hashCode18 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Integer num3 = this.f22692J;
        int hashCode20 = (hashCode19 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Long l4 = this.f22693K;
        int hashCode21 = (hashCode20 + (l4 != null ? l4.hashCode() : 0)) * 37;
        Long l5 = this.f22694L;
        if (l5 != null) {
            i2 = l5.hashCode();
        }
        int i3 = hashCode21 + i2;
        this.f22593b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.f22695n);
        sb.append(", name=");
        sb.append(this.f22696o);
        sb.append(", time=");
        sb.append(this.f22697p);
        if (this.f22698q != null) {
            sb.append(", systemTime=");
            sb.append(this.f22698q);
        }
        if (this.f22699r != null) {
            sb.append(", instanceId=");
            sb.append(this.f22699r);
        }
        if (this.f22700s != null) {
            sb.append(", elapsedRealtime=");
            sb.append(this.f22700s);
        }
        if (this.f22701t != null) {
            sb.append(", duration=");
            sb.append(this.f22701t);
        }
        if (this.f22702u != null) {
            sb.append(", info=");
            sb.append(this.f22702u);
        }
        if (this.f22703v != null) {
            sb.append(", app=");
            sb.append(this.f22703v);
        }
        if (this.f22704w != null) {
            sb.append(", user=");
            sb.append(this.f22704w);
        }
        if (this.f22705x != null) {
            sb.append(", xxx_session_seq=");
            sb.append(this.f22705x);
        }
        if (this.f22706y != null) {
            sb.append(", eventSeq=");
            sb.append(this.f22706y);
        }
        if (this.f22707z != null) {
            sb.append(", eventPrev=");
            sb.append(this.f22707z);
        }
        if (this.f22683A != null) {
            sb.append(", purchase=");
            sb.append(this.f22683A);
        }
        if (this.f22684B != null) {
            sb.append(", exception=");
            sb.append(this.f22684B);
        }
        if (this.f22685C != null) {
            sb.append(", metaBase=");
            sb.append(this.f22685C);
        }
        if (this.f22686D != null) {
            sb.append(", meta=");
            sb.append(this.f22686D);
        }
        if (this.f22687E != null) {
            sb.append(", category=");
            sb.append(this.f22687E);
        }
        if (this.f22688F != null) {
            sb.append(", p1=");
            sb.append(this.f22688F);
        }
        if (this.f22689G != null) {
            sb.append(", p2=");
            sb.append(this.f22689G);
        }
        if (!this.f22690H.isEmpty()) {
            sb.append(", values=");
            sb.append(this.f22690H);
        }
        if (this.f22691I != null) {
            sb.append(", dimensions=");
            sb.append(this.f22691I);
        }
        if (this.f22692J != null) {
            sb.append(", count=");
            sb.append(this.f22692J);
        }
        if (this.f22693K != null) {
            sb.append(", firstTime=");
            sb.append(this.f22693K);
        }
        if (this.f22694L != null) {
            sb.append(", lastTime=");
            sb.append(this.f22694L);
        }
        StringBuilder replace = sb.replace(0, 2, "Event{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.ev$a */
    public static final class C9233a extends C9194eh.C9195a {

        /* renamed from: A */
        public Long f22708A;

        /* renamed from: c */
        public C9241ey f22709c;

        /* renamed from: d */
        public String f22710d;

        /* renamed from: e */
        public Long f22711e;

        /* renamed from: f */
        public Long f22712f;

        /* renamed from: g */
        public String f22713g;

        /* renamed from: h */
        public Long f22714h;

        /* renamed from: i */
        public Long f22715i;

        /* renamed from: j */
        public C9247fa f22716j;

        /* renamed from: k */
        public C9229eu f22717k;

        /* renamed from: l */
        public C9268fh f22718l;

        /* renamed from: m */
        public Integer f22719m;

        /* renamed from: n */
        public Integer f22720n;

        /* renamed from: o */
        public C9238ex f22721o;

        /* renamed from: p */
        public C9256fd f22722p;

        /* renamed from: q */
        public String f22723q;

        /* renamed from: r */
        public String f22724r;

        /* renamed from: s */
        public C9253fc f22725s;

        /* renamed from: t */
        public String f22726t;

        /* renamed from: u */
        public String f22727u;

        /* renamed from: v */
        public String f22728v;

        /* renamed from: w */
        public List f22729w = C9217eo.m24675a();

        /* renamed from: x */
        public String f22730x;

        /* renamed from: y */
        public Integer f22731y;

        /* renamed from: z */
        public Long f22732z;

        /* renamed from: b */
        public final C9232ev mo58090b() {
            if (this.f22709c == null || this.f22710d == null || this.f22711e == null) {
                throw C9217eo.m24674a(this.f22709c, "type", this.f22710d, "name", this.f22711e, "time");
            }
            C9232ev evVar = r2;
            C9232ev evVar2 = new C9232ev(this.f22709c, this.f22710d, this.f22711e, this.f22712f, this.f22713g, this.f22714h, this.f22715i, this.f22716j, this.f22717k, this.f22718l, this.f22719m, this.f22720n, this.f22721o, this.f22722p, this.f22723q, this.f22724r, this.f22725s, this.f22726t, this.f22727u, this.f22728v, this.f22729w, this.f22730x, this.f22731y, this.f22732z, this.f22708A, super.mo57992a());
            return evVar;
        }
    }

    /* renamed from: com.tapjoy.internal.ev$b */
    static final class C9234b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9232ev evVar = (C9232ev) obj;
            int i = 0;
            int a = C9241ey.ADAPTER.mo57993a(1, (Object) evVar.f22695n) + C9197ej.f22611p.mo57993a(2, (Object) evVar.f22696o) + C9197ej.f22604i.mo57993a(3, (Object) evVar.f22697p) + (evVar.f22698q != null ? C9197ej.f22604i.mo57993a(19, (Object) evVar.f22698q) : 0) + (evVar.f22699r != null ? C9197ej.f22611p.mo57993a(20, (Object) evVar.f22699r) : 0) + (evVar.f22700s != null ? C9197ej.f22604i.mo57993a(21, (Object) evVar.f22700s) : 0) + (evVar.f22701t != null ? C9197ej.f22604i.mo57993a(4, (Object) evVar.f22701t) : 0) + (evVar.f22702u != null ? C9247fa.f22759c.mo57993a(5, (Object) evVar.f22702u) : 0) + (evVar.f22703v != null ? C9229eu.f22660c.mo57993a(6, (Object) evVar.f22703v) : 0) + (evVar.f22704w != null ? C9268fh.f22861c.mo57993a(7, (Object) evVar.f22704w) : 0) + (evVar.f22705x != null ? C9197ej.f22599d.mo57993a(8, (Object) evVar.f22705x) : 0) + (evVar.f22706y != null ? C9197ej.f22599d.mo57993a(9, (Object) evVar.f22706y) : 0) + (evVar.f22707z != null ? C9238ex.f22736c.mo57993a(10, (Object) evVar.f22707z) : 0) + (evVar.f22683A != null ? C9256fd.f22813c.mo57993a(11, (Object) evVar.f22683A) : 0) + (evVar.f22684B != null ? C9197ej.f22611p.mo57993a(12, (Object) evVar.f22684B) : 0) + (evVar.f22685C != null ? C9197ej.f22611p.mo57993a(13, (Object) evVar.f22685C) : 0) + (evVar.f22686D != null ? C9253fc.f22806c.mo57993a(18, (Object) evVar.f22686D) : 0) + (evVar.f22687E != null ? C9197ej.f22611p.mo57993a(14, (Object) evVar.f22687E) : 0) + (evVar.f22688F != null ? C9197ej.f22611p.mo57993a(15, (Object) evVar.f22688F) : 0) + (evVar.f22689G != null ? C9197ej.f22611p.mo57993a(16, (Object) evVar.f22689G) : 0) + C9243ez.f22746c.mo57994a().mo57993a(17, (Object) evVar.f22690H) + (evVar.f22691I != null ? C9197ej.f22611p.mo57993a(22, (Object) evVar.f22691I) : 0) + (evVar.f22692J != null ? C9197ej.f22599d.mo57993a(23, (Object) evVar.f22692J) : 0) + (evVar.f22693K != null ? C9197ej.f22604i.mo57993a(24, (Object) evVar.f22693K) : 0);
            if (evVar.f22694L != null) {
                i = C9197ej.f22604i.mo57993a(25, (Object) evVar.f22694L);
            }
            return a + i + evVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return m24820b(ekVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9232ev evVar = (C9232ev) obj;
            C9241ey.ADAPTER.mo57997a(elVar, 1, evVar.f22695n);
            C9197ej.f22611p.mo57997a(elVar, 2, evVar.f22696o);
            C9197ej.f22604i.mo57997a(elVar, 3, evVar.f22697p);
            if (evVar.f22698q != null) {
                C9197ej.f22604i.mo57997a(elVar, 19, evVar.f22698q);
            }
            if (evVar.f22699r != null) {
                C9197ej.f22611p.mo57997a(elVar, 20, evVar.f22699r);
            }
            if (evVar.f22700s != null) {
                C9197ej.f22604i.mo57997a(elVar, 21, evVar.f22700s);
            }
            if (evVar.f22701t != null) {
                C9197ej.f22604i.mo57997a(elVar, 4, evVar.f22701t);
            }
            if (evVar.f22702u != null) {
                C9247fa.f22759c.mo57997a(elVar, 5, evVar.f22702u);
            }
            if (evVar.f22703v != null) {
                C9229eu.f22660c.mo57997a(elVar, 6, evVar.f22703v);
            }
            if (evVar.f22704w != null) {
                C9268fh.f22861c.mo57997a(elVar, 7, evVar.f22704w);
            }
            if (evVar.f22705x != null) {
                C9197ej.f22599d.mo57997a(elVar, 8, evVar.f22705x);
            }
            if (evVar.f22706y != null) {
                C9197ej.f22599d.mo57997a(elVar, 9, evVar.f22706y);
            }
            if (evVar.f22707z != null) {
                C9238ex.f22736c.mo57997a(elVar, 10, evVar.f22707z);
            }
            if (evVar.f22683A != null) {
                C9256fd.f22813c.mo57997a(elVar, 11, evVar.f22683A);
            }
            if (evVar.f22684B != null) {
                C9197ej.f22611p.mo57997a(elVar, 12, evVar.f22684B);
            }
            if (evVar.f22685C != null) {
                C9197ej.f22611p.mo57997a(elVar, 13, evVar.f22685C);
            }
            if (evVar.f22686D != null) {
                C9253fc.f22806c.mo57997a(elVar, 18, evVar.f22686D);
            }
            if (evVar.f22687E != null) {
                C9197ej.f22611p.mo57997a(elVar, 14, evVar.f22687E);
            }
            if (evVar.f22688F != null) {
                C9197ej.f22611p.mo57997a(elVar, 15, evVar.f22688F);
            }
            if (evVar.f22689G != null) {
                C9197ej.f22611p.mo57997a(elVar, 16, evVar.f22689G);
            }
            C9243ez.f22746c.mo57994a().mo57997a(elVar, 17, evVar.f22690H);
            if (evVar.f22691I != null) {
                C9197ej.f22611p.mo57997a(elVar, 22, evVar.f22691I);
            }
            if (evVar.f22692J != null) {
                C9197ej.f22599d.mo57997a(elVar, 23, evVar.f22692J);
            }
            if (evVar.f22693K != null) {
                C9197ej.f22604i.mo57997a(elVar, 24, evVar.f22693K);
            }
            if (evVar.f22694L != null) {
                C9197ej.f22604i.mo57997a(elVar, 25, evVar.f22694L);
            }
            elVar.mo58009a(evVar.mo57988a());
        }

        C9234b() {
            super(C9192eg.LENGTH_DELIMITED, C9232ev.class);
        }

        /* renamed from: b */
        private static C9232ev m24820b(C9213ek ekVar) {
            C9233a aVar = new C9233a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            try {
                                aVar.f22709c = (C9241ey) C9241ey.ADAPTER.mo57985a(ekVar);
                                break;
                            } catch (C9197ej.C9212a e) {
                                aVar.mo57990a(b, C9192eg.VARINT, Long.valueOf((long) e.f22617a));
                                break;
                            }
                        case 2:
                            aVar.f22710d = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 3:
                            aVar.f22711e = (Long) C9197ej.f22604i.mo57985a(ekVar);
                            break;
                        case 4:
                            aVar.f22715i = (Long) C9197ej.f22604i.mo57985a(ekVar);
                            break;
                        case 5:
                            aVar.f22716j = (C9247fa) C9247fa.f22759c.mo57985a(ekVar);
                            break;
                        case 6:
                            aVar.f22717k = (C9229eu) C9229eu.f22660c.mo57985a(ekVar);
                            break;
                        case 7:
                            aVar.f22718l = (C9268fh) C9268fh.f22861c.mo57985a(ekVar);
                            break;
                        case 8:
                            aVar.f22719m = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                            break;
                        case 9:
                            aVar.f22720n = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                            break;
                        case 10:
                            aVar.f22721o = (C9238ex) C9238ex.f22736c.mo57985a(ekVar);
                            break;
                        case 11:
                            aVar.f22722p = (C9256fd) C9256fd.f22813c.mo57985a(ekVar);
                            break;
                        case 12:
                            aVar.f22723q = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 13:
                            aVar.f22724r = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 14:
                            aVar.f22726t = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 15:
                            aVar.f22727u = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 16:
                            aVar.f22728v = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 17:
                            aVar.f22729w.add(C9243ez.f22746c.mo57985a(ekVar));
                            break;
                        case 18:
                            aVar.f22725s = (C9253fc) C9253fc.f22806c.mo57985a(ekVar);
                            break;
                        case 19:
                            aVar.f22712f = (Long) C9197ej.f22604i.mo57985a(ekVar);
                            break;
                        case 20:
                            aVar.f22713g = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 21:
                            aVar.f22714h = (Long) C9197ej.f22604i.mo57985a(ekVar);
                            break;
                        case 22:
                            aVar.f22730x = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 23:
                            aVar.f22731y = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                            break;
                        case 24:
                            aVar.f22732z = (Long) C9197ej.f22604i.mo57985a(ekVar);
                            break;
                        case 25:
                            aVar.f22708A = (Long) C9197ej.f22604i.mo57985a(ekVar);
                            break;
                        default:
                            C9192eg c = ekVar.mo58003c();
                            aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                            break;
                    }
                } else {
                    ekVar.mo58001a(a);
                    return aVar.mo58090b();
                }
            }
        }
    }
}
