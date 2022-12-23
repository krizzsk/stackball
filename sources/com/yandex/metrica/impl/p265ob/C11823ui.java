package com.yandex.metrica.impl.p265ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.ui */
public final class C11823ui {

    /* renamed from: a */
    private final String f28400a;

    /* renamed from: b */
    private final int f28401b;

    /* renamed from: c */
    private final int f28402c;

    /* renamed from: d */
    private final boolean f28403d;

    /* renamed from: e */
    private final boolean f28404e;

    public C11823ui(String str, int i, int i2, boolean z, boolean z2) {
        this.f28400a = str;
        this.f28401b = i;
        this.f28402c = i2;
        this.f28403d = z;
        this.f28404e = z2;
    }

    /* renamed from: a */
    public final int mo63799a() {
        return this.f28402c;
    }

    /* renamed from: b */
    public final int mo63800b() {
        return this.f28401b;
    }

    /* renamed from: c */
    public final String mo63801c() {
        return this.f28400a;
    }

    /* renamed from: d */
    public final boolean mo63802d() {
        return this.f28403d;
    }

    /* renamed from: e */
    public final boolean mo63803e() {
        return this.f28404e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11823ui)) {
            return false;
        }
        C11823ui uiVar = (C11823ui) obj;
        return Intrinsics.areEqual((Object) this.f28400a, (Object) uiVar.f28400a) && this.f28401b == uiVar.f28401b && this.f28402c == uiVar.f28402c && this.f28403d == uiVar.f28403d && this.f28404e == uiVar.f28404e;
    }

    public int hashCode() {
        String str = this.f28400a;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f28401b) * 31) + this.f28402c) * 31;
        boolean z = this.f28403d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f28404e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "EgressConfig(url=" + this.f28400a + ", repeatedDelay=" + this.f28401b + ", randomDelayWindow=" + this.f28402c + ", isBackgroundAllowed=" + this.f28403d + ", isDiagnosticsEnabled=" + this.f28404e + ")";
    }
}
