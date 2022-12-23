package com.yandex.metrica.impl.p265ob;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.yandex.metrica.impl.ob.sm */
public final class C11767sm {

    /* renamed from: c */
    public static final C11768a f28255c = new C11768a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final long f28256a;

    /* renamed from: b */
    private final int f28257b;

    /* renamed from: com.yandex.metrica.impl.ob.sm$a */
    public static final class C11768a {
        private C11768a() {
        }

        public /* synthetic */ C11768a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11767sm(long j, int i) {
        this.f28256a = j;
        this.f28257b = i;
    }

    /* renamed from: a */
    public final int mo63689a() {
        return this.f28257b;
    }

    /* renamed from: b */
    public final long mo63690b() {
        return this.f28256a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11767sm)) {
            return false;
        }
        C11767sm smVar = (C11767sm) obj;
        return this.f28256a == smVar.f28256a && this.f28257b == smVar.f28257b;
    }

    public int hashCode() {
        long j = this.f28256a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f28257b;
    }

    public String toString() {
        return "DecimalProtoModel(mantissa=" + this.f28256a + ", exponent=" + this.f28257b + ")";
    }
}
