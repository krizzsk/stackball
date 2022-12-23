package com.fyber.inneractive.sdk.player.p059c.p074g;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.g.i */
public final class C3461i {

    /* renamed from: a */
    public static final C3461i f9362a = new C3461i(new C3460h[0]);

    /* renamed from: b */
    public final int f9363b;

    /* renamed from: c */
    public final C3460h[] f9364c;

    /* renamed from: d */
    private int f9365d;

    public C3461i(C3460h... hVarArr) {
        this.f9364c = hVarArr;
        this.f9363b = hVarArr.length;
    }

    /* renamed from: a */
    public final int mo19286a(C3460h hVar) {
        for (int i = 0; i < this.f9363b; i++) {
            if (this.f9364c[i] == hVar) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f9365d == 0) {
            this.f9365d = Arrays.hashCode(this.f9364c);
        }
        return this.f9365d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3461i iVar = (C3461i) obj;
            return this.f9363b == iVar.f9363b && Arrays.equals(this.f9364c, iVar.f9364c);
        }
    }
}
