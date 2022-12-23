package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class x30 {

    /* renamed from: a */
    private final boolean f42398a;

    /* renamed from: b */
    private final int f42399b;

    /* renamed from: c */
    private final String f42400c;

    public x30() {
        this(false, 0, (String) null, 7);
    }

    public x30(boolean z, int i, String str) {
        Intrinsics.checkNotNullParameter(str, "errorDetails");
        this.f42398a = z;
        this.f42399b = i;
        this.f42400c = str;
    }

    /* renamed from: a */
    public static x30 m43937a(x30 x30, boolean z, int i, String str, int i2) {
        if ((i2 & 1) != 0) {
            z = x30.f42398a;
        }
        if ((i2 & 2) != 0) {
            i = x30.f42399b;
        }
        if ((i2 & 4) != 0) {
            str = x30.f42400c;
        }
        x30.getClass();
        Intrinsics.checkNotNullParameter(str, "errorDetails");
        return new x30(z, i, str);
    }

    /* renamed from: b */
    public final String mo70814b() {
        return this.f42400c;
    }

    /* renamed from: c */
    public final boolean mo70815c() {
        return this.f42398a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x30)) {
            return false;
        }
        x30 x30 = (x30) obj;
        return this.f42398a == x30.f42398a && this.f42399b == x30.f42399b && Intrinsics.areEqual((Object) this.f42400c, (Object) x30.f42400c);
    }

    public int hashCode() {
        boolean z = this.f42398a;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + this.f42399b) * 31) + this.f42400c.hashCode();
    }

    public String toString() {
        return "ErrorViewModel(showDetails=" + this.f42398a + ", errorCount=" + this.f42399b + ", errorDetails=" + this.f42400c + ')';
    }

    /* renamed from: a */
    public final int mo70813a() {
        return this.f42399b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x30(boolean z, int i, String str, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : null);
    }
}
