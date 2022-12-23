package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p265ob.C11464kh;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.X3 */
public class C10910X3 {

    /* renamed from: a */
    public final C11464kh.C11466b f26219a;

    /* renamed from: b */
    public final C10911a f26220b;

    /* renamed from: c */
    public final ResultReceiver f26221c;

    /* renamed from: com.yandex.metrica.impl.ob.X3$a */
    public static class C10911a implements C11115ch<C10911a, C10911a> {

        /* renamed from: a */
        public final String f26222a;

        /* renamed from: b */
        public final String f26223b;

        /* renamed from: c */
        public final String f26224c;

        /* renamed from: d */
        public final String f26225d;

        /* renamed from: e */
        public final Boolean f26226e;

        /* renamed from: f */
        public final Location f26227f;

        /* renamed from: g */
        public final Boolean f26228g;

        /* renamed from: h */
        public final Integer f26229h;

        /* renamed from: i */
        public final Integer f26230i;

        /* renamed from: j */
        public final Integer f26231j;

        /* renamed from: k */
        public final Boolean f26232k;

        /* renamed from: l */
        public final Boolean f26233l;

        /* renamed from: m */
        public final Map<String, String> f26234m;

        /* renamed from: n */
        public final Integer f26235n;

        /* renamed from: o */
        public final Boolean f26236o;

        /* renamed from: p */
        public final Boolean f26237p;

        /* renamed from: q */
        public final Boolean f26238q;

        C10911a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
            this.f26222a = str;
            this.f26223b = str2;
            this.f26224c = str3;
            this.f26225d = str4;
            this.f26226e = bool;
            this.f26227f = location;
            this.f26228g = bool2;
            this.f26229h = num;
            this.f26230i = num2;
            this.f26231j = num3;
            this.f26232k = bool3;
            this.f26233l = bool4;
            this.f26234m = map;
            this.f26235n = num4;
            this.f26236o = bool5;
            this.f26237p = bool6;
            this.f26238q = bool7;
        }

