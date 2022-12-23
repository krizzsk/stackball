package com.yandex.metrica.impl.p265ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.K7 */
public final class C10422K7 {

    /* renamed from: a */
    private final C10590O7 f25045a;

    /* renamed from: b */
    private final String f25046b;

    public C10422K7() {
        this((C10590O7) null, (String) null, 3);
    }

    public C10422K7(C10590O7 o7, String str) {
        this.f25045a = o7;
        this.f25046b = str;
    }

    /* renamed from: a */
    public final String mo61653a() {
        return this.f25046b;
    }

    /* renamed from: b */
    public final C10590O7 mo61654b() {
        return this.f25045a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10422K7)) {
            return false;
        }
        C10422K7 k7 = (C10422K7) obj;
        return Intrinsics.areEqual((Object) this.f25045a, (Object) k7.f25045a) && Intrinsics.areEqual((Object) this.f25046b, (Object) k7.f25046b);
    }

    public int hashCode() {
        C10590O7 o7 = this.f25045a;
        int i = 0;
        int hashCode = (o7 != null ? o7.hashCode() : 0) * 31;
        String str = this.f25046b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NativeCrashHandlerDescription(source=" + this.f25045a + ", handlerVersion=" + this.f25046b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10422K7(C10590O7 o7, String str, int i) {
        this((i & 1) != 0 ? C10590O7.UNKNOWN : null, (String) null);
    }
}
