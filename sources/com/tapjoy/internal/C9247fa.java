package com.tapjoy.internal;

import com.tapjoy.internal.C9194eh;

/* renamed from: com.tapjoy.internal.fa */
public final class C9247fa extends C9194eh {

    /* renamed from: c */
    public static final C9197ej f22759c = new C9249b();

    /* renamed from: d */
    public static final Integer f22760d = 0;

    /* renamed from: e */
    public static final Integer f22761e = 0;

    /* renamed from: f */
    public static final Integer f22762f = 0;

    /* renamed from: g */
    public final String f22763g;

    /* renamed from: h */
    public final String f22764h;

    /* renamed from: i */
    public final String f22765i;

    /* renamed from: j */
    public final String f22766j;

    /* renamed from: k */
    public final String f22767k;

    /* renamed from: l */
    public final String f22768l;

    /* renamed from: m */
    public final Integer f22769m;

    /* renamed from: n */
    public final Integer f22770n;

    /* renamed from: o */
    public final Integer f22771o;

    /* renamed from: p */
    public final String f22772p;

    /* renamed from: q */
    public final String f22773q;

    /* renamed from: r */
    public final String f22774r;

    /* renamed from: s */
    public final String f22775s;

    /* renamed from: t */
    public final String f22776t;

    /* renamed from: u */
    public final String f22777u;

    /* renamed from: v */
    public final String f22778v;

    /* renamed from: w */
    public final String f22779w;

