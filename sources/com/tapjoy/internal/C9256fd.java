package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;

/* renamed from: com.tapjoy.internal.fd */
public final class C9256fd extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22813c = new C9258b();

    /* renamed from: d */
    public static final Integer f22814d = 1;

    /* renamed from: e */
    public static final Double f22815e = Double.valueOf(0.0d);

    /* renamed from: f */
    public static final Integer f22816f = 0;

    /* renamed from: g */
    public static final Long f22817g = 0L;

    /* renamed from: h */
    public final String f22818h;

    /* renamed from: i */
    public final Integer f22819i;

    /* renamed from: j */
    public final Double f22820j;

    /* renamed from: k */
    public final String f22821k;

    /* renamed from: l */
    public final String f22822l;

    /* renamed from: m */
    public final String f22823m;

    /* renamed from: n */
    public final String f22824n;

    /* renamed from: o */
    public final String f22825o;

    /* renamed from: p */
    public final Integer f22826p;

    /* renamed from: q */
    public final Long f22827q;

    /* renamed from: r */
    public final String f22828r;

    /* renamed from: s */
    public final String f22829s;

    /* renamed from: t */
    public final String f22830t;

    /* renamed from: u */
    public final String f22831u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9256fd(String str, Integer num, Double d, String str2, String str3, String str4, String str5, String str6, Integer num2, Long l, String str7, String str8, String str9, String str10, C9434iu iuVar) {
        super(f22813c, iuVar);
        this.f22818h = str;
        this.f22819i = num;
        this.f22820j = d;
        this.f22821k = str2;
        this.f22822l = str3;
        this.f22823m = str4;
        this.f22824n = str5;
        this.f22825o = str6;
        this.f22826p = num2;
        this.f22827q = l;
        this.f22828r = str7;
        this.f22829s = str8;
        this.f22830t = str9;
        this.f22831u = str10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9256fd)) {
            return false;
        }
        C9256fd fdVar = (C9256fd) obj;
        return mo57988a().equals(fdVar.mo57988a()) && this.f22818h.equals(fdVar.f22818h) && C9217eo.m24677a((Object) this.f22819i, (Object) fdVar.f22819i) && C9217eo.m24677a((Object) this.f22820j, (Object) fdVar.f22820j) && C9217eo.m24677a((Object) this.f22821k, (Object) fdVar.f22821k) && C9217eo.m24677a((Object) this.f22822l, (Object) fdVar.f22822l) && C9217eo.m24677a((Object) this.f22823m, (Object) fdVar.f22823m) && C9217eo.m24677a((Object) this.f22824n, (Object) fdVar.f22824n) && C9217eo.m24677a((Object) this.f22825o, (Object) fdVar.f22825o) && C9217eo.m24677a((Object) this.f22826p, (Object) fdVar.f22826p) && C9217eo.m24677a((Object) this.f22827q, (Object) fdVar.f22827q) && C9217eo.m24677a((Object) this.f22828r, (Object) fdVar.f22828r) && C9217eo.m24677a((Object) this.f22829s, (Object) fdVar.f22829s) && C9217eo.m24677a((Object) this.f22830t, (Object) fdVar.f22830t) && C9217eo.m24677a((Object) this.f22831u, (Object) fdVar.f22831u);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((mo57988a().hashCode() * 37) + this.f22818h.hashCode()) * 37;
        Integer num = this.f22819i;
        int i2 = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Double d = this.f22820j;
        int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 37;
        String str = this.f22821k;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f22822l;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f22823m;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f22824n;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.f22825o;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num2 = this.f22826p;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Long l = this.f22827q;
        int hashCode10 = (hashCode9 + (l != null ? l.hashCode() : 0)) * 37;
        String str6 = this.f22828r;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.f22829s;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.f22830t;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.f22831u;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        int i3 = hashCode13 + i2;
        this.f22593b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", productId=");
        sb.append(this.f22818h);
        if (this.f22819i != null) {
            sb.append(", productQuantity=");
            sb.append(this.f22819i);
        }
        if (this.f22820j != null) {
            sb.append(", productPrice=");
            sb.append(this.f22820j);
        }
        if (this.f22821k != null) {
            sb.append(", productPriceCurrency=");
            sb.append(this.f22821k);
        }
        if (this.f22822l != null) {
            sb.append(", productType=");
            sb.append(this.f22822l);
        }
        if (this.f22823m != null) {
            sb.append(", productTitle=");
            sb.append(this.f22823m);
        }
        if (this.f22824n != null) {
            sb.append(", productDescription=");
            sb.append(this.f22824n);
        }
        if (this.f22825o != null) {
            sb.append(", transactionId=");
            sb.append(this.f22825o);
        }
        if (this.f22826p != null) {
            sb.append(", transactionState=");
            sb.append(this.f22826p);
        }
        if (this.f22827q != null) {
            sb.append(", transactionDate=");
            sb.append(this.f22827q);
        }
        if (this.f22828r != null) {
            sb.append(", campaignId=");
            sb.append(this.f22828r);
        }
        if (this.f22829s != null) {
            sb.append(", currencyPrice=");
            sb.append(this.f22829s);
        }
        if (this.f22830t != null) {
            sb.append(", receipt=");
            sb.append(this.f22830t);
        }
        if (this.f22831u != null) {
            sb.append(", signature=");
            sb.append(this.f22831u);
        }
        StringBuilder replace = sb.replace(0, 2, "Purchase{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fd$a */
    public static final class C9257a extends C9194eh.C9195a {

        /* renamed from: c */
        public String f22832c;

        /* renamed from: d */
        public Integer f22833d;

        /* renamed from: e */
        public Double f22834e;

        /* renamed from: f */
        public String f22835f;

        /* renamed from: g */
        public String f22836g;

        /* renamed from: h */
        public String f22837h;

        /* renamed from: i */
        public String f22838i;

        /* renamed from: j */
        public String f22839j;

        /* renamed from: k */
        public Integer f22840k;

        /* renamed from: l */
        public Long f22841l;

        /* renamed from: m */
        public String f22842m;

        /* renamed from: n */
        public String f22843n;

        /* renamed from: o */
        public String f22844o;

        /* renamed from: p */
        public String f22845p;

        /* renamed from: b */
        public final C9256fd mo58111b() {
            String str = this.f22832c;
            if (str != null) {
                return new C9256fd(this.f22832c, this.f22833d, this.f22834e, this.f22835f, this.f22836g, this.f22837h, this.f22838i, this.f22839j, this.f22840k, this.f22841l, this.f22842m, this.f22843n, this.f22844o, this.f22845p, super.mo57992a());
            }
            throw C9217eo.m24674a(str, "productId");
        }
    }

    /* renamed from: com.tapjoy.internal.fd$b */
    static final class C9258b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9256fd fdVar = (C9256fd) obj;
            int i = 0;
            int a = C9197ej.f22611p.mo57993a(1, (Object) fdVar.f22818h) + (fdVar.f22819i != null ? C9197ej.f22599d.mo57993a(2, (Object) fdVar.f22819i) : 0) + (fdVar.f22820j != null ? C9197ej.f22610o.mo57993a(3, (Object) fdVar.f22820j) : 0) + (fdVar.f22821k != null ? C9197ej.f22611p.mo57993a(4, (Object) fdVar.f22821k) : 0) + (fdVar.f22822l != null ? C9197ej.f22611p.mo57993a(5, (Object) fdVar.f22822l) : 0) + (fdVar.f22823m != null ? C9197ej.f22611p.mo57993a(6, (Object) fdVar.f22823m) : 0) + (fdVar.f22824n != null ? C9197ej.f22611p.mo57993a(7, (Object) fdVar.f22824n) : 0) + (fdVar.f22825o != null ? C9197ej.f22611p.mo57993a(8, (Object) fdVar.f22825o) : 0) + (fdVar.f22826p != null ? C9197ej.f22599d.mo57993a(9, (Object) fdVar.f22826p) : 0) + (fdVar.f22827q != null ? C9197ej.f22604i.mo57993a(10, (Object) fdVar.f22827q) : 0) + (fdVar.f22828r != null ? C9197ej.f22611p.mo57993a(11, (Object) fdVar.f22828r) : 0) + (fdVar.f22829s != null ? C9197ej.f22611p.mo57993a(12, (Object) fdVar.f22829s) : 0) + (fdVar.f22830t != null ? C9197ej.f22611p.mo57993a(13, (Object) fdVar.f22830t) : 0);
            if (fdVar.f22831u != null) {
                i = C9197ej.f22611p.mo57993a(14, (Object) fdVar.f22831u);
            }
            return a + i + fdVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9256fd fdVar = (C9256fd) obj;
            C9197ej.f22611p.mo57997a(elVar, 1, fdVar.f22818h);
            if (fdVar.f22819i != null) {
                C9197ej.f22599d.mo57997a(elVar, 2, fdVar.f22819i);
            }
            if (fdVar.f22820j != null) {
                C9197ej.f22610o.mo57997a(elVar, 3, fdVar.f22820j);
            }
            if (fdVar.f22821k != null) {
                C9197ej.f22611p.mo57997a(elVar, 4, fdVar.f22821k);
            }
            if (fdVar.f22822l != null) {
                C9197ej.f22611p.mo57997a(elVar, 5, fdVar.f22822l);
            }
            if (fdVar.f22823m != null) {
                C9197ej.f22611p.mo57997a(elVar, 6, fdVar.f22823m);
            }
            if (fdVar.f22824n != null) {
                C9197ej.f22611p.mo57997a(elVar, 7, fdVar.f22824n);
            }
            if (fdVar.f22825o != null) {
                C9197ej.f22611p.mo57997a(elVar, 8, fdVar.f22825o);
            }
            if (fdVar.f22826p != null) {
                C9197ej.f22599d.mo57997a(elVar, 9, fdVar.f22826p);
            }
            if (fdVar.f22827q != null) {
                C9197ej.f22604i.mo57997a(elVar, 10, fdVar.f22827q);
            }
            if (fdVar.f22828r != null) {
                C9197ej.f22611p.mo57997a(elVar, 11, fdVar.f22828r);
            }
            if (fdVar.f22829s != null) {
                C9197ej.f22611p.mo57997a(elVar, 12, fdVar.f22829s);
            }
            if (fdVar.f22830t != null) {
                C9197ej.f22611p.mo57997a(elVar, 13, fdVar.f22830t);
            }
            if (fdVar.f22831u != null) {
                C9197ej.f22611p.mo57997a(elVar, 14, fdVar.f22831u);
            }
            elVar.mo58009a(fdVar.mo57988a());
        }

        C9258b() {
            super(C9192eg.LENGTH_DELIMITED, C9256fd.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9257a aVar = new C9257a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            aVar.f22832c = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 2:
                            aVar.f22833d = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                            break;
                        case 3:
                            aVar.f22834e = (Double) C9197ej.f22610o.mo57985a(ekVar);
                            break;
                        case 4:
                            aVar.f22835f = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 5:
                            aVar.f22836g = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 6:
                            aVar.f22837h = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 7:
                            aVar.f22838i = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 8:
                            aVar.f22839j = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 9:
                            aVar.f22840k = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                            break;
                        case 10:
                            aVar.f22841l = (Long) C9197ej.f22604i.mo57985a(ekVar);
                            break;
                        case 11:
                            aVar.f22842m = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 12:
                            aVar.f22843n = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 13:
                            aVar.f22844o = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 14:
                            aVar.f22845p = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        default:
                            C9192eg c = ekVar.mo58003c();
                            aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                            break;
                    }
                } else {
                    ekVar.mo58001a(a);
                    return aVar.mo58111b();
                }
            }
        }
    }
}
