package com.yandex.metrica.impl.p265ob;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.L7 */
public final class C10451L7 {

    /* renamed from: a */
    private final byte[] f25091a;

    /* renamed from: b */
    private final C10422K7 f25092b;

    public C10451L7(byte[] bArr, C10422K7 k7) {
        this.f25091a = bArr;
        this.f25092b = k7;
    }

    /* renamed from: a */
    public final byte[] mo61708a() {
        return this.f25091a;
    }

    /* renamed from: b */
    public final C10422K7 mo61709b() {
        return this.f25092b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10451L7)) {
            return false;
        }
        C10451L7 l7 = (C10451L7) obj;
        return Intrinsics.areEqual((Object) this.f25091a, (Object) l7.f25091a) && Intrinsics.areEqual((Object) this.f25092b, (Object) l7.f25092b);
    }

    public int hashCode() {
        byte[] bArr = this.f25091a;
        int i = 0;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        C10422K7 k7 = this.f25092b;
        if (k7 != null) {
            i = k7.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NativeCrashModel(data=" + Arrays.toString(this.f25091a) + ", handlerDescription=" + this.f25092b + ")";
    }
}
