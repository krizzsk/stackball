package com.ogury.core.internal.aaid;

import com.ogury.core.internal.C7921ai;

/* renamed from: com.ogury.core.internal.aaid.a */
/* compiled from: AdInfo.kt */
public final class C7908a {

    /* renamed from: a */
    private final String f20679a;

    /* renamed from: b */
    private final boolean f20680b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7908a)) {
            return false;
        }
        C7908a aVar = (C7908a) obj;
        return C7921ai.m22143a((Object) this.f20679a, (Object) aVar.f20679a) && this.f20680b == aVar.f20680b;
    }

    public final int hashCode() {
        String str = this.f20679a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f20680b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        return "AdInfo(id=" + this.f20679a + ", isLimitAdTrackingEnabled=" + this.f20680b + ")";
    }

    public C7908a(String str, boolean z) {
        C7921ai.m22144b(str, "id");
        this.f20679a = str;
        this.f20680b = z;
    }

    /* renamed from: a */
    public final String mo52880a() {
        return this.f20679a;
    }

    /* renamed from: b */
    public final boolean mo52881b() {
        return this.f20680b;
    }
}
