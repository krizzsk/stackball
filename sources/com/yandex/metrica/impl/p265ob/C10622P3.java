package com.yandex.metrica.impl.p265ob;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.P3 */
public final class C10622P3 implements C10149C0<C10623a, C10623a> {

    /* renamed from: a */
    private final C10623a f25395a;

    /* renamed from: b */
    private final List<C10623a> f25396b;

    /* renamed from: com.yandex.metrica.impl.ob.P3$a */
    public static final class C10623a implements C10235F0 {

        /* renamed from: a */
        private final Map<String, String> f25397a;

        /* renamed from: b */
        private final C10202E0 f25398b;

        public C10623a(Map<String, String> map, C10202E0 e0) {
            this.f25397a = map;
            this.f25398b = e0;
        }

        /* renamed from: a */
        public C10202E0 mo61253a() {
            return this.f25398b;
        }

        /* renamed from: b */
        public final Map<String, String> mo61907b() {
            return this.f25397a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10623a)) {
                return false;
            }
            C10623a aVar = (C10623a) obj;
            return Intrinsics.areEqual((Object) this.f25397a, (Object) aVar.f25397a) && Intrinsics.areEqual((Object) this.f25398b, (Object) aVar.f25398b);
        }

        public int hashCode() {
            Map<String, String> map = this.f25397a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            C10202E0 e0 = this.f25398b;
            if (e0 != null) {
                i = e0.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Candidate(clids=" + this.f25397a + ", source=" + this.f25398b + ")";
        }
    }

    public C10622P3(C10623a aVar, List<C10623a> list) {
        this.f25395a = aVar;
        this.f25396b = list;
    }

    /* renamed from: a */
    public List<C10623a> mo61111a() {
        return this.f25396b;
    }

    /* renamed from: b */
    public Object mo61112b() {
        return this.f25395a;
    }

    /* renamed from: c */
    public C10623a mo61903c() {
        return this.f25395a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10622P3)) {
            return false;
        }
        C10622P3 p3 = (C10622P3) obj;
        return Intrinsics.areEqual((Object) this.f25395a, (Object) p3.f25395a) && Intrinsics.areEqual((Object) this.f25396b, (Object) p3.f25396b);
    }

    public int hashCode() {
        C10623a aVar = this.f25395a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<C10623a> list = this.f25396b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ClidsInfo(chosen=" + this.f25395a + ", candidates=" + this.f25396b + ")";
    }
}