        /* renamed from: b */
        public boolean mo62468b(Object obj) {
            return equals((C10911a) obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10911a.class != obj.getClass()) {
                return false;
            }
            C10911a aVar = (C10911a) obj;
            String str = this.f26222a;
            if (str == null ? aVar.f26222a != null : !str.equals(aVar.f26222a)) {
                return false;
            }
            String str2 = this.f26223b;
            if (str2 == null ? aVar.f26223b != null : !str2.equals(aVar.f26223b)) {
                return false;
            }
            String str3 = this.f26224c;
            if (str3 == null ? aVar.f26224c != null : !str3.equals(aVar.f26224c)) {
                return false;
            }
            String str4 = this.f26225d;
            if (str4 == null ? aVar.f26225d != null : !str4.equals(aVar.f26225d)) {
                return false;
            }
            Boolean bool = this.f26226e;
            if (bool == null ? aVar.f26226e != null : !bool.equals(aVar.f26226e)) {
                return false;
            }
            Location location = this.f26227f;
            if (location == null ? aVar.f26227f != null : !location.equals(aVar.f26227f)) {
                return false;
            }
            Boolean bool2 = this.f26228g;
            if (bool2 == null ? aVar.f26228g != null : !bool2.equals(aVar.f26228g)) {
                return false;
            }
            Integer num = this.f26229h;
            if (num == null ? aVar.f26229h != null : !num.equals(aVar.f26229h)) {
                return false;
            }
            Integer num2 = this.f26230i;
            if (num2 == null ? aVar.f26230i != null : !num2.equals(aVar.f26230i)) {
                return false;
            }
            Integer num3 = this.f26231j;
            if (num3 == null ? aVar.f26231j != null : !num3.equals(aVar.f26231j)) {
                return false;
            }
            Boolean bool3 = this.f26232k;
            if (bool3 == null ? aVar.f26232k != null : !bool3.equals(aVar.f26232k)) {
                return false;
            }
            Boolean bool4 = this.f26233l;
            if (bool4 == null ? aVar.f26233l != null : !bool4.equals(aVar.f26233l)) {
                return false;
            }
            Map<String, String> map = this.f26234m;
            if (map == null ? aVar.f26234m != null : !map.equals(aVar.f26234m)) {
                return false;
            }
            Integer num4 = this.f26235n;
            if (num4 == null ? aVar.f26235n != null : !num4.equals(aVar.f26235n)) {
                return false;
            }
            Boolean bool5 = this.f26236o;
            if (bool5 == null ? aVar.f26236o != null : !bool5.equals(aVar.f26236o)) {
                return false;
            }
            Boolean bool6 = this.f26237p;
            if (bool6 == null ? aVar.f26237p != null : !bool6.equals(aVar.f26237p)) {
                return false;
            }
            Boolean bool7 = this.f26238q;
            if (bool7 != null) {
                return bool7.equals(aVar.f26238q);
            }
            if (aVar.f26238q == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f26222a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f26223b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f26224c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f26225d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f26226e;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f26227f;
            int hashCode6 = (hashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.f26228g;
            int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num = this.f26229h;
            int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f26230i;
            int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f26231j;
            int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool3 = this.f26232k;
            int hashCode11 = (hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.f26233l;
            int hashCode12 = (hashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Map<String, String> map = this.f26234m;
            int hashCode13 = (hashCode12 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.f26235n;
            int hashCode14 = (hashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool5 = this.f26236o;
            int hashCode15 = (hashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.f26237p;
            int hashCode16 = (hashCode15 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.f26238q;
            if (bool7 != null) {
                i = bool7.hashCode();
            }
            return hashCode16 + i;
        }

        /* renamed from: a */
        public C10911a mo62467a(C10911a aVar) {
            C10911a aVar2 = aVar;
            String str = this.f26222a;
            String str2 = aVar2.f26222a;
            if (str == null) {
                str = str2;
            }
            String str3 = this.f26223b;
            String str4 = aVar2.f26223b;
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = this.f26224c;
            String str6 = aVar2.f26224c;
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = this.f26225d;
            String str8 = aVar2.f26225d;
            if (str7 == null) {
                str7 = str8;
            }
            Boolean bool = this.f26226e;
            Boolean bool2 = aVar2.f26226e;
            if (bool == null) {
                bool = bool2;
            }
            Location location = this.f26227f;
            Location location2 = aVar2.f26227f;
            if (location == null) {
                location = location2;
            }
            Boolean bool3 = this.f26228g;
            Boolean bool4 = aVar2.f26228g;
            if (bool3 == null) {
                bool3 = bool4;
            }
            Integer num = this.f26229h;
            Integer num2 = aVar2.f26229h;
            if (num == null) {
                num = num2;
            }
            Integer num3 = this.f26230i;
            Integer num4 = aVar2.f26230i;
            if (num3 == null) {
                num3 = num4;
            }
            Integer num5 = this.f26231j;
            Integer num6 = aVar2.f26231j;
            if (num5 == null) {
                num5 = num6;
            }
            Boolean bool5 = this.f26232k;
            Boolean bool6 = aVar2.f26232k;
            if (bool5 == null) {
                bool5 = bool6;
            }
            Boolean bool7 = this.f26233l;
            Boolean bool8 = aVar2.f26233l;
            if (bool7 == null) {
                bool7 = bool8;
            }
            Map<String, String> map = this.f26234m;
            Map<String, String> map2 = aVar2.f26234m;
            if (map == null) {
                map = map2;
            }
            Integer num7 = this.f26235n;
            Map<String, String> map3 = map;
            Integer num8 = aVar2.f26235n;
            if (num7 == null) {
                num7 = num8;
            }
            Boolean bool9 = this.f26236o;
            Integer num9 = num7;
            Boolean bool10 = bool9 == null ? aVar2.f26236o : bool9;
            Boolean bool11 = this.f26237p;
            Boolean bool12 = bool11 == null ? aVar2.f26237p : bool11;
            Boolean bool13 = this.f26238q;
            return new C10911a(str, str3, str5, str7, bool, location, bool3, num, num3, num5, bool5, bool7, map3, num9, bool10, bool12, bool13 == null ? aVar2.f26238q : bool13);
        }

        public C10911a(CounterConfiguration counterConfiguration, Map<String, String> map) {
            this(counterConfiguration.mo60803d(), counterConfiguration.mo60801c(), counterConfiguration.mo60798b(), counterConfiguration.mo60794a(), counterConfiguration.mo60816o(), counterConfiguration.mo60808g(), counterConfiguration.mo60815n(), counterConfiguration.mo60813l(), counterConfiguration.mo60809h(), counterConfiguration.mo60806e(), counterConfiguration.mo60817p(), counterConfiguration.mo60814m(), map, counterConfiguration.mo60810i(), counterConfiguration.mo60811j(), counterConfiguration.mo60807f(), counterConfiguration.mo60818q());
        }

        public C10911a() {
            this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (Location) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Map<String, String>) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null);
        }
    }

    public C10910X3(C10770T3 t3) {
        this(new C11464kh.C11466b(t3), new C10911a(t3.mo62272b(), t3.mo62271a().mo62329a()), t3.mo62271a().mo62336c());
    }

    public C10910X3(C11464kh.C11466b bVar, C10911a aVar, ResultReceiver resultReceiver) {
        this.f26219a = bVar;
        this.f26220b = aVar;
        this.f26221c = resultReceiver;
    }
}
