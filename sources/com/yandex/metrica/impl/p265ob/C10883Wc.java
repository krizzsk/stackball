package com.yandex.metrica.impl.p265ob;

import com.tapjoy.TJAdUnitConstants;
import com.yandex.metrica.impl.p265ob.C10199E;

/* renamed from: com.yandex.metrica.impl.ob.Wc */
public class C10883Wc {

    /* renamed from: a */
    public final C10807Uc f26154a;

    /* renamed from: b */
    public final C11346id f26155b;

    /* renamed from: com.yandex.metrica.impl.ob.Wc$a */
    public enum C10884a {
        UNKNOWN("unknown"),
        FOREGROUND("fg"),
        BACKGROUND("bg"),
        VISIBLE(TJAdUnitConstants.String.VISIBLE);
        

        /* renamed from: a */
        private final String f26161a;

        private C10884a(String str) {
            this.f26161a = str;
        }

        /* renamed from: a */
        public String mo62449a() {
            return this.f26161a;
        }

        public String toString() {
            return this.f26161a;
        }

        /* renamed from: a */
        public static C10884a m28133a(String str) {
            C10884a aVar = UNKNOWN;
            C10884a[] values = values();
            for (int i = 0; i < 4; i++) {
                C10884a aVar2 = values[i];
                if (aVar2.f26161a.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        /* renamed from: a */
        public static C10884a m28132a(C10199E.C10200a aVar) {
            C10884a aVar2 = UNKNOWN;
            if (aVar == null) {
                return aVar2;
            }
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                return BACKGROUND;
            }
            if (ordinal != 2) {
                return aVar2;
            }
            return VISIBLE;
        }
    }

    public C10883Wc(C10807Uc uc, C11346id idVar) {
        this.f26154a = uc;
        this.f26155b = idVar;
    }

    public String toString() {
        return "LocationCollectionConfig{arguments=" + this.f26154a + ", preconditions=" + this.f26155b + '}';
    }
}