    /* renamed from: x */
    public final String f22780x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9247fa(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, C9434iu iuVar) {
        super(f22759c, iuVar);
        this.f22763g = str;
        this.f22764h = str2;
        this.f22765i = str3;
        this.f22766j = str4;
        this.f22767k = str5;
        this.f22768l = str6;
        this.f22769m = num;
        this.f22770n = num2;
        this.f22771o = num3;
        this.f22772p = str7;
        this.f22773q = str8;
        this.f22774r = str9;
        this.f22775s = str10;
        this.f22776t = str11;
        this.f22777u = str12;
        this.f22778v = str13;
        this.f22779w = str14;
        this.f22780x = str15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9247fa)) {
            return false;
        }
        C9247fa faVar = (C9247fa) obj;
        return mo57988a().equals(faVar.mo57988a()) && C9217eo.m24677a((Object) this.f22763g, (Object) faVar.f22763g) && C9217eo.m24677a((Object) this.f22764h, (Object) faVar.f22764h) && C9217eo.m24677a((Object) this.f22765i, (Object) faVar.f22765i) && C9217eo.m24677a((Object) this.f22766j, (Object) faVar.f22766j) && C9217eo.m24677a((Object) this.f22767k, (Object) faVar.f22767k) && C9217eo.m24677a((Object) this.f22768l, (Object) faVar.f22768l) && C9217eo.m24677a((Object) this.f22769m, (Object) faVar.f22769m) && C9217eo.m24677a((Object) this.f22770n, (Object) faVar.f22770n) && C9217eo.m24677a((Object) this.f22771o, (Object) faVar.f22771o) && C9217eo.m24677a((Object) this.f22772p, (Object) faVar.f22772p) && C9217eo.m24677a((Object) this.f22773q, (Object) faVar.f22773q) && C9217eo.m24677a((Object) this.f22774r, (Object) faVar.f22774r) && C9217eo.m24677a((Object) this.f22775s, (Object) faVar.f22775s) && C9217eo.m24677a((Object) this.f22776t, (Object) faVar.f22776t) && C9217eo.m24677a((Object) this.f22777u, (Object) faVar.f22777u) && C9217eo.m24677a((Object) this.f22778v, (Object) faVar.f22778v) && C9217eo.m24677a((Object) this.f22779w, (Object) faVar.f22779w) && C9217eo.m24677a((Object) this.f22780x, (Object) faVar.f22780x);
    }

    public final int hashCode() {
        int i = this.f22593b;
        if (i != 0) {
            return i;
        }
        int hashCode = mo57988a().hashCode() * 37;
        String str = this.f22763g;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f22764h;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f22765i;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f22766j;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.f22767k;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.f22768l;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Integer num = this.f22769m;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.f22770n;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.f22771o;
        int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str7 = this.f22772p;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.f22773q;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.f22774r;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.f22775s;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.f22776t;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.f22777u;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.f22778v;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.f22779w;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.f22780x;
        if (str15 != null) {
            i2 = str15.hashCode();
        }
        int i3 = hashCode18 + i2;
        this.f22593b = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f22763g != null) {
            sb.append(", mac=");
            sb.append(this.f22763g);
        }
        if (this.f22764h != null) {
            sb.append(", deviceId=");
            sb.append(this.f22764h);
        }
        if (this.f22765i != null) {
            sb.append(", deviceMaker=");
            sb.append(this.f22765i);
        }
        if (this.f22766j != null) {
            sb.append(", deviceModel=");
            sb.append(this.f22766j);
        }
        if (this.f22767k != null) {
            sb.append(", osName=");
            sb.append(this.f22767k);
        }
        if (this.f22768l != null) {
            sb.append(", osVer=");
            sb.append(this.f22768l);
        }
        if (this.f22769m != null) {
            sb.append(", displayD=");
            sb.append(this.f22769m);
        }
        if (this.f22770n != null) {
            sb.append(", displayW=");
            sb.append(this.f22770n);
        }
        if (this.f22771o != null) {
            sb.append(", displayH=");
            sb.append(this.f22771o);
        }
        if (this.f22772p != null) {
            sb.append(", locale=");
            sb.append(this.f22772p);
        }
        if (this.f22773q != null) {
            sb.append(", timezone=");
            sb.append(this.f22773q);
        }
        if (this.f22774r != null) {
            sb.append(", pkgId=");
            sb.append(this.f22774r);
        }
        if (this.f22775s != null) {
            sb.append(", pkgSign=");
            sb.append(this.f22775s);
        }
        if (this.f22776t != null) {
            sb.append(", sdk=");
            sb.append(this.f22776t);
        }
        if (this.f22777u != null) {
            sb.append(", countrySim=");
            sb.append(this.f22777u);
        }
        if (this.f22778v != null) {
            sb.append(", countryNet=");
            sb.append(this.f22778v);
        }
        if (this.f22779w != null) {
            sb.append(", imei=");
            sb.append(this.f22779w);
        }
        if (this.f22780x != null) {
            sb.append(", androidId=");
            sb.append(this.f22780x);
        }
        StringBuilder replace = sb.replace(0, 2, "Info{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.tapjoy.internal.fa$a */
    public static final class C9248a extends C9194eh.C9195a {

        /* renamed from: c */
        public String f22781c;

        /* renamed from: d */
        public String f22782d;

        /* renamed from: e */
        public String f22783e;

        /* renamed from: f */
        public String f22784f;

        /* renamed from: g */
        public String f22785g;

        /* renamed from: h */
        public String f22786h;

        /* renamed from: i */
        public Integer f22787i;

        /* renamed from: j */
        public Integer f22788j;

        /* renamed from: k */
        public Integer f22789k;

        /* renamed from: l */
        public String f22790l;

        /* renamed from: m */
        public String f22791m;

        /* renamed from: n */
        public String f22792n;

        /* renamed from: o */
        public String f22793o;

        /* renamed from: p */
        public String f22794p;

        /* renamed from: q */
        public String f22795q;

        /* renamed from: r */
        public String f22796r;

        /* renamed from: s */
        public String f22797s;

        /* renamed from: t */
        public String f22798t;

        /* renamed from: b */
        public final C9247fa mo58102b() {
            return new C9247fa(this.f22781c, this.f22782d, this.f22783e, this.f22784f, this.f22785g, this.f22786h, this.f22787i, this.f22788j, this.f22789k, this.f22790l, this.f22791m, this.f22792n, this.f22793o, this.f22794p, this.f22795q, this.f22796r, this.f22797s, this.f22798t, super.mo57992a());
        }
    }

    /* renamed from: com.tapjoy.internal.fa$b */
    static final class C9249b extends C9197ej {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            C9247fa faVar = (C9247fa) obj;
            int i = 0;
            int a = (faVar.f22763g != null ? C9197ej.f22611p.mo57993a(1, (Object) faVar.f22763g) : 0) + (faVar.f22764h != null ? C9197ej.f22611p.mo57993a(2, (Object) faVar.f22764h) : 0) + (faVar.f22765i != null ? C9197ej.f22611p.mo57993a(3, (Object) faVar.f22765i) : 0) + (faVar.f22766j != null ? C9197ej.f22611p.mo57993a(4, (Object) faVar.f22766j) : 0) + (faVar.f22767k != null ? C9197ej.f22611p.mo57993a(5, (Object) faVar.f22767k) : 0) + (faVar.f22768l != null ? C9197ej.f22611p.mo57993a(6, (Object) faVar.f22768l) : 0) + (faVar.f22769m != null ? C9197ej.f22599d.mo57993a(7, (Object) faVar.f22769m) : 0) + (faVar.f22770n != null ? C9197ej.f22599d.mo57993a(8, (Object) faVar.f22770n) : 0) + (faVar.f22771o != null ? C9197ej.f22599d.mo57993a(9, (Object) faVar.f22771o) : 0) + (faVar.f22772p != null ? C9197ej.f22611p.mo57993a(10, (Object) faVar.f22772p) : 0) + (faVar.f22773q != null ? C9197ej.f22611p.mo57993a(11, (Object) faVar.f22773q) : 0) + (faVar.f22774r != null ? C9197ej.f22611p.mo57993a(12, (Object) faVar.f22774r) : 0) + (faVar.f22775s != null ? C9197ej.f22611p.mo57993a(13, (Object) faVar.f22775s) : 0) + (faVar.f22776t != null ? C9197ej.f22611p.mo57993a(14, (Object) faVar.f22776t) : 0) + (faVar.f22777u != null ? C9197ej.f22611p.mo57993a(15, (Object) faVar.f22777u) : 0) + (faVar.f22778v != null ? C9197ej.f22611p.mo57993a(16, (Object) faVar.f22778v) : 0) + (faVar.f22779w != null ? C9197ej.f22611p.mo57993a(17, (Object) faVar.f22779w) : 0);
            if (faVar.f22780x != null) {
                i = C9197ej.f22611p.mo57993a(18, (Object) faVar.f22780x);
            }
            return a + i + faVar.mo57988a().mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            C9247fa faVar = (C9247fa) obj;
            if (faVar.f22763g != null) {
                C9197ej.f22611p.mo57997a(elVar, 1, faVar.f22763g);
            }
            if (faVar.f22764h != null) {
                C9197ej.f22611p.mo57997a(elVar, 2, faVar.f22764h);
            }
            if (faVar.f22765i != null) {
                C9197ej.f22611p.mo57997a(elVar, 3, faVar.f22765i);
            }
            if (faVar.f22766j != null) {
                C9197ej.f22611p.mo57997a(elVar, 4, faVar.f22766j);
            }
            if (faVar.f22767k != null) {
                C9197ej.f22611p.mo57997a(elVar, 5, faVar.f22767k);
            }
            if (faVar.f22768l != null) {
                C9197ej.f22611p.mo57997a(elVar, 6, faVar.f22768l);
            }
            if (faVar.f22769m != null) {
                C9197ej.f22599d.mo57997a(elVar, 7, faVar.f22769m);
            }
            if (faVar.f22770n != null) {
                C9197ej.f22599d.mo57997a(elVar, 8, faVar.f22770n);
            }
            if (faVar.f22771o != null) {
                C9197ej.f22599d.mo57997a(elVar, 9, faVar.f22771o);
            }
            if (faVar.f22772p != null) {
                C9197ej.f22611p.mo57997a(elVar, 10, faVar.f22772p);
            }
            if (faVar.f22773q != null) {
                C9197ej.f22611p.mo57997a(elVar, 11, faVar.f22773q);
            }
            if (faVar.f22774r != null) {
                C9197ej.f22611p.mo57997a(elVar, 12, faVar.f22774r);
            }
            if (faVar.f22775s != null) {
                C9197ej.f22611p.mo57997a(elVar, 13, faVar.f22775s);
            }
            if (faVar.f22776t != null) {
                C9197ej.f22611p.mo57997a(elVar, 14, faVar.f22776t);
            }
            if (faVar.f22777u != null) {
                C9197ej.f22611p.mo57997a(elVar, 15, faVar.f22777u);
            }
            if (faVar.f22778v != null) {
                C9197ej.f22611p.mo57997a(elVar, 16, faVar.f22778v);
            }
            if (faVar.f22779w != null) {
                C9197ej.f22611p.mo57997a(elVar, 17, faVar.f22779w);
            }
            if (faVar.f22780x != null) {
                C9197ej.f22611p.mo57997a(elVar, 18, faVar.f22780x);
            }
            elVar.mo58009a(faVar.mo57988a());
        }

        C9249b() {
            super(C9192eg.LENGTH_DELIMITED, C9247fa.class);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            C9248a aVar = new C9248a();
            long a = ekVar.mo58000a();
            while (true) {
                int b = ekVar.mo58002b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            aVar.f22781c = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 2:
                            aVar.f22782d = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 3:
                            aVar.f22783e = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 4:
                            aVar.f22784f = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 5:
                            aVar.f22785g = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 6:
                            aVar.f22786h = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 7:
                            aVar.f22787i = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                            break;
                        case 8:
                            aVar.f22788j = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                            break;
                        case 9:
                            aVar.f22789k = (Integer) C9197ej.f22599d.mo57985a(ekVar);
                            break;
                        case 10:
                            aVar.f22790l = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 11:
                            aVar.f22791m = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 12:
                            aVar.f22792n = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 13:
                            aVar.f22793o = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 14:
                            aVar.f22794p = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 15:
                            aVar.f22795q = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 16:
                            aVar.f22796r = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 17:
                            aVar.f22797s = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        case 18:
                            aVar.f22798t = (String) C9197ej.f22611p.mo57985a(ekVar);
                            break;
                        default:
                            C9192eg c = ekVar.mo58003c();
                            aVar.mo57990a(b, c, c.mo57987a().mo57985a(ekVar));
                            break;
                    }
                } else {
                    ekVar.mo58001a(a);
                    return aVar.mo58102b();
                }
            }
        }
    }
}
