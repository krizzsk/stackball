package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.C10078e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.w2 */
public final class C11900w2 {

    /* renamed from: a */
    private final int f28622a;

    /* renamed from: b */
    private final int f28623b;

    /* renamed from: c */
    private final int f28624c;

    /* renamed from: d */
    private final float f28625d;

    /* renamed from: e */
    private final C10078e f28626e;

    public C11900w2(int i, int i2, int i3, float f, C10078e eVar) {
        this.f28622a = i;
        this.f28623b = i2;
        this.f28624c = i3;
        this.f28625d = f;
        this.f28626e = eVar;
    }

    /* renamed from: a */
    public final C10078e mo63999a() {
        return this.f28626e;
    }

    /* renamed from: b */
    public final int mo64000b() {
        return this.f28624c;
    }

    /* renamed from: c */
    public final int mo64001c() {
        return this.f28623b;
    }

    /* renamed from: d */
    public final float mo64002d() {
        return this.f28625d;
    }

    /* renamed from: e */
    public final int mo64003e() {
        return this.f28622a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11900w2)) {
            return false;
        }
        C11900w2 w2Var = (C11900w2) obj;
        return this.f28622a == w2Var.f28622a && this.f28623b == w2Var.f28623b && this.f28624c == w2Var.f28624c && Float.compare(this.f28625d, w2Var.f28625d) == 0 && Intrinsics.areEqual((Object) this.f28626e, (Object) w2Var.f28626e);
    }

    public int hashCode() {
        int floatToIntBits = ((((((this.f28622a * 31) + this.f28623b) * 31) + this.f28624c) * 31) + Float.floatToIntBits(this.f28625d)) * 31;
        C10078e eVar = this.f28626e;
        return floatToIntBits + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f28622a + ", height=" + this.f28623b + ", dpi=" + this.f28624c + ", scaleFactor=" + this.f28625d + ", deviceType=" + this.f28626e + ")";
    }
}
