package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.appsetid.C10038c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.hc */
public final class C11312hc {

    /* renamed from: a */
    private final String f27044a;

    /* renamed from: b */
    private final C10038c f27045b;

    public C11312hc(String str, C10038c cVar) {
        this.f27044a = str;
        this.f27045b = cVar;
    }

    /* renamed from: a */
    public final String mo63003a() {
        return this.f27044a;
    }

    /* renamed from: b */
    public final C10038c mo63004b() {
        return this.f27045b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11312hc)) {
            return false;
        }
        C11312hc hcVar = (C11312hc) obj;
        return Intrinsics.areEqual((Object) this.f27044a, (Object) hcVar.f27044a) && Intrinsics.areEqual((Object) this.f27045b, (Object) hcVar.f27045b);
    }

    public int hashCode() {
        String str = this.f27044a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C10038c cVar = this.f27045b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppSetId(id=" + this.f27044a + ", scope=" + this.f27045b + ")";
    }
}
